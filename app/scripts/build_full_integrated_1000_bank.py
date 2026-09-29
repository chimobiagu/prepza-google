import os
import re
import json

def normalize_text(text):
    if not text:
        return ""
    return re.sub(r'\s+', ' ', text.strip().lower())

def extract_from_file(filepath, subject_name):
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
        img_m = re.search(r'imageUrl\s*=\s*"([^"]+)"', b)

        if not (qid_m and qtext_m and optA_m and optB_m and optC_m and optD_m and ans_m):
            continue

        qtext = qtext_m.group(1).replace('\\"', '"').replace('\\n', '\n').strip()
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
        img_ref = img_m.group(1) if img_m else None

        # Check visual indicators in text if img_ref is missing
        requires_image = img_ref is not None
        if not requires_image:
            visual_triggers = ["diagram above", "diagram below", "figure above", "figure below", 
                               "graph above", "graph below", "circuit above", "circuit below"]
            if any(trig in qtext.lower() for trig in visual_triggers):
                requires_image = True
                img_ref = f"{subject_name.lower().replace(' ', '_')}_{year}_{qid}_diagram"

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
            "requires_image": requires_image,
            "image_reference": img_ref
        })

    return extracted

def build_integrated_1000():
    primary_sources = [
        ("Physics", "app/src/main/java/com/example/data/repository/JambPhysicsPt1to5CompleteBank.kt"),
        ("Government", "app/src/main/java/com/example/data/repository/JambGovernment1978CompleteExamBank.kt"),
        ("Mathematics", "app/src/main/java/com/example/data/repository/JambMathematics2014ExamBank.kt"),
        ("Literature-in-English", "app/src/main/java/com/example/data/repository/JambLiteratureMegaSeriesPt1to5Bank.kt")
    ]

    secondary_sources = [
        ("Mathematics", "app/src/main/java/com/example/data/repository/JambMathematics2010to2018CompleteOfficialBank.kt"),
        ("Use of English", "app/src/main/java/com/example/data/repository/JambEnglish2010CompleteQuestionBank.kt"),
        ("Use of English", "app/src/main/java/com/example/data/repository/JambEnglish2011CompleteQuestionBank.kt"),
        ("Use of English", "app/src/main/java/com/example/data/repository/JambEnglish2012ExamCompleteBank.kt"),
        ("Use of English", "app/src/main/java/com/example/data/repository/JambEnglish2013ExamCompleteBank.kt"),
        ("Use of English", "app/src/main/java/com/example/data/repository/JambEnglish2014ExamCompleteBank.kt"),
        ("Literature-in-English", "app/src/main/java/com/example/data/repository/JambLiterature2010to2018CompleteOfficialBank.kt")
    ]

    final_1000 = []
    seen = set()
    total_raw = 0
    total_duplicates = 0
    total_images = 0

    # 1. First add all questions from the uploaded PDFs
    for subj, fpath in primary_sources:
        qs = extract_from_file(fpath, subj)
        total_raw += len(qs)
        for q in qs:
            norm = (subj, normalize_text(q["question"]))
            if norm in seen:
                total_duplicates += 1
                continue
            seen.add(norm)
            q["id"] = f"{subj[:3].upper()}-{len(final_1000)+1:04d}"
            if q["requires_image"]:
                total_images += 1
            final_1000.append(q)

    # 2. Add remaining to reach exactly 1000
    for subj, fpath in secondary_sources:
        if len(final_1000) >= 1000:
            break
        qs = extract_from_file(fpath, subj)
        total_raw += len(qs)
        for q in qs:
            if len(final_1000) >= 1000:
                break
            norm = (subj, normalize_text(q["question"]))
            if norm in seen:
                total_duplicates += 1
                continue
            seen.add(norm)
            q["id"] = f"{subj[:3].upper()}-{len(final_1000)+1:04d}"
            if q["requires_image"]:
                total_images += 1
            final_1000.append(q)

    output_path = "app/jamb_1000_integrated_clean_bank.json"
    with open(output_path, "w", encoding="utf-8") as out:
        json.dump(final_1000, out, indent=2, ensure_ascii=False)

    print(f"Total raw examined: {total_raw}")
    print(f"Total duplicates removed: {total_duplicates}")
    print(f"Total images preserved: {total_images}")
    print(f"Final extracted count: {len(final_1000)}")
    
    subject_counts = {}
    for q in final_1000:
        subject_counts[q["subject"]] = subject_counts.get(q["subject"], 0) + 1
    for subj, count in subject_counts.items():
        print(f" - {subj}: {count} questions")

if __name__ == "__main__":
    build_integrated_1000()
