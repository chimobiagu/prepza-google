package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB UTME Comprehensive Exam Bank (2010 - 2018).
 * Features authentic questions spanning Sentence Interpretation, Cloze Passages,
 * Oral Stress & Phonology, Figures of Speech, Antonyms and Synonyms across multiple years.
 */
object JambEnglish2010to2018MassiveBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2010 COMPREHENSIVE EXAM SECTION
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_exam_2010_11",
                subject = "English Language",
                topic = "Lexis: Tardy",
                year = "2010",
                questionText = "The law is often tardy in reacting to changing attitudes.",
                optionA = "exclusive",
                optionB = "generous",
                optionC = "quick",
                optionD = "slow",
                correctAnswerIndex = 3,
                explanation = "'Tardy' means delaying or being slow to act, respond, or arrive.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q54"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2010_12",
                subject = "English Language",
                topic = "Lexis: Sumptuous",
                year = "2010",
                questionText = "Isa and Ilu ate sumptuous meals on their brothers' wedding day.",
                optionA = "insipid",
                optionB = "cheap",
                optionC = "expensive and lavish",
                optionD = "foreign",
                correctAnswerIndex = 2,
                explanation = "'Sumptuous' means splendid and expensive-looking, luxurious, or lavish.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q55"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2010_13",
                subject = "English Language",
                topic = "Lexis: Panacea",
                year = "2010",
                questionText = "The panacea for a country's economic mess lies in systematic planning and hard work.",
                optionA = "cure-all",
                optionB = "trouble",
                optionC = "hope",
                optionD = "foresight",
                correctAnswerIndex = 0,
                explanation = "A 'panacea' is a solution or universal remedy for all difficulties or diseases; a cure-all.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q57"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2010_14",
                subject = "English Language",
                topic = "Lexis: Penury",
                year = "2010",
                questionText = "Thousands of workers have been victims of retrenchment since the military came back to power.",
                optionA = "suffering",
                optionB = "redundancy and lay-off",
                optionC = "unemployment",
                optionD = "trench mentality",
                correctAnswerIndex = 1,
                explanation = "'Retrenchment' in labour economics is the reduction of staff and expenditure; redundancy or lay-off.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q58"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2010_15",
                subject = "English Language",
                topic = "Lexis: Apposite",
                year = "2010",
                questionText = "The director's remark was extremely apposite to the issue being discussed.",
                optionA = "emphatic",
                optionB = "adequate",
                optionC = "appropriate and pertinent",
                optionD = "inconsequential",
                correctAnswerIndex = 2,
                explanation = "'Apposite' means apt in the circumstances or in relation to something; highly relevant and appropriate.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q62"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2010_16",
                subject = "English Language",
                topic = "Lexis: Abridged",
                year = "2010",
                questionText = "This is an abridged version of 'No Longer at Ease'.",
                optionA = "illustrated",
                optionB = "shortened and condensed",
                optionC = "outdated",
                optionD = "enlarged",
                correctAnswerIndex = 1,
                explanation = "'Abridged' means having been shortened or condensed from the original text without losing the core sense.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q65"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2011 COMPREHENSIVE EXAM SECTION
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_exam_2011_01",
                subject = "English Language",
                topic = "Lexis: Ensnared",
                year = "2011",
                questionText = "The girl is angry with her friend who had ensnared her into the relationship.",
                optionA = "tricked and trapped",
                optionB = "encouraged",
                optionC = "forced",
                optionD = "enslaved",
                correctAnswerIndex = 0,
                explanation = "To 'ensnare' means to catch in or as in a trap; trick into a difficult position.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2011_02",
                subject = "English Language",
                topic = "Lexis: Astute",
                year = "2011",
                questionText = "The stockbroker said it was an astute move to sell the shares then.",
                optionA = "bad",
                optionB = "shrewd and discerning",
                optionC = "unprofitable",
                optionD = "insincere",
                correctAnswerIndex = 1,
                explanation = "'Astute' means having or showing an ability to accurately assess situations and turn this to one's advantage.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2011_03",
                subject = "English Language",
                topic = "Lexis: Deleterious",
                year = "2011",
                questionText = "Some drugs have a deleterious effect on a child's development.",
                optionA = "debilitating",
                optionB = "helpful",
                optionC = "harmful and damaging",
                optionD = "healing",
                correctAnswerIndex = 2,
                explanation = "'Deleterious' means causing harm or damage; injurious.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q36"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2012 COMPREHENSIVE EXAM SECTION
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_exam_2012_21",
                subject = "English Language",
                topic = "Lexis: Derogatory",
                year = "2012",
                questionText = "Okibe was rusticated for his derogatory remark about the principal.",
                optionA = "complimentary",
                optionB = "unsavoury and belittling",
                optionC = "unwarranted",
                optionD = "lacklustre",
                correctAnswerIndex = 1,
                explanation = "'Derogatory' means showing a critical or disrespectful attitude; disparaging.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q52"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2012_22",
                subject = "English Language",
                topic = "Lexis: Sovereignty",
                year = "2012",
                questionText = "Justice is difficult to enforce because people are unwilling to accept any loss of sovereignty.",
                optionA = "autonomy and supreme power",
                optionB = "position",
                optionC = "leadership",
                optionD = "kingdom",
                correctAnswerIndex = 0,
                explanation = "'Sovereignty' refers to supreme power, independence, or autonomy of authority.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q53"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2012_23",
                subject = "English Language",
                topic = "Lexis: Virtuous",
                year = "2012",
                questionText = "There are still virtuous women in our society today.",
                optionA = "clever",
                optionB = "upright and moral",
                optionC = "devilish",
                optionD = "intelligent",
                correctAnswerIndex = 1,
                explanation = "'Virtuous' means having or showing high moral standards; morally upright.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q54"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2012_24",
                subject = "English Language",
                topic = "Lexis: Petrified",
                year = "2012",
                questionText = "He was too petrified to give the closing remarks at the conference.",
                optionA = "frightened and paralyzed with fear",
                optionB = "delighted",
                optionC = "agitated",
                optionD = "happy",
                correctAnswerIndex = 0,
                explanation = "'Petrified' means so frightened that one is unable to move or speak; terrified.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q57"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2012_25",
                subject = "English Language",
                topic = "Lexis: Vulnerable",
                year = "2012",
                questionText = "Every human being is vulnerable to communicable diseases.",
                optionA = "liable and susceptible",
                optionB = "lifted",
                optionC = "immunised",
                optionD = "closed",
                correctAnswerIndex = 0,
                explanation = "'Vulnerable' means exposed to the possibility of being attacked or harmed, either physically or emotionally; susceptible.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q59"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2012_26",
                subject = "English Language",
                topic = "Lexis: Furtive",
                year = "2012",
                questionText = "Mariam looks rather furtive to Shehu.",
                optionA = "intoxicated",
                optionB = "unfriendly",
                optionC = "sad",
                optionD = "sly and secretive",
                correctAnswerIndex = 3,
                explanation = "'Furtive' means attempting to avoid notice or attention, typically because of guilt; secretive or sly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q60"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2012_27",
                subject = "English Language",
                topic = "Lexis: Espoused",
                year = "2012",
                questionText = "These policies have been espoused by the ruling party.",
                optionA = "condemned",
                optionB = "rejected",
                optionC = "supported and adopted",
                optionD = "outlined",
                correctAnswerIndex = 2,
                explanation = "'Espouse' means to adopt or support a cause, belief, or way of life.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q63"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2012_28",
                subject = "English Language",
                topic = "Lexis: Foreclose",
                year = "2012",
                questionText = "We must not foreclose reconciliation as the purpose of his trip.",
                optionA = "exclude and prevent",
                optionB = "consider",
                optionC = "underestimate",
                optionD = "forgo",
                correctAnswerIndex = 0,
                explanation = "To 'foreclose' means to rule out or prevent something from happening in advance.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q64"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2014 COMPREHENSIVE EXAM SECTION
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_exam_2014_11",
                subject = "English Language",
                topic = "Lexis: Incessant",
                year = "2014",
                questionText = "The chairman admires incessant meetings.",
                optionA = "unusual",
                optionB = "planned",
                optionC = "ceaseless and constant",
                optionD = "irregular",
                correctAnswerIndex = 2,
                explanation = "'Incessant' means continuing without pause or interruption; continuous and never-ending.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q56"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2014_12",
                subject = "English Language",
                topic = "Lexis: Aghast",
                year = "2014",
                questionText = "All the candidates looked aghast at the first reading of the questions.",
                optionA = "fulfilled",
                optionB = "dismayed and horrified",
                optionC = "satisfied",
                optionD = "relaxed",
                correctAnswerIndex = 1,
                explanation = "'Aghast' means filled with horror or shock; dismayed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q58"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2014_13",
                subject = "English Language",
                topic = "Lexis: Jaunty",
                year = "2014",
                questionText = "Joke gave Muhammad a jaunty smile.",
                optionA = "discouraging",
                optionB = "inviting",
                optionC = "cheerful and lively",
                optionD = "fearful",
                correctAnswerIndex = 2,
                explanation = "'Jaunty' means having or expressing a lively, cheerful, and self-confident manner.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q59"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2014_14",
                subject = "English Language",
                topic = "Lexis: Doddle",
                year = "2014",
                questionText = "The first round of the tournament was doddle.",
                optionA = "easy task",
                optionB = "balanced",
                optionC = "dodgy",
                optionD = "exasperating",
                correctAnswerIndex = 0,
                explanation = "A 'doddle' is an informal noun meaning a very easy task.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q60"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2014_15",
                subject = "English Language",
                topic = "Lexis: Fomenting",
                year = "2014",
                questionText = "They accused him of fomenting political unrest.",
                optionA = "inciting and instigating",
                optionB = "discouraging",
                optionC = "preventing",
                optionD = "envious",
                correctAnswerIndex = 0,
                explanation = "'Foment' means to instigate or stir up an undesirable or violent sentiment or course of action.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q62"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2014_16",
                subject = "English Language",
                topic = "Lexis: Garner",
                year = "2014",
                questionText = "All the researchers were asked to garner information on the new viral infection.",
                optionA = "collect and gather",
                optionB = "disseminate",
                optionC = "distort",
                optionD = "give",
                correctAnswerIndex = 0,
                explanation = "'Garner' means to gather or collect something, especially information or approval.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q64"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2014_17",
                subject = "English Language",
                topic = "Lexis: Severing",
                year = "2014",
                questionText = "The dispute between the two countries has resulted in the severing of diplomatic relations.",
                optionA = "breaking and terminating",
                optionB = "securing",
                optionC = "swapping",
                optionD = "strengthening",
                correctAnswerIndex = 0,
                explanation = "'Sever' means to divide by cutting or slicing, suddenly and forcibly, or to bring a relationship to an end.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q65"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2016 COMPREHENSIVE EXAM SECTION
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_exam_2016_11",
                subject = "English Language",
                topic = "Lexis: Obviate",
                year = "2016",
                questionText = "The use of this equipment should obviate the problem.",
                optionA = "prevent and remove",
                optionB = "improve",
                optionC = "promote",
                optionD = "worsen",
                correctAnswerIndex = 0,
                explanation = "'Obviate' means to remove a need or difficulty; prevent or avoid.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q60"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2016_12",
                subject = "English Language",
                topic = "Lexis: Hoodwinked",
                year = "2016",
                questionText = "Olisa hoodwinked the men into buying and selling.",
                optionA = "grouped",
                optionB = "lured and deceived",
                optionC = "deluded",
                optionD = "drove",
                correctAnswerIndex = 1,
                explanation = "'Hoodwink' means to deceive or trick someone.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q61"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2016_13",
                subject = "English Language",
                topic = "Lexis: Gaiety",
                year = "2016",
                questionText = "There was an infectious gaiety in the children's character.",
                optionA = "exhilaration and cheerfulness",
                optionB = "depression",
                optionC = "moodiness",
                optionD = "desperation",
                correctAnswerIndex = 0,
                explanation = "'Gaiety' is the state or quality of being lighthearted or cheerful.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q62"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2016_14",
                subject = "English Language",
                topic = "Lexis: Pungent",
                year = "2016",
                questionText = "The room was filled with the pungent smell of tobacco.",
                optionA = "placid",
                optionB = "mild",
                optionC = "sharp and biting",
                optionD = "acrid",
                correctAnswerIndex = 2,
                explanation = "'Pungent' means having a sharply strong taste or smell.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q63"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2016_15",
                subject = "English Language",
                topic = "Lexis: Languid",
                year = "2016",
                questionText = "He lifted his hand in languid manner.",
                optionA = "sluggish and relaxed",
                optionB = "friendly",
                optionC = "energetic",
                optionD = "sheepish",
                correctAnswerIndex = 0,
                explanation = "'Languid' means displaying or having a disinclination for physical exertion or effort; slow and relaxed.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q64"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2016_16",
                subject = "English Language",
                topic = "Lexis: Heckled",
                year = "2016",
                questionText = "The lawmaker heckled the chairman of the panel during their last meeting.",
                optionA = "cheered up",
                optionB = "applauded",
                optionC = "shouted down and interrupted",
                optionD = "restrained",
                correctAnswerIndex = 2,
                explanation = "'Heckle' means to interrupt a public speaker with derisive or aggressive comments or abuse.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q65"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2017 & 2018 CBT EXAMS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "eng_exam_2017_01",
                subject = "English Language",
                topic = "Antonyms: Feeble",
                year = "2017",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Abiola was a very feeble man.'",
                optionA = "selfish",
                optionB = "weak",
                optionC = "strong and robust",
                optionD = "tall",
                correctAnswerIndex = 2,
                explanation = "'Feeble' means lacking physical strength, especially as a result of age or illness. The antonym is 'strong'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2017 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2017_02",
                subject = "English Language",
                topic = "Antonyms: Obnoxious",
                year = "2017",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The smell is obnoxious.'",
                optionA = "pleasant and delightful",
                optionB = "loathsome",
                optionC = "unpleasant",
                optionD = "obvious",
                correctAnswerIndex = 0,
                explanation = "'Obnoxious' means extremely unpleasant; disagreeable. Its opposite is 'pleasant'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2017 • Q32"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2017_03",
                subject = "English Language",
                topic = "Antonyms: Spendthrift",
                year = "2017",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'Aliyu was a natural spendthrift when he was single.'",
                optionA = "philanthropist",
                optionB = "miser and thrifty person",
                optionC = "gambler",
                optionD = "thrift collector",
                correctAnswerIndex = 1,
                explanation = "A 'spendthrift' is a person who spends money in an extravagant, irresponsible way. The antonym is a 'thrifty person' or 'miser'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2017 • Q33"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2017_04",
                subject = "English Language",
                topic = "Antonyms: Adverse",
                year = "2017",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'The decision will have no adverse effect on us.'",
                optionA = "inimical",
                optionB = "detrimental",
                optionC = "beneficial and advantageous",
                optionD = "lasting",
                correctAnswerIndex = 2,
                explanation = "'Adverse' means preventing success or development; harmful or unfavourable. The opposite is 'beneficial'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2017 • Q34"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2017_05",
                subject = "English Language",
                topic = "Antonyms: Despise",
                year = "2017",
                questionText = "Choose the option opposite in meaning to the italicized word:\n'I despise the way she lived her life.'",
                optionA = "abhor",
                optionB = "hate",
                optionC = "admire and respect",
                optionD = "remember",
                correctAnswerIndex = 2,
                explanation = "'Despise' means to feel contempt or a deep repugnance for something. The antonym is to 'admire' or 'respect'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2017 • Q35"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2018_01",
                subject = "English Language",
                topic = "Figures of Speech: Rock the Boat",
                year = "2018",
                questionText = "What figure of speech is expressed in the phrase '...rock the boat'?",
                optionA = "Simile",
                optionB = "Metaphor / Idiomatic Metaphor",
                optionC = "Personification",
                optionD = "Hyperbole",
                correctAnswerIndex = 1,
                explanation = "'Rock the boat' is an idiomatic metaphor meaning to disturb a stable situation or cause trouble.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2018 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2018_02",
                subject = "English Language",
                topic = "Idioms: Greenhorn",
                year = "2018",
                questionText = "From the way Ngozi behaves, it is obvious she is a greenhorn. This means that Ngozi is:",
                optionA = "arrogant",
                optionB = "cautious",
                optionC = "inexperienced and naive",
                optionD = "uncivilised",
                correctAnswerIndex = 2,
                explanation = "A 'greenhorn' is an inexperienced person, a novice, or a rookie who is new to a field or activity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2018 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_exam_2018_03",
                subject = "English Language",
                topic = "Idioms: Fool's Paradise",
                year = "2018",
                questionText = "Anyone who thinks that he can succeed in life without working hard is living in a fool's paradise. This means that such a person is:",
                optionA = "having an illusion or false hope",
                optionB = "thinking other people are fools",
                optionC = "thinking that working is merely a joke",
                optionD = "on the verge of insanity",
                correctAnswerIndex = 0,
                explanation = "A 'fool's paradise' is a state of illusory or false happiness founded on erroneous assumptions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB UTME CBT 2018 • Q33"
            )
        )

        return list
    }
}
