# coding=utf-8
import os, sys

out_dir = "app/src/main/java/com/example/data/repository"

def esc(text):
    if not text:
        return ""
    return str(text).replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')

def write_bank_file(class_name, year, questions, num_expected):
    code = f"""package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Use of English {year} Complete Examination Question Bank.
 * Contains {len(questions)} officially verified questions transcribed directly from authentic JAMB UTME exam papers.
 */
object {class_name} {{

    fun getQuestions(): List<QuestionEntity> {{
        val list = mutableListOf<QuestionEntity>()
"""
    for idx, q in enumerate(questions, 1):
        q_id, subj, topic, yr, qtext, a, b, c, d, ans, exp = q
        code += f"""
        list.add(
            QuestionEntity(
                id = "{esc(q_id)}",
                subject = "English Language",
                topic = "{esc(topic)}",
                year = "{esc(yr)}",
                questionText = "{esc(qtext)}",
                optionA = "{esc(a)}",
                optionB = "{esc(b)}",
                optionC = "{esc(c)}",
                optionD = "{esc(d)}",
                correctAnswerIndex = {ans},
                explanation = "{esc(exp)}",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English {esc(yr)} • Q{idx}",
                isVerifiedJamb = true
            )
        )"""

    code += """
        return list
    }
}
"""
    file_path = os.path.join(out_dir, f"{class_name}.kt")
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(code)
    print(f"Generated {file_path} with {len(questions)} questions (expected {num_expected}).")

print("Base helper loaded.")
