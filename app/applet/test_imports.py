import os
import re

# Complete 400 Physics questions dataset
# (topic, qnum, qtext, optA, optB, optC, optD, ansIdx, explanation)

from generate_all_physics import q_data
# import remaining modules if in sys.path
import sys
sys.path.append("/workspace")
try:
    import generate_all_physics_p2
    import generate_all_physics_p3
    import generate_all_physics_p4
    import generate_all_physics_p5
    import generate_all_physics_p6
except Exception as e:
    print(f"Import error: {e}")

print(f"Total questions in memory: {len(q_data)}")
