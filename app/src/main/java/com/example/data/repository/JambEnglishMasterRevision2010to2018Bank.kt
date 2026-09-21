package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and organized JAMB Use of English Master Revision Bank (2010 - 2018 Table Series).
 * Standardized with 4 options (A-D), verified 0-indexed answers, official JAMB exam years, and detailed explanations.
 */
object JambEnglishMasterRevision2010to2018Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 2010 Q2
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_02",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "According to the writer, the exciting thing about Spaceship Earth is that it:",
                optionA = "Has no instruction manual",
                optionB = "Is not difficult to maintain",
                optionC = "Is peculiar to other automobiles",
                optionD = "Is relatively easy to operate",
                correctAnswerIndex = 0,
                explanation = "The passage notes that unlike automobiles, Spaceship Earth did not come with an instruction manual, making its operation a challenge to human inquisitiveness.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q2"
            )
        )

        // 2010 Q3
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_03",
                subject = "English Language",
                topic = "Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "The absence of an instruction manual in Spaceship Earth has:",
                optionA = "Made the operation of the Spaceship Earth difficult",
                optionB = "Forced man to devise other means of travelling in spacecraft",
                optionC = "Challenged man's inquisitiveness",
                optionD = "Made man completely helpless",
                correctAnswerIndex = 2,
                explanation = "Without a manual, humans must figure out how the planet works on their own, which directly stimulates and challenges human intellect and inquisitiveness.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q3"
            )
        )

        // 2010 Q15
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_15",
                subject = "English Language",
                topic = "Comprehension: Anti-Corruption",
                year = "2010",
                questionText = "The essence of fighting corruption, according to the passage, is to:",
                optionA = "Send the corrupt to jail",
                optionB = "Promote good governance",
                optionC = "Punish corrupt politicians",
                optionD = "Make people richer",
                correctAnswerIndex = 1,
                explanation = "The writer highlights that anti-corruption efforts are ultimately designed to establish and promote sustainable good governance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q15"
            )
        )

        // 2010 Q26
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_26",
                subject = "English Language",
                topic = "Idioms: Jaundiced eye",
                year = "2010",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'Though Mr. Iro is a new chairman, he views other members with a jaundiced eye.'",
                optionA = "He takes a rather forceful position on dealing with his members",
                optionB = "He looks at them with prejudice and suspicion",
                optionC = "He is very happy with his members",
                optionD = "He is suffering from yellow fever",
                correctAnswerIndex = 1,
                explanation = "To look at something with a 'jaundiced eye' is an idiom meaning to view it with prejudice, skepticism, or suspicion.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q26"
            )
        )

        // 2010 Q36
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_36",
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

        // 2010 Q37
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_37",
                subject = "English Language",
                topic = "Antonyms: Cut-throat",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The trader was amused by the cut-throat rush for the goods.'",
                optionA = "Worrisome",
                optionB = "Strange",
                optionC = "Lacklustre",
                optionD = "Mad",
                correctAnswerIndex = 2,
                explanation = "A 'cut-throat' rush is highly intense, competitive, and energetic. The antonym is 'lacklustre' (spiritless/dull).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q37"
            )
        )

        // 2010 Q38
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_38",
                subject = "English Language",
                topic = "Antonyms: Redundant",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The teacher said that Ali’s essay was full of many redundant details.'",
                optionA = "Unexplained",
                optionB = "Strange",
                optionC = "Necessary",
                optionD = "Useful",
                correctAnswerIndex = 2,
                explanation = "Redundant details are superfluous, excessive, or unnecessary. Therefore, the opposite is 'necessary'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q38"
            )
        )

        // 2010 Q40
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_40",
                subject = "English Language",
                topic = "Antonyms: Ingenuous",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Her ingenuous smile drew our attention.'",
                optionA = "Witty",
                optionB = "Naïve",
                optionC = "Clever",
                optionD = "Arrogant",
                correctAnswerIndex = 3,
                explanation = "Ingenuous means innocent, trustful, and simple. Its opposite in social attitude here is 'arrogant'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q40"
            )
        )

        // 2010 Q41
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_41",
                subject = "English Language",
                topic = "Antonyms: Flawless",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Ndeni gave a flawless speech at the party.'",
                optionA = "A wonderful",
                optionB = "A careless",
                optionC = "An interesting",
                optionD = "An imperfect",
                correctAnswerIndex = 3,
                explanation = "Flawless means perfect and without any errors. Its antonym is 'imperfect'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q41"
            )
        )

        // 2010 Q42
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_42",
                subject = "English Language",
                topic = "Antonyms: Gruff",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Beneath Ado’s gruff exterior, he’s really very kind-hearted.'",
                optionA = "Nice",
                optionB = "Harsh",
                optionC = "Rough",
                optionD = "Gentle",
                correctAnswerIndex = 3,
                explanation = "Gruff means rough, abrupt, or harsh in manner. Its opposite is 'gentle'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q42"
            )
        )

        // 2010 Q43
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_43",
                subject = "English Language",
                topic = "Antonyms: Debased",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The captain says sports is being debased by commercial sponsorship.'",
                optionA = "Localized",
                optionB = "Perverted",
                optionC = "Elevated",
                optionD = "Overvalued",
                correctAnswerIndex = 2,
                explanation = "Debased means degraded or lowered in quality/value. The opposite is 'elevated' (raised in status or quality).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q43"
            )
        )

        // 2010 Q44
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_44",
                subject = "English Language",
                topic = "Antonyms: Straightforward",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Governing a country is not always as straightforward as people sometimes imagine.'",
                optionA = "Complicated",
                optionB = "Easy",
                optionC = "Simple",
                optionD = "Direct",
                correctAnswerIndex = 0,
                explanation = "A straightforward task is simple and easy to understand. Its antonym is 'complicated'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q44"
            )
        )

        // 2010 Q50
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_50",
                subject = "English Language",
                topic = "Antonyms: Superfluous",
                year = "2010",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Ada gave her husband a look that made words superfluous.'",
                optionA = "Redundant",
                optionB = "Spurious",
                optionC = "Unnecessary",
                optionD = "Scanty",
                correctAnswerIndex = 3,
                explanation = "Superfluous means more than enough or excessive. Its opposite in quantity or need is 'scanty' or minimal.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q50"
            )
        )

        // 2010 Q51
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_51",
                subject = "English Language",
                topic = "Synonyms: Impasse",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'A political impasse does not offer the best opportunity for merrymaking.'",
                optionA = "manifesto",
                optionB = "party",
                optionC = "gridlock",
                optionD = "rally",
                correctAnswerIndex = 2,
                explanation = "An 'impasse' is a situation in which no progress is possible; a deadlock or 'gridlock'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q51"
            )
        )

        // 2010 Q53
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_53",
                subject = "English Language",
                topic = "Synonyms: Absurd",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The uniform makes the guards look absurd.'",
                optionA = "dirty",
                optionB = "smart",
                optionC = "handsome",
                optionD = "ridiculous",
                correctAnswerIndex = 3,
                explanation = "Absurd means wildly unreasonable, illogical, or inappropriate; hence, 'ridiculous'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q53"
            )
        )

        // 2010 Q63
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_63",
                subject = "English Language",
                topic = "Synonyms: Blemish",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'Her reputation is without a blemish.'",
                optionA = "Struggle",
                optionB = "Problem",
                optionC = "Fault",
                optionD = "Blessing",
                correctAnswerIndex = 2,
                explanation = "A blemish is a small mark or flaw that spoils the appearance of something; hence, a 'fault' or defect.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q63"
            )
        )

        // 2010 Q64
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_64",
                subject = "English Language",
                topic = "Synonyms: Eligible",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'Ugo is eligible for the post of secretary.'",
                optionA = "Nominated",
                optionB = "Invited",
                optionC = "Qualified",
                optionD = "Intelligent",
                correctAnswerIndex = 2,
                explanation = "Eligible means having the right to do or obtain something; satisfying the appropriate conditions or being 'qualified'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q64"
            )
        )

        // 2010 Q65
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_65",
                subject = "English Language",
                topic = "Synonyms: Abridged",
                year = "2010",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'This is an abridged version of No Longer at Ease.'",
                optionA = "An outdated",
                optionB = "An enlarged",
                optionC = "An illustrated",
                optionD = "A shortened",
                correctAnswerIndex = 3,
                explanation = "An abridged text has been shortened by condensing or omitting some parts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q65"
            )
        )

        // 2010 Q67
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_67",
                subject = "English Language",
                topic = "Phrasal Verbs: Rattle off",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'He can recall the important dates in the nation’s history, it is interesting to listen as he rattles _____.'",
                optionA = "off",
                optionB = "over",
                optionC = "up",
                optionD = "out",
                correctAnswerIndex = 0,
                explanation = "To 'rattle off' is a phrasal verb meaning to recite or list something quickly and easily from memory.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q67"
            )
        )

        // 2010 Q74
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_74",
                subject = "English Language",
                topic = "Prepositions: Pleased with",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'The principal said that he was pleased _____ my effort.'",
                optionA = "on",
                optionB = "of",
                optionC = "with",
                optionD = "about",
                correctAnswerIndex = 2,
                explanation = "The adjective 'pleased' takes the preposition 'with' when expressing satisfaction with a person's efforts or work.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q74"
            )
        )

        // 2010 Q75
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_75",
                subject = "English Language",
                topic = "Prepositions: Made from",
                year = "2010",
                questionText = "Choose the option that best completes the gap:\n'Paper is made _____ wood pulp.'",
                optionA = "on",
                optionB = "of",
                optionC = "from",
                optionD = "with",
                correctAnswerIndex = 2,
                explanation = "We use 'made from' when the raw material undergoes a complete physical/chemical transformation during manufacturing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q75"
            )
        )

        // 2010 Q87
        list.add(
            QuestionEntity(
                id = "eng_rev_2010_87",
                subject = "English Language",
                topic = "Phonology: Vowel Sounds in Indict",
                year = "2010",
                questionText = "Choose the option that has the same vowel sound as the underlined letter in: 'Ind_i_ct'",
                optionA = "bright",
                optionB = "fish",
                optionC = "pick",
                optionD = "brick",
                correctAnswerIndex = 0,
                explanation = "Despite the spelling, 'indict' is pronounced /ɪnˈdaɪt/ with a long /aɪ/ sound, matching 'bright'.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q87"
            )
        )

        // 2011 Q36
        list.add(
            QuestionEntity(
                id = "eng_rev_2011_36",
                subject = "English Language",
                topic = "Synonyms: Inception",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'Since its inception in 1983, the newspaper has attracted thousands of readers.'",
                optionA = "renaissance",
                optionB = "coming",
                optionC = "commencement",
                optionD = "publication",
                correctAnswerIndex = 2,
                explanation = "'Inception' denotes the establishment or starting point of an institution, which translates directly to 'commencement'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q36"
            )
        )

        // 2011 Q50
        list.add(
            QuestionEntity(
                id = "eng_rev_2011_50",
                subject = "English Language",
                topic = "Synonyms: Exacerbated",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'Her problem was exacerbated by the loss of her father.'",
                optionA = "exaggerated",
                optionB = "solved",
                optionC = "aggravated",
                optionD = "infuriated",
                correctAnswerIndex = 2,
                explanation = "To 'exacerbate' means to make a bad situation or problem worse; hence, 'aggravated'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q50"
            )
        )

        // 2011 Q51
        list.add(
            QuestionEntity(
                id = "eng_rev_2011_51",
                subject = "English Language",
                topic = "Antonyms: Coerced",
                year = "2011",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The warring communities were coerced into negotiating a settlement.'",
                optionA = "driven",
                optionB = "compelled",
                optionC = "persuaded",
                optionD = "pressured",
                correctAnswerIndex = 2,
                explanation = "'Coerced' means forced or compelled. Its direct antonym is 'persuaded', representing voluntary agreement.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q51"
            )
        )

        // 2011 Q66
        list.add(
            QuestionEntity(
                id = "eng_rev_2011_66",
                subject = "English Language",
                topic = "Verbs: Past Tense of Burst",
                year = "2011",
                questionText = "Choose the option that best completes the gap:\n'When his car tyre _____ on the way, he did not know what to do.'",
                optionA = "has burst",
                optionB = "had burst",
                optionC = "bursted",
                optionD = "burst",
                correctAnswerIndex = 3,
                explanation = "The verb 'burst' is irregular and retains the same form ('burst') in the simple past tense. 'Bursted' is non-standard.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q66"
            )
        )

        // 2011 Q71
        list.add(
            QuestionEntity(
                id = "eng_rev_2011_71",
                subject = "English Language",
                topic = "Question Tags: Needn't",
                year = "2011",
                questionText = "Choose the correct question tag:\n'Suara needn’t come with us, _____?'",
                optionA = "does she",
                optionB = "will she",
                optionC = "can she",
                optionD = "need she",
                correctAnswerIndex = 3,
                explanation = "The semi-modal 'needn't' in a negative statement forms a positive question tag using the same auxiliary: 'need she?'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q71"
            )
        )

        // 2011 Q76
        list.add(
            QuestionEntity(
                id = "eng_rev_2011_76",
                subject = "English Language",
                topic = "Spelling: Pronunciation",
                year = "2011",
                questionText = "Choose the correct spelling:\n'Here is Mr. Odumusu who teaches English _____ in our school.'",
                optionA = "pronuntiation",
                optionB = "pronounciation",
                optionC = "pronunciation",
                optionD = "pronountiation",
                correctAnswerIndex = 2,
                explanation = "The correct spelling of the noun is 'pronunciation' (with 'nun', not 'noun').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q76"
            )
        )

        // 2012 Q29
        list.add(
            QuestionEntity(
                id = "eng_rev_2012_29",
                subject = "English Language",
                topic = "Idioms: Throw one's weight about",
                year = "2012",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'The landlord is fond of throwing his weight about.'",
                optionA = "The landlord likes healthy exercise",
                optionB = "The landlord is overweight",
                optionC = "The landlord gives orders to people in an arrogant manner",
                optionD = "The landlord is highly respected by his tenants",
                correctAnswerIndex = 2,
                explanation = "The idiom 'throwing his weight about' means acting in an arrogant, bossy, or domineering manner.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q29"
            )
        )

        // 2012 Q56
        list.add(
            QuestionEntity(
                id = "eng_rev_2012_56",
                subject = "English Language",
                topic = "Synonyms: Inveterate",
                year = "2012",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'Akin is an inveterate gambler.'",
                optionA = "a selfish and self-centred",
                optionB = "an extremely unlucky but popular",
                optionC = "an incurable but fearful",
                optionD = "a long-time and incorrigible",
                correctAnswerIndex = 3,
                explanation = "'Inveterate' means having a particular habit, activity, or interest that is long-established and unlikely to change (incorrigible).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q56"
            )
        )

        // 2013 Q46
        list.add(
            QuestionEntity(
                id = "eng_rev_2013_46",
                subject = "English Language",
                topic = "Antonyms: Curt",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Chibuzor gave a curt nod and walked away.'",
                optionA = "gentle",
                optionB = "rude",
                optionC = "polite",
                optionD = "shocking",
                correctAnswerIndex = 2,
                explanation = "'Curt' means rudely brief or abrupt in manner. Its direct opposite is 'polite'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q46"
            )
        )

        // 2013 Q48
        list.add(
            QuestionEntity(
                id = "eng_rev_2013_48",
                subject = "English Language",
                topic = "Antonyms: Frosty",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The relationship between the couple has been frosty.'",
                optionA = "fraudulent",
                optionB = "cordial",
                optionC = "amenable",
                optionD = "frugal",
                correctAnswerIndex = 1,
                explanation = "A 'frosty' relationship is cold and unfriendly. Its antonym is 'cordial' (warm and friendly).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q48"
            )
        )

        // 2013 Q51
        list.add(
            QuestionEntity(
                id = "eng_rev_2013_51",
                subject = "English Language",
                topic = "Antonyms: Plebs",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The plebs can be found in every society of the world.'",
                optionA = "masses",
                optionB = "middle class",
                optionC = "elite",
                optionD = "politicians",
                correctAnswerIndex = 2,
                explanation = "'Plebs' refers to the common people or working class. The direct antonym is 'elite' (upper class).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q51"
            )
        )

        // 2013 Q54
        list.add(
            QuestionEntity(
                id = "eng_rev_2013_54",
                subject = "English Language",
                topic = "Antonyms: Waxing",
                year = "2013",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The war against malaria keeps waxing.'",
                optionA = "happening",
                optionB = "decreasing",
                optionC = "increasing",
                optionD = "wavering",
                correctAnswerIndex = 1,
                explanation = "To 'wax' means to grow larger or increase. The antonym is 'waning' or 'decreasing'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q54"
            )
        )

        // 2014 Q36
        list.add(
            QuestionEntity(
                id = "eng_rev_2014_36",
                subject = "English Language",
                topic = "Idioms: Drop in the ocean",
                year = "2014",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'The minister considered the ministry’s budget to be a drop in the ocean in view of the number of projects in the pipeline.'",
                optionA = "The amount available may be inadequate for projected expenditure",
                optionB = "The minister may be dropped for failing to complete projects",
                optionC = "The money approved cannot complete the pipeline project across the ocean",
                optionD = "The pipeline project will be abandoned unless funding improves",
                correctAnswerIndex = 0,
                explanation = "A 'drop in the ocean' is an idiom representing a very small, insignificant amount compared to what is needed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q36"
            )
        )

        // 2014 Q46
        list.add(
            QuestionEntity(
                id = "eng_rev_2014_46",
                subject = "English Language",
                topic = "Antonyms: Debilitated",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Prolonged strike action debilitated the industry.'",
                optionA = "invigorated",
                optionB = "isolated",
                optionC = "weakened",
                optionD = "destroyed",
                correctAnswerIndex = 0,
                explanation = "'Debilitated' means weakened or made feeble. Its direct antonym is 'invigorated' (energized or strengthened).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q46"
            )
        )

        // 2014 Q62
        list.add(
            QuestionEntity(
                id = "eng_rev_2014_62",
                subject = "English Language",
                topic = "Synonyms: Fomenting",
                year = "2014",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'They accused him of fomenting political unrest.'",
                optionA = "inciting",
                optionB = "discouraging",
                optionC = "preventing",
                optionD = "guiding",
                correctAnswerIndex = 0,
                explanation = "To 'foment' means to instigate, stir up, or 'incite' trouble or rebellion.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q62"
            )
        )

        // 2014 Q64
        list.add(
            QuestionEntity(
                id = "eng_rev_2014_64",
                subject = "English Language",
                topic = "Synonyms: Garner",
                year = "2014",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'All the researchers were asked to garner information on the new viral infection.'",
                optionA = "collect",
                optionB = "disseminate",
                optionC = "distort",
                optionD = "give",
                correctAnswerIndex = 0,
                explanation = "To 'garner' means to gather, accumulate, or 'collect' information or items.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q64"
            )
        )

        // 2015 Q63
        list.add(
            QuestionEntity(
                id = "eng_rev_2015_63",
                subject = "English Language",
                topic = "Synonyms: Schism",
                year = "2015",
                questionText = "Choose the option nearest in meaning to the italicized word:\n'The schism in the organization is on the increase.'",
                optionA = "disagreement",
                optionB = "understanding",
                optionC = "opportunity",
                optionD = "rot",
                correctAnswerIndex = 0,
                explanation = "A 'schism' is a split or division between strongly opposed sections or parties caused by 'disagreement'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q63"
            )
        )

        // 2015 Q92
        list.add(
            QuestionEntity(
                id = "eng_rev_2015_92",
                subject = "English Language",
                topic = "Phonology: Rhymes",
                year = "2015",
                questionText = "Choose the option that rhymes with the given word: 'Suite'",
                optionA = "tree",
                optionB = "breath",
                optionC = "bleat",
                optionD = "sweet",
                correctAnswerIndex = 3,
                explanation = "'Suite' is pronounced exactly like 'sweet' (/swiːt/), making them perfect homophones and exact rhymes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q92"
            )
        )

        // 2016 Q39
        list.add(
            QuestionEntity(
                id = "eng_rev_2016_39",
                subject = "English Language",
                topic = "Idioms: Plumb the depths",
                year = "2016",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'The team's poor performance at the tournament plumbed the depths of horror.'",
                optionA = "The team's performance was rewarded",
                optionB = "The team's performance took them to the next round",
                optionC = "The team's performance was enjoyed by all",
                optionD = "The team's performance was full of disappointment",
                correctAnswerIndex = 3,
                explanation = "To 'plumb the depths' of something bad means to reach the lowest possible level; hence, it was full of disappointment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q39"
            )
        )

        // 2017 Q28
        list.add(
            QuestionEntity(
                id = "eng_rev_2017_28",
                subject = "English Language",
                topic = "Grammar: But for Structure",
                year = "2017",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'But for the expense, I'd buy a bigger car.'",
                optionA = "I want to buy a bigger car because it is more expensive",
                optionB = "I will not buy a bigger car because it is too expensive",
                optionC = "I would buy a bigger car if I had more money",
                optionD = "I would like to buy a bigger car if it was not so expensive",
                correctAnswerIndex = 1,
                explanation = "The structure 'But for X, I would do Y' means 'If it were not for the obstacle of X, I would do Y'. Hence, the high expense prevents the purchase.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q28"
            )
        )

        // 2018 Q23
        list.add(
            QuestionEntity(
                id = "eng_rev_2018_23",
                subject = "English Language",
                topic = "Idioms: Beat about the bush",
                year = "2018",
                questionText = "Choose the option that best explains the meaning of the sentence:\n'When asked to state her side of the story, Bunmi started by beating about the bush.'",
                optionA = "went straight to the point",
                optionB = "was lost in great thought",
                optionC = "avoided the main issue",
                optionD = "went into the forest",
                correctAnswerIndex = 2,
                explanation = "To 'beat about the bush' is an idiom meaning to avoid talking about what is important or to avoid addressing the main issue directly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q23"
            )
        )

        return list
    }
}
