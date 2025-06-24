import socket

client_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client_sock.connect(('127.0.0.1', 12345))

row = ['Alice', '30', '85', '92', '78']
csv_str = ','.join(row)

client_sock.sendall(csv_str.encode('utf-8'))
client_sock.close()

print("CSV sent via TCP")
