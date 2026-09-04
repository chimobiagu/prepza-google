# -*- coding: utf-8 -*-
import json
import os
import re

def escape_kt(s):
    if not s:
        return ""
    s = str(s).strip()
    s = s.replace('\\', '\\\\')
    s = s.replace('"', '\\"')
    s = s.replace('$', '\\$')
    s = s.replace('\r', '\\r')
    s = s.replace('\n', '\\n')
    return s

def write_kotlin_bank(filename, class_name, description, questions):
    header = f"""package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * {description}
 * Total Verified Questions: {len(questions)}
 */
object {class_name} {{
    fun getQuestions(): List<QuestionEntity> {{
        val list = mutableListOf<QuestionEntity>()
"""

    body = []
    for q in questions:
        q_text = escape_kt(q['questionText'])
        opA = escape_kt(q['optionA'])
        opB = escape_kt(q['optionB'])
        opC = escape_kt(q['optionC'])
        opD = escape_kt(q['optionD'])
        expl = escape_kt(q['explanation'])
        top = escape_kt(q['topic'])
        sub = escape_kt(q['subject'])
        yr = escape_kt(q['year'])
        qid = escape_kt(q['id'])
        ans = q['correctAnswerIndex']
        lbl = escape_kt(q.get('originLabel', f"JAMB {sub} • {yr}"))

        entry = f"""
        list.add(
            QuestionEntity(
                id = "{qid}",
                subject = "{sub}",
                topic = "{top}",
                year = "{yr}",
                questionText = "{q_text}",
                optionA = "{opA}",
                optionB = "{opB}",
                optionC = "{opC}",
                optionD = "{opD}",
                correctAnswerIndex = {ans},
                explanation = "{expl}",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "{lbl}",
                isVerifiedJamb = true
            )
        )"""
        body.append(entry)

    footer = """
        return list
    }
}
"""
    content = header + "".join(body) + footer
    out_path = os.path.join("app/src/main/java/com/example/data/repository", filename)
    with open(out_path, "w", encoding="utf-8") as f:
        f.write(content)
    print(f"Wrote {len(questions)} questions to {out_path}")

print("Helper ready")
