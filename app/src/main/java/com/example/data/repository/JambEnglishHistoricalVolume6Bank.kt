package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and organized JAMB Use of English Historical Series: 2002 - 2004.
 * Standardized with 4 options (A-D), complete passage context, verified answers, and pedagogical explanations.
 */
object JambEnglishHistoricalVolume6Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // JAMB USE OF ENGLISH 2002
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_2002_028",
                subject = "English Language",
                topic = "Vocabulary: Mettle",
                year = "2002",
                questionText = "Choose the option that best completes the sentence:\n'The match gave the team a chance to show their _____.'",
                optionA = "mettle",
                optionB = "worth",
                optionC = "position",
                optionD = "prowess",
                correctAnswerIndex = 0,
                explanation = "To 'show one's mettle' is the standard English idiom meaning to display one's resilience, courage, or ability to cope with difficulties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2002 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2002_068",
                subject = "English Language",
                topic = "Idioms & Vocabulary: Pyrrhic victory",
                year = "2002",
                questionText = "Choose the option nearest in meaning to the italicized phrase:\n'His success may be described as a pyrrhic victory.'",
                optionA = "a deserving victory",
                optionB = "a victory won at too great a cost",
                optionC = "an indecisive victory",
                optionD = "an easy victory",
                correctAnswerIndex = 1,
                explanation = "A 'Pyrrhic victory' is a victory that inflicts such a devastating toll on the victor that it is tantamount to defeat (costly victory).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2002 • Q68"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2002_076",
                subject = "English Language",
                topic = "Idioms: State of flux",
                year = "2002",
                questionText = "Choose the option that best explains the sentence:\n'The organization is constantly in a state of flux.'",
                optionA = "The organization is moribund",
                optionB = "The organization is experiencing good times",
                optionC = "The organization is facing financial ruin",
                optionD = "There are continuous or periodic changes in the organization",
                correctAnswerIndex = 3,
                explanation = "A 'state of flux' refers to a condition of continuous change, fluctuation, or movement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2002 • Q76"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2002_080",
                subject = "English Language",
                topic = "Idioms: By leaps and bounds",
                year = "2002",
                questionText = "Choose the option that best explains the sentence:\n'After the successful operation, he recovered by leaps and bounds.'",
                optionA = "His bandages helped him walk",
                optionB = "He did a lot of jumping exercises",
                optionC = "He got well very rapidly and dramatically",
                optionD = "He had occasional relapses",
                correctAnswerIndex = 2,
                explanation = "To progress 'by leaps and bounds' means to make rapid, spectacular, or dramatic progress.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2002 • Q80"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2002_087",
                subject = "English Language",
                topic = "Idioms: Hook, line and sinker",
                year = "2002",
                questionText = "Choose the option opposite in meaning to the italicized idiom:\n'He gave an unsatisfactory excuse but the boss swallowed it hook, line and sinker.'",
                optionA = "completely",
                optionB = "with a pinch of salt",
                optionC = "entirely",
                optionD = "without mincing words",
                correctAnswerIndex = 1,
                explanation = "'Hook, line and sinker' means completely and unquestioningly. The direct opposite is to take something 'with a pinch of salt' (skeptically).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2002 • Q87"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 2003 & 2004
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_2003_038",
                subject = "English Language",
                topic = "Antonyms: Invigorating",
                year = "2003",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'A cool bath in hot weather can be truly invigorating.'",
                optionA = "devastating",
                optionB = "unpalatable",
                optionC = "debilitating",
                optionD = "disgusting",
                correctAnswerIndex = 2,
                explanation = "'Invigorating' means making one feel strong, healthy, and full of energy. Its direct antonym is 'debilitating' (weakening/enervating).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2003 • Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2003_041",
                subject = "English Language",
                topic = "Antonyms: Gregarious",
                year = "2003",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Gregarious animals can be found in the zoo.'",
                optionA = "Various",
                optionB = "Wild",
                optionC = "Solitary",
                optionD = "Tame",
                correctAnswerIndex = 2,
                explanation = "'Gregarious' animals live in flocks or social communities. The antonym is 'solitary' or lonely.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2003 • Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2003_058",
                subject = "English Language",
                topic = "Vocabulary: Commodious",
                year = "2003",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The carpenter built a commodious wardrobe.'",
                optionA = "gigantic",
                optionB = "small",
                optionC = "spacious",
                optionD = "wide",
                correctAnswerIndex = 2,
                explanation = "'Commodious' (especially of furniture or a building) means roomy and 'spacious'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2003 • Q58"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2004_063",
                subject = "English Language",
                topic = "Idioms: Devil's advocate",
                year = "2004",
                questionText = "Choose the option that best explains the sentence:\n'Everyone was ready to play the devil’s advocate in the debate.'",
                optionA = "Everyone was willing to defend wrongdoers",
                optionB = "Everyone was willing to argue against an opinion for the sake of exploring all sides of the issue",
                optionC = "Everyone was an evil genius",
                optionD = "Everyone wanted to suppress discussion",
                correctAnswerIndex = 1,
                explanation = "To play the 'devil's advocate' means to express a contentious or dissenting opinion in order to provoke debate or test the strength of the opposing arguments.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2004 • Q63"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2004_097",
                subject = "English Language",
                topic = "Antonyms: Tractable",
                year = "2004",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The dictator wanted tractable men in his cabinet.'",
                optionA = "tough",
                optionB = "intelligent",
                optionC = "unruly and defiant",
                optionD = "reliable",
                correctAnswerIndex = 2,
                explanation = "'Tractable' means easy to control, manage, or influence (compliant). The direct opposite is 'unruly' or defiant.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2004 • Q97"
            )
        )

        return list
    }
}
