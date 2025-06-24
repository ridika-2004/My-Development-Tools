import socket
import struct

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
target = ('127.0.0.1', 12345)

# Example: name(4 chars), age(int), score(float)
name = b'Alic'   # exactly 4 bytes
age = 30
score = 92.5

# Pack data: 4s = 4-byte string, i = int, f = float
packed_data = struct.pack('4sif', name, age, score)

sock.sendto(packed_data, target)
print("Binary struct data sent")
