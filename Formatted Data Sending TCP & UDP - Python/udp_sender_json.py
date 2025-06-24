import socket
import json

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
target = ('127.0.0.1', 12345)

data = {
    'name': 'Alice',
    'age': 30,
    'scores': [85, 92, 78]
}

json_str = json.dumps(data)
sock.sendto(json_str.encode('utf-8'), target)
print("JSON data sent")
