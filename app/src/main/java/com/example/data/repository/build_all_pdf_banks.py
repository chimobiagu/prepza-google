import sys

# Script to build all three comprehensive banks from user PDFs

def escape_k(s):
    if s is None:
        return ""
    return str(s).replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '')

print("Writing full builder script...")
