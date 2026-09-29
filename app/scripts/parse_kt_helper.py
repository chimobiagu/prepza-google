import re
import json

def parse_kt_questions(filepath, subject_name):
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
    results = []

    for match in pattern.finditer(content):
        qid, subj, topic, year, qtext, optA, optB, optC, optD, ansIdx, expl = match.groups()
        
        # Check if question requires an image or diagram
        requires_image = False
        img_ref = None
        
        # Look for image references in questionText or entity
        q_lower = qtext.lower()
        if any(term in q_lower for term in ["diagram above", "diagram below", "figure above", "figure below", "graph above", "graph below", "circuit above", "circuit below"]):
            requires_image = True
            img_ref = f"{subject_name.lower()}_{year}_{qid}_diagram"

        results.append({
            "id": f"{subject_name[:3].upper()}-{year}-{len(results)+1:03d}",
            "subject": subject_name,
            "topic": topic,
            "year": year,
            "question": qtext.replace("\\n", "\n").replace('\\"', '"'),
            "options": {
                "A": optA.replace('\\"', '"'),
                "B": optB.replace('\\"', '"'),
                "C": optC.replace('\\"', '"'),
                "D": optD.replace('\\"', '"')
            },
            "correct_answer": ans_map.get(int(ansIdx), "A"),
            "explanation": expl.replace("\\n", "\n").replace('\\"', '"'),
            "source": f"JAMB {subject_name} {year} Official Past Questions",
            "requires_image": requires_image,
            "image_reference": img_ref
        })

    return results

print("Parser defined.")
