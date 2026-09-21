import re
import json

def clean_text(t):
    if not t: return ""
    t = t.strip()
    # Remove leading number prefixes like "1. ", "14. "
    t = re.sub(r'^\d+\.\s*', '', t)
    return t

def parse_options(opt_str):
    # Splits strings like "A. root apex; B. epidermis of roots; C. vascular bundles; D. endodermis; E. pericycle"
    # or "A. Type A; B. Type B; C. Type C; D. Type D"
    # or "A 12345; B. 15243; C. 1345; D. 53412; E. 54 32 1."
    pattern = r'(?:^|[;\s])([A-E])\.\s*'
    splits = re.split(pattern, opt_str)
    # splits will be ['', 'A', 'root apex', 'B', 'epidermis of roots', ...]
    opts = {}
    if len(splits) > 1:
        for i in range(1, len(splits), 2):
            letter = splits[i].strip()
            val = splits[i+1].strip().rstrip(';').strip()
            opts[letter] = val
    
    if len(opts) < 2:
        # Try alternate splitting: e.g. "A. ... B. ... " without semicolons
        splits = re.split(r'([A-E])\.\s+', opt_str)
        if len(splits) > 1:
            for i in range(1, len(splits), 2):
                letter = splits[i].strip()
                val = splits[i+1].strip().rstrip(';').strip()
                opts[letter] = val
                
    # Standardize to 4 options A, B, C, D (or 5 if E present, but UTME uses A-D)
    res = []
    for l in ['A', 'B', 'C', 'D']:
        if l in opts:
            res.append(opts[l])
        else:
            res.append(f"Option {l}")
    return res

print("Parser module ready")
