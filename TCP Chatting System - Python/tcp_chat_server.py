import socket
import threading

def receive_messages(conn):
    while True:
        data = conn.recv(1024)
        if not data:
            break
        print("\nFriend:", data.decode())

def send_messages(conn):
    while True:
        msg = input("You: ")
        conn.sendall(msg.encode())

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(('0.0.0.0', 3001))
server.listen(1)

print("Waiting for connection...")
conn, addr = server.accept()
print(f"Connected to {addr}")


threading.Thread(target=receive_messages, args=(conn,), daemon=True).start()
send_messages(conn)
