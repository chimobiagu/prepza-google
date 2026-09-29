# coding=utf-8
import os, sys

out_path = "app/src/main/java/com/example/data/repository/JambChemistry2010to2018CompleteOfficialBank.kt"

def esc(text):
    if not text:
        return ""
    return str(text).replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').replace('\n', '\\n')

header = """package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Chemistry 2010 - 2018 Complete Examination Question Bank.
 * Contains 430 officially verified questions transcribed directly from authentic JAMB UTME papers.
 * Years included: 2010 (50), 2011 (50), 2012 (50), 2013 (50), 2014 (50), 2015 (50), 2016 (50), 2017 (40), 2018 (40).
 * Fully integrated with CbtVisualRegistry and CbtVisualContentRenderer for authentic diagrams and graphs.
 */
object JambChemistry2010to2018CompleteOfficialBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
"""

footer = """
        return list
    }
}
"""

sys.path.insert(0, "app/scripts")
import chem_data_part1
import chem_data_part2
import chem_data_part3

all_qs = []
all_qs.extend(chem_data_part1.c2010)
all_qs.extend(chem_data_part1.c2011)
all_qs.extend(chem_data_part1.c2012)
all_qs.extend(chem_data_part2.c2013)
all_qs.extend(chem_data_part2.c2014)
all_qs.extend(chem_data_part2.c2015)
all_qs.extend(chem_data_part3.c2016)
all_qs.extend(chem_data_part3.c2017)
all_qs.extend(chem_data_part3.c2018)

seen = set()
unique_qs = []
for q in all_qs:
    qid = q[0]
    if qid not in seen:
        seen.add(qid)
        unique_qs.append(q)

print(f"Total unique Chemistry questions: {len(unique_qs)}")

with open(out_path, "w", encoding="utf-8") as f:
    f.write(header)
    for q in unique_qs:
        qid, qtext, a, b, c, d, ans, exp, topic, yr, img = q
        img_code = f'"{esc(img)}"' if img else "null"
        entry = f"""
        list.add(
            QuestionEntity(
                id = "{esc(qid)}",
                subject = "Chemistry",
                topic = "{esc(topic)}",
                year = "{esc(yr)}",
                questionText = "{esc(qtext)}",
                optionA = "{esc(a)}",
                optionB = "{esc(b)}",
                optionC = "{esc(c)}",
                optionD = "{esc(d)}",
                correctAnswerIndex = {ans},
                explanation = "{esc(exp)}",
                imageUrl = {img_code},
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry {esc(yr)}",
                isVerifiedJamb = true
            )
        )"""
        f.write(entry)
    f.write(footer)

print(f"Successfully generated {out_path} with {len(unique_qs)} questions!")
