# -*- coding: utf-8 -*-
import sys
import os
import re

def escape_kt(s):
    if not s:
        return ""
    return str(s).replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').strip()

print("Generator script template ready")
