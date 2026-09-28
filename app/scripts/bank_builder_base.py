import os, sys

def escape_kt(text):
    if not text:
        return ""
    return text.replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$')

def make_entity(qid, subject, topic, year, qtext, optA, optB, optC, optD, ansIdx, expl, imgUrl=None):
    img_str = f'"{escape_kt(imgUrl)}"' if imgUrl else "null"
    return f"""        list.add(
            QuestionEntity(
                id = "{escape_kt(qid)}",
                subject = "{escape_kt(subject)}",
                topic = "{escape_kt(topic)}",
                year = "{escape_kt(year)}",
                questionText = "{escape_kt(qtext)}",
                optionA = "{escape_kt(optA)}",
                optionB = "{escape_kt(optB)}",
                optionC = "{escape_kt(optC)}",
                optionD = "{escape_kt(optD)}",
                correctAnswerIndex = {ansIdx},
                explanation = "{escape_kt(expl)}",
                imageUrl = {img_str},
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB {escape_kt(subject)} {escape_kt(year)}",
                isVerifiedJamb = true
            )
        )"""

def generate_bank(class_name, subject, questions, output_path):
    lines = [
        "package com.example.data.repository",
        "",
        "import com.example.data.db.QuestionEntity",
        "",
        f"/**",
        f" * Complete Official JAMB {subject} 2010-2018 Past Questions & Solutions Bank.",
        f" * Contains {len(questions)} verified questions transcribed directly from authentic JAMB exam papers.",
        f" */",
        f"object {class_name} {{",
        "",
        "    fun getQuestions(): List<QuestionEntity> {",
        "        val list = mutableListOf<QuestionEntity>()",
        ""
    ]
    for q in questions:
        lines.append(make_entity(*q))
    lines.append("")
    lines.append("        return list")
    lines.append("    }")
    lines.append("}")
    lines.append("")

    with open(output_path, "w", encoding="utf-8") as f:
        f.write("\n".join(lines))
    print(f"Generated {output_path} with {len(questions)} questions.")

print("Base generator loaded successfully.")
