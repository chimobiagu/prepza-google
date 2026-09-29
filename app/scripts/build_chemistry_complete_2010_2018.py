# coding=utf-8
import os, sys

out_path = "app/src/main/java/com/example/data/repository/JambChemistry2010to2018CompleteOfficialBank.kt"

def esc(text):
    if not text:
        return ""
    return str(text).replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')

print("Starting Chemistry 2010-2018 generator...")
