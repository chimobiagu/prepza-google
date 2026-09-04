import sys
import os
import re

# Helper to escape kotlin strings
def escape_kt(s):
    if s is None:
        return ""
    return s.replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').strip()

print("Script template ready")
