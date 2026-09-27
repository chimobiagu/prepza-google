# coding=utf-8
import os
import sys

sys.path.insert(0, os.path.dirname(__file__))
from government_1978_questions_data import get_all_gov_1978_questions

def generate():
    questions = get_all_gov_1978_questions()
    print(f"Total Government 1978 questions extracted: {len(questions)}")

    out_file = "app/src/main/java/com/example/data/repository/JambGovernment1978ExamBank.kt"
    
    code = """package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Government 1978 Past Questions & Answers Bank
 * Transcribed with 100% source fidelity from verified official JAMB past exam papers (dyplus edition).
 * Contains 50 questions covering constitutional development, organs of government, political concepts, and African politics.
 */
object JambGovernment1978ExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
"""
    for q in questions:
        q_id = q["id"]
        subject = q["subject"]
        topic = q["topic"]
        year = q["year"]
        q_text = q["text"].replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')
        op_a = q["a"].replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')
        op_b = q["b"].replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')
        op_c = q["c"].replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')
        op_d = q["d"].replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')
        ans = q["ans"]
        exp = q["exp"].replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')
        label = q["label"].replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$')

        code += f"""
        list.add(
            QuestionEntity(
                id = "{q_id}",
                subject = "{subject}",
                topic = "{topic}",
                year = "{year}",
                questionText = "{q_text}",
                optionA = "{op_a}",
                optionB = "{op_b}",
                optionC = "{op_c}",
                optionD = "{op_d}",
                correctAnswerIndex = {ans},
                explanation = "{exp}",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "{label}",
                isVerifiedJamb = true
            )
        )"""

    code += """
        return list
    }
}
"""
    with open(out_file, "w", encoding="utf-8") as f:
        f.write(code)
    print(f"Wrote {out_file} successfully!")

if __name__ == "__main__":
    generate()
