import socket

def handle_http_request(request_text):
    lines = request_text.split('\r\n')
    request_line = lines[0]  # e.g., "GET /hello HTTP/1.1"
    headers = {}
    body = ''

    i = 1
    while i < len(lines) and lines[i] != '':
        key, value = lines[i].split(': ', 1)
        headers[key] = value
        i += 1

    i += 1  # skip empty line
    if i < len(lines):
        body = '\r\n'.join(lines[i:])

    method, path, _ = request_line.split()

    if method == 'GET' and path == '/hello':
        response_body = "Hello from TCP Server!"
        status_line = "HTTP/1.1 200 OK"
    elif method == 'POST' and path == '/echo':
        response_body = f"You posted: {body}"
        status_line = "HTTP/1.1 200 OK"
    else:
        response_body = "404 Not Found"
        status_line = "HTTP/1.1 404 Not Found"

    response = f"{status_line}\r\nContent-Length: {len(response_body)}\r\n\r\n{response_body}"
    return response.encode('utf-8')

server_sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_sock.bind(('0.0.0.0', 8000))
server_sock.listen()

print("TCP HTTP-like Server listening on port 8000...")

conn, addr = server_sock.accept()
print(f"Connection from {addr}")

data = b''
while True:
    chunk = conn.recv(4096)
    if not chunk:
        break
    data += chunk
    if b'\r\n\r\n' in data:
        break

# Decode and handle HTTP-like request
request_text = data.decode('utf-8')
print("Received Request:\n", request_text)

response = handle_http_request(request_text)
conn.sendall(response)

conn.close()
server_sock.close()
