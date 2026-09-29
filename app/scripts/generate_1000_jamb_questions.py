import os
import re
import json

def normalize_text(text):
    if not text:
        return ""
    return re.sub(r'\s+', ' ', text.strip().lower())

def extract_from_file(filepath, subject_name):
    with open(filepath, "r", encoding="utf-8", errors="ignore") as f:
        content = f.read()

    pattern = re.compile(
        r'QuestionEntity\(\s*'
        r'id\s*=\s*"([^"]+)",\s*'
        r'subject\s*=\s*"([^"]+)",\s*'
        r'topic\s*=\s*"([^"]+)",\s*'
        r'year\s*=\s*"([^"]+)",\s*'
        r'questionText\s*=\s*"([^"]+)",\s*'
        r'optionA\s*=\s*"([^"]+)",\s*'
        r'optionB\s*=\s*"([^"]+)",\s*'
        r'optionC\s*=\s*"([^"]+)",\s*'
        r'optionD\s*=\s*"([^"]+)",\s*'
        r'correctAnswerIndex\s*=\s*(\d+),\s*'
        r'explanation\s*=\s*"([^"]*)".*?'
        r'\)',
        re.DOTALL
    )

    ans_map = {0: "A", 1: "B", 2: "C", 3: "D"}
    extracted = []

    for match in pattern.finditer(content):
        qid, subj, topic, year, qtext, optA, optB, optC, optD, ansIdx, expl = match.groups()

        # Filter out paper-type meta questions
        if "question paper type" in qtext.lower() or "paper type" in qtext.lower():
            continue

        qtext_clean = qtext.replace('\\"', '"').replace('\\n', '\n')
        
        # Determine image requirement
        requires_image = False
        img_ref = None
        visual_triggers = ["diagram above", "diagram below", "figure above", "figure below", 
                           "graph above", "graph below", "circuit above", "circuit below", 
                           "in the figure", "in the diagram", "shown above", "shown below"]
        if any(trig in qtext_clean.lower() for trig in visual_triggers):
            requires_image = True
            img_ref = f"jamb_{subject_name.lower().replace(' ', '_')}_{year}_{qid}_diagram"

        extracted.append({
            "source_id": qid,
            "subject": subject_name,
            "topic": topic,
            "year": year,
            "question": qtext_clean,
            "options": {
                "A": optA.replace('\\"', '"'),
                "B": optB.replace('\\"', '"'),
                "C": optC.replace('\\"', '"'),
                "D": optD.replace('\\"', '"')
            },
            "correct_answer": ans_map.get(int(ansIdx), "A"),
            "explanation": expl.replace('\\"', '"').replace('\\n', '\n'),
            "source": f"JAMB {subject_name} {year} Examination",
            "requires_image": requires_image,
            "image_reference": img_ref
        })

    return extracted

def build_1000_bank():
    sources = {
        "Use of English": [
            "app/src/main/java/com/example/data/repository/JambEnglish2010CompleteQuestionBank.kt",
            "app/src/main/java/com/example/data/repository/JambEnglish2011CompleteQuestionBank.kt",
            "app/src/main/java/com/example/data/repository/JambEnglish2012ExamCompleteBank.kt",
            "app/src/main/java/com/example/data/repository/JambEnglish2013ExamCompleteBank.kt",
            "app/src/main/java/com/example/data/repository/JambEnglish2014ExamCompleteBank.kt",
            "app/src/main/java/com/example/data/repository/JambEnglish2015ExamCompleteBank.kt",
            "app/src/main/java/com/example/data/repository/JambEnglish2010to2018ExamCompleteBank.kt",
            "app/src/main/java/com/example/data/repository/JambEnglishComprehensionClozeMasterBank.kt",
            "app/src/main/java/com/example/data/repository/JambEnglishGrammarLexisMegaBank.kt"
        ],
        "Mathematics": [
            "app/src/main/java/com/example/data/repository/JambMathematics2010to2018CompleteOfficialBank.kt",
            "app/src/main/java/com/example/data/repository/JambMathematicsMegaMasteryBank.kt",
            "app/src/main/java/com/example/data/repository/JambMathematics2000to2024MegaBank.kt"
        ],
        "Physics": [
            "app/src/main/java/com/example/data/repository/JambPhysicsMegaMasteryBank.kt",
            "app/src/main/java/com/example/data/repository/JambPhysicsPt1to5CompleteBank.kt",
            "app/src/main/java/com/example/data/repository/JambPhysics2010to2018CompleteExamBank.kt"
        ],
        "Literature-in-English": [
            "app/src/main/java/com/example/data/repository/JambLiterature2010to2018CompleteOfficialBank.kt",
            "app/src/main/java/com/example/data/repository/JambLiteratureMegaSeriesPt1to5Bank.kt",
            "app/src/main/java/com/example/data/repository/JambLiteratureInEnglish150MasterQuestionBank.kt"
        ]
    }

    final_1000 = []
    seen_hashes = set()
    total_raw_examined = 0
    total_duplicates_removed = 0
    total_images_preserved = 0
    total_rejected_corrupted = 0

    per_subject_quota = 250
    subject_counts = {}

    for subj, files in sources.items():
        subject_counts[subj] = 0
        for f in files:
            if not os.path.exists(f):
                continue
            qs = extract_from_file(f, subj)
            total_raw_examined += len(qs)

            for q in qs:
                # Check for completeness of options
                if not (q["options"]["A"] and q["options"]["B"] and q["options"]["C"] and q["options"]["D"]):
                    total_rejected_corrupted += 1
                    continue

                norm_key = (subj, normalize_text(q["question"]))
                if norm_key in seen_hashes:
                    total_duplicates_removed += 1
                    continue

                if subject_counts[subj] < per_subject_quota:
                    seen_hashes.add(norm_key)
                    subject_counts[subj] += 1
                    q["id"] = f"{subj[:3].upper()}-{len(final_1000)+1:04d}"
                    if q["requires_image"]:
                        total_images_preserved += 1
                    final_1000.append(q)

    output_path = "app/jamb_1000_questions_bank.json"
    with open(output_path, "w", encoding="utf-8") as out:
        json.dump(final_1000, out, indent=2, ensure_ascii=False)

    print(f"Total raw examined: {total_raw_examined}")
    print(f"Total duplicates removed: {total_duplicates_removed}")
    print(f"Total images preserved: {total_images_preserved}")
    print(f"Total rejected/corrupted: {total_rejected_corrupted}")
    print(f"Final extracted count: {len(final_1000)}")
    for subj, count in subject_counts.items():
        print(f" - {subj}: {count} questions")

if __name__ == "__main__":
    build_1000_bank()
