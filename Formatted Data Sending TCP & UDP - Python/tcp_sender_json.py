import socket
import json

client_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client_sock.connect(('127.0.0.1', 12345))

data = {
    'name': 'Alice',
    'age': 30,
    'scores': [85, 92, 78]
}

json_str = json.dumps(data)
client_sock.sendall(json_str.encode('utf-8'))

client_sock.close()
print("JSON sent via TCP")
