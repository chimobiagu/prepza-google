import re
import os
import glob

repo_dir = "app/src/main/java/com/example/data/repository"
files = glob.glob(os.path.join(repo_dir, "*.kt"))

total_entities = 0
subject_counts = {}
year_counts = {}

# Parse all QuestionEntity instances across repository files
for fpath in files:
    with open(fpath, "r", encoding="utf-8") as f:
        content = f.read()
    
    matches = re.findall(r'QuestionEntity\(\s*id\s*=\s*"([^"]+)",\s*subject\s*=\s*"([^"]+)",\s*topic\s*=\s*"([^"]+)",\s*year\s*=\s*"([^"]+)"', content)
    for qid, subj, topic, yr in matches:
        total_entities += 1
        subj_clean = subj.strip()
        subject_counts[subj_clean] = subject_counts.get(subj_clean, 0) + 1
        year_counts[yr] = year_counts.get(yr, 0) + 1

print(f"Total Unique/Registered Repository Question Entities: {total_entities}")
print("\n--- Breakdown by Subject ---")
for s, count in sorted(subject_counts.items(), key=lambda x: -x[1]):
    print(f"  • {s}: {count:,} questions")

