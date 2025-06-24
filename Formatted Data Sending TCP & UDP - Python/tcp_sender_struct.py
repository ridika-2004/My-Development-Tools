import socket
import struct

client_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client_sock.connect(('127.0.0.1', 12345))

name = b'Alic'
age = 30
score = 92.5

packed_data = struct.pack('4sif', name, age, score)
client_sock.sendall(packed_data)

client_sock.close()
print("Binary struct sent via TCP")
