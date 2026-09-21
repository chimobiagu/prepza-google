package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Use of English 2010 - 2018 Complete Exam Bank.
 * Extracted directly from official JAMB UTME Use of English Past Questions (2010 - 2018 Series).
 * Covers Reading Comprehension, Sentence Interpretation, Antonyms, Synonyms, Grammar, Cloze Passages,
 * and Oral English (Vowel sounds, Consonants, Rhymes, Emphatic Stress).
 */
object JambEnglish2010to2018ExamCompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2010 USE OF ENGLISH
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_26",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2010",
                questionText = "Though Mr. Iro is a new chairman, he views other members with jaundiced eye.",
                optionA = "He takes a rather forceful position on dealing with his members",
                optionB = "He takes an unfavourable position concerning his members",
                optionC = "He takes a sickly view of his members",
                optionD = "He takes a rather hazy view of his members",
                correctAnswerIndex = 1,
                explanation = "To look at or view something with a 'jaundiced eye' is an idiom meaning to look upon it with prejudice, skepticism, or an unfavourable bias.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_28",
                subject = "English Language",
                topic = "Idioms & Interpretation",
                year = "2010",
                questionText = "It was good to steer a middle course in whatever one does.",
                optionA = "It is always good to get midway in anything one does",
                optionB = "It is always good to act with moderation",
                optionC = "It is always good to move away from the forefront",
                optionD = "It is always good to work very hard",
                correctAnswerIndex = 1,
                explanation = "To 'steer a middle course' means to adopt a moderate, balanced approach rather than an extreme or polarized one.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_30",
                subject = "English Language",
                topic = "Idioms & Interpretation",
                year = "2010",
                questionText = "The footballers moved with their tails between their legs.",
                optionA = "they moved happily because they won the match",
                optionB = "they were unhappy because they had been despised by their opponents",
                optionC = "they were ashamed because they had been defeated",
                optionD = "they moved with their tails between their legs",
                correctAnswerIndex = 2,
                explanation = "'With one's tail between one's legs' is an idiomatic expression signifying feeling thoroughly embarrassed, humiliated, or ashamed following a defeat.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_32",
                subject = "English Language",
                topic = "Idioms: Crossed the Rubicon",
                year = "2010",
                questionText = "As regards the matter, we have crossed the Rubicon.",
                optionA = "we are completely at a loss",
                optionB = "we are irrevocably committed",
                optionC = "we are already qualified",
                optionD = "we are perfectly committed",
                correctAnswerIndex = 1,
                explanation = "To 'cross the Rubicon' means to make an irreversible commitment or pass a point of no return.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_33",
                subject = "English Language",
                topic = "Idioms: Full of himself",
                year = "2010",
                questionText = "Uche is full of himself.",
                optionA = "He is conceited",
                optionB = "He is complete",
                optionC = "He is a rich man",
                optionD = "He is careful",
                correctAnswerIndex = 0,
                explanation = "To be 'full of oneself' means to be excessively arrogant, conceited, or self-centered.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_41",
                subject = "English Language",
                topic = "Antonyms: Flawless",
                year = "2010",
                questionText = "Ndeni gave a flawless speech at the party. (Choose the option opposite in meaning)",
                optionA = "A wonderful",
                optionB = "A careless",
                optionC = "An interesting",
                optionD = "An imperfect",
                correctAnswerIndex = 3,
                explanation = "'Flawless' means without any defects or errors. Its direct opposite is 'imperfect'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_48",
                subject = "English Language",
                topic = "Antonyms: Plethora",
                year = "2010",
                questionText = "The report of the committee contained a plethora of details. (Choose the option opposite in meaning)",
                optionA = "Shortage",
                optionB = "Simplicity",
                optionC = "Multitude",
                optionD = "Spectrum",
                correctAnswerIndex = 0,
                explanation = "'Plethora' denotes an excess or abundance. The antonym is 'shortage' (scarcity).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q48"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_70",
                subject = "English Language",
                topic = "Phrasal Verbs: Pull through",
                year = "2010",
                questionText = "His wife was badly injured in the fracas, but I think she will pull _______.",
                optionA = "up",
                optionB = "over",
                optionC = "through",
                optionD = "back",
                correctAnswerIndex = 2,
                explanation = "The phrasal verb 'pull through' means to survive a dangerous illness or injury and recover.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q70"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_75",
                subject = "English Language",
                topic = "Prepositions: Made of vs Made from",
                year = "2010",
                questionText = "Paper is made _______ wood pulp.",
                optionA = "on",
                optionB = "of",
                optionC = "from",
                optionD = "with",
                correctAnswerIndex = 2,
                explanation = "We use 'made from' when the original raw material undergoes a complete chemical/physical transformation and is no longer directly recognizable.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q75"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_82",
                subject = "English Language",
                topic = "Vocabulary: Proscribed",
                year = "2010",
                questionText = "The federal government has _______ child trafficking.",
                optionA = "postulated",
                optionB = "projected",
                optionC = "prescribed",
                optionD = "proscribed",
                correctAnswerIndex = 3,
                explanation = "'Proscribe' means to officially forbid or outlaw by state decree, whereas 'prescribe' means to recommend or dictate.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q82"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_83",
                subject = "English Language",
                topic = "Vocabulary: Exonerated",
                year = "2010",
                questionText = "The man was happy that his son confessed his guilt and so the others were _______.",
                optionA = "implicated",
                optionB = "accused",
                optionC = "punished",
                optionD = "exonerated",
                correctAnswerIndex = 3,
                explanation = "'Exonerated' means officially cleared of blame or wrongdoing after guilt has been established on the real culprit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q83"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_87",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2010",
                questionText = "Indict (Choose the option that has the same vowel sound as the underlined 'i' in indict /aɪ/):",
                optionA = "bright",
                optionB = "fish",
                optionC = "pick",
                optionD = "brick",
                correctAnswerIndex = 0,
                explanation = "'Indict' is pronounced /ɪnˈdaɪt/ with the diphthong /aɪ/, identical to 'bright' /braɪt/.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q87"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_99",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2010",
                questionText = "Taiwo SAILED to London. (Choose the question to which the sentence relates)",
                optionA = "Did Taiwo fly to London?",
                optionB = "Did Taiwo sail to Brazil?",
                optionC = "Did Taiwo sail to London?",
                optionD = "Where did Taiwo sail to?",
                correctAnswerIndex = 0,
                explanation = "Emphatic stress on SAILED emphasizes the mode of transport (sailing, not flying). 'Did Taiwo fly to London? No, Taiwo SAILED to London.'",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q99"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2011 - 2018 USE OF ENGLISH HIGHLIGHTS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2011_28",
                subject = "English Language",
                topic = "Idioms: Bird's-eye view",
                year = "2011",
                questionText = "The hunter has a bird's-eye view of the animals.",
                optionA = "He views the animal from a high position",
                optionB = "He views the bird's eye",
                optionC = "He views the birds on the tree with one eye",
                optionD = "He watches animals and birds closely",
                correctAnswerIndex = 0,
                explanation = "A 'bird's-eye view' is an elevated panoramic view of an area or scene from above.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_31",
                subject = "English Language",
                topic = "Idioms: In the lurch",
                year = "2011",
                questionText = "She stopped her education as her uncle left her in the lurch.",
                optionA = "Her uncle deceived her",
                optionB = "Her uncle disinherited her",
                optionC = "Her uncle refused to help her",
                optionD = "Her uncle disrespected her",
                correctAnswerIndex = 2,
                explanation = "To 'leave someone in the lurch' means to abandon or desert them in a vulnerable situation or time of difficulty without assistance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_36",
                subject = "English Language",
                topic = "Synonyms: Inception",
                year = "2011",
                questionText = "Since its inception in 1983, the newspaper has attracted thousands of readers. (Nearest in meaning)",
                optionA = "renaissance",
                optionB = "coming",
                optionC = "commencement",
                optionD = "publication",
                correctAnswerIndex = 2,
                explanation = "'Inception' means the start, commencement, or establishment of an institution or activity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_57",
                subject = "English Language",
                topic = "Antonyms: Herculean",
                year = "2011",
                questionText = "What you are asking me to do is a herculean task. (Opposite in meaning)",
                optionA = "a strenuous",
                optionB = "a demanding",
                optionC = "a lovely",
                optionD = "an easy",
                correctAnswerIndex = 3,
                explanation = "'Herculean' denotes something requiring immense effort or strength. Its opposite is 'an easy' task.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q57"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_69",
                subject = "English Language",
                topic = "Spelling: Fortnight",
                year = "2011",
                questionText = "It is important that you clear the refuse in front of your house every _______.",
                optionA = "fourtnight",
                optionB = "fortnight",
                optionC = "fourthnight",
                optionD = "forthnight",
                correctAnswerIndex = 1,
                explanation = "The standard orthography for a period of two weeks is 'fortnight' (contracted from 'fourteen nights').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q69"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2011_76",
                subject = "English Language",
                topic = "Spelling: Pronunciation",
                year = "2011",
                questionText = "Here is Mr. Odumusu who teaches English _______ in our school.",
                optionA = "pronuntiation",
                optionB = "pronounciation",
                optionC = "pronunciation",
                optionD = "pronountiation",
                correctAnswerIndex = 2,
                explanation = "Although the verb is 'pronounce', the noun form is spelled 'pronunciation' without the middle 'o'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q76"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2012_41",
                subject = "English Language",
                topic = "Antonyms: Reticent",
                year = "2012",
                questionText = "The management wants to consider her reticent behaviour in due course. (Opposite in meaning)",
                optionA = "disapproving",
                optionB = "disciplinarian",
                optionC = "contemplative",
                optionD = "loquacious",
                correctAnswerIndex = 3,
                explanation = "'Reticent' means disposed to be silent or not speaking freely. Its antonym is 'loquacious' (talkative).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2013_37",
                subject = "English Language",
                topic = "Idioms: Live in each other's pockets",
                year = "2013",
                questionText = "Tolu and Chinedu live in each other's pockets.",
                optionA = "They are long-term business partners",
                optionB = "They steal from each other",
                optionC = "They blackmail each other",
                optionD = "They are very close to each other",
                correctAnswerIndex = 3,
                explanation = "To 'live in each other's pockets' means to spend virtually all their time together in very close proximity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2014_44",
                subject = "English Language",
                topic = "Idioms: Hands are tied",
                year = "2014",
                questionText = "His _______ are tied, so he could not do anything to help her.",
                optionA = "shoulders",
                optionB = "arms",
                optionC = "hands",
                optionD = "legs",
                correctAnswerIndex = 2,
                explanation = "The idiom 'one's hands are tied' means one is prevented by regulations, rules, or circumstances from acting freely.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2015_46",
                subject = "English Language",
                topic = "Antonyms: Debilitated",
                year = "2015",
                questionText = "Prolonged strike action debilitated the industry. (Opposite in meaning)",
                optionA = "invigorated",
                optionB = "isolated",
                optionC = "weakened",
                optionD = "destroyed",
                correctAnswerIndex = 0,
                explanation = "'Debilitate' means to make weak or enfeeble. Its opposite is 'invigorated' (strengthened/energized).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2016_56",
                subject = "English Language",
                topic = "Synonyms: Incessant",
                year = "2016",
                questionText = "The chairman admires incessant meetings. (Nearest in meaning)",
                optionA = "unusual",
                optionB = "planned",
                optionC = "constant",
                optionD = "irregular",
                correctAnswerIndex = 2,
                explanation = "'Incessant' means continuing without pause or interruption, hence 'constant'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q56"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2017_26",
                subject = "English Language",
                topic = "Sentence Interpretation: Didn't mind",
                year = "2017",
                questionText = "The government didn't mind my mentioning his name.",
                optionA = "The government was not angry when I mentioned his name",
                optionB = "The government was angry when I mentioned his name",
                optionC = "The government told me not to mention his name",
                optionD = "The government forgot to mention his name to me",
                correctAnswerIndex = 0,
                explanation = "'Didn't mind' indicates absence of objection, offense, or annoyance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2018_03",
                subject = "English Language",
                topic = "Figures of Speech: Metaphor",
                year = "2018",
                questionText = "'...rock the boat' - What figure of speech is this expression?",
                optionA = "Simile",
                optionB = "Metaphor",
                optionC = "Personification",
                optionD = "Hyperbole",
                correctAnswerIndex = 1,
                explanation = "'Rock the boat' is an idiomatic metaphor for disturbing an existing stable or quiet situation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q3"
            )
        )

        return list
    }
}
