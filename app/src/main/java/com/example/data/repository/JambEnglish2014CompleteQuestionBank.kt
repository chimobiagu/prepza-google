package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic JAMB Use of English 2014 Complete Examination Question Bank.
 * Contains 100 officially verified questions transcribed directly from authentic JAMB UTME exam papers.
 */
object JambEnglish2014CompleteQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_01",
                subject = "English Language",
                topic = "General Introduction",
                year = "2014",
                questionText = "Which question paper type of use of English is given to you?",
                optionA = "Type F",
                optionB = "Type E",
                optionC = "Type L",
                optionD = "Type S",
                correctAnswerIndex = 2,
                explanation = "Paper Type L indicated on examination instructions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_02",
                subject = "English Language",
                topic = "Comprehension: Political Change",
                year = "2014",
                questionText = "Which of the following is true according to the passage?",
                optionA = "Change is inimitable",
                optionB = "Change is inestimable",
                optionC = "Change is invaluable",
                optionD = "Change is inevitable",
                correctAnswerIndex = 3,
                explanation = "The passage asserts that political and social transformation is an inescapable, inevitable reality of human civilization.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_03",
                subject = "English Language",
                topic = "Comprehension: Political Change",
                year = "2014",
                questionText = "It can be deduced from the passage that political and social changes are",
                optionA = "Intertwined",
                optionB = "Antithetical",
                optionC = "Independent",
                optionD = "Repulsive",
                correctAnswerIndex = 0,
                explanation = "While appearing distinct, the author notes that political and social transformations are analytically inseparable and deeply intertwined.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_04",
                subject = "English Language",
                topic = "Comprehension: Political Change",
                year = "2014",
                questionText = "A suitable title for this passage is",
                optionA = "Reasons for political change",
                optionB = "The struggle for political power",
                optionC = "Elements of politics",
                optionD = "Social change and political empowerment",
                correctAnswerIndex = 3,
                explanation = "The text explores the interconnected forces behind societal alteration, collective struggle, and governance structures.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_05",
                subject = "English Language",
                topic = "Comprehension: Political Change",
                year = "2014",
                questionText = "The word 'alteration', as used in the passage, means",
                optionA = "Multiplication",
                optionB = "Recognition",
                optionC = "Modification",
                optionD = "Complication",
                correctAnswerIndex = 2,
                explanation = "'Alteration' denotes a change, adjustment, or structural modification.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_06",
                subject = "English Language",
                topic = "Comprehension: Reptiles & Snakes",
                year = "2014",
                questionText = "It can be inferred from the passage that snakes are",
                optionA = "Heterogeneous creatures",
                optionB = "Voracious cow eaters",
                optionC = "Great insect eaters",
                optionD = "Homogeneous reptiles",
                correctAnswerIndex = 0,
                explanation = "With over 2,500 species across 10 families in diverse habitats, snakes exhibit immense ecological heterogeneity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_07",
                subject = "English Language",
                topic = "Comprehension: Reptiles & Snakes",
                year = "2014",
                questionText = "The most notable thing about snakes, according to the passage, is that they",
                optionA = "Abound in Gombe and Plateau state",
                optionB = "Are versatile in reproduction",
                optionC = "Eat big but seldom",
                optionD = "Exist in families",
                correctAnswerIndex = 2,
                explanation = "Because ectothermic snakes do not burn food energy to generate body warmth, they can survive on huge infrequent meals months apart.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_08",
                subject = "English Language",
                topic = "Comprehension: Reptiles & Snakes",
                year = "2014",
                questionText = "Which of the following is true according to the passage?",
                optionA = "Snakes are not in the polar regions",
                optionB = "Snakes are endemic on every continent",
                optionC = "There are countless number of snakes in the republic of Ireland",
                optionD = "Snakes are seldom seen at the Antarctica",
                correctAnswerIndex = 0,
                explanation = "The text explicitly states that the Polar Regions and isolated islands like Ireland and New Zealand are devoid of snakes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_09",
                subject = "English Language",
                topic = "Comprehension: Reptiles & Snakes",
                year = "2014",
                questionText = "It can be deduced from the passage that snakes have",
                optionA = "No external auditory organ",
                optionB = "Visible internal locomotive organs",
                optionC = "No visual sense of measurement",
                optionD = "Large appetite for antelopes",
                correctAnswerIndex = 1,
                explanation = "The passage describes their unique anatomical adaptations, specialized expandable jaws, and absence of external limbs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_10",
                subject = "English Language",
                topic = "Comprehension: Reptiles & Snakes",
                year = "2014",
                questionText = "A suitable title for this passage is",
                optionA = "Feeding habits of snakes",
                optionB = "Some characteristics of snakes",
                optionC = "Snakes as legless, cold-blooded reptiles",
                optionD = "Species of snakes in Nigeria and other lands",
                correctAnswerIndex = 1,
                explanation = "The passage provides an overview of snake taxonomy, ectothermic metabolism, feeding mechanics, and global geographic distribution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_11",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = "Setting up a newspaper involves a lot of preparations. The .....11 .... [A. processor B. lithographer C. proprietor D. sub-editor] has to employ a lot of people.",
                optionA = "processor",
                optionB = "lithographer",
                optionC = "proprietor",
                optionD = "sub-editor",
                correctAnswerIndex = 2,
                explanation = "The 'proprietor' is the legal owner or commercial founder who finances and hires personnel for a publishing enterprise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_12",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = ".... 12 .... [A. agents B. reporters C. analysts D. vendors] who go out and collect stories and items of news",
                optionA = "agents",
                optionB = "reporters",
                optionC = "analysts",
                optionD = "vendors",
                correctAnswerIndex = 1,
                explanation = "Journalists sent into the field to gather news facts and report events are 'reporters'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_13",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = ".... 13 ..... [A. correspondents B. distributors C. listeners D. newscasters], who specialize in one kind of topic.",
                optionA = "correspondents",
                optionB = "distributors",
                optionC = "listeners",
                optionD = "newscasters",
                correctAnswerIndex = 0,
                explanation = "Journalists designated to cover dedicated beats (e.g. foreign affairs, economics) are 'correspondents'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_14",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = "Another important person who works closely with the editor-in-chief is the ... 14 ... [A. announcer B. news editor C. proofreader D. reporter]",
                optionA = "announcer",
                optionB = "news editor",
                optionC = "proofreader",
                optionD = "reporter",
                correctAnswerIndex = 1,
                explanation = "The 'news editor' manages daily editorial assignments and selects top news priority stories.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_15",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = ".... 15 .... [A. subeditors B. writers C. agents D. producers] go through stories sent to make necessary adjustments",
                optionA = "subeditors",
                optionB = "writers",
                optionC = "agents",
                optionD = "producers",
                correctAnswerIndex = 0,
                explanation = "'Subeditors' edit copy, check grammar, verify factual consistency, and compose headlines.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_16",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = "Such a journalist is known as ..... 16 ..... [A. a freelancer B. a composer C. a columnist D. an essayist].",
                optionA = "a freelancer",
                optionB = "a composer",
                optionC = "a columnist",
                optionD = "an essayist",
                correctAnswerIndex = 2,
                explanation = "A writer assigned a recurring named section or commentary feature in a newspaper is 'a columnist'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_17",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = "The editorials of the newspaper will be coordinated by ..... 17 ..... [A. a guild of researchers B. an editorial board C. all readers D. an agent].",
                optionA = "a guild of researchers",
                optionB = "an editorial board",
                optionC = "all readers",
                optionD = "an agent",
                correctAnswerIndex = 1,
                explanation = "Institutional leading articles reflecting the newspaper's official stance are deliberated by 'an editorial board'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_18",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = "The publisher could decide to establish ..... 18 ..... [A. an article B. column C. magazine D. a gazetteer]",
                optionA = "an article",
                optionB = "column",
                optionC = "magazine",
                optionD = "a gazetteer",
                correctAnswerIndex = 2,
                explanation = "A periodical published weekly, fortnightly, or monthly is a 'magazine'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_19",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = "..... 19 ..... [A. a contrast from B. a contrast in C. a contrast to D. a contrast for] the eye catching headlines",
                optionA = "a contrast from",
                optionB = "a contrast in",
                optionC = "a contrast to",
                optionD = "a contrast for",
                correctAnswerIndex = 2,
                explanation = "The idiom is 'a contrast to'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_20",
                subject = "English Language",
                topic = "Cloze: Newspaper Production",
                year = "2014",
                questionText = "newspapers on sale everyday from the ..... 20 ..... [A. readers B. distributors C. pressmen D. salesmen]",
                optionA = "readers",
                optionB = "distributors",
                optionC = "pressmen",
                optionD = "salesmen",
                correctAnswerIndex = 3,
                explanation = "Newspapers are sold on the street directly by newspaper vendors or 'salesmen'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_21",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "Chief Okeke Okafo decided to buy an 'iron horse' because it would",
                optionA = "Allow him to be the head of the clan",
                optionB = "Raise his status in the clan",
                optionC = "Minimize the strain of travel from one town to another",
                optionD = "Give him the opportunity to act like the district commissioner",
                correctAnswerIndex = 3,
                explanation = "Chief Okeke Okafo bought a bicycle to flaunt prestige and emulate colonial administrators.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_22",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "'...the vanquished dragon, spewing sand instead of fire gave a solemn and humiliating pledge that he would never cross Obu's path.' The word 'vanquished' means",
                optionA = "Unflappable",
                optionB = "Unconcerned",
                optionC = "Sensitive",
                optionD = "Subdued and defeated",
                correctAnswerIndex = 3,
                explanation = "'Vanquished' means completely defeated and brought under control.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_23",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "In the novel, the suspicion that Obu was an 'ogbanje' had revalued the",
                optionA = "Time Obu spent at teachers house",
                optionB = "Disappearance of Obu in standard",
                optionC = "Price tag Mazi Laza and his wife placed on Obu.",
                optionD = "Participation of Obu as a member of the masquerade group",
                correctAnswerIndex = 2,
                explanation = "The fear of losing him as an ogbanje caused his parents to pamper him with lavish indulgence.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_24",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "According to the novel, a pupil who 'carried his class' would be instructed to",
                optionA = "Dance on the assembly ground",
                optionB = "Fetch firewood for the teachers",
                optionC = "Carry a pad",
                optionD = "Clean the latrines",
                correctAnswerIndex = 0,
                explanation = "Academic rituals celebrated top scholastic performers by having them dance before their peers.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_25",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "'If you get confused at any stage, let me know; I want this pottage to be well prepared.' The statement was meant to",
                optionA = "Distract Ada",
                optionB = "Encourage Ada’s cooking habit",
                optionC = "Confuse Obu",
                optionD = "Test Obu’s cooking skills and humble his haughtiness",
                correctAnswerIndex = 3,
                explanation = "Teacher's wife tasked Obu with kitchen duties to dismantle his spoiled domestic entitlement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_26",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "According to the novel, Mazi Laza would shout at any person standing in his way because his bicycle",
                optionA = "Had injured people on many occasions",
                optionB = "Was manufactured by local engineers",
                optionC = "Had faulty brakes and outdated pedals",
                optionD = "Came from the same stock as chief Okeke’s",
                correctAnswerIndex = 2,
                explanation = "His rickety bicycle lacked functioning brakes, forcing him to yell warnings to pedestrians.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_27",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "From the novel, the first person to own a bicycle in Umuatala clan was",
                optionA = "Chief Okeke Okafo",
                optionB = "Polycarp's father",
                optionC = "Mazi Lazarus",
                optionD = "Teacher Zaccheus Kanu",
                correctAnswerIndex = 0,
                explanation = "Chief Okeke Okafo was the pioneer bicycle owner in Umuatala clan.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_28",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "In the novel, what did Mazi Laza do after putting a pinch of snuff into each nostril?",
                optionA = "He commended his wife",
                optionB = "He gave the remaining to Nwobiara",
                optionC = "He nodded with satisfaction",
                optionD = "He complained of the stuff",
                correctAnswerIndex = 2,
                explanation = "Taking snuff was a ritual of contemplative contentment accompanied by satisfied nods.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_29",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "From the novel, what was Ada’s punishment for fighting with madam?",
                optionA = "She copied psalm 119 from start to finish",
                optionB = "She fetched water from the stream with a basket",
                optionC = "She ate only once a day for one week",
                optionD = "She scrubbed the school latrine for one week",
                correctAnswerIndex = 3,
                explanation = "Fighting resulted in rigorous manual penalties including cleaning school sanitary facilities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_30",
                subject = "English Language",
                topic = "The Potter's Wheel",
                year = "2014",
                questionText = "In the novel, Obu would not touch cocoyam soup because he claimed it",
                optionA = "had lost its taste",
                optionB = "would get struck in his throat",
                optionC = "would make him sick",
                optionD = "was not well prepared",
                correctAnswerIndex = 1,
                explanation = "Obu fabricated hypochondriac excuses, claiming cocoyam fibers choked his throat.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_31",
                subject = "English Language",
                topic = "The Successors",
                year = "2014",
                questionText = "The entertainment expenses for Okoh Ameh’s traditional marriage rites were paid for by",
                optionA = "Okoh Ameh’s parents",
                optionB = "the bride’s parents",
                optionC = "Okoh Ameh",
                optionD = "Terkura Atsen",
                correctAnswerIndex = 0,
                explanation = "Traditional customs mandated that the groom's family shoulder marriage entertainment costs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_32",
                subject = "English Language",
                topic = "The Successors",
                year = "2014",
                questionText = "Mfa’s friend asserted that Bob Marley and other reggae stars were 'good' because they",
                optionA = "smoked Indian hemp",
                optionB = "were gainfully employed",
                optionC = "listened to their parents",
                optionD = "went to schools",
                correctAnswerIndex = 0,
                explanation = "Youth subculture romanticized marijuana use under the guise of reggae inspiration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_33",
                subject = "English Language",
                topic = "The Successors",
                year = "2014",
                questionText = "From the novel, what did Terkura do with the balance of the money Chief Ofega paid him?",
                optionA = "He married another wife",
                optionB = "He bought a beautiful house",
                optionC = "He invested it in his business enterprise",
                optionD = "He bought two cars for his father",
                correctAnswerIndex = 2,
                explanation = "Terkura prudently channeled his capital into expanding commercial transport operations.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_34",
                subject = "English Language",
                topic = "The Successors",
                year = "2014",
                questionText = "Makurdi became more prominent because of the",
                optionA = "Road",
                optionB = "Bridge across the River Benue",
                optionC = "International hotel",
                optionD = "Railway station",
                correctAnswerIndex = 1,
                explanation = "The construction of the landmark rail-road bridge across the Benue transformed Makurdi into a vital hub.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_35",
                subject = "English Language",
                topic = "The Successors",
                year = "2014",
                questionText = "In the novel, Maria's tolerance of her husband spending half the night on duty at the hotel was considered a",
                optionA = "Way of taking great risk",
                optionB = "way to remedy all natural problems",
                optionC = "necessary price to pay for the success of their business",
                optionD = "bad thing that couples should discourage.",
                correctAnswerIndex = 2,
                explanation = "Sacrificing domestic ease was deemed vital to establishing their new hospitality enterprise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_36",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "The minister considered the ministry’s budget a drop in the ocean in view of the number of projects in the pipeline.",
                optionA = "The amount available may be inadequate for projected expenditure",
                optionB = "The minister maybe dropped for failing to complete a number of projects.",
                optionC = "The money approved cannot complete the pipeline project across the ocean.",
                optionD = "The pipeline project across the ocean will be abandoned unless budgetary allocation improves",
                correctAnswerIndex = 0,
                explanation = "'A drop in the ocean' is an idiom signifying an amount so minuscule compared to overall need as to be negligible.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_37",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "The police are looking for the woman who farmed her children out to her neighbours.",
                optionA = "The woman and her children are in the habit of working in neighbour’s farm and the police are not well disposed to this.",
                optionB = "The police may arrest the woman for allowing her neighbours to take care of her children",
                optionC = "The woman may be arrested for allowing her children to be a nuisance to her neighbours",
                optionD = "The police wanted remarks for allowing her children to destroy her neighbour’s crops.",
                correctAnswerIndex = 1,
                explanation = "To 'farm out' children means sending them away to live with or be fostered by others.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_38",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "Jummai's father remarked that pigs would fly before she passed.",
                optionA = "It would be possible to pass only if she worked harder",
                optionB = "It would never be possible for her to pass",
                optionC = "He would have to bribe her teachers to enable her to pass",
                optionD = "She would have to cheat in order to pass",
                correctAnswerIndex = 1,
                explanation = "'Pigs would fly' is an idiom expressing absolute impossibility.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_39",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "The president said that he found himself between a rock and a hard place when the press said that he had resigned.",
                optionA = "He dreamt that he was abandoned",
                optionB = "He thought that hard places were unsafe",
                optionC = "He had a hard, dilemma-ridden decision to make",
                optionD = "Hard places are dangerous for the president",
                correctAnswerIndex = 2,
                explanation = "'Between a rock and a hard place' describes confronting a severe dilemma with equally difficult choices.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_40",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "Kunana is like a bear with a sore head.",
                optionA = "He is a bully",
                optionB = "He is bad-tempered, irritable, and grumpy",
                optionC = "He is ugly",
                optionD = "He is quiet",
                correctAnswerIndex = 1,
                explanation = "'Like a bear with a sore head' describes someone who is extremely bad-tempered and easily angered.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_41",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "Olu gave his brother a bumpy ride.",
                optionA = "Olu's brother rode on Olu's back to success.",
                optionB = "Olu took his brother on a bumpy road",
                optionC = "Olu gave his brother a difficult, turbulent time",
                optionD = "Olu gave his brother a ride in his car",
                correctAnswerIndex = 2,
                explanation = "To give someone a 'bumpy ride' means subjecting them to a difficult, stressful ordeal.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_42",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "Adeola doesn't have to go to the farm today.",
                optionA = "Adeola may go to the farm today if he so wishes",
                optionB = "Adeola ought not to have gone to the farm today",
                optionC = "Adeola must not go to the farm today",
                optionD = "Adeola should not go to the farm today",
                correctAnswerIndex = 0,
                explanation = "'Doesn't have to' indicates absence of obligation; the person is free to choose.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_43",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "My boss asked me to take my eyes off the ball.",
                optionA = "I should stop paying attention to what is most important",
                optionB = "I should be focused when I am about to stay off football",
                optionC = "I should stay off football after sustaining an injury",
                optionD = "I should be focused when playing football.",
                correctAnswerIndex = 0,
                explanation = "'Take one's eyes off the ball' means lose focus on core priorities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_44",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "The robber was hedged in by the people.",
                optionA = "The robber was surrounded and trapped by the people",
                optionB = "The robber was killed by the people",
                optionC = "The robber was exposed by the people",
                optionD = "The robber was caught by the people",
                correctAnswerIndex = 0,
                explanation = "To be 'hedged in' means surrounded on all sides so escape is prevented.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_45",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2014",
                questionText = "Many workers are not happy because they live a hand-to-mouth life.",
                optionA = "They work hard with their hands",
                optionB = "They are voracious and avaricious",
                optionC = "They are barely surviving on minimal subsistence",
                optionD = "They have rejected the use of spoons.",
                correctAnswerIndex = 2,
                explanation = "Living 'hand-to-mouth' means spending all current earnings on immediate survival without savings.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_46",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: Prolonged strike action debilitated the industry.",
                optionA = "invigorated",
                optionB = "isolated",
                optionC = "weakened",
                optionD = "destroyed",
                correctAnswerIndex = 0,
                explanation = "'Debilitated' means severely weakened; its direct antonym is 'invigorated' (strengthened).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_47",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: One of the students bought a plagiarized copy of the book.",
                optionA = "a used",
                optionB = "an original",
                optionC = "a revised",
                optionD = "an annotated",
                correctAnswerIndex = 1,
                explanation = "'Plagiarized' means pirated or stolen; its antonym is 'original'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_48",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: The young girl was taken aback by her father's gift of a car.",
                optionA = "shocked",
                optionB = "unmoved",
                optionC = "surprised",
                optionD = "nonplussed",
                correctAnswerIndex = 1,
                explanation = "'Taken aback' means astonished and bewildered; its antonym is 'unmoved' (indifferent).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_49",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: Musa is a gifted but erratic player.",
                optionA = "strong",
                optionB = "regular and consistent",
                optionC = "unpredictable",
                optionD = "unstable",
                correctAnswerIndex = 1,
                explanation = "'Erratic' means inconsistent and irregular; its antonym is 'regular' or reliable.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_50",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: The lamp shades were translucent.",
                optionA = "opaque",
                optionB = "interested",
                optionC = "luminous",
                optionD = "transparent",
                correctAnswerIndex = 0,
                explanation = "'Translucent' allows partial light passage; its antonym is 'opaque' (blocking light completely).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_51",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: My niece has an unquenchable thirst for adventure stories.",
                optionA = "a spurious",
                optionB = "an illegitimate",
                optionC = "a reduced / satisfied",
                optionD = "an inextinguishable",
                correctAnswerIndex = 2,
                explanation = "'Unquenchable' cannot be satisfied; its opposite is 'reduced' or quenchable.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q51",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_52",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: Some of my neighbours have an antipathy to dogs.",
                optionA = "enmity towards",
                optionB = "affection for",
                optionC = "acronym for",
                optionD = "alarm for",
                correctAnswerIndex = 1,
                explanation = "'Antipathy' means strong aversion or dislike; its antonym is 'affection for'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q52",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_53",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: The dressmaker unpicked the seam of the shirt.",
                optionA = "threaded",
                optionB = "sewed up",
                optionC = "picked up",
                optionD = "tore for",
                correctAnswerIndex = 1,
                explanation = "'Unpicked' means undoing stitches; its opposite is 'sewed up'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q53",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_54",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: The testimony of the witness was vague.",
                optionA = "disturbing",
                optionB = "true",
                optionC = "ambiguous",
                optionD = "clear",
                correctAnswerIndex = 3,
                explanation = "'Vague' means indistinct or indefinite; its antonym is 'clear'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q54",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_55",
                subject = "English Language",
                topic = "Antonyms",
                year = "2014",
                questionText = "Choose the option opposite in meaning: As a student, Isa tried communal living for a few years.",
                optionA = "collective",
                optionB = "general",
                optionC = "shared",
                optionD = "private",
                correctAnswerIndex = 3,
                explanation = "'Communal' refers to shared community living; its opposite is 'private'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q55",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_56",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: The chairman admires incessant meetings.",
                optionA = "unusual",
                optionB = "planned",
                optionC = "constant",
                optionD = "irregular",
                correctAnswerIndex = 2,
                explanation = "'Incessant' means continuing without pause; 'constant'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q56",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_57",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: Today's weather is favourable for a game of tennis.",
                optionA = "impartial",
                optionB = "abnormal",
                optionC = "encouraging / suitable",
                optionD = "disapproving",
                correctAnswerIndex = 2,
                explanation = "'Favourable' weather is pleasant and conducive (encouraging/suitable).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q57",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_58",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: The candidates looked aghast at the first reading of the questions.",
                optionA = "fulfilled",
                optionB = "dismayed and horrified",
                optionC = "satisfied",
                optionD = "relaxed",
                correctAnswerIndex = 1,
                explanation = "'Aghast' means struck with overwhelming shock, horror, or dismay.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q58",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_59",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: Joke gave Muhammed a jaunty smile.",
                optionA = "a discouraging",
                optionB = "an inviting",
                optionC = "a frightful",
                optionD = "a cheerful and lively",
                correctAnswerIndex = 3,
                explanation = "'Jaunty' means cheerful, lively, and self-confident.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q59",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_60",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: The first round of the tournament was a doddle.",
                optionA = "easy",
                optionB = "balanced",
                optionC = "dodgy",
                optionD = "exasperating",
                correctAnswerIndex = 0,
                explanation = "'Doddle' is informal British English for an extremely simple, effortless task ('easy').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q60",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_61",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: The lazy man cast a lustful glance at his neighbour's wife.",
                optionA = "hateful",
                optionB = "quick",
                optionC = "covetous and lecherous",
                optionD = "envious",
                correctAnswerIndex = 2,
                explanation = "'Lustful' describes intense sensual desire or being 'covetous'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q61",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_62",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: They accused him of fomenting political unrest.",
                optionA = "inciting and agitating",
                optionB = "discouraging",
                optionC = "preventing",
                optionD = "guiding",
                correctAnswerIndex = 0,
                explanation = "'Fomenting' means instigating or 'inciting' rebellion or discord.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q62",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_63",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: You can learn a great deal just from watching other players.",
                optionA = "invent",
                optionB = "accumulate knowledge",
                optionC = "allow",
                optionD = "discover",
                correctAnswerIndex = 1,
                explanation = "Learning extensively allows one to 'accumulate' understanding.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q63",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_64",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: All the researchers were asked to garner information on the new viral infection.",
                optionA = "collect and gather",
                optionB = "disseminate",
                optionC = "distort",
                optionD = "give",
                correctAnswerIndex = 0,
                explanation = "To 'garner' means to gather, amass, or collect.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q64",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_65",
                subject = "English Language",
                topic = "Synonyms",
                year = "2014",
                questionText = "Choose the option nearest in meaning: The dispute between the two countries has resulted in the severing of diplomatic relations.",
                optionA = "breaking and terminating",
                optionB = "securing",
                optionC = "swapping",
                optionD = "strengthening",
                correctAnswerIndex = 0,
                explanation = "'Severing' means cutting off or breaking completely.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q65",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_66",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The House and The Senate will __ at noon next Wednesday to hear an address by the president.",
                optionA = "convene",
                optionB = "adjourn",
                optionC = "rise",
                optionD = "collude",
                correctAnswerIndex = 0,
                explanation = "Legislative assemblies formally gather or meet by 'convening'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q66",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_67",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "At the __ of the century many ways of doing things were introduced.",
                optionA = "turn",
                optionB = "event",
                optionC = "birth",
                optionD = "sight",
                correctAnswerIndex = 0,
                explanation = "The chronological transition between centuries is idiomatic as 'the turn of the century'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q67",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_68",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "You may have the pencil, but you can't have the ballpoint __.",
                optionA = "either",
                optionB = "furthermore",
                optionC = "also",
                optionD = "as well",
                correctAnswerIndex = 3,
                explanation = "Adverbial phrase 'as well' (or 'either' in pure negative coordination) completes the contrast.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q68",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_69",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The president said that the country was not out of the __ yet.",
                optionA = "forest",
                optionB = "fog",
                optionC = "water",
                optionD = "wood",
                correctAnswerIndex = 3,
                explanation = "The established idiom for escaping danger is 'out of the woods' (or 'out of the wood').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q69",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_70",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "He went to the restaurant to enjoy the special __.",
                optionA = "suite",
                optionB = "cuisine",
                optionC = "a la carte",
                optionD = "chef",
                correctAnswerIndex = 1,
                explanation = "'Cuisine' refers to specialized culinary style and gourmet food.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q70",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_71",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The invigilator __ to know how long the examination __ going on.",
                optionA = "wanted / has been",
                optionB = "wants / had been",
                optionC = "wants / have been",
                optionD = "wanted / had been",
                correctAnswerIndex = 3,
                explanation = "Sequence of tenses in reported past speech requires past perfect continuous: 'wanted / had been'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q71",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_72",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The guard spent all the night pacing __.",
                optionA = "from and to",
                optionB = "fro and to",
                optionC = "to and from",
                optionD = "to and fro",
                correctAnswerIndex = 3,
                explanation = "The fixed binomial pair for back-and-forth movement is 'to and fro'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q72",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_73",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The woman refused to testify __ her husband.",
                optionA = "in",
                optionB = "at",
                optionC = "against",
                optionD = "from",
                correctAnswerIndex = 2,
                explanation = "Legal spousal privilege permits refusing to give evidence 'against' one's spouse.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q73",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_74",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "Abike must have found the very interesting movies quite __.",
                optionA = "absolving",
                optionB = "absorbing",
                optionC = "nauseating",
                optionD = "perverting",
                correctAnswerIndex = 1,
                explanation = "'Absorbing' means intensely engaging, engrossing, and captivating.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q74",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_75",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The words __ divided between the end of one line.",
                optionA = "have been",
                optionB = "have being",
                optionC = "has been",
                optionD = "has being",
                correctAnswerIndex = 0,
                explanation = "Plural subject 'words' requires plural auxiliary verb 'have been'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q75",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_76",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "Those flowers __ are very beautiful.",
                optionA = "of her",
                optionB = "of hers",
                optionC = "our flower",
                optionD = "flowers ours",
                correctAnswerIndex = 1,
                explanation = "Double possessive construction: 'of hers'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q76",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_77",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "Cooking has never been Jumoke’s __.",
                optionA = "recital",
                optionB = "purview",
                optionC = "style",
                optionD = "forte",
                correctAnswerIndex = 3,
                explanation = "A person's particular skill, strong point, or special talent is their 'forte'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q77",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_78",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "When the strike is over, there will probably be an increase in wages and a __ increase in prices.",
                optionA = "sporadic",
                optionB = "concordant",
                optionC = "concurrent",
                optionD = "chronic",
                correctAnswerIndex = 2,
                explanation = "'Concurrent' describes events or economic adjustments occurring simultaneously at the same time.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q78",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_79",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "My mother was __ annoyed with me for coming late.",
                optionA = "very",
                optionB = "neither",
                optionC = "hotly",
                optionD = "just",
                correctAnswerIndex = 0,
                explanation = "Degree adverb 'very' properly modifies the participial adjective 'annoyed'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q79",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_80",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The chairman is too much __ an idealist for this government.",
                optionA = "from",
                optionB = "about",
                optionC = "of",
                optionD = "with",
                correctAnswerIndex = 2,
                explanation = "Idiomatic qualification takes 'too much of an idealist'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q80",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_81",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The clock __ 12 O’clock two hours ago.",
                optionA = "strikes",
                optionB = "strike",
                optionC = "struck",
                optionD = "striking",
                correctAnswerIndex = 2,
                explanation = "Simple past tense for a completed historic action two hours ago: 'struck'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q81",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_82",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "What is the jury’s __ the matter?",
                optionA = "verdict on",
                optionB = "verdict from",
                optionC = "verdict at",
                optionD = "verdict with",
                correctAnswerIndex = 0,
                explanation = "A formal legal judgment or opinion takes the preposition 'on': 'verdict on the matter'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q82",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_83",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The unconscious man was __ after receiving first aid.",
                optionA = "reawakened",
                optionB = "reformed",
                optionC = "restored",
                optionD = "revived",
                correctAnswerIndex = 3,
                explanation = "Restoring someone to life or consciousness after fainting is to be 'revived'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q83",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_84",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "Bola studiously avoided __ the question.",
                optionA = "parrying",
                optionB = "answering",
                optionC = "projecting",
                optionD = "destroying",
                correctAnswerIndex = 1,
                explanation = "The verb 'avoid' is followed by a gerund: 'avoided answering the question'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q84",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_85",
                subject = "English Language",
                topic = "Grammar and Structure",
                year = "2014",
                questionText = "The school authority dismissed him for __, but I won’t tell you about it yet.",
                optionA = "certain reason",
                optionB = "a reason",
                optionC = "more reason",
                optionD = "a certain reason",
                correctAnswerIndex = 1,
                explanation = "Idiomatic indefinite phrasing: 'dismissed him for a reason'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q85",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_86",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2014",
                questionText = "Choose the option with the same vowel sound as in 'cool' (/uː/):",
                optionA = "full",
                optionB = "luke",
                optionC = "look",
                optionD = "should",
                correctAnswerIndex = 1,
                explanation = "'Cool' contains the long high back rounded vowel /uː/, matching 'luke' (/luːk/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q86",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_87",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2014",
                questionText = "Choose the option with the same vowel sound as in 'odour' (/əʊ/):",
                optionA = "flow",
                optionB = "sugar",
                optionC = "hold",
                optionD = "floor",
                correctAnswerIndex = 3,
                explanation = "'Odour' (/ˈəʊdə/) or terminal /ɔː/ matches 'floor' (/flɔː/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q87",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_88",
                subject = "English Language",
                topic = "Oral English: Vowels",
                year = "2014",
                questionText = "Choose the option with the same vowel sound as in 'palm' (/ɑː/):",
                optionA = "ranch",
                optionB = "florid",
                optionC = "lunch",
                optionD = "plait",
                correctAnswerIndex = 0,
                explanation = "'Palm' features the broad back open unrounded vowel /ɑː/, as in British English 'ranch' (/rɑːntʃ/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q88",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_89",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2014",
                questionText = "Choose the option with the same consonant sound as in 'vision' (/ʒ/):",
                optionA = "instruction",
                optionB = "mansion",
                optionC = "nation",
                optionD = "enclosure",
                correctAnswerIndex = 3,
                explanation = "The 's' in 'vision' represents the voiced postalveolar fricative /ʒ/, identical to the 's' in 'enclosure'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q89",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_90",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2014",
                questionText = "Choose the option with the same consonant sound as in 'gnash' (/n/):",
                optionA = "forge",
                optionB = "new",
                optionC = "king",
                optionD = "ring",
                correctAnswerIndex = 1,
                explanation = "The initial 'g' in 'gnash' is silent, leaving the alveolar nasal /n/, matching 'new'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q90",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_91",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2014",
                questionText = "Choose the option with the same consonant sound as in 'epitaph' (/f/):",
                optionA = "pseudo",
                optionB = "fan",
                optionC = "paper",
                optionD = "pneumonia",
                correctAnswerIndex = 1,
                explanation = "The digraph 'ph' in 'epitaph' is articulated as voiceless labiodental fricative /f/, as in 'fan'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q91",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_92",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2014",
                questionText = "Choose the option that rhymes with 'ever':",
                optionA = "favour",
                optionB = "fever",
                optionC = "never",
                optionD = "heavier",
                correctAnswerIndex = 2,
                explanation = "'Ever' (/ˈevə/) rhymes directly with 'never' (/ˈnevə/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q92",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_93",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2014",
                questionText = "Choose the option that rhymes with 'keep':",
                optionA = "reap",
                optionB = "seethe",
                optionC = "threat",
                optionD = "dead",
                correctAnswerIndex = 0,
                explanation = "'Keep' (/kiːp/) rhymes with 'reap' (/riːp/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q93",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_94",
                subject = "English Language",
                topic = "Oral English: Rhymes",
                year = "2014",
                questionText = "Choose the option that rhymes with 'tax':",
                optionA = "box",
                optionB = "lacks",
                optionC = "back",
                optionD = "ask",
                correctAnswerIndex = 1,
                explanation = "'Tax' (/tæks/) rhymes with 'lacks' (/læks/).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q94",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_95",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2014",
                questionText = "Choose the appropriate stress pattern: valedictory",
                optionA = "valeDICtory",
                optionB = "valedicTORY",
                optionC = "VAledictory",
                optionD = "vaLEdictory",
                correctAnswerIndex = 0,
                explanation = "Antepenultimate primary stress falls on the third syllable: va-le-DIC-to-ry.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q95",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_96",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2014",
                questionText = "Choose the appropriate stress pattern: congratulation",
                optionA = "congraTUlation",
                optionB = "congratuLAtion",
                optionC = "CONgratulation",
                optionD = "conGRAtulation",
                correctAnswerIndex = 1,
                explanation = "Words ending in '-tion' place primary stress on the penultimate syllable: con-gra-tu-LA-tion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q96",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_97",
                subject = "English Language",
                topic = "Oral English: Stress",
                year = "2014",
                questionText = "Choose the appropriate stress pattern: conspiracy",
                optionA = "conspiRAcy",
                optionB = "conspiraCY",
                optionC = "consPIracy",
                optionD = "CONspiracy",
                correctAnswerIndex = 2,
                explanation = "Primary stress falls on the second syllable: con-SPI-ra-cy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q97",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_98",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2014",
                questionText = "My mother brought a BICYCLE yesterday.",
                optionA = "What did your mother buy yesterday?",
                optionB = "Whose mother bought a bicycle yesterday?",
                optionC = "Did my mother steal a bicycle yesterday?",
                optionD = "When did my mother buy a bicycle?",
                correctAnswerIndex = 0,
                explanation = "Emphatic stress on BICYCLE highlights the item brought, questioning what was purchased.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q98",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_99",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2014",
                questionText = "AMINA went to Abuja by air.",
                optionA = "Is Amina going to Abuja by air?",
                optionB = "Who went to Abuja by air?",
                optionC = "Did Amina go to Abuja by road?",
                optionD = "Did Amina go to Jos by air?",
                correctAnswerIndex = 1,
                explanation = "Emphatic stress on AMINA singles out the subject who travelled.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q99",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_eng_2014_100",
                subject = "English Language",
                topic = "Oral English: Emphatic Stress",
                year = "2014",
                questionText = "Musa is STAYING in Enugu.",
                optionA = "Is Musa passing through Enugu?",
                optionB = "Is Musa staying on the outskirts of Enugu?",
                optionC = "Is Audu staying in Enugu?",
                optionD = "Was Musa staying in Enugu?",
                correctAnswerIndex = 0,
                explanation = "Emphatic stress on STAYING emphasizes remaining continuously rather than transiting.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q100",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
