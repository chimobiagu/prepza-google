# Python generator for JAMB 2010-2018 Mathematics, Literature, and Government Official Question Banks
import os, re, json

def escape_kt(text):
    if not text:
        return ""
    return text.replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$')

def create_question_entity(qid, subject, topic, year, qtext, optA, optB, optC, optD, ansIdx, explanation, imgUrl=None):
    img_val = f'"{escape_kt(imgUrl)}"' if imgUrl else "null"
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
                explanation = "{escape_kt(explanation)}",
                imageUrl = {img_val},
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB {escape_kt(subject)} {escape_kt(year)}",
                isVerifiedJamb = true
            )
        )"""

print("Generator script template ready")
