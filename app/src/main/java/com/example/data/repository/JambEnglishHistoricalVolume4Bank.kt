package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and organized JAMB Use of English Historical Series: 1991 - 1995.
 * Standardized with 4 options (A-D), complete passage context, verified answers, and pedagogical explanations.
 */
object JambEnglishHistoricalVolume4Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // JAMB USE OF ENGLISH 1991 & 1992
        // =========================================================================
        val passage1992_env = """
            Our planet is at risk. Our environment is under threat. The air we breathe, the water we drink, the seas we fish in, the soil we farm, the forest, animals and plants which surround us are in danger. New terms and words describe these problems – acid rain, the greenhouse effect, global warming, holes in the ozone layer, desertification and industrial pollution.
            The richer countries of the world are mainly responsible for industrial pollution. This is where most of all the commercial energy is produced. In developing countries, poverty causes people to change their environment – to overgraze grasslands, to cut down trees for new land and firewood, to farm poor soil for food.
            The United Nations Environmental Protection Agency says that an area of forest the size of Sierra Leone disappears every year. Trees protect the land from heavy downpour of rain and their roots help to hold the soil together. To rescue and conserve our beautiful world, we must act cooperatively.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1992_001",
                subject = "English Language",
                topic = "Comprehension: Environmental Degradation",
                year = "1992",
                questionText = "$passage1992_env\n\nFrom the passage, it can be deduced that inhabitants of developing countries:",
                optionA = "Take more care of their environment than those in developed countries",
                optionB = "Degrade the environment primarily to eke out a livelihood",
                optionC = "Generate more harmful industrial by-products",
                optionD = "Cut down trees only for industrial export",
                correctAnswerIndex = 1,
                explanation = "The passage states that in developing countries, 'poverty causes people to change their environment – to overgraze grasslands, to cut down trees for new land and firewood, to farm poor soil for food' to survive.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1992 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1992_026",
                subject = "English Language",
                topic = "Antonyms: Infuriated",
                year = "1992",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Ojo’s response infuriated his wife.'",
                optionA = "annoyed",
                optionB = "pleased",
                optionC = "surprised",
                optionD = "confused",
                correctAnswerIndex = 1,
                explanation = "'Infuriated' means made extremely angry. Its direct antonym is 'pleased'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1992 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1992_032",
                subject = "English Language",
                topic = "Antonyms: Stretch",
                year = "1992",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Language teachers believe that grammar exercises stretch the mind.'",
                optionA = "expand",
                optionB = "ruin",
                optionC = "enrich",
                optionD = "restrict",
                correctAnswerIndex = 3,
                explanation = "To 'stretch' the mind means to expand and exercise its faculties. The opposite is to 'restrict' or limit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1992 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1992_036",
                subject = "English Language",
                topic = "Antonyms: Amateur",
                year = "1992",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Okoro is an amateur wrestler.'",
                optionA = "skilful",
                optionB = "good",
                optionC = "professional",
                optionD = "strong",
                correctAnswerIndex = 2,
                explanation = "An 'amateur' engages in a pursuit without pay; the direct antonym is a 'professional'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1992 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1992_043",
                subject = "English Language",
                topic = "Idioms: Eke out a living",
                year = "1992",
                questionText = "Choose the option nearest in meaning to the italicized phrase:\n'He works long hours collecting trash to eke out a livelihood.'",
                optionA = "try a living",
                optionB = "struggle for a living",
                optionC = "make a living with difficulty",
                optionD = "carve out a living",
                correctAnswerIndex = 2,
                explanation = "To 'eke out a livelihood' means to barely make or supplement a living with great difficulty or effort.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1992 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1992_057",
                subject = "English Language",
                topic = "Concord & Pronoun Agreement: Every",
                year = "1992",
                questionText = "Choose the grammatically correct option:\n'Every programming language and software package _____ limitations.'",
                optionA = "have its",
                optionB = "have their",
                optionC = "has its",
                optionD = "has their",
                correctAnswerIndex = 2,
                explanation = "Compound subjects quantified by 'Every' take a singular verb ('has') and singular possessive pronoun ('its').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1992 • Q57"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1992_062",
                subject = "English Language",
                topic = "Verbs: Past Tense of Wring",
                year = "1992",
                questionText = "Choose the correct past tense form:\n'Before mechanization, workers _____ water out of fabrics with their hands.'",
                optionA = "wring",
                optionB = "wrung",
                optionC = "wrang",
                optionD = "wringed",
                correctAnswerIndex = 1,
                explanation = "The past tense and past participle of the irregular verb 'wring' is 'wrung'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1992 • Q62"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 1993 & 1994
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_1993_028",
                subject = "English Language",
                topic = "Idioms: Between devil and deep blue sea",
                year = "1993",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'He was between the devil and the deep blue sea.'",
                optionA = "He was in acute physical danger",
                optionB = "He was very scared",
                optionC = "He stood by the seashore",
                optionD = "He was caught in a difficult dilemma with two equally unpleasant options",
                correctAnswerIndex = 3,
                explanation = "To be 'between the devil and the deep blue sea' is an idiom meaning to be faced with a dilemma between two equally undesirable choices.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1993 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1993_053",
                subject = "English Language",
                topic = "Idioms: Burn candle at both ends",
                year = "1993",
                questionText = "Choose the option that best explains the idiom:\n'The principal warned us against burning the candle at both ends.'",
                optionA = "Being careless with candles",
                optionB = "Wearing ourselves out through overwork and lack of rest",
                optionC = "Being overly generous with finances",
                optionD = "Showing disloyalty to the school",
                correctAnswerIndex = 1,
                explanation = "To 'burn the candle at both ends' means to overwork oneself or exhaust one's energy by working late into the night and rising very early.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1993 • Q53"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1993_061",
                subject = "English Language",
                topic = "Synonyms: Unorthodox",
                year = "1993",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'He won most of his fights because of his unorthodox style.'",
                optionA = "crude",
                optionB = "dishonest",
                optionC = "aggressive",
                optionD = "unconventional",
                correctAnswerIndex = 3,
                explanation = "'Unorthodox' means contrary to what is usual, traditional, or accepted; hence, 'unconventional'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1993 • Q61"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1993_062",
                subject = "English Language",
                topic = "Foreign Expressions: Persona non grata",
                year = "1993",
                questionText = "Choose the option nearest in meaning to the Latin term:\n'Jide says our uncle has been declared persona non grata by the French government.'",
                optionA = "an unwelcome person",
                optionB = "an impersonator",
                optionC = "an ungrateful person",
                optionD = "an unofficial envoy",
                correctAnswerIndex = 0,
                explanation = "'Persona non grata' is a Latin phrase used in diplomacy meaning an unacceptable or unwelcome person.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1993 • Q62"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1993_087",
                subject = "English Language",
                topic = "Grammar: Inversion with No sooner",
                year = "1993",
                questionText = "Choose the correct sentence structure:\n'No sooner _____ to fall.'",
                optionA = "did we set out when the rain had started",
                optionB = "had we set out than the rain started",
                optionC = "were we setting out than the rain started",
                optionD = "we had set out when the rain started",
                correctAnswerIndex = 1,
                explanation = "Inverted sentence structure with 'No sooner' takes the past perfect auxiliary + subject + main verb, followed by 'than': 'No sooner had we set out than...'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1993 • Q87"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 1995
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_1995_001",
                subject = "English Language",
                topic = "Idioms: For good",
                year = "1995",
                questionText = "In English idiomatic usage, to leave a country 'for good' means leaving:",
                optionA = "unexpectedly",
                optionB = "for better financial opportunities",
                optionC = "permanently and forever",
                optionD = "temporarily during hard times",
                correctAnswerIndex = 2,
                explanation = "The idiom 'for good' means permanently, forever, or irrevocably.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1995 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1995_034",
                subject = "English Language",
                topic = "Antonyms: Disinterested",
                year = "1995",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'In the opinion of most observers, it was a disinterested decision.'",
                optionA = "neutral",
                optionB = "impartial",
                optionC = "biased",
                optionD = "candid",
                correctAnswerIndex = 2,
                explanation = "'Disinterested' means impartial and unbiased. Its direct opposite is 'biased' or self-interested.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1995 • Q34"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1995_045",
                subject = "English Language",
                topic = "Antonyms: Fastidious",
                year = "1995",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'In spite of many days of fasting, Musa is still fastidious about his food.'",
                optionA = "particular",
                optionB = "undecided",
                optionC = "indifferent",
                optionD = "unmindful",
                correctAnswerIndex = 2,
                explanation = "'Fastidious' means very attentive to and concerned about accuracy, quality, and detail (fussy). The opposite is 'indifferent' or easy to please.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1995 • Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1995_052",
                subject = "English Language",
                topic = "Idioms: Storm in a teacup",
                year = "1995",
                questionText = "Choose the option that best explains the italicized phrase:\n'The chairman’s reaction was a storm in a tea cup.'",
                optionA = "suitable for the occasion",
                optionB = "a great fuss or excitement over something trivial",
                optionC = "more serious than necessary",
                optionD = "greatly diminished in scope",
                correctAnswerIndex = 1,
                explanation = "A 'storm in a tea cup' is an idiom meaning great outrage or excitement over a minor or trivial matter.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1995 • Q52"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1995_056",
                subject = "English Language",
                topic = "Idioms: Go off at a tangent",
                year = "1995",
                questionText = "Choose the option nearest in meaning to the italicized phrase:\n'At that point, the speaker went off at a tangent.'",
                optionA = "started to run away like a mad person",
                optionB = "took a lashing out at the audience",
                optionC = "began to discuss completely unrelated matters",
                optionD = "chose to recall a previous decision",
                correctAnswerIndex = 2,
                explanation = "To 'go off at a tangent' means to suddenly digress or start discussing something unrelated to the main topic.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1995 • Q56"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1995_064",
                subject = "English Language",
                topic = "Idioms: Tongue in cheek",
                year = "1995",
                questionText = "Choose the option nearest in meaning to the italicized phrase:\n'The man who gave the closing remarks at the party spoke tongue in cheek.'",
                optionA = "ironically and not seriously",
                optionB = "wisely and thoughtfully",
                optionC = "profusely",
                optionD = "eloquently",
                correctAnswerIndex = 0,
                explanation = "To speak 'tongue in cheek' means to speak insincerely, facetiously, or ironically.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1995 • Q64"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1995_075",
                subject = "English Language",
                topic = "Verbs: Past Tense of Cling",
                year = "1995",
                questionText = "Choose the correct past tense form:\n'What saved her was that she _____ to the side of the boat.'",
                optionA = "had clinged",
                optionB = "clung",
                optionC = "clinged",
                optionD = "clang",
                correctAnswerIndex = 1,
                explanation = "The past tense of the irregular verb 'cling' is 'clung'. 'Clinged' and 'clang' are non-standard.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1995 • Q75"
            )
        )

        return list
    }
}
