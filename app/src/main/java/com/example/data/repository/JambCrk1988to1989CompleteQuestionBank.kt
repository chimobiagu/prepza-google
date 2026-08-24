package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and authentic JAMB Christian Religious Knowledge / Studies (CRK/CRS)
 * past examination series (1988 & 1989 Series).
 * Formatted into standard 4-option structure (A-D) with verified keys, topics, and detailed educational explanations.
 */
object JambCrk1988to1989CompleteQuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // ==========================================
        // 1988 JAMB CRK / CRS PAST EXAMINATION (48 QUESTIONS)
        // ==========================================

        // 1988 Q1
        list.add(
            QuestionEntity(
                id = "crk_1988_01",
                subject = "CRS",
                topic = "Sons of God and Daughters of Men",
                year = "1988",
                questionText = "The reference in Genesis chapter 6 to the union between the ‘Sons of God’ and the ‘Daughters of Men’ explains the origin of:",
                optionA = "hermaphrodites",
                optionB = "mighty men of renown",
                optionC = "gods and goddesses",
                optionD = "dwarfs.",
                correctAnswerIndex = 1,
                explanation = "Genesis 6:4 records that when the sons of God came in to the daughters of men, they bore children who became the mighty men of old, the men of renown.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q2
        list.add(
            QuestionEntity(
                id = "crk_1988_02",
                subject = "CRS",
                topic = "Two Nations in Rebekah's Womb",
                year = "1988",
                questionText = "‘Two nations’ in Rebekah’s womb refers to the:",
                optionA = "Ammonites and Moabites",
                optionB = "Moabites and Edomites",
                optionC = "Edomites and Israelites",
                optionD = "Israelites and Ishmaelites.",
                correctAnswerIndex = 2,
                explanation = "The two babies struggling in Rebekah's womb represented two future nations, Israel (descended from Jacob) and Edom (descended from Esau) (Genesis 25:23).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q3
        list.add(
            QuestionEntity(
                id = "crk_1988_03",
                subject = "CRS",
                topic = "Joseph Tests his Brothers",
                year = "1988",
                questionText = "Joseph’s initial rough treatment of his brothers in Egypt was intended to:",
                optionA = "take revenge on them",
                optionB = "prolong their starvation",
                optionC = "assure himself that they were not spies",
                optionD = "prove their sincere contrition",
                correctAnswerIndex = 3,
                explanation = "Joseph accused his brothers of being spies and kept Simeon bound to test their character, honesty, and genuine repentance regarding their past treatment of him.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q4
        list.add(
            QuestionEntity(
                id = "crk_1988_04",
                subject = "CRS",
                topic = "Abraham's Reaction to the Promise of Isaac",
                year = "1988",
                questionText = "Which of the following BEST describes Abraham’s reaction to God’s promise of a son by Sarah in Genesis 17?",
                optionA = "Humility",
                optionB = "Optimism",
                optionC = "Generosity",
                optionD = "Faithlessness",
                correctAnswerIndex = 3,
                explanation = "When God promised that Sarah would bear a son, Abraham fell on his face and laughed in disbelief, questioning how a hundred-year-old man could have a child.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q5
        list.add(
            QuestionEntity(
                id = "crk_1988_05",
                subject = "CRS",
                topic = "Jacob at Mahanaim",
                year = "1988",
                questionText = "‘Mahanaim’ is so called because Jacob saw the angels of God as God’s:",
                optionA = "army",
                optionB = "messengers",
                optionC = "guides",
                optionD = "shield",
                correctAnswerIndex = 0,
                explanation = "In Genesis 32:2, when Jacob saw the angels of God, he exclaimed, 'This is God's camp!' and named the place Mahanaim, meaning 'two camps/armies'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q6
        list.add(
            QuestionEntity(
                id = "crk_1988_06",
                subject = "CRS",
                topic = "Pharaoh's Confession after Hailstorm",
                year = "1988",
                questionText = "‘I have sinned this time; the Lord is in the right, and I and my people are in the wrong.’ Pharaoh said this after the plague of the:",
                optionA = "hailstorm",
                optionB = "death of the first born",
                optionC = "locusts",
                optionD = "darkness",
                correctAnswerIndex = 0,
                explanation = "In Exodus 9:27, when a devastating plague of thunder, lightning, and hail struck Egypt, Pharaoh temporarily repented and confessed his guilt.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q7
        list.add(
            QuestionEntity(
                id = "crk_1988_07",
                subject = "CRS",
                topic = "Pharaoh Accuses Israelites of Idleness",
                year = "1988",
                questionText = "The request of Moses that Israel should be allowed to go and worship God was interpreted by Pharaoh to mean:",
                optionA = "disobedience",
                optionB = "idleness",
                optionC = "lawlessness",
                optionD = "disloyalty",
                correctAnswerIndex = 1,
                explanation = "Pharaoh accused the Israelites of using religious worship as a pretext for laziness, commanding that their work burdens be doubled (Exodus 5:17).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q8
        list.add(
            QuestionEntity(
                id = "crk_1988_08",
                subject = "CRS",
                topic = "Passover Lamb Slaughter Time",
                year = "1988",
                questionText = "The Passover lamb was to be kept until the fourteenth day of the first month when the whole assembly of Israel was to kill their lambs:",
                optionA = "in the morning",
                optionB = "at noon",
                optionC = "in the evening",
                optionD = "at midnight.",
                correctAnswerIndex = 2,
                explanation = "Exodus 12:6 commands the congregation of Israel to slaughter their selected, unblemished Passover lambs 'at twilight' or 'in the evening'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q9
        list.add(
            QuestionEntity(
                id = "crk_1988_09",
                subject = "CRS",
                topic = "Israel Encampment at Pi-hahiroth",
                year = "1988",
                questionText = "Pharaoh’s horsemen and his army overtook the fleeing Hebrews, encamped by the sea, at:",
                optionA = "Migdol",
                optionB = "Etham",
                optionC = "Succoth",
                optionD = "Pihahiroth.",
                correctAnswerIndex = 3,
                explanation = "Exodus 14:9 states that the Egyptian army caught up with the encamped Hebrews by the sea, directly in front of Baal-zephon at Pi-hahiroth.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q10
        list.add(
            QuestionEntity(
                id = "crk_1988_10",
                subject = "CRS",
                topic = "The Fiery Serpents",
                year = "1988",
                questionText = "The sin of the Israelites that led to the punishment of fiery serpents was:",
                optionA = "making the golden calf",
                optionB = "speaking against God and Moses",
                optionC = "planning to return to Egypt",
                optionD = "trying to stone Caleb and Joshua.",
                correctAnswerIndex = 1,
                explanation = "In Numbers 21:5, the people grumbled bitterly against God and Moses, expressing disgust for the manna, which prompted God to send venomous snakes.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q11
        list.add(
            QuestionEntity(
                id = "crk_1988_11",
                subject = "CRS",
                topic = "Succession of Aaron on Mount Hor",
                year = "1988",
                questionText = "The priest who succeeded Aaron when he died on Mount Hor was:",
                optionA = "Eleazar",
                optionB = "Nadab",
                optionC = "Abihu",
                optionD = "Phinehas",
                correctAnswerIndex = 0,
                explanation = "In Numbers 20:26-28, Moses stripped Aaron of his high priestly garments and placed them upon his son Eleazar before Aaron died on the summit of Mount Hor.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q12
        list.add(
            QuestionEntity(
                id = "crk_1988_12",
                subject = "CRS",
                topic = "Rahab's Strategic Advice to Spies",
                year = "1988",
                questionText = "‘Go into the hills, lest the pursuers meet you; and hide yourselves three days, until the pursuers have returned; then afterwards you may go your way’. Who gave this advice?",
                optionA = "Deborah",
                optionB = "Rebekah",
                optionC = "Rahab",
                optionD = "Jael",
                correctAnswerIndex = 2,
                explanation = "Rahab gave this strategic escape advice to the two Hebrew spies after concealing them on her roof and lowering them from her window (Joshua 2:16).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q13
        list.add(
            QuestionEntity(
                id = "crk_1988_13",
                subject = "CRS",
                topic = "Conquest and King of Ai",
                year = "1988",
                questionText = "When Joshua burned the city of Ai, he also put to death the king of Ai, by:",
                optionA = "burning",
                optionB = "stoning",
                optionC = "hanging",
                optionD = "shooting.",
                correctAnswerIndex = 2,
                explanation = "Joshua 8:29 records that after conquering Ai, Joshua hanged the king of Ai on a tree until evening, when his body was thrown at the city gate.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q14
        list.add(
            QuestionEntity(
                id = "crk_1988_14",
                subject = "CRS",
                topic = "Jotham's Parable of the Trees",
                year = "1988",
                questionText = "In Jotham’s parable of the trees, the usurper Abimelech is likened to the:",
                optionA = "fig",
                optionB = "bramble",
                optionC = "olive",
                optionD = "vine",
                correctAnswerIndex = 1,
                explanation = "In Judges 9:14-15, Jotham told a parable where the useful trees refuse kingship, while the useless, destructive bramble eagerly accepts it, symbolizing Abimelech's reign.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q15
        list.add(
            QuestionEntity(
                id = "crk_1988_15",
                subject = "CRS",
                topic = "Twelve Memorial Stones at Gilgal",
                year = "1988",
                questionText = "The preservation of the twelve stones by Joshua in Gilgal was to:",
                optionA = "constitute a monument",
                optionB = "found a place of worship",
                optionC = "remind Israel of the crossing of River Jordan",
                optionD = "indicate that the site was a quarry.",
                correctAnswerIndex = 2,
                explanation = "The twelve stones gathered from the dry riverbed of the Jordan were erected as a permanent historical memorial for future generations (Joshua 4:20-22).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q16
        list.add(
            QuestionEntity(
                id = "crk_1988_16",
                subject = "CRS",
                topic = "Samson's Nazirite Vow",
                year = "1988",
                questionText = "Samson, as a dedicated Nazarite, was required to avoid:",
                optionA = "women and dead lions",
                optionB = "unclean things and shaving",
                optionC = "shaving and alcohol",
                optionD = "shaving and women.",
                correctAnswerIndex = 2,
                explanation = "The Nazarite vow required abstinence from fermented drinks, avoiding contact with dead bodies, and letting the hair grow without shaving (Judges 13, Numbers 6).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q17
        list.add(
            QuestionEntity(
                id = "crk_1988_17",
                subject = "CRS",
                topic = "Fall of Jericho and Disaster at Ai",
                year = "1988",
                questionText = "Which city was captured by Joshua immediately before the military disaster at Ai?",
                optionA = "Bethel",
                optionB = "Jericho",
                optionC = "Hebron",
                optionD = "Gilgal",
                correctAnswerIndex = 1,
                explanation = "The conquest of Jericho (Joshua 6) directly preceded the disastrous attack on Ai, which occurred because of Achan's hidden sin (Joshua 7).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q18
        list.add(
            QuestionEntity(
                id = "crk_1988_18",
                subject = "CRS",
                topic = "Saul Spares Agag of Amalek",
                year = "1988",
                questionText = "‘I have brought Agag the king of Amalek, and I have utterly destroyed the Amalekites.’ This declaration was made by:",
                optionA = "David",
                optionB = "Solomon",
                optionC = "Samuel",
                optionD = "Saul",
                correctAnswerIndex = 3,
                explanation = "Saul falsely claimed complete obedience to Samuel, despite sparing Agag and the best livestock in direct violation of the divine ban (1 Samuel 15:20).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q19
        list.add(
            QuestionEntity(
                id = "crk_1988_19",
                subject = "CRS",
                topic = "Hannah's Vow at Shiloh",
                year = "1988",
                questionText = "‘O Lord of hosts, if thou wilt ... give to thy maidservant a son, then I will give him to the Lord all the days of his life, and no razor shall touch his head’. Who said this?",
                optionA = "Sarah",
                optionB = "Rachel",
                optionC = "Hannah",
                optionD = "Samson’s mother.",
                correctAnswerIndex = 2,
                explanation = "This desperate vow was prayed by Hannah at the Shiloh tabernacle, promising to dedicate her future son as a lifelong Nazirite (1 Samuel 1:11).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q20
        list.add(
            QuestionEntity(
                id = "crk_1988_20",
                subject = "CRS",
                topic = "Death of Eli upon Capture of the Ark",
                year = "1988",
                questionText = "Eli fell backward off his seat, broke his neck, and died because of the shock of hearing of the:",
                optionA = "defeat of the Israelites",
                optionB = "behaviour of his delinquent children",
                optionC = "capture of the Ark of Covenant",
                optionD = "death of his two children",
                correctAnswerIndex = 2,
                explanation = "While the news of Israel's defeat and his sons' deaths devastated Eli, it was specifically the mention of the capture of the Ark by the Philistines that caused him to collapse (1 Samuel 4:18).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q21
        list.add(
            QuestionEntity(
                id = "crk_1988_21",
                subject = "CRS",
                topic = "Saul and the Medium of Endor",
                year = "1988",
                questionText = "“Then Saul fell at once full length upon the ground, filled with fear because of the words of Samuel; and there was no strength in him ...” This happened when Samuel’s spirit was:",
                optionA = "invoked from the dead by a medium",
                optionB = "speaking from the altar in Shiloh",
                optionC = "speaking through David’s prophecies",
                optionD = "revealing Saul’s defeat in a dream",
                correctAnswerIndex = 0,
                explanation = "Saul collapsed in terror when the spirit of Samuel was conjured by the medium at Endor, confirming that Saul and his sons would die the next day (1 Samuel 28).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q22
        list.add(
            QuestionEntity(
                id = "crk_1988_22",
                subject = "CRS",
                topic = "Absalom's Rebellion and Ahithophel",
                year = "1988",
                questionText = "As David took to flight from Jerusalem on account of Absalom’s conspiracy, he was deeply apprehensive of the political role of:",
                optionA = "Ahithophel",
                optionB = "Ahijah",
                optionC = "Abiathar",
                optionD = "Shimei.",
                correctAnswerIndex = 0,
                explanation = "David was terrified when he learned that his highly intelligent, trusted counselor Ahithophel had joined Absalom's conspiracy, prompting him to pray that God would turn Ahithophel's counsel into foolishness (2 Samuel 15:31).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q23
        list.add(
            QuestionEntity(
                id = "crk_1988_23",
                subject = "CRS",
                topic = "Ahijah Prophesies Ten Tribes to Jeroboam",
                year = "1988",
                questionText = "To whom did God promise to give ten tribes of the kingdom after Solomon’s heart turned away from the Lord?",
                optionA = "Rehoboam",
                optionB = "Ahijah",
                optionC = "Jeroboam",
                optionD = "Jehoram",
                correctAnswerIndex = 2,
                explanation = "The prophet Ahijah announced to Jeroboam that God would tear the kingdom out of Solomon's hand and give him ten tribes to rule (1 Kings 11:31).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q24
        list.add(
            QuestionEntity(
                id = "crk_1988_24",
                subject = "CRS",
                topic = "Solomon and Hiram of Tyre",
                year = "1988",
                questionText = "What did Solomon provide for Hiram of Tyre in exchange for timber of cedar and cypress?",
                optionA = "War equipment",
                optionB = "Agricultural food provisions",
                optionC = "Wives",
                optionD = "Money.",
                correctAnswerIndex = 1,
                explanation = "According to 1 Kings 5:11, Solomon paid Hiram yearly with twenty thousand cors of wheat and twenty cors of pure oil to feed his royal household.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q25
        list.add(
            QuestionEntity(
                id = "crk_1988_25",
                subject = "CRS",
                topic = "Gifts of the Magi: Gold",
                year = "1988",
                questionText = "The gift of gold presented by the wise men to the infant Jesus indicated his:",
                optionA = "royal status",
                optionB = "priestly status",
                optionC = "prophetic status",
                optionD = "messianic mission.",
                correctAnswerIndex = 0,
                explanation = "In ancient Near Eastern tradition, gold was a valuable tribute reserved for honoring kings, symbolizing Jesus' royal identity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q26
        list.add(
            QuestionEntity(
                id = "crk_1988_26",
                subject = "CRS",
                topic = "Massacre of the Innocents",
                year = "1988",
                questionText = "Herod ordered the slaughter of all male children in Bethlehem when he:",
                optionA = "learnt that a king was born",
                optionB = "had been tricked by the wise men",
                optionC = "could not see the new baby",
                optionD = "searched in vain for the wise men.",
                correctAnswerIndex = 1,
                explanation = "In Matthew 2:16, Herod became furious when he realized the Wise Men had bypassed him and returned home by another route, ordering the massacre to eliminate the child.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q27
        list.add(
            QuestionEntity(
                id = "crk_1988_27",
                subject = "CRS",
                topic = "Micah's Prophecy of Bethlehem",
                year = "1988",
                questionText = "‘And you, O Bethlehem, in the land of Judah, are by no means least among the rulers of Judah; for from you shall come a ruler...’ This statement fulfills the prophecy of:",
                optionA = "Joel",
                optionB = "Micah",
                optionC = "Amos",
                optionD = "Nahum.",
                correctAnswerIndex = 1,
                explanation = "This famous prophecy concerning the birthplace of the Messiah is quoted from Micah 5:2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q28
        list.add(
            QuestionEntity(
                id = "crk_1988_28",
                subject = "CRS",
                topic = "Mission of the Twelve in Mark",
                year = "1988",
                questionText = "According to Mark’s Gospel, what were the disciples forbidden to take for their missionary journey?",
                optionA = "Gold, silver and bag",
                optionB = "Bread, bag and money",
                optionC = "Sandals, staff and two tunics",
                optionD = "Bread, bag and staff",
                correctAnswerIndex = 1,
                explanation = "In Mark 6:8, Jesus commanded the disciples to take nothing for their journey except a staff—no bread, no bag, and no money in their belts.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q29
        list.add(
            QuestionEntity(
                id = "crk_1988_29",
                subject = "CRS",
                topic = "Interval between Confession and Transfiguration",
                year = "1988",
                questionText = "How many days elapsed between Peter’s confession at Caesarea Philippi and the Transfiguration?",
                optionA = "Five",
                optionB = "Six",
                optionC = "Seven",
                optionD = "Eight.",
                correctAnswerIndex = 1,
                explanation = "Matthew 17:1 and Mark 9:2 both record that 'after six days' Jesus took Peter, James, and John up a high mountain where He was transfigured.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q30
        list.add(
            QuestionEntity(
                id = "crk_1988_30",
                subject = "CRS",
                topic = "The Rich Young Ruler",
                year = "1988",
                questionText = "The young man who wanted to know from Jesus what good deed would qualify him for heaven, ‘went away sorrowful’ because he:",
                optionA = "hated the poor",
                optionB = "was uncertain about treasure in heaven",
                optionC = "had great possessions",
                optionD = "would realize little money from the sale of his goods.",
                correctAnswerIndex = 2,
                explanation = "When Jesus told the wealthy young ruler to sell his possessions and give to the poor, he departed in deep grief because he had massive material wealth (Matthew 19:22).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q31
        list.add(
            QuestionEntity(
                id = "crk_1988_31",
                subject = "CRS",
                topic = "Sermon on the Mount: Doing the Will of God",
                year = "1988",
                questionText = "In St. Matthew’s record of the ethical teaching of Jesus (chapters 5-7), the most important divine demand that will enable a man to inherit the kingdom of God is:",
                optionA = "doing the will of God",
                optionB = "practising charity",
                optionC = "prophesying",
                optionD = "performing miracles.",
                correctAnswerIndex = 0,
                explanation = "In Matthew 7:21, Jesus warns that 'Not everyone who says to me, 'Lord, Lord,' will enter the kingdom of heaven, but only the one who does the will of my Father'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q32
        list.add(
            QuestionEntity(
                id = "crk_1988_32",
                subject = "CRS",
                topic = "Peter's Confession Location",
                year = "1988",
                questionText = "Peter made his historic confession: ‘You are the Christ, the son of the living God’ in the neighborhood of:",
                optionA = "Bethlehem in Judea",
                optionB = "Capernaum",
                optionC = "Caesarea Philippi",
                optionD = "Nazareth",
                correctAnswerIndex = 2,
                explanation = "This pivotal confession occurred when Jesus brought His disciples to the region of Caesarea Philippi and asked, 'Who do you say that I am?' (Matthew 16:13-16).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q33
        list.add(
            QuestionEntity(
                id = "crk_1988_33",
                subject = "CRS",
                topic = "Temptation: Bread Alone",
                year = "1988",
                questionText = "In response to which of the devil's temptations in the wilderness did Jesus give the reply: ‘Man shall not live by bread alone, but by every word that proceeds from the mouth of God’?",
                optionA = "Turning stone into bread",
                optionB = "Bowing down to the devil",
                optionC = "Jumping from the pinnacle",
                optionD = "Breaking his long fast.",
                correctAnswerIndex = 0,
                explanation = "Jesus used this quote from Deuteronomy 8:3 to defeat the devil's first temptation to use His divine power to transform stones into bread (Matthew 4:4).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q34
        list.add(
            QuestionEntity(
                id = "crk_1988_34",
                subject = "CRS",
                topic = "Parable of the Dragnet",
                year = "1988",
                questionText = "Which of these parables in Matthew’s Gospel teaches about judgment and the final separation of the righteous from the wicked?",
                optionA = "The Dragnet",
                optionB = "The Hidden Treasure",
                optionC = "The Sower",
                optionD = "The Leaven",
                correctAnswerIndex = 0,
                explanation = "The Parable of the Dragnet (Matthew 13:47-50) compares the end of the age to a net pulling in fish of all kinds, which are then sorted, separating the good from the bad.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q35
        list.add(
            QuestionEntity(
                id = "crk_1988_35",
                subject = "CRS",
                topic = "True Greatness and Servanthood",
                year = "1988",
                questionText = "‘If anyone would be first, he must be last of all and servant of all’. What does this saying of Jesus teach?",
                optionA = "Endurance",
                optionB = "Lack of ambition",
                optionC = "Humility",
                optionD = "Relaxation.",
                correctAnswerIndex = 2,
                explanation = "Jesus spoke these words to His disciples in Mark 9:35 to redefine greatness, teaching that true leadership and honor are found in service and humility.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q36
        list.add(
            QuestionEntity(
                id = "crk_1988_36",
                subject = "CRS",
                topic = "Significance of Moses and Elijah at Transfiguration",
                year = "1988",
                questionText = "The appearance of Elijah and Moses at the transfiguration indicates the significance of the:",
                optionA = "prophets and apostles",
                optionB = "prophets and the law",
                optionC = "Spirit and the word",
                optionD = "Kings and the judges",
                correctAnswerIndex = 1,
                explanation = "Moses (representing the Law) and Elijah (representing the Prophets) appeared to show that Jesus is the perfect fulfillment of all Old Testament scriptures.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q37
        list.add(
            QuestionEntity(
                id = "crk_1988_37",
                subject = "CRS",
                topic = "Becoming Humble like a Child",
                year = "1988",
                questionText = "One of the illustrations used by Jesus to teach true greatness and entry requirements for the Kingdom of God is:",
                optionA = "giving alms to the poor",
                optionB = "preaching the gospel",
                optionC = "becoming humble like a child",
                optionD = "knowing how to pray.",
                correctAnswerIndex = 2,
                explanation = "Jesus placed a child in their midst, declaring that whoever humbles himself like a child is the greatest in the Kingdom of Heaven (Matthew 18:4).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q38
        list.add(
            QuestionEntity(
                id = "crk_1988_38",
                subject = "CRS",
                topic = "Preparation for Triumphal Entry at Bethphage",
                year = "1988",
                questionText = "From which town did Jesus send two of his disciples to make adequate preparation for His triumphal entry into Jerusalem?",
                optionA = "Bethphage",
                optionB = "Golgotha",
                optionC = "Jericho",
                optionD = "Bethany",
                correctAnswerIndex = 0,
                explanation = "In Matthew 21:1, as they drew near to Jerusalem and came to Bethphage on the Mount of Olives, Jesus sent two disciples to secure the donkey.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q39
        list.add(
            QuestionEntity(
                id = "crk_1988_39",
                subject = "CRS",
                topic = "Question on Tribute to Caesar",
                year = "1988",
                questionText = "Which religious and political groups joined forces to trap Jesus with a question about paying taxes to Caesar?",
                optionA = "Pharisees and Sadducees",
                optionB = "Pharisees and Herodians",
                optionC = "Sadducees and Herodians",
                optionD = "Herodians and Zealots.",
                correctAnswerIndex = 1,
                explanation = "The Pharisees (nationalist anti-Rome) and Herodians (pro-Roman royalists) conspired to pose a double-edged tax question to trap Jesus (Matthew 22:15-16).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q40
        list.add(
            QuestionEntity(
                id = "crk_1988_40",
                subject = "CRS",
                topic = "David Eating Consecrated Bread under Abiathar",
                year = "1988",
                questionText = "When the Pharisees accused Jesus’ disciples of plucking heads of grain on the Sabbath, Jesus referenced what David did during the high priesthood of:",
                optionA = "Ahimelek",
                optionB = "Abiathar",
                optionC = "Zadok",
                optionD = "Eli",
                correctAnswerIndex = 1,
                explanation = "In Mark 2:26, Jesus defended His disciples by reminding the critics of David entering the house of God during the time of Abiathar and eating the consecrated showbread.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q41
        list.add(
            QuestionEntity(
                id = "crk_1988_41",
                subject = "CRS",
                topic = "Life of the Early Church in Jerusalem",
                year = "1988",
                questionText = "The three thousand converts on the day of Pentecost devoted themselves to:",
                optionA = "breaking of bread and the prayers",
                optionB = "speaking in tongues",
                optionC = "healing and preaching",
                optionD = "prophesying.",
                correctAnswerIndex = 0,
                explanation = "Acts 2:42 records that the newly baptized believers devoted themselves to the Apostles' teaching, fellowship, the breaking of bread, and prayers.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q42
        list.add(
            QuestionEntity(
                id = "crk_1988_42",
                subject = "CRS",
                topic = "The Seven Deacons of Acts 6",
                year = "1988",
                questionText = "Two of the seven deacons appointed to manage the daily food distribution in Jerusalem were:",
                optionA = "Parmenas and Nicolas",
                optionB = "Simon and Stephen",
                optionC = "Nicanor and Nicolas",
                optionD = "Prochorus and Silas",
                correctAnswerIndex = 2,
                explanation = "Acts 6:5 lists the seven deacons as Stephen, Philip, Prochorus, Nicanor, Timon, Parmenas, and Nicolas.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q43
        list.add(
            QuestionEntity(
                id = "crk_1988_43",
                subject = "CRS",
                topic = "The Holy Spirit Given to those who Obey",
                year = "1988",
                questionText = "According to the apostles’ speech before the Sanhedrin, the Holy Spirit is given by God to:",
                optionA = "the followers of Christ",
                optionB = "the disciples of Jesus",
                optionC = "those who obey God",
                optionD = "those who fast and pray.",
                correctAnswerIndex = 2,
                explanation = "In Acts 5:32, the Apostles declared before the council that they were witnesses of Jesus, along with the Holy Spirit whom God has given to those who obey Him.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q44
        list.add(
            QuestionEntity(
                id = "crk_1988_44",
                subject = "CRS",
                topic = "Peter Quotes Psalms regarding Judas",
                year = "1988",
                questionText = "In his speech concerning the need to replace Judas Iscariot, Peter quoted prophetic passages from:",
                optionA = "Isaiah",
                optionB = "Jeremiah",
                optionC = "Joel",
                optionD = "the Psalms.",
                correctAnswerIndex = 3,
                explanation = "Peter stood up and quoted from Psalm 69:25 ('Let his habitation become desolate') and Psalm 109:8 ('His office let another take') to justify the election (Acts 1:20).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q45
        list.add(
            QuestionEntity(
                id = "crk_1988_45",
                subject = "CRS",
                topic = "Herod Agrippa's Reaction to Peter's Escape",
                year = "1988",
                questionText = "When Peter escaped from prison during the Passover, Herod Agrippa was so furious that he ordered the guards to be:",
                optionA = "imprisoned in his place",
                optionB = "tortured for negligence",
                optionC = "put to death",
                optionD = "dismissed.",
                correctAnswerIndex = 2,
                explanation = "Acts 12:19 records that after searching for Peter in vain, Herod cross-examined the prison guards and commanded that they be led away to execution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q46
        list.add(
            QuestionEntity(
                id = "crk_1988_46",
                subject = "CRS",
                topic = "Ministry of Philip the Evangelist",
                year = "1988",
                questionText = "One of the seven Hellenist deacons who preached the gospel with great success in Samaria, and from Azotus to Caesarea, was:",
                optionA = "Stephen",
                optionB = "Prochorus",
                optionC = "Nicanor",
                optionD = "Philip.",
                correctAnswerIndex = 3,
                explanation = "Philip the evangelist (one of the seven deacons) initiated a major revival in Samaria and subsequently preached in coastal cities up to Caesarea (Acts 8).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q47
        list.add(
            QuestionEntity(
                id = "crk_1988_47",
                subject = "CRS",
                topic = "Simon Magus and Simony",
                year = "1988",
                questionText = "Simon the magician was severely rebuked by Peter in Samaria because he:",
                optionA = "perverted the minds of the people",
                optionB = "opposed the teaching of the apostles",
                optionC = "wanted to purchase spiritual power with money",
                optionD = "refused to be baptized.",
                correctAnswerIndex = 2,
                explanation = "Simon attempted to offer Peter money to buy the ability to impart the Holy Spirit, which Peter condemned as a wicked attempt to purchase God's free gift (Acts 8:20).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // 1988 Q48
        list.add(
            QuestionEntity(
                id = "crk_1988_48",
                subject = "CRS",
                topic = "Disciples Called Christians at Antioch",
                year = "1988",
                questionText = "The disciples of Jesus were for the first time called 'Christians' in the city of:",
                optionA = "Tarsus",
                optionB = "Antioch",
                optionC = "Jerusalem",
                optionD = "Judea.",
                correctAnswerIndex = 1,
                explanation = "Acts 11:26 records that Barnabas and Saul spent an entire year teaching large crowds in Antioch, where the believers were first called 'Christians' (likely by outsiders).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1988"
            )
        )

        // ==========================================
        // 1989 JAMB CRK / CRS PAST EXAMINATION (50 QUESTIONS)
        // ==========================================

        // 1989 Q1
        list.add(
            QuestionEntity(
                id = "crk_1989_01",
                subject = "CRS",
                topic = "Creation of Man: Helper Suitable",
                year = "1989",
                questionText = "‘Then the Lord God said, “It is not good that the man should be alone; I will make him a…”’",
                optionA = "Assistant",
                optionB = "Woman",
                optionC = "Helper",
                optionD = "Companion",
                correctAnswerIndex = 2,
                explanation = "In Genesis 2:18, God recognizes man's need for a counterpart, declaring He would create a 'helper' (Hebrew: ezer) suitable for him.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q2
        list.add(
            QuestionEntity(
                id = "crk_1989_02",
                subject = "CRS",
                topic = "Reasons for the Great Flood",
                year = "1989",
                questionText = "The first generation of mankind was destroyed in the great flood of water because of:",
                optionA = "corruption and violence",
                optionB = "disobedience to the Torah",
                optionC = "worship of idols",
                optionD = "immoral sex relationships.",
                correctAnswerIndex = 0,
                explanation = "According to Genesis 6:11, the earth had become completely corrupt in God's sight and was filled with lawless violence, prompting His judgment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q3
        list.add(
            QuestionEntity(
                id = "crk_1989_03",
                subject = "CRS",
                topic = "Physical Sign of the Abrahamic Covenant",
                year = "1989",
                questionText = "Which of the following is the physical sign of the covenant between God and Abraham?",
                optionA = "The sprinkling of blood on door posts",
                optionB = "Going to Jerusalem every year.",
                optionC = "Keeping of the Passover",
                optionD = "Circumcision in the flesh of the foreskins.",
                correctAnswerIndex = 3,
                explanation = "Circumcision was instituted by God in Genesis 17 as the permanent, physical token of the covenant between Him and Abraham's descendants.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q4
        list.add(
            QuestionEntity(
                id = "crk_1989_04",
                subject = "CRS",
                topic = "Jacob's Vow to Tithe at Bethel",
                year = "1989",
                questionText = "God appeared to Jacob in a dream at Bethel, after which Jacob made a solemn vow to:",
                optionA = "return to his father’s house",
                optionB = "furnish the house of God",
                optionC = "make Bethel his new home",
                optionD = "pay a tenth (tithe) of all his possessions to God",
                correctAnswerIndex = 3,
                explanation = "In Genesis 28:22, Jacob vowed that if God protected and provided for him on his journey, he would return and dedicate a tenth of everything to God.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q5
        list.add(
            QuestionEntity(
                id = "crk_1989_05",
                subject = "CRS",
                topic = "God's Purpose in Joseph's Life",
                year = "1989",
                questionText = "Joseph saw his sale by his brothers as part of God’s grand design to:",
                optionA = "take revenge on his brothers",
                optionB = "become the lord of Egypt",
                optionC = "become a father to Pharaoh",
                optionD = "preserve human life.",
                correctAnswerIndex = 3,
                explanation = "In Genesis 45:5, Joseph comforted his terrified brothers by stating that God had sent him ahead of them to preserve life during the severe famine.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q6
        list.add(
            QuestionEntity(
                id = "crk_1989_06",
                subject = "CRS",
                topic = "The Hebrew Midwives Shiphrah and Puah",
                year = "1989",
                questionText = "The two Hebrew midwives who were instructed by Pharaoh to kill all Hebrew male babies at birth were:",
                optionA = "Shipharah and Zipporah",
                optionB = "Puah and Miriam",
                optionC = "Shipharah and Puah",
                optionD = "Zipporah and Puah",
                correctAnswerIndex = 2,
                explanation = "Exodus 1:15 names Shiphrah and Puah as the two God-fearing midwives who bravely disobeyed Pharaoh's genocidal command to spare the male children.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q7
        list.add(
            QuestionEntity(
                id = "crk_1989_07",
                subject = "CRS",
                topic = "Plagues of Egypt: Gnats",
                year = "1989",
                questionText = "The Egyptian magicians were able to reproduce the first three miracles done by Moses and Aaron, but the fourth which they were unable to perform was the plague of:",
                optionA = "gnat from the dust",
                optionB = "frogs",
                optionC = "swarm of bees",
                optionD = "locusts.",
                correctAnswerIndex = 0,
                explanation = "In Exodus 8:18-19, when Aaron struck the dust of the earth and it transformed into gnats, the magicians failed to replicate it and admitted it was 'the finger of God'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q8
        list.add(
            QuestionEntity(
                id = "crk_1989_08",
                subject = "CRS",
                topic = "Crossing the Red Sea Meaning",
                year = "1989",
                questionText = "The possibility of crossing the Red Sea was perceived by the Israelites as:",
                optionA = "God’s active presence in their midst",
                optionB = "the miraculous power of Moses’ rod",
                optionC = "a punishment of the Egyptians",
                optionD = "a favour deserved by Israel.",
                correctAnswerIndex = 0,
                explanation = "The parting of the Red Sea served as the ultimate proof to Israel of God's active, saving presence leading them out of bondage.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q9
        list.add(
            QuestionEntity(
                id = "crk_1989_09",
                subject = "CRS",
                topic = "Water from the Rock: Exodus vs. Numbers",
                year = "1989",
                questionText = "In Exodus 17 and Numbers 20, similar water crises are recorded. A significant difference is that in Exodus 17, Moses was commanded to:",
                optionA = "strike the rock",
                optionB = "strike the rock twice",
                optionC = "speak to the rock",
                optionD = "speak to the rock twice",
                correctAnswerIndex = 0,
                explanation = "At Rephidim (Exodus 17), God commanded Moses to strike the rock with his staff, whereas at Kadesh (Numbers 20), he was commanded to speak to the rock.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q10
        list.add(
            QuestionEntity(
                id = "crk_1989_10",
                subject = "CRS",
                topic = "The Fifth Commandment with Promise",
                year = "1989",
                questionText = "The only commandment of the Decalogue which has a promise attached to it concerns:",
                optionA = "respecting parents",
                optionB = "keeping the Sabbath",
                optionC = "not taking the name of the Lord in vain",
                optionD = "not coveting our neighbour’s house.",
                correctAnswerIndex = 0,
                explanation = "Exodus 20:12 commands children to honor their parents, accompanied by the promise 'that your days may be long in the land'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q11
        list.add(
            QuestionEntity(
                id = "crk_1989_11",
                subject = "CRS",
                topic = "Samson's Riddle",
                year = "1989",
                questionText = "‘What is sweeter than honey?’ ‘What is stronger than a lion?’ Who gave this riddle?",
                optionA = "Joseph",
                optionB = "Solomon",
                optionC = "Samson",
                optionD = "Ahimelech",
                correctAnswerIndex = 2,
                explanation = "Samson proposed this riddle to his thirty Philistine wedding companions after finding honey inside the carcass of a lion he had slain (Judges 14).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q12
        list.add(
            QuestionEntity(
                id = "crk_1989_12",
                subject = "CRS",
                topic = "Death of Abimelech at Thebez",
                year = "1989",
                questionText = "‘Draw your sword and kill me, lest men say of me, “A woman killed him.”’ The speaker was:",
                optionA = "Sisera",
                optionB = "Samson",
                optionC = "Abimelech",
                optionD = "Ahimelech",
                correctAnswerIndex = 2,
                explanation = "In Judges 9:54, after a woman dropped an upper millstone on his head at the tower of Thebez, Abimelech ordered his armor-bearer to kill him to avoid the social disgrace of being killed by a female.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q13
        list.add(
            QuestionEntity(
                id = "crk_1989_13",
                subject = "CRS",
                topic = "Deborah the Prophetess and Judge",
                year = "1989",
                questionText = "A famous prophetess who also served as a judge in Israel was:",
                optionA = "Hannah",
                optionB = "Sarah",
                optionC = "Peninnah",
                optionD = "Deborah.",
                correctAnswerIndex = 3,
                explanation = "Deborah, a prophetess and wife of Lappidoth, is recorded in Judges 4:4 as holding court and leading the nation of Israel as a judge.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q14
        list.add(
            QuestionEntity(
                id = "crk_1989_14",
                subject = "CRS",
                topic = "Gideon Named Jerubbaal",
                year = "1989",
                questionText = "Gideon was also called Jerubbaal because he:",
                optionA = "pulled down the altar of Baal and cut down the Asherah beside it",
                optionB = "led the Israelites against the Midianites who were Baal Worshippers",
                optionC = "turned Israel away from Baal worship",
                optionD = "tested God.",
                correctAnswerIndex = 0,
                explanation = "His father Joash named him Jerubbaal, meaning 'let Baal contend,' because Gideon had destroyed Baal's altar, saying Baal should defend himself if he is truly a god (Judges 6:32).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q15
        list.add(
            QuestionEntity(
                id = "crk_1989_15",
                subject = "CRS",
                topic = "Joshua Filled with the Spirit of Wisdom",
                year = "1989",
                questionText = "According to Deuteronomy, Joshua was full of the spirit of wisdom because:",
                optionA = "he did everything as the Lord had commanded him",
                optionB = "Moses had laid his hand upon him",
                optionC = "the Lord had promised to be with him as He was with Moses",
                optionD = "he meditated on the book of the law day and night.",
                correctAnswerIndex = 1,
                explanation = "Deuteronomy 34:9 states that Joshua, the son of Nun, was filled with the spirit of wisdom because Moses had laid his hands upon him prior to his death.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q16
        list.add(
            QuestionEntity(
                id = "crk_1989_16",
                subject = "CRS",
                topic = "Rehoboam's Harsh Response at Shechem",
                year = "1989",
                questionText = "‘My little finger is thicker than my father’s loins’ was used by Rehoboam to mean that he would:",
                optionA = "reign more wisely",
                optionB = "be more lenient",
                optionC = "be harsher",
                optionD = "be more just.",
                correctAnswerIndex = 2,
                explanation = "Rehoboam used this proverb to reject the northern tribes' petition, arrogantly threatening that his father Solomon's rule would be mild compared to the harsh taxes and discipline he would impose (1 Kings 12:10).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q17
        list.add(
            QuestionEntity(
                id = "crk_1989_17",
                subject = "CRS",
                topic = "Disruption of the United Monarchy",
                year = "1989",
                questionText = "‘What portion have we in David? We have no inheritance in the son of Jesse. To your tents, O Israel!’ This declaration marked the end of:",
                optionA = "monarchy in Israel",
                optionB = "united kingdom in Israel",
                optionC = "confederacy in Israel",
                optionD = "divided kingdom in Israel",
                correctAnswerIndex = 1,
                explanation = "This rebellious rallying cry by Sheba and the northern tribes officially fractured the nation, ending the united kingdom of David and Solomon and initiating the divided kingdom (1 Kings 12:16).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q18
        list.add(
            QuestionEntity(
                id = "crk_1989_18",
                subject = "CRS",
                topic = "Josiah's Religious Reforms",
                year = "1989",
                questionText = "The critical incident which inspired King Josiah to undertake his sweeping religious reforms was the:",
                optionA = "prophecy of Huldah the prophetess",
                optionB = "sacrifices of Hilkiah the priest",
                optionC = "discovery of the book of the law in the temple",
                optionD = "preparation of the passover.",
                correctAnswerIndex = 2,
                explanation = "When Hilkiah the high priest found the lost 'Book of the Law' during temple renovations, reading its severe curses prompted Josiah to tear his clothes and initiate national reform (2 Kings 22).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q19
        list.add(
            QuestionEntity(
                id = "crk_1989_19",
                subject = "CRS",
                topic = "Amos: Seek Good and Not Evil",
                year = "1989",
                questionText = "‘Seek good, and not evil, that you may live; and so the Lord, the God of hosts, will be with you...’ Which prophet gave this advice?",
                optionA = "Hosea",
                optionB = "Amos",
                optionC = "Isaiah",
                optionD = "Jeremiah",
                correctAnswerIndex = 1,
                explanation = "This exhortation is recorded in Amos 5:14, where the prophet implores Israel to establish justice in their land to survive divine judgment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q20
        list.add(
            QuestionEntity(
                id = "crk_1989_20",
                subject = "CRS",
                topic = "Fire of the Lord on Mount Carmel",
                year = "1989",
                questionText = "And at the time of the offering of the oblation, the prophet Elijah came near and prayed to Yahweh. What happened immediately after this prayer?",
                optionA = "There was heavy rain",
                optionB = "There was thunder and lightning",
                optionC = "There was a strong wind",
                optionD = "The fire of the Lord fell.",
                correctAnswerIndex = 3,
                explanation = "In 1 Kings 18:38, immediately after Elijah's prayer on Mount Carmel, supernatural fire consumed the burnt offering, the wood, the stones, the dust, and licked up the water in the trench.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q21
        list.add(
            QuestionEntity(
                id = "crk_1989_21",
                subject = "CRS",
                topic = "Sennacherib's Army Destroyed",
                year = "1989",
                questionText = "One of the reasons why Sennacherib could not enter Jerusalem and conquer it as he did to Samaria was that:",
                optionA = "his god told him to return home from his camp",
                optionB = "thousands of his soldiers miraculously died overnight",
                optionC = "he willingly changed his mind and returned to his country",
                optionD = "a civil war broke out in Nineveh",
                correctAnswerIndex = 1,
                explanation = "In 2 Kings 19:35, the angel of the Lord went out at night and struck down 185,000 soldiers in the Assyrian camp, forcing Sennacherib to withdraw to Nineveh.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q22
        list.add(
            QuestionEntity(
                id = "crk_1989_22",
                subject = "CRS",
                topic = "The Fall of Jerusalem and King Zedekiah",
                year = "1989",
                questionText = "When the Chaldean army captured King Zedekiah, they executed his sons before him, blinded him, and then:",
                optionA = "hung him on a tree",
                optionB = "slew his wives before his eyes",
                optionC = "bound him in bronze fetters",
                optionD = "cut off his fingers and toes",
                correctAnswerIndex = 2,
                explanation = "According to 2 Kings 25:7, the Babylonians bound King Zedekiah in bronze chains and carried him off to prison in Babylon.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q23
        list.add(
            QuestionEntity(
                id = "crk_1989_23",
                subject = "CRS",
                topic = "Isaiah 53 Suffering Servant",
                year = "1989",
                questionText = "‘All we like sheep have gone astray; we have turned every one to his own way; and the Lord has laid on him the iniquity of us all.’ This messianic prophecy was made by:",
                optionA = "Jeremiah",
                optionB = "Amos",
                optionC = "Ezekiel",
                optionD = "Isaiah.",
                correctAnswerIndex = 3,
                explanation = "This prophetic description of the suffering servant bearing the sins of humanity is quoted directly from Isaiah 53:6.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q24
        list.add(
            QuestionEntity(
                id = "crk_1989_24",
                subject = "CRS",
                topic = "Ezekiel's Vision of Dry Bones",
                year = "1989",
                questionText = "The vision of ‘dry bones’ in Ezekiel teaches that:",
                optionA = "there is life after physical death",
                optionB = "there will be a physical resurrection of the body",
                optionC = "there will be a new creation of animals",
                optionD = "exiled Israel will be restored to their land",
                correctAnswerIndex = 3,
                explanation = "In Ezekiel 37, God explains that the dry bones represent the hopeless, exiled house of Israel, which He would supernaturally revive and return to their homeland.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q25
        list.add(
            QuestionEntity(
                id = "crk_1989_25",
                subject = "CRS",
                topic = "The Gilgamesh Epic Deluge Parallel",
                year = "1989",
                questionText = "The Gilgamesh Epic is the ancient Babylonian literary equivalent of which biblical story?",
                optionA = "The Patriarchs",
                optionB = "The creation",
                optionC = "The fall of man",
                optionD = "The great flood.",
                correctAnswerIndex = 3,
                explanation = "The Gilgamesh Epic contains a highly famous, detailed Mesopotamian account of a global deluge and an ark built by Utnapishtim, closely paralleling Noah's story.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q26
        list.add(
            QuestionEntity(
                id = "crk_1989_26",
                subject = "CRS",
                topic = "Nativity: Sign to the Shepherds",
                year = "1989",
                questionText = "To whom was the birth of Jesus announced with a specific sign of 'a baby wrapped in swaddling cloths and lying in a manger'?",
                optionA = "An angel of the Lord",
                optionB = "The shepherds",
                optionC = "Herod the Great",
                optionD = "The wise men",
                correctAnswerIndex = 1,
                explanation = "In Luke 2:12, the angel of the Lord announced this specific, humble sign to the shepherds guarding their flocks overnight in the fields of Bethlehem.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q27
        list.add(
            QuestionEntity(
                id = "crk_1989_27",
                subject = "CRS",
                topic = "John the Baptist's Core Message",
                year = "1989",
                questionText = "The central message and focus of John the Baptist in the Jordan wilderness was about a baptism:",
                optionA = "with water",
                optionB = "with the Holy Spirit",
                optionC = "of forgiveness",
                optionD = "of repentance",
                correctAnswerIndex = 3,
                explanation = "John the Baptist preached a 'baptism of repentance for the forgiveness of sins,' demanding that lives be transformed before the Messiah's arrival (Luke 3:3).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q28
        list.add(
            QuestionEntity(
                id = "crk_1989_28",
                subject = "CRS",
                topic = "Voice from Heaven at Baptism",
                year = "1989",
                questionText = "Jesus heard a voice saying: ‘Thou art my beloved son; with thee I am well pleased.’ Jesus heard this voice during His:",
                optionA = "baptism",
                optionB = "transfiguration",
                optionC = "crucifixion",
                optionD = "ascension.",
                correctAnswerIndex = 0,
                explanation = "In Luke 3:22, as Jesus was baptized and praying, the Holy Spirit descended in the form of a dove and God spoke these words of confirmation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q29
        list.add(
            QuestionEntity(
                id = "crk_1989_29",
                subject = "CRS",
                topic = "Herod's Superstition about Jesus",
                year = "1989",
                questionText = "According to King Herod, Jesus was John the Baptist raised from the dead because:",
                optionA = "he was a prophet like one of the prophets",
                optionB = "he was Elijah the prophet",
                optionC = "he had the powers of John at work in him",
                optionD = "he had become famous.",
                correctAnswerIndex = 2,
                explanation = "In Matthew 14:1-2 and Mark 6:14, Herod's guilty conscience convinced him that Jesus was John, whom he had beheaded, returned to life with miraculous powers.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q30
        list.add(
            QuestionEntity(
                id = "crk_1989_30",
                subject = "CRS",
                topic = "Jesus Answers John the Baptist's Inquirers",
                year = "1989",
                questionText = "When John the Baptist sent his disciples to ask Jesus ‘Are you the one who is to come...?’, Jesus' immediate reaction in their presence was to:",
                optionA = "cure many diseases and cast out spirits",
                optionB = "ask them to tell John about his theoretical beliefs",
                optionC = "speak to the crowds concerning John’s greatness",
                optionD = "ask the crowds what they went out to see.",
                correctAnswerIndex = 0,
                explanation = "Luke 7:21 records that in that very hour, Jesus healed many of their plagues, diseases, and evil spirits, providing physical, undeniable evidence for John's disciples.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q31
        list.add(
            QuestionEntity(
                id = "crk_1989_31",
                subject = "CRS",
                topic = "The Angels' Song (Gloria in Excelsis)",
                year = "1989",
                questionText = "‘Glory to God in the highest, and on earth peace among men with whom he is pleased!’ is usually referred to as:",
                optionA = "The angels’ song",
                optionB = "David’s song",
                optionC = "Shepherd’s song",
                optionD = "Luke’s song.",
                correctAnswerIndex = 0,
                explanation = "This praise was sung by the heavenly host of angels when announcing the birth of the Savior to the shepherds (Luke 2:14).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q32
        list.add(
            QuestionEntity(
                id = "crk_1989_32",
                subject = "CRS",
                topic = "Healing of the Centurion's Servant",
                year = "1989",
                questionText = "‘I tell you, not even in Israel have I found such faith.’ This statement was made by Jesus during the healing of the:",
                optionA = "ten lepers",
                optionB = "paralytic",
                optionC = "blind man",
                optionD = "centurion’s servant",
                correctAnswerIndex = 3,
                explanation = "Jesus marveled at the Roman centurion in Capernaum who believed that Jesus could heal his paralyzed servant by simply commanding it from a distance (Luke 7:9).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q33
        list.add(
            QuestionEntity(
                id = "crk_1989_33",
                subject = "CRS",
                topic = "The Gerasenes Demand Jesus Depart",
                year = "1989",
                questionText = "When they saw the man who had been possessed by many demons sitting dressed and in his right mind, the Gerasenes:",
                optionA = "fled the city for fear",
                optionB = "asked Jesus to depart from them",
                optionC = "asked Jesus, ‘what is your name?’",
                optionD = "asked Jesus to stay on with them.",
                correctAnswerIndex = 1,
                explanation = "Seized with intense fear over the loss of their herd of swine and the supernatural healing, the entire local population begged Jesus to leave their territory (Luke 8:37).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q34
        list.add(
            QuestionEntity(
                id = "crk_1989_34",
                subject = "CRS",
                topic = "Appointment of the Twelve in Mark",
                year = "1989",
                questionText = "One of the explicit objectives, according to Mark, for which Jesus appointed the twelve Apostles, was for them to:",
                optionA = "love one another",
                optionB = "make disciples of all the nations of the earth",
                optionC = "have authority to cast out demons",
                optionD = "denounce the hypocrisy of the Pharisees.",
                correctAnswerIndex = 2,
                explanation = "Mark 3:14-15 states that Jesus appointed the twelve so that they might be with Him, be sent out to preach, and have authority to cast out demons.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q35
        list.add(
            QuestionEntity(
                id = "crk_1989_35",
                subject = "CRS",
                topic = "Peter Rebuked by Jesus",
                year = "1989",
                questionText = "‘Get behind me, Satan! For you are not on the side of God, but of men.’ The reason for this sharp rebuke to Peter was that he:",
                optionA = "confessed that Jesus is the Christ.",
                optionB = "wanted to dissuade Jesus from dying on the cross",
                optionC = "desired to sit at the right hand of Christ",
                optionD = "wanted Jesus to worship him.",
                correctAnswerIndex = 1,
                explanation = "When Peter pulled Jesus aside to rebuke Him for foretelling His suffering and death, Jesus recognized Peter's words as a satanic temptation to avoid the cross (Mark 8:33).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q36
        list.add(
            QuestionEntity(
                id = "crk_1989_36",
                subject = "CRS",
                topic = "Parable of the Friend at Midnight",
                year = "1989",
                questionText = "From the Parable of the friend at midnight, Jesus teaches about the value of:",
                optionA = "persistence in prayer",
                optionB = "making requests strictly at midnight",
                optionC = "hospitality to strangers",
                optionD = "how to handle lazy neighbors.",
                correctAnswerIndex = 0,
                explanation = "In Luke 11, the neighbor gives bread not out of friendship, but because of the man's shameless persistence (impudence), illustrating how we must persist in prayer.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q37
        list.add(
            QuestionEntity(
                id = "crk_1989_37",
                subject = "CRS",
                topic = "The Spirit Drives Jesus into the Wilderness",
                year = "1989",
                questionText = "According to Mark’s Gospel, Jesus was led into the wilderness to be tempted by Satan by:",
                optionA = "the devil",
                optionB = "the Spirit",
                optionC = "demons",
                optionD = "angels.",
                correctAnswerIndex = 1,
                explanation = "Mark 1:12 records that immediately after His baptism, 'The Spirit' (Holy Spirit) drove Jesus out into the wilderness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q38
        list.add(
            QuestionEntity(
                id = "crk_1989_38",
                subject = "CRS",
                topic = "Mission of the Seventy: Salute No One",
                year = "1989",
                questionText = "Which of the following instructions was given only to the seventy disciples and not to the twelve when Jesus sent them out on mission?",
                optionA = "Wipe off the dust from their feet",
                optionB = "Salute no one on the road",
                optionC = "Take no bag",
                optionD = "Go from house to house.",
                correctAnswerIndex = 1,
                explanation = "In Luke 10:4, Jesus gave the seventy the urgent instruction to 'salute no one on the road' to prevent social delays during their critical mission.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q39
        list.add(
            QuestionEntity(
                id = "crk_1989_39",
                subject = "CRS",
                topic = "New Wine into Fresh Wineskins",
                year = "1989",
                questionText = "‘But new wine must be put into fresh wine-skins.’ What issue was raised by the critics to which this statement was a response?",
                optionA = "Eating with unclean hands",
                optionB = "Drinking alcohol",
                optionC = "Fasting practices",
                optionD = "Sabbath-breaking.",
                correctAnswerIndex = 2,
                explanation = "Jesus delivered this metaphor when questioned by the scribes about why John the Baptist's disciples fasted while His own disciples enjoyed food and drink (Mark 2:22).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q40
        list.add(
            QuestionEntity(
                id = "crk_1989_40",
                subject = "CRS",
                topic = "Tribute to Caesar and to God",
                year = "1989",
                questionText = "‘Then render to Caesar the things that are Caesar’s, and to God the things that are God’s.’ This famous quotation teaches:",
                optionA = "Rejection of civil authority",
                optionB = "Obedience and responsibility to civil authority",
                optionC = "Indifference to state taxes",
                optionD = "Disobedience to civil laws.",
                correctAnswerIndex = 1,
                explanation = "Jesus taught that believers have dual responsibilities: paying taxes and obeying the secular state, while remaining fully dedicated to God (Luke 20:25).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q41
        list.add(
            QuestionEntity(
                id = "crk_1989_41",
                subject = "CRS",
                topic = "Burial of Jesus: Joseph of Arimathea",
                year = "1989",
                questionText = "Who went to Pilate and requested the body of Jesus for burial after His death?",
                optionA = "Nicodemus the Pharisee",
                optionB = "Simon of Cyrene",
                optionC = "Simon Peter",
                optionD = "Joseph of Arimathea.",
                correctAnswerIndex = 3,
                explanation = "Joseph of Arimathea, a respected member of the council who was secretly a disciple of Jesus, went boldly to Pilate to ask for Jesus' body (Luke 23:50-52).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q42
        list.add(
            QuestionEntity(
                id = "crk_1989_42",
                subject = "CRS",
                topic = "The Walk to Emmaus",
                year = "1989",
                questionText = "‘Did not our hearts burn within us while he talked to us...?’ This expresses the realization of:",
                optionA = "Peter’s audience at Pentecost",
                optionB = "The twelve after His arrest",
                optionC = "Cleopas and one other disciple on the road to Emmaus",
                optionD = "Cornelius and his friends.",
                correctAnswerIndex = 2,
                explanation = "The two disciples said this to each other in Luke 24:32 after realizing that the stranger who had explained scriptures to them was the risen Jesus Himself.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q43
        list.add(
            QuestionEntity(
                id = "crk_1989_43",
                subject = "CRS",
                topic = "Preaching the Resurrection at Athens",
                year = "1989",
                questionText = "Paul was accused of being a 'preacher of foreign divinities' in Athens because he preached Jesus and the:",
                optionA = "cross",
                optionB = "law",
                optionC = "resurrection",
                optionD = "second coming.",
                correctAnswerIndex = 2,
                explanation = "In Acts 17:18, Epicurean and Stoic philosophers misunderstood Paul, thinking that 'Jesus' and 'Resurrection' (Anastasis) were a pair of foreign male and female deities.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q44
        list.add(
            QuestionEntity(
                id = "crk_1989_44",
                subject = "CRS",
                topic = "Paul and Barnabas at Lystra",
                year = "1989",
                questionText = "When Paul and Barnabas healed a lifelong cripple at Lystra, the local crowd named them:",
                optionA = "Zeus and Hermes",
                optionB = "Zeus and Apollo",
                optionC = "Jupiter and Mercury",
                optionD = "Zeus and Mars.",
                correctAnswerIndex = 0,
                explanation = "In Acts 14:12, the crowd believed the gods had descended in human form, calling Barnabas 'Zeus' (Jupiter) and Paul 'Hermes' (Mercury) because he was the chief speaker.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q45
        list.add(
            QuestionEntity(
                id = "crk_1989_45",
                subject = "CRS",
                topic = "Altar to the Unknown God in Athens",
                year = "1989",
                questionText = "Paul told the Athenians that they were exceptionally religious because:",
                optionA = "some of their poets praised God",
                optionB = "they dedicated an altar to the 'Unknown God'",
                optionC = "their philosophers discussed holy scriptures",
                optionD = "their city was full of beautiful temples.",
                correctAnswerIndex = 1,
                explanation = "In Acts 17:23, Paul used their altar inscribed 'To the Unknown God' as an entry point to preach Yahweh as the true Creator whom they worshipped in ignorance.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q46
        list.add(
            QuestionEntity(
                id = "crk_1989_46",
                subject = "CRS",
                topic = "Paul's Purification in Jerusalem Temple",
                year = "1989",
                questionText = "The elders at Jerusalem advised Paul on his arrival in the city to do what to pacify conservative Jewish Christians?",
                optionA = "Avoid the Jewish Christians",
                optionB = "Purify himself along with men under vows",
                optionC = "Join those in the temple for prayer and fasting",
                optionD = "Stop preaching the gospel to Gentiles.",
                correctAnswerIndex = 1,
                explanation = "To prove that he still respected Jewish customs, the elders advised Paul to join four men under a Nazirite vow and pay their purification expenses in the temple (Acts 21:23-24).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q47
        list.add(
            QuestionEntity(
                id = "crk_1989_47",
                subject = "CRS",
                topic = "Vision and Comfort in Corinth",
                year = "1989",
                questionText = "‘Do not be afraid, but speak and do not be silent; for I am with you...’ The city referred to here where the Lord comforted Paul was:",
                optionA = "Corinth",
                optionB = "Ephesus",
                optionC = "Athens",
                optionD = "Troas.",
                correctAnswerIndex = 0,
                explanation = "In Acts 18:9, during a period of intense opposition in Corinth, Jesus appeared to Paul in a vision to encourage him to continue preaching boldly.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q48
        list.add(
            QuestionEntity(
                id = "crk_1989_48",
                subject = "CRS",
                topic = "Philippian Jailer's Salvation",
                year = "1989",
                questionText = "To the desperate question of the Philippian Jailer, ‘Men, what must I do to be saved?’ Paul and Silas replied:",
                optionA = "Confess your sins and give alms",
                optionB = "Believe in the Lord Jesus",
                optionC = "Release us and wash our wounds",
                optionD = "Trust in God and pray always.",
                correctAnswerIndex = 1,
                explanation = "Following the midnight earthquake, Paul and Silas gave this simple, direct answer of faith to the terrified jailer (Acts 16:31).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q49
        list.add(
            QuestionEntity(
                id = "crk_1989_49",
                subject = "CRS",
                topic = "Salvation Sent to the Gentiles",
                year = "1989",
                questionText = "“Let it be known to you then that this salvation of God has been sent to the Gentiles; they will listen.” This declaration by Paul implies that:",
                optionA = "The Gentiles will be more receptive to Christianity than the Jews",
                optionB = "The Jews have lost the opportunity of salvation forever",
                optionC = "The Gentiles are very understanding",
                optionD = "Paul has completely lost hope in the Jews.",
                correctAnswerIndex = 0,
                explanation = "Frustrated by the persistent disbelief of the Jewish leaders in Rome, Paul declared that God's message of salvation was shifting directly to the receptive Gentile world (Acts 28:28).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        // 1989 Q50
        list.add(
            QuestionEntity(
                id = "crk_1989_50",
                subject = "CRS",
                topic = "Paul Unharmed by Viper on Malta",
                year = "1989",
                questionText = "During the shipwreck on the voyage to Rome, the islanders of Malta thought Paul was a god because:",
                optionA = "He caused rain to fall",
                optionB = "An angel appeared to him",
                optionC = "He was not harmed by a poisonous viper",
                optionD = "He broke his chains easily.",
                correctAnswerIndex = 2,
                explanation = "When a venomous snake bit Paul's hand and he simply shook it off into the fire without swelling up or dying, the islanders concluded he was a god (Acts 28:5-6).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1989"
            )
        )

        return list
    }
}
