import os

EXCLUDED_DIRS = {'__pycache__', 'venv', 'env', '.git', 'node_modules', 'migrations'}

def print_tree(path, indent=""):
    for item in sorted(os.listdir(path)):
        full_path = os.path.join(path, item)
        if os.path.isdir(full_path):
            if item in EXCLUDED_DIRS:
                continue
            print(indent + "├── " + item + "/")
            print_tree(full_path, indent + "│   ")
        else:
            print(indent + "├── " + item)

# Use raw string to avoid escape errors on Windows
print_tree(r"path")
