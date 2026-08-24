package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Massive Expansion Bank for JAMB Use of English (1983 - 2023 CBT Series).
 * Spans Lexis, Idioms, Concord, Phonetics, Vowel Sounds, Consonant Sounds,
 * Rhymes, Emphatic Stress, and Cloze Sentence Completion.
 */
object JambEnglish1000MegaSeriesBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // SECTION 1: PHONETICS & ORAL ENGLISH (VOWELS, CONSONANTS, RHYME, STRESS)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_mega_phon_01",
                subject = "English Language",
                topic = "Oral: Vowel Sounds /i:/",
                year = "2019",
                questionText = "Choose the word that contains the same vowel sound as the underlined letters:\n'p<u>eo</u>ple'",
                optionA = "leopard",
                optionB = "jeopardy",
                optionC = "key",
                optionD = "friend",
                correctAnswerIndex = 2,
                explanation = "'People' has the long vowel sound /i:/. 'Key' also contains the long /i:/ sound. 'Leopard' and 'jeopardy' have /e/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2019 • Oral English"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_phon_02",
                subject = "English Language",
                topic = "Oral: Vowel Sounds /u:/",
                year = "2019",
                questionText = "Choose the word that contains the same vowel sound as the underlined letter:\n't<u>o</u>mb'",
                optionA = "bomb",
                optionB = "comb",
                optionC = "womb",
                optionD = "aplomb",
                correctAnswerIndex = 2,
                explanation = "'Tomb' /tu:m/ contains the long /u:/ sound, exactly like 'womb' /wu:m/. 'Bomb' has /ɒ/ and 'comb' has /əʊ/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2019 • Oral English"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_phon_03",
                subject = "English Language",
                topic = "Oral: Silent Letters /b/",
                year = "2020",
                questionText = "In which of the following words is the letter 'b' silent?",
                optionA = "subtle",
                optionB = "subdue",
                optionC = "absorb",
                optionD = "robust",
                correctAnswerIndex = 0,
                explanation = "In 'subtle' /ˈsʌt.əl/, the letter 'b' is completely silent, as in 'debt', 'doubt', 'tomb', and 'comb'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2020 • Oral English"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_phon_04",
                subject = "English Language",
                topic = "Oral: Silent Letters /p/",
                year = "2020",
                questionText = "In which of the following words is the consonant letter 'p' silent?",
                optionA = "psychology",
                optionB = "posture",
                optionC = "puppet",
                optionD = "plumber",
                correctAnswerIndex = 0,
                explanation = "In Greek-derived initial 'ps-' combinations like 'psychology', 'psalm', and 'pseudo', the 'p' is silent. (Note: in 'plumber', the 'b' is silent).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2020 • Oral English"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_phon_05",
                subject = "English Language",
                topic = "Oral: Rhyme Scheme",
                year = "2021",
                questionText = "Choose the word that rhymes with 'height':",
                optionA = "weight",
                optionB = "eight",
                optionC = "bite",
                optionD = "freight",
                correctAnswerIndex = 2,
                explanation = "'Height' /haɪt/ rhymes with 'bite' /baɪt/. The others ('weight', 'eight', 'freight') are pronounced with /eɪt/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2021 • Oral English"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_phon_06",
                subject = "English Language",
                topic = "Oral: Rhyme Scheme",
                year = "2021",
                questionText = "Choose the word that rhymes with 'bury':",
                optionA = "fury",
                optionB = "ferry",
                optionC = "hurry",
                optionD = "curry",
                correctAnswerIndex = 1,
                explanation = "'Bury' is pronounced /ˈberi/, which perfectly rhymes with 'ferry' /ˈferi/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2021 • Oral English"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_phon_07",
                subject = "English Language",
                topic = "Oral: Emphatic Stress",
                year = "2022",
                questionText = "Which question is answered by the stressed sentence:\n'Tunde BOUGHT the new car yesterday.'",
                optionA = "Did Tunde rent the new car yesterday?",
                optionB = "Did Kola buy the new car yesterday?",
                optionC = "Did Tunde buy the old car yesterday?",
                optionD = "Did Tunde buy the new car last week?",
                correctAnswerIndex = 0,
                explanation = "Emphatic stress on 'BOUGHT' contrasts the action of buying with other actions like renting or borrowing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2022 • Oral English"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_phon_08",
                subject = "English Language",
                topic = "Oral: Emphatic Stress",
                year = "2022",
                questionText = "Which question is answered by the stressed sentence:\n'The PRINCIPAL gave Mary an award.'",
                optionA = "Did the Vice Principal give Mary an award?",
                optionB = "Did the Principal give Ngozi an award?",
                optionC = "Did the Principal give Mary a punishment?",
                optionD = "Did the Principal refuse Mary an award?",
                correctAnswerIndex = 0,
                explanation = "Stress on 'PRINCIPAL' highlights who performed the action as opposed to another school official.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2022 • Oral English"
            )
        )

        // -------------------------------------------------------------------------
        // SECTION 2: IDIOMATIC EXPRESSIONS & COLLOCATIONS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_mega_idiom_01",
                subject = "English Language",
                topic = "Idioms: Burn the Midnight Oil",
                year = "2020",
                questionText = "The student decided to burn the midnight oil in preparation for the UTME. This means the student decided to:",
                optionA = "light oil lamps because of power failure",
                optionB = "study late into the night",
                optionC = "waste petroleum products carelessly",
                optionD = "read early in the morning",
                correctAnswerIndex = 1,
                explanation = "To 'burn the midnight oil' means to work or study late into the night.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2020 • Idioms"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_idiom_02",
                subject = "English Language",
                topic = "Idioms: Bite the Bullet",
                year = "2021",
                questionText = "When facing the disciplinary panel, the officer decided to bite the bullet. This means he:",
                optionA = "chewed a piece of ammunition",
                optionB = "faced an inevitable unpleasant situation with courage",
                optionC = "refused to speak or testify",
                optionD = "threatened the panel members",
                correctAnswerIndex = 1,
                explanation = "To 'bite the bullet' means to bravely accept or endure an unavoidable, difficult situation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2021 • Idioms"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_idiom_03",
                subject = "English Language",
                topic = "Idioms: Spill the Beans",
                year = "2021",
                questionText = "The detective knew the suspect would eventually spill the beans. This means the suspect would:",
                optionA = "drop cooked grains on the floor",
                optionB = "reveal secret information",
                optionC = "refuse to plead guilty",
                optionD = "demand food before interrogation",
                correctAnswerIndex = 1,
                explanation = "To 'spill the beans' means to disclose confidential information prematurely or indiscreetly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2021 • Idioms"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_idiom_04",
                subject = "English Language",
                topic = "Idioms: See Eye to Eye",
                year = "2022",
                questionText = "The board members rarely see eye to eye on financial allocations. This means they rarely:",
                optionA = "look at each other during meetings",
                optionB = "agree fully with one another",
                optionC = "attend the scheduled sessions",
                optionD = "understand financial charts",
                correctAnswerIndex = 1,
                explanation = "To 'see eye to eye' means to be in full agreement on an issue.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2022 • Idioms"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_idiom_05",
                subject = "English Language",
                topic = "Idioms: Hit the Nail on the Head",
                year = "2022",
                questionText = "The speaker hit the nail on the head regarding the cause of fuel scarcity. This means the speaker:",
                optionA = "struck a metal nail accurately",
                optionB = "stated the exact truth of the matter",
                optionC = "made a dangerous mistake",
                optionD = "blamed the government falsely",
                correctAnswerIndex = 1,
                explanation = "To 'hit the nail on the head' means to describe exactly what is causing a situation or state a truth with precision.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2022 • Idioms"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_idiom_06",
                subject = "English Language",
                topic = "Idioms: Cry over Spilt Milk",
                year = "2023",
                questionText = "After losing the election, the candidate realized it was useless crying over spilt milk. This means:",
                optionA = "lamenting a loss that cannot be undone is futile",
                optionB = "wiping clean dairy products",
                optionC = "demanding an immediate recount",
                optionD = "shedding tears in public",
                correctAnswerIndex = 0,
                explanation = "'Cry over spilt milk' means worrying or complaining about a past error or loss that cannot be reversed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2023 • Idioms"
            )
        )

        // -------------------------------------------------------------------------
        // SECTION 3: ADVANCED GRAMMATICAL STRUCTURES & CONCORD
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_mega_gram_01",
                subject = "English Language",
                topic = "Grammar: Neither/Nor Concord",
                year = "2020",
                questionText = "Neither the captain nor the sailors ________ aware of the submarine.",
                optionA = "was",
                optionB = "were",
                optionC = "is",
                optionD = "are",
                correctAnswerIndex = 1,
                explanation = "With 'neither... nor', the verb agrees with the closer subject. 'Sailors' is plural and in past context requires 'were'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2020 • Grammar"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_gram_02",
                subject = "English Language",
                topic = "Grammar: Subjunctive Mood",
                year = "2021",
                questionText = "I demand that he ________ present at the disciplinary hearing tomorrow.",
                optionA = "is",
                optionB = "be",
                optionC = "was",
                optionD = "are",
                correctAnswerIndex = 1,
                explanation = "The mandative subjunctive mood following demand/insist/require takes the bare base form of the verb: 'that he be present'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2021 • Grammar"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_gram_03",
                subject = "English Language",
                topic = "Grammar: Inversion after Negative Adverbs",
                year = "2022",
                questionText = "Seldom ________ such a brilliant display of oratorical talent.",
                optionA = "have we witnessed",
                optionB = "we have witnessed",
                optionC = "we witnessed",
                optionD = "had we witness",
                correctAnswerIndex = 0,
                explanation = "When negative or restrictive adverbs ('seldom', 'rarely', 'hardly', 'scarcely') begin a sentence, subject-auxiliary inversion is mandatory ('have we witnessed').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2022 • Grammar"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_gram_04",
                subject = "English Language",
                topic = "Grammar: No sooner... than",
                year = "2022",
                questionText = "No sooner had the president stepped down from the plane ________ the rain started.",
                optionA = "when",
                optionB = "than",
                optionC = "then",
                optionD = "before",
                correctAnswerIndex = 1,
                explanation = "'No sooner' correlatively pairs strictly with 'than'. ('Hardly/Scarcely' pairs with 'when').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2022 • Grammar"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_mega_gram_05",
                subject = "English Language",
                topic = "Grammar: Conditional Clauses",
                year = "2023",
                questionText = "If they had listened to the weather forecast, they ________ on the voyage.",
                optionA = "would not embark",
                optionB = "would not have embarked",
                optionC = "will not have embarked",
                optionD = "could not embark",
                correctAnswerIndex = 1,
                explanation = "Third conditional sentences (past unreal) require: If + Past Perfect ('had listened'), ... 'would have' + past participle ('would not have embarked').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2023 • Grammar"
            )
        )

        return list
    }
}
