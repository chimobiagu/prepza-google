package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Full Cleaned & Verified JAMB Use of English Master Revision Table (2010 - 2018 Complete Series).
 * Standardized with 4 options (A-D), verified 0-indexed answers, official JAMB exam years, and detailed pedagogical explanations.
 */
object JambEnglishMasterRevisionFullBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 2010 Series
        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_02",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "According to the writer, the exciting thing about Spaceship Earth is that it:",
                optionA = "has no instruction manual",
                optionB = "it is not difficult to maintain",
                optionC = "is peculiar to other automobiles",
                optionD = "is relatively easy to operate",
                correctAnswerIndex = 0,
                explanation = "The passage notes that unlike automobiles, Spaceship Earth did not come with an instruction manual, making its operation a challenge to human inquisitiveness.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_03",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "The absence of an instruction manual in Spaceship Earth has:",
                optionA = "made the operation of the Spaceship Earth difficult",
                optionB = "forced man to devise other means of travelling in spacecraft",
                optionC = "challenged man’s inquisitiveness",
                optionD = "made man helpless",
                correctAnswerIndex = 2,
                explanation = "Without a manual, humans must figure out how the planet works on their own, which directly stimulates and challenges human intellect and inquisitiveness.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_15",
                subject = "English Language",
                topic = "Comprehension: Fighting Corruption",
                year = "2010",
                questionText = "The essence of fighting corruption, according to the passage, is to:",
                optionA = "send the corrupt to jail",
                optionB = "promote good governance",
                optionC = "punish corrupt politicians",
                optionD = "make people richer",
                correctAnswerIndex = 1,
                explanation = "The writer highlights that anti-corruption efforts are ultimately designed to establish and promote sustainable good governance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_26",
                subject = "English Language",
                topic = "Idioms: Jaundiced eye",
                year = "2010",
                questionText = "Though Mr. Iro is a new chairman, he views other members with a jaundiced eye.",
                optionA = "He takes a rather forceful position on dealing with his members",
                optionB = "He looks at them with prejudice and suspicion",
                optionC = "He is very happy with his members",
                optionD = "He is suffering from a yellow fever",
                correctAnswerIndex = 1,
                explanation = "To look at something with a 'jaundiced eye' is an idiom meaning to view it with prejudice, skepticism, or suspicion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_36",
                subject = "English Language",
                topic = "Antonyms: Mind-bending",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'I am optimistic about the interview though it was a mind-bending exercise.'",
                optionA = "An enervating",
                optionB = "A debilitating",
                optionC = "A difficult",
                optionD = "An easy",
                correctAnswerIndex = 3,
                explanation = "A 'mind-bending' exercise is extremely complex or difficult. Its direct antonym is 'easy'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_52",
                subject = "English Language",
                topic = "Synonyms: Enthusiastic",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'We were all enthusiastic as we awaited the result of the election.'",
                optionA = "bemused",
                optionB = "agitated",
                optionC = "elated",
                optionD = "nervous",
                correctAnswerIndex = 2,
                explanation = "Enthusiastic here matches 'elated' (excited, joyful, or full of positive anticipation).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q52"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_66",
                subject = "English Language",
                topic = "Correlative Conjunctions: Not only",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'Lemoti _____ as a painter, but also as a sculptor.'",
                optionA = "is a gifted only not",
                optionB = "is only not gifted",
                optionC = "is gifted not only",
                optionD = "is only gifted",
                correctAnswerIndex = 2,
                explanation = "The correlative conjunction structure is 'not only... but also'. Therefore, 'is gifted not only' is grammatically correct.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q66"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_71",
                subject = "English Language",
                topic = "Subject-Verb Agreement: A wide range",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'A wide range of options _____ made available to students in the final year last year.'",
                optionA = "is",
                optionB = "were",
                optionC = "are",
                optionD = "was",
                correctAnswerIndex = 3,
                explanation = "The subject is 'A wide range' (singular noun phrase), and the sentence refers to 'last year' (past tense). Thus, 'was' is the correct verb.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q71"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_76",
                subject = "English Language",
                topic = "Tenses: Past Perfect",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'Long after everyone _____ the hall, Obi still sat inside.'",
                optionA = "left",
                optionB = "is leaving",
                optionC = "has left",
                optionD = "had left",
                correctAnswerIndex = 3,
                explanation = "The past perfect tense 'had left' represents an action completed before another past action (Obi sitting inside).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q76"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_77",
                subject = "English Language",
                topic = "Nouns: Plural Possessive",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'They are the _____ dresses.'",
                optionA = "babys’",
                optionB = "baby",
                optionC = "babies",
                optionD = "babies’",
                correctAnswerIndex = 3,
                explanation = "The plural possessive for 'babies' is 'babies'', representing dresses belonging to more than one baby.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q77"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_78",
                subject = "English Language",
                topic = "Prepositions: In Exile",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'The politician was sent _____ exile.'",
                optionA = "onto",
                optionB = "into",
                optionC = "on",
                optionD = "to",
                correctAnswerIndex = 1,
                explanation = "The idiomatic expression is to be 'sent into exile'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q78"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_79",
                subject = "English Language",
                topic = "Vocabulary: Homophones Site vs Sight",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'When we looked up, we _____ the plane some miles away.'",
                optionA = "site",
                optionB = "cited",
                optionC = "sited",
                optionD = "sighted",
                correctAnswerIndex = 3,
                explanation = "'Sighted' means to have managed to see or catch sight of a distant object (like a plane).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q79"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2010_80",
                subject = "English Language",
                topic = "Nouns & Idioms: Word of mouth",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'Vital _____ is still spread _____ word of mouth in most villages.'",
                optionA = "information/from",
                optionB = "information/with",
                optionC = "information/by",
                optionD = "information/of",
                correctAnswerIndex = 2,
                explanation = "The noun 'information' is uncountable, and news/gossip is spread 'by' word of mouth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q80"
            )
        )

        // 2011 Series
        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_52",
                subject = "English Language",
                topic = "Antonyms: Mercenary",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'His father served as a mercenary in the army.'",
                optionA = "preacher",
                optionB = "regular",
                optionC = "recruit",
                optionD = "officer",
                correctAnswerIndex = 1,
                explanation = "A 'mercenary' is a soldier hired to fight for a foreign country. The antonym is a 'regular' national soldier.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q52"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_53",
                subject = "English Language",
                topic = "Antonyms: Cruel",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Jummai is cruel to her husband.'",
                optionA = "harsh",
                optionB = "brutal",
                optionC = "kind",
                optionD = "passionate",
                correctAnswerIndex = 2,
                explanation = "The opposite of 'cruel' is 'kind'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q53"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_64",
                subject = "English Language",
                topic = "Antonyms: Antipathy",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'His antipathy affected the growth of his business.'",
                optionA = "hatred",
                optionB = "receptiveness",
                optionC = "loyalty",
                optionD = "hostility",
                correctAnswerIndex = 1,
                explanation = "'Antipathy' means a deep-seated feeling of dislike or hostility. Its opposite is 'receptiveness' or warmth.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q64"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_65",
                subject = "English Language",
                topic = "Antonyms: Lethal",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Okonkwo’s lethal right foot did the magic in the football match.'",
                optionA = "Weak",
                optionB = "wicked",
                optionC = "fat",
                optionD = "harmless",
                correctAnswerIndex = 3,
                explanation = "'Lethal' means deadly or highly destructive. The opposite is 'harmless'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q65"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_67",
                subject = "English Language",
                topic = "Habitual Past: Used to",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'Lami’s father _____ as a gardener when he was young, but now he is a driver.'",
                optionA = "had been working",
                optionB = "use to work",
                optionC = "has worked",
                optionD = "used to work",
                correctAnswerIndex = 3,
                explanation = "'Used to work' is the correct past habit marker. 'Use to work' is grammatically incorrect in this context.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q67"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_68",
                subject = "English Language",
                topic = "Conjunctions: Whenever",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'_____ he switches on the light, the shadow disappears.'",
                optionA = "whenever",
                optionB = "except",
                optionC = "since",
                optionD = "until",
                correctAnswerIndex = 0,
                explanation = "'Whenever' is an adverbial conjunction indicating a conditional or repeated action that triggers the disappearing shadow.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q68"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_69",
                subject = "English Language",
                topic = "Spelling: Fortnight",
                year = "2011",
                questionText = "Choose the correct spelling:\n'It is important that you clear the refuse in front of your house every _____.'",
                optionA = "fourtnight",
                optionB = "fortnight",
                optionC = "fourthnight",
                optionD = "forthnight",
                correctAnswerIndex = 1,
                explanation = "The correct spelling of the noun meaning a period of two weeks is 'fortnight'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q69"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_72",
                subject = "English Language",
                topic = "Vocabulary: Scour",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'Unoka _____ the whole house to find his missing wristwatch.'",
                optionA = "scourged",
                optionB = "scoured",
                optionC = "scored",
                optionD = "scouted",
                correctAnswerIndex = 1,
                explanation = "To 'scour' means to search a place or thing thoroughly and systematically.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q72"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_73",
                subject = "English Language",
                topic = "Reported Speech: Questions",
                year = "2011",
                questionText = "Choose the correct indirect question:\n'Ife asked me _____.'",
                optionA = "what time it was",
                optionB = "what is it by my time",
                optionC = "what time is it",
                optionD = "what time it is",
                correctAnswerIndex = 0,
                explanation = "In indirect speech, questions follow the statement word order (subject + verb) and shift back in tense ('what time it was').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q73"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_74",
                subject = "English Language",
                topic = "Spelling: Eclectic",
                year = "2011",
                questionText = "Choose the correct spelling:\n'There are many ways to kill a rat, so we should be _____ in our approach to the task.'",
                optionA = "ecletic",
                optionB = "eclectic",
                optionC = "ecleKtic",
                optionD = "eclectiK",
                correctAnswerIndex = 1,
                explanation = "The correct spelling is 'eclectic', which means deriving ideas, style, or taste from a broad and diverse range of sources.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q74"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_75",
                subject = "English Language",
                topic = "Idioms: In furtherance of",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'Audu took these actions purely _____ his own career.'",
                optionA = "on furtherance of",
                optionB = "in furtherance of",
                optionC = "to furtherance in",
                optionD = "in furtherance with",
                correctAnswerIndex = 1,
                explanation = "The correct idiomatic prepositional phrase is 'in furtherance of', meaning to advance or promote a cause.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q75"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_77",
                subject = "English Language",
                topic = "Gerunds: Instead of",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'Instead of _____ she lied.'",
                optionA = "pleading",
                optionB = "her to plead",
                optionC = "her pleading",
                optionD = "plead",
                correctAnswerIndex = 0,
                explanation = "The preposition 'instead of' must be followed by a gerund ('pleading').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q77"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_78",
                subject = "English Language",
                topic = "Adjectives: Superlative Degree",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'Of the three girls, Uka is the _____.'",
                optionA = "so much notorious",
                optionB = "notorious",
                optionC = "naught",
                optionD = "naughtiest",
                correctAnswerIndex = 3,
                explanation = "When comparing three or more entities, the superlative degree ('naughtiest') is required.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q78"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_79",
                subject = "English Language",
                topic = "Phrasal Verbs: Make up for",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'I wonder how he will _____ being absent from school for a long time.'",
                optionA = "make in",
                optionB = "make up",
                optionC = "make off",
                optionD = "make out",
                correctAnswerIndex = 1,
                explanation = "To 'make up' (often followed by 'for') is a phrasal verb meaning to compensate for a lack or lost time.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q79"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_80",
                subject = "English Language",
                topic = "Spelling & Homophones: Carrier",
                year = "2011",
                questionText = "Choose the correct spelling:\n'Please sit on the _____.'",
                optionA = "carier",
                optionB = "career",
                optionC = "carrier",
                optionD = "carrear",
                correctAnswerIndex = 2,
                explanation = "The device on a bicycle or vehicle used for carrying luggage is spelled 'carrier'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q80"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_81",
                subject = "English Language",
                topic = "Spelling: Seize",
                year = "2011",
                questionText = "Choose the correct spelling:\n'I want to _____ this chance to acquaint you with the latest development.'",
                optionA = "size",
                optionB = "seize",
                optionC = "sieze",
                optionD = "cease",
                correctAnswerIndex = 1,
                explanation = "The correct verb meaning to grab or take hold of an opportunity eagerly is 'seize'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q81"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_82",
                subject = "English Language",
                topic = "Idioms: Uphill task",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'Getting a well-paid job nowadays is an _____ task.'",
                optionA = "utmost",
                optionB = "upbeat",
                optionC = "uphill",
                optionD = "upfield",
                correctAnswerIndex = 2,
                explanation = "An 'uphill' task is an idiomatic expression representing a highly difficult or demanding challenge.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q82"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_83",
                subject = "English Language",
                topic = "Prepositions: Meddle in",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'The secretary has no right to _____ my affairs.'",
                optionA = "spy from",
                optionB = "meddle in",
                optionC = "toy at",
                optionD = "complain into",
                correctAnswerIndex = 1,
                explanation = "To 'meddle in' is the correct prepositional combination meaning to interfere or intrude in someone else's business.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q83"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_84",
                subject = "English Language",
                topic = "Verb Patterns: Avoid + Gerund",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'Bola studiously avoided _____ the question.'",
                optionA = "parrying",
                optionB = "answering",
                optionC = "projecting",
                optionD = "destroying",
                correctAnswerIndex = 1,
                explanation = "The verb 'avoid' requires a gerund ('answering') as its direct object.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q84"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_85",
                subject = "English Language",
                topic = "Articles & Determiners: A certain reason",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'The school authority dismissed him for _____ but I won’t tell you about it yet.'",
                optionA = "certain reason",
                optionB = "a reason",
                optionC = "more reason",
                optionD = "a certain reason",
                correctAnswerIndex = 3,
                explanation = "The singular countable noun phrase is 'a certain reason' to keep the specific motive unspecified.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q85"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_86",
                subject = "English Language",
                topic = "Phonology: Vowel Sounds in Bubble",
                year = "2011",
                questionText = "Choose the option that has the same vowel sound as the underlined letter: 'b_u_bble'",
                optionA = "guy",
                optionB = "bull",
                optionC = "bumper",
                optionD = "gurgle",
                correctAnswerIndex = 2,
                explanation = "The short 'u' sound /ʌ/ in 'bubble' is identical to the vowel sound in 'bumper' (/ʌ/).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q86"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_87",
                subject = "English Language",
                topic = "Phonology: Diphthongs in Weight",
                year = "2011",
                questionText = "Choose the option that has the same vowel sound as the underlined letters: 'w_ei_ght'",
                optionA = "whale",
                optionB = "while",
                optionC = "wheat",
                optionD = "writhe",
                correctAnswerIndex = 0,
                explanation = "The vowel sound in 'weight' is the diphthong /eɪ/, which perfectly matches the sound in 'whale'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q87"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_88",
                subject = "English Language",
                topic = "Phonology: Vowels in Leach",
                year = "2011",
                questionText = "Choose the option that has the same vowel sound as the underlined letters: 'l_ea_ch'",
                optionA = "gear",
                optionB = "cedar",
                optionC = "cheer",
                optionD = "death",
                correctAnswerIndex = 1,
                explanation = "The long /iː/ sound in 'leach' matches the first vowel sound in 'cedar' (/ˈsiːdə/).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q88"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2011_89",
                subject = "English Language",
                topic = "Phonology: Consonants in Mention",
                year = "2011",
                questionText = "Choose the option that has the same consonant sound as the underlined letters: 'men_ti_on'",
                optionA = "that",
                optionB = "machine",
                optionC = "church",
                optionD = "test",
                correctAnswerIndex = 1,
                explanation = "The 'ti' in 'mention' produces the voiceless postalveolar fricative /ʃ/, which is also heard in the 'ch' of 'machine' (/məˈʃiːn/).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q89"
            )
        )

        // 2012 Series
        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_30",
                subject = "English Language",
                topic = "Modals: Ought to have",
                year = "2012",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'The company ought to have issued warrants for one billion shares.'",
                optionA = "The company has issued one billion shares",
                optionB = "The management expected the company to issue more than one billion shares",
                optionC = "Members of the company bought less than one billion shares",
                optionD = "The company did not issue one billion shares",
                correctAnswerIndex = 3,
                explanation = "The modal perfect 'ought to have issued' implies that the action was desirable or expected but did not actually occur.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_35",
                subject = "English Language",
                topic = "Quantifiers: At the most",
                year = "2012",
                questionText = "Choose the option that best explains the sentence:\n'As far as Abu is concerned, Mero should be given fifty naira at the most.'",
                optionA = "All Abu is saying is that Mero probably deserves more than fifty naira",
                optionB = "All Abu is concerned with is that Mero should be given nothing more than fifty naira",
                optionC = "In Abu’s estimation, Mero merits not more than fifty naira",
                optionD = "In Abu’s opinion, Mero deserves fifty naira or probably more",
                correctAnswerIndex = 1,
                explanation = "'At the most' acts as an upper limit constraint, meaning fifty naira is the maximum possible amount.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_50",
                subject = "English Language",
                topic = "Antonyms: Hit-and-miss",
                year = "2012",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The way the worship was organized was rather hit-and-miss.'",
                optionA = "systematic",
                optionB = "hasty",
                optionC = "slow",
                optionD = "funny",
                correctAnswerIndex = 0,
                explanation = "'Hit-and-miss' describes a disorganized, random, or careless arrangement. Its direct antonym is 'systematic'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q50"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_51",
                subject = "English Language",
                topic = "Idioms: Taste of own medicine",
                year = "2012",
                questionText = "Choose the option nearest in meaning to the italicized phrase:\n'Some men will continue to cause offences until they are given a taste of their own medicine.'",
                optionA = "placated",
                optionB = "revenged on",
                optionC = "recompensed for",
                optionD = "cured",
                correctAnswerIndex = 1,
                explanation = "To give someone a 'taste of their own medicine' is a figurative idiom meaning to retaliate or be 'revenged on' them by treating them as they treated others.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q51"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_53",
                subject = "English Language",
                topic = "Synonyms: Sovereignty",
                year = "2012",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'Justice is difficult to enforce because people are unwilling to accept any loss of sovereignty.'",
                optionA = "autonomy",
                optionB = "position",
                optionC = "leadership",
                optionD = "kingdom",
                correctAnswerIndex = 0,
                explanation = "'Sovereignty' refers to supreme power, independence, or self-governing 'autonomy'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q53"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_54",
                subject = "English Language",
                topic = "Synonyms: Virtuous",
                year = "2012",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'There are still virtuous women in our society today.'",
                optionA = "clever",
                optionB = "upright",
                optionC = "devilish",
                optionD = "intelligent",
                correctAnswerIndex = 1,
                explanation = "Virtuous means having or showing high moral standards; hence, 'upright' or righteous.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q54"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_55",
                subject = "English Language",
                topic = "Synonyms: Typical",
                year = "2012",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The type of response is typical of a lazy teacher.'",
                optionA = "symptomatic",
                optionB = "characteristic",
                optionC = "universal",
                optionD = "incontestable",
                correctAnswerIndex = 1,
                explanation = "'Typical' means serving as a representative specimen or having the 'characteristic' qualities of a group.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q55"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_68",
                subject = "English Language",
                topic = "Vocabulary: Coasted",
                year = "2012",
                questionText = "Choose the option that best completes the gap:\n'The driver was short of petrol, so he _____ down the hills with the engine switched off.'",
                optionA = "glided",
                optionB = "coasted",
                optionC = "wheeled",
                optionD = "taxied",
                correctAnswerIndex = 1,
                explanation = "To 'coast' is to drive or slide down a hill in a vehicle without using engine power.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q68"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_69",
                subject = "English Language",
                topic = "Spelling: Auxiliary",
                year = "2012",
                questionText = "Choose the correct spelling:\n'He started his career as an _____ teacher.'",
                optionA = "auxillary",
                optionB = "auxilliary",
                optionC = "auxilary",
                optionD = "auxiliary",
                correctAnswerIndex = 3,
                explanation = "The correct spelling of the adjective meaning providing supplementary or additional help is 'auxiliary' (a-u-x-i-l-i-a-r-y).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q69"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_71",
                subject = "English Language",
                topic = "Pronoun Consistency: One",
                year = "2012",
                questionText = "Choose the option with consistent pronoun agreement:\n'One should be careful how _____ behaves in public, shouldn’t _____?'",
                optionA = "one/one",
                optionB = "he/he",
                optionC = "she/one",
                optionD = "one/he",
                correctAnswerIndex = 0,
                explanation = "To maintain pronoun consistency, the impersonal pronoun 'one' must be paired with 'one' in subsequent clauses and tags.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q71"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_74",
                subject = "English Language",
                topic = "Idioms: On the verge of",
                year = "2012",
                questionText = "Choose the correct preposition:\n'She was _____ the verge of tears.'",
                optionA = "at",
                optionB = "on",
                optionC = "by",
                optionD = "with",
                correctAnswerIndex = 1,
                explanation = "The correct idiomatic prepositional phrase is 'on the verge of', meaning very close to experiencing something.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q74"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_75",
                subject = "English Language",
                topic = "Vocabulary: Infallible",
                year = "2012",
                questionText = "Choose the option that best completes the gap:\n'Everyone makes mistakes occasionally; nobody is _____.'",
                optionA = "incorrigible",
                optionB = "imperfect",
                optionC = "infallible",
                optionD = "indestructible",
                correctAnswerIndex = 2,
                explanation = "'Infallible' means incapable of making mistakes or being wrong.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q75"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_76",
                subject = "English Language",
                topic = "Order of Adjectives",
                year = "2012",
                questionText = "Choose the option with the correct order of adjectives:\n'The woman would not part with her _____ pot.'",
                optionA = "discarded earthen black",
                optionB = "discarded black earthen",
                optionC = "earthen discarded black",
                optionD = "black earthen discarded",
                correctAnswerIndex = 1,
                explanation = "Following the standard order of adjectives in English: Opinion/Evaluation (discarded) + Colour (black) + Material (earthen).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q76"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_80",
                subject = "English Language",
                topic = "Phrasal Verbs: Laid off",
                year = "2012",
                questionText = "Choose the correct phrasal verb:\n'Many workers were _____ as a result of the textile factory closure.'",
                optionA = "laid down",
                optionB = "laid off",
                optionC = "laid out",
                optionD = "laid up",
                correctAnswerIndex = 1,
                explanation = "To be 'laid off' means to have one's employment terminated due to business closures or downsizing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q80"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_83",
                subject = "English Language",
                topic = "Vocabulary: Synergy",
                year = "2012",
                questionText = "Choose the option that best completes the gap:\n'For more productivity, the company is focusing attention on the possible _____ of available resources.'",
                optionA = "synergy",
                optionB = "tapping",
                optionC = "alignment",
                optionD = "arrangement",
                correctAnswerIndex = 0,
                explanation = "'Synergy' refers to the interaction or cooperation of two or more agents/resources to produce a combined effect greater than the sum of their separate parts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q83"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_86",
                subject = "English Language",
                topic = "Phonology: Vowels in Book",
                year = "2012",
                questionText = "Choose the option that has the same vowel sound as the underlined letter: 'b_oo_k'",
                optionA = "cool",
                optionB = "cook",
                optionC = "fool",
                optionD = "tool",
                correctAnswerIndex = 1,
                explanation = "The short /ʊ/ sound in 'book' matches the short /ʊ/ vowel sound in 'cook'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q86"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_87",
                subject = "English Language",
                topic = "Phonology: Vowels in Village",
                year = "2012",
                questionText = "Choose the option that has the same vowel sound as the underlined letter: 'vill_a_ge'",
                optionA = "page",
                optionB = "pig",
                optionC = "made",
                optionD = "came",
                correctAnswerIndex = 1,
                explanation = "The second syllable in 'village' is pronounced with the short /ɪ/ sound (/ˈvɪlɪdʒ/), which matches 'pig'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q87"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2012_89",
                subject = "English Language",
                topic = "Phonology: Consonants in Tangerine",
                year = "2012",
                questionText = "Choose the option that has the same consonant sound as the underlined letter: 'tan_g_erine'",
                optionA = "gear",
                optionB = "danger",
                optionC = "girl",
                optionD = "ignore",
                correctAnswerIndex = 1,
                explanation = "The 'g' in 'tangerine' is pronounced as the voiced affricate /dʒ/, which matches the 'g' sound in 'danger'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q89"
            )
        )

        // 2013 Series
        list.add(
            QuestionEntity(
                id = "eng_mrf_2013_49",
                subject = "English Language",
                topic = "Antonyms: Heinous",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The criminal activity in the town is heinous.'",
                optionA = "indelible",
                optionB = "laudable",
                optionC = "deplorable",
                optionD = "forgettable",
                correctAnswerIndex = 1,
                explanation = "'Heinous' means utterly wicked or abominable. Its antonym is 'laudable' (praiseworthy).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q49"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2013_53",
                subject = "English Language",
                topic = "Antonyms: Mordant",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The man’s mordant wit is apparent to the entire village.'",
                optionA = "Kind",
                optionB = "scathing",
                optionC = "caustic",
                optionD = "withering",
                correctAnswerIndex = 0,
                explanation = "'Mordant' wit is sharp, biting, and critical (caustic). Its opposite is 'kind' or gentle.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q53"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2013_56",
                subject = "English Language",
                topic = "Synonyms: Ardent",
                year = "2013",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'Ayodeji is an ardent supporter of education for the girl child.'",
                optionA = "an optimistic",
                optionB = "a cogent",
                optionC = "a passionate",
                optionD = "an ignorant",
                correctAnswerIndex = 2,
                explanation = "'Ardent' means very enthusiastic or passionate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q56"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2013_59",
                subject = "English Language",
                topic = "Vocabulary: Vanguard",
                year = "2013",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The athlete is proud to be in the vanguard of sports development.'",
                optionA = "unforgettable position",
                optionB = "leading position",
                optionC = "destructive position",
                optionD = "emerging position",
                correctAnswerIndex = 1,
                explanation = "The 'vanguard' is the foremost or leading position of an army, movement, or trend.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q59"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2013_66",
                subject = "English Language",
                topic = "Prepositions: Averse to",
                year = "2013",
                questionText = "Choose the correct preposition:\n'The girl says she is averse _____ what others admire.'",
                optionA = "for",
                optionB = "from",
                optionC = "to",
                optionD = "with",
                correctAnswerIndex = 2,
                explanation = "The adjective 'averse' takes the preposition 'to' ('averse to').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q66"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2013_67",
                subject = "English Language",
                topic = "Spelling: Onomatopoeia",
                year = "2013",
                questionText = "Choose the correct spelling:\n'Our teacher defined _____ in his introductory lesson.'",
                optionA = "onomatopioea",
                optionB = "onomatopoeia",
                optionC = "onomatoppoeia",
                optionD = "onomatopea",
                correctAnswerIndex = 1,
                explanation = "The correct spelling of the literary sound device is 'onomatopoeia' (o-n-o-m-a-t-o-p-o-e-i-a).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q67"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2013_68",
                subject = "English Language",
                topic = "Prepositional Phrases: Devote oneself to",
                year = "2013",
                questionText = "Choose the correct phrase:\n'The philanthropist devoted himself _____ the poor.'",
                optionA = "to helping",
                optionB = "in helping",
                optionC = "by helping",
                optionD = "to be helping",
                correctAnswerIndex = 0,
                explanation = "The phrase 'devote oneself' is followed by the preposition 'to' + a gerund ('to helping').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q68"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2013_73",
                subject = "English Language",
                topic = "Idioms: Out of hand",
                year = "2013",
                questionText = "Choose the correct idiom:\n'The police described the youth as being _____ hand.'",
                optionA = "on by",
                optionB = "up to",
                optionC = "over at",
                optionD = "out of",
                correctAnswerIndex = 3,
                explanation = "The idiom 'out of hand' means out of control or disorderly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q73"
            )
        )

        // 2014 Series
        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_44",
                subject = "English Language",
                topic = "Idioms: Hedged in",
                year = "2014",
                questionText = "Choose the option that best explains the sentence:\n'The robber was hedged in by the people.'",
                optionA = "The robber was surrounded by the people",
                optionB = "The robber was killed by the people",
                optionC = "The robber was exposed by the people",
                optionD = "The robber was caught by the people",
                correctAnswerIndex = 0,
                explanation = "To be 'hedged in' means to be enclosed, blocked, or surrounded on all sides.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_45",
                subject = "English Language",
                topic = "Idioms: Hand-to-mouth life",
                year = "2014",
                questionText = "Choose the option that best explains the sentence:\n'Many workers are not happy because they live a hand-to-mouth life.'",
                optionA = "They work hard with their hands",
                optionB = "They are voracious and avaricious",
                optionC = "They are barely surviving on minimal income",
                optionD = "They have rejected the use of spoons",
                correctAnswerIndex = 2,
                explanation = "A 'hand-to-mouth' life is an idiom meaning having only just enough money or food to survive day-to-day.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_47",
                subject = "English Language",
                topic = "Antonyms: Plagiarized",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'One of the students bought a plagiarized copy of the book.'",
                optionA = "a used",
                optionB = "an original",
                optionC = "a revised",
                optionD = "an annotated",
                correctAnswerIndex = 1,
                explanation = "A 'plagiarized' work is copied from another. The direct antonym is 'an original' work.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_48",
                subject = "English Language",
                topic = "Idioms & Antonyms: Taken aback",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized phrase:\n'The young girl was taken aback by her father's gift of a car.'",
                optionA = "shocked",
                optionB = "unmoved",
                optionC = "surprised",
                optionD = "nonplussed",
                correctAnswerIndex = 1,
                explanation = "To be 'taken aback' is to be highly surprised or shocked. Its opposite is 'unmoved'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q48"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_50",
                subject = "English Language",
                topic = "Antonyms: Translucent",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The lamp shades were translucent.'",
                optionA = "opaque",
                optionB = "interested",
                optionC = "luminous",
                optionD = "transparent",
                correctAnswerIndex = 0,
                explanation = "'Translucent' means semi-transparent, allowing some light to pass. The direct antonym is 'opaque' (blocking all light).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q50"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_58",
                subject = "English Language",
                topic = "Synonyms: Aghast",
                year = "2014",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The candidates looked aghast at the first reading of the questions.'",
                optionA = "fulfilled",
                optionB = "dismayed",
                optionC = "satisfied",
                optionD = "relaxed",
                correctAnswerIndex = 1,
                explanation = "'Aghast' means filled with horror or shock; 'dismayed'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q58"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_60",
                subject = "English Language",
                topic = "Slang & Colloquialisms: Doddle",
                year = "2014",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The first round of the tournament was a doddle.'",
                optionA = "easy",
                optionB = "balanced",
                optionC = "dodgy",
                optionD = "exasperating",
                correctAnswerIndex = 0,
                explanation = "In standard British and Nigerian English exam parlance, a 'doddle' represents a very easy task.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q60"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_66",
                subject = "English Language",
                topic = "Vocabulary: Convene",
                year = "2014",
                questionText = "Choose the option that best completes the gap:\n'The House and The Senate will _____ at noon next Wednesday to hear an address by the president.'",
                optionA = "convene",
                optionB = "adjourn",
                optionC = "rise",
                optionD = "collude",
                correctAnswerIndex = 0,
                explanation = "To 'convene' means to come together or assemble for a formal meeting (typical of legislative bodies).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q66"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2014_69",
                subject = "English Language",
                topic = "Idioms: Out of the woods",
                year = "2014",
                questionText = "Choose the option that best completes the idiom:\n'The president said that the country was not out of the _____ yet.'",
                optionA = "forest",
                optionB = "fog",
                optionC = "water",
                optionD = "woods",
                correctAnswerIndex = 3,
                explanation = "The idiom 'not out of the woods' means not yet free from difficulties, danger, or trouble.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q69"
            )
        )

        // 2015 Series
        list.add(
            QuestionEntity(
                id = "eng_mrf_2015_38",
                subject = "English Language",
                topic = "Grammar: Neither and Either",
                year = "2015",
                questionText = "Choose the option that best explains the sentence:\n'I haven't seen the movie and my brother hasn't either.'",
                optionA = "I have seen the movie but neither of my brothers has",
                optionB = "My brother and I haven't seen the movie",
                optionC = "Only my brother has seen the movie",
                optionD = "I have seen the movie but my brother hasn't",
                correctAnswerIndex = 1,
                explanation = "The coordinates 'haven't... hasn't either' mean that both individuals have not seen the movie.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2015_52",
                subject = "English Language",
                topic = "Antonyms: Scurry",
                year = "2015",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Lami normally scurries around town.'",
                optionA = "Scampers",
                optionB = "Dashes",
                optionC = "Dawdles",
                optionD = "Scuttles",
                correctAnswerIndex = 2,
                explanation = "To 'scurry' is to move hurriedly with short quick steps. The antonym is to 'dawdle' (move slowly and waste time).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q52"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2015_74",
                subject = "English Language",
                topic = "Phrasal Verbs: Tear down",
                year = "2015",
                questionText = "Choose the option that best completes the gap:\n'_____ the house was an easy task for the demolition squad.'",
                optionA = "Bringing forth",
                optionB = "Tearing down",
                optionC = "Bringing up",
                optionD = "Tearing with",
                correctAnswerIndex = 1,
                explanation = "To 'tear down' is a phrasal verb meaning to demolish or pull down a building.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q74"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2015_83",
                subject = "English Language",
                topic = "Phrasal Verbs: Stand up for",
                year = "2015",
                questionText = "Choose the option that best completes the gap:\n'Oboro will always _____ his friends.'",
                optionA = "stand up for",
                optionB = "stand down for",
                optionC = "stand across for",
                optionD = "stand besides for",
                correctAnswerIndex = 0,
                explanation = "To 'stand up for' is a phrasal verb meaning to support, defend, or advocate for someone.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q83"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2015_89",
                subject = "English Language",
                topic = "Phonology: Dental Fricative in Loath",
                year = "2015",
                questionText = "Choose the option that has the same consonant sound as the underlined letters: 'loa_th_'",
                optionA = "breathe",
                optionB = "that",
                optionC = "thaw",
                optionD = "tank",
                correctAnswerIndex = 2,
                explanation = "The 'th' in 'loath' (/ləʊθ/) is the voiceless dental fricative /θ/, matching the 'th' in 'thaw'.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q89"
            )
        )

        // 2016 Series
        list.add(
            QuestionEntity(
                id = "eng_mrf_2016_40",
                subject = "English Language",
                topic = "Vocabulary: Clinging",
                year = "2016",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'He is a clinging child.'",
                optionA = "He is a bully",
                optionB = "He likes to cling with his sister",
                optionC = "He is overly dependent and possessive",
                optionD = "He is a handsome young man",
                correctAnswerIndex = 2,
                explanation = "A 'clinging' child is overly dependent, emotionally demanding, or 'possessive' of caregivers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2016_67",
                subject = "English Language",
                topic = "Nouns: Uncountable Materials",
                year = "2016",
                questionText = "Choose the option that best completes the gap:\n'Concrete is made of _____.'",
                optionA = "sand and cement",
                optionB = "a sand and a cement",
                optionC = "sand and a cement",
                optionD = "a sand and cement",
                correctAnswerIndex = 0,
                explanation = "Both 'sand' and 'cement' are uncountable materials in this context and do not take indefinite articles.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q67"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2016_70",
                subject = "English Language",
                topic = "Question Tags: Negative Modals",
                year = "2016",
                questionText = "Choose the correct question tag:\n'The Flying Eagles of Nigeria couldn't have won the match if they hadn't prepared well, _____?'",
                optionA = "can't they",
                optionB = "couldn't they",
                optionC = "could they",
                optionD = "can they",
                correctAnswerIndex = 2,
                explanation = "The conditional negative statement 'couldn't have won' takes the positive tag 'could they?'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q70"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2016_82",
                subject = "English Language",
                topic = "Concord: Intervening Expressions",
                year = "2016",
                questionText = "Choose the correct verbal agreement:\n'The employer, not the salesmen, _____ responsible for the loss.'",
                optionA = "have been",
                optionB = "was",
                optionC = "were",
                optionD = "will be",
                correctAnswerIndex = 1,
                explanation = "When a subject is accompanied by parenthetical expressions like 'not the...', the verb agrees strictly with the singular primary subject ('The employer').",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q82"
            )
        )

        // 2017 & 2018 Series
        list.add(
            QuestionEntity(
                id = "eng_mrf_2017_44",
                subject = "English Language",
                topic = "Idioms: Hands are tied",
                year = "2017",
                questionText = "Choose the correct word to complete the idiom:\n'His _____ are tied, so he could not do anything to help her.'",
                optionA = "shoulders",
                optionB = "arms",
                optionC = "hands",
                optionD = "legs",
                correctAnswerIndex = 2,
                explanation = "The idiom 'one's hands are tied' means being unable to act due to rules, regulations, or circumstances beyond control.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2017_47",
                subject = "English Language",
                topic = "Phrasal Verbs: Stand by",
                year = "2017",
                questionText = "Choose the option that best completes the gap:\n'My wife should not worry about this trial, I will always _____ her.'",
                optionA = "stand for",
                optionB = "stand by",
                optionC = "stand on",
                optionD = "stand over",
                correctAnswerIndex = 1,
                explanation = "To 'stand by' someone means to remain loyal to them and support them during adversity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2017_48",
                subject = "English Language",
                topic = "Phrasal Verbs: Take after",
                year = "2017",
                questionText = "Choose the option that best completes the gap:\n'I can tell from the way he talks that he _____ his mentor.'",
                optionA = "takes after",
                optionB = "takes up",
                optionC = "takes from",
                optionD = "takes back",
                correctAnswerIndex = 0,
                explanation = "To 'take after' means to resemble a relative or predecessor in character, manner, or appearance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q48"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2018_45",
                subject = "English Language",
                topic = "Vocabulary: Futile",
                year = "2018",
                questionText = "Choose the option that best completes the gap:\n'When the soldiers saw that resistance was _____, they stopped fighting.'",
                optionA = "inadequate",
                optionB = "inefficient",
                optionC = "futile",
                optionD = "successful",
                correctAnswerIndex = 2,
                explanation = "'Futile' means incapable of producing any useful result; pointless or in vain.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q45"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2018_47",
                subject = "English Language",
                topic = "Concord: Compound Title Single Person",
                year = "2018",
                questionText = "Choose the correct verbal agreement:\n'The Emir and Conqueror of the enemy territories _____ next week.'",
                optionA = "arrives",
                optionB = "are to arrive",
                optionC = "arrive",
                optionD = "are arriving",
                correctAnswerIndex = 0,
                explanation = "Since 'The Emir and Conqueror' refers to a single individual holding both titles, a singular verb ('arrives') is required.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_mrf_2018_48",
                subject = "English Language",
                topic = "Question Tags: Ought to",
                year = "2018",
                questionText = "Choose the correct question tag:\n'We ought to have visited the Governor, _____?'",
                optionA = "isn't it",
                optionB = "oughtn't we",
                optionC = "shouldn't we",
                optionD = "haven't we",
                correctAnswerIndex = 1,
                explanation = "The positive modal 'ought to' takes 'oughtn't we?' as its grammatical question tag.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q48"
            )
        )

        return list
    }
}
