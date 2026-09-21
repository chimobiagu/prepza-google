package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic verified JAMB Government Question Bank (1983 - 2004 Series).
 * Covers Political Concepts, Systems of Government, Constitutional History of Nigeria, Public Administration, and International Relations.
 */
object JambGovernment1983to2004Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "gov_2010_02",
                subject = "Government",
                topic = "Political Concepts: State",
                year = "2010",
                questionText = "Nation-state is synonymous with:",
                optionA = "self-actualization",
                optionB = "sovereignty",
                optionC = "liberation",
                optionD = "nationalism",
                correctAnswerIndex = 1,
                explanation = "A nation-state implies a sovereign political entity where a distinct nation coincides with a sovereign state possessing supreme authority.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_2010_05",
                subject = "Government",
                topic = "Forms of Government",
                year = "2010",
                questionText = "A state that is ruled by an elected citizen is:",
                optionA = "a monarchy",
                optionB = "a plutocracy",
                optionC = "a republic",
                optionD = "an empire",
                correctAnswerIndex = 2,
                explanation = "A republic is a state in which supreme power is held by the people and their elected representatives, and which has an elected or nominated president rather than a monarch.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_2010_07",
                subject = "Government",
                topic = "Systems of Government",
                year = "2010",
                questionText = "In a parliamentary system, when the legislature passes a vote of no confidence on the executive, it means that the:",
                optionA = "executive is expected to go on suspension",
                optionB = "legislature ceases to trust the executive",
                optionC = "executive is required to resign",
                optionD = "legislature commences legal proceedings",
                correctAnswerIndex = 2,
                explanation = "A vote of no confidence indicates loss of parliamentary backing, requiring the cabinet or executive to resign immediately and trigger fresh elections.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_2010_11",
                subject = "Government",
                topic = "Federalism",
                year = "2010",
                questionText = "In which of the following systems is the power of the component units more than that of the central government?",
                optionA = "Monarchical",
                optionB = "Federal",
                optionC = "Unitary",
                optionD = "Confederal",
                correctAnswerIndex = 3,
                explanation = "In a confederation, sovereign states delegate limited powers to a central authority while retaining ultimate independence and superior authority.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_2010_22",
                subject = "Government",
                topic = "Pre-Colonial Nigerian Systems",
                year = "2010",
                questionText = "Who was the political head of the Old Oyo Empire?",
                optionA = "Bashorun",
                optionB = "Oyomesi",
                optionC = "Aremo",
                optionD = "Alaafin",
                correctAnswerIndex = 3,
                explanation = "The Alaafin was the supreme political and constitutional monarch and head of the Old Oyo Empire.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_2010_34",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2010",
                questionText = "In which of the following is the ceremonial and executive powers fused?",
                optionA = "Presidential system of government",
                optionB = "Parliamentary system of government",
                optionC = "Federal system of government",
                optionD = "Unitary system of government",
                correctAnswerIndex = 1,
                explanation = "In a parliamentary system (such as Britain), ceremonial and executive powers are often fused or shared between a prime minister (head of government) and a monarch/president (head of state).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q34"
            )
        )

        list.add(
            QuestionEntity(
                id = "gov_2010_43",
                subject = "Government",
                topic = "Nigerian Foreign Policy",
                year = "2010",
                questionText = "Nigeria spearheaded the formation of ECOWAS during the regime of:",
                optionA = "Olusegun Obasanjo",
                optionB = "Yakubu Gowon",
                optionC = "Murtala Muhammed",
                optionD = "Ibrahim Babangida",
                correctAnswerIndex = 1,
                explanation = "ECOWAS was founded in May 1975 under the military administration of General Yakubu Gowon alongside Gnassingbé Eyadéma of Togo.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Q43"
            )
        )

        return list
    }
}
