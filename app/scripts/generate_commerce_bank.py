import sys
import os

from commerce_questions_data import get_all_commerce_questions

def generate():
    questions = get_all_commerce_questions()
    print(f"Total Commerce questions extracted: {len(questions)}")
    
    code = """package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Commerce Question Series (Parts 1 to 5)
 * 100% extracted from official JAMB UTME objective past question source papers.
 * Full commercial explanations, accounting calculations, exact source stems and options.
 */
object JambCommercePt1to5CompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
"""

    for q in questions:
        q_id = q["id"]
        subject = q["subject"]
        topic = q["topic"]
        year = q["year"]
        q_text = q["text"].replace('\\', '\\\\').replace('"', '\\"').replace('\n', ' ')
        op_a = q["a"].replace('\\', '\\\\').replace('"', '\\"').replace('\n', ' ')
        op_b = q["b"].replace('\\', '\\\\').replace('"', '\\"').replace('\n', ' ')
        op_c = q["c"].replace('\\', '\\\\').replace('"', '\\"').replace('\n', ' ')
        op_d = q["d"].replace('\\', '\\\\').replace('"', '\\"').replace('\n', ' ')
        ans = q["ans"]
        exp = q["exp"].replace('\\', '\\\\').replace('"', '\\"').replace('\n', ' ')
        label = q["label"].replace('\\', '\\\\').replace('"', '\\"')

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

    out_path = "app/src/main/java/com/example/data/repository/JambCommercePt1to5CompleteBank.kt"
    with open(out_path, "w", encoding="utf-8") as f:
        f.write(code)
    print(f"Wrote {out_path} successfully!")

if __name__ == "__main__":
    generate()
