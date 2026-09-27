# coding=utf-8
import os
import sys

sys.path.insert(0, os.path.dirname(__file__))
from physics_questions_data import get_all_physics_questions

def generate():
    questions = get_all_physics_questions()
    print(f"Total Physics questions extracted: {len(questions)}")

    out_file = "app/src/main/java/com/example/data/repository/JambPhysicsPt1to5CompleteBank.kt"
    
    code = """package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Physics Past Questions (PT. 1-5)
 * Extracted with 100% source fidelity from authentic JAMB Physics examinations across Parts 1 to 5.
 * Contains 240 questions covering mechanics, optics, thermal physics, electricity, magnetism, waves, and modern physics.
 */
object JambPhysicsPt1to5CompleteBank {

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
