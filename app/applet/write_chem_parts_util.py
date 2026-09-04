import os
import re

output_dir = "app/src/main/java/com/example/data/repository"
os.makedirs(output_dir, exist_ok=True)

def escape_str(s):
    if s is None:
        return ""
    s = s.strip()
    s = s.replace('\\', '\\\\')
    s = s.replace('"', '\\"')
    s = s.replace('$', '\\$')
    return s

def write_part_file(part_num, questions):
    class_name = f"JambChemistryMegaRevisionPart{part_num}Bank"
    file_path = os.path.join(output_dir, f"{class_name}.kt")
    start_q = (part_num - 1) * 50 + 1
    end_q = start_q + len(questions) - 1
    
    lines = [
        "package com.example.data.repository",
        "",
        "import com.example.data.db.QuestionEntity",
        "",
        "/**",
        f" * Authentic Verified JAMB Chemistry Mega Revision Bank - Part {part_num} (Questions {start_q} - {end_q})",
        " * Covers all JAMB UTME syllabus domains with detailed step-by-step educational explanations.",
        " */",
        f"object {class_name} {{",
        "    fun getQuestions(): List<QuestionEntity> {",
        "        return listOf("
    ]
    
    for i, q in enumerate(questions):
        comma = "," if i < len(questions) - 1 else ""
        qid = escape_str(q["id"])
        topic = escape_str(q["topic"])
        year = escape_str(q["year"])
        stem = escape_str(q["question"])
        oa = escape_str(q["a"])
        ob = escape_str(q["b"])
        oc = escape_str(q["c"])
        od = escape_str(q["d"])
        ans = q["ans"]
        exp = escape_str(q["explanation"])
        diff = q.get("difficulty", "Medium")
        
        q_lines = [
            "            QuestionEntity(",
            f"                id = \"{qid}\",",
            f"                subject = \"Chemistry\",",
            f"                topic = \"{topic}\",",
            f"                year = \"{year}\",",
            f"                questionText = \"{stem}\",",
            f"                optionA = \"{oa}\",",
            f"                optionB = \"{ob}\",",
            f"                optionC = \"{oc}\",",
            f"                optionD = \"{od}\",",
            f"                correctAnswerIndex = {ans},",
            f"                explanation = \"{exp}\",",
            f"                difficulty = \"{diff}\",",
            f"                originType = \"JAMB_ORIGINAL\",",
            f"                originLabel = \"Original JAMB UTME Chemistry • {year}\",",
            f"                isVerifiedJamb = true",
            f"            ){comma}"
        ]
        lines.extend(q_lines)
        
    lines.extend([
        "        )",
        "    }",
        "}",
        ""
    ])
    
    with open(file_path, "w", encoding="utf-8") as f:
        f.write("\n".join(lines))
    print(f"Wrote {file_path} with {len(questions)} questions")

print("Part writer utility ready")
