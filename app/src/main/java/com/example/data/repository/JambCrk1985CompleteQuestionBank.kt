package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and authentic JAMB Christian Religious Knowledge / Studies (CRK/CRS)
 * past examination series (1985 Series).
 * Formatted into standard 4-option structure (A-D) with verified keys, topics, and detailed educational explanations.
 */
object JambCrk1985CompleteQuestionBank {

    fun getCrk1985Questions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // Q1
        list.add(
            QuestionEntity(
                id = "crk_1985_01",
                subject = "CRS",
                topic = "Creation Account: Day Six",
                year = "1985",
                questionText = "According to Genesis Chapter 1, on the sixth day of creation, God made:",
                optionA = "the firmament separating the waters",
                optionB = "the sun, moon, and stars",
                optionC = "dry land, seas, and vegetation",
                optionD = "living land creatures, beasts of the earth, and humankind in His image",
                correctAnswerIndex = 3,
                explanation = "Genesis 1:24-31 records that on the sixth day, God created living creatures of the earth, cattle, creeping things, and finally human beings (male and female) in His own image and likeness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q2
        list.add(
            QuestionEntity(
                id = "crk_1985_02",
                subject = "CRS",
                topic = "The Great Deluge & Noah's Ark",
                year = "1985",
                questionText = "The floodwaters prevailed upon the earth while Noah was inside the ark for a total of:",
                optionA = "ten days",
                optionB = "forty days",
                optionC = "one hundred days",
                optionD = "one hundred and fifty days",
                correctAnswerIndex = 3,
                explanation = "In Genesis 7:24 and 8:3, the biblical account states that the waters prevailed upon the earth for one hundred and fifty days before they began to steadily abate.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q3
        list.add(
            QuestionEntity(
                id = "crk_1985_03",
                subject = "CRS",
                topic = "Covenant of Circumcision with Abram",
                year = "1985",
                questionText = "‘I am the Almighty God; walk before me, and be thou perfect (blameless).’ How old was Abram when the Lord appeared to him with this command and instituted the covenant of circumcision?",
                optionA = "75 years old",
                optionB = "86 years old",
                optionC = "99 years old",
                optionD = "105 years old",
                correctAnswerIndex = 2,
                explanation = "Genesis 17:1-2 states: 'And when Abram was ninety years old and nine, the LORD appeared to Abram, and said unto him, I am the Almighty God; walk before me, and be thou perfect.'",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q4
        list.add(
            QuestionEntity(
                id = "crk_1985_04",
                subject = "CRS",
                topic = "Jacob's Grief over Benjamin and Joseph",
                year = "1985",
                questionText = "‘You would bring down my gray hairs with sorrow to Sheol (the grave).’ Jacob said this to his sons because:",
                optionA = "Joseph was imprisoned in Egypt",
                optionB = "the famine had consumed all grain in Canaan",
                optionC = "the Ishmaelites demanded double repayment",
                optionD = "he feared Benjamin would be lost or harmed like Joseph",
                correctAnswerIndex = 3,
                explanation = "In Genesis 42:38, Jacob refused to let his youngest son Benjamin accompany the brothers to Egypt, fearing that any harm befalling Benjamin would bring his sorrowful life to a tragic end.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "crk_1985_05",
                subject = "CRS",
                topic = "The Plagues of Egypt: The Finger of God",
                year = "1985",
                questionText = "The Egyptian magicians confessed to Pharaoh, ‘This is the finger of God’, after they failed to duplicate the plague of:",
                optionA = "frogs",
                optionB = "blood",
                optionC = "locusts",
                optionD = "gnats (lice)",
                correctAnswerIndex = 3,
                explanation = "In Exodus 8:18-19, when Aaron struck the dust and gnats covered all of Egypt, the Egyptian magicians attempted with their secret arts to produce gnats but failed, admitting: 'This is the finger of God.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q7
        list.add(
            QuestionEntity(
                id = "crk_1985_07",
                subject = "CRS",
                topic = "The Covenant Affirmation at Sinai",
                year = "1985",
                questionText = "On what historic occasion did all the Israelites unanimously respond: ‘All that the LORD has spoken we will do’?",
                optionA = "After Joshua's farewell address at Shechem",
                optionB = "At Mount Sinai when receiving God's covenant terms through Moses",
                optionC = "When gathering manna in the wilderness of Sin",
                optionD = "After the destruction of the golden calf",
                correctAnswerIndex = 1,
                explanation = "In Exodus 19:8 (and 24:3), when Moses presented the divine covenant proposals on Mount Sinai, all the people answered together: 'All that the LORD hath spoken we will do.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q8
        list.add(
            QuestionEntity(
                id = "crk_1985_08",
                subject = "CRS",
                topic = "The Ten Commandments: Filial Duty",
                year = "1985",
                questionText = "In the Decalogue (Ten Commandments), the fifth commandment is an explicit injunction to:",
                optionA = "refrain from crafting or worshipping graven images",
                optionB = "abstain from murder",
                optionC = "avoid adultery and sexual immorality",
                optionD = "honour your father and your mother",
                correctAnswerIndex = 3,
                explanation = "Exodus 20:12 states: 'Honour thy father and thy mother: that thy days may be long upon the land which the LORD thy God giveth thee.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q9
        list.add(
            QuestionEntity(
                id = "crk_1985_09",
                subject = "CRS",
                topic = "Moses at Meribah in the Wilderness of Zin",
                year = "1985",
                questionText = "‘Hear now, ye rebels; must we fetch you water out of this rock?’ This rash statement was uttered by Moses at:",
                optionA = "the valley of Moab",
                optionB = "Mount Hor",
                optionC = "Meribah in the wilderness of Zin",
                optionD = "Mount Nebo",
                correctAnswerIndex = 2,
                explanation = "In Numbers 20:10, Moses addressed the rebellious assembly at the waters of Meribah in the wilderness of Zin before striking the rock twice instead of speaking to it.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "crk_1985_10",
                subject = "CRS",
                topic = "Moses' Instructions to the Spies",
                year = "1985",
                questionText = "When Moses sent the twelve tribal leaders to spy out the land of Canaan, he instructed them to observe all the following EXCEPT:",
                optionA = "whether the inhabitants were strong or weak, few or many",
                optionB = "whether the land was fertile or barren, forested or open",
                optionC = "whether the cities were fortified strongholds or open camps",
                optionD = "whether the land was metaphorically flowing with milk and honey",
                correctAnswerIndex = 3,
                explanation = "In Numbers 13:17-20, Moses gave specific practical intelligence instructions (evaluating population strength, land fertility, wood resources, and city fortifications), rather than requesting a poetic evaluation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q11
        list.add(
            QuestionEntity(
                id = "crk_1985_11",
                subject = "CRS",
                topic = "Succession of Joshua",
                year = "1985",
                questionText = "Who was chosen by God to succeed Moses and lead the Israelites into the Promised Land across the Jordan?",
                optionA = "Caleb the son of Jephunneh",
                optionB = "Eleazar the priest",
                optionC = "Samuel the prophet",
                optionD = "Joshua the son of Nun",
                correctAnswerIndex = 3,
                explanation = "In Deuteronomy 31:7 and Joshua 1:1-2, God commissioned Joshua, son of Nun, as Moses' successor to lead Israel into the inheritance of Canaan.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q12
        list.add(
            QuestionEntity(
                id = "crk_1985_12",
                subject = "CRS",
                topic = "The Fall of Jericho",
                year = "1985",
                questionText = "Joshua's first major military victory upon crossing the Jordan River into Canaan was at:",
                optionA = "Ai",
                optionB = "Gibeon",
                optionC = "Gilgal",
                optionD = "Jericho",
                correctAnswerIndex = 3,
                explanation = "Joshua 6 details the miraculous capture and destruction of the fortified city of Jericho as Israel's initial conquest in the Promised Land.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q13
        list.add(
            QuestionEntity(
                id = "crk_1985_13",
                subject = "CRS",
                topic = "Deborah, Barak and the Defeat of Sisera",
                year = "1985",
                questionText = "Sisera, the general of King Jabin of Hazor's Canaanite army, was killed by:",
                optionA = "Barak the son of Abinoam",
                optionB = "Deborah the prophetess",
                optionC = "Joshua the commander",
                optionD = "Jael the wife of Heber the Kenite",
                correctAnswerIndex = 3,
                explanation = "In Judges 4:17-22, Jael welcomed the fleeing Sisera into her tent, and while he slept exhausted, drove a wooden tent peg through his temple into the ground.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q14
        list.add(
            QuestionEntity(
                id = "crk_1985_14",
                subject = "CRS",
                topic = "The Call of Gideon",
                year = "1985",
                questionText = "‘Surely I will be with thee, and thou shalt smite the Midianites as one man.’ God gave this divine assurance of victory to:",
                optionA = "Moses",
                optionB = "Joshua",
                optionC = "Deborah",
                optionD = "Gideon",
                correctAnswerIndex = 3,
                explanation = "In Judges 6:16, the Angel of the Lord appeared to Gideon while threshing wheat in the winepress and assured him that he would defeat the Midianite oppressors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q15
        list.add(
            QuestionEntity(
                id = "crk_1985_15",
                subject = "CRS",
                topic = "The Birth and Naming of Samuel",
                year = "1985",
                questionText = "The Hebrew name ‘Samuel’ given to Hannah's son signifies:",
                optionA = "The Strength of the Almighty",
                optionB = "The Fruit of My Tears",
                optionC = "Because I have asked him of the LORD",
                optionD = "Prophet of the Living God",
                correctAnswerIndex = 2,
                explanation = "In 1 Samuel 1:20, Hannah named him Samuel, explaining: 'Because I have asked him of the LORD' (Hebrew: Shemu'el).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q16
        list.add(
            QuestionEntity(
                id = "crk_1985_16",
                subject = "CRS",
                topic = "Rejection of Samuel's Sons as Judges",
                year = "1985",
                questionText = "The elders of Israel requested a king primarily because Samuel was old and his sons (Joel and Abiah):",
                optionA = "were physically incapable of military leadership",
                optionB = "refused to offer sacrifices at the tabernacle",
                optionC = "turned aside after dishonest gain, took bribes, and perverted justice",
                optionD = "belonged to an illegitimate royal line",
                correctAnswerIndex = 2,
                explanation = "In 1 Samuel 8:3-5, the elders complained to Samuel that his sons did not walk in his righteous ways, but took bribes and perverted judgment, prompting the demand for a king.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q17
        list.add(
            QuestionEntity(
                id = "crk_1985_17",
                subject = "CRS",
                topic = "Saul's Impatient Sacrifice at Gilgal",
                year = "1985",
                questionText = "God declared that King Saul's dynasty would not continue over Israel because Saul:",
                optionA = "refused to assemble the armies at Gilgal",
                optionB = "lost the battle against the Philistine vanguard",
                optionC = "presumed to offer the burnt offering himself instead of waiting for Samuel",
                optionD = "was physically too weak to command the army",
                correctAnswerIndex = 2,
                explanation = "In 1 Samuel 13:8-14, Saul grew impatient when Samuel delayed in arriving at Gilgal and unlawfully usurped the priestly office by offering burnt sacrifices, leading Samuel to announce that God had sought a man after His own heart.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q18
        list.add(
            QuestionEntity(
                id = "crk_1985_18",
                subject = "CRS",
                topic = "The Death of King Saul on Mount Gilboa",
                year = "1985",
                questionText = "According to 1 Samuel 31, how did King Saul actually die on Mount Gilboa?",
                optionA = "He was slain in combat by Jonathan",
                optionB = "He fell upon his own sword after being critically wounded by Philistine archers",
                optionC = "His armor-bearer struck him down upon his request",
                optionD = "An Amalekite soldier decapitated him in battle",
                correctAnswerIndex = 1,
                explanation = "In 1 Samuel 31:4-5, Saul was sorely wounded by Philistine archers, and when his armor-bearer refused to kill him, Saul took a sword and fell upon it to avoid capture and torture.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q19
        list.add(
            QuestionEntity(
                id = "crk_1985_19",
                subject = "CRS",
                topic = "David's Administration: Military Leadership",
                year = "1985",
                questionText = "The chief commander of King David's military forces throughout his reign was:",
                optionA = "Abner the son of Ner",
                optionB = "Joab the son of Zeruiah",
                optionC = "Abiathar the priest",
                optionD = "Zadok the son of Ahitub",
                correctAnswerIndex = 1,
                explanation = "In 2 Samuel 8:16 and 20:23, Joab the son of Zeruiah was over all the host (commander-in-chief) of David's army.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q20
        list.add(
            QuestionEntity(
                id = "crk_1985_20",
                subject = "CRS",
                topic = "David and Bathsheba",
                year = "1985",
                questionText = "King David committed adultery with Bathsheba, who was the wife of:",
                optionA = "Abner the son of Ner",
                optionB = "Uriah the Hittite",
                optionC = "Joab the commander",
                optionD = "Ittai the Gittite",
                correctAnswerIndex = 1,
                explanation = "In 2 Samuel 11:3-4, David sent for Bathsheba, the daughter of Eliam and wife of Uriah the Hittite, and committed adultery with her while Uriah was at the frontlines in Rabbah.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q21
        list.add(
            QuestionEntity(
                id = "crk_1985_21",
                subject = "CRS",
                topic = "Ahijah's Prophecy to Jeroboam",
                year = "1985",
                questionText = "Which Hebrew prophet symbolically tore his new garment into twelve pieces and gave ten to Jeroboam to foretell the division of Solomon's kingdom?",
                optionA = "Micaiah the son of Imlah",
                optionB = "Jeremiah the prophet",
                optionC = "Nathan the prophet",
                optionD = "Ahijah the Shilonite",
                correctAnswerIndex = 3,
                explanation = "In 1 Kings 11:29-31, the prophet Ahijah of Shiloh met Jeroboam and tore his new cloak into twelve pieces, telling Jeroboam to take ten pieces representing the ten northern tribes God was giving him.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "crk_1985_22",
                subject = "CRS",
                topic = "The Founding of Samaria by Omri",
                year = "1985",
                questionText = "The capital city of the northern Kingdom of Israel, Samaria, was purchased and built by King:",
                optionA = "Omri",
                optionB = "Jeroboam I",
                optionC = "Jehu",
                optionD = "Ahab",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 16:24, King Omri bought the hill of Samaria of Shemer for two talents of silver and built the capital city of Samaria on the hill.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q23
        list.add(
            QuestionEntity(
                id = "crk_1985_23",
                subject = "CRS",
                topic = "Amos the Prophet from Tekoa",
                year = "1985",
                questionText = "The Old Testament prophet who was a shepherd and dresser of sycamore trees in Tekoa before being called to prophesy in the northern kingdom was:",
                optionA = "Isaiah",
                optionB = "Jeremiah",
                optionC = "Hosea",
                optionD = "Amos",
                correctAnswerIndex = 3,
                explanation = "In Amos 1:1 and 7:14, Amos declared that he was from Tekoa in Judah, not a prophet by birth or training, but a herdsman and tender of sycamore figs sent by God to Bethel in Israel.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q24
        list.add(
            QuestionEntity(
                id = "crk_1985_24",
                subject = "CRS",
                topic = "Kings of Judah: Successor to Hezekiah",
                year = "1985",
                questionText = "Which King of Judah reigned immediately after the death of King Hezekiah?",
                optionA = "Josiah",
                optionB = "Amon",
                optionC = "Jehoiakim",
                optionD = "Manasseh",
                correctAnswerIndex = 3,
                explanation = "In 2 Kings 20:21 and 21:1, Hezekiah slept with his fathers, and his twelve-year-old son Manasseh succeeded him as King of Judah.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q25
        list.add(
            QuestionEntity(
                id = "crk_1985_25",
                subject = "CRS",
                topic = "Nehemiah: Social Grievances vs Physical Labor",
                year = "1985",
                questionText = "During the rebuilding of Jerusalem's walls under Nehemiah, all of the following were socioeconomic grievances raised by the poor Jewish citizens against their wealthy brothers EXCEPT:",
                optionA = "‘We must get grain for our families that we may eat and keep alive.’",
                optionB = "‘We are mortgaging our fields, vineyards, and homes to buy food.’",
                optionC = "‘We have borrowed money for the King’s tribute tax on our property.’",
                optionD = "‘The strength of the burden-bearers is failing and there is much rubbish.’",
                correctAnswerIndex = 3,
                explanation = "In Nehemiah 5:1-5, the poor people cried out regarding usury, mortgages, enslavement of children, and high taxes. The statement about the failing strength of burden-bearers (Nehemiah 4:10) was a military/labor progress concern of Judah, not an economic extortion complaint.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q26
        list.add(
            QuestionEntity(
                id = "crk_1985_26",
                subject = "CRS",
                topic = "Jesus of Nazareth: Upbringing",
                year = "1985",
                questionText = "Jesus was commonly referred to as ‘Jesus of Nazareth’ primarily because:",
                optionA = "He took the formal Nazarite vow from birth",
                optionB = "His ancestor King David had established Nazareth",
                optionC = "He grew up and was raised from childhood in the town of Nazareth",
                optionD = "Nazareth was the operational headquarters of His Galilean ministry",
                correctAnswerIndex = 2,
                explanation = "In Matthew 2:23 and Luke 2:51, Joseph brought his family to settle in Nazareth, where Jesus grew up to adulthood, fulfilling the saying that He would be called a Nazarene.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q27
        list.add(
            QuestionEntity(
                id = "crk_1985_27",
                subject = "CRS",
                topic = "The Gospel of Luke: Prologue to Theophilus",
                year = "1985",
                questionText = "Luke provided an orderly and extensively researched account of Christ's infancy and ministry specifically because he was addressing:",
                optionA = "Theophilus",
                optionB = "the Emperor of Rome",
                optionC = "the Sanhedrin Council",
                optionD = "the Apostle Peter",
                correctAnswerIndex = 0,
                explanation = "In Luke 1:1-4, Luke states he investigated everything carefully from the beginning to write an orderly account for the 'most excellent Theophilus'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q28
        list.add(
            QuestionEntity(
                id = "crk_1985_28",
                subject = "CRS",
                topic = "John the Baptist: Preaching Repentance",
                year = "1985",
                questionText = "‘You brood of vipers! Who warned you to flee from the wrath to come?’ This bold prophetic confrontation was delivered by:",
                optionA = "Jesus Christ at the Feast of Tabernacles",
                optionB = "Zechariah the priest in the Temple",
                optionC = "Apostle Paul before the Areopagus",
                optionD = "John the Baptist at the River Jordan",
                correctAnswerIndex = 3,
                explanation = "In Matthew 3:7 and Luke 3:7, John the Baptist addressed the Pharisees and Sadducees coming to his baptism with this piercing warning against religious hypocrisy.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q29
        list.add(
            QuestionEntity(
                id = "crk_1985_29",
                subject = "CRS",
                topic = "The Temptations of Jesus: Gospel Synoptic Comparison",
                year = "1985",
                questionText = "Which of the following statements accurately describes the temptation narrative of Jesus in the Gospels?",
                optionA = "The order of the temptations varies between Matthew and Luke, but the substantive tests remain the same",
                optionB = "Matthew and Luke record identical sequential orders for all three temptations",
                optionC = "The wilderness temptation is recorded exclusively in Mark's Gospel",
                optionD = "John's Gospel provides the most detailed dialogue of the wilderness temptation",
                correctAnswerIndex = 0,
                explanation = "Matthew records the order as: Stones to Bread -> Temple Pinnacle -> High Mountain. Luke records: Stones to Bread -> High Mountain -> Temple Pinnacle. The tests are identical in substance but arranged in differing thematic sequences.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q30
        list.add(
            QuestionEntity(
                id = "crk_1985_30",
                subject = "CRS",
                topic = "The Twelve Apostles of Jesus",
                year = "1985",
                questionText = "Which of the following individuals was NOT one of the original twelve Apostles called by Jesus?",
                optionA = "Simon Peter",
                optionB = "Andrew",
                optionC = "Luke",
                optionD = "James the son of Zebedee",
                correctAnswerIndex = 2,
                explanation = "Luke was a physician and companion of Paul on his missionary journeys, who wrote the Gospel of Luke and the Acts of the Apostles, but was not one of the original twelve disciples.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q31
        list.add(
            QuestionEntity(
                id = "crk_1985_31",
                subject = "CRS",
                topic = "Faith of the Roman Centurion at Capernaum",
                year = "1985",
                questionText = "‘Lord, I am not worthy that you should enter under my roof; but speak the word only, and my servant shall be healed.’ Who exhibited this profound faith in Jesus' authority?",
                optionA = "The Syrophoenician woman",
                optionB = "Jairus the synagogue ruler",
                optionC = "The Roman Centurion at Capernaum",
                optionD = "Zacchaeus the chief tax collector",
                correctAnswerIndex = 2,
                explanation = "In Matthew 8:8 and Luke 7:6-7, the Roman Centurion sent elders to say he was unworthy to have Jesus enter his home, asking Him only to speak the command of healing from a distance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q32
        list.add(
            QuestionEntity(
                id = "crk_1985_32",
                subject = "CRS",
                topic = "Parables of Jesus: The Hidden Treasure",
                year = "1985",
                questionText = "‘The kingdom of heaven is like unto treasure hid in a field; the which when a man hath found, he hideth, and for joy thereof goeth and selleth all that he hath, and buyeth that field.’ This parable emphasizes the:",
                optionA = "cleverness of business speculators",
                optionB = "danger of burying earthly riches",
                optionC = "urgency of agricultural diligence",
                optionD = "incomparable value and preciousness of the Kingdom of God",
                correctAnswerIndex = 3,
                explanation = "In Matthew 13:44, the Parable of the Hidden Treasure illustrates that the Kingdom of God is so incomparably precious that a person gladly surrenders all earthly possessions to possess it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q33
        list.add(
            QuestionEntity(
                id = "crk_1985_33",
                subject = "CRS",
                topic = "Jewish Religious Groups: Scribes",
                year = "1985",
                questionText = "During the time of Jesus, the professional scholars and authoritative interpreters and teachers of the Mosaic Law were the:",
                optionA = "Sadducees",
                optionB = "Scribes (Lawyers)",
                optionC = "Zealots",
                optionD = "Essenes",
                correctAnswerIndex = 1,
                explanation = "The Scribes (often termed 'teachers of the Law' or lawyers) were the professional scholars tasked with copying, guarding, and interpreting the detailed legal provisions of the Torah.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q34
        list.add(
            QuestionEntity(
                id = "crk_1985_34",
                subject = "CRS",
                topic = "The Transfiguration of Jesus",
                year = "1985",
                questionText = "‘This is my beloved Son, in whom I am well pleased; hear ye him.’ This divine voice from the overshadowing bright cloud occurred:",
                optionA = "during Jesus' agonizing prayer in the Garden of Gethsemane",
                optionB = "on the high mountain during the Transfiguration",
                optionC = "at the Roman governor's trial before Pilate",
                optionD = "during Jesus' crucifixion at Golgotha",
                correctAnswerIndex = 1,
                explanation = "In Matthew 17:5 and Mark 9:7, the Father's voice authenticated Jesus in the presence of Peter, James, John, Moses, and Elijah on the Mount of Transfiguration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q35
        list.add(
            QuestionEntity(
                id = "crk_1985_35",
                subject = "CRS",
                topic = "Parables of Jesus: The Wheat and the Tares",
                year = "1985",
                questionText = "In Jesus' explanation of the Parable of the Weeds (Tares) in Matthew 13, the owner of the field who sowed good seed represents:",
                optionA = "the devil",
                optionB = "an angel of light",
                optionC = "the Son of Man",
                optionD = "a worldly landowner",
                correctAnswerIndex = 2,
                explanation = "In Matthew 13:37, Jesus explained: 'He that soweth the good seed is the Son of Man; the field is the world.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q36
        list.add(
            QuestionEntity(
                id = "crk_1985_36",
                subject = "CRS",
                topic = "Herod Antipas' Fear Concerning Jesus",
                year = "1985",
                questionText = "When Herod the Tetrarch heard of the miraculous works and fame of Jesus, his troubled conscience led him to believe that Jesus was:",
                optionA = "John the Baptist (or Elijah) raised from the dead",
                optionB = "Isaiah the prophet reincarnated",
                optionC = "King David returned to his royal throne",
                optionD = "Moses resurrected to free Israel from Rome",
                correctAnswerIndex = 0,
                explanation = "In Matthew 14:1-2 and Mark 6:14-16, Herod Antipas, who had executed John the Baptist, said to his servants: 'This is John the Baptist; he is risen from the dead; and therefore mighty works do shew forth themselves in him.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q37
        list.add(
            QuestionEntity(
                id = "crk_1985_37",
                subject = "CRS",
                topic = "The Ambition of James and John",
                year = "1985",
                questionText = "‘Grant that we may sit, one on your right hand and the other on your left hand, in your glory.’ Who made this ambitious request to Jesus?",
                optionA = "Simon Peter and Andrew",
                optionB = "Simon Peter and John",
                optionC = "James and John (the sons of Zebedee)",
                optionD = "Philip and Bartholomew",
                correctAnswerIndex = 2,
                explanation = "In Mark 10:35-37 (and Matthew 20:20-21 with their mother), James and John, the sons of Zebedee, asked Jesus for the two highest places of honor in His Messianic Kingdom.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q38
        list.add(
            QuestionEntity(
                id = "crk_1985_38",
                subject = "CRS",
                topic = "The Conversion of Zacchaeus in Jericho",
                year = "1985",
                questionText = "‘This day is salvation come to this house, forsomuch as he also is a son of Abraham.’ Jesus declared this blessing over:",
                optionA = "Levi the tax collector at Capernaum",
                optionB = "Stephen the deacon in Jerusalem",
                optionC = "Zacchaeus the chief tax collector in Jericho",
                optionD = "Lazarus of Bethany",
                correctAnswerIndex = 2,
                explanation = "In Luke 19:8-9, after Zacchaeus pledged half his goods to the poor and quadruple restitution to anyone he had defrauded, Jesus declared salvation over his household.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q39
        list.add(
            QuestionEntity(
                id = "crk_1985_39",
                subject = "CRS",
                topic = "Parables of Jesus: The Ten Virgins",
                year = "1985",
                questionText = "In the Parable of the Ten Virgins (Maidens), the five virgins were designated as ‘foolish’ because they:",
                optionA = "slept before the bridegroom arrived",
                optionB = "forgot to bring their torches and lamps",
                optionC = "lacked proper wedding garments",
                optionD = "took their lamps but took no extra oil with them",
                correctAnswerIndex = 3,
                explanation = "In Matthew 25:3-4, the foolish virgins took their lamps but neglected to bring reserve oil, so when the bridegroom delayed, their lamps flickered and went out.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q40
        list.add(
            QuestionEntity(
                id = "crk_1985_40",
                subject = "CRS",
                topic = "The Trial of Jesus: Pilate's Verdict",
                year = "1985",
                questionText = "‘I find no fault in this man.’ This repeated declaration of Jesus' legal innocence was made by:",
                optionA = "High Priest Caiaphas",
                optionB = "Annas the former High Priest",
                optionC = "King Herod Antipas",
                optionD = "Pontius Pilate the Roman governor",
                correctAnswerIndex = 3,
                explanation = "In Luke 23:4, 14, 22 and John 18:38, Pontius Pilate repeatedly proclaimed to the chief priests and crowds: 'I find no fault in this man.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q41
        list.add(
            QuestionEntity(
                id = "crk_1985_41",
                subject = "CRS",
                topic = "The Olivet Discourse: Eschatological Tribulation",
                year = "1985",
                questionText = "In the Olivet Discourse concerning the final tribulations preceding the end of the age, Jesus instructed His followers to pray that their flight would not occur in:",
                optionA = "summer",
                optionB = "winter (or on the Sabbath)",
                optionC = "autumn",
                optionD = "springtime",
                correctAnswerIndex = 1,
                explanation = "In Matthew 24:20 and Mark 13:18, Jesus urged His disciples: 'And pray ye that your flight be not in the winter, neither on the sabbath day', due to the severe cold and travel restrictions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q42
        list.add(
            QuestionEntity(
                id = "crk_1985_42",
                subject = "CRS",
                topic = "Recipients of Luke-Acts: Theophilus",
                year = "1985",
                questionText = "Theophilus, to whom both the Gospel of Luke and the Acts of the Apostles were dedicated, was:",
                optionA = "one of the twelve chosen Apostles",
                optionB = "the noble Christian patron for whom Luke wrote his two-volume history",
                optionC = "the Roman centurion baptized by Peter in Caesarea",
                optionD = "one of the seven ordained deacons of Jerusalem",
                correctAnswerIndex = 1,
                explanation = "Luke 1:3 and Acts 1:1 specifically dedicate the two historical books to 'most excellent Theophilus', a distinguished individual whose name means 'friend/lover of God'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q43
        list.add(
            QuestionEntity(
                id = "crk_1985_43",
                subject = "CRS",
                topic = "Peter's Deliverance from Herod's Prison",
                year = "1985",
                questionText = "‘Gird thyself, and bind on thy sandals... Cast thy garment about thee, and follow me.’ An angel gave these instructions during a miraculous prison escape to:",
                optionA = "Apostle John",
                optionB = "Apostle Paul",
                optionC = "Apostle Peter",
                optionD = "Silas",
                correctAnswerIndex = 2,
                explanation = "In Acts 12:7-8, when Herod Agrippa I imprisoned Peter in Jerusalem, an angel of the Lord woke Peter, caused his chains to fall off, and instructed him to put on his sandals and coat.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q44
        list.add(
            QuestionEntity(
                id = "crk_1985_44",
                subject = "CRS",
                topic = "Philip and the Ethiopian Eunuch",
                year = "1985",
                questionText = "On the desert road from Jerusalem to Gaza, Philip the Evangelist explained Isaiah 53 to and baptized a:",
                optionA = "high court official (eunuch) of Candace, Queen of the Ethiopians",
                optionB = "Roman centurion from the Italian cohort",
                optionC = "Samaritan sorcerer named Simon",
                optionD = "Greek merchant from Antioch",
                correctAnswerIndex = 0,
                explanation = "In Acts 8:26-38, Philip was directed by the Holy Spirit to the desert road where he evangelized and baptized the chief treasurer of Queen Candace of Ethiopia.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        // Q45
        list.add(
            QuestionEntity(
                id = "crk_1985_45",
                subject = "CRS",
                topic = "Paul's Initial Destination After Conversion",
                year = "1985",
                questionText = "Immediately following his dramatic encounter with Christ on the road, the blinded Saul was led by the hand into:",
                optionA = "Damascus",
                optionB = "Jerusalem",
                optionC = "Tarsus",
                optionD = "Antioch",
                correctAnswerIndex = 0,
                explanation = "In Acts 9:8-9, Saul arose from the earth, and when his eyes were opened, he saw no man; but his companions led him by the hand and brought him into Damascus.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1985"
            )
        )

        return list
    }
}
