# Generate all Chemistry Mega Revision banks
import sys
import os

# Add directory to sys.path
sys.path.insert(0, os.path.dirname(__file__))

from write_chem_parts_util import write_part_file
from build_chemistry_dataset import all_chemistry_questions
from chem_data_part2 import part2_questions
from chem_data_part3 import part3_questions
from chem_data_part4 import part4_questions
from chem_data_part5 import part5_questions
from chem_data_part6 import part6_questions

part1_questions = all_chemistry_questions[:50]

parts = [
    (1, part1_questions),
    (2, part2_questions),
    (3, part3_questions),
    (4, part4_questions),
    (5, part5_questions),
    (6, part6_questions),
]

for part_num, q_list in parts:
    print(f"Generating Part {part_num} ({len(q_list)} questions)...")
    write_part_file(part_num, q_list)

print("All 6 Parts (300 questions) written successfully!")

