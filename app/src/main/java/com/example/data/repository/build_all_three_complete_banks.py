import os
import sys

output_dir = "/app/applet/app/src/main/java/com/example/data/repository"

def esc(s):
    if not s:
        return ""
    return str(s).replace('\\', '\\\\').replace('"', '\\"').replace('\n', '\\n').replace('\r', '')

# Part 1, 2, 3, 4, 5 Government data & Geography & English
from make_pdf_banks import geo_data

# Run Geography Builder
geo_code = '''package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Verified JAMB Geography 2015 Complete Past Paper Bank (81 Questions).
 * Complete questions, verified options, answers, and geographic explanations.
 */
object JambGeography2015CompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()
'''

for idx, item in enumerate(geo_data, 1):
    q, a, b, c, d, ans, exp, topic = item
    geo_code += f'''        list.add(
            QuestionEntity(
                id = "jamb_geo_2015_{idx:02d}",
                subject = "Geography",
                topic = "{esc(topic)}",
                year = "2015",
                questionText = "{esc(q)}",
                optionA = "{esc(a)}",
                optionB = "{esc(b)}",
                optionC = "{esc(c)}",
                optionD = "{esc(d)}",
                correctAnswerIndex = {ans},
                explanation = "{esc(exp)}",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Geography 2015 • Q{idx}",
                isVerifiedJamb = true
            )
        )
'''

geo_code += '''        return list
    }
}
'''

with open(os.path.join(output_dir, 'JambGeography2015CompleteBank.kt'), 'w') as f:
    f.write(geo_code)

print(f"Geography 2015 Bank Generated: {len(geo_data)} questions.")
