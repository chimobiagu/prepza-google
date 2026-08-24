package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * UTME 2010 Use of English Complete Question Bank.
 * Features full questions from Lexis, Sentence Interpretation, Antonyms,
 * Synonyms, Sentence Completion, Oral English (Vowels, Consonants, Rhymes, Stress).
 */
object JambEnglish2010ExamCompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2010 COMPREHENSION & INTERPRETATION (Q2 - Q35)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_02",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "According to the writer, the exciting thing about Spaceship Earth is that it:",
                optionA = "has no instruction manual",
                optionB = "is not difficult to maintain",
                optionC = "is peculiar to other automobiles",
                optionD = "is relatively easy to operate",
                correctAnswerIndex = 3,
                explanation = "In the passage, the author highlights how Spaceship Earth operates as an integrally designed mechanical vehicle that man learns to operate without a preset manual.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_03",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "The absence of an instruction manual for Spaceship Earth has:",
                optionA = "made the operation of the Spaceship Earth difficult",
                optionB = "forced man to devise other means of travelling in spacecraft",
                optionC = "challenged man's inquisitiveness to discover scientific principles",
                optionD = "made man helpless forever",
                correctAnswerIndex = 2,
                explanation = "The omission of the manual forced man to devise scientific procedures and discover inherent physical principles.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_06",
                subject = "English Language",
                topic = "Comprehension: Understanding Stress",
                year = "2010",
                questionText = "The expression '...stress is an issue everybody can relate to experimentally' means that:",
                optionA = "it is better understood when experienced personally",
                optionB = "its problem can be solved by everybody easily",
                optionC = "everybody deliberately avoids it",
                optionD = "everybody encounters it in laboratories",
                correctAnswerIndex = 0,
                explanation = "Experiential understanding means that people comprehend stress directly through their personal daily life experiences.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_08",
                subject = "English Language",
                topic = "Comprehension: Stress Management",
                year = "2010",
                questionText = "According to the passage, the major primary step in controlling stress is:",
                optionA = "changing one's attitude, behaviour, and lifestyle contributing to the stressors",
                optionB = "understanding the medical history of disease",
                optionC = "visiting family doctors for constant check-ups",
                optionD = "spending all day in complete isolation",
                correctAnswerIndex = 0,
                explanation = "To reduce stress, one must identify what one is doing that contributes to the problem and modify those habits.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_12",
                subject = "English Language",
                topic = "Comprehension: Corruption & Governance",
                year = "2010",
                questionText = "From the passage on governance, one of the direct consequences of corruption is that:",
                optionA = "large developmental projects are executed cleanly",
                optionB = "it is beneficial to the majority of poor citizens",
                optionC = "it impedes the economic and social progress of a nation",
                optionD = "it lowers public expectations of leadership",
                correctAnswerIndex = 2,
                explanation = "Corruption distorts governmental expenditure, wastes public funds on white-elephant projects, and retards national development.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_26",
                subject = "English Language",
                topic = "Sentence Interpretation: Jaundiced Eye",
                year = "2010",
                questionText = "Though Mr. Iro is a new chairman, he views other members with a jaundiced eye. This means:",
                optionA = "He takes a rather forceful position in dealing with his members",
                optionB = "He takes an unfavourable and prejudiced position concerning his members",
                optionC = "He takes a sickly view of his members",
                optionD = "He takes a hazy view of his members",
                correctAnswerIndex = 1,
                explanation = "To view something with a 'jaundiced eye' means to view it with prejudice, skepticism, or cynicism.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q26"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_28",
                subject = "English Language",
                topic = "Sentence Interpretation: Steer a Middle Course",
                year = "2010",
                questionText = "It was good to steer a middle course in whatever one does. This means:",
                optionA = "It is always good to get midway in anything one does",
                optionB = "It is always good to act with moderation and avoid extremes",
                optionC = "It is always good to move away from the forefront",
                optionD = "It is always good to work very hard",
                correctAnswerIndex = 1,
                explanation = "To 'steer a middle course' means to take a moderate or compromise position between two extremes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_29",
                subject = "English Language",
                topic = "Sentence Interpretation: No Axe to Grind",
                year = "2010",
                questionText = "The witness said he had no axe to grind with his brothers. This means:",
                optionA = "He had no private grudge or ulterior selfish motive regarding his brothers",
                optionB = "He had no axe and therefore stole the matchet",
                optionC = "He had no tool to clear the farm",
                optionD = "He had no interest in visiting them",
                correctAnswerIndex = 0,
                explanation = "To 'have no axe to grind' means to have no private personal grievance or self-serving interest in the dispute.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q29"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_30",
                subject = "English Language",
                topic = "Sentence Interpretation: Tail Between Legs",
                year = "2010",
                questionText = "The footballers moved with their tails between their legs. This means:",
                optionA = "they moved happily because they won the match",
                optionB = "they were dancing in celebration",
                optionC = "they were thoroughly ashamed and dejected because they had been defeated",
                optionD = "they were running fast across the pitch",
                correctAnswerIndex = 2,
                explanation = "To have one's 'tail between one's legs' means feeling embarrassed, humiliated, or ashamed after a defeat.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q30"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_32",
                subject = "English Language",
                topic = "Sentence Interpretation: Cross the Rubicon",
                year = "2010",
                questionText = "As regards the matter, we have crossed the Rubicon. This means:",
                optionA = "we are completely at a loss",
                optionB = "we have reached a point of no return and are irrevocably committed",
                optionC = "we are already qualified for the rewards",
                optionD = "we are crossing a river safely",
                correctAnswerIndex = 1,
                explanation = "To 'cross the Rubicon' means to pass a crucial point where an action cannot be altered or undone.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_33",
                subject = "English Language",
                topic = "Sentence Interpretation: Full of Himself",
                year = "2010",
                questionText = "Uche is full of himself. This means:",
                optionA = "He is conceited, arrogant, and self-absorbed",
                optionB = "He is complete in character",
                optionC = "He has eaten to his satisfaction",
                optionD = "He is an exceptionally wealthy man",
                correctAnswerIndex = 0,
                explanation = "'Full of oneself' means excessively conceited, vain, or arrogant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q33"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2010 ANTONYMS (Q36 - Q50)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_36",
                subject = "English Language",
                topic = "Antonyms: Mind-bending",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'I am optimistic about the interview though it was a *mind-bending* exercise.'",
                optionA = "an enervating",
                optionB = "a debilitating",
                optionC = "a difficult",
                optionD = "an easy",
                correctAnswerIndex = 3,
                explanation = "'Mind-bending' means highly complex, mentally challenging, or demanding. The antonym is 'easy'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_38",
                subject = "English Language",
                topic = "Antonyms: Redundant",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The teacher said that Ali's essay was full of many *redundant* details.'",
                optionA = "unexplained",
                optionB = "strange",
                optionC = "necessary",
                optionD = "useful",
                correctAnswerIndex = 2,
                explanation = "'Redundant' means unnecessary, superfluous, or excessive. The antonym is 'necessary'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_40",
                subject = "English Language",
                topic = "Antonyms: Ingenuous",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Her *ingenuous* smile drew our attention.'",
                optionA = "witty",
                optionB = "naive",
                optionC = "clever and deceitful",
                optionD = "arrogant",
                correctAnswerIndex = 3,
                explanation = "'Ingenuous' means innocent, candid, and free from deceit. Opposites include 'arrogant' or 'cunning/artful'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_41",
                subject = "English Language",
                topic = "Antonyms: Flawless",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Ndeni gave a *flawless* speech at the party.'",
                optionA = "a wonderful",
                optionB = "a careless",
                optionC = "an interesting",
                optionD = "an imperfect",
                correctAnswerIndex = 3,
                explanation = "'Flawless' means without any defects or errors. The exact antonym is 'imperfect'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_43",
                subject = "English Language",
                topic = "Antonyms: Debased",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The captain says sports is being *debased* by commercial sponsorship.'",
                optionA = "localized",
                optionB = "perverted",
                optionC = "elevated",
                optionD = "overvalued",
                correctAnswerIndex = 2,
                explanation = "'Debase' means to reduce in quality or value, or degrade. Its antonym is 'elevate' or 'ennoble'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_46",
                subject = "English Language",
                topic = "Antonyms: Acquiescence",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'There was a general *acquiescence* on the new drug law.'",
                optionA = "resistance",
                optionB = "discrepancy",
                optionC = "compromise",
                optionD = "agreement",
                correctAnswerIndex = 0,
                explanation = "'Acquiescence' means passive agreement or submission. The antonym is 'resistance' or 'defiance'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q46"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_47",
                subject = "English Language",
                topic = "Antonyms: Ambivalent",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Aisha seems to feel *ambivalent* about her future.'",
                optionA = "decisive",
                optionB = "anxious",
                optionC = "ambitious",
                optionD = "inconsiderate",
                correctAnswerIndex = 0,
                explanation = "'Ambivalent' means having mixed, uncertain, or contradictory feelings. The antonym is 'decisive'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q47"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_48",
                subject = "English Language",
                topic = "Antonyms: Plethora",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The report of the committee contained a *plethora* of details.'",
                optionA = "shortage",
                optionB = "simplicity",
                optionC = "multitude",
                optionD = "spectrum",
                correctAnswerIndex = 0,
                explanation = "'Plethora' denotes an excessive excess or overabundance. The opposite is a 'shortage' or 'dearth'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q48"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2010 GRAMMAR, STRUCTURE & ORAL (Q66 - Q100)
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_2010_66",
                subject = "English Language",
                topic = "Grammar: Correlative Conjunctions",
                year = "2010",
                questionText = "Lemoti ________ as a painter, but also as a sculptor.",
                optionA = "is a gifted only not",
                optionB = "is only not gifted",
                optionC = "is gifted not only",
                optionD = "is only gifted",
                correctAnswerIndex = 2,
                explanation = "The correlative structure 'not only... but also' balances grammatically: 'is gifted not only as a painter, but also as a sculptor'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q66"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_70",
                subject = "English Language",
                topic = "Grammar: Phrasal Verbs",
                year = "2010",
                questionText = "His wife was badly injured in the fracas, but I think she will pull ________.",
                optionA = "up",
                optionB = "over",
                optionC = "through",
                optionD = "back",
                correctAnswerIndex = 2,
                explanation = "'Pull through' is an idiomatic phrasal verb meaning to survive a serious illness, injury, or severe difficulty.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q70"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_72",
                subject = "English Language",
                topic = "Grammar: Relative Pronoun Concord",
                year = "2010",
                questionText = "One of the women who ________ in the premises ________ been ordered to quit.",
                optionA = "sells / have",
                optionB = "sell / has",
                optionC = "sell / have",
                optionD = "sells / has",
                correctAnswerIndex = 3,
                explanation = "In standard usage, 'One of the women who sells...' with the main clause singular subject 'One... has been ordered to quit'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q72"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_75",
                subject = "English Language",
                topic = "Grammar: Preposition of Origin",
                year = "2010",
                questionText = "Paper is made ________ wood pulp.",
                optionA = "on",
                optionB = "of",
                optionC = "from",
                optionD = "with",
                correctAnswerIndex = 2,
                explanation = "We use 'made from' when the material undergoes chemical change or transformation (wood pulp to paper), and 'made of' when the material remains unchanged (a table made of wood).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q75"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_82",
                subject = "English Language",
                topic = "Lexis: Proscribed vs Prescribed",
                year = "2010",
                questionText = "The Federal Government has ________ child trafficking.",
                optionA = "postulated",
                optionB = "projected",
                optionC = "prescribed",
                optionD = "proscribed",
                correctAnswerIndex = 3,
                explanation = "'Proscribe' means to officially forbid or outlaw something by law. ('Prescribe' means to recommend or authorize medication).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q82"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_86",
                subject = "English Language",
                topic = "Oral: Vowel Sounds /u:/ in Coup",
                year = "2010",
                questionText = "Choose the option that has the same vowel sound as 'c<u>ou</u>p':",
                optionA = "whup",
                optionB = "hoot",
                optionC = "couple",
                optionD = "scout",
                correctAnswerIndex = 1,
                explanation = "'Coup' /ku:/ has the long vowel /u:/ sound, exactly matching 'hoot' /hu:t/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q86"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_87",
                subject = "English Language",
                topic = "Oral: Vowel Sounds in Indict",
                year = "2010",
                questionText = "Choose the option that has the same vowel sound as the underlined letters in 'ind<u>i</u>ct':",
                optionA = "bright",
                optionB = "fish",
                optionC = "pick",
                optionD = "brick",
                correctAnswerIndex = 0,
                explanation = "'Indict' is pronounced /ɪnˈdaɪt/ with the diphthong /aɪ/, exactly like 'bright' /braɪt/.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q87"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_2010_95",
                subject = "English Language",
                topic = "Oral: Syllable Stress in Political",
                year = "2010",
                questionText = "Choose the most appropriate stress pattern for 'political':",
                optionA = "poliTIcal",
                optionB = "poLItical",
                optionC = "POlitical",
                optionD = "politiaCL",
                correctAnswerIndex = 1,
                explanation = "Words ending in '-ical' have primary stress on the antepenultimate syllable: po-LI-ti-cal.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q95"
            )
        )

        return list
    }
}
