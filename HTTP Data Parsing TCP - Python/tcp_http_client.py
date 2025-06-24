import socket

def send_http_request(method="GET", path="/", body=None):
    sock = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    sock.connect(('127.0.0.1', 8000))  # only this for client

    if method == "GET":
        request = f"GET {path} HTTP/1.1\r\nHost: localhost\r\n\r\n"
    elif method == "POST":
        body = body or ''
        request = (
            f"POST {path} HTTP/1.1\r\n"
            f"Host: localhost\r\n"
            f"Content-Length: {len(body)}\r\n"
            f"Content-Type: text/plain\r\n\r\n"
            f"{body}"
        )
    else:
        raise ValueError("Unsupported method")

    sock.sendall(request.encode('utf-8'))

    response = b""
    while True:
        part = sock.recv(4096)
        if not part:
            break
        response += part

    sock.close()
    print("Server Response:\n", response.decode('utf-8'))

# Running either of these tests
send_http_request("GET", "/hello")
# send_http_request("POST", "/echo", body="This is POST body")
