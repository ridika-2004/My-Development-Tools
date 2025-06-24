import socket
import struct

server_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_sock.bind(('0.0.0.0', 12345))
server_sock.listen()

print("TCP server listening...")

conn, addr = server_sock.accept()
print(f"Connected by {addr}")

# For fixed size struct: calculate size first
struct_size = struct.calcsize('4sif')
data = b''
while len(data) < struct_size:
    packet = conn.recv(struct_size - len(data))
    if not packet:
        break
    data += packet

if len(data) == struct_size:
    name, age, score = struct.unpack('4sif', data)
    name_str = name.decode('utf-8').rstrip('\x00')
    print(f"Received struct: name={name_str}, age={age}, score={score}")

conn.close()
server_sock.close()
