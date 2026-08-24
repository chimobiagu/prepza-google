package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and authentic JAMB Christian Religious Knowledge / Studies (CRK/CRS)
 * past examination series (1991, 1992 & 1993 Series).
 * Formatted into standard 4-option structure (A-D) with verified keys, topics, and detailed educational explanations.
 */
object JambCrk1991to1993CompleteQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // ==========================================
        // 1991 JAMB CRK / CRS PAST EXAMINATION (50 QUESTIONS)
        // ==========================================

        // 1991 Q1
        list.add(
            QuestionEntity(
                id = "crk_1991_01",
                subject = "CRS",
                topic = "The Fall of Man: Nakedness",
                year = "1991",
                questionText = "“I heard the sound of thee in the garden, and I was afraid, because I was naked; and I hid myself.” The question that immediately followed this statement was:",
                optionA = "“What is this that you have done?”",
                optionB = "“Who told you that you are naked?”",
                optionC = "“Where are you?”",
                optionD = "“Have you eaten of the tree of which I commanded you not to eat?”",
                correctAnswerIndex = 1,
                explanation = "In Genesis 3:10-11, after Adam confessed his fear due to nakedness, God immediately asked 'Who told you that you are naked?' to address the root of his newly acquired knowledge.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q2
        list.add(
            QuestionEntity(
                id = "crk_1991_02",
                subject = "CRS",
                topic = "Noahic Covenant Dietary Laws",
                year = "1991",
                questionText = "One of the dietary covenants and rules given to Noah after the great flood was that he should:",
                optionA = "cultivate the land",
                optionB = "not eat flesh with its lifeblood in it",
                optionC = "send out the dove annually",
                optionD = "remain inside the ark.",
                correctAnswerIndex = 1,
                explanation = "As recorded in Genesis 9:4, as God permitted Noah to consume meat, He placed a strict restriction against eating flesh with its lifeblood still in it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q3
        list.add(
            QuestionEntity(
                id = "crk_1991_03",
                subject = "CRS",
                topic = "Isaac's Blessing over Jacob",
                year = "1991",
                questionText = "“. . . Let peoples serve you, and nations bow down to you . . .” This blessing was pronounced by:",
                optionA = "God",
                optionB = "Abraham",
                optionC = "Jacob",
                optionD = "Isaac",
                correctAnswerIndex = 3,
                explanation = "Isaac spoke this prophetic blessing of authority and prosperity over Jacob, mistakenly thinking he was blessing his firstborn son Esau (Genesis 27:29).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q4
        list.add(
            QuestionEntity(
                id = "crk_1991_04",
                subject = "CRS",
                topic = "Reuben's Grief over the Pit",
                year = "1991",
                questionText = "“This lad is gone; and where shall I go?” Which of Joseph’s brothers uttered these desperate words?",
                optionA = "Benjamin",
                optionB = "Judah",
                optionC = "Reuben",
                optionD = "Simeon",
                correctAnswerIndex = 2,
                explanation = "When Reuben returned to the pit and found that Joseph was missing, he tore his clothes in grief and cried out to his brothers in fear of their father's reaction (Genesis 37:30).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q5
        list.add(
            QuestionEntity(
                id = "crk_1991_05",
                subject = "CRS",
                topic = "Reasons for Hebrew Oppression in Egypt",
                year = "1991",
                questionText = "Pharaoh oppressed and enslaved the Israelites in Egypt because:",
                optionA = "he feared that they might join his enemies in the event of war",
                optionB = "they refused to learn the Egyptian language",
                optionC = "they worshipped a different God",
                optionD = "he wanted to build great pyramids immediately.",
                correctAnswerIndex = 0,
                explanation = "In Exodus 1:10, Pharaoh expressed concern that the rapidly multiplying Hebrew population would form a military alliance with Egypt's enemies during a war.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q6
        list.add(
            QuestionEntity(
                id = "crk_1991_06",
                subject = "CRS",
                topic = "Deliverance at the Red Sea",
                year = "1991",
                questionText = "“... The LORD will fight for you, and you have only to be still...” The Lord fought for and delivered the people of Israel on the occasion referred to in the statement by:",
                optionA = "drowning the Egyptian army in the Red Sea",
                optionB = "opening a chasm in the earth and swallowing their enemies",
                optionC = "raining fire and brimstone on their enemies",
                optionD = "raining hail and stones on their enemies.",
                correctAnswerIndex = 0,
                explanation = "Moses gave this reassurance in Exodus 14:14 just before God parted the Red Sea, enabling Israel to cross and subsequently drowning Pharaoh's pursuing forces.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q7
        list.add(
            QuestionEntity(
                id = "crk_1991_07",
                subject = "CRS",
                topic = "The Golden Calf Demand",
                year = "1991",
                questionText = "When Moses delayed to come down from the mountain of Sinai, the anxious Israelites:",
                optionA = "murmured against God and Moses",
                optionB = "decided to go back to Egypt",
                optionC = "went up to look for him",
                optionD = "asked Aaron to make gods for them",
                correctAnswerIndex = 3,
                explanation = "In Exodus 32:1, the restless crowd gathered around Aaron and demanded that he fashion physical gods to lead them, as they did not know what had happened to Moses.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q8
        list.add(
            QuestionEntity(
                id = "crk_1991_08",
                subject = "CRS",
                topic = "Sin of Moses at Meribah",
                year = "1991",
                questionText = "Moses was barred from entering the Promised Land primarily because he:",
                optionA = "was too old to cross the border",
                optionB = "was too busy preparing his successor",
                optionC = "did not treat God with due regard at Meribah",
                optionD = "died in the wilderness",
                correctAnswerIndex = 2,
                explanation = "Because Moses struck the rock twice in anger instead of speaking to it as commanded, God declared he failed to show His holiness before the congregation (Numbers 20:12).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q9
        list.add(
            QuestionEntity(
                id = "crk_1991_09",
                subject = "CRS",
                topic = "Commission of Joshua before Eleazar",
                year = "1991",
                questionText = "Moses consecrated and commissioned Joshua as the new leader of Israel in the presence of:",
                optionA = "Aaron",
                optionB = "Eleazar the priest",
                optionC = "Zadok",
                optionD = "Miriam",
                correctAnswerIndex = 1,
                explanation = "In Numbers 27:22, Moses obeyed God's command by presenting Joshua before Eleazar the priest and the entire assembly, laying his hands on him to transfer authority.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q10
        list.add(
            QuestionEntity(
                id = "crk_1991_10",
                subject = "CRS",
                topic = "Pledge of the Trans-Jordanic Tribes",
                year = "1991",
                questionText = "“All that you have commanded us we will do, and wherever you send us we will go...” This pledge of obedience was made to Joshua by the:",
                optionA = "Reubenites, the Gadites and part of the tribe of Manasseh",
                optionB = "twelve tribes of Israel combined",
                optionC = "two spies sent to Jericho",
                optionD = "seventy elders",
                correctAnswerIndex = 0,
                explanation = "The trans-Jordanic tribes made this solemn oath to obey Joshua completely as they had obeyed Moses, under penalty of death for rebellion (Joshua 1:16-18).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q11
        list.add(
            QuestionEntity(
                id = "crk_1991_11",
                subject = "CRS",
                topic = "Rahab and the Spies of Jericho",
                year = "1991",
                questionText = "Rahab the harlot assisted and hid the Israelite spies as they prepared to attack the city of:",
                optionA = "Ai",
                optionB = "Gideon",
                optionC = "Jericho",
                optionD = "Jerusalem",
                correctAnswerIndex = 2,
                explanation = "Rahab housed and protected the two spies sent by Joshua to inspect Jericho, securing a guarantee of safety for her family in return (Joshua 2).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q12
        list.add(
            QuestionEntity(
                id = "crk_1991_12",
                subject = "CRS",
                topic = "Samson's Riddle Betrayed",
                year = "1991",
                questionText = "“Out of the eater came something to eat. Out of the strong came something sweet.” This riddle was first explained by Samson to his:",
                optionA = "parents-in-law",
                optionB = "wife",
                optionC = "parents",
                optionD = "friends.",
                correctAnswerIndex = 1,
                explanation = "After weeping and pleading with him throughout their wedding feast, Samson's Philistine wife coerced him into revealing the secret, which she immediately betrayed to her companions (Judges 14).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q13
        list.add(
            QuestionEntity(
                id = "crk_1991_13",
                subject = "CRS",
                topic = "Midianite Oppression Duration",
                year = "1991",
                questionText = "For offending God with idolatry, the Israelites were delivered into the oppressive power of Midian for:",
                optionA = "seven years",
                optionB = "nine years",
                optionC = "twelve years",
                optionD = "fifteen years.",
                correctAnswerIndex = 0,
                explanation = "Judges 6:1 records that because Israel did evil in the sight of the Lord, He handed them over to severe Midianite raids for seven years.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q14
        list.add(
            QuestionEntity(
                id = "crk_1991_14",
                subject = "CRS",
                topic = "Gideon's Faith with 300 Men",
                year = "1991",
                questionText = "Gideon was able to successfully defeat the Midianites with a dramatically reduced force of 300 soldiers because he:",
                optionA = "was a good fighter",
                optionB = "was a prudent warrior",
                optionC = "had better weapons",
                optionD = "had absolute faith in God",
                correctAnswerIndex = 3,
                explanation = "Gideon demonstrated profound faith in God's instructions, trusting that God would deliver the massive Midianite host using only three hundred men armed with trumpets and torches (Judges 7).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q15
        list.add(
            QuestionEntity(
                id = "crk_1991_15",
                subject = "CRS",
                topic = "Elkanah's Double Portion for Hannah",
                year = "1991",
                questionText = "In 1 Samuel, Elkanah gave Hannah a worthy double portion of the sacrifice because:",
                optionA = "she had no children",
                optionB = "he loved her deeply",
                optionC = "she had daughters",
                optionD = "she was younger",
                correctAnswerIndex = 1,
                explanation = "1 Samuel 1:5 states that although the Lord had closed her womb, Elkanah would give Hannah a double portion because he loved her deeply.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q16
        list.add(
            QuestionEntity(
                id = "crk_1991_16",
                subject = "CRS",
                topic = "Hosea Marries Gomer",
                year = "1991",
                questionText = "Who was unfaithful to her husband Gomer, serving as a physical symbol of Israel's unfaithfulness to God?",
                optionA = "Gomer",
                optionB = "Rahab",
                optionC = "Jezebel",
                optionD = "Lo-ruhamah.",
                correctAnswerIndex = 0,
                explanation = "God commanded the prophet Hosea to marry a woman of harlotry, Gomer, to physically dramatize Israel's spiritual adultery and unfaithfulness to Yahweh (Hosea 1).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q17
        list.add(
            QuestionEntity(
                id = "crk_1991_17",
                subject = "CRS",
                topic = "Signal for Rebellion in Israel",
                year = "1991",
                questionText = "“... To your tents O Israel!” This historic proclamation was a signal for:",
                optionA = "war",
                optionB = "plebiscite",
                optionC = "rebellion",
                optionD = "treaty",
                correctAnswerIndex = 2,
                explanation = "This cry served as the signal for the northern tribes' open secession and rebellion against Rehoboam and the house of David (1 Kings 12:16).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q18
        list.add(
            QuestionEntity(
                id = "crk_1991_18",
                subject = "CRS",
                topic = "Elijah Proclaims Drought to Ahab",
                year = "1991",
                questionText = "“As the Lord God of Israel lives, before whom I stand, there shall be neither dew nor rain these years except by my word.” Who was the king of Israel during this drought?",
                optionA = "Omri",
                optionB = "Ahab",
                optionC = "Jeroboam I",
                optionD = "Jeroboam II.",
                correctAnswerIndex = 1,
                explanation = "Elijah delivered this severe decree of drought directly to King Ahab to punish his official sponsorship of Baal and Asherah worship in Samaria (1 Kings 17:1).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q19
        list.add(
            QuestionEntity(
                id = "crk_1991_19",
                subject = "CRS",
                topic = "Elisha Weeps over Hazael of Syria",
                year = "1991",
                questionText = "When Elisha received the message about King Benhadad’s ill-health, the prophet wept bitterly because he knew that:",
                optionA = "Benhadad was his friend",
                optionB = "Benhadad would not recover from the sickness",
                optionC = "Hazael would not succeed him",
                optionD = "Hazael would be extremely cruel to Israel.",
                correctAnswerIndex = 3,
                explanation = "In 2 Kings 8:12, Elisha wept because he foresaw the immense brutality Hazael would inflict on Israel, burning their fortresses, slaying their young men, and crushing infants once he seized power.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q20
        list.add(
            QuestionEntity(
                id = "crk_1991_20",
                subject = "CRS",
                topic = "Hezekiah's Prayer against Sennacherib",
                year = "1991",
                questionText = "“... Incline thy ear, O Lord, and hear, open thy eyes, O Lord, and see; and hear the words of Sennacherib, which he has sent to mock the living God ...” This was the prayer of:",
                optionA = "Josiah",
                optionB = "Isaiah",
                optionC = "Rabshakeh",
                optionD = "Hezekiah.",
                correctAnswerIndex = 3,
                explanation = "Upon receiving a blasphemous, threatening letter from Sennacherib, King Hezekiah went up to the temple, spread the letter before God, and offered this prayer for deliverance (2 Kings 19:16).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q21
        list.add(
            QuestionEntity(
                id = "crk_1991_21",
                subject = "CRS",
                topic = "Judgment Pronounced on Manasseh",
                year = "1991",
                questionText = "“...Behold, I am bringing upon Jerusalem and Judah such evil that the ears of every one who hears of it will tingle ...” This judgment was pronounced because of the sins of:",
                optionA = "Josiah",
                optionB = "Manasseh",
                optionC = "Amon",
                optionD = "Zedekiah.",
                correctAnswerIndex = 1,
                explanation = "God announced this severe judgment on Judah because of the extreme idolatry, child sacrifice, and innocent blood shed by King Manasseh (2 Kings 21:12).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q22
        list.add(
            QuestionEntity(
                id = "crk_1991_22",
                subject = "CRS",
                topic = "Saul's Jealousy of David",
                year = "1991",
                questionText = "Saul initially desired to kill David because:",
                optionA = "David became very popular after killing Goliath",
                optionB = "David wanted to overthrow him",
                optionC = "David married Michal and befriended Jonathan",
                optionD = "Saul was tormented by an evil spirit.",
                correctAnswerIndex = 0,
                explanation = "Saul's jealousy and hatred were triggered when the women sang: 'Saul has slain his thousands, and David his ten thousands,' making him fear David would take the kingdom (1 Samuel 18).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q23
        list.add(
            QuestionEntity(
                id = "crk_1991_23",
                subject = "CRS",
                topic = "Solomon's Idolatry Leads to Division",
                year = "1991",
                questionText = "God revealed to Solomon that the kingdom would be divided after him because he:",
                optionA = "had too many wives",
                optionB = "over-taxed and enslaved the people",
                optionC = "was too extravagant",
                optionD = "worshipped other gods.",
                correctAnswerIndex = 3,
                explanation = "In 1 Kings 11, God declared that because Solomon breached the covenant by building high places and worshiping foreign deities like Ashtoreth and Chemosh, He would tear the kingdom away.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q24
        list.add(
            QuestionEntity(
                id = "crk_1991_24",
                subject = "CRS",
                topic = "The Call of Isaiah (Uzziah's Death)",
                year = "1991",
                questionText = "“In the year that king Uzziah died, I saw the Lord sitting upon a throne, high and lifted up...” Which prophet is associated with this vision?",
                optionA = "Amos",
                optionB = "Hosea",
                optionC = "Isaiah",
                optionD = "Jeremiah.",
                correctAnswerIndex = 2,
                explanation = "Isaiah began his major prophetic calling inside the temple with this awe-inspiring vision of God's glory surrounded by seraphim (Isaiah 6:1).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q25
        list.add(
            QuestionEntity(
                id = "crk_1991_25",
                subject = "CRS",
                topic = "Beheading of John the Baptist",
                year = "1991",
                questionText = "King Herod granted the request of the daughter of Herodias by beheading John the Baptist because:",
                optionA = "the King was impressed by the way she danced",
                optionB = "John the Baptist opposed the king’s love affairs with Herodias",
                optionC = "Herod was bound by his oath and guests' pressure",
                optionD = "Herod was anxious to see John the Baptist dead.",
                correctAnswerIndex = 2,
                explanation = "Although Herod feared John, he had rashly promised the dancing girl under oath to give her whatever she wanted, feeling forced to comply to save face before his dinner guests (Matthew 14:9).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q26
        list.add(
            QuestionEntity(
                id = "crk_1991_26",
                subject = "CRS",
                topic = "Cost of Discipleship: Daily Cross",
                year = "1991",
                questionText = "According to Jesus' teachings on discipleship, the primary requirement for following Him is:",
                optionA = "Having a good knowledge of the scriptures",
                optionB = "Self-denial and taking up the cross daily",
                optionC = "Attending synagogue services regularly",
                optionD = "Offering many sacrifices.",
                correctAnswerIndex = 1,
                explanation = "In Luke 9:23, Jesus declared that if anyone would come after Him, he must deny himself, take up his cross daily, and follow Him.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q27
        list.add(
            QuestionEntity(
                id = "crk_1991_27",
                subject = "CRS",
                topic = "First Public Miracle in Mark: Demoniac",
                year = "1991",
                questionText = "According to Mark’s Gospel, the first public miracle of Jesus was:",
                optionA = "healing a leper",
                optionB = "opening the eyes of a blind man",
                optionC = "healing a man with an unclean spirit",
                optionD = "raising a dead boy to life.",
                correctAnswerIndex = 2,
                explanation = "Mark 1:21-26 records that Jesus' first miracle occurred in the synagogue at Capernaum, where He rebuked and cast out an unclean spirit from a man.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q28
        list.add(
            QuestionEntity(
                id = "crk_1991_28",
                subject = "CRS",
                topic = "Parable of the Pounds (Minas)",
                year = "1991",
                questionText = "When the disciples thought that the kingdom of God was to appear immediately, Jesus corrected them with the parable of the:",
                optionA = "great banquet",
                optionB = "prodigal son",
                optionC = "pounds (minas)",
                optionD = "vineyard.",
                correctAnswerIndex = 2,
                explanation = "In Luke 19:11, Jesus told the Parable of the Pounds to illustrate that there would be a long delay before the King returned, requiring faithful stewardship of His resources in the meantime.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q29
        list.add(
            QuestionEntity(
                id = "crk_1991_29",
                subject = "CRS",
                topic = "Sabbath Healing: Withered Hand",
                year = "1991",
                questionText = "Which of these miracles did Jesus perform on the Sabbath day, challenging Pharisaic legalism?",
                optionA = "Healing the Gerasene demoniac",
                optionB = "Healing the paralytic",
                optionC = "Healing the epileptic boy",
                optionD = "Healing the man with the withered hand.",
                correctAnswerIndex = 3,
                explanation = "Jesus healed the man with the withered hand in the synagogue on the Sabbath, declaring it is always lawful to do good and save life on the Sabbath (Mark 3:1-6).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q30
        list.add(
            QuestionEntity(
                id = "crk_1991_30",
                subject = "CRS",
                topic = "The Beatitudes: Peacemakers",
                year = "1991",
                questionText = "Peace makers are blessed because they shall:",
                optionA = "obtain peace of mind",
                optionB = "see God",
                optionC = "inherit the earth",
                optionD = "be called the sons of God",
                correctAnswerIndex = 3,
                explanation = "In Matthew 5:9, during the Beatitudes, Jesus promises that peacemakers will receive the supreme honor of being called the sons of God.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q31
        list.add(
            QuestionEntity(
                id = "crk_1991_31",
                subject = "CRS",
                topic = "Charge to the Seventy Disciples",
                year = "1991",
                questionText = "“He who hears you hears me, and he who rejects you rejects me, ...” This was addressed to:",
                optionA = "the twelve whom he sent out to preach",
                optionB = "all the disciples, just before the Ascension",
                optionC = "the seventy whom he sent out on mission",
                optionD = "the crowds during the Sermon on the Mount.",
                correctAnswerIndex = 2,
                explanation = "Jesus gave this final authorization to the seventy disciples, highlighting that their mission was backed by His own divine authority (Luke 10:16).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q32
        list.add(
            QuestionEntity(
                id = "crk_1991_32",
                subject = "CRS",
                topic = "Raising the Widow's Son at Nain",
                year = "1991",
                questionText = "“A great Prophet has arisen among us! and God had visited his people.” These statements were made during the:",
                optionA = "healing of the Centurion’s slave",
                optionB = "raising of the son of the widow of Nain",
                optionC = "raising of Tabitha",
                optionD = "raising of Lazarus.",
                correctAnswerIndex = 1,
                explanation = "Upon seeing Jesus raise the dead young man back to life in Nain, the entire crowd was seized with fear and praised God, declaring Him a great prophet (Luke 7:16).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q33
        list.add(
            QuestionEntity(
                id = "crk_1991_33",
                subject = "CRS",
                topic = "The Sign of Jonah",
                year = "1991",
                questionText = "Jesus referenced the ‘sign of Jonah’ to the Pharisees to indicate His:",
                optionA = "three-fold office as Prophet, Priest and King",
                optionB = "transfiguration and glorification",
                optionC = "messianic role in Galilee",
                optionD = "death and resurrection.",
                correctAnswerIndex = 3,
                explanation = "In Matthew 12:40, Jesus explained that just as Jonah spent three days and nights inside the sea monster, the Son of Man would spend three days and nights in the heart of the earth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q34
        list.add(
            QuestionEntity(
                id = "crk_1991_34",
                subject = "CRS",
                topic = "Pharisees and Herodians Entrap Jesus",
                year = "1991",
                questionText = "The Pharisees and Herodians asked Jesus whether they should pay tax to Caesar because they wanted to:",
                optionA = "entrap him in his talk",
                optionB = "praise his teaching",
                optionC = "help him pay taxes",
                optionD = "evade paying taxes.",
                correctAnswerIndex = 0,
                explanation = "The conspirators designed a controversial, trap question to force Jesus to either alienate the Jewish masses (by saying yes) or be arrested for treason against Rome (by saying no) (Matthew 22:15).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q35
        list.add(
            QuestionEntity(
                id = "crk_1991_35",
                subject = "CRS",
                topic = "First Passion Prediction Timing",
                year = "1991",
                questionText = "Jesus first began to teach His disciples about His impending suffering, rejection, and crucifixion immediately after:",
                optionA = "the Transfiguration",
                optionB = "the healing of blind Bartimaeus",
                optionC = "Peter’s Confession of faith",
                optionD = "the Gethsemane agony.",
                correctAnswerIndex = 2,
                explanation = "Once the disciples fully understood and confessed His identity as the Christ, Jesus immediately initiated teaching them about the necessity of His suffering and death (Mark 8:31).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q36
        list.add(
            QuestionEntity(
                id = "crk_1991_36",
                subject = "CRS",
                topic = "Ransom for Many",
                year = "1991",
                questionText = "“For the Son of Man came not to be served but to serve, and to give his life as a ransom for many.” This statement was made by Jesus:",
                optionA = "after healing two blind men near Jericho",
                optionB = "immediately before he told the parable of the householder",
                optionC = "during the discussion that followed the request of the sons of Zebedee",
                optionD = "as he was foretelling his crucifixion to the crowds.",
                correctAnswerIndex = 2,
                explanation = "Jesus delivered this core teaching on humility to rebuke the anger of the ten disciples over James and John's ambitious request for power (Mark 10:45).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q37
        list.add(
            QuestionEntity(
                id = "crk_1991_37",
                subject = "CRS",
                topic = "Jesus before Herod Antipas",
                year = "1991",
                questionText = "King Herod was very glad to see Jesus during His trial before Him because:",
                optionA = "John the Baptist had spoken to him about Jesus",
                optionB = "he believed that Jesus was the Messiah",
                optionC = "he hoped to see Jesus perform some miracle",
                optionD = "he wanted to release Him immediately.",
                correctAnswerIndex = 2,
                explanation = "Herod Antipas had heard many reports about Jesus' power and had been wanting to see Him for a long time, hoping to witness some supernatural sign (Luke 23:8).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q38
        list.add(
            QuestionEntity(
                id = "crk_1991_38",
                subject = "CRS",
                topic = "Triumphal Entry Acclamation",
                year = "1991",
                questionText = "“Blessed is the King who comes in the name of the Lord! Peace in heaven and glory in the highest!” This verse is connected with:",
                optionA = "the birth of Jesus.",
                optionB = "Jesus’ triumphant entry into Jerusalem",
                optionC = "the resurrection of Jesus Christ",
                optionD = "the Last Supper.",
                correctAnswerIndex = 1,
                explanation = "The crowds of disciples shouted these words of praise as Jesus rode the colt down the Mount of Olives during His triumphal entry into Jerusalem (Luke 19:38).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q39
        list.add(
            QuestionEntity(
                id = "crk_1991_39",
                subject = "CRS",
                topic = "Witnesses of Jesus' Burial in Mark",
                year = "1991",
                questionText = "According to Mark’s Gospel, the people who saw where Jesus was laid in the tomb were Mary Magdalene and:",
                optionA = "Mary the mother of Jesus",
                optionB = "Mary the mother of Joses (James)",
                optionC = "Joanna",
                optionD = "Salome",
                correctAnswerIndex = 1,
                explanation = "Mark 15:47 records that Mary Magdalene and Mary the mother of Joses witnessed exactly where Joseph of Arimathea laid Jesus' body.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q40
        list.add(
            QuestionEntity(
                id = "crk_1991_40",
                subject = "CRS",
                topic = "Resurrection Message to Peter",
                year = "1991",
                questionText = "The message of the angel at the empty tomb was to be relayed to the disciples and specifically to:",
                optionA = "the Jews",
                optionB = "the Sadducees",
                optionC = "Thomas",
                optionD = "Peter.",
                correctAnswerIndex = 3,
                explanation = "In Mark 16:7, the angel gave the women specific instructions to tell 'his disciples and Peter' that Jesus was going ahead of them to Galilee, providing special grace to Peter.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q41
        list.add(
            QuestionEntity(
                id = "crk_1991_41",
                subject = "CRS",
                topic = "Healing of Lame Man at Beautiful Gate",
                year = "1991",
                questionText = "“I have no silver and gold, but I give you what I have; in the name of Jesus Christ of Nazareth, walk.” This was said by Peter to a lame man at:",
                optionA = "the pool of Bethesda",
                optionB = "the Jordan River",
                optionC = "the gate of the temple called Beautiful",
                optionD = "the pool of Siloam.",
                correctAnswerIndex = 2,
                explanation = "Peter and John met this lifelong lame beggar at the Beautiful Gate of the temple, performing this historic healing miracle to launch a sermon to the crowds (Acts 3:6).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q42
        list.add(
            QuestionEntity(
                id = "crk_1991_42",
                subject = "CRS",
                topic = "Immediate Trigger of Stephen's Stoning",
                year = "1991",
                questionText = "The immediate cause of the stoning and martyrdom of Stephen was his:",
                optionA = "condemnation of the Jews' historic disobedience",
                optionB = "declaration of Jesus as the Righteous One",
                optionC = "condemnation of the Jewish rite of circumcision",
                optionD = "claiming to see Jesus standing at the right hand of God.",
                correctAnswerIndex = 3,
                explanation = "When Stephen cried out, 'Behold, I see the heavens opened, and the Son of Man standing at the right hand of God,' the outraged Sanhedrin lost control, dragged him out, and stoned him (Acts 7:55-58).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q43
        list.add(
            QuestionEntity(
                id = "crk_1991_43",
                subject = "CRS",
                topic = "Riot in Ephesus: Alexander",
                year = "1991",
                questionText = "“But when they recognized that he was a Jew, for about two hours they all with one voice cried out, “Great is Artemis of the Ephesians!” Who was the Jew alluded to here?",
                optionA = "Paul",
                optionB = "Alexander",
                optionC = "Gaius",
                optionD = "Aristarchus.",
                correctAnswerIndex = 1,
                explanation = "During the Ephesian riot, Alexander was pushed to the front by the Jews to make a defense, but the crowd drowned him out once they recognized his Jewish identity (Acts 19:33-34).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q44
        list.add(
            QuestionEntity(
                id = "crk_1991_44",
                subject = "CRS",
                topic = "First Missionary Journey Commission at Antioch",
                year = "1991",
                questionText = "Saul and Barnabas were formally set apart and sent on their first missionary journey by:",
                optionA = "the church at Antioch under the guidance of the Holy Spirit",
                optionB = "the Apostles in Jerusalem",
                optionC = "the elders in Joppa",
                optionD = "the church at Corinth",
                correctAnswerIndex = 0,
                explanation = "Acts 13:1-3 records that while prophets and teachers in Antioch were worshiping and fasting, the Holy Spirit commanded them to set apart Barnabas and Saul for the work.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q45
        list.add(
            QuestionEntity(
                id = "crk_1991_45",
                subject = "CRS",
                topic = "Jerusalem Delegation: Silas Remains in Antioch",
                year = "1991",
                questionText = "The Jerusalem Council sent a delegation of four with a letter to Antioch. At the conclusion of their mission, which of the following remained behind in Antioch?",
                optionA = "Judas and Silas",
                optionB = "Silas and Paul",
                optionC = "Paul and Barnabas",
                optionD = "Barnabas and Judas",
                correctAnswerIndex = 1,
                explanation = "While Judas returned to Jerusalem, Silas chose to remain behind in Antioch, which eventually led to him being selected by Paul for his second missionary journey (Acts 15:34-40).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q46
        list.add(
            QuestionEntity(
                id = "crk_1991_46",
                subject = "CRS",
                topic = "Paul's Roman Citizenship in Philippi",
                year = "1991",
                questionText = "“They have beaten us publicly, uncondemned, men who are Roman citizens, and have thrown us into prison; and do they now cast us out secretly?...” This experience of Paul was in:",
                optionA = "Athens",
                optionB = "Jerusalem",
                optionC = "Philippi",
                optionD = "Caesarea.",
                correctAnswerIndex = 2,
                explanation = "In Acts 16:37, Paul refused to leave the prison quietly, demanding that the Philippian magistrates come personally to escort them out to answer for violating their rights as Roman citizens.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q47
        list.add(
            QuestionEntity(
                id = "crk_1991_47",
                subject = "CRS",
                topic = "Paul's Temple Vow Payment",
                year = "1991",
                questionText = "Paul purified himself in the Temple after his third missionary journey because he wanted to show that he was:",
                optionA = "clean from Gentile contact",
                optionB = "keeping the Law of Moses and respecting Jewish customs",
                optionC = "afraid of the high priest's guards",
                optionD = "keeping the Sabbath.",
                correctAnswerIndex = 1,
                explanation = "Paul agreed to pay the expenses of four men under vows to demonstrate to the Jewish believers that he did not teach Jews to abandon the Law of Moses (Acts 21:24).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q48
        list.add(
            QuestionEntity(
                id = "crk_1991_48",
                subject = "CRS",
                topic = "Paul Divides Pharisees and Sadducees",
                year = "1991",
                questionText = "During Paul’s trial by the Sanhedrin, he brought a division between the Pharisees and Sadducees by raising the controversial issue of:",
                optionA = "the Resurrection of the dead",
                optionB = "faith in God through Jesus",
                optionC = "the miracles of God",
                optionD = "the final judgment",
                correctAnswerIndex = 0,
                explanation = "Paul declared, 'I am a Pharisee, a son of Pharisees; with respect to the hope and resurrection of the dead I am on trial,' pitting the Pharisees against the skeptical Sadducees (Acts 23:6).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q49
        list.add(
            QuestionEntity(
                id = "crk_1991_49",
                subject = "CRS",
                topic = "Healing Publius' Father on Malta",
                year = "1991",
                questionText = "On the Island of Malta, Paul performed a healing miracle on Publius' father, who was sick with:",
                optionA = "born blindness",
                optionB = "leprosy",
                optionC = "paralysis",
                optionD = "fever and dysentery.",
                correctAnswerIndex = 3,
                explanation = "Acts 28:8 records that the father of Publius (the chief official of Malta) lay sick with fever and dysentery, and Paul laid hands on him and healed him.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // 1991 Q50
        list.add(
            QuestionEntity(
                id = "crk_1991_50",
                subject = "CRS",
                topic = "Shaking Clothes at Corinth",
                year = "1991",
                questionText = "“Your blood is upon your heads! I am innocent. From now on I will go to the Gentiles.” This historic statement was made by Paul in:",
                optionA = "Rome",
                optionB = "Corinth",
                optionC = "Ephesus",
                optionD = "Athens.",
                correctAnswerIndex = 1,
                explanation = "In Acts 18:6, when the Jews in Corinth opposed and reviled him, Paul shook out his garments and declared his shift to the Gentile mission.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1991"
            )
        )

        // ==========================================
        // 1992 JAMB CRK / CRS PAST EXAMINATION (50 QUESTIONS)
        // ==========================================

        // 1992 Q1
        list.add(
            QuestionEntity(
                id = "crk_1992_01",
                subject = "CRS",
                topic = "Creation Account: Day One",
                year = "1992",
                questionText = "What was upon the face of the deep on the first day of creation?",
                optionA = "Light",
                optionB = "Cloud",
                optionC = "Water",
                optionD = "Darkness",
                correctAnswerIndex = 3,
                explanation = "According to Genesis 1:2, in the very beginning of creation, deep darkness covered the face of the formless, watery deep.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q2
        list.add(
            QuestionEntity(
                id = "crk_1992_02",
                subject = "CRS",
                topic = "Creation Account: Day Four",
                year = "1992",
                questionText = "“Let there be lights in the firmament of the heavens to separate the day from the night…” This statement was made by God on the:",
                optionA = "third day",
                optionB = "fourth day",
                optionC = "fifth day",
                optionD = "sixth day",
                correctAnswerIndex = 1,
                explanation = "In Genesis 1:14-19, on the fourth day, God created the sun, moon, and stars to rule the day and night and to serve as signs for seasons.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q3
        list.add(
            QuestionEntity(
                id = "crk_1992_03",
                subject = "CRS",
                topic = "The Lesson of the Fall of Man",
                year = "1992",
                questionText = "The story of the Fall of man in Genesis 3 primarily teaches that:",
                optionA = "man was made in the image of God",
                optionB = "it is a sin to disobey God's commands",
                optionC = "Adam was less guilty than Eve",
                optionD = "God created man naked.",
                correctAnswerIndex = 1,
                explanation = "The narrative of the Fall illustrates the entry of sin and suffering into the world as a direct consequence of disobeying God's explicit boundary.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q4
        list.add(
            QuestionEntity(
                id = "crk_1992_04",
                subject = "CRS",
                topic = "The Great Flood Rain Burst",
                year = "1992",
                questionText = "‘On that day all the fountains of the great deep burst forth and the windows of the heavens were opened.’ The immediate result of this was:",
                optionA = "a great earthquake",
                optionB = "a massive, destructive flood rainfall",
                optionC = "a consuming fire",
                optionD = "a violent windstorm.",
                correctAnswerIndex = 1,
                explanation = "This describes the initiation of the great global deluge of Noah in Genesis 7:11, where waters burst from the earth and poured from the sky.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q5
        list.add(
            QuestionEntity(
                id = "crk_1992_05",
                subject = "CRS",
                topic = "Sarah Rejoices at Isaac's Birth",
                year = "1992",
                questionText = "“Who would have said to Abraham that Sarah would suckle children?…” This statement was made by:",
                optionA = "Ishmael",
                optionB = "Sarah",
                optionC = "God",
                optionD = "Hagar",
                correctAnswerIndex = 1,
                explanation = "Sarah rejoiced with these words of wonder and laughter in Genesis 21:7 upon the birth of her son Isaac in her old age.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q6
        list.add(
            QuestionEntity(
                id = "crk_1992_06",
                subject = "CRS",
                topic = "Hagar's Grief in Beersheba",
                year = "1992",
                questionText = "The quotation, “Let me not look upon the death of the child” comes from the story about:",
                optionA = "Solomon and the two harlots",
                optionB = "the expulsion of Hagar and Ishmael",
                optionC = "Moses when he was placed on the banks of the Nile",
                optionD = "Bathsheba and David’s illegitimate child.",
                correctAnswerIndex = 1,
                explanation = "In Genesis 21:16, after running out of water in the wilderness of Beersheba, Hagar cast Ishmael under a bush and sat some distance away, unable to watch her son die.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q7
        list.add(
            QuestionEntity(
                id = "crk_1992_07",
                subject = "CRS",
                topic = "Fulfillment of Joseph's Dreams",
                year = "1992",
                questionText = "Joseph’s dream about his future leadership over his brothers was physically fulfilled when he became:",
                optionA = "a wealthy livestock breeder",
                optionB = "a leading Egyptian priest",
                optionC = "an influential palace steward",
                optionD = "the governor and second in command of Egypt",
                correctAnswerIndex = 3,
                explanation = "His childhood dreams of sheaves and stars bowing to him were fulfilled when his brothers came to Egypt and bowed to him as the grand vizier to buy grain (Genesis 42).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q8
        list.add(
            QuestionEntity(
                id = "crk_1992_08",
                subject = "CRS",
                topic = "Israelites Groan under Bondage",
                year = "1992",
                questionText = "The children of Israel cried out to God for help in Egypt because:",
                optionA = "their male children were killed",
                optionB = "they were hungry and overworked",
                optionC = "they were in heavy bondage and slavery",
                optionD = "Moses failed to look after them.",
                correctAnswerIndex = 2,
                explanation = "Exodus 2:23 records that the Israelites groaned under their heavy, bitter slavery and cried out for relief, and their cry rose up to God.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q9
        list.add(
            QuestionEntity(
                id = "crk_1992_09",
                subject = "CRS",
                topic = "Pharaoh Regrets Releasing Israel",
                year = "1992",
                questionText = "“What is this we have done, that we have let Israel go from serving us?” This regret was expressed by:",
                optionA = "the Egyptian soldiers",
                optionB = "the Egyptian magicians",
                optionC = "the Canaanites in the desert",
                optionD = "Pharaoh and his servants.",
                correctAnswerIndex = 3,
                explanation = "In Exodus 14:5, once the Hebrews departed, Pharaoh and his officials had a sudden change of heart, realizing they had lost a massive, free labor force.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q10
        list.add(
            QuestionEntity(
                id = "crk_1992_10",
                subject = "CRS",
                topic = "Hoarded Manna Breeds Worms",
                year = "1992",
                questionText = "The manna which the Israelites greedily left overnight until the morning in direct disobedience to God:",
                optionA = "bred worms and changed colour",
                optionB = "melted and bred worms",
                optionC = "bred worms and became foul",
                optionD = "melted and became foul.",
                correctAnswerIndex = 2,
                explanation = "In Exodus 16:20, those who hoarded the daily bread discovered that it bred worms and turned foul by morning, teaching them complete daily dependence.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q11
        list.add(
            QuestionEntity(
                id = "crk_1992_11",
                subject = "CRS",
                topic = "Basis of the Ten Commandments",
                year = "1992",
                questionText = "God gave the Ten Commandments to the people of Israel because He:",
                optionA = "is a jealous God",
                optionB = "wanted their days to be long",
                optionC = "had redeemed them from slavery in Egypt",
                optionD = "frowned at those who took His Name in vain.",
                correctAnswerIndex = 2,
                explanation = "The Decalogue was delivered on the basis of God's redemptive grace, introduced in Exodus 20:2 with: 'I am the Lord your God, who brought you out of Egypt, out of the land of slavery'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q12
        list.add(
            QuestionEntity(
                id = "crk_1992_12",
                subject = "CRS",
                topic = "Joshua's Covenant Renewal at Shechem",
                year = "1992",
                questionText = "“...Choose this day whom you will serve… as for me and my house, we will serve the LORD.” The Israelites responded:",
                optionA = "“We will serve other gods as well”",
                optionB = "“Far be it from us that we should forsake the LORD to serve other gods”",
                optionC = "“We will obey only if Joshua remains with us”",
                optionD = "“We cannot put away the foreign gods among us.”",
                correctAnswerIndex = 1,
                explanation = "In Joshua 24:16, the assembled tribes vehemently rejected apostasy, pledging to worship Yahweh alone because of His massive saving miracles during the Exodus.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q13
        list.add(
            QuestionEntity(
                id = "crk_1992_13",
                subject = "CRS",
                topic = "Eli's Failure to Restrain Sons",
                year = "1992",
                questionText = "God’s severe anger was kindled against Eli and his children because Eli did not:",
                optionA = "train his children in the way of the LORD",
                optionB = "warn his children against sin",
                optionC = "apply appropriate sanctions and discipline on his children when due",
                optionD = "know the gravity of their actions.",
                correctAnswerIndex = 2,
                explanation = "While Eli verbally warned his sons, he failed to exercise his parental and high priestly authority to actively restrain or depose them from their corrupt duties (1 Samuel 3:13).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q14
        list.add(
            QuestionEntity(
                id = "crk_1992_14",
                subject = "CRS",
                topic = "Ecstatic Prophets at Gibeath-elohim",
                year = "1992",
                questionText = "The prophets whom Saul met at Gibeath-elohim, serving as a confirmation of his royal anointing, were:",
                optionA = "false prophets",
                optionB = "ecstatic prophets",
                optionC = "court prophets",
                optionD = "classical prophets",
                correctAnswerIndex = 1,
                explanation = "Saul met a band of ecstatic prophets descending from a high place with musical instruments, and he was filled with the Spirit and prophesied with them (1 Samuel 10).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q15
        list.add(
            QuestionEntity(
                id = "crk_1992_15",
                subject = "CRS",
                topic = "Anointing of David: The Spirit Rushes",
                year = "1992",
                questionText = "While David was being anointed king by Samuel in Bethlehem, he immediately received:",
                optionA = "a protest from Saul",
                optionB = "the promise of eternal reign",
                optionC = "a gift from Samuel",
                optionD = "the Spirit of the LORD.",
                correctAnswerIndex = 3,
                explanation = "1 Samuel 16:13 records that when Samuel poured the oil on David, the Spirit of the Lord rushed mightily upon David from that day forward.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q16
        list.add(
            QuestionEntity(
                id = "crk_1992_16",
                subject = "CRS",
                topic = "David, Bathsheba, and Ammonite War",
                year = "1992",
                questionText = "Against which foreign nation were the Israelites fighting when King David committed adultery with Bathsheba?",
                optionA = "The Amorites",
                optionB = "The Ammonites",
                optionC = "The Hittites",
                optionD = "The Syrians",
                correctAnswerIndex = 1,
                explanation = "In 2 Samuel 11:1, David sent Joab and the army of Israel to besiege Rabbah of the Ammonites, while he remained behind in Jerusalem.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q17
        list.add(
            QuestionEntity(
                id = "crk_1992_17",
                subject = "CRS",
                topic = "Psalm 51: A Broken and Contrite Spirit",
                year = "1992",
                questionText = "According to Psalm 51, the ultimate sacrifice acceptable and pleasing to God is:",
                optionA = "a clean heart",
                optionB = "total obedience",
                optionC = "a lamb without blemish",
                optionD = "a broken and contrite spirit",
                correctAnswerIndex = 3,
                explanation = "David wrote in Psalm 51:17 that the sacrifices of God are a broken spirit; a broken and contrite heart God will not despise.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q18
        list.add(
            QuestionEntity(
                id = "crk_1992_18",
                subject = "CRS",
                topic = "Solomon's Era of Peace for Temple Building",
                year = "1992",
                questionText = "Solomon could devote his complete attention and resources to the building of the house of the LORD because:",
                optionA = "of the supplies from the Queen of Sheba",
                optionB = "of Hiram’s co-operation",
                optionC = "there was neither adversary nor misfortune",
                optionD = "of David’s purchase of the site.",
                correctAnswerIndex = 2,
                explanation = "In 1 Kings 5:4, Solomon announced to Hiram that God had granted him complete rest on every side, with no military adversaries or domestic disasters to distract him.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q19
        list.add(
            QuestionEntity(
                id = "crk_1992_19",
                subject = "CRS",
                topic = "Rehoboam Rejects Elders' Advice",
                year = "1992",
                questionText = "The immediate cause of the division of David’s kingdom under Rehoboam was:",
                optionA = "Rehoboam’s foolish rejection of the elders' counsel",
                optionB = "Solomon’s bad government",
                optionC = "Prophet Ahijah’s instigation",
                optionD = "Jeroboam’s personal rebellion.",
                correctAnswerIndex = 0,
                explanation = "Rehoboam's foolish decision to follow his young companions' arrogant advice instead of the elders' moderate counsel drove the northern tribes to secede (1 Kings 12).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q20
        list.add(
            QuestionEntity(
                id = "crk_1992_20",
                subject = "CRS",
                topic = "Brook Cherith Dries Up",
                year = "1992",
                questionText = "“Arise, go to Zarephath, which belongs to Sidon, and dwell there. Behold, I have commanded a widow there to feed you.” What exactly necessitated this event?",
                optionA = "The drying up of the brook Cherith during the drought",
                optionB = "Ahab’s search for Elijah to execute him",
                optionC = "Jezebel's massacre of the prophets of God",
                optionD = "Elijah’s flight from Samaria.",
                correctAnswerIndex = 0,
                explanation = "After feeding Elijah via ravens, the brook Cherith dried up because there was no rain in the land, prompting God to send him to Zarephath (1 Kings 17:7-9).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q21
        list.add(
            QuestionEntity(
                id = "crk_1992_21",
                subject = "CRS",
                topic = "The Benedictus: Zechariah's Hymn",
                year = "1992",
                questionText = "“Blessed be the Lord God of Israel, for he has visited and redeemed his people...” is a hymn of praise by:",
                optionA = "the Virgin Mary at the Annunciation",
                optionB = "Zechariah at the birth of John the Baptist",
                optionC = "Simeon at the presentation of Jesus in the Temple",
                optionD = "the angels at the birth of Jesus.",
                correctAnswerIndex = 1,
                explanation = "Zechariah sang this prophetic song of praise (the Benedictus) in Luke 1:68 immediately after his tongue was loosened upon naming his newborn son John.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q22
        list.add(
            QuestionEntity(
                id = "crk_1992_22",
                subject = "CRS",
                topic = "Flight to Egypt Dream",
                year = "1992",
                questionText = "According to Matthew's Gospel, the angel of the Lord appeared to Joseph in a dream three times. In the second appearance, he instructed Joseph to:",
                optionA = "accept that Mary was carrying the Messiah",
                optionB = "name the baby Jesus",
                optionC = "flee into exile to Egypt",
                optionD = "return from Egypt.",
                correctAnswerIndex = 2,
                explanation = "In Matthew 2:13, following the departure of the Wise Men, the angel warned Joseph to take Mary and the child and flee to Egypt immediately to escape Herod's search.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q23
        list.add(
            QuestionEntity(
                id = "crk_1992_23",
                subject = "CRS",
                topic = "The Nunc Dimittis of Simeon",
                year = "1992",
                questionText = "“Lord, now lettest thou thy servant depart in peace, according to thy word; for mine eyes have seen thy salvation…” This was said by:",
                optionA = "Anna the prophetess",
                optionB = "the high priest",
                optionC = "Simeon",
                optionD = "Zechariah",
                correctAnswerIndex = 2,
                explanation = "The righteous Simeon uttered this prayer (the Nunc Dimittis) in Luke 2:29 when holding the infant Jesus during His presentation in the temple, realizing he had seen the Savior.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q24
        list.add(
            QuestionEntity(
                id = "crk_1992_24",
                subject = "CRS",
                topic = "Brood of Vipers: John the Baptist",
                year = "1992",
                questionText = "“You brood of vipers! Who warned you to flee from the wrath to come?” This stern warning was addressed by John the Baptist to the:",
                optionA = "Pharisees and the Sadducees",
                optionB = "Pharisees and the Scribes",
                optionC = "Sadducees and the Lawyers",
                optionD = "Zealots and the Herodians",
                correctAnswerIndex = 0,
                explanation = "Matthew 3:7 records John the Baptist delivering this harsh rebuke when he saw many of the Pharisees and Sadducees coming to his baptism.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q25
        list.add(
            QuestionEntity(
                id = "crk_1992_25",
                subject = "CRS",
                topic = "Order of Temptation in Luke",
                year = "1992",
                questionText = "The second temptation of Jesus according to Luke’s account of the gospel was:",
                optionA = "offering Him all the kingdoms of the world in exchange for worship",
                optionB = "a command to turn stones into bread",
                optionC = "jumping down from the pinnacle of the temple",
                optionD = "denying His divine sonship.",
                correctAnswerIndex = 0,
                explanation = "Unlike Matthew's order, Luke's account (Luke 4:5-8) places the temptation of worshiping the devil in exchange for the world's kingdoms as the second temptation.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q26
        list.add(
            QuestionEntity(
                id = "crk_1992_26",
                subject = "CRS",
                topic = "Servanthood as Requirement for Leadership",
                year = "1992",
                questionText = "What did Christ state should be the primary qualification of whoever was to be first or great among the apostles?",
                optionA = "Being baptized with Christ’s baptism",
                optionB = "Being a servant and slave of all",
                optionC = "Giving one's wealth to the treasury",
                optionD = "Being the oldest of the twelve.",
                correctAnswerIndex = 1,
                explanation = "In Mark 10:44, Jesus corrected His ambitious disciples by declaring that whoever wants to be first among them must be slave of all.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q27
        list.add(
            QuestionEntity(
                id = "crk_1992_27",
                subject = "CRS",
                topic = "Hand to the Plough and Total Commitment",
                year = "1992",
                questionText = "Jesus taught that a would-be disciple who puts his hand to the plough and looks back lacks:",
                optionA = "faith",
                optionB = "kindness",
                optionC = "repentance",
                optionD = "total commitment.",
                correctAnswerIndex = 3,
                explanation = "In Luke 9:62, Jesus declared that anyone who is distracted or divided in his loyalty after choosing to follow Him is not fit for the Kingdom of God.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q28
        list.add(
            QuestionEntity(
                id = "crk_1992_28",
                subject = "CRS",
                topic = "Walking on the Sea: Mistaken for Ghost",
                year = "1992",
                questionText = "In which miracle story was Jesus mistaken for a ghost by His terrified disciples?",
                optionA = "The feeding of the five thousand",
                optionB = "Calming of the storm and sea",
                optionC = "Healing the demoniac",
                optionD = "Walking on the sea.",
                correctAnswerIndex = 3,
                explanation = "In Mark 6:49, when the disciples saw Jesus walking on the water in the middle of the night, they panicked and cried out, thinking He was a ghost.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q29
        list.add(
            QuestionEntity(
                id = "crk_1992_29",
                subject = "CRS",
                topic = "Healing of the Paralytic: Authority to Forgive",
                year = "1992",
                questionText = "According to Luke, the miracle of the healing of the paralytic was intended primarily to show that:",
                optionA = "God alone can forgive sins",
                optionB = "the Son of Man has authority on earth to forgive sins",
                optionC = "the Holy Spirit makes intercession for sinners",
                optionD = "faith and prayer are required for healing.",
                correctAnswerIndex = 1,
                explanation = "Jesus told the paralyzed man to pick up his bed and walk specifically to demonstrate to the skeptical scribes that He possessed divine authority to forgive sins (Luke 5:24).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q30
        list.add(
            QuestionEntity(
                id = "crk_1992_30",
                subject = "CRS",
                topic = "Gerasene Demoniac Acknowledges Jesus' Authority",
                year = "1992",
                questionText = "“...I adjure you by God, do not torment me, …” What is the significance of this statement by the Gerasene demoniac?",
                optionA = "The demons wanted to make a treaty with Jesus.",
                optionB = "The demons wanted to accuse Jesus of injustice.",
                optionC = "It represents a clear recognition of Jesus' supreme divine authority.",
                optionD = "The demon was more powerful than Jesus.",
                correctAnswerIndex = 2,
                explanation = "Even while possessing the man, the demonic forces immediately recognized Jesus' superior identity as the 'Son of the Most High God' and submitted to His judgment (Mark 5:7).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q31
        list.add(
            QuestionEntity(
                id = "crk_1992_31",
                subject = "CRS",
                topic = "Blind Bartimaeus' Persistent Faith",
                year = "1992",
                questionText = "According to the story of blind Bartimaeus near Jericho, his persistent calling out to Jesus shows that:",
                optionA = "prayer is very basic to healing",
                optionB = "there is need to persistently shout for attention",
                optionC = "Jesus is the Son of David",
                optionD = "faith and recognition of Jesus' identity are pre-requisites to healing.",
                correctAnswerIndex = 3,
                explanation = "Bartimaeus demonstrated profound, persistent faith and recognized Jesus' messianic title ('Son of David'), which Jesus credited as the source of his healing (Mark 10:52).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q32
        list.add(
            QuestionEntity(
                id = "crk_1992_32",
                subject = "CRS",
                topic = "Parable of the Prodigal Son Core Meaning",
                year = "1992",
                questionText = "The parable of the Prodigal Son emphasizes that:",
                optionA = "it is not good for brothers to quarrel",
                optionB = "repentance, grace, and reconciliation are highly important",
                optionC = "the father loves the younger son more than the older",
                optionD = "the older brother was justified in his anger.",
                correctAnswerIndex = 1,
                explanation = "The focal point of Luke 15:11-32 is the younger son's humble repentance and the father's abundant, gracious joy in reconciling with him, reflecting God's love for sinners.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q33
        list.add(
            QuestionEntity(
                id = "crk_1992_33",
                subject = "CRS",
                topic = "Doing the Will of God in Matthew",
                year = "1992",
                questionText = "According to Matthew’s Gospel, the most important divine requirement for entering the kingdom of heaven is:",
                optionA = "preaching the gospel",
                optionB = "doing the will of God",
                optionC = "practicing charity",
                optionD = "performing miracles.",
                correctAnswerIndex = 1,
                explanation = "Jesus emphasized in Matthew 7:21 that verbal profession ('Lord, Lord') or spectacular deeds are meaningless unless backed by active obedience to God's will.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q34
        list.add(
            QuestionEntity(
                id = "crk_1992_34",
                subject = "CRS",
                topic = "Return of the Seventy Disciples",
                year = "1992",
                questionText = "After completing their missionary journey, the seventy disciples returned and joyfully reported to Jesus that:",
                optionA = "many people repented",
                optionB = "they enjoyed the hospitality of the towns",
                optionC = "they were highly respected by rulers",
                optionD = "even the demons were subject to them in His name",
                correctAnswerIndex = 3,
                explanation = "In Luke 10:17, the seventy returned with excitement, marveling that even the powerful demonic spirits submitted to their commands when they invoked Jesus' name.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q35
        list.add(
            QuestionEntity(
                id = "crk_1992_35",
                subject = "CRS",
                topic = "The Law and the Prophets at Transfiguration",
                year = "1992",
                questionText = "The physical appearance of Moses and Elijah at the transfiguration underscores the importance in Jesus' ministry of:",
                optionA = "prophets and apostles",
                optionB = "the law and the prophets",
                optionC = "the Spirit and the word",
                optionD = "judges and kings",
                correctAnswerIndex = 1,
                explanation = "The presence of Moses (the lawgiver) and Elijah (the representative of the prophets) signifies that Jesus' ministry is the culmination and fulfillment of all Old Testament scriptures.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q36
        list.add(
            QuestionEntity(
                id = "crk_1992_36",
                subject = "CRS",
                topic = "Voice from the Cloud: Listen to Him",
                year = "1992",
                questionText = "“This is my beloved Son; listen to him.” This command was delivered by God on the occasion of Jesus’:",
                optionA = "baptism",
                optionB = "temptation",
                optionC = "transfiguration",
                optionD = "resurrection",
                correctAnswerIndex = 2,
                explanation = "During the Transfiguration on the mount, God spoke from a bright cloud to Peter, James, and John, emphasizing Jesus' superior authority over Moses and Elijah (Mark 9:7).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q37
        list.add(
            QuestionEntity(
                id = "crk_1992_37",
                subject = "CRS",
                topic = "Cleansing of the Temple",
                year = "1992",
                questionText = "“...My house shall be a house of prayer; but you have made it a den of robbers.” Just before making this statement, Jesus:",
                optionA = "locked up the temple gates",
                optionB = "taught the elders in the temple",
                optionC = "drove out those who bought and sold in the temple",
                optionD = "walked out of the temple in protest.",
                correctAnswerIndex = 2,
                explanation = "During the cleansing of the temple (Mark 11:15-17), Jesus overturned the tables of the money-changers and drove out merchants to preserve the sanctity of God's house.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q38
        list.add(
            QuestionEntity(
                id = "crk_1992_38",
                subject = "CRS",
                topic = "High Priest Caiaphas Questions Jesus",
                year = "1992",
                questionText = "Which of the following questions did the high priest Caiaphas ask Jesus during His trial before the Sanhedrin?",
                optionA = "‘Are you the Christ, the son of the Blessed?’",
                optionB = "‘Are you greater than Solomon?’",
                optionC = "‘Are you the King of the Jews?’",
                optionD = "‘Are you the Son of David?’",
                correctAnswerIndex = 0,
                explanation = "In Mark 14:61, the high priest demanded a direct statement, asking Jesus if He was the Messiah, the Son of God, to which Jesus replied, 'I am'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q39
        list.add(
            QuestionEntity(
                id = "crk_1992_39",
                subject = "CRS",
                topic = "Daughters of Jerusalem on the Via Dolorosa",
                year = "1992",
                questionText = "“...Do not weep for me, but weep for yourselves and for your children…” These words were addressed by Jesus to the:",
                optionA = "daughters of Jerusalem",
                optionB = "Pharisees and Sadducees",
                optionC = "mourning disciples",
                optionD = "female followers of Galilee.",
                correctAnswerIndex = 0,
                explanation = "While carrying His cross to Calvary, Jesus turned to the weeping women of Jerusalem and warned them of the impending, terrible siege and destruction of their city (Luke 23:28).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q40
        list.add(
            QuestionEntity(
                id = "crk_1992_40",
                subject = "CRS",
                topic = "First Word on the Cross in Luke",
                year = "1992",
                questionText = "What was the very first statement uttered by Jesus on the cross according to Luke’s Gospel?",
                optionA = "‘It is finished.’",
                optionB = "‘Today you shall be with me in paradise.’",
                optionC = "‘Father, forgive them; for they know not what they do.’",
                optionD = "‘My God, my God, why hast thou forsaken me?’",
                correctAnswerIndex = 2,
                explanation = "In Luke 23:34, as He was being nailed to the cross, Jesus offered this prayer of grace and forgiveness for His executioners and the soldiers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q41
        list.add(
            QuestionEntity(
                id = "crk_1992_41",
                subject = "CRS",
                topic = "Women Go to Anoint the Body with Spices",
                year = "1992",
                questionText = "Very early in the morning, on the first day of the week, the three women went to the tomb of Jesus to:",
                optionA = "see whether He had risen",
                optionB = "decorate the tomb",
                optionC = "anoint the body of Jesus with spices",
                optionD = "verify if the guards had left.",
                correctAnswerIndex = 2,
                explanation = "Mark 16:1 records that when the Sabbath was over, Mary Magdalene, Mary the mother of James, and Salome bought sweet spices to go and anoint Jesus' body.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q42
        list.add(
            QuestionEntity(
                id = "crk_1992_42",
                subject = "CRS",
                topic = "Reaction to Peter's Pentecost Sermon",
                year = "1992",
                questionText = "“...Let all the house of Israel therefore know assuredly that God has made him both Lord and Christ, this Jesus whom you crucified.” As a reaction to this declaration, the Jews:",
                optionA = "decided to kill Peter and the apostles",
                optionB = "went back to their houses in anger",
                optionC = "were cut to the heart and asked what they should do",
                optionD = "ridiculed Peter and the apostles.",
                correctAnswerIndex = 2,
                explanation = "In Acts 2:37, after listening to Peter's powerful Pentecost sermon, the convicted crowd was deeply moved and asked, 'Brothers, what shall we do?'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q43
        list.add(
            QuestionEntity(
                id = "crk_1992_43",
                subject = "CRS",
                topic = "Death of Ananias",
                year = "1992",
                questionText = "“...You have not lied to men but to God.” The immediate effect of this statement of Peter on the liar Ananias was that he:",
                optionA = "became afraid and ran away",
                optionB = "became paralyzed",
                optionC = "fell down and died",
                optionD = "repented and was forgiven.",
                correctAnswerIndex = 2,
                explanation = "In Acts 5:5, immediately upon hearing Peter's severe words exposing his lie to the Holy Spirit, Ananias fell down dead, causing great fear to grip the church.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q44
        list.add(
            QuestionEntity(
                id = "crk_1992_44",
                subject = "CRS",
                topic = "Reason for Appointing Deacons",
                year = "1992",
                questionText = "The Apostles created a new administrative office (deacons) in the early church to address complaints of:",
                optionA = "injustice in food distribution to Hellenistic widows",
                optionB = "false teaching among Gentiles",
                optionC = "embezzlement of church funds",
                optionD = "division among the elders",
                correctAnswerIndex = 0,
                explanation = "Acts 6 records that when the Hellenistic Jews complained that their widows were overlooked in the daily food distribution, the Apostles ordained seven deacons to manage it.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q45
        list.add(
            QuestionEntity(
                id = "crk_1992_45",
                subject = "CRS",
                topic = "Saul's Revelation on Damascus Road",
                year = "1992",
                questionText = "Saul’s dramatic encounter with the Risen Christ on the road to Damascus convinced him that:",
                optionA = "he was a great sinner who needed baptism",
                optionB = "Jesus is truly alive and is the Son of God",
                optionC = "the faith of his fathers was completely wrong",
                optionD = "he should have traveled with a larger military escort.",
                correctAnswerIndex = 1,
                explanation = "The vision of Jesus speaking to him from heaven shattered Saul's belief that Jesus was dead, leading him to immediately preach in Damascus that Jesus is the Son of God (Acts 9:20).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q46
        list.add(
            QuestionEntity(
                id = "crk_1992_46",
                subject = "CRS",
                topic = "Jerusalem Disciples Fear Converted Saul",
                year = "1992",
                questionText = "When Saul escaped from Damascus to Jerusalem after his conversion, the disciples in Jerusalem:",
                optionA = "welcomed him warmly",
                optionB = "were afraid of him and doubted his conversion",
                optionC = "were indifferent towards him",
                optionD = "sent him away to Tarsus.",
                correctAnswerIndex = 1,
                explanation = "Acts 9:26 records that when Saul arrived in Jerusalem, he tried to join the disciples, but they were terrified of him, not believing he was a genuine disciple.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q47
        list.add(
            QuestionEntity(
                id = "crk_1992_47",
                subject = "CRS",
                topic = "Crippled Man Healed at Lystra",
                year = "1992",
                questionText = "Paul and Barnabas were mistakenly referred to as pagan 'gods' in Lystra because they:",
                optionA = "spoke in tongues with great power",
                optionB = "blinded Elymas the magician",
                optionC = "healed a man who had been crippled from birth",
                optionD = "escaped from prison.",
                correctAnswerIndex = 2,
                explanation = "When Paul commanded a lifelong lame man to stand up and he leaped and walked, the astonished crowd believed the gods had descended in human form (Acts 14:8-11).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q48
        list.add(
            QuestionEntity(
                id = "crk_1992_48",
                subject = "CRS",
                topic = "The Jerusalem Council Decree",
                year = "1992",
                questionText = "“...Abstain from what has been sacrificed to idols and from blood and from what is strangled and from unchastity.” This decision was communicated to Gentile converts by the:",
                optionA = "Antioch elders",
                optionB = "Rome church Council",
                optionC = "Jerusalem Apostolic Council",
                optionD = "Apostle Paul.",
                correctAnswerIndex = 2,
                explanation = "The Jerusalem Council (Acts 15:29) drafted this letter to reassure Gentile converts that they did not need to keep the entire ceremonial Mosaic Law, requiring only these four basic moral/purity boundaries.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q49
        list.add(
            QuestionEntity(
                id = "crk_1992_49",
                subject = "CRS",
                topic = "Paul Divides the Sanhedrin",
                year = "1992",
                questionText = "“... I am a Pharisee, a son of Pharisees; with respect to the hope and resurrection of the dead I am on trial.” This statement was made by Paul to divide:",
                optionA = "the Jerusalem crowd",
                optionB = "King Agrippa and Festus",
                optionC = "the Sanhedrin council members",
                optionD = "the Roman tribune's guards.",
                correctAnswerIndex = 2,
                explanation = "Paul saw that his judges were split between Pharisees (who believed in resurrection) and Sadducees (who rejected it), using this strategic statement to divide them and secure support (Acts 23:6).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // 1992 Q50
        list.add(
            QuestionEntity(
                id = "crk_1992_50",
                subject = "CRS",
                topic = "Paul Addresses Jewish Leaders in Rome",
                year = "1992",
                questionText = "Upon his arrival under guard in Rome, the very first group Paul summoned and addressed was:",
                optionA = "the household of Caesar",
                optionB = "the Roman church elders",
                optionC = "the Roman military officers",
                optionD = "the local leaders of the Jews.",
                correctAnswerIndex = 3,
                explanation = "Acts 28:17 records that after three days in Rome, Paul called together the local Jewish leaders to explain his innocence and present Jesus as the Hope of Israel.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1992"
            )
        )

        // ==========================================
        // 1993 JAMB CRK / CRS PAST EXAMINATION (6 QUESTIONS)
        // ==========================================

        // 1993 Q1
        list.add(
            QuestionEntity(
                id = "crk_1993_01",
                subject = "CRS",
                topic = "Creation: Dominion Mandate",
                year = "1993",
                questionText = "According to the creation account of Genesis 1, God charged man to:",
                optionA = "rest on the Sabbath day",
                optionB = "worship Him",
                optionC = "have dominion over all the earth",
                optionD = "obey all His commandments.",
                correctAnswerIndex = 2,
                explanation = "In Genesis 1:28, God blessed Adam and Eve and gave them the cultural mandate to be fruitful, multiply, and have dominion over all living creatures and the earth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1993"
            )
        )

        // 1993 Q2
        list.add(
            QuestionEntity(
                id = "crk_1993_02",
                subject = "CRS",
                topic = "Sanctity of Human Life and Murder Prohibition",
                year = "1993",
                questionText = "“Whoever sheds the blood of man, by man shall his blood be shed; for God made man in his own image.” This statement explains God's:",
                optionA = "existence of blood revenge",
                optionB = "significance of blood",
                optionC = "disapproval of violence",
                optionD = "prohibition of blood revenge.",
                correctAnswerIndex = 2,
                explanation = "In the post-flood covenant (Genesis 9:6), God institutes this law to emphasize the sacred value of human life and His absolute disapproval of murder and violence.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1993"
            )
        )

        // 1993 Q3
        list.add(
            QuestionEntity(
                id = "crk_1993_03",
                subject = "CRS",
                topic = "Abraham's Wonder at Sarah's Childbearing",
                year = "1993",
                questionText = "When God told Abraham that Sarah would have a child, Abraham laughed because:",
                optionA = "Hagar prompted him",
                optionB = "his wife Sarah laughed",
                optionC = "they were too old to have a child",
                optionD = "he already had a child called Ishmael.",
                correctAnswerIndex = 2,
                explanation = "In Genesis 17:17, Abraham laughed in disbelief, wondering how a child could be born to a man who was one hundred years old, and to Sarah who was ninety.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1993"
            )
        )

        // 1993 Q4
        list.add(
            QuestionEntity(
                id = "crk_1993_04",
                subject = "CRS",
                topic = "Jacob's Tithe Vow at Bethel",
                year = "1993",
                questionText = "After Jacob’s dream at Bethel, he made a vow promising that he would:",
                optionA = "continue to live there forever",
                optionB = "give a tenth of all he would have to God",
                optionC = "return immediately and settle there with his family",
                optionD = "go to his father’s house in peace.",
                correctAnswerIndex = 1,
                explanation = "Upon waking from his vision of the ladder, Jacob set up a pillar and vowed that he would return ten percent (a tithe) of all his future possessions to God (Genesis 28:22).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1993"
            )
        )

        // 1993 Q5
        list.add(
            QuestionEntity(
                id = "crk_1993_05",
                subject = "CRS",
                topic = "Judah Pleads for Joseph's Life",
                year = "1993",
                questionText = "Why did Judah advise his brothers against shedding the blood of Joseph?",
                optionA = "He was afraid of blood",
                optionB = "Joseph was their brother and their flesh",
                optionC = "Blood is life",
                optionD = "He wanted to raise some money by selling Joseph.",
                correctAnswerIndex = 1,
                explanation = "In Genesis 37:26-27, Judah convinced his brothers to sell Joseph to the Ishmaelites instead of murdering him, reminding them that Joseph was their own brother and flesh.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1993"
            )
        )

        // 1993 Q6
        list.add(
            QuestionEntity(
                id = "crk_1993_06",
                subject = "CRS",
                topic = "God Remembers His Covenant with Patriarchs",
                year = "1993",
                questionText = "Why did God redeem the Israelites from the hands of Pharaoh in Egypt?",
                optionA = "God remembered His covenant with Abraham, Isaac and Jacob.",
                optionB = "The yoke of the Israelites was heavy",
                optionC = "God wanted to show His power to Pharaoh",
                optionD = "He wanted to show that Moses was powerful.",
                correctAnswerIndex = 0,
                explanation = "Exodus 2:24 states that God heard the groaning of the enslaved Israelites, and He remembered His ancient covenant with Abraham, Isaac, and Jacob, initiating their redemption.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1993"
            )
        )

        return list
    }
}
