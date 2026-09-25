import os

output_dir = "/app/applet/app/src/main/java/com/example/data/repository"

def esc(s):
    if not s:
        return ""
    return str(s).replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '')

print("Builder initialized...")
