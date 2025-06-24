import socket

server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

local_IP = '127.0.0.1'
local_port = 2001

server.bind((local_IP,local_port))
print("Server is listening...")

while True:
    data, address = server.recvfrom(1024)

    print("Received message from", address)
    print("Message:", data.decode())