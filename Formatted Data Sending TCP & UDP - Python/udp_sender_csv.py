import socket

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
target = ('127.0.0.1', 12345)

# Data as list or tuple
row = ['Alice', '30', '85', '92', '78']

csv_str = ','.join(row)  # "Alice,30,85,92,78"
sock.sendto(csv_str.encode('utf-8'), target)
print("CSV data sent")
