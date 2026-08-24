package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and organized JAMB Use of English Historical Question Bank (1985 - 2004 Series).
 * Standardized with 4 options (A-D), full passage contexts, verified 0-indexed answers, and pedagogical explanations.
 */
object JambEnglishHistoricalVolume2Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // JAMB USE OF ENGLISH 1985
        // =========================================================================
        val passage1985_math = """
            Mathematics is the language in which the Book of Nature is written: Mathematics is the queen of the sciences. It is universally agreed that Mathematics is the backbone of Science and Technology. For without Mathematics the engineer is but an artist or a sculptor. He can build his bridge, attest to its form and beauty, but without Mathematics he cannot guarantee its reliability to serve the purpose for which it is built. Mathematics is indeed the science of sciences. It is also the art of all arts. It is right, legitimate and defensible to consider Mathematics as an Art. The poet, the musician, the artist and the mathematician have a lot in common. Fundamental to all their studies and works is their common interest in the logical study of related concepts and objects to form patterns which will produce beauty, harmony and logical order. Thus the poet arranges words to produce a pattern called poetry; the musician arranges sounds to produce a pattern called music; the artist arranges colours to produce a pattern called painting and the mathematician arranges abstract ideas into a pattern, using symbols, to produce equations. Each of these patterns - the poem, the music, the painting and the equation - must stand up to the test of some order, harmony and beauty.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1985_001",
                subject = "English Language",
                topic = "Comprehension: Mathematics as Art & Science",
                year = "1985",
                questionText = "$passage1985_math\n\nMathematics can be considered as a form of art because:",
                optionA = "Its main principles are widely made use of by painters",
                optionB = "It involves geometric drawing of symmetrical figures",
                optionC = "It arranges abstract ideas to create patterns of order, harmony and beauty",
                optionD = "All mathematicians are also accomplished poets and musicians",
                correctAnswerIndex = 2,
                explanation = "The passage explicitly explains that the mathematician arranges abstract ideas using symbols into patterns that produce harmony, order, and beauty, just as poets and artists arrange words or colours.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1985 • Q15"
            )
        )

        // 1985 Antonyms & Synonyms
        list.add(
            QuestionEntity(
                id = "eng_1985_002",
                subject = "English Language",
                topic = "Antonyms: Generous",
                year = "1985",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'The chief was generous in his award of university scholarships.'",
                optionA = "noble",
                optionB = "considerate",
                optionC = "liberal",
                optionD = "mean",
                correctAnswerIndex = 3,
                explanation = "'Generous' means willing to give or share abundantly. Its direct antonym is 'mean' (stingy or ungenerous).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1985 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1985_003",
                subject = "English Language",
                topic = "Antonyms: Taciturn",
                year = "1985",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'Chidi is naturally taciturn.'",
                optionA = "friendly",
                optionB = "cheerful",
                optionC = "garrulous",
                optionD = "lively",
                correctAnswerIndex = 2,
                explanation = "'Taciturn' means reserved or uncommunicative in speech. Its direct antonym is 'garrulous' (excessively talkative).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1985 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1985_004",
                subject = "English Language",
                topic = "Antonyms: Altruism",
                year = "1985",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'He is loved for his altruism.'",
                optionA = "benevolence",
                optionB = "sincerity",
                optionC = "selfishness",
                optionD = "kindness",
                correctAnswerIndex = 2,
                explanation = "'Altruism' means unselfish concern for the well-being of others. Its direct opposite is 'selfishness'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1985 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1985_005",
                subject = "English Language",
                topic = "Antonyms: Evasive",
                year = "1985",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'Many untrustworthy students give evasive answers to questions which they fully understand.'",
                optionA = "direct",
                optionB = "outspoken",
                optionC = "simple",
                optionD = "clever",
                correctAnswerIndex = 0,
                explanation = "'Evasive' answers are indirect or ambiguous, intended to avoid a direct statement. The direct antonym is 'direct'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1985 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1985_006",
                subject = "English Language",
                topic = "Synonyms: Niggardly",
                year = "1985",
                questionText = "Choose the option nearest in meaning to the underlined word:\n'Rich citizens are often niggardly in their ways.'",
                optionA = "beggarly",
                optionB = "sordid",
                optionC = "miserly",
                optionD = "pompous",
                correctAnswerIndex = 2,
                explanation = "'Niggardly' means stingy, ungenerous, or 'miserly'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1985 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1985_007",
                subject = "English Language",
                topic = "Idioms: Waterloo",
                year = "1985",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'The soldiers met their Waterloo at Philippi.'",
                optionA = "decisive victory",
                optionB = "unexpected trouble",
                optionC = "crushing defeat",
                optionD = "final retreat",
                correctAnswerIndex = 2,
                explanation = "To 'meet one's Waterloo' is an idiom meaning to encounter a final, crushing, and decisive defeat.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1985 • Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1985_008",
                subject = "English Language",
                topic = "Idioms: White elephant",
                year = "1985",
                questionText = "Choose the option that best explains the underlined idiom:\n'The government should stop white elephant projects.'",
                optionA = "Projects located in zoological reserves",
                optionB = "High-cost projects with low utility or value",
                optionC = "Low-cost projects with high economic yields",
                optionD = "Projects executed exclusively by foreign experts",
                correctAnswerIndex = 1,
                explanation = "A 'white elephant' project is a possession or scheme that is useless, extremely expensive to maintain, and yields very little utility.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1985 • Q71"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 1987 & 1988
        // =========================================================================
        val passage1987_obit = """
            There are one or two things this country can teach others, one of which is the art of writing obituaries. One suspects that the reason why some of our newspapers still manage to break even is because of the great amount of revenue they derive from obituaries. It is not unusual for about one quarter of the volume of an average daily to be constituted of obituaries and in memoriam alone. One possible explanation for this, it has been argued, is that Nigerians value their dead greatly. And there is a saying amongst us that you do not say evil things against the dead. From the evidences of these obituaries, every dead Nigerian must have been something of a saint while alive. This 'mortuary stylistics', the study in the art of eulogizing the dead and making their loss sound so heart breaking, is one of the commodities we can export to other countries.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1987_009",
                subject = "English Language",
                topic = "Comprehension: Tone and Stylistics",
                year = "1987",
                questionText = "$passage1987_obit\n\nThe tone of this passage is:",
                optionA = "Angry and belligerent",
                optionB = "Satirical and witty",
                optionC = "Non-committal and dry",
                optionD = "Mournful and solemn",
                correctAnswerIndex = 1,
                explanation = "The writer uses humor, irony, and exaggeration ('mortuary stylistics', 'export to other countries') to poke fun at the cultural exaggeration in obituary writing, creating a distinct satirical tone.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1987 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1987_010",
                subject = "English Language",
                topic = "Vocabulary & Collocations: Walks of life",
                year = "1987",
                questionText = "Choose the option that best completes the sentence:\n'The first graduation ceremony of the university was attended by dignitaries from all _____ of life.'",
                optionA = "works",
                optionB = "areas",
                optionC = "walks",
                optionD = "parts",
                correctAnswerIndex = 2,
                explanation = "The standard English idiom is 'all walks of life', referring to people from various occupations, social backgrounds, and professions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1987 • Q60"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1987_011",
                subject = "English Language",
                topic = "Concord: Many a candidate",
                year = "1987",
                questionText = "Choose the correct verbal form:\n'Many a candidate _____ to realise the difference between written and spoken English.'",
                optionA = "fails",
                optionB = "fail",
                optionC = "have failed",
                optionD = "are failing",
                correctAnswerIndex = 0,
                explanation = "The distributive quantifier structure 'Many a + singular noun' takes a singular verb ('fails').",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1987 • Q66"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1987_012",
                subject = "English Language",
                topic = "Concord: Correlative Conjunctions",
                year = "1987",
                questionText = "Choose the correct verb:\n'In my opinion, neither the players nor the coach _____ praise for the result of the match.'",
                optionA = "deserves",
                optionB = "deserve",
                optionC = "are deserving",
                optionD = "have deserved",
                correctAnswerIndex = 0,
                explanation = "When subjects are connected by 'neither... nor', the verb agrees with the subject closest to it. Here, 'the coach' is singular, requiring the singular verb 'deserves'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1987 • Q82"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 1993 - 2004
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_1993_013",
                subject = "English Language",
                topic = "Vocabulary: Sine qua non",
                year = "1993",
                questionText = "Choose the option opposite in meaning to the underlined Latin term:\n'We have found that cassava is a sine qua non item in our manufacturing industry.'",
                optionA = "useful",
                optionB = "indispensable",
                optionC = "useless",
                optionD = "dispensable",
                correctAnswerIndex = 3,
                explanation = "'Sine qua non' means an essential or indispensable condition/element. The direct opposite is 'dispensable' (non-essential).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1993 • Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1993_014",
                subject = "English Language",
                topic = "Prepositions: Contemptuous of",
                year = "1993",
                questionText = "Choose the correct preposition:\n'Adaobi is contemptuous _____ dishonest people.'",
                optionA = "to",
                optionB = "at",
                optionC = "for",
                optionD = "of",
                correctAnswerIndex = 3,
                explanation = "The adjective 'contemptuous' takes the preposition 'of' ('contemptuous of someone').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1993 • Q83"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1997_015",
                subject = "English Language",
                topic = "Vocabulary: Equanimity",
                year = "1997",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'Since mortality is the lot of man, we must all accept death with equanimity.'",
                optionA = "concern",
                optionB = "uncertainty",
                optionC = "serenity",
                optionD = "anxiety",
                correctAnswerIndex = 3,
                explanation = "'Equanimity' means mental calmness, composure, and evenness of temper, especially in difficult situations. Its antonym is 'anxiety' or agitation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1997 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1998_016",
                subject = "English Language",
                topic = "Idioms: Dark horse",
                year = "1998",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'This time, she will be competing with a dark horse.'",
                optionA = "A weak and low-spirited contender",
                optionB = "A person about whom little is known",
                optionC = "An unpopular candidate",
                optionD = "A person as strong as an equestrian",
                correctAnswerIndex = 1,
                explanation = "A 'dark horse' is a candidate or competitor about whom little is known but who may unexpectedly win or succeed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1998 • Q57"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2001_017",
                subject = "English Language",
                topic = "Phonology: Vowel Sounds",
                year = "2001",
                questionText = "Choose the word that has the same vowel sound as the underlined letters in: 'c_olo_nel'",
                optionA = "gaol",
                optionB = "colony",
                optionC = "golden",
                optionD = "girl",
                correctAnswerIndex = 3,
                explanation = "'Colonel' is pronounced /ˈkɜːnəl/. The vowel sound is the central open-mid /ɜː/ sound, exactly matching the vowel sound in 'girl' (/ɡɜːl/).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2001 • Q86"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_2004_018",
                subject = "English Language",
                topic = "Grammar: Inversion with No sooner",
                year = "2004",
                questionText = "Choose the correct grammatical structure:\n'No sooner _____ than the telephone rang.'",
                optionA = "he had got into the pool",
                optionB = "had he got into the pool",
                optionC = "did he got into the pool",
                optionD = "he got into the pool",
                correctAnswerIndex = 1,
                explanation = "Negative adverbs like 'No sooner' at the beginning of a sentence require subject-auxiliary inversion in the past perfect: 'No sooner had he got... than...'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2004 • Inversion"
            )
        )

        return list
    }
}
