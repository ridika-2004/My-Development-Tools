import socket

client = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)

local_IP = '192.168.0.1'
local_port = 2001

while True:

    message = input('Enter exit to quit : ')
    if message.lower() == 'exit':
        break

    client.sendto(message.encode(),(local_IP,local_port))

    print("Message sent!")