import os
import sys

output_dir = "/app/applet/app/src/main/java/com/example/data/repository"

def esc(s):
    if not s:
        return ""
    return str(s).replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '')

# =========================================================================
# 1. GOVERNMENT (PT 1 to 5 - 250 Questions)
# =========================================================================
from populate_all_pdf_questions import gov_pt1, gov_pt2
from build_gov_and_eng_banks import gov_pt3, gov_pt4, gov_pt5

all_gov_parts = [
    ("Part 1", gov_pt1),
    ("Part 2", gov_pt2),
    ("Part 3", gov_pt3),
    ("Part 4", gov_pt4),
    ("Part 5", gov_pt5)
]

gov_code = '''package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Verified Authentic JAMB Government Parts 1 - 5 Complete Objective Bank (250 Questions).
 * Extracted directly from official JAMB Government Past Questions (PT. 1-5).
 * Comprehensive coverage of Political Concepts, Systems of Government, Pre-Colonial & Colonial History,
 * Constitutions, Federalism, Public Administration, Nigerian Foreign Policy, ECOWAS, AU, and UN.
 */
object JambGovernmentPt1to5CompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
'''

total_gov = 0
for part_name, questions in all_gov_parts:
    part_num = part_name.replace("Part ", "pt")
    for idx, item in enumerate(questions, 1):
        total_gov += 1
        q, a, b, c, d, ans, exp, topic = item
        gov_code += f'''        list.add(
            QuestionEntity(
                id = "jamb_gov_{part_num}_{idx:02d}",
                subject = "Government",
                topic = "{esc(topic)}",
                year = "{esc(part_name)}",
                questionText = "{esc(q)}",
                optionA = "{esc(a)}",
                optionB = "{esc(b)}",
                optionC = "{esc(c)}",
                optionD = "{esc(d)}",
                correctAnswerIndex = {ans},
                explanation = "{esc(exp)}",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government • {esc(part_name)} (Q{idx})",
                isVerifiedJamb = true
            )
        )
'''

gov_code += '''        return list
    }
}
'''

with open(os.path.join(output_dir, 'JambGovernmentPt1to5CompleteBank.kt'), 'w') as f:
    f.write(gov_code)

print(f"Government Bank Generated: {total_gov} Questions.")
