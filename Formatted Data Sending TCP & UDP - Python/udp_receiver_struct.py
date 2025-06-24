import socket
import struct

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind(('0.0.0.0', 12345))

while True:
    data, addr = sock.recvfrom(1024)
    # Unpack according to format
    name, age, score = struct.unpack('4sif', data)
    # Decode bytes to string and strip null bytes
    name_str = name.decode('utf-8').rstrip('\x00')
    print(f"Received binary struct from {addr}: name={name_str}, age={age}, score={score}")
