import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

local_IP = '127.0.0.1'
local_port = 2001
server.bind((local_IP,local_port))
server.listen(1)

print("Waiting for a connection..")
conn, addr = server.accept()
print(f"Connected to {addr}")

while True:
    data = conn.recv(1024)
    if not data:
        break
    print("Message:", data.decode())

conn.close()

# for concurrency

# import socket
# import threading

# def handle_client(conn, addr):
#     print(f"Connected to {addr}")
#     while True:
#         data = conn.recv(1024)
#         if not data:
#             break
#         print(f"Message from {addr}: {data.decode()}")
#     conn.close()
#     print(f"Connection closed {addr}")

# server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# local_IP = '127.0.0.1'
# local_port = 2001
# server.bind((local_IP, local_port))
# server.listen(5)  # allow up to 5 queued connections

# print("Waiting for connections...")

# while True:
#     conn, addr = server.accept()
#     client_thread = threading.Thread(target=handle_client, args=(conn, addr), daemon=True)
#     client_thread.start()
