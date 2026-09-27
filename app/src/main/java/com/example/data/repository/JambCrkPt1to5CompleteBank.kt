package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Christian Religious Knowledge/Studies (CRS/CRK) Question Series (Parts 1 to 5)
 * 100% extracted from official JAMB UTME objective past question source papers.
 * Full biblical references, contextual explanations, exact source stems and options.
 */
object JambCrkPt1to5CompleteBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_01",
                subject = "CRS",
                topic = "Patriarchs - Joseph",
                year = "PT. 1",
                questionText = "Joseph called the name of his first born Manasseh, meaning God has _____.",
                optionA = "made him forget his hardship and his father's house.",
                optionB = "made him fruitful in the land of his affliction",
                optionC = "rescued him from the hands of Potiphar",
                optionD = "made him not to forget his brothers and his household",
                correctAnswerIndex = 0,
                explanation = "Genesis 41:51: 'Joseph called the name of the firstborn Manasseh: For God, said he, hath made me forget all my toil, and all my father's house.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_02",
                subject = "CRS",
                topic = "Divided Kingdom",
                year = "PT. 1",
                questionText = "“…Now therefore lighten the hard service of your father upon us, and we will serve you.” This request was made to Rehoboam because _____.",
                optionA = "the people had another person in mind",
                optionB = "the people wanted to test his wisdom",
                optionC = "of an impending revolt",
                optionD = "the people wanted some relief",
                correctAnswerIndex = 3,
                explanation = "1 Kings 12:4: The assembly of Israel petitioned King Rehoboam to ease the heavy yoke of forced labour and taxation imposed by Solomon.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_03",
                subject = "CRS",
                topic = "David's Reign",
                year = "PT. 1",
                questionText = "“You are the man...” This statement by Nathan made David immediately _____.",
                optionA = "order him out of the palace",
                optionB = "order the killing of the child",
                optionC = "confess and ask for forgiveness",
                optionD = "abdicate his throne",
                correctAnswerIndex = 2,
                explanation = "2 Samuel 12:13: When Prophet Nathan convicted David of his sin against Uriah, David said, 'I have sinned against the LORD.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_04",
                subject = "CRS",
                topic = "Saul's Disobedience",
                year = "PT. 1",
                questionText = "One of the consequences of Saul’s disobedience was that _____.",
                optionA = "the Philistines killed him",
                optionB = "he killed himself",
                optionC = "the Amalekites killed him",
                optionD = "his armour bearer killed him",
                correctAnswerIndex = 1,
                explanation = "1 Samuel 31:4: Defeated and critically wounded on Mount Gilboa, Saul took his own sword and fell upon it.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_05",
                subject = "CRS",
                topic = "The Exodus",
                year = "PT. 1",
                questionText = "“…The Lord will fight for you, and you have only to be still.” This statement was made by Moses when the _____.",
                optionA = "Egyptians were pursuing the Israelites before the Red Sea",
                optionB = "Israelites were standing before Joshua",
                optionC = "Israelites were standing before King Pharaoh",
                optionD = "Israelites’ chariots were crossing the Red Sea",
                correctAnswerIndex = 0,
                explanation = "Exodus 14:13-14: Moses reassured the terrified Israelites trapped between Pharaoh's approaching army and the Red Sea.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_06",
                subject = "CRS",
                topic = "Solomon's Reign",
                year = "PT. 1",
                questionText = "God told Solomon that He would surely tear the kingdom from him and give it to his _____.",
                optionA = "son",
                optionB = "brother",
                optionC = "servant",
                optionD = "army commander",
                correctAnswerIndex = 2,
                explanation = "1 Kings 11:11: Because Solomon turned his heart after foreign gods, the LORD declared He would tear the kingdom away and give it to his servant Jeroboam.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_07",
                subject = "CRS",
                topic = "David's Consolidation",
                year = "PT. 1",
                questionText = "Why did Joab kill Abner?",
                optionA = "He wanted to avenge the death of his brother",
                optionB = "He feared that Abner would take over his post",
                optionC = "Abner only came to deceive David",
                optionD = "He was an enemy who came to spy on David",
                correctAnswerIndex = 0,
                explanation = "2 Samuel 3:27, 30: Joab and Abishai murdered Abner because he had killed their brother Asahel in the battle at Gibeon.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_08",
                subject = "CRS",
                topic = "Covenant with Abraham",
                year = "PT. 1",
                questionText = "When God told Abraham that Sarah would have a child, Abraham laughed because _____.",
                optionA = "he already had a child by Hagar",
                optionB = "his wife Sarah was barren",
                optionC = "his wife was too old to have a child",
                optionD = "he was amused by the promise",
                correctAnswerIndex = 2,
                explanation = "Genesis 17:17: Abraham fell upon his face and laughed at the prospect of Sarah bearing at age ninety.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_09",
                subject = "CRS",
                topic = "Creation Story",
                year = "PT. 1",
                questionText = "In the beginning, God created the _____.",
                optionA = "heavens and the earth",
                optionB = "animals and the birds",
                optionC = "light and the darkness",
                optionD = "water and the dry land.",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:1: 'In the beginning God created the heavens and the earth.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_10",
                subject = "CRS",
                topic = "Moses' Call",
                year = "PT. 1",
                questionText = "Moses fled Egypt to the land of Midian because _____.",
                optionA = "he was afraid that his crime would be made known",
                optionB = "Pharaoh wanted to kill him for the crime he had committed",
                optionC = "his countryman asked if he would also kill him",
                optionD = "he had killed an Egyptian and buried him in the sand",
                correctAnswerIndex = 1,
                explanation = "Exodus 2:15: When Pharaoh heard that Moses had killed an Egyptian, he sought to slay him, causing Moses to flee to Midian.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_11",
                subject = "CRS",
                topic = "Saul and the Amalekites",
                year = "PT. 1",
                questionText = "The LORD sent Samuel to Saul to go and destroy the Amalekites because _____.",
                optionA = "they opposed Israel on their way out of Egypt",
                optionB = "they were idolaters",
                optionC = "they disobeyed God",
                optionD = "their land had been given to Israel after the battle",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 15:2: The LORD remembered what Amalek did in ambushing Israel on their journey from Egypt.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_12",
                subject = "CRS",
                topic = "Creation Story",
                year = "PT. 1",
                questionText = "In the creation story, man was permitted to _____.",
                optionA = "plant fruit trees for food",
                optionB = "water the garden",
                optionC = "make garments of skin",
                optionD = "name all the creatures",
                correctAnswerIndex = 3,
                explanation = "Genesis 2:19-20: God brought the animals to Adam to see what he would call them, and Adam gave names to all cattle, birds, and beasts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_13",
                subject = "CRS",
                topic = "Mount Sinai Covenant",
                year = "PT. 1",
                questionText = "God instructed Moses on Mount Sinai to _____.",
                optionA = "speak to the rock",
                optionB = "strike the rock",
                optionC = "consecrate the people",
                optionD = "pray for the people",
                correctAnswerIndex = 2,
                explanation = "Exodus 19:10-11: The LORD told Moses, 'Go to the people and consecrate them today and tomorrow, and let them wash their garments.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_14",
                subject = "CRS",
                topic = "Faith in Trial",
                year = "PT. 1",
                questionText = "“...If it be so, our God whom we serve is able to deliver us from the burning fiery furnace...” The statement above portrays Shadrach, Meshach and Abednego as _____.",
                optionA = "men of faith",
                optionB = "disillusioned men",
                optionC = "stubborn men",
                optionD = "men with pride",
                correctAnswerIndex = 0,
                explanation = "Daniel 3:17: The three Hebrew youths displayed unwavering faith in God's power and sovereignty before King Nebuchadnezzar.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_15",
                subject = "CRS",
                topic = "Prophet Ezekiel",
                year = "PT. 1",
                questionText = "Prophet Ezekiel described the house of Israel as having a hard forehead and stubborn heart because the people _____.",
                optionA = "lacked confidence in him",
                optionB = "refused to listen to him",
                optionC = "had taken God for granted",
                optionD = "had endured suffering",
                correctAnswerIndex = 1,
                explanation = "Ezekiel 3:7: 'The house of Israel will not listen to you, for they will not listen to me; for all the house of Israel are of a hard forehead and of a stubborn heart.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_16",
                subject = "CRS",
                topic = "Jonah's Mission",
                year = "PT. 1",
                questionText = "“And the LORD God appointed a plant, and made it come up over Jonah...” The statement above taught Jonah that _____.",
                optionA = "the repentance of the Ninevites would be short-lived",
                optionB = "God is sovereign",
                optionC = "his assignment would not last long",
                optionD = "God is merciful",
                correctAnswerIndex = 3,
                explanation = "Jonah 4:10-11: God used the gourd and worm to instruct Jonah on divine compassion and mercy toward the people of Nineveh.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_17",
                subject = "CRS",
                topic = "Ahab and Naboth",
                year = "PT. 1",
                questionText = "“Why is your spirit so vexed that you eat no food?” The addressee was sad because _____.",
                optionA = "Naboth refused to give him his vineyard",
                optionB = "he had an encounter with Elijah",
                optionC = "his inheritance had been taken away",
                optionD = "Jezebel refused to speak to him",
                correctAnswerIndex = 0,
                explanation = "1 Kings 21:5: Jezebel found King Ahab sulking on his couch because Naboth the Jezreelite refused to sell him his ancestral vineyard.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_18",
                subject = "CRS",
                topic = "Prophet Isaiah",
                year = "PT. 1",
                questionText = "Isaiah teaches that the LORD wants His people to demonstrate holiness by _____.",
                optionA = "observing religious festivals",
                optionB = "offering more sacrifices",
                optionC = "doing justice and not evil",
                optionD = "honouring their father and mother",
                correctAnswerIndex = 2,
                explanation = "Isaiah 1:16-17: 'Cease to do evil, learn to do good; seek justice, rescue the oppressed, defend the orphan, plead for the widow.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_19",
                subject = "CRS",
                topic = "Josiah's Religious Reforms",
                year = "PT. 1",
                questionText = "One of the reforms of King Josiah was that _____.",
                optionA = "he worshipped at the brook Kidron",
                optionB = "he defiled Topheth in the valley of the sons of Hinnom",
                optionC = "he allowed the worship of Asherah",
                optionD = "the priests were allowed to worship in the temple",
                correctAnswerIndex = 1,
                explanation = "2 Kings 23:10: Josiah defiled Topheth so that no one might burn his son or daughter as an offering to Molech.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_20",
                subject = "CRS",
                topic = "Prophet Hosea",
                year = "PT. 1",
                questionText = "The main lesson of Hosea’s teachings is that God _____.",
                optionA = "will pour His spirit on all flesh",
                optionB = "accepts every free-will offering",
                optionC = "will create a new heart in His people",
                optionD = "prefers steadfast love to sacrifice",
                correctAnswerIndex = 3,
                explanation = "Hosea 6:6: 'For I desire steadfast love and not sacrifice, the knowledge of God rather than burnt offerings.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_21",
                subject = "CRS",
                topic = "Elisha and Naaman",
                year = "PT. 1",
                questionText = "The reaction of Naaman to the instruction of Elisha showed that he was _____.",
                optionA = "proud",
                optionB = "faithless",
                optionC = "ignorant",
                optionD = "stubborn",
                correctAnswerIndex = 0,
                explanation = "2 Kings 5:11-12: Naaman was indignant and expected Elisha to come out in person, protesting that the rivers of Damascus were superior to all Israel's waters.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_22",
                subject = "CRS",
                topic = "Daniel in Babylon",
                year = "PT. 1",
                questionText = "Daniel became distinguished above all other presidents and satraps because he _____.",
                optionA = "interpreted the king’s dreams",
                optionB = "refused to worship the golden calf",
                optionC = "worshipped only one God",
                optionD = "had an excellent spirit in him",
                correctAnswerIndex = 3,
                explanation = "Daniel 6:3: 'Then this Daniel was preferred above the presidents and princes, because an excellent spirit was in him.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_23",
                subject = "CRS",
                topic = "Elijah's Ministry",
                year = "PT. 1",
                questionText = "When Elijah escaped from Ahab to the brook Cherith, he was fed by _____.",
                optionA = "angels",
                optionB = "ravens",
                optionC = "doves",
                optionD = "sparrows",
                correctAnswerIndex = 1,
                explanation = "1 Kings 17:4-6: The ravens brought Elijah bread and meat in the morning and evening at the brook Cherith.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_24",
                subject = "CRS",
                topic = "Early Church Missions",
                year = "PT. 1",
                questionText = "The man appointed by the Holy Ghost to go on the missionary journey with Saul was _____.",
                optionA = "Lucius",
                optionB = "Barnabas",
                optionC = "Peter",
                optionD = "Mark",
                correctAnswerIndex = 1,
                explanation = "Acts 13:2: The Holy Spirit said, 'Set apart for me Barnabas and Saul for the work to which I have called them.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_25",
                subject = "CRS",
                topic = "Teachings of Jesus",
                year = "PT. 1",
                questionText = "The mark of a true disciple according to Jesus Christ is _____.",
                optionA = "loving one another",
                optionB = "keeping the Ten Commandments",
                optionC = "knowing the word",
                optionD = "fasting and praying",
                correctAnswerIndex = 0,
                explanation = "John 13:35: 'By this all people will know that you are my disciples, if you have love for one another.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_26",
                subject = "CRS",
                topic = "The Early Church",
                year = "PT. 1",
                questionText = "The main complaint of the Hellenists against the Hebrews in the early Church was that their _____.",
                optionA = "men were neglected",
                optionB = "widows were neglected",
                optionC = "new converts were neglected",
                optionD = "children were neglected",
                correctAnswerIndex = 1,
                explanation = "Acts 6:1: The Hellenists murmured against the Hebrews because their widows were neglected in the daily distribution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_27",
                subject = "CRS",
                topic = "The Transfiguration",
                year = "PT. 1",
                questionText = "Peter, James and John were asked to keep their experience of the transfiguration secret until _____.",
                optionA = "the kingdom of God comes",
                optionB = "they met the other disciples",
                optionC = "they descended from the mount",
                optionD = "the son of man is raised from the dead",
                correctAnswerIndex = 3,
                explanation = "Matthew 17:9: Jesus commanded them, 'Tell no one the vision, until the Son of man is raised from the dead.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_28",
                subject = "CRS",
                topic = "The True Vine",
                year = "PT. 1",
                questionText = "According to Jesus, every branch of tree that bears fruit, He would prune. Branch in this context refers to _____.",
                optionA = "man",
                optionB = "an angel",
                optionC = "the Jews",
                optionD = "the Gentiles",
                correctAnswerIndex = 0,
                explanation = "John 15:5: 'I am the vine, you are the branches. He who abides in me, and I in him, he it is that bears much fruit.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_29",
                subject = "CRS",
                topic = "The Gospel of John",
                year = "PT. 1",
                questionText = "John declares that for a man to have eternal life he must _____.",
                optionA = "preach the gospel of Christ",
                optionB = "possess the Holy Spirit",
                optionC = "beat everyone that sold and bought",
                optionD = "drove out all who sold and bought",
                correctAnswerIndex = 1,
                explanation = "John 3:5, 36: Being born of water and the Spirit is required to enter the Kingdom of God and possess eternal life.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_30",
                subject = "CRS",
                topic = "Cleansing the Temple",
                year = "PT. 1",
                questionText = "When Jesus entered the temple in Jerusalem, He _____.",
                optionA = "contended with the scribes and the Pharisees",
                optionB = "read from the book of Isaiah",
                optionC = "beat everyone that sold and bought",
                optionD = "drove out all who sold and bought",
                correctAnswerIndex = 3,
                explanation = "Matthew 21:12: Jesus entered the temple of God and drove out all who sold and bought in the temple courts.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_31",
                subject = "CRS",
                topic = "Temptation of Jesus",
                year = "PT. 1",
                questionText = "Jesus’ reply to the Devil’s command to throw Himself down from the pinnacle of the temple was _____.",
                optionA = "“…Man shall not live by bread alone…”",
                optionB = "“…You shall not tempt the Lord your God.”",
                optionC = "“…You shall worship the Lord your God and Him only shall you serve.”",
                optionD = "“He will give his angels charge of you.”",
                correctAnswerIndex = 1,
                explanation = "Matthew 4:7: Jesus said to him, 'Again it is written, You shall not tempt the Lord your God.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_32",
                subject = "CRS",
                topic = "The Good Samaritan",
                year = "PT. 1",
                questionText = "“Teacher, what shall I do to inherit eternal life?” The lawyer who asked this question wanted to _____.",
                optionA = "put Christ to the test",
                optionB = "please the crowd",
                optionC = "prove his knowledge of the law",
                optionD = "condemn Christ",
                correctAnswerIndex = 0,
                explanation = "Luke 10:25: A lawyer stood up to put Jesus to the test, saying, 'Teacher, what shall I do to inherit eternal life?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_33",
                subject = "CRS",
                topic = "Miracles of Jesus",
                year = "PT. 1",
                questionText = "In the story of stilling the storm, the disciples were surprised because _____.",
                optionA = "Jesus was deeply asleep in the boat while the storm raged",
                optionB = "Jesus rebuked them for lack of faith",
                optionC = "the wind and the sea obeyed Jesus",
                optionD = "the storm disturbed the boat even with Jesus in it",
                correctAnswerIndex = 2,
                explanation = "Mark 4:41: They were filled with great awe and said to one another, 'Who then is this, that even wind and sea obey him?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_34",
                subject = "CRS",
                topic = "Day of Pentecost",
                year = "PT. 1",
                questionText = "In his reference to the events of the day of Pentecost, Peter said that they were the fulfilment of the prophecy of _____.",
                optionA = "Jeremiah",
                optionB = "Joel",
                optionC = "Jonah",
                optionD = "Isaiah",
                correctAnswerIndex = 1,
                explanation = "Acts 2:16: Peter declared, 'This is what was spoken by the prophet Joel: In the last days it shall be, God declares, that I will pour out my Spirit upon all flesh.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_35",
                subject = "CRS",
                topic = "Raising of Lazarus",
                year = "PT. 1",
                questionText = "“Yes, Lord; I believe that you are the Christ, the Son of God, He who is coming into the world.” The confession was made during the _____.",
                optionA = "changing of water to wine",
                optionB = "transfiguration of Jesus Christ",
                optionC = "raising of Lazarus",
                optionD = "healing of the epileptic boy",
                correctAnswerIndex = 2,
                explanation = "John 11:27: Martha made this famous confession of faith before Jesus raised her brother Lazarus from the dead.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_36",
                subject = "CRS",
                topic = "Miracles of Jesus",
                year = "PT. 1",
                questionText = "Before Jesus raised Jairus’ daughter, the people mocked Him because he _____.",
                optionA = "told them that the girl was not dead but sleeping",
                optionB = "rebuked them for weeping and mourning over the dead",
                optionC = "did not pray before performing the miracle",
                optionD = "did not arrive at the place before the girl died",
                correctAnswerIndex = 0,
                explanation = "Mark 5:39-40: When Jesus said the child was not dead but asleep, the mourners laughed at Him in disbelief.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_37",
                subject = "CRS",
                topic = "Blind Bartimaeus",
                year = "PT. 1",
                questionText = "When Bartimaeus wanted Jesus to heal him, he _____.",
                optionA = "waited for Him by the roadside",
                optionB = "requested to be led to Him",
                optionC = "expressed his faith in Him",
                optionD = "persistently cried out for help",
                correctAnswerIndex = 3,
                explanation = "Mark 10:47-48: Blind Bartimaeus cried out all the more persistently, 'Jesus, Son of David, have mercy on me!' despite being rebuked.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_38",
                subject = "CRS",
                topic = "Healing of the Paralytic",
                year = "PT. 1",
                questionText = "The teachers of the law accused Jesus of blasphemy because He _____.",
                optionA = "claimed to have power to heal the sick",
                optionB = "declared that He had authority to forgive sin",
                optionC = "said sin was the cause of sickness",
                optionD = "called Himself Son of Man",
                correctAnswerIndex = 1,
                explanation = "Mark 2:5-7: When Jesus told the paralytic his sins were forgiven, the scribes questioned in their hearts: 'Who can forgive sins but God alone?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_39",
                subject = "CRS",
                topic = "Trial of Jesus",
                year = "PT. 1",
                questionText = "“Have nothing to do with that righteous man, for I have suffered much over him today in a dream.” This statement was made by Pilate’s wife during _____.",
                optionA = "the arrest of Jesus",
                optionB = "Jesus’ betrayal",
                optionC = "Jesus’ trial",
                optionD = "Jesus’ crucifixion",
                correctAnswerIndex = 2,
                explanation = "Matthew 27:19: While Pilate was sitting on the judgment seat, his wife sent word warning him to have nothing to do with that innocent man.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_40",
                subject = "CRS",
                topic = "Sermon on the Mount",
                year = "PT. 1",
                questionText = "According to Jesus, believers who forgive the sins of others will _____.",
                optionA = "enter the Kingdom of God",
                optionB = "be forgiven by God",
                optionC = "receive a crown of life",
                optionD = "inherit the earth",
                correctAnswerIndex = 1,
                explanation = "Matthew 6:14: 'For if you forgive others their trespasses, your heavenly Father will also forgive you.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_41",
                subject = "CRS",
                topic = "Parables of Jesus",
                year = "PT. 1",
                questionText = "In the parable of the wheat and the tares, the bad seed was sowed by the _____.",
                optionA = "Devil",
                optionB = "Scribes",
                optionC = "Pharisees",
                optionD = "Sadducees",
                correctAnswerIndex = 0,
                explanation = "Matthew 13:25, 39: The enemy who sowed the tares among the wheat is the Devil.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_42",
                subject = "CRS",
                topic = "Christian Giving",
                year = "PT. 1",
                questionText = "According to Paul, generosity produces _____.",
                optionA = "righteousness",
                optionB = "thanksgiving to God",
                optionC = "salvation",
                optionD = "the grace of God",
                correctAnswerIndex = 1,
                explanation = "2 Corinthians 9:11-12: Christian generosity produces thanksgiving to God and overflows in many expressions of praise.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_43",
                subject = "CRS",
                topic = "Epistle of James",
                year = "PT. 1",
                questionText = "‘Is it not they who blaspheme the honourable name which was invoked over you?’ According to James in the statement above, they refers to the _____.",
                optionA = "principalities",
                optionB = "needy",
                optionC = "authorities",
                optionD = "rich",
                correctAnswerIndex = 3,
                explanation = "James 2:6-7: James rebuked partiality, noting that it was the unscrupulous rich who oppressed the poor and blasphemed Christ's name.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_44",
                subject = "CRS",
                topic = "Paul's Epistles",
                year = "PT. 1",
                questionText = "Paul reminded the Thessalonians that he did not eat anyone’s bread without paying for it. This statement teaches _____.",
                optionA = "self-respect",
                optionB = "creativity",
                optionC = "hard work",
                optionD = "humility",
                correctAnswerIndex = 2,
                explanation = "2 Thessalonians 3:8-10: Paul worked day and night with his own hands to set an example of hard work and self-reliance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_45",
                subject = "CRS",
                topic = "Epistle to the Romans",
                year = "PT. 1",
                questionText = "According to Paul, he who loves his neighbour has _____.",
                optionA = "eternal life",
                optionB = "overcome all evils",
                optionC = "fulfilled the law",
                optionD = "peace with God",
                correctAnswerIndex = 2,
                explanation = "Romans 13:8: 'Owe no one anything, except to love one another; for he who loves his neighbour has fulfilled the law.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_46",
                subject = "CRS",
                topic = "Justification by Faith",
                year = "PT. 1",
                questionText = "Paul declares in Romans that as by one man’s disobedience many were made sinners, by one man’s obedience many will _____.",
                optionA = "be made righteous",
                optionB = "be made pure",
                optionC = "became steadfast in faith",
                optionD = "become loyal to God",
                correctAnswerIndex = 0,
                explanation = "Romans 5:19: As through Adam's disobedience all were constituted sinners, so through Christ's obedience many will be made righteous.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_47",
                subject = "CRS",
                topic = "Epistle of James",
                year = "PT. 1",
                questionText = "According to James, the prayer of a righteous man _____.",
                optionA = "can cleanse his sins",
                optionB = "has saving power",
                optionC = "can move mountains",
                optionD = "has great power in its effects",
                correctAnswerIndex = 3,
                explanation = "James 5:16: 'The prayer of a righteous person has great power as it is working.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_48",
                subject = "CRS",
                topic = "Eschatology",
                year = "PT. 1",
                questionText = "‘…. the day of the Lord will come like a thief in the night.’ The day of the Lord in the statement above refers to the day of _____.",
                optionA = "retribution",
                optionB = "repentance",
                optionC = "judgement",
                optionD = "tribulation",
                correctAnswerIndex = 2,
                explanation = "1 Thessalonians 5:2 / 2 Peter 3:10: The Day of the Lord refers to final divine judgment and Christ's unexpected return.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_49",
                subject = "CRS",
                topic = "Epistle of Peter",
                year = "PT. 1",
                questionText = "Peter urges Christians to live as freemen without necessarily using their freedom as a pretext for _____.",
                optionA = "evil",
                optionB = "immorality",
                optionC = "greed",
                optionD = "partiality",
                correctAnswerIndex = 0,
                explanation = "1 Peter 2:16: 'Live as people who are free, not using your freedom as a cover-up for evil, but living as servants of God.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt1_50",
                subject = "CRS",
                topic = "Baptism in Christ",
                year = "PT. 1",
                questionText = "Those that have been baptized into Jesus Christ, according to Paul, are _____.",
                optionA = "cleansed of their sins",
                optionB = "baptized into His death",
                optionC = "sanctified in Him",
                optionD = "baptized into the Christian fold",
                correctAnswerIndex = 1,
                explanation = "Romans 6:3: 'Do you not know that all of us who have been baptized into Christ Jesus were baptized into his death?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.1 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_01",
                subject = "CRS",
                topic = "Saul and the Amalekites",
                year = "PT. 2",
                questionText = "What did Saul do after his defeat of the Amalekites?",
                optionA = "He set up a monument for himself",
                optionB = "He returned to Shiloh",
                optionC = "He offered sacrifices to god",
                optionD = "He repented to his sins",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 15:12: Samuel was informed that Saul went to Carmel and set up a monument for himself before turning toward Gilgal.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_02",
                subject = "CRS",
                topic = "The Crossing of the Red Sea",
                year = "PT. 2",
                questionText = "“Let us flee from before Israel: for the Lord fights for them…” The statement above was made by the Egyptian when ____",
                optionA = "Moses stretched out his hand over the sea",
                optionB = "their chariots were clogged in the sea",
                optionC = "the LORD drove the sea back by a strong east wind",
                optionD = "the angel of God stood between them and Hebrews",
                correctAnswerIndex = 1,
                explanation = "Exodus 14:25: When God threw the Egyptian host into panic and clogged their chariot wheels so that they drove heavily, the Egyptians cried out to flee.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_03",
                subject = "CRS",
                topic = "Provision in the Wilderness",
                year = "PT. 2",
                questionText = "Moses told the Israelites that the LORD would give them flesh in the evening and bread in the morning because he had _____.",
                optionA = "heard their prayers",
                optionB = "seen their suffering",
                optionC = "promised to feed them",
                optionD = "heard their murmuring",
                correctAnswerIndex = 3,
                explanation = "Exodus 16:8: Moses said, 'The LORD will give you in the evening meat to eat and in the morning bread to the full, because the LORD has heard your grumbling.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_04",
                subject = "CRS",
                topic = "David's Flight from Saul",
                year = "PT. 2",
                questionText = "“Is not David hiding himself on the hill of Hachilah; which is on the east of Jeshimon?” The report above was made to King Saul by the _____.",
                optionA = "Amalekites",
                optionB = "Philippines",
                optionC = "Hittites",
                optionD = "Ziphites",
                correctAnswerIndex = 3,
                explanation = "1 Samuel 26:1: The Ziphites came to Saul at Gibeah, reporting that David was hiding on the hill of Hachilah.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_05",
                subject = "CRS",
                topic = "Birth and Dedication of Samuel",
                year = "PT. 2",
                questionText = "‘The LORD give you children by this woman. Eli offered this prayer because of Hannah’s _____.",
                optionA = "love for the service",
                optionB = "loan of Samuel to the lord",
                optionC = "desire for more children from God",
                optionD = "faith in God",
                correctAnswerIndex = 1,
                explanation = "1 Samuel 2:20: Eli blessed Elkanah and his wife, praying for children in place of the one she lent/gave to the LORD.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_06",
                subject = "CRS",
                topic = "Creation and Eden",
                year = "PT. 2",
                questionText = "The river that flowed out of Eden to water the garden divided and became four rivers namely _____.",
                optionA = "Nile, Pishon, Euphrates and Tigris",
                optionB = "Pishon, Tigris, Gihon and Nile",
                optionC = "Gihon, Pishon, Tigris and Euphrates",
                optionD = "Pishon, Euphrates, Gihon and Jordan",
                correctAnswerIndex = 2,
                explanation = "Genesis 2:10-14: The four headwaters branching from Eden were Pishon, Gihon, Tigris (Hiddekel), and Euphrates.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_07",
                subject = "CRS",
                topic = "Division of the Kingdom",
                year = "PT. 2",
                questionText = "King Rehoboam refused to take the counsel of the elders because _____.",
                optionA = "it was wrong counsel",
                optionB = "he was afraid of the outcome of their counsel",
                optionC = "he was stubborn",
                optionD = "it was a turn of affairs brought about by the LORD",
                correctAnswerIndex = 3,
                explanation = "1 Kings 12:15: King Rehoboam did not listen to the people, for it was a turn of affairs brought about by the LORD to fulfill His prophecy through Ahijah.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_08",
                subject = "CRS",
                topic = "David Enters Saul's Service",
                year = "PT. 2",
                questionText = "King Saul asked Jesse to send David to him because he wanted David to _____.",
                optionA = "kill goliath",
                optionB = "marry his daughter, Michael",
                optionC = "become Jonathan’s friend",
                optionD = "serve him",
                correctAnswerIndex = 3,
                explanation = "1 Samuel 16:19-22: Saul sent messengers requesting Jesse's son David to enter his court service and soothe him with the lyre.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_09",
                subject = "CRS",
                topic = "The New Covenant",
                year = "PT. 2",
                questionText = "The new covenant God made with the house of Israel and the house of Judah was written on _____.",
                optionA = "their hearts",
                optionB = "stones",
                optionC = "their foreheads",
                optionD = "tablets",
                correctAnswerIndex = 0,
                explanation = "Jeremiah 31:33: 'I will put my law within them, and I will write it on their hearts; and I will be their God, and they shall be my people.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_10",
                subject = "CRS",
                topic = "Covenant at Sinai",
                year = "PT. 2",
                questionText = "All the words which the LORD has spoken we will do. What was Moses response to this declaration by the Israelites?",
                optionA = "He asked them to pick twelve stones to represent the tribes",
                optionB = "He offered peace offerings to the LORD",
                optionC = "he charged them to walk faithfully before the LORD",
                optionD = "he said that the LORD was witness to their declaration",
                correctAnswerIndex = 1,
                explanation = "Exodus 24:3-5: Moses built an altar at the foot of the mountain with twelve pillars and sent young men who offered burnt and peace offerings.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_11",
                subject = "CRS",
                topic = "Covenant with Noah",
                year = "PT. 2",
                questionText = "The sign of the covenant between God and Noah for all future generations was _____.",
                optionA = "blood",
                optionB = "treaty of peace",
                optionC = "circumcision",
                optionD = "bow in the cloud",
                correctAnswerIndex = 3,
                explanation = "Genesis 9:13: 'I have set my bow in the cloud, and it shall be a sign of the covenant between me and the earth.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_12",
                subject = "CRS",
                topic = "The Call of Moses",
                year = "PT. 2",
                questionText = "The signs that God showed to Moses at his call were meant to _____.",
                optionA = "convince the people that he had been sent by God",
                optionB = "portray him as superior to the Egyptian magicians",
                optionC = "enable him to perform miracles before Pharaoh",
                optionD = "convince Pharaoh that he was the prophet of God",
                correctAnswerIndex = 0,
                explanation = "Exodus 4:1-5: The miraculous signs (rod becoming a serpent, leprous hand) were given so that the Israelites might believe the LORD had appeared to Moses.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_13",
                subject = "CRS",
                topic = "Josiah's Religious Reforms",
                year = "PT. 2",
                questionText = "King Josiah defiled Topheth which was in the valley of the sons of Hinnom during his reform in Israel so that _____.",
                optionA = "he might revive the worship of the sun God",
                optionB = "he might pull down Topheth and break Molech into pieces",
                optionC = "no one would worship Molech",
                optionD = "no one might sacrifice human beings again to Molech",
                correctAnswerIndex = 3,
                explanation = "2 Kings 23:10: Josiah desecrated Topheth in Hinnom so that no one could pass his son or daughter through the fire to Molech.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_14",
                subject = "CRS",
                topic = "Prophet Amos",
                year = "PT. 2",
                questionText = "Amos declared that the Jews who built houses of Hewn stone would not dwell in them because they _____.",
                optionA = "trampled upon the poor",
                optionB = "persecuted the prophets",
                optionC = "swore falsely",
                optionD = "worshipped other gods",
                correctAnswerIndex = 0,
                explanation = "Amos 5:11: 'Because you trample on the poor and take from them levies of wheat, you have built houses of hewn stone, but you shall not dwell in them.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_15",
                subject = "CRS",
                topic = "Prophet Isaiah",
                year = "PT. 2",
                questionText = "What acts of righteousness did Isaiah admonish his people to demonstrate?",
                optionA = "helping the poor and offering sacrifice",
                optionB = "defending the orphans and respecting the widows",
                optionC = "avoiding evils and praying for others",
                optionD = "Learning to do good and seeking justice",
                correctAnswerIndex = 3,
                explanation = "Isaiah 1:17: 'Learn to do good; seek justice, correct oppression; bring justice to the fatherless, plead the widow's cause.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_16",
                subject = "CRS",
                topic = "Prophet Jeremiah",
                year = "PT. 2",
                questionText = "God promised the faithless Israelites that if they repented of their sins and returned to Him. He would _____.",
                optionA = "deliver their enemies into their hands",
                optionB = "fill them with his knowledge",
                optionC = "give them favour in the sight of the nations",
                optionD = "give them shepherds after his own heart",
                correctAnswerIndex = 3,
                explanation = "Jeremiah 3:14-15: 'Return, O faithless children... I will give you shepherds after my own heart, who will feed you with knowledge and understanding.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_17",
                subject = "CRS",
                topic = "Jonah's Prayer",
                year = "PT. 2",
                questionText = "“...When my soul fainted within me, I remembered the LORD; and my prayer came to thee…” The prayer above was offered by Jonah _____.",
                optionA = "at Nineveh",
                optionB = "at Tarshish",
                optionC = "in the ship",
                optionD = "in the belly of the fish",
                correctAnswerIndex = 3,
                explanation = "Jonah 2:7: In his prayer from the belly of the great fish, Jonah acknowledged God's deliverance when his soul fainted.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_18",
                subject = "CRS",
                topic = "The Ark Among Philistines",
                year = "PT. 2",
                questionText = "“The ark of the God of Israel must not remain with us...” The Philistines who made the statement above were anxious to get rid of the ark because _____.",
                optionA = "they could not handle it",
                optionB = "the hand of God was heavy upon them",
                optionC = "their women were becoming barren",
                optionD = "the Israelites had mustered forces against them",
                correctAnswerIndex = 1,
                explanation = "1 Samuel 5:7: When the men of Ashdod saw the divine plague and devastation of Dagon, they realized God's hand was heavy on them.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_19",
                subject = "CRS",
                topic = "Book of Daniel",
                year = "PT. 2",
                questionText = "“At the time shall arise.... the great prince who has charge of your people...” In the statement above by Daniel, the great prince refers to _____.",
                optionA = "Gabriel",
                optionB = "the Deliverer",
                optionC = "Michael",
                optionD = "the Messiah",
                correctAnswerIndex = 2,
                explanation = "Daniel 12:1: 'At that time shall arise Michael, the great prince who has charge of your people.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_20",
                subject = "CRS",
                topic = "Prophet Hosea",
                year = "PT. 2",
                questionText = "According to Hosea, the LORD would not have pity upon the children of his faithless wife because _____.",
                optionA = "they were rebellious children",
                optionB = "they had not been faithful",
                optionC = "their mother had not shown pity on them",
                optionD = "their mother had played the harlot",
                correctAnswerIndex = 3,
                explanation = "Hosea 2:4-5: 'Upon her children also I will have no pity, because they are children of whoredom. For their mother has played the harlot.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_21",
                subject = "CRS",
                topic = "Ahab's Humiliation",
                year = "PT. 2",
                questionText = "God decided not to bring evil in Ahab’s days but in the days of son because Ahab _____.",
                optionA = "asked God for mercy",
                optionB = "returned Naboth’s vineyard",
                optionC = "fasted for forty days",
                optionD = "humbled himself before God",
                correctAnswerIndex = 3,
                explanation = "1 Kings 21:29: 'Because he has humbled himself before me, I will not bring the disaster in his days; but in his son's days I will bring the disaster.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_22",
                subject = "CRS",
                topic = "Fall of Jerusalem",
                year = "PT. 2",
                questionText = "When the Babylonians captured King Zedekiah, they _____.",
                optionA = "killed him immediately",
                optionB = "assaulted his wives in his presence",
                optionC = "put out his eyes",
                optionD = "took his sons to Babylon",
                correctAnswerIndex = 2,
                explanation = "2 Kings 25:7: They slaughtered Zedekiah's sons before his eyes, put out his eyes, and carried him captive to Babylon.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_23",
                subject = "CRS",
                topic = "The Fiery Furnace",
                year = "PT. 2",
                questionText = "The men who threw Shadrach, Meshach and Abednego into the fire were _____.",
                optionA = "amazed that the Hebrews were not burnt",
                optionB = "assisted to escape from being burnt",
                optionC = "promoted by the king",
                optionD = "consumed by the flames",
                correctAnswerIndex = 3,
                explanation = "Daniel 3:22: Because the king's command was urgent and the furnace overheated, the flame of the fire killed the men who took up Shadrach, Meshach, and Abednego.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_24",
                subject = "CRS",
                topic = "Prophet Amos",
                year = "PT. 2",
                questionText = "“Hear this word, you cows of Bashan... who oppress the poor, who crush the needy...” Cows of Bashan in the statement above refers to the _____.",
                optionA = "wicked kings",
                optionB = "women of Samaria",
                optionC = "Judges in Israel",
                optionD = "false prophets",
                correctAnswerIndex = 1,
                explanation = "Amos 4:1: Amos sarcastically termed the wealthy, self-indulgent aristocratic women of Samaria 'cows of Bashan' for oppressing the poor.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_25",
                subject = "CRS",
                topic = "Elijah Flees Jezebel",
                year = "PT. 2",
                questionText = "“It is enough; now O LORD, take away my life; for I am no better than my fathers.” The prayer above was said by Elijah when _____.",
                optionA = "he ran out of food",
                optionB = "he had no water to drink at the brook Cherith",
                optionC = "he learnt that Ahab was looking for him",
                optionD = "he was threatened by Jezebel",
                correctAnswerIndex = 3,
                explanation = "1 Kings 19:2-4: When Jezebel swore to take his life, Elijah fled into the wilderness of Beersheba and asked God to let him die.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_26",
                subject = "CRS",
                topic = "Nehemiah Rebuilds the Walls",
                year = "PT. 2",
                questionText = "In his effort to rebuild the walls of Jerusalem, Nehemiah prayed against insults of _____.",
                optionA = "Tobiah and Sanballat",
                optionB = "Amon and Shallum",
                optionC = "Nebuchadnezzar and Tobiah",
                optionD = "Geshem and Hulda",
                correctAnswerIndex = 0,
                explanation = "Nehemiah 4:1-4: Sanballat the Horonite and Tobiah the Ammonite bitterly ridiculed the rebuilding of Jerusalem's walls.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_27",
                subject = "CRS",
                topic = "Miracles of Jesus",
                year = "PT. 2",
                questionText = "According to Luke, Jesus healed the epileptic boy by _____.",
                optionA = "telling the boy to have faith",
                optionB = "rebuking the unclean spirit",
                optionC = "binding the evil spirit in him",
                optionD = "touching the boy",
                correctAnswerIndex = 1,
                explanation = "Luke 9:42: Jesus rebuked the unclean spirit, healed the boy, and returned him to his father.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_28",
                subject = "CRS",
                topic = "Crucifixion of Jesus",
                year = "PT. 2",
                questionText = "According to Luke, Jesus last words on the cross were _____.",
                optionA = "“I thirst”",
                optionB = "“woman behold your son”",
                optionC = "“Father, into thy hands I commit my spirit”",
                optionD = "“father, forgive them; for they know not what they do”",
                correctAnswerIndex = 2,
                explanation = "Luke 23:46: 'Then Jesus, calling out with a loud voice, said, Father, into your hands I commit my spirit! And having said this he breathed his last.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_29",
                subject = "CRS",
                topic = "Rich Man and Lazarus",
                year = "PT. 2",
                questionText = "”Father Abraham, have mercy upon me, and send Lazarus.” Abraham could not grant the rich man’s request because _____.",
                optionA = "the rich man lived in luxury while on earth",
                optionB = "there was a chasm between them",
                optionC = "he had no pity on the rich man",
                optionD = "his dogs used to lick Lazarus’s sores",
                correctAnswerIndex = 1,
                explanation = "Luke 16:26: Abraham replied that between them a great chasm had been fixed, preventing any crossing from one side to the other.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_30",
                subject = "CRS",
                topic = "The Transfiguration",
                year = "PT. 2",
                questionText = "In the story of the transfiguration of Jesus, Moses, Elijah represented the _____.",
                optionA = "Old Testament saints",
                optionB = "glory of God",
                optionC = "end of the age",
                optionD = "law and the prophets",
                correctAnswerIndex = 3,
                explanation = "Matthew 17:3-4: Moses (the Lawgiver) and Elijah (the Prophet) represented the fulfillment of the Law and the Prophets in Jesus Christ.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_31",
                subject = "CRS",
                topic = "The Good Shepherd",
                year = "PT. 2",
                questionText = "”...but he who enters by the door is the shepherd of the sheep.” The door in the statement refers to _____.",
                optionA = "the law",
                optionB = "the gospel",
                optionC = "Peter",
                optionD = "Jesus",
                correctAnswerIndex = 3,
                explanation = "John 10:7-9: Jesus declared, 'Truly, truly, I say to you, I am the door of the sheep... If anyone enters by me, he will be saved.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_32",
                subject = "CRS",
                topic = "Healing the Leper",
                year = "PT. 2",
                questionText = "In order to fulfil the law of Moses, Jesus told the leper He had healed to go and _____.",
                optionA = "proclaim the good news",
                optionB = "show himself to his household",
                optionC = "show himself to the priest",
                optionD = "make sacrifice to God",
                correctAnswerIndex = 2,
                explanation = "Mark 1:44: Jesus commanded him, 'Go, show yourself to the priest and offer for your cleansing what Moses commanded, as a proof to them.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_33",
                subject = "CRS",
                topic = "Apostles Before Sanhedrin",
                year = "PT. 2",
                questionText = "The Jewish religious leaders arrested and imprisoned the apostles the second time because _____.",
                optionA = "they performed miracles in the name of Jesus",
                optionB = "they disobeyed the law",
                optionC = "the high priest and the Sadducees excused them of treason",
                optionD = "the high priest and the Sadducees were jealous",
                correctAnswerIndex = 3,
                explanation = "Acts 5:17-18: The high priest rose up, and all who were with him (that is, the sect of the Sadducees), and filled with jealousy, arrested the apostles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_34",
                subject = "CRS",
                topic = "Mission of the Seventy",
                year = "PT. 2",
                questionText = "After the mission of the seventy, Jesus declared that he had given _____.",
                optionA = "the gift of healing",
                optionB = "power over the roman authorities",
                optionC = "authority over all the power of the enemy",
                optionD = "the gift of knowledge of the word",
                correctAnswerIndex = 2,
                explanation = "Luke 10:19: 'Behold, I have given you authority to tread on serpents and scorpions, and over all the power of the enemy, and nothing shall hurt you.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_35",
                subject = "CRS",
                topic = "Raising of Lazarus",
                year = "PT. 2",
                questionText = "Jesus did not go immediately to attend to Lazarus who has reported sick because he _____.",
                optionA = "wanted His disciples to believe in Him",
                optionB = "was too busy attending to other people",
                optionC = "did not know how serious the sickness was",
                optionD = "was careless about Lazarus",
                correctAnswerIndex = 0,
                explanation = "John 11:14-15: Jesus said plainly, 'Lazarus has died, and for your sake I am glad that I was not there, so that you may believe.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_36",
                subject = "CRS",
                topic = "Parables of the Kingdom",
                year = "PT. 2",
                questionText = "In the parable of the wheat and tares, the harvest time refers to the _____.",
                optionA = "white judgement throne",
                optionB = "millennium reign of Christ",
                optionC = "tribulation period",
                optionD = "close of the age",
                correctAnswerIndex = 3,
                explanation = "Matthew 13:39: 'The harvest is the end of the age, and the reapers are angels.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_37",
                subject = "CRS",
                topic = "Epistles of Peter",
                year = "PT. 2",
                questionText = "Peter teaches that good Christian conduct is characterized by love and _____.",
                optionA = "impartial judgement",
                optionB = "forbearance",
                optionC = "fear of God",
                optionD = "hard work",
                correctAnswerIndex = 2,
                explanation = "1 Peter 2:17: 'Honour all men. Love the brotherhood. Fear God. Honour the king.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_38",
                subject = "CRS",
                topic = "Spiritual Gifts",
                year = "PT. 2",
                questionText = "Paul teaches that the exercise of spiritual gifts by individual believers should be used to promote _____.",
                optionA = "faith",
                optionB = "cooperation",
                optionC = "competition",
                optionD = "knowledge",
                correctAnswerIndex = 1,
                explanation = "1 Corinthians 12:7, 25: Spiritual gifts are distributed by the Spirit for the common good and mutual harmony/cooperation in the body of Christ.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_39",
                subject = "CRS",
                topic = "Christian Leadership",
                year = "PT. 2",
                questionText = "Peter advises the elders to tend the flock of God with _____.",
                optionA = "authority and compassion",
                optionB = "a willing and cheerful heart",
                optionC = "knowledge and understanding",
                optionD = "zeal and credibility",
                correctAnswerIndex = 1,
                explanation = "1 Peter 5:2: 'Tend the flock of God that is your charge, not by constraint but willingly, not for shameful gain but eagerly.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_40",
                subject = "CRS",
                topic = "Paul's Epistles",
                year = "PT. 2",
                questionText = "Paul warned the Thessalonians against the deceit of false teachers concerning _____.",
                optionA = "their salvation in Christ",
                optionB = "activities of the man of sins",
                optionC = "the resurrection of the dead",
                optionD = "the second coming of Christ",
                correctAnswerIndex = 3,
                explanation = "2 Thessalonians 2:1-3: Paul urged them not to be quickly shaken regarding the day and coming of the Lord Jesus Christ.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_41",
                subject = "CRS",
                topic = "Epistle to the Philippians",
                year = "PT. 2",
                questionText = "Paul described the gifts he received from the Philippians as _____.",
                optionA = "peace offering",
                optionB = "treasure in heaven",
                optionC = "pleasing to God",
                optionD = "freewill offering",
                correctAnswerIndex = 2,
                explanation = "Philippians 4:18: Paul described their gifts as 'a fragrant aroma, an acceptable sacrifice, well-pleasing to God.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_42",
                subject = "CRS",
                topic = "Purpose of the Law",
                year = "PT. 2",
                questionText = "According to Paul, the purpose of the law is _____.",
                optionA = "to increase the knowledge of sin",
                optionB = "to bring about justification by the faith",
                optionC = "the fulfilment of divine promise",
                optionD = "to promote the faith in the crucified Christ",
                correctAnswerIndex = 0,
                explanation = "Romans 3:20: 'For by works of the law no human being will be justified in his sight, since through the law comes knowledge of sin.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_43",
                subject = "CRS",
                topic = "Riot at Ephesus",
                year = "PT. 2",
                questionText = "The man who stirred up the people against Paul in Ephesus was _____.",
                optionA = "Alexander",
                optionB = "Aristarchus",
                optionC = "Demetrius",
                optionD = "Gaius",
                correctAnswerIndex = 2,
                explanation = "Acts 19:24-26: Demetrius, a silversmith who made silver shrines of Artemis, incited the craftsmen and the mob against Paul.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_44",
                subject = "CRS",
                topic = "New Life in Christ",
                year = "PT. 2",
                questionText = "Paul teaches that believers have been buried and raised with Christ so that they might _____.",
                optionA = "adhere to the law",
                optionB = "walk in the newness of life",
                optionC = "grow in the knowledge of Christ",
                optionD = "walk in liberty",
                correctAnswerIndex = 1,
                explanation = "Romans 6:4: 'We were buried therefore with him by baptism into death, in order that, just as Christ was raised from the dead... we too might walk in newness of life.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_45",
                subject = "CRS",
                topic = "Against Partiality",
                year = "PT. 2",
                questionText = "According to James, because believers hold the faith of the lord Jesus Christ, they should _____.",
                optionA = "not show partiality",
                optionB = "not yield to temptation",
                optionC = "pray for one another",
                optionD = "overcome evil with good",
                correctAnswerIndex = 0,
                explanation = "James 2:1: 'My brothers, show no partiality as you hold the faith in our Lord Jesus Christ, the Lord of glory.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_46",
                subject = "CRS",
                topic = "Humility of Christ",
                year = "PT. 2",
                questionText = "According to Paul’s letter to the Philippians, Christ demonstrated His humility by _____.",
                optionA = "praying for his enemies",
                optionB = "washing the feet of his disciples",
                optionC = "taking the form of a servant",
                optionD = "dying on the cross",
                correctAnswerIndex = 2,
                explanation = "Philippians 2:7: Christ 'emptied himself, taking the form of a servant, being born in the likeness of men.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_47",
                subject = "CRS",
                topic = "Apostasy and Deception",
                year = "PT. 2",
                questionText = "According to Paul, God would send a strong delusion upon those who will perish because they _____.",
                optionA = "did not show love to the brethren",
                optionB = "had an unforgiving spirit",
                optionC = "were false teachers",
                optionD = "refused to believe the truth",
                correctAnswerIndex = 3,
                explanation = "2 Thessalonians 2:10-11: Because they refused to love and believe the truth, God sends them a strong delusion.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_48",
                subject = "CRS",
                topic = "Justification by Faith",
                year = "PT. 2",
                questionText = "According to Romans, justification is by faith through _____.",
                optionA = "obedience to the law",
                optionB = "works righteousness",
                optionC = "Being filled with the Holy Spirit",
                optionD = "redemption in Christ",
                correctAnswerIndex = 3,
                explanation = "Romans 3:24: Being justified freely by his grace through the redemption that came by Christ Jesus.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt2_49",
                subject = "CRS",
                topic = "Living in Expectation",
                year = "PT. 2",
                questionText = "Peter teaches that Christians should prepare for the day of the Lord by _____.",
                optionA = "giving alms to the poor",
                optionB = "having sober reflection",
                optionC = "living holy and godly lives",
                optionD = "fasting and praying",
                correctAnswerIndex = 2,
                explanation = "2 Peter 3:11: 'Since all these things are thus to be dissolved, what sort of people ought you to be in lives of holiness and godliness.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.2 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_01",
                subject = "CRS",
                topic = "David Spares Saul",
                year = "PT. 3",
                questionText = "David did not allow Abishai to destroy Saul because he _____.",
                optionA = "believed in the judgement of God",
                optionB = "wanted to avoid being guilty before the Lord",
                optionC = "wanted to disarm Saul before killing him",
                optionD = "wanted to see if Saul would repent eventually",
                correctAnswerIndex = 1,
                explanation = "1 Samuel 26:9: David told Abishai, 'Do not destroy him; for who can stretch out his hand against the Lord's anointed, and be guiltless?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_02",
                subject = "CRS",
                topic = "Blessings of Obedience",
                year = "PT. 3",
                questionText = "The reward for total obedience to the commandments of God is _____.",
                optionA = "wisdom",
                optionB = "life and length of days",
                optionC = "knowledge",
                optionD = "marital possessions",
                correctAnswerIndex = 1,
                explanation = "Proverbs 3:1-2: Keeping God's commandments brings length of days, long life, and peace.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_03",
                subject = "CRS",
                topic = "Creation of Man and Woman",
                year = "PT. 3",
                questionText = "Adam named his wife Eve because she was _____.",
                optionA = "deceived by the serpent",
                optionB = "the one that misled him",
                optionC = "the bone of his bones",
                optionD = "the mother of all living",
                correctAnswerIndex = 3,
                explanation = "Genesis 3:20: Adam called his wife's name Eve (Hawwah), because she was the mother of all living.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_04",
                subject = "CRS",
                topic = "The Call of Moses",
                year = "PT. 3",
                questionText = "What was the immediate reaction of Moses when he cast his rod on the ground at Mount Horeb and it became a serpent?",
                optionA = "He shouted for joy",
                optionB = "He fled from it",
                optionC = "He took it by the tail",
                optionD = "He caught it immediately",
                correctAnswerIndex = 1,
                explanation = "Exodus 4:3: Moses threw the rod on the ground, and it became a serpent, and Moses fled from it.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_05",
                subject = "CRS",
                topic = "Solomon's Disobedience",
                year = "PT. 3",
                questionText = "The consequence of King Solomon’s failure to keep the LORD’s commandment was _____.",
                optionA = "God’s promise to tear away part of the kingdom",
                optionB = "the disloyalty of his subjects",
                optionC = "the rebellion of the vassal states against his rule",
                optionD = "the loss of God’s favour",
                correctAnswerIndex = 0,
                explanation = "1 Kings 11:11-12: The LORD told Solomon He would tear the kingdom away from his son, leaving one tribe for David's sake.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_06",
                subject = "CRS",
                topic = "Prophet Isaiah",
                year = "PT. 3",
                questionText = "According to Prophet Isaiah, the creative ability of God is likened to that of a _____.",
                optionA = "potter and his earthen vessel",
                optionB = "ruler and his followers",
                optionC = "master and his servant",
                optionD = "shepherd and his sheep",
                correctAnswerIndex = 0,
                explanation = "Isaiah 64:8: 'Yet you, LORD, are our Father. We are the clay, you are the potter; we are all the work of your hand.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_07",
                subject = "CRS",
                topic = "David at Adullam",
                year = "PT. 3",
                questionText = "“David departed from there and escaped... and when his brothers and all his father’s house heard it...” In the statement above, where did David escape to?",
                optionA = "Mizpeh of Moab",
                optionB = "The land of Judah",
                optionC = "The cave of Adullam",
                optionD = "The wilderness of Engedi",
                correctAnswerIndex = 2,
                explanation = "1 Samuel 22:1: David departed from Gath and escaped to the cave of Adullam.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_08",
                subject = "CRS",
                topic = "Solomon and Hiram",
                year = "PT. 3",
                questionText = "Hiram, King of Tyre, was friendly with King Solomon because he _____.",
                optionA = "was afraid of war",
                optionB = "wanted to assist",
                optionC = "loved the wisdom of Solomon",
                optionD = "loved David, Solomon’s father",
                correctAnswerIndex = 3,
                explanation = "1 Kings 5:1: Hiram king of Tyre sent his servants to Solomon when he heard they had anointed him king, for Hiram had always loved David.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_09",
                subject = "CRS",
                topic = "Call of Abraham",
                year = "PT. 3",
                questionText = "“Go from your country and your kindred and your father’s house to the land that I will show you...” Where was Abraham when this command was given?",
                optionA = "Shechem",
                optionB = "Bethel",
                optionC = "Ur",
                optionD = "Haran",
                correctAnswerIndex = 3,
                explanation = "Genesis 12:1-4: The call to leave his father's house for Canaan came when Abram dwelt in Haran.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_10",
                subject = "CRS",
                topic = "Golden Calf Intercession",
                year = "PT. 3",
                questionText = "The LORD repented of the evil which he intended for His people because Moses _____.",
                optionA = "burnt the golden calf which the people made",
                optionB = "broke the tablets out of his hands",
                optionC = "made the people drink of the water of the burnt calf",
                optionD = "reminded Him of his promise to Abraham, Isaac and Israel",
                correctAnswerIndex = 3,
                explanation = "Exodus 32:13-14: Moses interceded by reminding God of His oath to Abraham, Isaac, and Israel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_11",
                subject = "CRS",
                topic = "Gideon's Calling",
                year = "PT. 3",
                questionText = "The altar that Gideon built at the oak of Ophrah was called _____.",
                optionA = "The LORD is present",
                optionB = "The LORD is strength",
                optionC = "The LORD is peace",
                optionD = "The LORD is great",
                correctAnswerIndex = 2,
                explanation = "Judges 6:24: Gideon built an altar there to the LORD and called it Yahweh-Shalom ('The LORD is Peace').",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_12",
                subject = "CRS",
                topic = "Spies Sent to Canaan",
                year = "PT. 3",
                questionText = "Moses sent men to spy out the land of Canaan in order to _____.",
                optionA = "measure the entire land",
                optionB = "share out the land",
                optionC = "know if it was good or bad",
                optionD = "know if it was flowing with milk and honey",
                correctAnswerIndex = 2,
                explanation = "Numbers 13:18-20: Moses instructed the twelve spies to see what the land was like, and whether the people who dwelt in it were strong or weak, good or bad.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_13",
                subject = "CRS",
                topic = "Creation and Marriage",
                year = "PT. 3",
                questionText = "The second creation story ends with the institution of _____.",
                optionA = "the sabbath",
                optionB = "the Passover",
                optionC = "marriage",
                optionD = "circumcision",
                correctAnswerIndex = 2,
                explanation = "Genesis 2:24: 'Therefore a man shall leave his father and his mother and hold fast to his wife, and they shall become one flesh.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_14",
                subject = "CRS",
                topic = "Absalom's Rebellion",
                year = "PT. 3",
                questionText = "The greatest domestic problem King David experienced which almost cost him his kingdom was _____.",
                optionA = "his adultery with Bathsheba",
                optionB = "the killing of Uriah",
                optionC = "the proclamation of Adonijah as king",
                optionD = "the revolt of Absalom against him",
                correctAnswerIndex = 3,
                explanation = "2 Samuel 15:10-14: Absalom's conspiracy and civil rebellion forced King David to flee Jerusalem.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_15",
                subject = "CRS",
                topic = "Ishmael's Blessing",
                year = "PT. 3",
                questionText = "The declaration by God that he would make a nation of the son of the slave woman meant that He _____.",
                optionA = "recognized Ishmael as Abraham’s descendant",
                optionB = "was not partial towards Isaac and Ishmael",
                optionC = "did not like the way Ishmael was sent out by Abraham",
                optionD = "was responsible for sending Ishmael out of Abraham’s house",
                correctAnswerIndex = 0,
                explanation = "Genesis 21:13: 'And of the son of the bondwoman will I make a nation, because he is thy seed.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_16",
                subject = "CRS",
                topic = "Joseph Interprets Pharaoh's Dreams",
                year = "PT. 3",
                questionText = "The chief butler said to Pharaoh, “I remember my faults today...” Faults refer to his _____.",
                optionA = "sins before he was imprisoned by Pharaoh",
                optionB = "inability to interpret Pharaoh’s dream",
                optionC = "inability to identify competent magicians, wise men and interpreters of dreams",
                optionD = "forgetting the young Hebrew who interpreted his dream correctly while in prison",
                correctAnswerIndex = 3,
                explanation = "Genesis 41:9-12: The cupbearer admitted forgetting Joseph in prison after Joseph had accurately interpreted his dream two years prior.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_17",
                subject = "CRS",
                topic = "Parables of Jesus",
                year = "PT. 3",
                questionText = "“...The earth produced of itself, first the blade, then the ear, then the full grain in the ear...” The statement above was made by Jesus in the parable of the _____.",
                optionA = "sower",
                optionB = "mustard seed",
                optionC = "weeds",
                optionD = "seed growing secretly",
                correctAnswerIndex = 3,
                explanation = "Mark 4:28: The Parable of the Growing Seed illustrates how the kingdom of God sprouts and matures mysteriously without human effort.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_18",
                subject = "CRS",
                topic = "Walking on Water",
                year = "PT. 3",
                questionText = "Peter became frightened as he walked on the sea because _____.",
                optionA = "he saw a ghost",
                optionB = "he doubted Jesus",
                optionC = "of the wind",
                optionD = "it was dark and cloudy",
                correctAnswerIndex = 2,
                explanation = "Matthew 14:30: 'But when he saw the wind, he was afraid, and beginning to sink he cried out, Lord, save me!'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_19",
                subject = "CRS",
                topic = "Healing at Jericho",
                year = "PT. 3",
                questionText = "What did the blind man by the roadside near Jericho do on receiving his sight?",
                optionA = "he jumped for joy and went away",
                optionB = "he thanked Jesus for healing him",
                optionC = "He followed Jesus, glorifying God",
                optionD = "he gave praise to God for making him whole",
                correctAnswerIndex = 2,
                explanation = "Luke 18:43: 'And immediately he recovered his sight and followed him, glorifying God.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_20",
                subject = "CRS",
                topic = "The Crucifixion",
                year = "PT. 3",
                questionText = "The order of the crucifixion events according to Luke’s Gospel is _____.",
                optionA = "crucifixion, lots casting for His dress, scoffing and mockery",
                optionB = "mockery, lots casting for His dress, scoffing and crucifixion",
                optionC = "lots casting for His dress, mockery, scoffing and crucifixion",
                optionD = "crucifixion, scoffing, mockery and lots casting for His dress",
                correctAnswerIndex = 0,
                explanation = "Luke 23:33-35: First they crucified Him, then divided His garments by casting lots, and the rulers and soldiers scoffed and mocked Him.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_21",
                subject = "CRS",
                topic = "Birth of John the Baptist",
                year = "PT. 3",
                questionText = "The angel told Zachariah that John the Baptist would drink no wine nor strong drink because he would _____.",
                optionA = "be the forerunner of Jesus",
                optionB = "only eat locusts and wild honey",
                optionC = "be filled with the Holy Spirit",
                optionD = "baptize sinners who would come to him",
                correctAnswerIndex = 2,
                explanation = "Luke 1:15: 'For he will be great before the Lord. And he must not drink wine or strong drink, and he will be filled with the Holy Spirit, even from his mother's womb.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_22",
                subject = "CRS",
                topic = "The Last Supper",
                year = "PT. 3",
                questionText = "What were the two emblems Jesus used during the Last Supper?",
                optionA = "the bread and the blood of the lamb",
                optionB = "the bread and the wine",
                optionC = "The unleavened bread and the fruit of the vine",
                optionD = "his blood and his body",
                correctAnswerIndex = 1,
                explanation = "Matthew 26:26-28: Jesus took bread, blessed and broke it, and then took the cup of wine, representing His body and blood of the new covenant.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_23",
                subject = "CRS",
                topic = "Replacement of Judas",
                year = "PT. 3",
                questionText = "The condition Peter gave for a person that would replace Judas Iscariot was that he must be _____.",
                optionA = "a witness to Jesus' ministry",
                optionB = "full of faith",
                optionC = "a disciple of John the Baptist",
                optionD = "a Galilean",
                correctAnswerIndex = 0,
                explanation = "Acts 1:21-22: He had to be one of the men who accompanied the apostles from John's baptism until Christ's ascension, to become a witness of His resurrection.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_24",
                subject = "CRS",
                topic = "Wedding at Cana",
                year = "PT. 3",
                questionText = "“They have no wine.” Jesus' immediate response to the statement above was _____.",
                optionA = "“Do whatever he tells you”",
                optionB = "“Fill the jar with water”",
                optionC = "“...Draw some out and take it to the steward of the feast”",
                optionD = "“O woman, what have you to do with me? My hour has not yet come”",
                correctAnswerIndex = 3,
                explanation = "John 2:4: Jesus said to Mary, 'Woman, what have you to do with me? My hour has not yet come.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_25",
                subject = "CRS",
                topic = "Riot in Ephesus",
                year = "PT. 3",
                questionText = "The Macedonians who travelled with Paul to Ephesus were _____.",
                optionA = "Alexander and Gaius",
                optionB = "Demetrius and Aristarchus",
                optionC = "Gaius and Aristarchus",
                optionD = "Demetrius and Alexander",
                correctAnswerIndex = 2,
                explanation = "Acts 19:29: The mob rushed into the theatre, dragging Gaius and Aristarchus, Macedonians who were Paul's travel companions.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_26",
                subject = "CRS",
                topic = "Epileptic Boy",
                year = "PT. 3",
                questionText = "“O faithless and perverse generation, how long am I to be with you and bear with you...” Jesus' statement above was addressed to _____.",
                optionA = "the Jews because of their unbelief",
                optionB = "His disciples because they could not heal",
                optionC = "the Pharisees because of their hypocrisy",
                optionD = "His own people because they did not give Him honour",
                correctAnswerIndex = 1,
                explanation = "Matthew 17:17 / Luke 9:41: Jesus addressed His disciples and the crowd when the disciples failed to cast out the demon from the epileptic boy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_27",
                subject = "CRS",
                topic = "First Epistle of John",
                year = "PT. 3",
                questionText = "According to the first Epistle of John, to have the son is to have _____.",
                optionA = "salvation",
                optionB = "the Holy Spirit",
                optionC = "the Father",
                optionD = "life",
                correctAnswerIndex = 3,
                explanation = "1 John 5:12: 'Whoever has the Son has life; whoever does not have the Son of God does not have life.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_28",
                subject = "CRS",
                topic = "Parable of the Weeds",
                year = "PT. 3",
                questionText = "In the explanation of the parable of the weeds, Jesus said that the righteous will _____.",
                optionA = "live forever in the kingdom of God",
                optionB = "be set aside from all cause of sin",
                optionC = "enter into glory with the Son of man",
                optionD = "shine like the sun in their Father’s kingdom",
                correctAnswerIndex = 3,
                explanation = "Matthew 13:43: 'Then the righteous will shine like the sun in the kingdom of their Father.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_29",
                subject = "CRS",
                topic = "Jerusalem Council",
                year = "PT. 3",
                questionText = "The resolution of the Council at Jerusalem was that the Gentiles should abstain from _____.",
                optionA = "adultery, greed, strangled meat and divination",
                optionB = "homosexuality, idolatry, fornication and strangled meat",
                optionC = "idolatry, unchastity, strangled meat and blood",
                optionD = "circumcision, whoremongering, homosexuality, falsehood",
                correctAnswerIndex = 2,
                explanation = "Acts 15:20, 29: Gentile converts were to abstain from things polluted by idols, from sexual immorality, from what has been strangled, and from blood.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_30",
                subject = "CRS",
                topic = "Parable of the Rich Fool",
                year = "PT. 3",
                questionText = "“...And I will say to my Soul, Soul you have ample goods laid up for many years take you ease, eat, drink, be merry…” God’s response to the statement above was that _____.",
                optionA = "the servant should enter into the rest of his Lord",
                optionB = "his soul was required of him",
                optionC = "his soul should be satisfied with his increase",
                optionD = "he should lay up more treasures for himself",
                correctAnswerIndex = 1,
                explanation = "Luke 12:20: 'God said to him, Fool! This night your soul is required of you, and the things you have prepared, whose will they be?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_31",
                subject = "CRS",
                topic = "Peter's Denial",
                year = "PT. 3",
                questionText = "Before the cock crowed, Peter denied Jesus three times. Who was the first person to recognize him as one of the disciples?",
                optionA = "A bystander",
                optionB = "A maid",
                optionC = "One of the rulers",
                optionD = "The High Priest",
                correctAnswerIndex = 1,
                explanation = "Luke 22:56 / Mark 14:66-67: A servant girl (maid) seeing Peter warming himself at the fire looked closely at him and recognized him.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_32",
                subject = "CRS",
                topic = "Woman with the Issue of Blood",
                year = "PT. 3",
                questionText = "The woman with the flow of blood touched the garment of Jesus because _____.",
                optionA = "she had heard the reports about Jesus",
                optionB = "she had suffered much under many physicians",
                optionC = "the crowd could not allow her to speak to Jesus",
                optionD = "she believed that she would be well",
                correctAnswerIndex = 3,
                explanation = "Mark 5:28: 'For she said, If I touch even his garments, I will be made well.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_33",
                subject = "CRS",
                topic = "Preparation for Second Coming",
                year = "PT. 3",
                questionText = "In Paul’s letter to the Thessalonians, believers were admonished to prepare for the Second Coming of Christ by _____.",
                optionA = "keeping awake and being sober",
                optionB = "praying and fasting",
                optionC = "preaching peace and tolerance",
                optionD = "encouraging idlers to work hard",
                correctAnswerIndex = 0,
                explanation = "1 Thessalonians 5:6: 'So then let us not sleep, as others do, but let us keep awake and be sober.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_34",
                subject = "CRS",
                topic = "Reconciliation in Christ",
                year = "PT. 3",
                questionText = "Paul taught the Romans that while they were yet enemies of God, they were reconciled to him by the _____.",
                optionA = "suffering of Jesus Christ",
                optionB = "death of Jesus Christ",
                optionC = "ascension of Jesus Christ",
                optionD = "resurrection of Jesus Christ",
                correctAnswerIndex = 1,
                explanation = "Romans 5:10: 'For if while we were enemies we were reconciled to God by the death of his Son, much more, now that we are reconciled, shall we be saved by his life.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_35",
                subject = "CRS",
                topic = "Spiritual Gifts",
                year = "PT. 3",
                questionText = "Paul declared to the believers in Corinth that no one can say Jesus is Lord except by _____.",
                optionA = "revelation knowledge",
                optionB = "grace",
                optionC = "the Holy Spirit",
                optionD = "faith",
                correctAnswerIndex = 2,
                explanation = "1 Corinthians 12:3: 'No one can say Jesus is Lord except in the Holy Spirit.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_36",
                subject = "CRS",
                topic = "Testing of Faith",
                year = "PT. 3",
                questionText = "According to Peter, the genuineness of Christian faith is tested with _____.",
                optionA = "trials",
                optionB = "fire",
                optionC = "suffering",
                optionD = "temptation",
                correctAnswerIndex = 1,
                explanation = "1 Peter 1:7: 'So that the tested genuineness of your faith—more precious than gold that perishes though it is tested by fire—may be found to result in praise and glory.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_37",
                subject = "CRS",
                topic = "The New Self",
                year = "PT. 3",
                questionText = "In Colossians, Paul admonished believers not to lie to one another because they _____.",
                optionA = "were joints heirs with Christ in the kingdom",
                optionB = "were waiting for the Second Coming of Christ",
                optionC = "had put off the old nature with its practices",
                optionD = "had known the truth from the very beginning",
                correctAnswerIndex = 2,
                explanation = "Colossians 3:9: 'Do not lie to one another, seeing that you have put off the old self with its practices and have put on the new self.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_38",
                subject = "CRS",
                topic = "Submission to Authorities",
                year = "PT. 3",
                questionText = "Paul teaches that believers who maintain good conduct before governing authorities shall _____.",
                optionA = "receive approval",
                optionB = "enjoy peace",
                optionC = "be shown hospitality",
                optionD = "be highly honoured",
                correctAnswerIndex = 0,
                explanation = "Romans 13:3: 'Would you have no fear of the one who is in authority? Then do what is good, and you will receive his approval.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_39",
                subject = "CRS",
                topic = "Christian Leadership",
                year = "PT. 3",
                questionText = "According to Peter, when the chief Shepherd would be manifested, the elders would obtain the _____.",
                optionA = "unfading crown of glory",
                optionB = "sceptre of authority",
                optionC = "house of glory",
                optionD = "crown with stars",
                correctAnswerIndex = 0,
                explanation = "1 Peter 5:4: 'And when the chief Shepherd appears, you will receive the unfading crown of glory.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_40",
                subject = "CRS",
                topic = "Generosity of Corinth",
                year = "PT. 3",
                questionText = "Paul boasted about the believers in Corinth for their _____.",
                optionA = "zeal in prayer",
                optionB = "offering for the saints",
                optionC = "maturity in Christ",
                optionD = "display of spiritual gifts",
                correctAnswerIndex = 1,
                explanation = "2 Corinthians 9:2: 'For I know your readiness, of which I boast about you to the people of Macedonia, that Achaia has been ready since last year.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_41",
                subject = "CRS",
                topic = "Exaltation of Christ",
                year = "PT. 3",
                questionText = "God exalted the name of Jesus above every other name in heaven and on earth because _____.",
                optionA = "Jesus was born in the likeness of man",
                optionB = "as son of God, He counted equality with God a thing to be grasped",
                optionC = "in humility, he counted others better than Himself",
                optionD = "He humbled himself to be born in human form and was obedient to death",
                correctAnswerIndex = 3,
                explanation = "Philippians 2:8-9: 'And being found in human form, he humbled himself by becoming obedient to the point of death, even death on a cross. Therefore God has highly exalted him.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_42",
                subject = "CRS",
                topic = "Defeat at Ai",
                year = "PT. 3",
                questionText = "How did Joshua react to the defeat of the Israelites by the men of Ai?",
                optionA = "He rent his clothes",
                optionB = "He fasted all day",
                optionC = "He prayed to God",
                optionD = "He consulted the priest",
                correctAnswerIndex = 0,
                explanation = "Joshua 7:6: 'Then Joshua tore his clothes and fell to the earth on his face before the ark of the LORD until the evening.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_43",
                subject = "CRS",
                topic = "Prophet Hosea",
                year = "PT. 3",
                questionText = "Hosea declares that the upright walk in the ways of the LORD, but transgressors _____.",
                optionA = "scorn them",
                optionB = "reject them",
                optionC = "stumble in them",
                optionD = "flee from them",
                correctAnswerIndex = 2,
                explanation = "Hosea 14:9: 'For the ways of the LORD are right, and the upright walk in them, but transgressors stumble in them.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_44",
                subject = "CRS",
                topic = "Babylonian Exile",
                year = "PT. 3",
                questionText = "After Nebuchadnezzar had destroyed Jerusalem, he took the inhabitants into exile but left behind the _____.",
                optionA = "poorest people",
                optionB = "noblemen",
                optionC = "priests",
                optionD = "temple guards",
                correctAnswerIndex = 0,
                explanation = "2 Kings 25:12: 'But the captain of the guard left some of the poorest of the land to be vinedressers and plowmen.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_45",
                subject = "CRS",
                topic = "Prophet Amos",
                year = "PT. 3",
                questionText = "According to Amos, the type of famine God said he would send upon the people of Israel was _____.",
                optionA = "that of bread",
                optionB = "thirst for water",
                optionC = "not hearing the word of the LORD",
                optionD = "hunger for baskets of summer fruits",
                correctAnswerIndex = 2,
                explanation = "Amos 8:11: 'Not a famine of bread, nor a thirst for water, but of hearing the words of the LORD.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_46",
                subject = "CRS",
                topic = "Individual Responsibility",
                year = "PT. 3",
                questionText = "“...The soul that sins shall die.” The statement above by Prophet Ezekiel means that _____.",
                optionA = "a sinner shall not escape punishment",
                optionB = "the wages of sin is death",
                optionC = "God will Judge the soul of a sinner",
                optionD = "every person is responsible for his own sin",
                correctAnswerIndex = 3,
                explanation = "Ezekiel 18:4, 20: Ezekiel emphasized individual moral accountability rather than transgenerational punishment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_47",
                subject = "CRS",
                topic = "Hiel Rebuilds Jericho",
                year = "PT. 3",
                questionText = "The consequence of Hiel’s building of Jericho was that he _____.",
                optionA = "was killed by Ahab",
                optionB = "was made a commander in Ahab’s army",
                optionC = "was highly respected by his tribe",
                optionD = "lost two of his sons",
                correctAnswerIndex = 3,
                explanation = "1 Kings 16:34: In accordance with Joshua's curse (Joshua 6:26), Hiel laid the foundation at the cost of his firstborn Abiram and set up its gates at the cost of his youngest son Segub.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_48",
                subject = "CRS",
                topic = "Call of Ezekiel",
                year = "PT. 3",
                questionText = "“.... I send you to the people of Israel, to a nation of rebels.” The statement above was God’s message to _____.",
                optionA = "Prophet Isaiah",
                optionB = "Prophet Jeremiah",
                optionC = "Prophet Amos",
                optionD = "Prophet Ezekiel",
                correctAnswerIndex = 3,
                explanation = "Ezekiel 2:3: 'Son of man, I send you to the people of Israel, to a nation of rebels, who have rebelled against me.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_49",
                subject = "CRS",
                topic = "Daniel in the Lion's Den",
                year = "PT. 3",
                questionText = "Daniel was set up to be thrown to the lions by the _____.",
                optionA = "counsellors of Nebuchadnezzar",
                optionB = "adviser of king Xerxes",
                optionC = "presidents and satraps of Persia",
                optionD = "lords and nobles of Medes",
                correctAnswerIndex = 2,
                explanation = "Daniel 6:4-7: The rival presidents and satraps of Darius plotted against Daniel concerning the law of his God.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_50",
                subject = "CRS",
                topic = "Prophet Hosea",
                year = "PT. 3",
                questionText = "According to Hosea, one of the punishments for the sins of Israel was that _____.",
                optionA = "they would not receive divine revelation",
                optionB = "they would eat but would not be satisfied",
                optionC = "the LORD would send famine upon the land",
                optionD = "their women would become barren",
                correctAnswerIndex = 1,
                explanation = "Hosea 4:10: 'They shall eat, but not be satisfied; they shall play the whore, but not multiply, because they have forsaken the LORD.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt3_51",
                subject = "CRS",
                topic = "Gehazi's Greed",
                year = "PT. 3",
                questionText = "Elijah knew of the covetous act of Gehazi because _____.",
                optionA = "it was reported to him",
                optionB = "he saw him from afar",
                optionC = "he went with him in spirit",
                optionD = "he saw the gifts with him",
                correctAnswerIndex = 2,
                explanation = "2 Kings 5:26: Elisha said to Gehazi, 'Did not my heart go when the man turned from his chariot to meet you?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.3 • Q51",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_01",
                subject = "CRS",
                topic = "Twelve Spies",
                year = "PT. 4",
                questionText = "Moses sent men to spy out the land of Canaan in order to _____.",
                optionA = "measure the entire land",
                optionB = "share out the land",
                optionC = "know if it was good or bad",
                optionD = "know if it was flowing with milk and honey",
                correctAnswerIndex = 2,
                explanation = "Numbers 13:18-20: Moses charged the scouts to inspect whether the land was good or bad, fertile or barren.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_02",
                subject = "CRS",
                topic = "Samuel's Sons",
                year = "PT. 4",
                questionText = "The two sons of Samuel that became Judges in Israel were _____.",
                optionA = "Joel and Abijah",
                optionB = "Abimelech and Abijah",
                optionC = "Hophni and Phinehas",
                optionD = "Joel and Abimelech",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 8:2: The name of his firstborn was Joel, and the name of his second, Abijah; they were judges in Beersheba.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_03",
                subject = "CRS",
                topic = "Creation of Humanity",
                year = "PT. 4",
                questionText = "“Let us make man in our image, after our likeness...” In the statement above, in our image implies man _____.",
                optionA = "becoming God",
                optionB = "being a representative of God and fellowmen",
                optionC = "being like God",
                optionD = "becoming the exact picture of God",
                correctAnswerIndex = 2,
                explanation = "Genesis 1:26: Being created in God's image signifies bearing divine moral, spiritual, and relational attributes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_04",
                subject = "CRS",
                topic = "Wilderness Rebellion",
                year = "PT. 4",
                questionText = "The murmuring of the congregation in the wilderness against Moses and Aaron were an indication of the people’s _____.",
                optionA = "lack of patience with them",
                optionB = "lack of faith in them",
                optionC = "fear of dying by the sword",
                optionD = "inability to get to the promise land",
                correctAnswerIndex = 1,
                explanation = "Numbers 14:11: The LORD said to Moses, 'How long will this people despise me? And how long will they not believe in me, in spite of all the signs that I have done among them?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_05",
                subject = "CRS",
                topic = "Water from the Rock",
                year = "PT. 4",
                questionText = "When the glory of the LORD appeared to Moses and Aaron in the wilderness of Zin, the Lord said they should _____.",
                optionA = "tell the rock before their eyes to yield its water",
                optionB = "strike the rock with rod to bring out water for them",
                optionC = "fetch water for the people and their cattle",
                optionD = "tell the people to go around the rock",
                correctAnswerIndex = 0,
                explanation = "Numbers 20:8: 'Tell the rock before their eyes to yield its water.' Moses' disobedience in striking the rock brought divine chastisement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_06",
                subject = "CRS",
                topic = "Gideon Defeats Midian",
                year = "PT. 4",
                questionText = "The last event that boosted Gideon’s courage to go against the Midianites was the _____.",
                optionA = "appearance of the angel who called him a man of valour",
                optionB = "sign in which God caused the dew to be on the fleece",
                optionC = "test God gave Gideon’s men at the waterside",
                optionD = "dream told by the Midianites about the barley bread",
                correctAnswerIndex = 3,
                explanation = "Judges 7:13-15: Overhearing a Midianite soldier recount a dream of a barley cake tumbling into the camp confirmed victory to Gideon.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_07",
                subject = "CRS",
                topic = "Covenant at Sinai",
                year = "PT. 4",
                questionText = "At the confirmation of the covenant, after Moses had addressed the people, they answered and said, _____.",
                optionA = "“We are going to obey the Lord our God”",
                optionB = "to beware of false prophets and teachers",
                optionC = "obeying fully the Ten Commandments",
                optionD = "We shall keep all the Commandments of God",
                correctAnswerIndex = 0,
                explanation = "Exodus 24:3: All the people answered with one voice and said, 'All the words that the LORD has spoken we will do.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_08",
                subject = "CRS",
                topic = "Saul at Endor",
                year = "PT. 4",
                questionText = "Saul visited the witch of Endor when he was besieged by the _____.",
                optionA = "Philistines",
                optionB = "Amorites",
                optionC = "Amalekites",
                optionD = "Moabites",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 28:4-7: When Saul saw the army of the Philistines pitched at Shunem, his heart trembled and he sought a medium at Endor.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_09",
                subject = "CRS",
                topic = "Saul and the Amalekites",
                year = "PT. 4",
                questionText = "Why did Saul tell the Kenites to go away from among the Amalekites?",
                optionA = "God did not tell him to destroy the Kenites",
                optionB = "Saul married from the Kenites",
                optionC = "The Kenites showed kindness to Israel",
                optionD = "The Kenites had blood covenant with Israel",
                correctAnswerIndex = 2,
                explanation = "1 Samuel 15:6: Saul warned the Kenites because they showed kindness to all the people of Israel when they came up out of Egypt.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_10",
                subject = "CRS",
                topic = "Prophet Jeremiah",
                year = "PT. 4",
                questionText = "“...And they shall be my people, and I will be their God...” This covenant was made with Israel through prophet _____.",
                optionA = "Isaiah",
                optionB = "Jeremiah",
                optionC = "Amos",
                optionD = "Hosea",
                correctAnswerIndex = 1,
                explanation = "Jeremiah 31:33 / 32:38: God announced the covenant of heart transformation through Prophet Jeremiah.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_11",
                subject = "CRS",
                topic = "Anointing of David",
                year = "PT. 4",
                questionText = "How many sons of Jesse passed before Samuel before David was chosen as King?",
                optionA = "5",
                optionB = "6",
                optionC = "7",
                optionD = "8",
                correctAnswerIndex = 2,
                explanation = "1 Samuel 16:10: Jesse made seven of his sons pass before Samuel, and Samuel said, 'The LORD has not chosen these.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_12",
                subject = "CRS",
                topic = "Saul Rescues Jabesh-Gilead",
                year = "PT. 4",
                questionText = "“Whoever does not come out after Saul and Samuel, so shall it be done to his oxen!” _____.",
                optionA = "The power of the Lord came upon them",
                optionB = "The dread of the Lord came upon them",
                optionC = "The spirit of the Lord came upon them",
                optionD = "The word of the Lord came to them",
                correctAnswerIndex = 1,
                explanation = "1 Samuel 11:7: When Saul cut the oxen into pieces, 'the dread of the LORD fell upon the people, and they came out as one man.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_13",
                subject = "CRS",
                topic = "Proverbs on Wisdom",
                year = "PT. 4",
                questionText = "“...Do not forsake her, and she will keep you, love her and she will guard you...” The pronoun 'her' refers to _____.",
                optionA = "intelligence",
                optionB = "wife",
                optionC = "knowledge",
                optionD = "wisdom",
                correctAnswerIndex = 3,
                explanation = "Proverbs 4:6: 'Do not forsake her, and she will keep you; love her, and she will guard you. The beginning of wisdom is this: Get wisdom.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_14",
                subject = "CRS",
                topic = "Exaltation of Joseph",
                year = "PT. 4",
                questionText = "Joseph was made prime minister in Egypt because he _____.",
                optionA = "interpreted the dreams of Pharaoh’s servants in the prison",
                optionB = "resisted the temptation by Potiphar’s wife",
                optionC = "was a faithful and upright man",
                optionD = "interpreted Pharaoh’s dream and counselled him on what to do",
                correctAnswerIndex = 3,
                explanation = "Genesis 41:38-41: Pharaoh elevated Joseph because of his divine discernment, dream interpretation, and administrative agricultural plan.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_15",
                subject = "CRS",
                topic = "Nehemiah in Persia",
                year = "PT. 4",
                questionText = "Nehemiah in exile functioned as the King’s _____.",
                optionA = "guard",
                optionB = "secretary",
                optionC = "cupbearer",
                optionD = "adviser",
                correctAnswerIndex = 2,
                explanation = "Nehemiah 1:11: 'Now I was cupbearer to the king.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_16",
                subject = "CRS",
                topic = "Book of Isaiah",
                year = "PT. 4",
                questionText = "In the days of Uzziah, Isaiah saw a vision concerning _____.",
                optionA = "Samaria and Judah",
                optionB = "Judah and Jerusalem",
                optionC = "Samaria and Jerusalem",
                optionD = "Judah and Israel",
                correctAnswerIndex = 1,
                explanation = "Isaiah 1:1: 'The vision of Isaiah the son of Amoz, which he saw concerning Judah and Jerusalem in the days of Uzziah, Jotham, Ahaz, and Hezekiah.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_17",
                subject = "CRS",
                topic = "Prophecy Against Ahab",
                year = "PT. 4",
                questionText = "God said that any member of Ahab’s family who died in the open country would be _____.",
                optionA = "eaten up by the dogs",
                optionB = "buried by foreigners",
                optionC = "eaten by the birds",
                optionD = "left unburied",
                correctAnswerIndex = 2,
                explanation = "1 Kings 21:24: 'Anyone belonging to Ahab who dies in the city the dogs shall eat, and anyone of his who dies in the open country the birds of the heavens shall eat.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_18",
                subject = "CRS",
                topic = "Prophet Hosea",
                year = "PT. 4",
                questionText = "“Take away all iniquity; accept that which is good...” What was the iniquity Hosea was referring to in the statement above?",
                optionA = "Adultery",
                optionB = "Ignorance",
                optionC = "Idolatry",
                optionD = "Injustice",
                correctAnswerIndex = 2,
                explanation = "Hosea 14:2-3: Hosea called Israel to turn away from Baal idolatry, alliances with Assyria, and the worship of man-made idols.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_19",
                subject = "CRS",
                topic = "Prophet Jeremiah",
                year = "PT. 4",
                questionText = "According to Jeremiah, the role of the shepherds which God will give to His people is to _____.",
                optionA = "feed the people with knowledge and understanding",
                optionB = "heal the guilt of the people",
                optionC = "gather the scattered children of Israel",
                optionD = "lead them to greener pastures",
                correctAnswerIndex = 0,
                explanation = "Jeremiah 3:15: 'And I will give you shepherds after my own heart, who will feed you with knowledge and understanding.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_20",
                subject = "CRS",
                topic = "The Golden Image",
                year = "PT. 4",
                questionText = "King Nebuchadnezzar assembled the satraps, the prefects and the governors to _____.",
                optionA = "tell him his dream",
                optionB = "send them to the provinces",
                optionC = "interpret his dream",
                optionD = "the dedication of the image",
                correctAnswerIndex = 3,
                explanation = "Daniel 3:2: King Nebuchadnezzar sent to assemble all officials for the dedication of the golden image he had set up in the plain of Dura.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_21",
                subject = "CRS",
                topic = "Elijah at Mount Carmel",
                year = "PT. 4",
                questionText = "Where did Elijah kill all the prophets of Baal after the contest with Ahab?",
                optionA = "Kishon",
                optionB = "Carmel",
                optionC = "Zarephath",
                optionD = "Cherith",
                correctAnswerIndex = 0,
                explanation = "1 Kings 18:40: 'And Elijah said to them, Seize the prophets of Baal... And Elijah brought them down to the brook Kishon and slaughtered them there.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_22",
                subject = "CRS",
                topic = "Individual Moral Responsibility",
                year = "PT. 4",
                questionText = "“...The fathers have eaten sour grapes, and the children’s teeth are set on edge...” According to Ezekiel, this proverb meant that _____.",
                optionA = "parents are punished for the sins of their children",
                optionB = "children are punished for the sins of their parents",
                optionC = "parents are punished for the sins of their grandparents",
                optionD = "great grandchildren are punished for the sins of their forefathers",
                correctAnswerIndex = 1,
                explanation = "Ezekiel 18:2: The Israelites misapplied the proverb to claim children suffered guilt for ancestral crimes, which God overturned.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_23",
                subject = "CRS",
                topic = "Jonah Flees from God",
                year = "PT. 4",
                questionText = "After Jonah had been thrown into the sea and the sea ceased from its raging, the men with him _____.",
                optionA = "praised the Lord for saving them",
                optionB = "feared the LORD, offered sacrifice and made vows",
                optionC = "prayed to God for forgiveness",
                optionD = "rowed hard to bring the ship back to land",
                correctAnswerIndex = 1,
                explanation = "Jonah 1:16: 'Then the men feared the LORD exceedingly, and they offered a sacrifice to the LORD and made vows.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_24",
                subject = "CRS",
                topic = "Fall of Jerusalem",
                year = "PT. 4",
                questionText = "Zedekiah, the king of Judah, was captured by the army of the Chaldeans _____.",
                optionA = "at Riblah",
                optionB = "in the plains of Jericho",
                optionC = "at Arabah",
                optionD = "on the outskirts of Jerusalem",
                correctAnswerIndex = 1,
                explanation = "2 Kings 25:5: 'The army of the Chaldeans pursued the king and overtook him in the plains of Jericho.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_25",
                subject = "CRS",
                topic = "Parable of Good Samaritan",
                year = "PT. 4",
                questionText = "Two Christian virtues to be learned in the story of the good Samaritan are _____.",
                optionA = "kindness and fairness",
                optionB = "justice and humility",
                optionC = "compassion and humility",
                optionD = "compassion and mercy",
                correctAnswerIndex = 3,
                explanation = "Luke 10:33, 37: The Samaritan had compassion and showed practical mercy to the wounded traveller.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_26",
                subject = "CRS",
                topic = "Gadarene Demoniacs",
                year = "PT. 4",
                questionText = "“What have you to do with us O son of God? Have you come here to torment us before the time?” This statement reveals that the demoniacs in the country of the Gadarenes _____.",
                optionA = "recognised the supreme power of Jesus",
                optionB = "wanted to question Jesus’s authority",
                optionC = "were threatened by the power of Jesus",
                optionD = "did not expect Jesus to come to them at that time",
                correctAnswerIndex = 0,
                explanation = "Matthew 8:29: The demons acknowledged Jesus' divine identity, supreme authority, and future eschatological judgment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_27",
                subject = "CRS",
                topic = "Commissioning of the Twelve",
                year = "PT. 4",
                questionText = "According to Luke, the mandate given to the twelve at their commissioning was to _____.",
                optionA = "rid the entire region of Galilee of evil spirits",
                optionB = "preach the gospel to the poor",
                optionC = "preach the kingdom of God and heal",
                optionD = "go about doing good to all people",
                correctAnswerIndex = 2,
                explanation = "Luke 9:2: 'And he sent them out to proclaim the kingdom of God and to heal.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_28",
                subject = "CRS",
                topic = "Jesus Before Pilate",
                year = "PT. 4",
                questionText = "According to John, the accusation of the Jews levelled against Jesus before Pilate was that He was _____.",
                optionA = "an evildoer",
                optionB = "an impostor",
                optionC = "a perverter",
                optionD = "a blasphemer",
                correctAnswerIndex = 0,
                explanation = "John 18:30: 'They answered him, If this man were not doing evil, we would not have delivered him over to you.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_29",
                subject = "CRS",
                topic = "Eating with Sinners",
                year = "PT. 4",
                questionText = "“...Go and learn what this means, ‘I desire mercy and not sacrifice’...” Jesus made this statement during the _____.",
                optionA = "Healing of the lepers",
                optionB = "Eating with tax collectors",
                optionC = "Call of the twelve apostles",
                optionD = "Deliverance of the demoniac",
                correctAnswerIndex = 1,
                explanation = "Matthew 9:11-13: Rebuking the Pharisees for complaining that He ate with tax collectors and sinners, Jesus cited Hosea 6:6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_30",
                subject = "CRS",
                topic = "The Centurion's Faith",
                year = "PT. 4",
                questionText = "Jesus did not go with the centurion to heal his servant because he _____.",
                optionA = "exhibited great faith",
                optionB = "spoke to Jesus as a man under authority",
                optionC = "was not worthy for Jesus to come under his roof",
                optionD = "was a Gentile",
                correctAnswerIndex = 0,
                explanation = "Luke 7:9: Jesus marvelled at him and said, 'Not even in Israel have I found such faith.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_31",
                subject = "CRS",
                topic = "The Passover Feast",
                year = "PT. 4",
                questionText = "The disciples celebrated the Passover with Jesus because _____.",
                optionA = "He was going to be betrayed by one of them",
                optionB = "it was the first day of unleavened bread",
                optionC = "they had sacrificed the Passover lamb",
                optionD = "they wanted to keep the Passover feast with Him",
                correctAnswerIndex = 1,
                explanation = "Matthew 26:17: 'Now on the first day of Unleavened Bread the disciples came to Jesus, saying, Where will you have us prepare for you to eat the Passover?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_32",
                subject = "CRS",
                topic = "Wise and Foolish Builders",
                year = "PT. 4",
                questionText = "According to Matthew, true wisdom is _____.",
                optionA = "seeking first God’s kingdom and His righteousness",
                optionB = "knowing the truth and doing it at all times",
                optionC = "to beware of false prophets and teachers",
                optionD = "obeying fully the Ten Commandments",
                correctAnswerIndex = 1,
                explanation = "Matthew 7:24: 'Everyone then who hears these words of mine and does them will be like a wise man who built his house on the rock.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_33",
                subject = "CRS",
                topic = "Jairus' Daughter",
                year = "PT. 4",
                questionText = "The condition Jesus required from Jairus in order to heal his daughter was that he should _____.",
                optionA = "pray and fast",
                optionB = "not fear but believe",
                optionC = "put out those weeping in the house",
                optionD = "repent and confess his sins.",
                correctAnswerIndex = 1,
                explanation = "Mark 5:36: Jesus said to the ruler of the synagogue, 'Do not fear, only believe.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_34",
                subject = "CRS",
                topic = "Peter's Pentecost Sermon",
                year = "PT. 4",
                questionText = "According to Peter’s speech on the day of Pentecost, God made Jesus _____.",
                optionA = "Lord and King",
                optionB = "holy and mighty",
                optionC = "both Lord and Christ",
                optionD = "overcome death and sin.",
                correctAnswerIndex = 2,
                explanation = "Acts 2:36: 'Let all the house of Israel therefore know for certain that God has made him both Lord and Christ, this Jesus whom you crucified.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_35",
                subject = "CRS",
                topic = "The Jerusalem Council",
                year = "PT. 4",
                questionText = "“Unless you are circumcised according to the custom of Moses, you cannot be saved.” The men who taught the above came from _____.",
                optionA = "Jerusalem",
                optionB = "Judea",
                optionC = "Samaria",
                optionD = "Phoenicia",
                correctAnswerIndex = 1,
                explanation = "Acts 15:1: 'Some men came down from Judea and were teaching the brothers, Unless you are circumcised according to the custom of Moses, you cannot be saved.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_36",
                subject = "CRS",
                topic = "The Bread of Life",
                year = "PT. 4",
                questionText = "According to John, Jesus said the work of God is _____.",
                optionA = "preaching the gospel",
                optionB = "healing the sick",
                optionC = "feeding the hungry who are in need",
                optionD = "believing in Him who he had sent",
                correctAnswerIndex = 3,
                explanation = "John 6:29: Jesus answered them, 'This is the work of God, that you believe in him whom he has sent.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_37",
                subject = "CRS",
                topic = "Peter and John Before Council",
                year = "PT. 4",
                questionText = "“What shall we do to these men? For that a notable sign has been performed through them is manifested to all...” This statement was made by the Sanhedrin after Peter and John healed _____.",
                optionA = "the lame man at the Beautiful Gate",
                optionB = "Aeneas at Lydda",
                optionC = "Tabitha at Joppa",
                optionD = "the centurion's servant",
                correctAnswerIndex = 0,
                explanation = "Acts 4:16: The rulers acknowledged that the healing of the lifelong lame man at the temple gate was an undeniable public miracle.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_38",
                subject = "CRS",
                topic = "Paul and Silas at Philippi",
                year = "PT. 4",
                questionText = "Why was Paul arrested and detained at Philippi?",
                optionA = "He never stopped proclaiming Jesus as Lord and Saviour",
                optionB = "The Jews did not want him to preach in the Gentiles’ territories",
                optionC = "He cast out the spirit of soothsaying from a slave girl",
                optionD = "He was preaching the unknown God",
                correctAnswerIndex = 2,
                explanation = "Acts 16:16-24: Her owners saw their hope of gain was gone when Paul expelled the divination spirit from the slave girl, leading to Paul and Silas' flogging and imprisonment.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_39",
                subject = "CRS",
                topic = "The True Vine",
                year = "PT. 4",
                questionText = "Jesus said His disciples had been made clean by _____.",
                optionA = "their abiding in Him",
                optionB = "His abiding in them always",
                optionC = "the word he spoke to them",
                optionD = "their walking in the spirit",
                correctAnswerIndex = 2,
                explanation = "John 15:3: 'Already you are clean because of the word that I have spoken to you.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_40",
                subject = "CRS",
                topic = "Persecution in Jerusalem",
                year = "PT. 4",
                questionText = "Following the death of Stephen, the only group of believers not scattered by the great persecution against the Jerusalem Church were the _____.",
                optionA = "deacons",
                optionB = "apostles",
                optionC = "prophets",
                optionD = "disciples",
                correctAnswerIndex = 1,
                explanation = "Acts 8:1: 'And there arose on that day a great persecution... and they were all scattered throughout the regions of Judea and Samaria, except the apostles.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_41",
                subject = "CRS",
                topic = "Order of Gifts",
                year = "PT. 4",
                questionText = "The first and second in the order of hierarchy of spiritual gifts enumerated by Paul are _____.",
                optionA = "healers and helpers",
                optionB = "teachers and workers of miracles",
                optionC = "apostles and prophets",
                optionD = "administrators and speakers",
                correctAnswerIndex = 2,
                explanation = "1 Corinthians 12:28: 'And God has appointed in the church first apostles, second prophets, third teachers...'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_42",
                subject = "CRS",
                topic = "Redemption from Law",
                year = "PT. 4",
                questionText = "According to Galatians, Christ redeemed us from the curse of the law by _____.",
                optionA = "dying on the cross",
                optionB = "becoming a curse for us",
                optionC = "resurrecting from the dead",
                optionD = "ascending into heavens",
                correctAnswerIndex = 1,
                explanation = "Galatians 3:13: 'Christ redeemed us from the curse of the law by becoming a curse for us—for it is written, Cursed is everyone who is hanged on a tree.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_43",
                subject = "CRS",
                topic = "Epistle of James",
                year = "PT. 4",
                questionText = "According to James, what does God promise those who love Him?",
                optionA = "Eternal life",
                optionB = "Abundant blessing",
                optionC = "Honourable position in life",
                optionD = "Heirs of the kingdom",
                correctAnswerIndex = 3,
                explanation = "James 2:5: 'Has not God chosen those who are poor in the world to be rich in faith and heirs of the kingdom, which he has promised to those who love him?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_44",
                subject = "CRS",
                topic = "Civil Authorities",
                year = "PT. 4",
                questionText = "According to Paul, a ruler does not bear the sword in vain but he _____.",
                optionA = "leads men into the ways of God",
                optionB = "executes God’s wrath on the wrongdoer",
                optionC = "rules as influenced by the people",
                optionD = "enforces civil duties",
                correctAnswerIndex = 1,
                explanation = "Romans 13:4: 'For he is God's servant for your good... he is the servant of God, an avenger who carries out God's wrath on the wrongdoer.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_45",
                subject = "CRS",
                topic = "Heirs of the Promise",
                year = "PT. 4",
                questionText = "In Paul’s Epistle to the Galatians, as long as an heir is a child, he is under _____.",
                optionA = "guardians",
                optionB = "custodians",
                optionC = "protectors",
                optionD = "teachers",
                correctAnswerIndex = 0,
                explanation = "Galatians 4:1-2: The heir, as long as he is a child, is no different from a slave, but is under guardians and managers until the date set by his father.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_46",
                subject = "CRS",
                topic = "Suffering for Christ",
                year = "PT. 4",
                questionText = "According to Peter, believers who are reproached for the name of Christ are blessed because the spirit of _____.",
                optionA = "glory and of God rest upon them",
                optionB = "patience rests upon them",
                optionC = "hope rests upon them",
                optionD = "love and God rests upon them.",
                correctAnswerIndex = 0,
                explanation = "1 Peter 4:14: 'If you are insulted for the name of Christ, you are blessed, because the Spirit of glory and of God rests upon you.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_47",
                subject = "CRS",
                topic = "Christian Humility",
                year = "PT. 4",
                questionText = "In interpersonal relationships, Paul advises believers to _____.",
                optionA = "emulate his good gesture",
                optionB = "obey the laws of Moses",
                optionC = "think with sober judgement",
                optionD = "think of others first",
                correctAnswerIndex = 3,
                explanation = "Philippians 2:3-4: 'Do nothing from selfish ambition or conceit, but in humility count others more significant than yourselves.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_48",
                subject = "CRS",
                topic = "Letter to Philemon",
                year = "PT. 4",
                questionText = "In his letter to Philemon, Paul described Onesimus as his _____.",
                optionA = "brother",
                optionB = "fellow worker",
                optionC = "fellow prisoner",
                optionD = "child",
                correctAnswerIndex = 3,
                explanation = "Philemon 1:10: 'I appeal to you for my child, Onesimus, whose father I became in my imprisonment.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_49",
                subject = "CRS",
                topic = "Spiritual Armor",
                year = "PT. 4",
                questionText = "In Thessalonians, Paul advises believers awaiting the coming of the Lord to put on the _____.",
                optionA = "armour of hope",
                optionB = "helmet of righteousness",
                optionC = "breastplate of faith and love",
                optionD = "breastplate of salvation",
                correctAnswerIndex = 2,
                explanation = "1 Thessalonians 5:8: 'Putting on the breastplate of faith and love, and for a helmet the hope of salvation.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q49",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt4_50",
                subject = "CRS",
                topic = "Spiritual Diversity",
                year = "PT. 4",
                questionText = "According to Corinthians, the same spirit gives varieties of gifts while the same Lord gives varieties of _____.",
                optionA = "service",
                optionB = "prophecy",
                optionC = "working",
                optionD = "healing",
                correctAnswerIndex = 0,
                explanation = "1 Corinthians 12:4-5: 'Now there are varieties of gifts, but the same Spirit; and there are varieties of service, but the same Lord.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.4 • Q50",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_01",
                subject = "CRS",
                topic = "The Early Church",
                year = "PT. 5",
                questionText = "What effect did the sudden death of Ananias and Sapphira have on the early disciples?",
                optionA = "Many more disciples were won to God",
                optionB = "Great fear gripped them all",
                optionC = "The disciples became more united",
                optionD = "Apostle Peter was highly respected",
                correctAnswerIndex = 1,
                explanation = "Acts 5:11: 'And great fear came upon the whole church and upon all who heard of these things.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_02",
                subject = "CRS",
                topic = "First Missionary Journey",
                year = "PT. 5",
                questionText = "Paul and Barnabas were sent out on the first missionary work from Antioch to Seleucia by the _____.",
                optionA = "prophets and teachers",
                optionB = "church elders",
                optionC = "other disciples",
                optionD = "Holy Spirit",
                correctAnswerIndex = 3,
                explanation = "Acts 13:4: 'So, being sent out by the Holy Spirit, they went down to Seleucia, and from there they sailed to Cyprus.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_03",
                subject = "CRS",
                topic = "Healing the Man Born Blind",
                year = "PT. 5",
                questionText = "“...We must work the works of him who sent me, while it is day; night comes, when no one can work.” Jesus made the statement above after the healing of the _____.",
                optionA = "centurion’s servant",
                optionB = "ten lepers",
                optionC = "man born blind",
                optionD = "paralytic man",
                correctAnswerIndex = 2,
                explanation = "John 9:4: Spoken prior to healing the man blind from birth at the Pool of Siloam.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_04",
                subject = "CRS",
                topic = "The Resurrection",
                year = "PT. 5",
                questionText = "“They have taken the Lord out of the tomb, and we do not know where they have laid him.” What happened immediately after Mary Magdalene made the statement above?",
                optionA = "Peter and the other disciple went towards the tomb",
                optionB = "the guards were afraid and ran away from the tomb",
                optionC = "Mary stood, weeping outside the tomb",
                optionD = "two angels appeared to Mary by the tomb",
                correctAnswerIndex = 0,
                explanation = "John 20:2-3: Upon hearing Mary's report, Peter and the other disciple (John) set out running toward the tomb.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_05",
                subject = "CRS",
                topic = "Gamaliel's Advice",
                year = "PT. 5",
                questionText = "“...For if this plan or this undertaking is of men, it will fail; but if it is of God, you will not be able to overthrow them...” This Gamaliel’s statement above refers to _____.",
                optionA = "Peter and John",
                optionB = "Peter and the apostles",
                optionC = "Paul and Timothy",
                optionD = "Paul and Silas",
                correctAnswerIndex = 1,
                explanation = "Acts 5:38-39: Rabbi Gamaliel urged the Sanhedrin to release Peter and the imprisoned apostles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_06",
                subject = "CRS",
                topic = "Light and Darkness",
                year = "PT. 5",
                questionText = "Jesus declared that men love darkness rather than light because _____.",
                optionA = "their hearts were hardened",
                optionB = "they had no truth",
                optionC = "they had been blinded",
                optionD = "their deeds were evil",
                correctAnswerIndex = 3,
                explanation = "John 3:19: 'And this is the judgment: the light has come into the world, and people loved the darkness rather than the light because their works were evil.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_07",
                subject = "CRS",
                topic = "Peter's Pentecost Sermon",
                year = "PT. 5",
                questionText = "“...This Jesus God raised up, and of that we all are witnesses...” The statement above was made by Peter on the occasion of his _____.",
                optionA = "sermon on the day of Pentecost",
                optionB = "release from prison by the Jews",
                optionC = "healing of the lame man at the gate called Beautiful",
                optionD = "address to the disciples for the replacement of Judas",
                correctAnswerIndex = 0,
                explanation = "Acts 2:32: Preached during Peter's Pentecost sermon to the gathered crowd in Jerusalem.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_08",
                subject = "CRS",
                topic = "Belief in the Son",
                year = "PT. 5",
                questionText = "According to John, he who does not believe in the only Son of God is _____.",
                optionA = "none of his own",
                optionB = "not worthy of the Kingdom",
                optionC = "cast off as a branch",
                optionD = "condemned already",
                correctAnswerIndex = 3,
                explanation = "John 3:18: 'Whoever does not believe is condemned already, because he has not believed in the name of the only Son of God.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_09",
                subject = "CRS",
                topic = "Road to Emmaus",
                year = "PT. 5",
                questionText = "“...Are you the only visitor to Jerusalem who does not know the things that have happened there in these days?” The things being referred to in the statement above are the _____.",
                optionA = "arrest, trials and judgment of Jesus",
                optionB = "crucifixion, death and resurrection of Jesus",
                optionC = "triumphal entry and cleansing of the temple",
                optionD = "birth and presentation of Jesus",
                correctAnswerIndex = 1,
                explanation = "Luke 24:18-20: Cleopas on the road to Emmaus spoke of Jesus of Nazareth, His crucifixion, and reports of His resurrection.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_10",
                subject = "CRS",
                topic = "Grace and Law",
                year = "PT. 5",
                questionText = "According to Paul, just as the law came to increase trespass, so sin came to increase _____.",
                optionA = "righteousness",
                optionB = "punishment",
                optionC = "grace",
                optionD = "ungodliness",
                correctAnswerIndex = 2,
                explanation = "Romans 5:20: 'Now the law came in to increase the trespass, but where sin increased, grace abounded all the more.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_11",
                subject = "CRS",
                topic = "Christian Suffering",
                year = "PT. 5",
                questionText = "According to Peter, Christians who suffer according to the will of God will receive _____.",
                optionA = "forgiveness",
                optionB = "the Crown of Glory",
                optionC = "the Holy Spirit",
                optionD = "blessing",
                correctAnswerIndex = 1,
                explanation = "1 Peter 5:4, 4:13-14: Believers partake of Christ's sufferings so that they may obtain the unfading crown of glory.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_12",
                subject = "CRS",
                topic = "Spiritual Gifts",
                year = "PT. 5",
                questionText = "Paul declares that Christians have the same functions, but they have gifts that differ according to _____.",
                optionA = "their devotion of prayer",
                optionB = "their suffering and endurance",
                optionC = "grace given to them",
                optionD = "enablement by the spirit",
                correctAnswerIndex = 2,
                explanation = "Romans 12:6: 'Having gifts that differ according to the grace given to us, let us use them.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_13",
                subject = "CRS",
                topic = "Justification Through Christ",
                year = "PT. 5",
                questionText = "According to Romans, as one man’s trespass led to condemnation for all, so will one man’s act of righteousness lead to _____.",
                optionA = "acquittal and life for all men",
                optionB = "salvation and new life for all men",
                optionC = "justification and hope for all men",
                optionD = "sanctification and life for all men",
                correctAnswerIndex = 0,
                explanation = "Romans 5:18: 'Therefore, as one trespass led to condemnation for all men, so one act of righteousness leads to justification and life for all men.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_14",
                subject = "CRS",
                topic = "Testing of Faith",
                year = "PT. 5",
                questionText = "‘And let steadfastness have its full effect…’ What does James say would be the outcome of this effect?",
                optionA = "Righteousness and faith.",
                optionB = "Trial and endurance",
                optionC = "Humility and obedience",
                optionD = "Perfection and completion",
                correctAnswerIndex = 3,
                explanation = "James 1:4: 'And let steadfastness have its full effect, that you may be perfect and complete, lacking in nothing.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_15",
                subject = "CRS",
                topic = "Mind of Christ",
                year = "PT. 5",
                questionText = "‘Have this mind among yourselves, which is yours in Christ Jesus…’ This mind in Paul’s statement above means a mind of _____.",
                optionA = "humanity",
                optionB = "faith",
                optionC = "holiness",
                optionD = "humility",
                correctAnswerIndex = 3,
                explanation = "Philippians 2:3-5: Paul exhorted believers to adopt Christ's attitude of supreme humility and selfless servanthood.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_16",
                subject = "CRS",
                topic = "Christian Submission",
                year = "PT. 5",
                questionText = "Peter teaches that servants should be submissive to their masters with all respect, not only to the kind and gentle but also to the _____.",
                optionA = "impatient",
                optionB = "inconsiderate",
                optionC = "wicked",
                optionD = "overbearing",
                correctAnswerIndex = 3,
                explanation = "1 Peter 2:18: 'Servants, be subject to your masters with all respect, not only to the good and gentle but also to the unjust/overbearing.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_17",
                subject = "CRS",
                topic = "Living in the Light",
                year = "PT. 5",
                questionText = "In Romans, Christians are admonished to put on the Lord Jesus Christ and not to _____.",
                optionA = "rely on the law",
                optionB = "judge one another",
                optionC = "make provision for the flesh",
                optionD = "take advantage of one another",
                correctAnswerIndex = 2,
                explanation = "Romans 13:14: 'But put on the Lord Jesus Christ, and make no provision for the flesh, to gratify its desires.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_18",
                subject = "CRS",
                topic = "Baptism into Christ",
                year = "PT. 5",
                questionText = "Paul teaches that those who have been baptized into Christ have been baptized into His _____.",
                optionA = "service",
                optionB = "death",
                optionC = "kingdom",
                optionD = "suffering",
                correctAnswerIndex = 1,
                explanation = "Romans 6:3: 'Do you not know that all of us who have been baptized into Christ Jesus were baptized into his death?'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_19",
                subject = "CRS",
                topic = "The Ark and Dagon",
                year = "PT. 5",
                questionText = "On the third day of their capture of the Ark of God, the Philistines discovered that _____.",
                optionA = "Dagon, their god, had fallen and broken to pieces",
                optionB = "Dagon had disappeared from its place",
                optionC = "The Ark has swallowed Dagon, their god",
                optionD = "The Ark had been standing on Dagon",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 5:3-4: Dagon fell face downward before the ark of the LORD, with his head and both hands broken off upon the threshold.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_20",
                subject = "CRS",
                topic = "Fall of Judah",
                year = "PT. 5",
                questionText = "One of the sins of Manasseh for which the LORD sent bands of the Chaldeans, Syrians, Moabites and Ammonites to destroy Judah was _____.",
                optionA = "the release of a thousand captives",
                optionB = "his failure to obey God’s prophets",
                optionC = "the arrest of the King of Babylon",
                optionD = "the shedding of innocent blood",
                correctAnswerIndex = 3,
                explanation = "2 Kings 24:3-4: The LORD sent invading armies against Judah for the sins of Manasseh and for the innocent blood that he shed.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_21",
                subject = "CRS",
                topic = "Elijah and Ahab",
                year = "PT. 5",
                questionText = "Elijah decreed that there would be neither rain nor dew for three years because _____.",
                optionA = "Ahab had forsaken the commandment of God by erecting an altar for Baal",
                optionB = "Nebat the son of Rehoboam connived with Ahab to kill him",
                optionC = "he was sure that he would be fed by the ravens",
                optionD = "Jezebel the wife of Ahab killed Obadiah",
                correctAnswerIndex = 0,
                explanation = "1 Kings 16:32-33, 17:1: Ahab provoked the LORD by erecting an altar and temple for Baal in Samaria, prompting Elijah's drought pronouncement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_22",
                subject = "CRS",
                topic = "Jonah's Commission",
                year = "PT. 5",
                questionText = "God called Jonah and sent him to the people of Nineveh to _____.",
                optionA = "pray for their repentance",
                optionB = "pray to Him for their forgiveness",
                optionC = "cry against their wickedness",
                optionD = "preach His word to them",
                correctAnswerIndex = 2,
                explanation = "Jonah 1:2: 'Arise, go to Nineveh, that great city, and call out against it, for their evil has come up before me.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_23",
                subject = "CRS",
                topic = "Elijah Rebukes Ahab",
                year = "PT. 5",
                questionText = "Consequent upon the murder of Naboth by Ahab and Jezebel, God declared that ____",
                optionA = "dogs would lick Ahab’s blood where they had licked Naboth’s",
                optionB = "Ahab’s descendants would never ascend the throne in Israel",
                optionC = "He would require the blood of Naboth from Ahab’s hand",
                optionD = "the sword would not depart from the house of Ahab",
                correctAnswerIndex = 0,
                explanation = "1 Kings 21:19: 'In the place where dogs licked up the blood of Naboth shall dogs lick your own blood.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_24",
                subject = "CRS",
                topic = "Prophet Amos",
                year = "PT. 5",
                questionText = "According to Amos, God decided to raise up a nation that would fight and oppress Israel because the people _____.",
                optionA = "were corrupt and enslaved the poor",
                optionB = "claimed to achieve fame by their own strength",
                optionC = "rejected him and sold the righteous for silver",
                optionD = "turned justice into poison",
                correctAnswerIndex = 3,
                explanation = "Amos 6:12, 14: Because they turned justice into poison and fruit of righteousness into wormwood, God raised up a nation against them.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_25",
                subject = "CRS",
                topic = "Josiah Cleanses Bethel",
                year = "PT. 5",
                questionText = "What did King Josiah do to the altar that was erected by Jeroboam at Bethel?",
                optionA = "He rained curses upon it",
                optionB = "He removed its items",
                optionC = "He broke its stones into pieces",
                optionD = "He burnt it down",
                correctAnswerIndex = 2,
                explanation = "2 Kings 23:15: Josiah tore down the altar and high place made by Jeroboam at Bethel, and crushed its stones to dust.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_26",
                subject = "CRS",
                topic = "Call of Jeremiah",
                year = "PT. 5",
                questionText = "“Before I formed you in the womb I knew you, and before you were born I consecrated you; I appointed you a prophet to the nations.” The statement above was made by God during the _____.",
                optionA = "consecration of Prophet Jeremiah",
                optionB = "consecration of Prophet Isaiah",
                optionC = "call of Prophet Ezekiel",
                optionD = "call of Prophet Samuel",
                correctAnswerIndex = 0,
                explanation = "Jeremiah 1:5: The divine ordination of Jeremiah before his birth.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_27",
                subject = "CRS",
                topic = "Prophet Jeremiah",
                year = "PT. 5",
                questionText = "According to Jeremiah, other nations would find glory in God and bless themselves in Him only when Israel _____.",
                optionA = "swears in truth, in justice and in uprightness",
                optionB = "becomes loyal to God and repents of her sins",
                optionC = "returns to God, honours and glorifies Him",
                optionD = "comes to God with prayer and fasting",
                correctAnswerIndex = 0,
                explanation = "Jeremiah 4:2: 'If you swear, As the LORD lives, in truth, in justice, and in righteousness, then nations shall bless themselves in him.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_28",
                subject = "CRS",
                topic = "Hosea's Call to Repentance",
                year = "PT. 5",
                questionText = "Hosea proclaimed that Israel should return to God and plead that he should _____.",
                optionA = "accept their worship",
                optionB = "bless them abundantly",
                optionC = "take away their iniquity",
                optionD = "grant them victory in battle",
                correctAnswerIndex = 2,
                explanation = "Hosea 14:2: 'Take with you words and return to the LORD; say to him, Take away all iniquity; accept what is good.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_29",
                subject = "CRS",
                topic = "Eli and Samuel",
                year = "PT. 5",
                questionText = "The response of Eli after Samuel had told him the Lord’s message as regards his sons’ acts of blasphemy was that _____.",
                optionA = "sacrifice would be offered on their behalf",
                optionB = "he would call them and rebuke them",
                optionC = "God should have mercy on them",
                optionD = "He was the LORD, and should do what pleased Him",
                correctAnswerIndex = 3,
                explanation = "1 Samuel 3:18: Eli replied, 'It is the LORD. Let him do what seems good to him.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_30",
                subject = "CRS",
                topic = "Fall of Jericho",
                year = "PT. 5",
                questionText = "Rahab’s reward for hiding the messengers sent by Joshua to spy out the city of Jericho was that _____.",
                optionA = "she and her household were spared",
                optionB = "the city of Jericho was spared for her sake",
                optionC = "she married one of the spies and became a queen",
                optionD = "the gold, bronze and iron in the city were given to her",
                correctAnswerIndex = 0,
                explanation = "Joshua 6:25: Joshua spared Rahab the prostitute with her father's household and all who belonged to her.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_31",
                subject = "CRS",
                topic = "David at Ziklag",
                year = "PT. 5",
                questionText = "David’s victory over the Amalekites who raided Ziklag was due to _____.",
                optionA = "the fact that David was a mighty man in battle",
                optionB = "his swearing to the Egyptian servant of the Amalekites not to kill or harm him",
                optionC = "the great army that followed him to fight the Amalekites",
                optionD = "his prayer in seeking the approval of God before pursuing them",
                correctAnswerIndex = 3,
                explanation = "1 Samuel 30:8: David inquired of the LORD, 'Shall I pursue after this band? Shall I overtake them?' And God answered him, 'Pursue, for you shall surely overtake.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_32",
                subject = "CRS",
                topic = "Route of the Exodus",
                year = "PT. 5",
                questionText = "God did not lead the Israelites by the way of the land of the Philistines although that was near because _____.",
                optionA = "He did not want them to see war and return to Egypt",
                optionB = "The Egyptians would have overtaken them",
                optionC = "They were afraid of the Philistines",
                optionD = "He wanted them to learn through hardship in the wilderness",
                correctAnswerIndex = 0,
                explanation = "Exodus 13:17: God said, 'Lest the people change their minds when they see war and return to Egypt.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_33",
                subject = "CRS",
                topic = "Solomon's Reign",
                year = "PT. 5",
                questionText = "One of King Solomon’s unwise policies was the _____.",
                optionA = "incessant fighting of wars against his enemies",
                optionB = "signing of treaties with the kings of the surrounding nations",
                optionC = "use of forced labour to build the house of God and palaces",
                optionD = "making of sacrifices in high places",
                correctAnswerIndex = 2,
                explanation = "1 Kings 12:4: Solomon's oppressive conscripted forced labor and taxation led directly to the revolt and fracture of Israel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_34",
                subject = "CRS",
                topic = "Creation of Eve",
                year = "PT. 5",
                questionText = "“It is not good that the man should be alone; I will make him a helper fit for him.” After this statement, the first thing God did was to _____.",
                optionA = "form beasts and birds and bring them to the man",
                optionB = "take one of the man’s ribs and close up its place with flesh",
                optionC = "make a rib into a woman and bring her to the man",
                optionD = "cause a deep sleep to fall upon the man",
                correctAnswerIndex = 0,
                explanation = "Genesis 2:18-19: After declaring it not good for man to be alone, God formed out of the ground every beast of the field and bird of the heavens and brought them to man.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_35",
                subject = "CRS",
                topic = "Joseph Sold into Egypt",
                year = "PT. 5",
                questionText = "Joseph’s brothers decided not to kill him because _____.",
                optionA = "he pleaded with them",
                optionB = "he was loved by their father",
                optionC = "he was their brother and their flesh",
                optionD = "he was the first son of his mother",
                correctAnswerIndex = 2,
                explanation = "Genesis 37:26-27: Judah said, 'Come, let us sell him to the Ishmaelites, and let not our hand be upon him, for he is our brother and our own flesh.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_36",
                subject = "CRS",
                topic = "Saul Confirmed as King",
                year = "PT. 5",
                questionText = "King Saul ordered that those who had opposed his ascent to the throne should not be put to death because _____.",
                optionA = "God had wrought deliverance in Israel",
                optionB = "They had fought bravely in battle",
                optionC = "They had been reconciled with him",
                optionD = "God had forgiven their evil intentions",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 11:13: Saul said, 'Not a man shall be put to death this day, for today the LORD has worked salvation in Israel.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_37",
                subject = "CRS",
                topic = "Saul at Endor",
                year = "PT. 5",
                questionText = "After Saul realized that God would have nothing to do with him, he sought the help of _____.",
                optionA = "Achish",
                optionB = "a prophet",
                optionC = "Samuel",
                optionD = "a medium",
                correctAnswerIndex = 3,
                explanation = "1 Samuel 28:7: Saul said to his servants, 'Seek out for me a woman who is a medium, that I may go to her and inquire of her.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_38",
                subject = "CRS",
                topic = "David and Goliath",
                year = "PT. 5",
                questionText = "A promise made by King Saul to anyone that could face and defeat Goliath was _____.",
                optionA = "giving his daughter in marriage to the person",
                optionB = "making the person second in command in Israel",
                optionC = "giving the person part of his land",
                optionD = "making the person the captain of his army",
                correctAnswerIndex = 0,
                explanation = "1 Samuel 17:25: The king promised to enrich the victor with great riches, give him his daughter, and make his father's house free in Israel.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_39",
                subject = "CRS",
                topic = "Manna from Heaven",
                year = "PT. 5",
                questionText = "The LORD said to Moses that the people should gather just a day’s portion of bread so that He might test their _____.",
                optionA = "self-control",
                optionB = "patience",
                optionC = "obedience",
                optionD = "faith",
                correctAnswerIndex = 2,
                explanation = "Exodus 16:4: 'The people shall go out and gather a day's portion every day, that I may test them, whether they will walk in my law or not.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_40",
                subject = "CRS",
                topic = "Consecration at Sinai",
                year = "PT. 5",
                questionText = "What were the Israelites asked to do before meeting with God on Mount Sinai?",
                optionA = "To be consecrated and have their garments washed",
                optionB = "To touch the border of the mountain",
                optionC = "To fast and have their feet washed",
                optionD = "To fast, pray and be consecrated",
                correctAnswerIndex = 0,
                explanation = "Exodus 19:10-11: Moses was told to consecrate the people and have them wash their garments before the third day.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_41",
                subject = "CRS",
                topic = "Temptation of Jesus",
                year = "PT. 5",
                questionText = "“To you I will give all this authority and their glory; for it has been delivered to me, and I give it to whom I will…” This statement was made during the _____.",
                optionA = "ascension of Jesus",
                optionB = "sermon on the mount",
                optionC = "temptation of Jesus",
                optionD = "triumphal entry into Jerusalem",
                correctAnswerIndex = 2,
                explanation = "Luke 4:6: The Devil made this claim to Jesus on the high mountain during the wilderness temptation.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_42",
                subject = "CRS",
                topic = "Parables of Luke 15",
                year = "PT. 5",
                questionText = "“...Just so, I tell you, there is joy before the angels of God over one sinner who repents.” Jesus made this statement after telling the parable of the _____.",
                optionA = "prodigal son",
                optionB = "lost coin",
                optionC = "dishonest steward",
                optionD = "lost sheep",
                correctAnswerIndex = 1,
                explanation = "Luke 15:10: Following the Parable of the Lost Coin, Jesus declared joy before the angels of God over one repenting sinner.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_43",
                subject = "CRS",
                topic = "Healing of the Leper",
                year = "PT. 5",
                questionText = "According to Luke, the leper healed by Jesus was commanded to _____.",
                optionA = "go and show himself to his friends",
                optionB = "find out from the priest what he should offer",
                optionC = "tell people about the cleansing",
                optionD = "make an offering for his cleansing",
                correctAnswerIndex = 3,
                explanation = "Luke 5:14: Jesus ordered him to tell no one, but go show himself to the priest and make an offering for cleansing as Moses directed.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_44",
                subject = "CRS",
                topic = "Peter's Confession",
                year = "PT. 5",
                questionText = "After the great confession by Peter, Jesus charged the disciples to _____.",
                optionA = "announce that the kingdom of heaven had come",
                optionB = "tell no one that he was the Christ",
                optionC = "go away from the crowd to rest",
                optionD = "beware of the leaven of the Pharisees",
                correctAnswerIndex = 1,
                explanation = "Matthew 16:20: 'Then he strictly charged the disciples to tell no one that he was the Christ.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_45",
                subject = "CRS",
                topic = "Birth of John the Baptist",
                year = "PT. 5",
                questionText = "The Angel of the Lord told Zachariah that the son would _____.",
                optionA = "make the disobedient repent of their sins",
                optionB = "turn many of the sons and daughters of Israel to God",
                optionC = "go before God in the spirit and power of Elijah",
                optionD = "turn the hearts of the children to their father",
                correctAnswerIndex = 2,
                explanation = "Luke 1:17: 'And he will go before him in the spirit and power of Elijah, to turn the hearts of the fathers to the children.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_46",
                subject = "CRS",
                topic = "Return of the Seventy",
                year = "PT. 5",
                questionText = "When they returned from their mission, the seventy reported that _____.",
                optionA = "their needs were fully met",
                optionB = "even Samaritans accepted their message",
                optionC = "they saw Satan fall like lightning",
                optionD = "even demons were subject to them",
                correctAnswerIndex = 3,
                explanation = "Luke 10:17: The seventy-two returned with joy, saying, 'Lord, even the demons are subject to us in your name!'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_47",
                subject = "CRS",
                topic = "Walking on the Water",
                year = "PT. 5",
                questionText = "“Take heart, it is I; have no fear.” This statement was made by Jesus when _____.",
                optionA = "He appeared to two disciples on the way to Emmaus",
                optionB = "He was walking on the sea in the night",
                optionC = "Mary Magdalene saw him at the sepulchre",
                optionD = "The women saw Him after resurrection",
                correctAnswerIndex = 1,
                explanation = "Matthew 14:27: Jesus spoke to His terrified disciples as He walked on the turbulent sea during the fourth watch.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_48",
                subject = "CRS",
                topic = "Triumphal Entry",
                year = "PT. 5",
                questionText = "“...Blessed is the kingdom of our father David that is coming…” The declaration above was made by the crowd during the _____.",
                optionA = "triumphal entry into Jerusalem",
                optionB = "feeding of the four thousand",
                optionC = "Passover feast",
                optionD = "Transfiguration of Jesus",
                correctAnswerIndex = 0,
                explanation = "Mark 11:10: Crowds shouted Hosanna and blessed the coming kingdom of David during Jesus' triumphal entry.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q48",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crk_pt5_49",
                subject = "CRS",
                topic = "Healing at Bethesda Pool",
                year = "PT. 5",
                questionText = "After healing the man at the pool of Bethesda, the Jews sought all the more to kill Jesus because _____.",
                optionA = "they hated the man that was healed",
                optionB = "he did this on the Sabbath",
                optionC = "they were unhappy that he healed the man",
                optionD = "he claimed that God his father was still working",
                correctAnswerIndex = 3,
                explanation = "John 5:18: 'This was why the Jews were seeking all the more to kill him, because not only was he breaking the Sabbath, but he was even calling God his own Father, making himself equal with God.'",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK PT.5 • Q49",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
