import socket
import json

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind(('0.0.0.0', 12345))

while True:
    data, addr = sock.recvfrom(4096)
    json_str = data.decode('utf-8')
    obj = json.loads(json_str)
    print(f"Received JSON from {addr}: {obj}")
