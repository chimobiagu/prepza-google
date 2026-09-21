package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, verified, and organized JAMB Use of English Historical Series: 1986 - 1990.
 * Standardized with 4 options (A-D), complete passage context, verified answers, and pedagogical explanations.
 */
object JambEnglishHistoricalVolume3Bank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // JAMB USE OF ENGLISH 1986
        // =========================================================================
        val passage1986_fashion = """
            It is customary nowadays among fashionable ladies and gentlemen to acquire strange and sometimes quaint clothes which are scarcely ever used. Sometimes it may be an approaching festival, sometimes a two-hour ceremony and sometimes to honour a dead colleague – something triggers off the modern craze to sew new materials whose use does not outlast the moment of craze. And so, people who just occupy small apartments in their parent homes, or have rented one room in a densely-populated house find that more than two-thirds of their rooms are filled with bongo trousers which they cannot wear, worn out jeans which stink, or specially made cloth for occasions that are not recurrent.
            Although plagued by the problem of school fees for their children, parents have had to swallow their own phlegm and humour their children who need special clothes for important events. Newly employed youths soon find that their comrades are getting married, and a new and special attire must be used to grace the occasion. University students see matriculation ceremonies or induction ceremonies into club membership as special reasons to make new attire which they would not wear on another occasion.
            Medical doctors may soon find another cause for the incidence of high blood pressure among the youth. 'The desire to acquire new clothes' is one strong possible cause, but a more subtle one which haunts like a ghost is the problem of choice of what to wear.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1986_001",
                subject = "English Language",
                topic = "Comprehension: Fashion Craze",
                year = "1986",
                questionText = "$passage1986_fashion\n\nA suitable title for this passage is:",
                optionA = "Fashion craze among the youth",
                optionB = "University students and induction ceremonies",
                optionC = "Parents and the money for fashion craze",
                optionD = "The modern clothing industry",
                correctAnswerIndex = 0,
                explanation = "The passage primarily discusses how young people and fashionable individuals obsessively acquire new clothes for one-off occasions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_002",
                subject = "English Language",
                topic = "Comprehension: Idioms in Context",
                year = "1986",
                questionText = "$passage1986_fashion\n\nIn this passage, 'parents have had to swallow their own phlegm' means parents:",
                optionA = "Had to swallow the sputum in their mouths",
                optionB = "Have been phlegmatic all along",
                optionC = "Have had to overcome their own pride or prejudice to please their children",
                optionD = "Refused to pay attention to their children's needs",
                correctAnswerIndex = 2,
                explanation = "The idiom in this context means enduring hardship or putting aside personal reservations/pride to humour and accommodate their children's expensive demands.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q2"
            )
        )

        val passage1986_ludo = """
            Those who are familiar with it will tell you that Ludo, like human life itself, is a game both of chance and skill. You need skill in deciding how to make the most advantageous use of the figures that turn up on the die when you cast it. Since each player has at least four alternative ways of using his figures, two players with equal luck may fare differently, depending on how cleverly each one uses his figures. The element of luck, again as in human life, plays a dominant role however. For no matter how skilful a player may be in using the figures he gets on the die, he has a slim chance of winning if he continually throws low figures.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_1986_003",
                subject = "English Language",
                topic = "Comprehension: Ludo and Chance",
                year = "1986",
                questionText = "$passage1986_ludo\n\nAccording to the passage, Ludo is:",
                optionA = "More a game of skill than of chance",
                optionB = "A game entirely of luck",
                optionC = "A game combining both chance and strategic skill",
                optionD = "A game strictly designed for children",
                correctAnswerIndex = 2,
                explanation = "The text starts by asserting that 'Ludo, like human life itself, is a game both of chance and skill.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q11"
            )
        )

        // 1986 Lexis & Structure
        list.add(
            QuestionEntity(
                id = "eng_1986_026",
                subject = "English Language",
                topic = "Antonyms: Flexible",
                year = "1986",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'Mr. Jack was most flexible in his instructions.'",
                optionA = "rigid",
                optionB = "correct",
                optionC = "stiff",
                optionD = "upright",
                correctAnswerIndex = 0,
                explanation = "'Flexible' means adaptable, yielding, or open to change. Its direct antonym is 'rigid'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_027",
                subject = "English Language",
                topic = "Antonyms: Temporary",
                year = "1986",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'The University has offered temporary accommodation to its staff.'",
                optionA = "popular",
                optionB = "permanent",
                optionC = "recognized",
                optionD = "regular",
                correctAnswerIndex = 1,
                explanation = "'Temporary' means lasting for a limited time. Its opposite is 'permanent'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_031",
                subject = "English Language",
                topic = "Antonyms: Liable",
                year = "1986",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'The debtor's husband is liable for his wife's debts.'",
                optionA = "unanswerable",
                optionB = "responsible",
                optionC = "unquestionable",
                optionD = "accountable",
                correctAnswerIndex = 0,
                explanation = "'Liable' means legally responsible or answerable. Its opposite is 'unanswerable' (not responsible or not held accountable).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_036",
                subject = "English Language",
                topic = "Idioms & Synonyms: At liberty",
                year = "1986",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'You are free to leave the hall.'",
                optionA = "at an advantage",
                optionB = "opportuned",
                optionC = "at liberty",
                optionD = "entitled",
                correctAnswerIndex = 2,
                explanation = "To be 'free' to do something means to be 'at liberty' to do it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_044",
                subject = "English Language",
                topic = "Idioms: Nipped in the bud",
                year = "1986",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'His attempts were nipped in the bud.'",
                optionA = "unsuccessful",
                optionB = "cut short",
                optionC = "frustrated",
                optionD = "disqualified",
                correctAnswerIndex = 1,
                explanation = "To 'nip something in the bud' means to stop or cut it short at an early stage before it can develop.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_054",
                subject = "English Language",
                topic = "Idioms: Off the record",
                year = "1986",
                questionText = "Choose the option nearest in meaning to the underlined phrase:\n'The pressman said that his interview with the President was off the record.'",
                optionA = "not written in government record books",
                optionB = "not intended for publication",
                optionC = "not tape-recorded",
                optionD = "spoken in secret code",
                correctAnswerIndex = 1,
                explanation = "'Off the record' means provided on the understanding that the information is unofficial and not to be published or disclosed with attribution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q54"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_070",
                subject = "English Language",
                topic = "Spelling: Trafficking",
                year = "1986",
                questionText = "Choose the correct spelling:\n'Four persons accused of currency _____ are being held by security agents.'",
                optionA = "traficking",
                optionB = "traviking",
                optionC = "trafficking",
                optionD = "traffiking",
                correctAnswerIndex = 2,
                explanation = "The verb 'traffic' adds a 'k' before '-ing', resulting in the standard spelling 'trafficking'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q70"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_082",
                subject = "English Language",
                topic = "Vocabulary & Spelling: Seize",
                year = "1986",
                questionText = "Choose the correct spelling:\n'The officer was compelled to _____ the suspect’s car.'",
                optionA = "seize",
                optionB = "cease",
                optionC = "sieze",
                optionD = "sease",
                correctAnswerIndex = 0,
                explanation = "The verb meaning to confiscate or take legal possession of is spelled 'seize' (e-i-z-e).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q82"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_085",
                subject = "English Language",
                topic = "Vocabulary & Spelling: Defused",
                year = "1986",
                questionText = "Choose the correct spelling:\n'The brave officer _____ the time bomb.'",
                optionA = "diffused",
                optionB = "devused",
                optionC = "defused",
                optionD = "difused",
                correctAnswerIndex = 2,
                explanation = "To 'defuse' a bomb means to deactivate its fuse or make it unable to explode.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q85"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1986_094",
                subject = "English Language",
                topic = "Nouns: Uncountable Noun Luggage",
                year = "1986",
                questionText = "Choose the correct expression:\n'He decided to wait for the bus because he had _____.'",
                optionA = "too many luggage",
                optionB = "many luggages",
                optionC = "a lot of luggage",
                optionD = "plenty luggages",
                correctAnswerIndex = 2,
                explanation = "'Luggage' is an uncountable non-count noun. It cannot take plural 's' or 'many'; 'a lot of luggage' is correct.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1986 • Q94"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 1988
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_1988_026",
                subject = "English Language",
                topic = "Antonyms: Eradicate",
                year = "1988",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'Our government is making determined efforts to eradicate illiteracy.'",
                optionA = "compulsory",
                optionB = "ineffective",
                optionC = "innocent",
                optionD = "unreliable",
                correctAnswerIndex = 1,
                explanation = "In the sentence, 'determined' (resolute, effective) is contrasted with 'ineffective' efforts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1988 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1988_030",
                subject = "English Language",
                topic = "Antonyms: Densely",
                year = "1988",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'Coastal plains are often very densely populated.'",
                optionA = "weakly",
                optionB = "badly",
                optionC = "rarely",
                optionD = "sparsely",
                correctAnswerIndex = 3,
                explanation = "The antonym of 'densely' populated is 'sparsely' populated.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1988 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1988_032",
                subject = "English Language",
                topic = "Antonyms: Plaintiff",
                year = "1988",
                questionText = "Choose the option opposite in meaning to the underlined word:\n'The judge blamed the plaintiff for misleading the court.'",
                optionA = "defendant",
                optionB = "complainant",
                optionC = "accused",
                optionD = "prosecution",
                correctAnswerIndex = 0,
                explanation = "In a civil lawsuit, the 'plaintiff' brings the case, while the 'defendant' is the party being sued.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1988 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1988_039",
                subject = "English Language",
                topic = "Idioms: Cupboard love",
                year = "1988",
                questionText = "Choose the option that best explains the underlined idiom:\n'Jimoh has cupboard love for Sidikatu.'",
                optionA = "Love that never fails",
                optionB = "Genuine and unconditional love",
                optionC = "Love shown only in order to get something desired",
                optionD = "Love that can fail in times of adversity",
                correctAnswerIndex = 2,
                explanation = "'Cupboard love' is an affection that is given purely in order to gain a personal benefit, food, or favour.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1988 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1988_048",
                subject = "English Language",
                topic = "Idioms: Set the cat among the pigeons",
                year = "1988",
                questionText = "Choose the option that best explains the underlined idiom:\n'The senator had the habit of setting the cat among the pigeons whenever matters concerning his constituency came up.'",
                optionA = "Illuminating issues that are not clear",
                optionB = "Monopolizing the discussion",
                optionC = "Making frequent points of order",
                optionD = "Introducing elements of controversy and turmoil",
                correctAnswerIndex = 3,
                explanation = "To 'set the cat among the pigeons' means to say or do something that causes immense trouble, controversy, or debate.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1988 • Q48"
            )
        )

        // =========================================================================
        // JAMB USE OF ENGLISH 1989 & 1990
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_1989_067",
                subject = "English Language",
                topic = "Participles: Determining factor",
                year = "1989",
                questionText = "Choose the correct verbal adjective:\n'A student’s natural ability should be a _____ factor in choosing a course of study.'",
                optionA = "determined",
                optionB = "determining",
                optionC = "determinant",
                optionD = "determinate",
                correctAnswerIndex = 1,
                explanation = "'Determining factor' is the standard English collocation meaning a factor that decisively affects an outcome.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1989 • Q67"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1989_074",
                subject = "English Language",
                topic = "Nouns: Arms and ammunition",
                year = "1989",
                questionText = "Choose the correct phrase:\n'The soldiers were sufficiently equipped with _____.'",
                optionA = "arms and ammunition",
                optionB = "arms and ammunitions",
                optionC = "arm and ammunitions",
                optionD = "arm and ammunition",
                correctAnswerIndex = 0,
                explanation = "The standard military idiom is 'arms and ammunition' ('ammunition' is uncountable).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1989 • Q74"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1989_076",
                subject = "English Language",
                topic = "Order of Adjectives",
                year = "1989",
                questionText = "Choose the option with the correct order of adjectives:\n'Okoro intends to wear his _____ dress to the zoo this afternoon.'",
                optionA = "white cotton new",
                optionB = "white new cotton",
                optionC = "new white cotton",
                optionD = "cotton white new",
                correctAnswerIndex = 2,
                explanation = "Standard adjective order: Age (new) + Colour (white) + Material (cotton) + Noun (dress).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1989 • Q76"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1990_061",
                subject = "English Language",
                topic = "Verbs: Lie vs Lay",
                year = "1990",
                questionText = "Choose the correct past tense form:\n'After Jerry had made the bed, he _____ on it.'",
                optionA = "layed",
                optionB = "laid",
                optionC = "lied",
                optionD = "lay",
                correctAnswerIndex = 3,
                explanation = "The past tense of the intransitive verb 'lie' (to recline) is 'lay'. ('Laid' is the past of transitive 'lay', meaning to place something).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1990 • Q61"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1990_072",
                subject = "English Language",
                topic = "Spelling: Privilege",
                year = "1990",
                questionText = "Choose the correct spelling:\n'I have the _____ of meeting him.'",
                optionA = "previlege",
                optionB = "privilege",
                optionC = "previledge",
                optionD = "priviledge",
                correctAnswerIndex = 1,
                explanation = "'Privilege' is spelled with 'i' in the first two syllables and no 'd' (p-r-i-v-i-l-e-g-e).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1990 • Q72"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_1990_090",
                subject = "English Language",
                topic = "Phrasal Verbs: Break down",
                year = "1990",
                questionText = "Choose the correct phrasal verb:\n'Bola broke _____ when he heard the news of the arrest of his twin brother.'",
                optionA = "up",
                optionB = "off",
                optionC = "away",
                optionD = "down",
                correctAnswerIndex = 3,
                explanation = "To 'break down' means to lose control of one's emotions and weep or collapse under grief.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 1990 • Q90"
            )
        )

        return list
    }
}
