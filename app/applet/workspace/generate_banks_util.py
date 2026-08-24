import os
import re

# Generator script to write modular Kotlin Question Bank files
def sanitize_kt_string(s):
    if not s:
        return ""
    # escape backslashes, quotes, dollar signs
    s = s.replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$')
    return s

def generate_bank_kt(bank_name, questions, package="com.example.data.repository"):
    code = f"""package {package}

import com.example.data.db.QuestionEntity

object {bank_name} {{
    fun getQuestions(): List<QuestionEntity> = listOf(
"""
    for q in questions:
        qid = sanitize_kt_string(q["id"])
        subj = sanitize_kt_string(q["subject"])
        topic = sanitize_kt_string(q["topic"])
        year = sanitize_kt_string(q["year"])
        qtext = sanitize_kt_string(q["questionText"])
        opA = sanitize_kt_string(q["optionA"])
        opB = sanitize_kt_string(q["optionB"])
        opC = sanitize_kt_string(q["optionC"])
        opD = sanitize_kt_string(q["optionD"])
        ansIdx = q["correctAnswerIndex"]
        exp = sanitize_kt_string(q["explanation"])
        diff = sanitize_kt_string(q.get("difficulty", "Medium"))
        origType = sanitize_kt_string(q.get("originType", "JAMB_ORIGINAL"))
        origLabel = sanitize_kt_string(q.get("originLabel", f"Original JAMB Question • {year}"))
        isVer = "true" if q.get("isVerifiedJamb", True) else "false"
        
        code += f"""        QuestionEntity(
            id = "{qid}",
            subject = "{subj}",
            topic = "{topic}",
            year = "{year}",
            questionText = "{qtext}",
            optionA = "{opA}",
            optionB = "{opB}",
            optionC = "{opC}",
            optionD = "{opD}",
            correctAnswerIndex = {ansIdx},
            explanation = "{exp}",
            difficulty = "{diff}",
            originType = "{origType}",
            originLabel = "{origLabel}",
            isVerifiedJamb = {isVer}
        ),
"""
    code += """    )
}
"""
    return code

print("Bank generator utility loaded.")
