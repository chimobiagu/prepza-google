package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and authentic JAMB Christian Religious Knowledge / Studies (CRK/CRS)
 * past examination series (1984 Series).
 * Formatted into standard 4-option structure (A-D) with verified keys, topics, and detailed educational explanations.
 */
object JambCrk1984CompleteQuestionBank {

    fun getCrk1984Questions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // Q1
        list.add(
            QuestionEntity(
                id = "crk_1984_01",
                subject = "CRS",
                topic = "The Post-Flood Covenant with Noah",
                year = "1984",
                questionText = "Following the Great Flood, God permitted Noah and his descendants to eat all living animals as food except:",
                optionA = "olive leaves and green herbs",
                optionB = "flesh with its life, that is, its blood in it",
                optionC = "animals with cloven hooves",
                optionD = "aquatic animals and birds of prey",
                correctAnswerIndex = 1,
                explanation = "In Genesis 9:3-4, as God established His covenant with Noah after the flood, He explicitly forbade consuming meat containing lifeblood ('flesh with the life thereof, which is the blood thereof').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q2
        list.add(
            QuestionEntity(
                id = "crk_1984_02",
                subject = "CRS",
                topic = "The Birth of Jacob and Esau",
                year = "1984",
                questionText = "‘Two nations are in your womb, and two peoples, born of you shall be divided; the one shall be stronger than the other, the elder shall serve the younger.’ This divine oracle was addressed by God to:",
                optionA = "Deborah",
                optionB = "Miriam",
                optionC = "Rebekah",
                optionD = "Sarah",
                correctAnswerIndex = 2,
                explanation = "In Genesis 25:22-23, God delivered this prophecy to Rebekah during her difficult pregnancy, foretelling the national destinies and perpetual rivalry between the descendants of Jacob (Israel) and Esau (Edom).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q3
        list.add(
            QuestionEntity(
                id = "crk_1984_03",
                subject = "CRS",
                topic = "Moses in Midian",
                year = "1984",
                questionText = "The wife of Moses whom he married in the land of Midian was:",
                optionA = "Esther",
                optionB = "Zipporah",
                optionC = "Hagar",
                optionD = "Michal",
                correctAnswerIndex = 1,
                explanation = "In Exodus 2:21, Reuel (Jethro), the priest of Midian, gave his daughter Zipporah to Moses in marriage during Moses' exile from Egypt.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q4
        list.add(
            QuestionEntity(
                id = "crk_1984_04",
                subject = "CRS",
                topic = "The Ten Commandments at Sinai",
                year = "1984",
                questionText = "‘...for I the LORD your God am a jealous God, visiting the iniquity of the fathers upon the children to the third and fourth generation of those who hate me, but showing steadfast love to thousands of those who love me and keep my commandments.’ This solemn declaration was made by God when:",
                optionA = "He delivered the Ten Commandments to Moses on Mount Sinai",
                optionB = "the Israelites rebelled in the wilderness of Paran",
                optionC = "the Aaronic family was ordained to the priesthood",
                optionD = "He initially commanded Moses at the burning bush",
                correctAnswerIndex = 0,
                explanation = "In Exodus 20:5-6, this proclamation was spoken directly by God as an integral part of the second commandment against making and worshipping graven images.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "crk_1984_05",
                subject = "CRS",
                topic = "The Sons of Noah & Table of Nations",
                year = "1984",
                questionText = "According to Genesis, the three sons of Noah who survived the deluge in the ark were Shem, Ham, and:",
                optionA = "Lot",
                optionB = "Hirah",
                optionC = "Japheth",
                optionD = "Eber",
                correctAnswerIndex = 2,
                explanation = "Genesis 6:10 and 9:18 identify Shem, Ham, and Japheth as Noah's three sons, who subsequently repopulated and established the nations of the earth after the flood.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q7
        list.add(
            QuestionEntity(
                id = "crk_1984_07",
                subject = "CRS",
                topic = "Wilderness Wanderings: The Bronze Serpent",
                year = "1984",
                questionText = "When the Israelites murmured against God and Moses, fiery serpents were sent among them. The divine cure prescribed for anyone bitten by the serpents was:",
                optionA = "drinking water from the struck rock of Horeb",
                optionB = "anointing the bite wound with sacred priestly oil",
                optionC = "making animal peace offerings to Yahweh",
                optionD = "looking up in faith at the bronze serpent on the pole",
                correctAnswerIndex = 3,
                explanation = "In Numbers 21:8-9, Moses fashioned a serpent of bronze and set it on a high pole, and whenever someone who was bitten looked at the bronze serpent, they lived.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q8
        list.add(
            QuestionEntity(
                id = "crk_1984_08",
                subject = "CRS",
                topic = "Moses at Meribah & Joshua's Appointment",
                year = "1984",
                questionText = "Joshua was appointed by God to lead Israel into the Promised Land of Canaan instead of Moses primarily because:",
                optionA = "Moses was too aged and physically weak to lead military campaigns",
                optionB = "the congregation of Israel demanded a younger military commander",
                optionC = "Moses failed to honor God's holiness when striking the rock at Meribah in Zin",
                optionD = "Moses remained in Mount Sinai and did not descend",
                correctAnswerIndex = 2,
                explanation = "In Numbers 20:12 and 27:14, God barred Moses from leading Israel into Canaan because he struck the rock in anger instead of speaking to it at the waters of Meribah in the wilderness of Zin, failing to uphold God's holiness.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q9
        list.add(
            QuestionEntity(
                id = "crk_1984_09",
                subject = "CRS",
                topic = "The Golden Calf & Renewal of the Covenant",
                year = "1984",
                questionText = "The covenant tablets of stone were remade and the covenant renewed on Mount Sinai because:",
                optionA = "a new generation had grown up that knew not the Exodus",
                optionB = "Korah and Dathan led a political rebellion against Moses",
                optionC = "Aaron had fashioned a molten golden calf and the people engaged in idolatry",
                optionD = "the elders petitioned Moses to return to the land of Egypt",
                correctAnswerIndex = 2,
                explanation = "In Exodus 32:19 and 34:1, Moses broke the initial two stone tablets upon seeing the golden calf apostasy, necessitating a renewal of the covenant and the rewriting of the Decalogue.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "crk_1984_10",
                subject = "CRS",
                topic = "The Period of the Judges in Israel",
                year = "1984",
                questionText = "During the pre-monarchical period in Israel, charismatic leaders raised by God to deliver and lead the tribes in times of oppression were the:",
                optionA = "Judges",
                optionB = "Captains of the Guard",
                optionC = "Priests",
                optionD = "Levites",
                correctAnswerIndex = 0,
                explanation = "In the Book of Judges (Judges 2:16), God raised up judges (such as Deborah, Gideon, and Samson) endowed with the Spirit of the Lord to deliver the Israelites from foreign oppressors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q11
        list.add(
            QuestionEntity(
                id = "crk_1984_11",
                subject = "CRS",
                topic = "The Spies Sent to Canaan",
                year = "1984",
                questionText = "Each of the twelve men selected by Moses on God's command to explore and report on the Promised Land of Canaan was a:",
                optionA = "seasoned professional soldier",
                optionB = "recognized tribal leader or prince in his own tribe",
                optionC = "Levitical priest",
                optionD = "member of the prophetic school",
                correctAnswerIndex = 1,
                explanation = "Numbers 13:2-3 records: 'Send men that they may search the land of Canaan... of every tribe of their fathers shall ye send a man, every one a ruler among them.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q12
        list.add(
            QuestionEntity(
                id = "crk_1984_12",
                subject = "CRS",
                topic = "God's Message to Samuel & The Doom of Eli's House",
                year = "1984",
                questionText = "In the night vision at Shiloh, God revealed to young Samuel that He would execute severe judgment on the house of Priest Eli because Eli:",
                optionA = "knew his sons (Hophni and Phinehas) were blaspheming God and failed to restrain them",
                optionB = "refused to offer the prescribed morning and evening animal sacrifices",
                optionC = "allowed foreign Canaanite idols into the tabernacle sanctuary",
                optionD = "failed to properly fast and tithe during tabernacle feasts",
                correctAnswerIndex = 0,
                explanation = "In 1 Samuel 3:13, God told Samuel: 'For I have told him that I will judge his house for ever for the iniquity which he knoweth; because his sons made themselves vile, and he restrained them not.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q13
        list.add(
            QuestionEntity(
                id = "crk_1984_13",
                subject = "CRS",
                topic = "The Conquest of Canaan & Battle of Gibeon",
                year = "1984",
                questionText = "The sun stood still in the heavens and the moon stayed when:",
                optionA = "Moses led the Israelites across the parted Red Sea",
                optionB = "the fortress walls of Jericho collapsed to the ground",
                optionC = "Joshua fought against and defeated the five Amorite kings at Gibeon",
                optionD = "Moses descended from Mount Sinai with the replacement tablets",
                correctAnswerIndex = 2,
                explanation = "In Joshua 10:12-14, Joshua petitioned the Lord in the sight of Israel, and the sun stood still over Gibeon and the moon in the valley of Aijalon until the nation avenged themselves upon their enemies.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q14
        list.add(
            QuestionEntity(
                id = "crk_1984_14",
                subject = "CRS",
                topic = "Saul's Disobedience Concerning Amalek",
                year = "1984",
                questionText = "‘It repents me that I have set up Saul to be king: for he is turned back from following me, and hath not performed my commandments.’ This divine grief was expressed when Saul:",
                optionA = "failed to offer personal intercessory prayer before battle",
                optionB = "offered an unauthorized sacrifice at Gilgal before Samuel arrived",
                optionC = "spared King Agag and the best livestock of the Amalekites contrary to God's ban",
                optionD = "consulted the medium at Endor regarding the Philistine battle",
                correctAnswerIndex = 2,
                explanation = "In 1 Samuel 15:11, God declared His rejection of Saul's kingship after Saul disobeyed the explicit command to completely destroy the Amalekites and all their possessions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q15
        list.add(
            QuestionEntity(
                id = "crk_1984_15",
                subject = "CRS",
                topic = "David's Repentance & Nathan's Rebuke",
                year = "1984",
                questionText = "What was King David's immediate reaction after being rebuked by the prophet Nathan for his sin involving Bathsheba and the murder of Uriah?",
                optionA = "He confessed his sin, fasted, wept, and pleaded with God to spare his child's life",
                optionB = "He ordered Nathan to be arrested and imprisoned in the dungeon",
                optionC = "He justified his royal prerogative and dismissed Nathan from the court",
                optionD = "He offered expensive gifts to Uriah's family to quiet the public outcry",
                correctAnswerIndex = 0,
                explanation = "In 2 Samuel 12:13-16, David immediately confessed, 'I have sinned against the LORD,' and fasted and lay all night upon the earth, pleading for God's mercy over the sick child.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q16
        list.add(
            QuestionEntity(
                id = "crk_1984_16",
                subject = "CRS",
                topic = "Gideon's Call & The Destruction of Baal's Altar",
                year = "1984",
                questionText = "‘If he is a god, let him contend for himself, because someone has pulled down his altar.’ Who boldly tore down his father's altar to Baal overnight?",
                optionA = "Joshua",
                optionB = "Gideon",
                optionC = "Samson",
                optionD = "Jephthah",
                correctAnswerIndex = 1,
                explanation = "In Judges 6:27-32, Gideon demolished the altar of Baal belonging to his father Joash, prompting Joash to defend him with the famous statement, giving Gideon the surname Jerubbaal.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q17
        list.add(
            QuestionEntity(
                id = "crk_1984_17",
                subject = "CRS",
                topic = "Hannah's Prayer at Shiloh",
                year = "1984",
                questionText = "Hannah wept bitterly and prayed fervently to God at the sanctuary in Shiloh for a son because:",
                optionA = "her husband Elkanah refused to provide her daily sustenance",
                optionB = "her rival Peninnah persistently mocked and provoked her over her barrenness",
                optionC = "she had committed a major transgression against the Levitical priesthood",
                optionD = "she wanted a son to inherit the high priesthood of Eli",
                correctAnswerIndex = 1,
                explanation = "In 1 Samuel 1:6-7, Hannah's rival wife Peninnah provoked her grievously to make her fret because the Lord had closed her womb, driving Hannah to pouring out her soul in prayer.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q18
        list.add(
            QuestionEntity(
                id = "crk_1984_18",
                subject = "CRS",
                topic = "The Amalekite Ambush & Divine Judgment",
                year = "1984",
                questionText = "God decreed the total destruction of the Amalekite nation during King Saul's reign because the Amalekites had:",
                optionA = "formed an unholy military alliance with the Philistine city-states",
                optionB = "treacherously attacked the weary stragglers of Israel during their Exodus from Egypt",
                optionC = "introduced widespread Baal worship among the northern tribes of Israel",
                optionD = "stolen sacred tabernacle vessels from the sanctuary at Shiloh",
                correctAnswerIndex = 1,
                explanation = "In 1 Samuel 15:2 (and Deuteronomy 25:17-19), God commanded Saul to punish Amalek for their cowardly ambush on the faint and weary Israelites at Rephidim when they came out of Egypt.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q19
        list.add(
            QuestionEntity(
                id = "crk_1984_19",
                subject = "CRS",
                topic = "David's Dying Charge to Solomon",
                year = "1984",
                questionText = "As King David approached death, he solemnly charged Solomon to walk in God's ways and keep His commandments so that:",
                optionA = "he might prosper and the Lord might fulfill His covenant promise of an unbroken Davidic dynasty",
                optionB = "he could conquer the surrounding empires of Egypt and Assyria",
                optionC = "he would amass unprecedented silver and gold in Jerusalem",
                optionD = "he could execute immediate vengeance on all of David's political adversaries",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 2:1-4, David charged Solomon to keep the statutes and commandments of God so that Solomon would prosper and God would maintain the promise that a Davidic heir would never fail on the throne of Israel.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q20
        list.add(
            QuestionEntity(
                id = "crk_1984_20",
                subject = "CRS",
                topic = "Solomon's Building Program & Trade Treaty",
                year = "1984",
                questionText = "In the commercial trade agreement established between King Solomon and King Hiram of Tyre (Lebanon), Solomon supplied agricultural wheat and oil while Hiram supplied:",
                optionA = "horses and war chariots",
                optionB = "gold and precious ivory",
                optionC = "cedar and cypress timber with skilled craftsmen",
                optionD = "purple textiles and fine linen",
                correctAnswerIndex = 2,
                explanation = "In 1 Kings 5:6-11, King Hiram supplied cedar and cypress logs floated down to Joppa in exchange for twenty thousand cors of wheat and twenty cors of pure pressed olive oil annually.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q21
        list.add(
            QuestionEntity(
                id = "crk_1984_21",
                subject = "CRS",
                topic = "The Division of the Kingdom: Rehoboam and Jeroboam",
                year = "1984",
                questionText = "‘Your father made our yoke heavy. Now therefore lighten the hard service of your father and his heavy yoke upon us, and we will serve you.’ This petition was brought by the northern tribes of Israel to:",
                optionA = "Jeroboam the son of Nebat",
                optionB = "Rehoboam the son of Solomon",
                optionC = "King Solomon",
                optionD = "Ahijah the Shilonite",
                correctAnswerIndex = 1,
                explanation = "In 1 Kings 12:4, the elders of northern Israel, led by Jeroboam, assembled at Shechem to request that Solomon's newly crowned successor, Rehoboam, reduce the oppressive taxation and forced labor burdens.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "crk_1984_22",
                subject = "CRS",
                topic = "Elijah at Mount Horeb",
                year = "1984",
                questionText = "‘I have been very jealous for the LORD God of hosts: for the children of Israel have forsaken thy covenant, thrown down thine altars, and slain thy prophets with the sword; and I, even I only, am left; and they seek my life, to take it away.’ This lamentation was spoken by:",
                optionA = "Jeremiah at the temple gates in Jerusalem",
                optionB = "Elijah hiding in a cave at Mount Horeb",
                optionC = "Moses on Mount Sinai after the golden calf",
                optionD = "Ezekiel in exile by the River Chebar",
                correctAnswerIndex = 1,
                explanation = "In 1 Kings 19:9-14, Elijah fled from Queen Jezebel into the wilderness of Horeb (the mountain of God), where he poured out this desperate lament to the Lord inside a cave.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q23
        list.add(
            QuestionEntity(
                id = "crk_1984_23",
                subject = "CRS",
                topic = "Jeremiah's Temple Sermon",
                year = "1984",
                questionText = "‘Do not trust in deceptive words and say: “The temple of the LORD, The temple of the LORD, The temple of the LORD are these!”’ This famous warning against false security was delivered by:",
                optionA = "Amos the prophet",
                optionB = "Micah the Morasthite",
                optionC = "Jeremiah the prophet",
                optionD = "Ezekiel the priest",
                correctAnswerIndex = 2,
                explanation = "In Jeremiah 7:4, Jeremiah stood in the gate of the Lord's house in Jerusalem and warned the people that relying on the physical presence of the Temple while indulging in oppression, theft, and idolatry would not shield them from divine judgment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q24
        list.add(
            QuestionEntity(
                id = "crk_1984_24",
                subject = "CRS",
                topic = "The Vision and Call of Isaiah",
                year = "1984",
                questionText = "Which Hebrew prophet cried out in remorse: ‘Woe is me! for I am undone; because I am a man of unclean lips, and I dwell in the midst of a people of unclean lips: for mine eyes have seen the King, the LORD of hosts’?",
                optionA = "Hosea",
                optionB = "Jeremiah",
                optionC = "Isaiah",
                optionD = "Amos",
                correctAnswerIndex = 2,
                explanation = "In Isaiah 6:5, when Isaiah saw the vision of the Lord enthroned in glory with seraphim crying 'Holy, holy, holy', he was overwhelmed by his own unworthiness and confessed his unclean lips.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q25
        list.add(
            QuestionEntity(
                id = "crk_1984_25",
                subject = "CRS",
                topic = "The New Covenant Prophecy",
                year = "1984",
                questionText = "Which prophet foretold that God would establish a New Covenant with Israel and Judah, writing His laws directly upon their inward hearts rather than on tables of stone?",
                optionA = "Ezekiel",
                optionB = "Jeremiah",
                optionC = "Hosea",
                optionD = "Micah",
                correctAnswerIndex = 1,
                explanation = "In Jeremiah 31:31-34, the prophet Jeremiah explicitly proclaimed: 'Behold, the days come, saith the LORD, that I will make a new covenant with the house of Israel, and with the house of Judah... I will put my law in their inward parts, and write it in their hearts.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q26
        list.add(
            QuestionEntity(
                id = "crk_1984_26",
                subject = "CRS",
                topic = "The Gospels & The Synoptic Problem",
                year = "1984",
                questionText = "In New Testament biblical studies, the term ‘Synoptic Gospels’ refers specifically to the:",
                optionA = "entire collection of the twenty-seven books of the New Testament",
                optionB = "four canonical Gospels of Matthew, Mark, Luke, and John",
                optionC = "first three Gospels (Matthew, Mark, and Luke) due to their common outline and viewpoint",
                optionD = "five books of the Pentateuch",
                correctAnswerIndex = 2,
                explanation = "The word 'synoptic' comes from the Greek meaning 'seen together with a common view'. Matthew, Mark, and Luke are called Synoptic Gospels because they share significant overlapping narrative order, parables, and chronology, distinct from the thematic style of John.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q27
        list.add(
            QuestionEntity(
                id = "crk_1984_27",
                subject = "CRS",
                topic = "The Annunciation to Zechariah",
                year = "1984",
                questionText = "‘And he will go before him in the spirit and power of Elijah, to turn the hearts of the fathers to the children, and the disobedient to the wisdom of the just...’ This angelic prophecy described the future ministry of:",
                optionA = "Zechariah the priest",
                optionB = "John the Baptist",
                optionC = "Apostle Paul",
                optionD = "Jesus Christ",
                correctAnswerIndex = 1,
                explanation = "In Luke 1:17, Angel Gabriel announced to Zechariah in the Temple that his son, John the Baptist, would serve as the prophetic forerunner of the Messiah in the spirit and power of Elijah.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q28
        list.add(
            QuestionEntity(
                id = "crk_1984_28",
                subject = "CRS",
                topic = "The Preaching of John the Baptist",
                year = "1984",
                questionText = "‘You brood of vipers! Who warned you to flee from the wrath to come? Bear fruit in keeping with repentance...’ Who addressed these stern words to the crowds coming for baptism?",
                optionA = "John the son of Zechariah (John the Baptist)",
                optionB = "John the son of Zebedee",
                optionC = "John Mark",
                optionD = "Simon Peter",
                correctAnswerIndex = 0,
                explanation = "In Matthew 3:7 and Luke 3:7, John the Baptist boldly confronted hypocritical religious leaders and crowds who sought ritual baptism without genuine repentance and practical righteousness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q29
        list.add(
            QuestionEntity(
                id = "crk_1984_29",
                subject = "CRS",
                topic = "The Temptation of Jesus in the Wilderness",
                year = "1984",
                questionText = "‘It is said, “You shall not put the Lord your God to the test.”’ Jesus quoted this Scripture when rejecting the temptation of:",
                optionA = "Simon Peter after Peter's confession of Christ",
                optionB = "the leper who pleaded to be cleansed",
                optionC = "High Priest Caiaphas at the Sanhedrin trial",
                optionD = "the devil on the pinnacle of the Temple in the wilderness temptation",
                correctAnswerIndex = 3,
                explanation = "In Matthew 4:7 and Luke 4:12, Jesus defeated the devil's temptation to throw Himself down from the pinnacle of the Temple by quoting Deuteronomy 6:16.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q30
        list.add(
            QuestionEntity(
                id = "crk_1984_30",
                subject = "CRS",
                topic = "Jesus' Rejection at Nazareth",
                year = "1984",
                questionText = "The inhabitants of Nazareth took offense at Jesus and found it difficult to accept His teachings primarily because they:",
                optionA = "were devout Roman polytheists",
                optionB = "strictly belonged to the Zealot revolutionary party",
                optionC = "were familiar with Him and His humble family background from childhood",
                optionD = "did not understand the Hebrew dialect He spoke",
                correctAnswerIndex = 2,
                explanation = "In Matthew 13:54-57 and Mark 6:1-4, the citizens of Nazareth questioned His authority, saying, 'Is not this the carpenter, the son of Mary?' stumbling over His ordinary childhood background among them.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q31
        list.add(
            QuestionEntity(
                id = "crk_1984_31",
                subject = "CRS",
                topic = "Parables of Jesus: The Sower",
                year = "1984",
                questionText = "In the Parable of the Sower, the seeds that fell on the good ground symbolize individuals who:",
                optionA = "hear God's word, understand it, and bear fruit with perseverance",
                optionB = "give extensive financial charity in public market places",
                optionC = "accumulate substantial worldly wealth and influence",
                optionD = "listen to the word with initial excitement but fall away in persecution",
                correctAnswerIndex = 0,
                explanation = "In Matthew 13:23 and Luke 8:15, the seed on good soil represents those with an honest and good heart who hear the word, hold it fast, and bear an abundant harvest of thirty, sixty, or a hundredfold.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q32
        list.add(
            QuestionEntity(
                id = "crk_1984_32",
                subject = "CRS",
                topic = "Miracles of Jesus: The Cleansing of the Leper",
                year = "1984",
                questionText = "Because he widely publicized his miraculous healing against Jesus' explicit command, Jesus could no longer openly enter a town but remained in desolate rural places. Who was this healed individual?",
                optionA = "The Gerasene demoniac",
                optionB = "The cleansed leper in Galilee",
                optionC = "The blind man of Jericho (Bartimaeus)",
                optionD = "The paralyzed man healed at Capernaum",
                correctAnswerIndex = 1,
                explanation = "In Mark 1:40-45, after Jesus cleansed the leper and instructed him to tell no one except the priest, the man went out and began to talk freely, so that Jesus could no longer openly enter a city.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q33
        list.add(
            QuestionEntity(
                id = "crk_1984_33",
                subject = "CRS",
                topic = "The Demand for a Sign: The Sign of Jonah",
                year = "1984",
                questionText = "‘An evil and adulterous generation seeks for a sign, but no sign shall be given to it except the sign of the prophet Jonah.’ Jesus declared this to the:",
                optionA = "disciples of John the Baptist",
                optionB = "multitude of Roman centurions",
                optionC = "Samaritan woman at the well",
                optionD = "Scribes and Pharisees who demanded a miraculous sign from heaven",
                correctAnswerIndex = 3,
                explanation = "In Matthew 12:38-40 and 16:4, Jesus rebuked the Pharisees and Sadducees who tested Him for a sign, pointing to Jonah's three days in the belly of the sea creature as a type of His upcoming burial and resurrection.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q34
        list.add(
            QuestionEntity(
                id = "crk_1984_34",
                subject = "CRS",
                topic = "The Call of the First Disciples",
                year = "1984",
                questionText = "‘Follow me, and I will make you fishers of men.’ Jesus addressed this transformative call beside the Sea of Galilee to:",
                optionA = "James and John",
                optionB = "Simon Peter and Andrew",
                optionC = "Philip and Nathanael",
                optionD = "Matthew and Thomas",
                correctAnswerIndex = 1,
                explanation = "In Matthew 4:18-19 and Mark 1:16-17, Jesus walked by the Sea of Galilee and called Simon Peter and his brother Andrew while they were casting a net into the lake.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q35
        list.add(
            QuestionEntity(
                id = "crk_1984_35",
                subject = "CRS",
                topic = "The Triumphal Entry into Jerusalem",
                year = "1984",
                questionText = "The joyful Hebrew cry ‘Hosanna!’, shouted by the pilgrim crowds as Jesus entered Jerusalem on Palm Sunday, literally means:",
                optionA = "‘Ride on in royal majesty’",
                optionB = "‘Glory to God in the highest’",
                optionC = "‘Save now’ or ‘Save, we pray!’",
                optionD = "‘Welcome the King of Israel’",
                correctAnswerIndex = 2,
                explanation = "Derived from the Hebrew phrase 'Hoshia-na' (Psalm 118:25), 'Hosanna' translates literally to 'Save now, we beseech thee,' serving as an acclaim of praise to the Messianic Deliverer.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q36
        list.add(
            QuestionEntity(
                id = "crk_1984_36",
                subject = "CRS",
                topic = "Jesus' Denunciation of the Scribes and Pharisees",
                year = "1984",
                questionText = "A major reason why Jesus sternly denounced the Scribes and Pharisees in Matthew 23 was that they:",
                optionA = "rarely attended public Sabbath services in the synagogue",
                optionB = "preached moral commands and burdened others, but did not practice what they taught",
                optionC = "refused to construct tombs for past prophets",
                optionD = "advocated armed rebellion against the Roman empire",
                correctAnswerIndex = 1,
                explanation = "In Matthew 23:2-4, Jesus exposed their religious hypocrisy: 'The scribes and the Pharisees sit in Moses' seat... but do not ye after their works: for they say, and do not.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q37
        list.add(
            QuestionEntity(
                id = "crk_1984_37",
                subject = "CRS",
                topic = "The Twelve Apostles of Jesus",
                year = "1984",
                questionText = "In the biblical rosters of Jesus' closest followers, ‘Simon the Cananaean’ (or the Zealot) was:",
                optionA = "the original birth name of Simon Peter",
                optionB = "one of the twelve chosen Apostles of Jesus",
                optionC = "the Pharisee in whose home the sinful woman washed Jesus' feet",
                optionD = "the passerby from Cyrene forced to carry Jesus' cross",
                correctAnswerIndex = 1,
                explanation = "In Matthew 10:4 and Luke 6:15, Simon called the Cananaean (or Zelotes) is listed as one of the twelve Apostles chosen by Jesus Christ.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q38
        list.add(
            QuestionEntity(
                id = "crk_1984_38",
                subject = "CRS",
                topic = "The Resurrection & The Women at the Tomb",
                year = "1984",
                questionText = "Mary Magdalene, Mary the mother of James, and Salome went to the tomb of Jesus at dawn on the third day after His crucifixion in order to:",
                optionA = "plead with the Roman sentries to open the sealed sepulchre",
                optionB = "anoint the body of Jesus with prepared aromatic spices",
                optionC = "verify if the body was transferred to Bethany",
                optionD = "hold a formal public lamentation according to Jewish custom",
                correctAnswerIndex = 1,
                explanation = "In Mark 16:1-2, when the Sabbath was past, the women bought fragrant spices that they might go and properly anoint the body of Jesus in accordance with burial traditions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q39
        list.add(
            QuestionEntity(
                id = "crk_1984_39",
                subject = "CRS",
                topic = "Parables of Jesus: The Pharisee and the Tax Collector",
                year = "1984",
                questionText = "To those who trusted in their own self-righteousness and viewed others with contempt, Jesus addressed the Parable of the:",
                optionA = "Rich Man and Lazarus",
                optionB = "Pharisee and the Tax Collector (Publican)",
                optionC = "Ten Virgins (Wise and Foolish)",
                optionD = "Prodigal Son",
                correctAnswerIndex = 1,
                explanation = "In Luke 18:9-14, Jesus spoke the Parable of the Pharisee and the Tax Collector to rebuke self-righteous pride and demonstrate that the humble penitent is justified before God.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q40
        list.add(
            QuestionEntity(
                id = "crk_1984_40",
                subject = "CRS",
                topic = "Healing at the Beautiful Gate & Temple Arrest",
                year = "1984",
                questionText = "The temple officials and Sadducees arrested Peter and John after the healing of the lame man at the Beautiful Gate primarily because the apostles:",
                optionA = "proclaimed in Jesus the resurrection from the dead",
                optionB = "refused to offer sacrifices in the inner sanctuary",
                optionC = "incited the crowd to overthrow the Roman garrison",
                optionD = "demanded tithes from the worshipping pilgrims",
                correctAnswerIndex = 0,
                explanation = "In Acts 4:1-2, the priests, the captain of the temple, and the Sadducees came upon Peter and John, 'being grieved that they taught the people, and preached through Jesus the resurrection from the dead.'",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q41
        list.add(
            QuestionEntity(
                id = "crk_1984_41",
                subject = "CRS",
                topic = "The Damascus Road Conversion of Saul",
                year = "1984",
                questionText = "The dramatic transformation and conversion of Saul of Tarsus from a persecutor to an apostle was brought about by:",
                optionA = "the persuasive debating of Stephen before the Sanhedrin",
                optionB = "a personal visionary encounter with the Risen Jesus on the road to Damascus",
                optionC = "the apostolic council convened in Jerusalem",
                optionD = "the hospitality of Simon the Tanner in Joppa",
                correctAnswerIndex = 1,
                explanation = "In Acts 9:3-6, Saul was struck down on the road to Damascus by a blinding light from heaven and confronted by the Risen Christ, transforming him into the Apostle to the Gentiles.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q42
        list.add(
            QuestionEntity(
                id = "crk_1984_42",
                subject = "CRS",
                topic = "The Replacement of Judas Iscariot",
                year = "1984",
                questionText = "‘Let his habitation become desolate, and let no one live in it’ and ‘His office let another take.’ In Acts 1, Peter cited these scriptural prophecies concerning:",
                optionA = "Judas Iscariot",
                optionB = "Stephen the martyr",
                optionC = "Joseph Barsabbas",
                optionD = "Ananias of Jerusalem",
                correctAnswerIndex = 0,
                explanation = "In Acts 1:16-20, Peter quoted Psalms 69:25 and 109:8 to show that Judas Iscariot's apostasy had been prophesied and that another disciple (subsequently Matthias) should be chosen to take his apostolic office.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q43
        list.add(
            QuestionEntity(
                id = "crk_1984_43",
                subject = "CRS",
                topic = "The Jerusalem Council on Gentile Converts",
                year = "1984",
                questionText = "Which of the following was NOT one of the essential apostolic stipulations communicated to Gentile Christians by the Jerusalem Council in Acts 15?",
                optionA = "Abstinence from things polluted by idols",
                optionB = "Mandatory physical compliance with the rite of circumcision",
                optionC = "Abstinence from blood and things strangled",
                optionD = "Abstinence from sexual immorality (fornication)",
                correctAnswerIndex = 1,
                explanation = "In Acts 15:19-29, the Jerusalem Council ruled that Gentile believers did not need to undergo circumcision, but only needed to abstain from idolatry, blood, strangled meat, and sexual immorality.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q44
        list.add(
            QuestionEntity(
                id = "crk_1984_44",
                subject = "CRS",
                topic = "Paul in Corinth Before Gallio",
                year = "1984",
                questionText = "The Roman proconsul of Achaia who dismissed the judicial charges brought against Paul by the Jewish opponents in Corinth was:",
                optionA = "Festus",
                optionB = "Pontius Pilate",
                optionC = "Gallio",
                optionD = "Felix",
                correctAnswerIndex = 2,
                explanation = "In Acts 18:12-17, Proconsul Gallio ruled that the dispute was a matter of internal Jewish religious law rather than a Roman crime, refusing to sit in judgment over Paul.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q45
        list.add(
            QuestionEntity(
                id = "crk_1984_45",
                subject = "CRS",
                topic = "Peter's Miraculous Prison Escape",
                year = "1984",
                questionText = "‘Now I know for certain that the Lord has sent His angel, and has delivered me from the hand of Herod and from all the expectation of the Jewish people.’ Identify the speaker of these words:",
                optionA = "Apostle Paul",
                optionB = "Silas",
                optionC = "Simon Peter",
                optionD = "Stephen",
                correctAnswerIndex = 2,
                explanation = "In Acts 12:11, after an angel broke his chains and led him past the prison guards in Jerusalem, Peter came to himself and spoke these words of praise.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q46
        list.add(
            QuestionEntity(
                id = "crk_1984_46",
                subject = "CRS",
                topic = "The Seven Deacons in the Early Church",
                year = "1984",
                questionText = "In Acts 6, the seven men of good repute were chosen and ordained by the Apostles primarily to:",
                optionA = "lead the foreign missionary campaigns to the Gentiles",
                optionB = "take over the apostolic responsibility of teaching and preaching",
                optionC = "oversee the daily distribution of food and welfare to needy widows",
                optionD = "guard the physical premises of the Jerusalem meeting places",
                correctAnswerIndex = 2,
                explanation = "In Acts 6:1-6, the Apostles directed the community to select seven deacons to manage food welfare ('serve tables') so the Apostles could devote themselves to prayer and the ministry of the Word.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q47
        list.add(
            QuestionEntity(
                id = "crk_1984_47",
                subject = "CRS",
                topic = "Paul's Defense Before King Agrippa",
                year = "1984",
                questionText = "Which ruler reacted to Paul's impassioned defense by exclaiming, ‘In a short time you think to make me a Christian!’ (or ‘Almost thou persuadest me to be a Christian’)?",
                optionA = "Governor Festus",
                optionB = "King Herod Agrippa II",
                optionC = "Governor Felix",
                optionD = "Emperor Nero",
                correctAnswerIndex = 1,
                explanation = "In Acts 26:28, King Agrippa II responded to Paul's appeal with this famous remark after Paul challenged him regarding his belief in the Old Testament prophets.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q48
        list.add(
            QuestionEntity(
                id = "crk_1984_48",
                subject = "CRS",
                topic = "Paul's Ministry to the Jewish Leaders in Rome",
                year = "1984",
                questionText = "Upon his arrival in Rome as an imperial prisoner, the group of people whom Paul first summoned and addressed were:",
                optionA = "the local leaders and elders of the Jewish community",
                optionB = "the elite Praetorian soldiers guarding Caesar's palace",
                optionC = "the pagan philosophers at the Roman forum",
                optionD = "the magistrates of the Roman senate",
                correctAnswerIndex = 0,
                explanation = "In Acts 28:17, three days after his arrival in Rome, Paul called together the local Jewish leaders to explain his circumstances and proclaim the hope of Israel through Jesus Christ.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q49
        list.add(
            QuestionEntity(
                id = "crk_1984_49",
                subject = "CRS",
                topic = "Paul's Resolution at Caesarea",
                year = "1984",
                questionText = "‘For I am ready not only to be bound, but also to die at Jerusalem for the name of the Lord Jesus.’ Who spoke this resolute confession when pleaded with not to go to Jerusalem?",
                optionA = "Stephen the deacon",
                optionB = "James the brother of John",
                optionC = "Apostle Paul",
                optionD = "Barnabas",
                correctAnswerIndex = 2,
                explanation = "In Acts 21:13, when disciples in Caesarea wept and urged Paul not to go up to Jerusalem after Prophet Agabus foretold his arrest, Paul declared his readiness even to die for Christ.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        // Q50
        list.add(
            QuestionEntity(
                id = "crk_1984_50",
                subject = "CRS",
                topic = "Paul's Voyage and Shipwreck to Rome",
                year = "1984",
                questionText = "During the violent Mediterranean storm on Paul's voyage to Rome, an angel appeared to him and gave this divine reassurance: ‘Do not be afraid, Paul; you must stand before Caesar; and behold...’:",
                optionA = "‘Caesar will grant you an immediate unconditional release’",
                optionB = "‘the storm will calm before the next sunrise’",
                optionC = "‘all who seek your life in Jerusalem shall perish’",
                optionD = "‘God has granted you all those who sail with you’",
                correctAnswerIndex = 3,
                explanation = "In Acts 27:24, the angel of God assured Paul: 'Fear not, Paul; thou must be brought before Caesar: and, lo, God hath given thee all them that sail with thee.' Consequently, all 276 passengers survived the shipwreck on Malta.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1984"
            )
        )

        return list
    }
}
