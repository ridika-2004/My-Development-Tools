import socket
import json

server_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_sock.bind(('0.0.0.0', 12345))
server_sock.listen()

print("TCP server listening...")

conn, addr = server_sock.accept()
print(f"Connected by {addr}")

data = b''
while True:
    part = conn.recv(4096)
    if not part:
        break
    data += part

json_str = data.decode('utf-8')
obj = json.loads(json_str)
print(f"Received JSON: {obj}")

conn.close()
server_sock.close()
