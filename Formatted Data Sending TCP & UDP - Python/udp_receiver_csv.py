import socket

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind(('0.0.0.0', 12345))

while True:
    data, addr = sock.recvfrom(4096)
    csv_str = data.decode('utf-8')
    row = csv_str.split(',')
    print(f"Received CSV from {addr}: {row}")
