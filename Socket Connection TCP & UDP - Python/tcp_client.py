import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

local_ip = '127.0.0.1'
local_port = 2001

client.connect((local_ip, local_port))
print("Connected to server.")

while True:
    message = input("Enter message (type 'exit' to quit): ")
    if message.lower() == 'exit':
        break
    client.sendall(message.encode())

client.close()


