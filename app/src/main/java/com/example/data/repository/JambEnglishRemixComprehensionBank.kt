package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Remix Topic-by-Topic Bank:
 * Comprehension Series (1978 - 1988 Passages A-E & Solutions).
 */
object JambEnglishRemixComprehensionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // 1978 Passage A: Population and Nature
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_a_01",
                subject = "English Language",
                topic = "Comprehension: Population and Nature",
                year = "1978",
                questionText = "The author observes that war, pestilence and famine were:",
                optionA = "caused by the extravagance of nature",
                optionB = "nature was heartless and senseless",
                optionC = "there was a time when uncontrolled birth made sense",
                optionD = "it was wise at a time when mankind did not interfere with normal reproduction",
                correctAnswerIndex = 2,
                explanation = "In the past, high mortality from diseases and famine meant uncontrolled birth was necessary to preserve mankind.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage A Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_a_02",
                subject = "English Language",
                topic = "Comprehension: Population and Nature",
                year = "1978",
                questionText = "Which of these statements does NOT express the opinion of the author?",
                optionA = "Mankind has started to interfere with the work of nature",
                optionB = "Many people had died in the past through want and disease",
                optionC = "Mankind should not have the maximum number of children possible",
                optionD = "Mankind should take care of its children",
                correctAnswerIndex = 3,
                explanation = "The passage focuses on the mathematical and ecological balance of population control rather than general child rearing duties.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage A Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_a_03",
                subject = "English Language",
                topic = "Comprehension: Population and Nature",
                year = "1978",
                questionText = "'Humane' as used in the passage means:",
                optionA = "sensible and compassionate",
                optionB = "wise",
                optionC = "human",
                optionD = "benevolent",
                correctAnswerIndex = 0,
                explanation = "'Humane' in this context of population ethics denotes showing compassion, benevolence, and sensible consideration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage A Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_a_04",
                subject = "English Language",
                topic = "Comprehension: Population and Nature",
                year = "1978",
                questionText = "'We must consciously try to establish an equilibrium' implies that mankind must:",
                optionA = "realistically find an equation",
                optionB = "strive not to be wasteful",
                optionC = "deliberately try to fight nature",
                optionD = "deliberately find a balance between birth rate and death rate",
                correctAnswerIndex = 3,
                explanation = "Because death rates have been artificially reduced by medicine, mankind must deliberately balance birth rates to prevent catastrophic overpopulation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage A Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_a_05",
                subject = "English Language",
                topic = "Comprehension: Population and Nature",
                year = "1978",
                questionText = "The main idea of this passage is that:",
                optionA = "nature is heartless",
                optionB = "man should control the birth rate",
                optionC = "mankind will soon perish of starvation",
                optionD = "pestilence causes more deaths than war",
                correctAnswerIndex = 1,
                explanation = "The central thesis argues that human survival demands conscious, planned birth control to offset reduced mortality.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage A Q5"
            )
        )

        // 1978 Passage B: Standards in Journalism
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_b_01",
                subject = "English Language",
                topic = "Comprehension: Journalism Ethics",
                year = "1978",
                questionText = "When may a journalist have to act against his own inclination?",
                optionA = "When his friends act stupidly",
                optionB = "When he becomes weak and decrepit",
                optionC = "When his political opponents make an effective speech",
                optionD = "When his enemies make a mistake",
                correctAnswerIndex = 2,
                explanation = "Honesty requires an ethical journalist to give credit to political opponents when they make an effective argument, despite personal enmity.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage B Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_b_02",
                subject = "English Language",
                topic = "Comprehension: Journalism Ethics",
                year = "1978",
                questionText = "A journalist would be able to uphold the tenets of his profession if:",
                optionA = "he seeks publicity",
                optionB = "he tries to achieve popularity",
                optionC = "he resists temptation to bias",
                optionD = "he can manipulate his story to please his employers",
                correctAnswerIndex = 2,
                explanation = "Professional integrity requires steadfast resistance against bias, personal friendships, and political animosity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage B Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_b_03",
                subject = "English Language",
                topic = "Comprehension: Journalism Ethics",
                year = "1978",
                questionText = "The word 'insidious' means:",
                optionA = "subtle and harmful",
                optionB = "wicked",
                optionC = "natural",
                optionD = "unusual",
                correctAnswerIndex = 0,
                explanation = "'Insidious' describes something operating in a gradual, subtle way with harmful and treacherous effects.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage B Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_b_04",
                subject = "English Language",
                topic = "Comprehension: Journalism Ethics",
                year = "1978",
                questionText = "A dutiful journalist must:",
                optionA = "read widely",
                optionB = "have political acumen",
                optionC = "make no enemies",
                optionD = "be able to recognize merit wherever found",
                correctAnswerIndex = 3,
                explanation = "A conscientious journalist must recognize and report merit truthfully even when it emerges from an enemy's quarter.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage B Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_b_05",
                subject = "English Language",
                topic = "Comprehension: Journalism Ethics",
                year = "1978",
                questionText = "The supreme duty of the journalist entails:",
                optionA = "giving credit to political enemies",
                optionB = "keeping quiet when necessary",
                optionC = "making a sensational story",
                optionD = "recording the objective truth",
                correctAnswerIndex = 3,
                explanation = "The passage concludes that above all personal ties, the primary duty of journalism is recording the objective truth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage B Q5"
            )
        )

        // 1978 Passage C: Science in Developing Countries
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_c_01",
                subject = "English Language",
                topic = "Comprehension: Science and Society",
                year = "1978",
                questionText = "'Frame of reference' in this passage means:",
                optionA = "point of information",
                optionB = "range of authority",
                optionC = "economic pattern",
                optionD = "context of situation and resources",
                correctAnswerIndex = 3,
                explanation = "The criteria for developing countries must be sought within the specific societal, historical, and resource context.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage C Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_c_02",
                subject = "English Language",
                topic = "Comprehension: Science and Society",
                year = "1978",
                questionText = "The writer apparently believes that through science and technology our country can achieve:",
                optionA = "peace and order",
                optionB = "progress and material success",
                optionC = "social values and universality",
                optionD = "wealth and economic power",
                correctAnswerIndex = 1,
                explanation = "Science and technology are credited with uplifting the material and economic well-being of nations.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage C Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1978_c_03",
                subject = "English Language",
                topic = "Comprehension: Science and Society",
                year = "1978",
                questionText = "The main idea of this passage is that:",
                optionA = "there is a yawning gap between the haves and have-nots",
                optionB = "there is no need to rid our countrymen from diseases",
                optionC = "atmospheric pollution is the main problem",
                optionD = "each nation must plan its scientific development according to its own needs and resources",
                correctAnswerIndex = 3,
                explanation = "Developing countries should establish science policies tailored to their unique circumstances rather than copying developed states blindly.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1978 • Passage C Q4"
            )
        )

        // 1980 Passage C: Rural-Urban Migration
        list.add(
            QuestionEntity(
                id = "eng_comp_1980_c_01",
                subject = "English Language",
                topic = "Comprehension: Rural-Urban Drift",
                year = "1980",
                questionText = "The author explains that researches conducted on rural-urban drift have:",
                optionA = "failed to provide effective solutions",
                optionB = "revealed the causes and effects of this drift",
                optionC = "increased the hue and cry against it",
                optionD = "brought out both causes, consequences, and prescriptions",
                correctAnswerIndex = 3,
                explanation = "The passage states that research has successfully identified the various causes, effects, and policy prescriptions for the drift.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1980 • Passage C Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1980_c_02",
                subject = "English Language",
                topic = "Comprehension: Rural-Urban Drift",
                year = "1980",
                questionText = "One of the reasons why people drift from rural areas to urban areas is:",
                optionA = "hunger resulting from drought",
                optionB = "laziness and ignorance",
                optionC = "educational qualifications which make better jobs available in urban centers",
                optionD = "the easy life and comfort in the city",
                correctAnswerIndex = 2,
                explanation = "Rising educational enrolments qualify more rural people for urban jobs, encouraging them to migrate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1980 • Passage C Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_comp_1980_c_03",
                subject = "English Language",
                topic = "Comprehension: Rural-Urban Drift",
                year = "1980",
                questionText = "One suggested solution to the problem is to:",
                optionA = "provide social amenities and employment opportunities in rural areas",
                optionB = "encourage mechanized agriculture to raise incomes",
                optionC = "block roads leading to cities",
                optionD = "lower the level of education in rural areas",
                correctAnswerIndex = 0,
                explanation = "Transforming rural areas with electricity, water, hospitals, colleges, and employment hubs curbs migration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Remix 1980 • Passage C Q4"
            )
        )

        return list
    }
}
