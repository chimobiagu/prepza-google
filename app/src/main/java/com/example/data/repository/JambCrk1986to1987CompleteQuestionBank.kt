package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and authentic JAMB Christian Religious Knowledge / Studies (CRK/CRS)
 * past examination series (1986 & 1987 Series).
 * Formatted into standard 4-option structure (A-D) with verified keys, topics, and detailed educational explanations.
 */
object JambCrk1986to1987CompleteQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // ==========================================
        // 1986 JAMB CRK / CRS PAST EXAMINATION (50 QUESTIONS)
        // ==========================================

        // 1986 Q1
        list.add(
            QuestionEntity(
                id = "crk_1986_01",
                subject = "CRS",
                topic = "Creation of Woman",
                year = "1986",
                questionText = "‘This at last is bone of my bones and flesh of my flesh; she shall be called Woman because she was …’",
                optionA = "The first woman",
                optionB = "The mother of all living",
                optionC = "The man’s partner",
                optionD = "Taken out of man.",
                correctAnswerIndex = 3,
                explanation = "In Genesis 2:23, Adam declares this poetical statement upon seeing the woman, naming her 'Woman' (Hebrew: Isshah) because she was taken out of 'Man' (Hebrew: Ish).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q2
        list.add(
            QuestionEntity(
                id = "crk_1986_02",
                subject = "CRS",
                topic = "Call of Abram",
                year = "1986",
                questionText = "When God called Abram out of Haran, his first place of call in Canaan was:",
                optionA = "Bethel",
                optionB = "Negeb",
                optionC = "Shechem",
                optionD = "Moreh.",
                correctAnswerIndex = 2,
                explanation = "In Genesis 12:6, Abram entered the land and passed through to the place of Shechem, to the oak of Moreh, where God promised the land to his offspring.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q3
        list.add(
            QuestionEntity(
                id = "crk_1986_03",
                subject = "CRS",
                topic = "Jacob's Dream at Bethel",
                year = "1986",
                questionText = "‘This is none other than the house of God, and this is the gate of heaven’, was said by:",
                optionA = "Abraham at Shechem",
                optionB = "Jacob at Bethel",
                optionC = "Moses at the burning bush",
                optionD = "Moses at Sinai.",
                correctAnswerIndex = 1,
                explanation = "Jacob made this awe-struck statement in Genesis 28:17 after waking up from his dream of a ladder reaching into heaven at Bethel.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q4
        list.add(
            QuestionEntity(
                id = "crk_1986_04",
                subject = "CRS",
                topic = "Israelite Bondage in Egypt",
                year = "1986",
                questionText = "The Egyptians enslaved the Israelites and forced them to build:",
                optionA = "store-cities",
                optionB = "bridges",
                optionC = "temples",
                optionD = "canals.",
                correctAnswerIndex = 0,
                explanation = "According to Exodus 1:11, the Egyptians set taskmasters over the Israelites to afflict them with heavy burdens, forcing them to build store-cities called Pithom and Raamses.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q5
        list.add(
            QuestionEntity(
                id = "crk_1986_05",
                subject = "CRS",
                topic = "The Institution of the Passover",
                year = "1986",
                questionText = "The Passover was to remind the Israelites of:",
                optionA = "God’s execution of judgment on the gods of Egypt",
                optionB = "God’s smiting of all the first born in Egypt",
                optionC = "The seven days of eating unleavened bread",
                optionD = "The eating of roasted lamb while standing.",
                correctAnswerIndex = 1,
                explanation = "The Passover was established in Exodus 12 to commemorate God passing over the Israelite homes while smiting the firstborn of the Egyptians.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q6
        list.add(
            QuestionEntity(
                id = "crk_1986_06",
                subject = "CRS",
                topic = "Consecration at Mount Sinai",
                year = "1986",
                questionText = "The consecration of the people of Israel took place at the foot of Mount:",
                optionA = "Carmel",
                optionB = "Nebo",
                optionC = "Sinai",
                optionD = "Gilboa",
                correctAnswerIndex = 2,
                explanation = "In Exodus 19, the Israelites camped at the base of Mount Sinai, where Moses consecrated them and they washed their garments to prepare for God's descent on the third day.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q7
        list.add(
            QuestionEntity(
                id = "crk_1986_07",
                subject = "CRS",
                topic = "The Golden Calf Apostasy",
                year = "1986",
                questionText = "What occasion is reflected in this statement? ‘It is not the sound of shouting for victory, or the sound of the cry of defeat, but the sound of singing that I hear.’",
                optionA = "Celebrating the Exodus",
                optionB = "Rejoicing for the water from the rock",
                optionC = "Praising God after receiving the Ten Commandments",
                optionD = "The apostasy of Aaron and the people.",
                correctAnswerIndex = 3,
                explanation = "Moses said this to Joshua in Exodus 32:18 as they descended Mount Sinai and heard the sound of revelry and singing around the golden calf.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q8
        list.add(
            QuestionEntity(
                id = "crk_1986_08",
                subject = "CRS",
                topic = "Moses' Successor",
                year = "1986",
                questionText = "When Moses was instructed to view the Promised Land afar, he:",
                optionA = "made arrangements to capture it",
                optionB = "summoned the elders and informed them about the land",
                optionC = "was struck dead immediately",
                optionD = "prayed for a successor to shepherd the people",
                correctAnswerIndex = 3,
                explanation = "In Numbers 27:15-17, upon learning he would only view Canaan from Mount Abarim but not enter it, Moses immediately petitioned God to appoint a new leader to shepherd the congregation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q9
        list.add(
            QuestionEntity(
                id = "crk_1986_09",
                subject = "CRS",
                topic = "Joshua's Farewell Address at Shechem",
                year = "1986",
                questionText = "Who gave this advice? ‘Now therefore, fear the Lord and serve him in sincerity and faithfulness; put away the gods which your fathers served beyond the River and in Egypt, and serve the Lord.’",
                optionA = "Moses",
                optionB = "Joshua",
                optionC = "Samuel",
                optionD = "David",
                correctAnswerIndex = 1,
                explanation = "Joshua gave this final charge to the assembled tribes of Israel during the renewal of the covenant at Shechem (Joshua 24:14).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q10
        list.add(
            QuestionEntity(
                id = "crk_1986_10",
                subject = "CRS",
                topic = "Gideon Refuses Kingship",
                year = "1986",
                questionText = "To whom was this addressed? ‘Rule over us you and your son and your grandson also, for you have delivered us out of the hand of Midian.’",
                optionA = "Deborah",
                optionB = "Samson",
                optionC = "Gideon",
                optionD = "Jephthah",
                correctAnswerIndex = 2,
                explanation = "Following his decisive military victory over the Midianite forces, the men of Israel offered Gideon hereditary rule over the nation, which he refused (Judges 8:22).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q11
        list.add(
            QuestionEntity(
                id = "crk_1986_11",
                subject = "CRS",
                topic = "Abimelech's Conspiracy at Shechem",
                year = "1986",
                questionText = "Who asked this question? ‘Which is better for you that all seventy of the sons of Jerubbaal rule over you, or that one rule over you?’",
                optionA = "Abimelech",
                optionB = "Ahimelech",
                optionC = "Jotham",
                optionD = "Elimelech",
                correctAnswerIndex = 0,
                explanation = "Abimelech, the son of Gideon's concubine, used this leading question in Judges 9:2 to convince the leaders of Shechem to support his coup and eliminate his seventy half-brothers.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q12
        list.add(
            QuestionEntity(
                id = "crk_1986_12",
                subject = "CRS",
                topic = "The Call of Samuel",
                year = "1986",
                questionText = "At childhood, the word of the Lord came to Samuel because he:",
                optionA = "was righteous",
                optionB = "had the qualities of a prophet",
                optionC = "was to announce the punishment for the house of Eli",
                optionD = "slept near the altar",
                correctAnswerIndex = 2,
                explanation = "God initiated His first direct revelation to Samuel to deliver a solemn confirmation of the impending doom on Eli's household due to his sons' persistent blasphemy (1 Samuel 3).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q13
        list.add(
            QuestionEntity(
                id = "crk_1986_13",
                subject = "CRS",
                topic = "Saul's Rash Oath",
                year = "1986",
                questionText = "‘Cursed be the man who takes food before evening before I am able to avenge myself on my enemies.’ This was said by Saul during the battle between Israel and the:",
                optionA = "Ammonites",
                optionB = "Jebusites",
                optionC = "Amalekites",
                optionD = "Philistines",
                correctAnswerIndex = 3,
                explanation = "During a massive pursuit of the fleeing Philistines, Saul rashly bound his soldiers to an oath of fasting, which severely depleted their strength and led to moral failure (1 Samuel 14:24).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q14
        list.add(
            QuestionEntity(
                id = "crk_1986_14",
                subject = "CRS",
                topic = "Uzzah and the Ark of God",
                year = "1986",
                questionText = "Who was the man who, in an attempt to prevent a disaster, touched the Ark and died when David was returning it to Jerusalem?",
                optionA = "Obed-edom",
                optionB = "Abinadab",
                optionC = "Uzzah",
                optionD = "Ahio",
                correctAnswerIndex = 2,
                explanation = "Uzzah was struck dead on the spot by God because he irreverently touched the sacred Ark of the Covenant to stabilize it when the oxen stumbled (2 Samuel 6:6-7).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q15
        list.add(
            QuestionEntity(
                id = "crk_1986_15",
                subject = "CRS",
                topic = "Adonijah's Usurpation Foiled",
                year = "1986",
                questionText = "The suggestion made by prophet Nathan to Bathsheba to foil Adonijah’s attempt to usurp the throne of David was to:",
                optionA = "have Adonijah banished",
                optionB = "remind David of his promise that Solomon would succeed him",
                optionC = "have Solomon secretly anointed by Zadok",
                optionD = "plead with Adonijah to abandon the attempt.",
                correctAnswerIndex = 1,
                explanation = "Nathan advised Bathsheba to go to the dying King David and remind him of his sworn oath that their son Solomon would reign after him, thereby securing the crown (1 Kings 1:11-13).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q16
        list.add(
            QuestionEntity(
                id = "crk_1986_16",
                subject = "CRS",
                topic = "Solomon's Foreign Wives",
                year = "1986",
                questionText = "It was wrong for King Solomon to have married foreign women because:",
                optionA = "they would entice him to worship idols",
                optionB = "the women of Israel were more beautiful",
                optionC = "they were very jealous",
                optionD = "a King should not have too many children",
                correctAnswerIndex = 0,
                explanation = "According to 1 Kings 11:1-2, God had forbidden marrying foreign nations because they would inevitably turn away the hearts of the kings of Israel after other false gods.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q17
        list.add(
            QuestionEntity(
                id = "crk_1986_17",
                subject = "CRS",
                topic = "Solomon's Labor Force in Lebanon",
                year = "1986",
                questionText = "How many months were the Israelites on forced labour in Lebanon allowed to spend at home for every month at the labour camp?",
                optionA = "Two",
                optionB = "Three",
                optionC = "Four",
                optionD = "Five",
                correctAnswerIndex = 0,
                explanation = "Solomon organized a rotating labor force of 30,000 men to Lebanon, sending them in shifts of 10,000 per month so that they spent one month in Lebanon and two months at home (1 Kings 5:14).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q18
        list.add(
            QuestionEntity(
                id = "crk_1986_18",
                subject = "CRS",
                topic = "Jeroboam's Golden Calves",
                year = "1986",
                questionText = "Which of the following Kings made two golden calves and set them up, saying: ‘Behold your gods, O Israel, who brought you up out of the land of Egypt’?",
                optionA = "Jeroboam I",
                optionB = "Ahab",
                optionC = "Omri",
                optionD = "Rehoboam",
                correctAnswerIndex = 0,
                explanation = "To prevent the ten northern tribes from traveling to Jerusalem to worship, Jeroboam I fashioned two golden calves at Dan and Bethel to serve as alternative worship hubs (1 Kings 12:28).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q19
        list.add(
            QuestionEntity(
                id = "crk_1986_19",
                subject = "CRS",
                topic = "Elijah and the Widow of Zarephath",
                year = "1986",
                questionText = "From the context of the story of Elijah and the widow of Zarephath, which of these statements is UNTRUE?",
                optionA = "The meal in the jar and the oil in the cruse were continually replenished thereafter",
                optionB = "The widow of Zarephath prepared food for Elijah",
                optionC = "The widow and her son ate the food and waited for their death.",
                optionD = "The woman was gathering sticks to prepare her last meal",
                correctAnswerIndex = 2,
                explanation = "While gathering sticks to make her final meal before expecting to starve, the widow obeyed Elijah and prepared him a cake first. Consequently, the flour and oil were miraculously replenished, saving their lives (1 Kings 17).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q20
        list.add(
            QuestionEntity(
                id = "crk_1986_20",
                subject = "CRS",
                topic = "Succession of Kings of Israel",
                year = "1986",
                questionText = "Which of these Kings of Israel did not assassinate his predecessor but was assassinated by his successor?",
                optionA = "Shallum",
                optionB = "Pekah",
                optionC = "Hoshea",
                optionD = "Pekahiah",
                correctAnswerIndex = 3,
                explanation = "Pekahiah succeeded his father Menahem (who died naturally) but was assassinated inside his palace by Pekah, the son of Remaliah, who then usurped the throne (2 Kings 15).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q21
        list.add(
            QuestionEntity(
                id = "crk_1986_21",
                subject = "CRS",
                topic = "Hosea's Prophecy of Exile",
                year = "1986",
                questionText = "Hosea said that the children of Israel shall dwell many days without king or prince, without sacrifice or pillar, without:",
                optionA = "ephod or teraphim",
                optionB = "prophet or seer",
                optionC = "dream or vision",
                optionD = "Tummim or Urim",
                correctAnswerIndex = 0,
                explanation = "In Hosea 3:4, the prophet describes a period of exile and spiritual isolation for Israel where they would be deprived of civil government, sacrificial rites, and idolatrous cult objects like ephods and teraphim.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q22
        list.add(
            QuestionEntity(
                id = "crk_1986_22",
                subject = "CRS",
                topic = "The Wicked Reign of Manasseh",
                year = "1986",
                questionText = "To whom does this refer? 'And he burned his son as an offering, and practised soothsaying and augury, and dealt with mediums and with wizards. He did much evil in the sight of the Lord...'",
                optionA = "Hezekiah",
                optionB = "Manasseh",
                optionC = "Josiah",
                optionD = "Jehoiakim",
                correctAnswerIndex = 1,
                explanation = "This describes the severe apostasy and wicked reign of King Manasseh of Judah, who built pagan altars inside the temple and sacrificed his own son (2 Kings 21:6).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q23
        list.add(
            QuestionEntity(
                id = "crk_1986_23",
                subject = "CRS",
                topic = "Pharaoh Neco Renames Jehoiakim",
                year = "1986",
                questionText = "Which was that Egyptian king who not only made Eliakim king of Judah but changed Eliakim’s name to Jehoiakim?",
                optionA = "So",
                optionB = "Neco",
                optionC = "Shishak",
                optionD = "Hophra",
                correctAnswerIndex = 1,
                explanation = "Pharaoh Neco of Egypt deposed King Jehoahaz, placed Jehoahaz's brother Eliakim on the throne of Judah, and officially changed his name to Jehoiakim (2 Kings 23:34).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q24
        list.add(
            QuestionEntity(
                id = "crk_1986_24",
                subject = "CRS",
                topic = "Jeremiah's Letter to the Exiles",
                year = "1986",
                questionText = "Jeremiah wrote to the exiles in Babylon and encouraged them to:",
                optionA = "fight for their return",
                optionB = "come back home to rebuild the temple",
                optionC = "seek the welfare of Babylon",
                optionD = "disobey the king of Babylon",
                correctAnswerIndex = 2,
                explanation = "In his letter recorded in Jeremiah 29:7, the prophet advised the exiles to settle down, build houses, plant gardens, and actively pray for and seek the welfare of Babylon, as their prosperity depended on it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q25
        list.add(
            QuestionEntity(
                id = "crk_1986_25",
                subject = "CRS",
                topic = "Zion's Happy Future (Isaiah 35)",
                year = "1986",
                questionText = "Which of these prophets made this prophecy of Zion’s happy future at the return of the exiles? “And the ransomed of the Lord shall return, and come to Zion with singing; everlasting joy shall be upon their heads...”",
                optionA = "Jeremiah",
                optionB = "Isaiah",
                optionC = "Zephaniah",
                optionD = "Ezekiel",
                correctAnswerIndex = 1,
                explanation = "This beautiful messianic promise of return, joy, and the cessation of sorrow is recorded in Isaiah 35:10.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q26
        list.add(
            QuestionEntity(
                id = "crk_1986_26",
                subject = "CRS",
                topic = "Prophecy of Immanuel",
                year = "1986",
                questionText = "Behold, a virgin shall conceive and bear a son, and his name shall be called Emmanuel, which means:",
                optionA = "Son of Emmaus",
                optionB = "God with us",
                optionC = "Saviour",
                optionD = "God is our Redeemer.",
                correctAnswerIndex = 1,
                explanation = "In Matthew 1:23, the writer references the prophecy of Isaiah, translating 'Emmanuel' as 'God with us' to validate the virgin birth of Jesus.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q27
        list.add(
            QuestionEntity(
                id = "crk_1986_27",
                subject = "CRS",
                topic = "John the Baptist's Ethical Preaching",
                year = "1986",
                questionText = "What specific reply did John the Baptist give to the soldiers during his preaching?",
                optionA = "‘Collect no more than is appointed you’",
                optionB = "‘Do not begin to say to yourselves: we have Abraham as our Father’",
                optionC = "‘Bear fruits that befit repentance’",
                optionD = "‘Be content with your wages.’",
                correctAnswerIndex = 3,
                explanation = "When soldiers asked John the Baptist what they should do to demonstrate repentance, he told them to avoid robbery, false accusations, and to be content with their wages (Luke 3:14).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q28
        list.add(
            QuestionEntity(
                id = "crk_1986_28",
                subject = "CRS",
                topic = "The Temptation of Jesus in Matthew",
                year = "1986",
                questionText = "The order of the locations of Jesus’ temptations according to Matthew is:",
                optionA = "wilderness-high mountain-pinnacle of the Temple",
                optionB = "wilderness-pinnacle of the temple-high mountain",
                optionC = "high mountain-wilderness-pinnacle of the temple",
                optionD = "pinnacle of the temple-wilderness-high mountain",
                correctAnswerIndex = 1,
                explanation = "In Matthew 4:1-11, the temptation begins in the desert (bread), proceeds to the holy city pinnacle (jump), and ends on a high mountain (kingdoms).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q29
        list.add(
            QuestionEntity(
                id = "crk_1986_29",
                subject = "CRS",
                topic = "Call of Levi (Matthew)",
                year = "1986",
                questionText = "When Christ called Levi to follow Him, he:",
                optionA = "waited two days before he obeyed",
                optionB = "accounted for the tax he collected and responded",
                optionC = "took some of the money he collected before following Him",
                optionD = "left everything and followed Him",
                correctAnswerIndex = 3,
                explanation = "Levi (Matthew) immediately abandoned his tax collection booth, left all his possessions, and followed Jesus without hesitation (Luke 5:28).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q30
        list.add(
            QuestionEntity(
                id = "crk_1986_30",
                subject = "CRS",
                topic = "Healing of the Ten Lepers",
                year = "1986",
                questionText = "The miracle which touched on ingratitude is the:",
                optionA = "healing of Bartimaeus",
                optionB = "raising of Jairus’ daughter",
                optionC = "cure of the ten lepers",
                optionD = "cure of the demoniac",
                correctAnswerIndex = 2,
                explanation = "While ten lepers were cured by Jesus, only one—a Samaritan—returned to fall at Jesus' feet and express active gratitude, showing the ingratitude of the other nine (Luke 17:11-19).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q31
        list.add(
            QuestionEntity(
                id = "crk_1986_31",
                subject = "CRS",
                topic = "Parable of the Unmerciful Servant",
                year = "1986",
                questionText = "The parable of the unmerciful servant teaches that:",
                optionA = "we should exercise patience until our debtors pay us",
                optionB = "we should forgive our debtors from our hearts",
                optionC = "all debts should be reported",
                optionD = "debtors should be jailed until they pay all their debts.",
                correctAnswerIndex = 1,
                explanation = "This parable in Matthew 18 illustrates that since God has forgiven us an infinite debt, we are strictly required to forgive others their minor debts from our hearts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q32
        list.add(
            QuestionEntity(
                id = "crk_1986_32",
                subject = "CRS",
                topic = "Parable of the Sower",
                year = "1986",
                questionText = "The ways in which various people hear and react to the word of God are described in the parable of the:",
                optionA = "Sower",
                optionB = "Wheat and the tares",
                optionC = "Fig tree",
                optionD = "Vineyard",
                correctAnswerIndex = 0,
                explanation = "The Parable of the Sower (Matthew 13) categorizes four different heart conditions (soil types) and how they receive and nurture the seed of God's Word.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q33
        list.add(
            QuestionEntity(
                id = "crk_1986_33",
                subject = "CRS",
                topic = "The Finger/Spirit of God and Kingdom",
                year = "1986",
                questionText = "“But if it is by the spirit of God that I cast out demons, then …”",
                optionA = "God has defeated Satan",
                optionB = "the kingdom of Satan cannot stand",
                optionC = "the kingdom of God has come upon you",
                optionD = "the kingdom of Satan is already divided.",
                correctAnswerIndex = 2,
                explanation = "In Matthew 12:28, Jesus rebuts the Pharisees' blasphemous claims by stating that His exorcisms demonstrate that the sovereign Kingdom of God has arrived.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q34
        list.add(
            QuestionEntity(
                id = "crk_1986_34",
                subject = "CRS",
                topic = "Humility vs. Ambition",
                year = "1986",
                questionText = "‘I assure you, unless you change and become like little children, you will not enter the kingdom of God.’ This is a warning by Jesus against:",
                optionA = "anger",
                optionB = "ambition",
                optionC = "wealth",
                optionD = "disobedience",
                correctAnswerIndex = 1,
                explanation = "Jesus delivered this warning in Matthew 18 when the disciples came asking who was the greatest, rebuking their selfish, proud, and ambitious spirit.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q35
        list.add(
            QuestionEntity(
                id = "crk_1986_35",
                subject = "CRS",
                topic = "Healing of the Epileptic Boy",
                year = "1986",
                questionText = "Jesus taught that fasting, in addition to prayers, is necessary in some situations, during the healing of the:",
                optionA = "blind beggar",
                optionB = "dropsied man",
                optionC = "gerasene demoniac",
                optionD = "epileptic boy",
                correctAnswerIndex = 3,
                explanation = "After the disciples failed to heal a mute, convulsing boy, Jesus explained in Mark 9:29 that 'this kind cannot be driven out by anything but prayer and fasting'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q36
        list.add(
            QuestionEntity(
                id = "crk_1986_36",
                subject = "CRS",
                topic = "Request of the Sons of Zebedee",
                year = "1986",
                questionText = "Jesus did not grant the request of the sons of Zebedee because:",
                optionA = "they were not qualified for the privilege they asked for",
                optionB = "He did not want to encourage rivalry among the disciples",
                optionC = "it was not His to grant the request",
                optionD = "they could not drink with Jesus’ cup.",
                correctAnswerIndex = 2,
                explanation = "In Mark 10:40, Jesus explained that while they could share in His suffering, sitting at His right or left hand was not His to grant, but was reserved by God.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q37
        list.add(
            QuestionEntity(
                id = "crk_1986_37",
                subject = "CRS",
                topic = "Parable of the Unjust Judge",
                year = "1986",
                questionText = "The parable which teaches persistence in prayer is that of the:",
                optionA = "Unjust judge",
                optionB = "Sower",
                optionC = "Good Samaritan",
                optionD = "Prodigal son.",
                correctAnswerIndex = 0,
                explanation = "In Luke 18:1-8, Jesus told the parable of the persistent widow and the corrupt judge to demonstrate that disciples must always pray and never lose heart.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q38
        list.add(
            QuestionEntity(
                id = "crk_1986_38",
                subject = "CRS",
                topic = "The Widow's Mite",
                year = "1986",
                questionText = "To give the ‘widow’s mite’ is to give:",
                optionA = "more than others",
                optionB = "less than others",
                optionC = "everything possible",
                optionD = "two copper coins",
                correctAnswerIndex = 2,
                explanation = "In Mark 12, Jesus observed a poor widow putting two small copper coins into the treasury, praising her because she gave out of her poverty, dedicating her entire livelihood.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q39
        list.add(
            QuestionEntity(
                id = "crk_1986_39",
                subject = "CRS",
                topic = "Women at the Cross",
                year = "1986",
                questionText = "Which of these women was absent during the crucifixion of Jesus Christ?",
                optionA = "Mary Magdalene",
                optionB = "Elizabeth",
                optionC = "Mary mother of Jesus",
                optionD = "Salome",
                correctAnswerIndex = 1,
                explanation = "While Mary Magdalene, Mary the mother of Jesus, and Salome are recorded as present at the foot of the cross, Elizabeth (John the Baptist's mother) is not mentioned.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q40
        list.add(
            QuestionEntity(
                id = "crk_1986_40",
                subject = "CRS",
                topic = "Peter's Pentecost Sermon",
                year = "1986",
                questionText = "To explain the outpouring of the Holy Spirit on the day of Pentecost, Peter quoted the prophet:",
                optionA = "Joel",
                optionB = "Micah",
                optionC = "Isaiah",
                optionD = "Jonah",
                correctAnswerIndex = 0,
                explanation = "In Acts 2:16, Peter declared that the disciples speaking in tongues was the direct fulfillment of Joel's prophecy regarding God pouring out His Spirit on all flesh.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q41
        list.add(
            QuestionEntity(
                id = "crk_1986_41",
                subject = "CRS",
                topic = "Ananias and Sapphira",
                year = "1986",
                questionText = "“...While it remained unsold, was it not at your disposal? How is it that you have contrived this deed in your heart? You have not lied to men but to God.” This was addressed by Peter to:",
                optionA = "Elymas",
                optionB = "Ananias",
                optionC = "Saul",
                optionD = "Sapphira",
                correctAnswerIndex = 1,
                explanation = "In Acts 5:4, Peter confronted Ananias for falsely claiming that he had donated the entire proceeds of his land sale to the church, exposing his hypocrisy and lying to the Holy Spirit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q42
        list.add(
            QuestionEntity(
                id = "crk_1986_42",
                subject = "CRS",
                topic = "Peter at Cornelius' Household",
                year = "1986",
                questionText = "“Truly I perceive that God shows no partiality” was said by:",
                optionA = "Cornelius",
                optionB = "Peter",
                optionC = "Paul",
                optionD = "Philip",
                correctAnswerIndex = 1,
                explanation = "Peter made this landmark statement in Acts 10:34 when he entered the home of the Roman centurion Cornelius, recognizing that Gentiles are equally welcome in God's covenant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q43
        list.add(
            QuestionEntity(
                id = "crk_1986_43",
                subject = "CRS",
                topic = "Herod Agrippa's Persecution",
                year = "1986",
                questionText = "After the killing of James the son of Zebedee, Herod also arrested Peter because:",
                optionA = "Peter had promised to die with Jesus",
                optionB = "the Jews were pleased with the murder of James",
                optionC = "Herod wanted to show his zeal for the Law of Moses",
                optionD = "Peter was the head of the Church",
                correctAnswerIndex = 1,
                explanation = "In Acts 12:3, Herod Agrippa I saw that the execution of James was highly popular among the Jewish ruling classes, leading him to proceed with arresting Peter during the Passover.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q44
        list.add(
            QuestionEntity(
                id = "crk_1986_44",
                subject = "CRS",
                topic = "First Missionary Journey: Cyprus",
                year = "1986",
                questionText = "The proconsul of Paphos during the visit of Paul and Barnabas was:",
                optionA = "Marcus Felix",
                optionB = "Lucius Publius",
                optionC = "Sergius Paulus",
                optionD = "Porcus Festus",
                correctAnswerIndex = 2,
                explanation = "In Acts 13:7, during their first missionary journey in Cyprus, Paul and Barnabas were invited by Sergius Paulus, the intelligent Roman proconsul, to preach the Word of God.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q45
        list.add(
            QuestionEntity(
                id = "crk_1986_45",
                subject = "CRS",
                topic = "The Jerusalem Council Delegation",
                year = "1986",
                questionText = "Which leading men among the brethren in Jerusalem, who were themselves prophets, were sent to Antioch with a letter in the company of Paul and Barnabas?",
                optionA = "John and James",
                optionB = "Peter and John",
                optionC = "Judas and Silas",
                optionD = "Apollos and Mark",
                correctAnswerIndex = 2,
                explanation = "The Jerusalem Council selected Judas (Barsabbas) and Silas, two respected prophetic leaders, to accompany Paul and Barnabas to Antioch and verify the council's letter (Acts 15:22).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q46
        list.add(
            QuestionEntity(
                id = "crk_1986_46",
                subject = "CRS",
                topic = "Conversion of Lydia in Philippi",
                year = "1986",
                questionText = "Lydia received Paul and Silas into her house when they came to:",
                optionA = "Philippi",
                optionB = "Thessalonica",
                optionC = "Ephesus",
                optionD = "Troas",
                correctAnswerIndex = 0,
                explanation = "In Acts 16:14-15, Lydia, a wealthy dealer in purple goods in Philippi, opened her heart to the Gospel and insisted on hosting the missionary team in her home.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q47
        list.add(
            QuestionEntity(
                id = "crk_1986_47",
                subject = "CRS",
                topic = "Paul at the Areopagus in Athens",
                year = "1986",
                questionText = "Paul, standing in the Areopagus, used the teachings of local poets to introduce God the Creator at:",
                optionA = "Thessalonica",
                optionB = "Athens",
                optionC = "Corinth",
                optionD = "Salamis",
                correctAnswerIndex = 1,
                explanation = "During his sermon on Mars Hill in Athens, Paul famously quoted Greek philosophers and poets ('In him we live and move and have our being') to build common ground with his audience (Acts 17:28).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q48
        list.add(
            QuestionEntity(
                id = "crk_1986_48",
                subject = "CRS",
                topic = "Paul's Final Journey to Jerusalem",
                year = "1986",
                questionText = "On his final journey to Jerusalem, Paul lodged at the house of:",
                optionA = "Jason",
                optionB = "Agabus",
                optionC = "Mnason",
                optionD = "Trophymus",
                correctAnswerIndex = 2,
                explanation = "In Acts 21:16, as Paul traveled toward Jerusalem, his party was accompanied by disciples from Caesarea who brought them to stay at the house of Mnason of Cyprus, an early disciple.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q49
        list.add(
            QuestionEntity(
                id = "crk_1986_49",
                subject = "CRS",
                topic = "Paul before King Agrippa II",
                year = "1986",
                questionText = "‘In a short time you think to make me a Christian’ was said by:",
                optionA = "Claudius Lysias",
                optionB = "Felix the Governor",
                optionC = "King Agrippa",
                optionD = "Festus the Governor",
                correctAnswerIndex = 2,
                explanation = "In Acts 26:28, King Herod Agrippa II responded with these famous words after listening to Paul's personal defense and eloquent appeal for faith.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // 1986 Q50
        list.add(
            QuestionEntity(
                id = "crk_1986_50",
                subject = "CRS",
                topic = "Paul's Voyage to Rome: Fair Havens",
                year = "1986",
                questionText = "The final port of departure for Italy where the Centurion put Paul on board was:",
                optionA = "Myra",
                optionB = "Alexandria",
                optionC = "Syracuse",
                optionD = "Fair Havens",
                correctAnswerIndex = 3,
                explanation = "According to Acts 27, Julius the Centurion put Paul on board an Alexandrian ship that eventually stopped at Fair Havens near Lasea, which became the final harbor before the storm struck.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1986"
            )
        )

        // ==========================================
        // 1987 JAMB CRK / CRS PAST EXAMINATION (46 QUESTIONS)
        // ==========================================

        // 1987 Q1
        list.add(
            QuestionEntity(
                id = "crk_1987_01",
                subject = "CRS",
                topic = "Blessing of Rebekah",
                year = "1987",
                questionText = "‘Our sister, be the mother of thousands and ten thousands; and may your descendants possess the gate of those who hate them!’ Who was this sister?",
                optionA = "Rachel",
                optionB = "Rebekah",
                optionC = "Hannah",
                optionD = "Peninnah",
                correctAnswerIndex = 1,
                explanation = "In Genesis 24:60, Rebekah's family blessed her with these words as she departed to become the wife of Isaac.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q2
        list.add(
            QuestionEntity(
                id = "crk_1987_02",
                subject = "CRS",
                topic = "Expulsion of Hagar and Ishmael",
                year = "1987",
                questionText = "‘Cast out this slave woman with her son; for the son of this slave woman shall not be heir with my son Isaac.’ Who was the slave woman?",
                optionA = "Michal",
                optionB = "Sarah",
                optionC = "Hagar",
                optionD = "Puah",
                correctAnswerIndex = 2,
                explanation = "Sarah demanded that Abraham expel Hagar and her son Ishmael because she did not want Ishmael to share in the inheritance of her son Isaac (Genesis 21:10).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q3
        list.add(
            QuestionEntity(
                id = "crk_1987_03",
                subject = "CRS",
                topic = "The Fall of Man: The Curse",
                year = "1987",
                questionText = "‘…thorns and thistles it shall bring forth to you and you shall eat the plants of the field. In the sweat of your face you shall eat bread...’ To whom were these words spoken?",
                optionA = "Cain",
                optionB = "Esau",
                optionC = "Adam",
                optionD = "Abel",
                correctAnswerIndex = 2,
                explanation = "In Genesis 3:17-19, God delivered this curse directly to Adam following his disobedience, marking the ground with labor and thorns.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q4
        list.add(
            QuestionEntity(
                id = "crk_1987_04",
                subject = "CRS",
                topic = "Circumcision of Isaac",
                year = "1987",
                questionText = "Abraham circumcised his son, Isaac, on the eighth day because:",
                optionA = "It was the custom of his tribe to do so",
                optionB = "God commanded him to do so",
                optionC = "He wanted to distinguish Isaac from Ishmael",
                optionD = "Isaac was the son of promise.",
                correctAnswerIndex = 1,
                explanation = "Abraham circumcised Isaac on the eighth day in strict obedience to God's covenantal command established in Genesis 17 and fulfilled in Genesis 21:4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q5
        list.add(
            QuestionEntity(
                id = "crk_1987_05",
                subject = "CRS",
                topic = "Joseph Detains Simeon in Egypt",
                year = "1987",
                questionText = "Who among Joseph’s brothers was bound by Joseph when they went to Egypt to buy grain?",
                optionA = "Simeon",
                optionB = "Reuben",
                optionC = "Benjamin",
                optionD = "Judah",
                correctAnswerIndex = 0,
                explanation = "To ensure that his brothers would return with their youngest brother Benjamin, Joseph detained and bound Simeon before their eyes as a hostage (Genesis 42:24).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q6
        list.add(
            QuestionEntity(
                id = "crk_1987_06",
                subject = "CRS",
                topic = "Burial of Joshua",
                year = "1987",
                questionText = "Joshua was buried in the hill-country of:",
                optionA = "Moab",
                optionB = "Naphtali",
                optionC = "Judah",
                optionD = "Ephraim",
                correctAnswerIndex = 3,
                explanation = "According to Joshua 24:30, Joshua was buried on his own inheritance property at Timnath-serah in the hill country of Ephraim.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q7
        list.add(
            QuestionEntity(
                id = "crk_1987_07",
                subject = "CRS",
                topic = "The Plague of Boils",
                year = "1987",
                questionText = "‘Take handfuls of ashes from the kiln and let Moses throw them toward heaven in the sight of Pharaoh.’ This action resulted in:",
                optionA = "the death of all Egyptian flocks and cattle",
                optionB = "the death of the first born and beast",
                optionC = "boils breaking out in sores on man and beast",
                optionD = "thick darkness over Egypt",
                correctAnswerIndex = 2,
                explanation = "In Exodus 9:8-10, Moses threw kiln ashes into the air, which became fine dust and caused painful, festering boils on both the Egyptians and their animals.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q8
        list.add(
            QuestionEntity(
                id = "crk_1987_08",
                subject = "CRS",
                topic = "Mount Sinai Holy Boundaries",
                year = "1987",
                questionText = "Whoever touches the ‘mountain of God’ (Mount Sinai) while the Lord is upon it shall be put to death by:",
                optionA = "hanging",
                optionB = "stoning or shooting",
                optionC = "strangling",
                optionD = "beating",
                correctAnswerIndex = 1,
                explanation = "In Exodus 19:12-13, God warned that anyone who touched the border of Mount Sinai would be stoned or shot with arrows, as no hand was allowed to touch them.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q9
        list.add(
            QuestionEntity(
                id = "crk_1987_09",
                subject = "CRS",
                topic = "The Golden Calf",
                year = "1987",
                questionText = "‘Take off the rings of gold which are in the ears of your wives, your sons and your daughters and bring them to me.’ This command was given by Aaron for:",
                optionA = "decorating the Ark",
                optionB = "offering sacrifice",
                optionC = "erecting an altar",
                optionD = "fashioning a molten calf",
                correctAnswerIndex = 3,
                explanation = "Yielding to the pressure of the people when Moses delayed on Sinai, Aaron asked for their gold earrings to melt down and fashion the golden calf (Exodus 32:2).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q10
        list.add(
            QuestionEntity(
                id = "crk_1987_10",
                subject = "CRS",
                topic = "Moses and Aaron as Spokesmen",
                year = "1987",
                questionText = "God commanded that Aaron should speak for Moses to the Israelites, but Moses should be to Aaron as:",
                optionA = "God",
                optionB = "master",
                optionC = "brother",
                optionD = "priest",
                correctAnswerIndex = 0,
                explanation = "In Exodus 4:16, God comforted Moses by appointing Aaron as his spokesman, stating that Aaron would speak for him and Moses would be as God to Aaron.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q11
        list.add(
            QuestionEntity(
                id = "crk_1987_11",
                subject = "CRS",
                topic = "Manna and the Sabbath Law",
                year = "1987",
                questionText = "On the first day when the Israelites left part of the manna, it bred worms and became foul, but on the sixth day when they left part of the bread it did not become foul because:",
                optionA = "they roasted it immediately",
                optionB = "God commanded them to keep it for the Sabbath",
                optionC = "Moses wanted to save them the trouble of searching",
                optionD = "by then they had discovered a better way of preserving it.",
                correctAnswerIndex = 1,
                explanation = "In Exodus 16, God instructed that a double portion of manna be gathered on the sixth day and kept overnight, as no manna would fall on the holy seventh-day Sabbath.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q12
        list.add(
            QuestionEntity(
                id = "crk_1987_12",
                subject = "CRS",
                topic = "Moses the Greatest Prophet",
                year = "1987",
                questionText = "Who was regarded as the greatest prophet in Israel for his unique privilege of knowing God face to face?",
                optionA = "Elijah",
                optionB = "Jeremiah",
                optionC = "Isaiah",
                optionD = "Moses",
                correctAnswerIndex = 3,
                explanation = "Deuteronomy 34:10 records that no other prophet has arisen in Israel like Moses, whom Yahweh knew face to face.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q13
        list.add(
            QuestionEntity(
                id = "crk_1987_13",
                subject = "CRS",
                topic = "Pledge of Loyalty to Joshua",
                year = "1987",
                questionText = "“Whoever rebels against your commandment and disobeys your words... shall be put to death: only be strong and of good courage.” This pledge was made to:",
                optionA = "Moses",
                optionB = "Joshua",
                optionC = "Samuel",
                optionD = "David",
                correctAnswerIndex = 1,
                explanation = "The eastern tribes (Reuben, Gad, and the half-tribe of Manasseh) pledged absolute loyalty and obedience to Joshua as their new commander (Joshua 1:18).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q14
        list.add(
            QuestionEntity(
                id = "crk_1987_14",
                subject = "CRS",
                topic = "Achan's Sin at Jericho",
                year = "1987",
                questionText = "Achan, who took of the devoted things during the fall of Jericho, was from the tribe of:",
                optionA = "Reuben",
                optionB = "Benjamin",
                optionC = "Judah",
                optionD = "Manasseh",
                correctAnswerIndex = 2,
                explanation = "In Joshua 7:1, Achan is identified as the son of Carmi, the son of Zabdi, the son of Zerah, of the tribe of Judah.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q15
        list.add(
            QuestionEntity(
                id = "crk_1987_15",
                subject = "CRS",
                topic = "Defeat of Sisera and Jabin",
                year = "1987",
                questionText = "Who among the following people was connected with the war between Israel and King Jabin of Canaan?",
                optionA = "Egbon",
                optionB = "Jael",
                optionC = "Ehud",
                optionD = "Gideon",
                correctAnswerIndex = 1,
                explanation = "Jael played a critical role in Israel's victory over Jabin's Canaanite army by assassinating Sisera, the chief commander, in her tent (Judges 4).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q16
        list.add(
            QuestionEntity(
                id = "crk_1987_16",
                subject = "CRS",
                topic = "Jephthah's Tragic Vow",
                year = "1987",
                questionText = "‘Alas, my daughter: you have brought me very low and you have become the cause of great trouble to me...’ This was said by:",
                optionA = "Jephthah",
                optionB = "Elkanah",
                optionC = "Gideon",
                optionD = "Samson",
                correctAnswerIndex = 0,
                explanation = "Jephthah lamented deeply when his daughter came out first to meet him, as he had vowed to sacrifice whatever came out of his house in exchange for victory over Ammon (Judges 11:35).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q17
        list.add(
            QuestionEntity(
                id = "crk_1987_17",
                subject = "CRS",
                topic = "Elkanah's Worship at Shiloh",
                year = "1987",
                questionText = "Elkanah went to worship and to sacrifice to the LORD at Shiloh:",
                optionA = "annually",
                optionB = "monthly",
                optionC = "fortnightly",
                optionD = "every Sabbath",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 1:3 records that Elkanah traveled up from his city year by year to worship and sacrifice to the Lord of hosts at the tabernacle in Shiloh.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q18
        list.add(
            QuestionEntity(
                id = "crk_1987_18",
                subject = "CRS",
                topic = "Uriah's Loyalty on the Battlefield",
                year = "1987",
                questionText = "Uriah the Hittite did not wish to go down to his house because:",
                optionA = "his wife was pregnant",
                optionB = "Joab would set him in the forefront of the battle",
                optionC = "the Ark and Israel and Judah were in tents on the battlefield",
                optionD = "David lay with his wife.",
                correctAnswerIndex = 2,
                explanation = "Uriah demonstrated exceptional soldierly honor, stating he could not enjoy domestic pleasures while his companions and the sacred Ark were camping in the open fields (2 Samuel 11:11).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q19
        list.add(
            QuestionEntity(
                id = "crk_1987_19",
                subject = "CRS",
                topic = "Prophetic Signs given to Saul",
                year = "1987",
                questionText = "“Then the spirit of the Lord will come mightily upon you, and you shall prophesy with them...” This was spoken by Samuel to:",
                optionA = "Saul",
                optionB = "David",
                optionC = "Jonathan",
                optionD = "Eli",
                correctAnswerIndex = 0,
                explanation = "Samuel gave this sign to Saul after secretly anointing him, foretelling that he would join a band of ecstatic prophets and be transformed into another man (1 Samuel 10:6).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q20
        list.add(
            QuestionEntity(
                id = "crk_1987_20",
                subject = "CRS",
                topic = "David's Music Soothes Saul",
                year = "1987",
                questionText = "The evil spirit that tormented Saul left him whenever he:",
                optionA = "was asleep",
                optionB = "was at prayer",
                optionC = "drank wine",
                optionD = "heard David’s music",
                correctAnswerIndex = 3,
                explanation = "Whenever Saul was tormented by an evil spirit from God, David would play his lyre, bringing refreshing, peace, and emotional relief to the king (1 Samuel 16:23).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q21
        list.add(
            QuestionEntity(
                id = "crk_1987_21",
                subject = "CRS",
                topic = "Public Coronation of Saul at Gilgal",
                year = "1987",
                questionText = "Saul was made king publicly before the Lord and before all the people of Israel at:",
                optionA = "Mizpah",
                optionB = "Gilgal",
                optionC = "Bethel",
                optionD = "Dan",
                correctAnswerIndex = 1,
                explanation = "Following Saul's successful military relief of Jabesh-gilead, Samuel summoned the people to Gilgal to confirm and renew the kingship of Saul publicly (1 Samuel 11:15).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q22
        list.add(
            QuestionEntity(
                id = "crk_1987_22",
                subject = "CRS",
                topic = "Queen of Sheba Tests Solomon",
                year = "1987",
                questionText = "When the Queen of Sheba heard Solomon’s fame concerning the name of the Lord, she came to test him with her:",
                optionA = "hard questions",
                optionB = "beauty",
                optionC = "army",
                optionD = "wealth",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 10:1, the Queen of Sheba visited Jerusalem to test Solomon's legendary wisdom personally with difficult questions and riddles.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q23
        list.add(
            QuestionEntity(
                id = "crk_1987_23",
                subject = "CRS",
                topic = "David's Domestic Sorrows",
                year = "1987",
                questionText = "The greatest of David’s domestic problems that seemed to break his heart was the:",
                optionA = "rape of Tamar by Amnon",
                optionB = "killing of Amnon by Absalom",
                optionC = "conspiracy of Absalom against him",
                optionD = "murder of Absalom by Joab",
                correctAnswerIndex = 2,
                explanation = "While David suffered multiple family tragedies, the open rebellion and political conspiracy of his favorite son Absalom to usurp his throne caused him the deepest sorrow.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q24
        list.add(
            QuestionEntity(
                id = "crk_1987_24",
                subject = "CRS",
                topic = "God's Conditional Promise of Long Life",
                year = "1987",
                questionText = "Besides the gifts of wisdom and riches, what other gift did the Lord promise to Solomon but with a condition of obedience?",
                optionA = "Riches",
                optionB = "Honour",
                optionC = "Long life",
                optionD = "Victory in Warfare",
                correctAnswerIndex = 2,
                explanation = "In 1 Kings 3:14, God promised Solomon that if he walked in His statutes and kept His commandments as his father David did, He would lengthen his days (long life).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q25
        list.add(
            QuestionEntity(
                id = "crk_1987_25",
                subject = "CRS",
                topic = "Herod and John the Baptist",
                year = "1987",
                questionText = "Though Herod wanted to put John the Baptist to death, he feared the people because they held him to be a:",
                optionA = "priest",
                optionB = "preacher",
                optionC = "prophet",
                optionD = "forerunner of Christ",
                correctAnswerIndex = 2,
                explanation = "Matthew 14:5 records that Herod Antipas hesitated to execute John the Baptist initially because of John's immense popularity among the Jewish public, who recognized him as a prophet.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q26
        list.add(
            QuestionEntity(
                id = "crk_1987_26",
                subject = "CRS",
                topic = "Commission of the Twelve",
                year = "1987",
                questionText = "Which of these is NOT included in the instructions given to the disciples during their mission?",
                optionA = "Heal the sick",
                optionB = "Judge the people",
                optionC = "Cleanse lepers",
                optionD = "Raise the dead",
                correctAnswerIndex = 1,
                explanation = "When sending out the disciples, Jesus commanded them to preach the kingdom, heal the sick, raise the dead, cleanse lepers, and cast out demons—not to act as judges (Matthew 10).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q27
        list.add(
            QuestionEntity(
                id = "crk_1987_27",
                subject = "CRS",
                topic = "The Transfiguration Secrecy",
                year = "1987",
                questionText = "Jesus asked his disciples not to disclose their vision of the transfiguration until the:",
                optionA = "Crucifixion",
                optionB = "Resurrection",
                optionC = "Ascension",
                optionD = "Pentecost",
                correctAnswerIndex = 1,
                explanation = "As they descended the mountain, Jesus commanded Peter, James, and John to tell no one about the transfiguration vision until the Son of Man had risen from the dead (Matthew 17:9).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q28
        list.add(
            QuestionEntity(
                id = "crk_1987_28",
                subject = "CRS",
                topic = "Peter's Confession at Caesarea Philippi",
                year = "1987",
                questionText = "When Peter confessed Jesus as the Christ, Jesus replied that it had been revealed to Peter by:",
                optionA = "my Father in heaven",
                optionB = "flesh and blood",
                optionC = "the spirit of the living God",
                optionD = "the son of man",
                correctAnswerIndex = 0,
                explanation = "In Matthew 16:17, Jesus blessed Simon Peter, declaring that his confession of Jesus' Messianic identity was not a human discovery (flesh and blood) but a direct revelation from God the Father.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q29
        list.add(
            QuestionEntity(
                id = "crk_1987_29",
                subject = "CRS",
                topic = "Parable of the Labourers in the Vineyard",
                year = "1987",
                questionText = "The parable of the labourers in the vineyard teaches above all God’s:",
                optionA = "generosity",
                optionB = "strictness",
                optionC = "partiality",
                optionD = "justice",
                correctAnswerIndex = 0,
                explanation = "This parable in Matthew 20 illustrates that God's grace and reward are based on His sovereign, abundant generosity, rather than a human calculation of work hours.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q30
        list.add(
            QuestionEntity(
                id = "crk_1987_30",
                subject = "CRS",
                topic = "A Kingdom Divided Against Itself",
                year = "1987",
                questionText = "According to Jesus, every kingdom divided against itself is:",
                optionA = "laid waste",
                optionB = "selfish",
                optionC = "satanic",
                optionD = "without a leader",
                correctAnswerIndex = 0,
                explanation = "Jesus countered the Pharisees' claims by stating that Beelzebub would not cast out Beelzebub, as any house or kingdom divided against itself is brought to desolation and ruin (Matthew 12:25).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q31
        list.add(
            QuestionEntity(
                id = "crk_1987_31",
                subject = "CRS",
                topic = "Reconciliation with Accusers",
                year = "1987",
                questionText = "Jesus taught that one should make friends quickly with one’s:",
                optionA = "enemy",
                optionB = "neighbour",
                optionC = "master",
                optionD = "accuser",
                correctAnswerIndex = 3,
                explanation = "During the Sermon on the Mount, Jesus advised reconciling quickly with one's accuser while on the way to court, to avoid being thrown into prison (Matthew 5:25).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q32
        list.add(
            QuestionEntity(
                id = "crk_1987_32",
                subject = "CRS",
                topic = "Tradition of the Elders: Handwashing",
                year = "1987",
                questionText = "The Pharisees and Scribes accused the disciples of Jesus of transgressing the tradition of the leaders because they:",
                optionA = "did not regard synagogue rules",
                optionB = "did not pray before meals",
                optionC = "ate with unwashed hands",
                optionD = "disobeyed the elders",
                correctAnswerIndex = 2,
                explanation = "In Matthew 15:2, religious leaders questioned Jesus because His disciples did not practice the traditional ceremonial hand-washing rituals before consuming food.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q33
        list.add(
            QuestionEntity(
                id = "crk_1987_33",
                subject = "CRS",
                topic = "Anointing at Bethany",
                year = "1987",
                questionText = "‘Why this waste? For this ointment might have been sold for a large sum and given to the poor.’ The event which led to this saying took place in:",
                optionA = "Capernaum",
                optionB = "Jerusalem",
                optionC = "Jericho",
                optionD = "Bethany",
                correctAnswerIndex = 3,
                explanation = "This critical objection from the disciples (specifically Judas) occurred in the house of Simon the leper in Bethany when a woman poured expensive pure nard over Jesus' head (Matthew 26:6-9).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q34
        list.add(
            QuestionEntity(
                id = "crk_1987_34",
                subject = "CRS",
                topic = "The Triumphal Entry",
                year = "1987",
                questionText = "At His triumphal entry into Jerusalem, Christ sat on an ass because:",
                optionA = "He had need of it",
                optionB = "He was humble",
                optionC = "He wanted to fulfill the scriptures",
                optionD = "He was a king",
                correctAnswerIndex = 2,
                explanation = "Matthew 21:4-5 records that Jesus rode the donkey to directly fulfill the prophecy of Zechariah 9:9 ('Behold, your king is coming to you, humble, and mounted on an ass...').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q35
        list.add(
            QuestionEntity(
                id = "crk_1987_35",
                subject = "CRS",
                topic = "Jewish Sects: Sadducees",
                year = "1987",
                questionText = "Which Jewish religious group during Jesus’ time did NOT believe in the resurrection of the dead?",
                optionA = "The Essenes",
                optionB = "The Herodians",
                optionC = "The Pharisees",
                optionD = "The Sadducees",
                correctAnswerIndex = 3,
                explanation = "The Sadducees were a priestly, aristocratic sect in Jerusalem who strictly rejected the oral traditions, angels, and the concept of bodily resurrection.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q36
        list.add(
            QuestionEntity(
                id = "crk_1987_36",
                subject = "CRS",
                topic = "Parable of the Tares (Weeds)",
                year = "1987",
                questionText = "“...Gather the weeds first and bind them in bundles to be burned, but gather the wheat into my barn.” This passage is on the parable of the:",
                optionA = "mustard seed",
                optionB = "sower",
                optionC = "tares",
                optionD = "treasure hidden in a field",
                correctAnswerIndex = 2,
                explanation = "This harvest instruction comes from the Parable of the Tares (Weeds) in Matthew 13:30, illustrating that the righteous and wicked will grow together until final judgment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q37
        list.add(
            QuestionEntity(
                id = "crk_1987_37",
                subject = "CRS",
                topic = "The Beatitudes: Righteousness",
                year = "1987",
                questionText = "‘Blessed are those who hunger and thirst for righteousness, for they shall ...’",
                optionA = "inherit the earth",
                optionB = "be satisfied",
                optionC = "obtain mercy",
                optionD = "see God",
                correctAnswerIndex = 1,
                explanation = "This Beatitude delivered by Jesus during the Sermon on the Mount promises complete spiritual satisfaction and fulfillment to those who long for righteousness (Matthew 5:6).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q38
        list.add(
            QuestionEntity(
                id = "crk_1987_38",
                subject = "CRS",
                topic = "The Outpouring of the Holy Spirit",
                year = "1987",
                questionText = "The promised gift of the Holy Spirit was physically fulfilled on the disciples when:",
                optionA = "Jesus ascended into heaven",
                optionB = "the Holy Spirit filled them on the day of Pentecost",
                optionC = "Jesus resurrected from the dead",
                optionD = "the Holy Spirit descended upon Cornelius",
                correctAnswerIndex = 1,
                explanation = "In Acts 2, ten days after the Ascension, the Holy Spirit descended as wind and tongues of fire, fulfilling Christ's promise to clothe them with power.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q39
        list.add(
            QuestionEntity(
                id = "crk_1987_39",
                subject = "CRS",
                topic = "The Apostles in the Upper Room",
                year = "1987",
                questionText = "On their return to Jerusalem immediately after the Ascension, the apostles devoted themselves to:",
                optionA = "preaching",
                optionB = "healing",
                optionC = "alms-giving",
                optionD = "prayer",
                correctAnswerIndex = 3,
                explanation = "According to Acts 1:14, after returning from Mount Olivet, the eleven Apostles, along with the women and Mary the mother of Jesus, stayed in the upper room and devoted themselves to prayer.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q40
        list.add(
            QuestionEntity(
                id = "crk_1987_40",
                subject = "CRS",
                topic = "Qualifications for Apostleship (Matthias)",
                year = "1987",
                questionText = "One of the main qualifications of the successor to Judas was that he should be a witness of Christ's resurrection alongside the eleven, having accompanied them:",
                optionA = "from the time of John the Baptist’s ministry",
                optionB = "from the Ascension",
                optionC = "during the trial of Jesus",
                optionD = "after the Crucifixion",
                correctAnswerIndex = 0,
                explanation = "Peter specified in Acts 1:21-22 that the replacement for Judas must have been with them during Jesus' entire public ministry, starting from John's baptism until the Ascension.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q41
        list.add(
            QuestionEntity(
                id = "crk_1987_41",
                subject = "CRS",
                topic = "Gamaliel's Counsel to the Sanhedrin",
                year = "1987",
                questionText = "Who advised the Sanhedrin to keep away from the apostles and let them alone?",
                optionA = "Cornelius",
                optionB = "Stephen",
                optionC = "Gamaliel",
                optionD = "James",
                correctAnswerIndex = 2,
                explanation = "Gamaliel, a respected Pharisee and teacher of the law, warned the council that if the apostles' movement was of human origin, it would fail, but if of God, they could not defeat it (Acts 5:38-39).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q42
        list.add(
            QuestionEntity(
                id = "crk_1987_42",
                subject = "CRS",
                topic = "Saul's Mission to Damascus",
                year = "1987",
                questionText = "Saul travelled to Damascus in order to:",
                optionA = "obtain letters of authority from the High Priest",
                optionB = "be converted to Christianity",
                optionC = "be baptized by Ananias",
                optionD = "arrest those belonging to the Way",
                correctAnswerIndex = 3,
                explanation = "Armed with warrants from the High Priest, Saul traveled to Damascus to search for Jewish Christians (followers of 'the Way') and bring them bound back to Jerusalem for trial (Acts 9:1-2).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q43
        list.add(
            QuestionEntity(
                id = "crk_1987_43",
                subject = "CRS",
                topic = "Peter Criticized by Circumcision Party",
                year = "1987",
                questionText = "Peter was criticized by the circumcision party in Jerusalem because he:",
                optionA = "converted the gentiles",
                optionB = "raised Dorcas to life",
                optionC = "ate with uncircumcised men",
                optionD = "baptized Cornelius",
                correctAnswerIndex = 2,
                explanation = "In Acts 11:2-3, conservative Jewish believers rebuked Peter not for preaching, but for breaching traditional table fellowship boundaries by entering Cornelius' house and eating with Gentiles.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q44
        list.add(
            QuestionEntity(
                id = "crk_1987_44",
                subject = "CRS",
                topic = "Agabus Foretells Famine",
                year = "1987",
                questionText = "Who prophesied a great famine over all the world while at Antioch?",
                optionA = "Agabus",
                optionB = "Aeneas",
                optionC = "Claudius",
                optionD = "Barnabas",
                correctAnswerIndex = 0,
                explanation = "Agabus, a prophet from Jerusalem, stood up in Antioch and foretold by the Spirit that a severe famine would sweep the entire Roman world, which occurred during the reign of Claudius (Acts 11:28).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q45
        list.add(
            QuestionEntity(
                id = "crk_1987_45",
                subject = "CRS",
                topic = "Gentile Pentecost in Caesarea",
                year = "1987",
                questionText = "While Peter was still speaking, the Holy Spirit fell on all who heard the word. Where did this happen?",
                optionA = "Jerusalem",
                optionB = "Caesarea",
                optionC = "Antioch",
                optionD = "Damascus",
                correctAnswerIndex = 1,
                explanation = "This miraculous, unmediated outpouring of the Holy Spirit on Gentiles occurred inside Cornelius' home in Caesarea while Peter was still preaching (Acts 10:44).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        // 1987 Q46
        list.add(
            QuestionEntity(
                id = "crk_1987_46",
                subject = "CRS",
                topic = "Martyrdom of Stephen",
                year = "1987",
                questionText = "Then they cast him out of the city and stoned him; and the witnesses laid down their garments at the feet of a young man named Saul. This refers to the martyrdom of:",
                optionA = "James",
                optionB = "Philip",
                optionC = "Barnabas",
                optionD = "Stephen",
                correctAnswerIndex = 3,
                explanation = "In Acts 7:58, Stephen, the first Christian martyr, was stoned to death outside Jerusalem while Saul watched and guarded the cloaks of his executioners.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1987"
            )
        )

        return list
    }
}
