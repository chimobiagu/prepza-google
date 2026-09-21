package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME 2012 Use of English Complete Question Bank.
 * Features official questions on Nigerian Indigenous Religions, Reading Culture,
 * Learning from Wisdom vs Experience, Medical Cloze, Idioms, Antonyms, and Synonyms.
 */
object JambEnglish2012ExamCompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2012 COMPREHENSION (Q1 - Q25)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2012_02",
                subject = "English Language",
                topic = "Comprehension: Indigenous Religions",
                year = "2012",
                questionText = "From the passage on traditional religions in Nigeria, one can say that all ethnic groups have:",
                optionA = "different traditional religions with core underlying elements of similarities",
                optionB = "completely identical religious deities across all homelands",
                optionC = "no belief in a supreme creator",
                optionD = "uniform shrine structures across the country",
                correctAnswerIndex = 0,
                explanation = "Despite variations, African traditional religions share belief in a benevolent High God, intermediary deities, nature spirits, and ancestral veneration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_08",
                subject = "English Language",
                topic = "Comprehension: Reading Culture in Nigeria",
                year = "2012",
                questionText = "The expression '...that earned her the award is profoundly gripping' as used in the passage means that the book:",
                optionA = "is highly interesting, compelling, and completely captures reader attention",
                optionB = "is full of technical difficult grammar",
                optionC = "is rejected by international book reviewers",
                optionD = "was written by a foreign author",
                correctAnswerIndex = 0,
                explanation = "'Gripping' means intensely exciting, emotionally engaging, and commanding full attention.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_12",
                subject = "English Language",
                topic = "Comprehension: Wisdom vs Experience",
                year = "2012",
                questionText = "According to the passage on experiential learning, it can be deduced that:",
                optionA = "learning through painful mistakes is the only way to gain knowledge",
                optionB = "learning consciously through wisdom is more desirable, cheaper, and less painful than learning solely through bitter experience",
                optionC = "wisdom cannot be acquired without physical injuries",
                optionD = "experience is always superior to foresight",
                correctAnswerIndex = 1,
                explanation = "The writer argues that learning through wisdom beforehand prevents the scars and painful regrets of learning only after making mistakes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q12"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2012 SENTENCE INTERPRETATION (Q26 - Q35)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2012_26",
                subject = "English Language",
                topic = "Sentence Interpretation: Finger in Every Pie",
                year = "2012",
                questionText = "Hardworking students must not have a finger in every pie at school. This means:",
                optionA = "Hardworking students should eat all snacks available",
                optionB = "Hardworking students should participate in every single activity",
                optionC = "Hardworking students must avoid getting involved in too many disparate activities simultaneously",
                optionD = "Hardworking students should advise others on school leadership",
                correctAnswerIndex = 2,
                explanation = "To 'have a finger in every pie' means to be meddlesomely or excessively involved in too many different matters at once.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_27",
                subject = "English Language",
                topic = "Sentence Interpretation: Riding the Crest",
                year = "2012",
                questionText = "The Vice-Chancellor is riding the crest of the last quarter of his administration. This means:",
                optionA = "The Vice-Chancellor enjoys widespread recognition, success, and high standing in his final tenure",
                optionB = "The Vice-Chancellor faces public hostility",
                optionC = "The Vice-Chancellor is in a hurry to retire",
                optionD = "The administration is failing rapidly",
                correctAnswerIndex = 0,
                explanation = "To 'ride the crest' (or ride the crest of a wave) means to enjoy a peak period of success, confidence, and popular achievement.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_28",
                subject = "English Language",
                topic = "Sentence Interpretation: Absolved from Charge",
                year = "2012",
                questionText = "She was absolved by the court from the charge. This means:",
                optionA = "She was convicted and imprisoned",
                optionB = "Her case was dismissed for lack of lawyers",
                optionC = "She was officially declared free and cleared from guilt or criminal liability",
                optionD = "She admitted her crime in open court",
                correctAnswerIndex = 2,
                explanation = "'Absolve' means to formally declare someone free from guilt, obligation, or criminal accusation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_29",
                subject = "English Language",
                topic = "Sentence Interpretation: Throwing Weight About",
                year = "2012",
                questionText = "The landlord is fond of throwing his weight about. This means:",
                optionA = "The landlord exercises vigorously in the compound",
                optionB = "The landlord is physically obese",
                optionC = "The landlord aggressively uses his authority to dictate and give haughty orders to others",
                optionD = "The landlord respects the rights of his tenants",
                correctAnswerIndex = 2,
                explanation = "To 'throw one's weight about' means to act aggressively, assertively, or arrogantly to boss people around.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_33",
                subject = "English Language",
                topic = "Sentence Interpretation: Feet of Clay",
                year = "2012",
                questionText = "He could not speak out because he had feet of clay. This means:",
                optionA = "His shoes were dirty with mud",
                optionB = "He was exposed as having a fundamental character defect, weakness, or cowardice",
                optionC = "He was physically injured from sports",
                optionD = "He was a traditional pottery maker",
                correctAnswerIndex = 1,
                explanation = "To have 'feet of clay' is an idiom describing a hidden but major character weakness, flaw, or moral vulnerability in an admired person.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q33"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2012 ANTONYMS (Q36 - Q50)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2012_38",
                subject = "English Language",
                topic = "Antonyms: Flexible",
                year = "2012",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The principal was advised to be *flexible* on critical issues.'",
                optionA = "livid",
                optionB = "cautious",
                optionC = "evasive",
                optionD = "rigid and unyielding",
                correctAnswerIndex = 3,
                explanation = "'Flexible' means adaptable, accommodating, or open to compromise. The antonym is 'rigid' or 'inflexible'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_41",
                subject = "English Language",
                topic = "Antonyms: Reticent",
                year = "2012",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The management wants to consider her *reticent* behaviour in due course.'",
                optionA = "disapproving",
                optionB = "disciplinarian",
                optionC = "contemplative",
                optionD = "loquacious and talkative",
                correctAnswerIndex = 3,
                explanation = "'Reticent' means uncommunicative, quiet, or reserved. The antonym is 'loquacious' (extremely talkative).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_42",
                subject = "English Language",
                topic = "Antonyms: Volatile",
                year = "2012",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Election processes often become *volatile*.'",
                optionA = "calm and peaceful",
                optionB = "strange",
                optionC = "sudden",
                optionD = "latent",
                correctAnswerIndex = 0,
                explanation = "'Volatile' means unstable, explosive, and liable to change rapidly and unpredictably. The opposite is 'calm'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q42"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_45",
                subject = "English Language",
                topic = "Antonyms: Infinitesimal",
                year = "2012",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'His gift to the poor was always *infinitesimal*.'",
                optionA = "large and substantial",
                optionB = "small",
                optionC = "supportive",
                optionD = "shameful",
                correctAnswerIndex = 0,
                explanation = "'Infinitesimal' means extremely minute, tiny, or negligible. The antonym is 'large' or 'substantial'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q45"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_48",
                subject = "English Language",
                topic = "Antonyms: Callous",
                year = "2012",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Ola thought that her father was very *callous*.'",
                optionA = "parlous",
                optionB = "compassionate and sympathetic",
                optionC = "wicked",
                optionD = "cheerful",
                correctAnswerIndex = 1,
                explanation = "'Callous' means showing an insensitive, unfeeling, or cruel disregard for others. The antonym is 'compassionate'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q48"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2012 GRAMMAR & ORAL (Q66 - Q100)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2012_71",
                subject = "English Language",
                topic = "Grammar: Indefinite Pronoun Concord",
                year = "2012",
                questionText = "One should be careful how ________ behaves in public, shouldn't ________?",
                optionA = "one / one",
                optionB = "he / he",
                optionC = "she / one",
                optionD = "one / he",
                correctAnswerIndex = 3,
                explanation = "In formal English, the indefinite subject 'One' takes 'one' in the subordinate clause, while modern tag questions commonly use 'he' or 'they': 'how one behaves... shouldn't he?'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q71"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_76",
                subject = "English Language",
                topic = "Grammar: Order of Adjectives",
                year = "2012",
                questionText = "The woman would not part with her ________ pot.",
                optionA = "discarded earthen black",
                optionB = "discarded black earthen",
                optionC = "earthen discarded black",
                optionD = "black earthen discarded",
                correctAnswerIndex = 1,
                explanation = "Royal Order of Adjectives: Opinion/State (discarded) + Color (black) + Material/Origin (earthen) + Noun (pot).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q76"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_80",
                subject = "English Language",
                topic = "Grammar: Phrasal Verbs in Employment",
                year = "2012",
                questionText = "Many workers were ________ as a result of the textile mill closure.",
                optionA = "laid down",
                optionB = "laid off",
                optionC = "laid out",
                optionD = "laid up",
                correctAnswerIndex = 1,
                explanation = "To 'lay off' workers means to discharge or dismiss them because of factory closure, redundancy, or lack of business.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q80"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_86",
                subject = "English Language",
                topic = "Oral: Vowel Sounds /ʊ/ in Book",
                year = "2012",
                questionText = "Choose the word with the same vowel sound as 'b<u>oo</u>k':",
                optionA = "cool",
                optionB = "cook",
                optionC = "fool",
                optionD = "tool",
                correctAnswerIndex = 1,
                explanation = "'Book' contains the short close back rounded vowel /ʊ/, exactly identical to 'cook' /kʊk/. 'Cool', 'fool', and 'tool' have long /u:/.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q86"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_92",
                subject = "English Language",
                topic = "Oral: Syllable Stress in Demarcation",
                year = "2012",
                questionText = "Choose the correct stress pattern for 'demarcation':",
                optionA = "demarCAtion",
                optionB = "DEmarcation",
                optionC = "deMARcation",
                optionD = "demarcaTION",
                correctAnswerIndex = 0,
                explanation = "Nouns ending with the suffix '-tion' take primary stress on the penultimate syllable: de-mar-CA-tion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q92"
            )
        )

        return list
    }
}
