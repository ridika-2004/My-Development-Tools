import socket
import threading

def receive_messages(sock):
    while True:
        data = sock.recv(1024)
        if not data:
            break
        print("\nFriend:", data.decode())

def send_messages(sock):
    while True:
        msg = input("You: ")
        sock.sendall(msg.encode())

sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
sock.connect(('127.0.0.1', 3001))
print("Connected to server.")

threading.Thread(target=receive_messages, args=(sock,), daemon=True).start()
send_messages(sock)
