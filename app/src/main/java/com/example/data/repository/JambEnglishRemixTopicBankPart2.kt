package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Remix Topic-by-Topic Question Bank Part 2.
 * Contains authentic past UTME questions across Lexis (Synonyms & Antonyms Continued),
 * Sentence Interpretations, and Phrasal Verbs.
 */
object JambEnglishRemixTopicBankPart2 {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // CHAPTER 3: LEXIS I - SYNONYMS (EXERCISE I Continued)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_remix_syn_26",
                subject = "English Language",
                topic = "Synonyms: Likeness",
                year = "1983",
                questionText = "It was interesting to observe the likeness between the pupil and his teacher.",
                optionA = "similarity",
                optionB = "relationship",
                optionC = "fondness",
                optionD = "affection",
                correctAnswerIndex = 0,
                explanation = "'Likeness' means the fact or quality of being alike; resemblance or similarity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1983:Q100"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_27",
                subject = "English Language",
                topic = "Synonyms: Fruitless",
                year = "1984",
                questionText = "All the efforts made to settle the quarrel were futile.",
                optionA = "successful",
                optionB = "wicked",
                optionC = "reasonable",
                optionD = "fruitless",
                correctAnswerIndex = 3,
                explanation = "'Futile' means incapable of producing any useful result; pointless, vain, or fruitless.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1984:Q37"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_28",
                subject = "English Language",
                topic = "Synonyms: Waterloo",
                year = "1985",
                questionText = "The gallant soldiers met their Waterloo at Philippi.",
                optionA = "victory",
                optionB = "trouble",
                optionC = "defeat",
                optionD = "happiest period",
                correctAnswerIndex = 2,
                explanation = "To 'meet one's Waterloo' is an allusion meaning to encounter a decisive, final, and crushing defeat.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_29",
                subject = "English Language",
                topic = "Synonyms: In Vain",
                year = "1985",
                questionText = "It is futile trying to make bricks without straw.",
                optionA = "fertile",
                optionB = "important",
                optionC = "fragile",
                optionD = "in vain",
                correctAnswerIndex = 3,
                explanation = "'Futile' means completely ineffective, useless, or done in vain.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_30",
                subject = "English Language",
                topic = "Synonyms: Incessantly",
                year = "1985",
                questionText = "In May 1978 the rain fell incessantly and made life drab.",
                optionA = "at intervals",
                optionB = "recurrently",
                optionC = "repeatedly",
                optionD = "continuously",
                correctAnswerIndex = 3,
                explanation = "'Incessantly' means without interruption or pausing; constantly and continuously.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_31",
                subject = "English Language",
                topic = "Synonyms: Marvelous",
                year = "1985",
                questionText = "Little Ugochi has a bicycle which is in marvelous condition.",
                optionA = "need of a tune up",
                optionB = "excellent",
                optionC = "questionable",
                optionD = "unstable",
                correctAnswerIndex = 1,
                explanation = "'Marvelous' in this sense means extraordinarily good, splendid, or excellent.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q48"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_32",
                subject = "English Language",
                topic = "Synonyms: Maintained",
                year = "1985",
                questionText = "The lecturer maintained his usual good humour in spite of the cat-calls and the rude behaviour of his students.",
                optionA = "provoked",
                optionB = "obtained",
                optionC = "kept",
                optionD = "lost",
                correctAnswerIndex = 2,
                explanation = "'Maintained' means preserved, retained, or kept up a particular state or attitude.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q49"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_33",
                subject = "English Language",
                topic = "Synonyms: Lecture",
                year = "1985",
                questionText = "The class as a whole will have a lecture on scarce commodities tomorrow.",
                optionA = "argument",
                optionB = "deliberation",
                optionC = "dispute",
                optionD = "talk or discourse",
                correctAnswerIndex = 3,
                explanation = "A 'lecture' is an educational talk or address delivered to an audience or class.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q50"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_34",
                subject = "English Language",
                topic = "Synonyms: Hindrance",
                year = "1985",
                questionText = "One hindrance to an orderly economic development of the country is large-scale fraud and corruption.",
                optionA = "difficulty",
                optionB = "element",
                optionC = "reason",
                optionD = "obstacle",
                correctAnswerIndex = 3,
                explanation = "A 'hindrance' is a thing that provides resistance, delay, or obstruction; an obstacle.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q55"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_35",
                subject = "English Language",
                topic = "Synonyms: Ajar",
                year = "1985",
                questionText = "Stephen was blamed for leaving his door ajar during the heavy rainfall.",
                optionA = "unlocked",
                optionB = "unbolted",
                optionC = "open",
                optionD = "slightly open",
                correctAnswerIndex = 3,
                explanation = "'Ajar' means slightly open or partially unclosed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q56"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_36",
                subject = "English Language",
                topic = "Synonyms: Predominantly",
                year = "1985",
                questionText = "Nigeria, like most other African countries is predominantly agricultural.",
                optionA = "mainly",
                optionB = "certainly",
                optionC = "entirely",
                optionD = "undoubtedly",
                correctAnswerIndex = 0,
                explanation = "'Predominantly' means mainly, primarily, for the most part, or largely.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q58"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_37",
                subject = "English Language",
                topic = "Synonyms: Laissez-faire",
                year = "1985",
                questionText = "You have been asked to change your laissez-faire attitude to work.",
                optionA = "stupid",
                optionB = "carefree and unconcerned",
                optionC = "careful",
                optionD = "serious",
                correctAnswerIndex = 1,
                explanation = "A 'laissez-faire' attitude is casual, carefree, non-interfering, or excessively relaxed.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1985:Q61"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_38",
                subject = "English Language",
                topic = "Synonyms: Unmitigated",
                year = "1986",
                questionText = "My spell in the university was an unmitigated disaster.",
                optionA = "unavoidable",
                optionB = "painful",
                optionC = "regrettable",
                optionD = "unqualified and absolute",
                correctAnswerIndex = 3,
                explanation = "'Unmitigated' means absolute, complete, total, or unqualified.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1986:Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_39",
                subject = "English Language",
                topic = "Synonyms: Animated",
                year = "1986",
                questionText = "The discussion became animated.",
                optionA = "specialized",
                optionB = "lively and vigorous",
                optionC = "intellectual",
                optionD = "unruly",
                correctAnswerIndex = 1,
                explanation = "'Animated' means full of life, spirit, excitement, or lively vigour.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1986:Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_40",
                subject = "English Language",
                topic = "Synonyms: Niggardly",
                year = "1986",
                questionText = "Rich citizens are often niggardly in their ways.",
                optionA = "beggarly",
                optionB = "sordid",
                optionC = "miserly and stingy",
                optionD = "pompous",
                correctAnswerIndex = 2,
                explanation = "'Niggardly' means ungenerous with money, stingy, or miserly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1986:Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_41",
                subject = "English Language",
                topic = "Synonyms: Wane",
                year = "1986",
                questionText = "The musician's popularity is beginning to decline.",
                optionA = "change",
                optionB = "wane",
                optionC = "slide",
                optionD = "disappear",
                correctAnswerIndex = 1,
                explanation = "To 'wane' means to decrease gradually in vigor, power, or extent; to decline.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1986:Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_42",
                subject = "English Language",
                topic = "Synonyms: Snow-balled",
                year = "1986",
                questionText = "The beggar's takings snow-balled every hour.",
                optionA = "grew rapidly",
                optionB = "turned white",
                optionC = "fell into snow",
                optionD = "turned into snow",
                correctAnswerIndex = 0,
                explanation = "To 'snowball' means to increase rapidly in size, intensity, or importance at an accelerating rate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1986:Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_43",
                subject = "English Language",
                topic = "Synonyms: Hesitant",
                year = "1986",
                questionText = "The driver, on seeing the traffic warden, was hesitant to start the engine.",
                optionA = "slow",
                optionB = "unable",
                optionC = "anxious",
                optionD = "reluctant",
                correctAnswerIndex = 3,
                explanation = "'Hesitant' means tentative, unsure, slow, or reluctant in acting.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1986:Q58"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_44",
                subject = "English Language",
                topic = "Synonyms: Unimportant",
                year = "1986",
                questionText = "He likes to call attention to unimportant matters.",
                optionA = "dubious",
                optionB = "incidental",
                optionC = "trivial",
                optionD = "simple",
                correctAnswerIndex = 2,
                explanation = "'Trivial' means of little value, insignificant, or unimportant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1986:Q59"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_remix_syn_45",
                subject = "English Language",
                topic = "Synonyms: Herculean",
                year = "1986",
                questionText = "The task was Herculean.",
                optionA = "irregular",
                optionB = "related to Hercules",
                optionC = "stimulating",
                optionD = "demanding and arduous",
                correctAnswerIndex = 3,
                explanation = "'Herculean' describes a task requiring enormous strength, effort, or labour; arduous.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Series Remix • 1986:Q64"
            )
        )

        return list
    }
}
