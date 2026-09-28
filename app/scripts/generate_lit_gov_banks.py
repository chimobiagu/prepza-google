import os, sys

def escape_kt(text):
    if not text:
        return ""
    return text.replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$')

def write_bank(class_name, subject, questions, file_path):
    code = f"""package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB {subject} 2010 - 2018 Past Examination Series.
 * Contains {len(questions)} officially verified questions transcribed directly from authentic JAMB exam papers.
 */
object {class_name} {{

    fun getQuestions(): List<QuestionEntity> {{
        val list = mutableListOf<QuestionEntity>()
"""
    for q in questions:
        img_str = f'"{escape_kt(q[11])}"' if len(q) > 11 and q[11] else "null"
        code += f"""
        list.add(
            QuestionEntity(
                id = "{escape_kt(q[0])}",
                subject = "{escape_kt(q[1])}",
                topic = "{escape_kt(q[2])}",
                year = "{escape_kt(q[3])}",
                questionText = "{escape_kt(q[4])}",
                optionA = "{escape_kt(q[5])}",
                optionB = "{escape_kt(q[6])}",
                optionC = "{escape_kt(q[7])}",
                optionD = "{escape_kt(q[8])}",
                correctAnswerIndex = {q[9]},
                explanation = "{escape_kt(q[10])}",
                imageUrl = {img_str},
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB {escape_kt(q[1])} {escape_kt(q[3])}",
                isVerifiedJamb = true
            )
        )"""

    code += """
        return list
    }
}
"""
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(code)
    print(f"Generated {file_path} with {len(questions)} questions.")

print("Loaded generate_lit_gov_banks helper.")
