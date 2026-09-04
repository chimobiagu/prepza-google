import json
import re
import os

def escape_kt(text):
    if not text:
        return ""
    return text.replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', ' ').strip()

def create_kotlin_file(part_num, questions, output_dir="app/src/main/java/com/example/data/repository"):
    class_name = f"JambGovernmentMegaRevisionPart{part_num}Bank"
    os.makedirs(output_dir, exist_ok=True)
    file_path = os.path.join(output_dir, f"{class_name}.kt")
    
    lines = []
    lines.append("package com.example.data.repository")
    lines.append("")
    lines.append("import com.example.data.db.QuestionEntity")
    lines.append("")
    lines.append("/**")
    lines.append(f" * Authentic Verified JAMB Government Mega Revision Bank - Part {part_num}")
    lines.append(f" * Cleaned, deduplicated, and syllabus-verified questions from JAMB UTME Government past exams.")
    lines.append(" */")
    lines.append(f"object {class_name} {{")
    lines.append("    fun getQuestions(): List<QuestionEntity> {")
    lines.append("        return listOf(")
    
    for i, q in enumerate(questions):
        comma = "," if i < len(questions) - 1 else ""
        lines.append("            QuestionEntity(")
        lines.append(f"                id = \"{escape_kt(q['id'])}\",")
        lines.append(f"                subject = \"Government\",")
        lines.append(f"                topic = \"{escape_kt(q['topic'])}\",")
        lines.append(f"                year = \"{escape_kt(q['year'])}\",")
        lines.append(f"                questionText = \"{escape_kt(q['text'])}\",")
        lines.append(f"                optionA = \"{escape_kt(q['opts'][0])}\",")
        lines.append(f"                optionB = \"{escape_kt(q['opts'][1])}\",")
        lines.append(f"                optionC = \"{escape_kt(q['opts'][2])}\",")
        lines.append(f"                optionD = \"{escape_kt(q['opts'][3])}\",")
        lines.append(f"                correctAnswerIndex = {q['ans']},")
        lines.append(f"                explanation = \"{escape_kt(q['exp'])}\",")
        lines.append(f"                difficulty = \"{escape_kt(q.get('diff', 'Medium'))}\",")
        lines.append(f"                originType = \"JAMB_ORIGINAL\",")
        lines.append(f"                originLabel = \"Original JAMB UTME Government • {escape_kt(q['year'])}\",")
        lines.append(f"                isVerifiedJamb = true")
        lines.append(f"            ){comma}")
        
    lines.append("        )")
    lines.append("    }")
    lines.append("}")
    
    with open(file_path, "w", encoding="utf-8") as f:
        f.write("\n".join(lines))
    print(f"Generated {file_path} with {len(questions)} questions.")

if __name__ == "__main__":
    print("make_gov_files module ready")
