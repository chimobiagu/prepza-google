package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Christian Religious Knowledge/Studies (CRS/CRK) Question Series (Parts 1 to 5) with Biblical References and Explanations
 * Total Verified Questions: 25
 */
object JambCrkPt1to5CompleteBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_01",
                subject = "CRS",
                topic = "Patriarchs - Joseph",
                year = "Part 1",
                questionText = "Joseph called the name of his first born Manasseh, meaning God has _____.",
                optionA = "made him forget his hardship and his father's house",
                optionB = "made him fruitful in the land of his affliction",
                optionC = "rescued him from the hands of Potiphar",
                optionD = "made him not to forget his brothers and his household",
                correctAnswerIndex = 0,
                explanation = "Genesis 41:51: 'Joseph called the name of the firstborn Manasseh: For God, said he, hath made me forget all my toil, and all my father's house.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_02",
                subject = "CRS",
                topic = "Divided Kingdom",
                year = "Part 1",
                questionText = "“...Now therefore lighten the hard service of your father upon us, and we will serve you.” This request was made to Rehoboam because _____.",
                optionA = "the people had another person in mind",
                optionB = "the people wanted to test his wisdom",
                optionC = "of an impending revolt",
                optionD = "the people wanted some relief from heavy taxation and forced labour",
                correctAnswerIndex = 3,
                explanation = "1 Kings 12:4: The elders of Israel petitioned King Rehoboam to ease Solomon's heavy tax and forced-labor burdens.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_03",
                subject = "CRS",
                topic = "David's Fall & Repentance",
                year = "Part 1",
                questionText = "“You are the man...” This statement by Nathan made David immediately _____.",
                optionA = "order him out of the palace",
                optionB = "order the killing of the child",
                optionC = "confess and ask for forgiveness",
                optionD = "abdicate his throne",
                correctAnswerIndex = 2,
                explanation = "2 Samuel 12:13: After Nathan exposed David's sin regarding Bathsheba and Uriah, David confessed: 'I have sinned against the LORD.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_05",
                subject = "CRS",
                topic = "The Exodus",
                year = "Part 1",
                questionText = "“...The Lord will fight for you, and you have only to be still.” This statement was made by Moses when the _____.",
                optionA = "Egyptians were pursuing the Israelites before the Red Sea",
                optionB = "Israelites were standing before Joshua",
                optionC = "Israelites were standing before King Pharaoh",
                optionD = "Israelites' chariots were crossing the Red Sea",
                correctAnswerIndex = 0,
                explanation = "Exodus 14:13-14: Moses spoke these words at the shores of the Red Sea as Pharaoh's army advanced.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_06",
                subject = "CRS",
                topic = "Solomon's Disobedience",
                year = "Part 1",
                questionText = "God told Solomon that He would surely tear the kingdom from him and give it to his _____.",
                optionA = "son",
                optionB = "brother",
                optionC = "servant (Jeroboam)",
                optionD = "army commander",
                correctAnswerIndex = 2,
                explanation = "1 Kings 11:11: God declared He would tear the kingdom away from Solomon's line and give ten tribes to his servant Jeroboam.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_07",
                subject = "CRS",
                topic = "David's Kingdom",
                year = "Part 1",
                questionText = "Why did Joab kill Abner?",
                optionA = "He wanted to avenge the death of his brother Asahel",
                optionB = "He feared that Abner would take over his post",
                optionC = "Abner only came to deceive David",
                optionD = "He was an enemy who came to spy on David",
                correctAnswerIndex = 0,
                explanation = "2 Samuel 3:27: Joab assassinated Abner at the gate of Hebron to avenge the blood of his brother Asahel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_09",
                subject = "CRS",
                topic = "Creation",
                year = "Part 1",
                questionText = "In the beginning, God created the _____.",
                optionA = "heavens and the earth",
                optionB = "animals and the birds",
                optionC = "light and the darkness",
                optionD = "water and the dry land",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:1: 'In the beginning God created the heaven and the earth.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_10",
                subject = "CRS",
                topic = "Moses' Call",
                year = "Part 1",
                questionText = "Moses fled Egypt to the land of Midian because _____.",
                optionA = "he was afraid that his crime would be made known",
                optionB = "Pharaoh wanted to kill him for the crime he had committed",
                optionC = "his countryman asked if he would also kill him",
                optionD = "he had killed an Egyptian and buried him in the sand",
                correctAnswerIndex = 1,
                explanation = "Exodus 2:15: When Pharaoh heard that Moses had slain the Egyptian overseer, he sought to put Moses to death.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_11",
                subject = "CRS",
                topic = "Saul & Amalekites",
                year = "Part 1",
                questionText = "The LORD sent Samuel to Saul to go and destroy the Amalekites because _____.",
                optionA = "they opposed Israel on their way out of Egypt",
                optionB = "they were idolaters",
                optionC = "they disobeyed God",
                optionD = "their land had been given to Israel after the battle",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 15:2: God punished Amalek for ambushing Israel in the wilderness after they left Egypt.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_14",
                subject = "CRS",
                topic = "Faith in Trials",
                year = "Part 1",
                questionText = "“...If it be so, our God whom we serve is able to deliver us from the burning fiery furnace...” The statement portrays Shadrach, Meshach and Abednego as _____.",
                optionA = "men of faith",
                optionB = "disillusioned men",
                optionC = "stubborn men",
                optionD = "men with pride",
                correctAnswerIndex = 0,
                explanation = "Daniel 3:17: The three Hebrew youths exhibited steadfast faith in Yahweh's supreme power over Nebuchadnezzar.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_16",
                subject = "CRS",
                topic = "Prophet Jonah",
                year = "Part 1",
                questionText = "“And the LORD God appointed a plant, and made it come up over Jonah...” The statement taught Jonah that _____.",
                optionA = "the repentance of the Ninevites would be short-lived",
                optionB = "God is sovereign and merciful to all creation",
                optionC = "his assignment would not last long",
                optionD = "God is merciful",
                correctAnswerIndex = 1,
                explanation = "Jonah 4:6-11: God used the gourd and worm to teach Jonah divine mercy towards Nineveh's inhabitants.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_17",
                subject = "CRS",
                topic = "Ahab & Naboth",
                year = "Part 1",
                questionText = "“Why is your spirit so vexed that you eat no food?” The addressee (Ahab) was sad because _____.",
                optionA = "Naboth refused to give him his ancestral vineyard",
                optionB = "he had an encounter with Elijah",
                optionC = "his inheritance had been taken away",
                optionD = "Jezebel refused to speak to him",
                correctAnswerIndex = 0,
                explanation = "1 Kings 21:4-5: Ahab sulked because Naboth the Jezreelite refused to sell his family inheritance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_18",
                subject = "CRS",
                topic = "Prophet Isaiah",
                year = "Part 1",
                questionText = "Isaiah teaches that the LORD wants His people to demonstrate holiness by _____.",
                optionA = "observing religious festivals",
                optionB = "offering more sacrifices",
                optionC = "doing justice and not evil",
                optionD = "honouring their father and mother",
                correctAnswerIndex = 2,
                explanation = "Isaiah 1:16-17: 'Cease to do evil; learn to do well; seek judgment, relieve the oppressed.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_19",
                subject = "CRS",
                topic = "Josiah's Reforms",
                year = "Part 1",
                questionText = "One of the reforms of King Josiah was that _____.",
                optionA = "he worshipped at the brook Kidron",
                optionB = "he defiled Topheth in the valley of the sons of Hinnom",
                optionC = "he allowed the worship of Asherah",
                optionD = "the priests were allowed to worship in the temple",
                correctAnswerIndex = 1,
                explanation = "2 Kings 23:10: Josiah defiled Topheth in the Valley of Hinnom to halt child sacrifices to Molech.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_20",
                subject = "CRS",
                topic = "Prophet Hosea",
                year = "Part 1",
                questionText = "The main lesson of Hosea's teachings is that God _____.",
                optionA = "will pour His spirit on all flesh",
                optionB = "accepts every free-will offering",
                optionC = "will create a new heart in His people",
                optionD = "prefers steadfast love to sacrifice",
                correctAnswerIndex = 3,
                explanation = "Hosea 6:6: 'For I desired mercy, and not sacrifice; and the knowledge of God more than burnt offerings.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_23",
                subject = "CRS",
                topic = "Elijah at Cherith",
                year = "Part 1",
                questionText = "When Elijah escaped from Ahab to the brook Cherith, he was fed by _____.",
                optionA = "angels",
                optionB = "ravens",
                optionC = "doves",
                optionD = "sparrows",
                correctAnswerIndex = 1,
                explanation = "1 Kings 17:4-6: God commanded ravens to bring Elijah bread and meat morning and evening.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_24",
                subject = "CRS",
                topic = "Paul's Journeys",
                year = "Part 1",
                questionText = "The man appointed by the Holy Ghost at Antioch to go on the first missionary journey with Saul was _____.",
                optionA = "Lucius",
                optionB = "Barnabas",
                optionC = "Peter",
                optionD = "Mark",
                correctAnswerIndex = 1,
                explanation = "Acts 13:2: The Holy Spirit directed: 'Separate me Barnabas and Saul for the work whereunto I have called them.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_25",
                subject = "CRS",
                topic = "Discipleship",
                year = "Part 1",
                questionText = "The mark of a true disciple according to Jesus Christ is _____.",
                optionA = "loving one another",
                optionB = "keeping the Ten Commandments",
                optionC = "knowing the word",
                optionD = "fasting and praying",
                correctAnswerIndex = 0,
                explanation = "John 13:35: 'By this shall all men know that ye are my disciples, if ye have love one to another.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_26",
                subject = "CRS",
                topic = "Early Church",
                year = "Part 1",
                questionText = "The main complaint of the Hellenists against the Hebrews in the early Church was that their _____.",
                optionA = "men were neglected",
                optionB = "widows were neglected in daily distribution",
                optionC = "new converts were neglected",
                optionD = "children were neglected",
                correctAnswerIndex = 1,
                explanation = "Acts 6:1: Hellenistic Jewish Christians complained their widows were overlooked in the daily ministration.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p1_31",
                subject = "CRS",
                topic = "Temptation of Jesus",
                year = "Part 1",
                questionText = "Jesus' reply to the Devil's command to throw Himself down from the pinnacle of the temple was _____.",
                optionA = "“…Man shall not live by bread alone…”",
                optionB = "“…You shall not tempt the Lord your God.”",
                optionC = "“...You shall worship the Lord your God and Him only shall you serve.”",
                optionD = "“He will give his angels charge of you.”",
                correctAnswerIndex = 1,
                explanation = "Matthew 4:7 / Luke 4:12: Jesus replied: 'It is written again, Thou shalt not tempt the Lord thy God.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 1 (Q31)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p2_06",
                subject = "CRS",
                topic = "Eden's Geography",
                year = "Part 2",
                questionText = "The river that flowed out of Eden to water the garden divided and became four rivers namely _____.",
                optionA = "Nile, Pishon, Euphrates and Tigris",
                optionB = "Pishon, Tigris, Gihon and Nile",
                optionC = "Pishon, Gihon, Tigris (Hiddekel) and Euphrates",
                optionD = "Pishon, Euphrates, Gihon and Jordan",
                correctAnswerIndex = 2,
                explanation = "Genesis 2:10-14: The four rivers were Pishon, Gihon, Hiddekel (Tigris), and Euphrates.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 2 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p2_11",
                subject = "CRS",
                topic = "Noah's Covenant",
                year = "Part 2",
                questionText = "The sign of the covenant between God and Noah for all future generations was _____.",
                optionA = "blood",
                optionB = "treaty of peace",
                optionC = "circumcision",
                optionD = "bow in the cloud (rainbow)",
                correctAnswerIndex = 3,
                explanation = "Genesis 9:13: God set the rainbow in the clouds as a token of His perpetual covenant with all the earth.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 2 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p3_01",
                subject = "CRS",
                topic = "David's Restraint",
                year = "Part 3",
                questionText = "David did not allow Abishai to destroy Saul because he _____.",
                optionA = "believed in the judgement of God",
                optionB = "refused to stretch his hand against the Lord's anointed",
                optionC = "wanted to disarm Saul before killing him",
                optionD = "wanted to see if Saul would repent eventually",
                correctAnswerIndex = 1,
                explanation = "1 Samuel 26:9: David told Abishai: 'Destroy him not: for who can stretch forth his hand against the LORD's anointed, and be guiltless?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 3 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p4_06",
                subject = "CRS",
                topic = "Gideon's 300",
                year = "Part 4",
                questionText = "The last event that boosted Gideon's courage to go against the Midianites was the _____.",
                optionA = "appearance of the angel who called him a man of valour",
                optionB = "sign in which God caused the dew to be on the fleece",
                optionC = "test God gave Gideon's men at the waterside",
                optionD = "dream told by a Midianite soldier about a barley loaf tumbling into their tent",
                correctAnswerIndex = 3,
                explanation = "Judges 7:13-15: Gideon overheard a Midianite telling his comrade a dream of a cake of barley bread striking down Midian's tent.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 4 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_p5_28",
                subject = "CRS",
                topic = "Council of Jerusalem",
                year = "Part 5",
                questionText = "The resolution of the Council at Jerusalem was that Gentile converts should abstain from _____.",
                optionA = "adultery, greed, strangled meat and divination",
                optionB = "homosexuality, idolatry, fornication and strangled meat",
                optionC = "pollutions of idols, unchastity, strangled meat and blood",
                optionD = "circumcision, whoremongering, homosexuality, falsehood",
                correctAnswerIndex = 2,
                explanation = "Acts 15:20, 29: The Jerusalem Council decreed Gentiles abstain from meats offered to idols, blood, things strangled, and fornication.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS • Part 5 (Q28)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
