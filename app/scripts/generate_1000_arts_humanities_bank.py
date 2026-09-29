import os
import re
import json

def normalize_text(text):
    if not text:
        return ""
    return re.sub(r'\s+', ' ', text.strip().lower())

def extract_from_file_robust(filepath, subject_name):
    if not os.path.exists(filepath):
        return []

    with open(filepath, "r", encoding="utf-8", errors="ignore") as f:
        content = f.read()

    blocks = content.split("QuestionEntity(")
    ans_map = {0: "A", 1: "B", 2: "C", 3: "D"}
    extracted = []

    for b in blocks[1:]:
        qid_m = re.search(r'id\s*=\s*"([^"]+)"', b)
        topic_m = re.search(r'topic\s*=\s*"([^"]+)"', b)
        year_m = re.search(r'year\s*=\s*"([^"]+)"', b)
        qtext_m = re.search(r'questionText\s*=\s*"(.*?)(?<!\\)"', b, re.DOTALL)
        optA_m = re.search(r'optionA\s*=\s*"(.*?)(?<!\\)"', b, re.DOTALL)
        optB_m = re.search(r'optionB\s*=\s*"(.*?)(?<!\\)"', b, re.DOTALL)
        optC_m = re.search(r'optionC\s*=\s*"(.*?)(?<!\\)"', b, re.DOTALL)
        optD_m = re.search(r'optionD\s*=\s*"(.*?)(?<!\\)"', b, re.DOTALL)
        ans_m = re.search(r'correctAnswerIndex\s*=\s*(\d+)', b)
        expl_m = re.search(r'explanation\s*=\s*"(.*?)(?<!\\)"', b, re.DOTALL)

        if not (qid_m and qtext_m and optA_m and optB_m and optC_m and optD_m and ans_m):
            continue

        qtext = qtext_m.group(1).replace('\\"', '"').replace('\\n', '\n').strip()
        # Filter out paper-type questions
        if "question paper type" in qtext.lower() or "paper type" in qtext.lower():
            continue

        qid = qid_m.group(1)
        topic = topic_m.group(1) if topic_m else "General"
        year = year_m.group(1) if year_m else "Past Exam"
        optA = optA_m.group(1).replace('\\"', '"').replace('\\n', '\n').strip()
        optB = optB_m.group(1).replace('\\"', '"').replace('\\n', '\n').strip()
        optC = optC_m.group(1).replace('\\"', '"').replace('\\n', '\n').strip()
        optD = optD_m.group(1).replace('\\"', '"').replace('\\n', '\n').strip()
        ansIdx = int(ans_m.group(1))
        expl = expl_m.group(1).replace('\\"', '"').replace('\\n', '\n').strip() if expl_m else ""

        extracted.append({
            "source_id": qid,
            "subject": subject_name,
            "topic": topic,
            "year": year,
            "question": qtext,
            "options": {
                "A": optA,
                "B": optB,
                "C": optC,
                "D": optD
            },
            "correct_answer": ans_map.get(ansIdx, "A"),
            "explanation": expl,
            "source": f"JAMB {subject_name} {year} Examination",
            "requires_image": False,
            "image_reference": None
        })

    return extracted

def build_1000_arts_bank():
    sources = {
        "Literature-in-English": [
            "app/src/main/java/com/example/data/repository/JambLiterature2010to2018CompleteOfficialBank.kt",
            "app/src/main/java/com/example/data/repository/JambLiteratureMegaSeriesPt1to5Bank.kt",
            "app/src/main/java/com/example/data/repository/JambLiteratureInEnglish150MasterQuestionBank.kt"
        ],
        "History": [
            "app/src/main/java/com/example/data/repository/JambHistoryComprehensiveMasterBank.kt"
        ],
        "Islamic Religious Studies": [
            "app/src/main/java/com/example/data/repository/JambIrsComprehensiveMasterBank.kt"
        ]
    }

    targets = {
        "Literature-in-English": 450,
        "History": 275,
        "Islamic Religious Studies": 275
    }

    final_1000 = []
    seen_hashes = set()
    total_raw_examined = 0
    total_duplicates_removed = 0
    total_rejected_corrupted = 0
    subject_counts = {k: 0 for k in targets}

    for subj, files in sources.items():
        for f in files:
            qs = extract_from_file_robust(f, subj)
            total_raw_examined += len(qs)

            for q in qs:
                if not (q["options"]["A"] and q["options"]["B"] and q["options"]["C"] and q["options"]["D"]):
                    total_rejected_corrupted += 1
                    continue

                norm_key = (subj, normalize_text(q["question"]))
                if norm_key in seen_hashes:
                    total_duplicates_removed += 1
                    continue

                if subject_counts[subj] < targets[subj]:
                    seen_hashes.add(norm_key)
                    subject_counts[subj] += 1
                    q["id"] = f"{subj[:3].upper()}-{len(final_1000)+1:04d}"
                    final_1000.append(q)

    output_path = "app/jamb_1000_arts_humanities_bank.json"
    with open(output_path, "w", encoding="utf-8") as out:
        json.dump(final_1000, out, indent=2, ensure_ascii=False)

    print(f"Total raw examined: {total_raw_examined}")
    print(f"Total duplicates removed: {total_duplicates_removed}")
    print(f"Total rejected/corrupted: {total_rejected_corrupted}")
    print(f"Total images preserved: 0")
    print(f"Final extracted count: {len(final_1000)}")
    for subj, count in subject_counts.items():
        print(f" - {subj}: {count} questions")

if __name__ == "__main__":
    build_1000_arts_bank()
