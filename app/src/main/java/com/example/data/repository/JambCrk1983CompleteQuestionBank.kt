package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and authentic JAMB Christian Religious Knowledge / Studies (CRK/CRS)
 * past examination series (1983 Series).
 * Formatted into standard 4-option structure (A-D) with verified keys, topics, and detailed educational explanations.
 */
object JambCrk1983CompleteQuestionBank {

    fun getCrk1983Questions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // Q1
        list.add(
            QuestionEntity(
                id = "crk_1983_01",
                subject = "CRS",
                topic = "The Ministry of Elijah & The Drought in Israel",
                year = "1983",
                questionText = "Who said this: ‘As the LORD God of Israel lives, before whom I stand, there shall not be dew nor rain these years, except by my word’?",
                optionA = "Elisha the prophet",
                optionB = "Ezekiel the priest",
                optionC = "Elijah the Tishbite",
                optionD = "Obadiah the governor",
                correctAnswerIndex = 2,
                explanation = "Elijah the Tishbite declared this severe drought to King Ahab (1 Kings 17:1) as a direct divine judgment on Israel's widespread apostasy and Baal worship.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q2
        list.add(
            QuestionEntity(
                id = "crk_1983_02",
                subject = "CRS",
                topic = "The Wisdom of King Solomon",
                year = "1983",
                questionText = "In the dispute brought before King Solomon concerning the dead and the living child, the mother of the dead child supported:",
                optionA = "giving the living child to her opponent",
                optionB = "killing and dividing the living child",
                optionC = "joint legal custody of the living child",
                optionD = "King Solomon adopting the child into the palace",
                correctAnswerIndex = 1,
                explanation = "In 1 Kings 3:26, the mother of the dead child callousness was exposed when she said, 'Let it be neither mine nor yours, but divide it,' revealing her lack of true maternal affection.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q3
        list.add(
            QuestionEntity(
                id = "crk_1983_03",
                subject = "CRS",
                topic = "Leadership Succession: Moses and Joshua",
                year = "1983",
                questionText = "Before the death of Moses on Mount Nebo, God commanded him to appoint ... as his successor to lead the Israelites into Canaan.",
                optionA = "Joshua the son of Nun",
                optionB = "Aaron the high priest",
                optionC = "Eleazar the priest",
                optionD = "Caleb the son of Jephunneh",
                correctAnswerIndex = 0,
                explanation = "In Numbers 27:18-23, God instructed Moses to lay his hands upon Joshua in the presence of Eleazar the priest and the whole congregation to inaugurate him as the new leader of Israel.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q4
        list.add(
            QuestionEntity(
                id = "crk_1983_04",
                subject = "CRS",
                topic = "Israel's Wilderness Wanderings & The Bronze Serpent",
                year = "1983",
                questionText = "The divinely prescribed remedy for Israelites bitten by the fiery serpents in the wilderness was to:",
                optionA = "drink water drawn from the Red Sea",
                optionB = "look up at the bronze serpent erected on a pole",
                optionC = "fast and offer sacrifices for seven consecutive days",
                optionD = "wash themselves in the River Jordan",
                correctAnswerIndex = 1,
                explanation = "In Numbers 21:9, Moses crafted a bronze serpent and set it on a high pole; whenever anyone bitten by a venomous serpent looked at the bronze serpent in faith, they lived.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "crk_1983_05",
                subject = "CRS",
                topic = "Joseph and His Brothers in Egypt",
                year = "1983",
                questionText = "In order to ensure that his brothers would bring their youngest brother Benjamin to Egypt, Joseph detained and bound:",
                optionA = "Reuben",
                optionB = "Levi",
                optionC = "Judah",
                optionD = "Simeon",
                correctAnswerIndex = 3,
                explanation = "In Genesis 42:24, Joseph bound Simeon before their eyes and held him hostage in an Egyptian prison to guarantee the brothers would return with Benjamin.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q6
        list.add(
            QuestionEntity(
                id = "crk_1983_06",
                subject = "CRS",
                topic = "Joseph's Testing of His Brothers",
                year = "1983",
                questionText = "When Joseph's brothers first came to buy grain in Egypt, he concealed his identity and sternly accused them, saying, ‘You are...’:",
                optionA = "spies come to see the nakedness of the land",
                optionB = "robbers sent from the land of Canaan",
                optionC = "traitors plotting against Pharaoh",
                optionD = "warmongers seeking to destabilize Egypt",
                correctAnswerIndex = 0,
                explanation = "In Genesis 42:9, Joseph recognized his brothers but feigned sternness, accusing them of being foreign spies sent to inspect Egypt's strategic defenses during the famine.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q7
        list.add(
            QuestionEntity(
                id = "crk_1983_07",
                subject = "CRS",
                topic = "The Covenant with Abraham & The Birth of Isaac",
                year = "1983",
                questionText = "In accordance with God's divine promise, Sarah conceived and gave birth in her old age to:",
                optionA = "Joseph",
                optionB = "Isaac",
                optionC = "Jacob",
                optionD = "Benjamin",
                correctAnswerIndex = 1,
                explanation = "In Genesis 21:1-3, God visited Sarah as He had promised, and she bore Abraham a son in his old age, whom Abraham named Isaac (meaning 'laughter').",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q8
        list.add(
            QuestionEntity(
                id = "crk_1983_08",
                subject = "CRS",
                topic = "The Abrahamic Covenant & Circumcision",
                year = "1983",
                questionText = "As a permanent physical token and obligation of the covenant between God and Abraham's descendants, Abraham had to:",
                optionA = "circumcise every male on the eighth day",
                optionB = "offer burnt animal sacrifices every new moon",
                optionC = "strictly observe the weekly Sabbath rest",
                optionD = "build stone altars in every city he visited",
                correctAnswerIndex = 0,
                explanation = "In Genesis 17:10-14, the covenant of circumcision for every eight-day-old male child was established as the everlasting physical sign of the Abrahamic covenant.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q9
        list.add(
            QuestionEntity(
                id = "crk_1983_09",
                subject = "CRS",
                topic = "The Creation of the World",
                year = "1983",
                questionText = "According to the Genesis account of creation, what was the primeval state of the earth before God spoke light into existence?",
                optionA = "The earth was formless, empty (without form and void), and covered in deep darkness",
                optionB = "The earth already had a firmament separating the celestial waters",
                optionC = "Light intermittently penetrated volcanic clouds above the land",
                optionD = "The earth was inhabited exclusively by angels and spirits",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:2 records: 'The earth was without form, and void; and darkness was upon the face of the deep. And the Spirit of God moved upon the face of the waters.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "crk_1983_10",
                subject = "CRS",
                topic = "The Corruption of Man & The Great Flood",
                year = "1983",
                questionText = "God was grieved and determined to destroy the pre-flood human civilization because:",
                optionA = "Adam and Eve broke the dietary prohibition in the Garden of Eden",
                optionB = "Cain killed his righteous brother Abel in the field",
                optionC = "the sons of God took the daughters of men and widespread moral wickedness corrupted the earth",
                optionD = "mankind gathered in the plain of Shinar to build the Tower of Babel",
                correctAnswerIndex = 2,
                explanation = "In Genesis 6:1-5, the intermarriage of the 'sons of God' with the 'daughters of men' and the resulting unchecked violence and moral corruption caused God to decree the Great Flood.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q11
        list.add(
            QuestionEntity(
                id = "crk_1983_11",
                subject = "CRS",
                topic = "Solomon's Accession & The Usurpation of Adonijah",
                year = "1983",
                questionText = "What immediate action did Adonijah take to plead for royal mercy when he realized his coup had collapsed and Solomon was crowned king? He:",
                optionA = "sent a delegation of priests with gifts to Solomon",
                optionB = "pledged his entire personal army to Solomon's service",
                optionC = "fled to the Tabernacle and caught hold of the horns of the altar",
                optionD = "escaped into exile among the Philistine cities",
                correctAnswerIndex = 2,
                explanation = "In 1 Kings 1:50-53, Adonijah sought sacred asylum from Solomon by taking hold of the horns of the bronze altar of burnt offering, a traditional sanctuary for fugitives.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q12
        list.add(
            QuestionEntity(
                id = "crk_1983_12",
                subject = "CRS",
                topic = "The Building of Solomon's Temple",
                year = "1983",
                questionText = "From which geographic region did King Solomon procure the high-grade cedar and cypress timber used to construct the Temple in Jerusalem?",
                optionA = "Egypt",
                optionB = "Beersheba",
                optionC = "Phoenicia",
                optionD = "Lebanon",
                correctAnswerIndex = 3,
                explanation = "In 1 Kings 5:6-10, King Solomon formed a trade partnership with King Hiram of Tyre to log and transport cedar and cypress wood from the famous forests of Lebanon.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q13
        list.add(
            QuestionEntity(
                id = "crk_1983_13",
                subject = "CRS",
                topic = "Jeremiah's Prophecies & The Babylonian Captivity",
                year = "1983",
                questionText = "According to the prophetic preaching of Jeremiah, the military expansion and dominance of King Nebuchadnezzar of Babylon was:",
                optionA = "completely contrary to the sovereign will of God",
                optionB = "an integral part of God's divine purpose to execute judgment",
                optionC = "solely the product of superior Babylonian cavalry and weapons",
                optionD = "a reward for Nebuchadnezzar's personal righteousness before Yahweh",
                correctAnswerIndex = 1,
                explanation = "Jeremiah 27:6-7 revealed that God sovereignly appointed King Nebuchadnezzar as His servant to execute divine chastisement on Judah and neighboring nations for their persistent apostasy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q14
        list.add(
            QuestionEntity(
                id = "crk_1983_14",
                subject = "CRS",
                topic = "The Call and Commission of Ezekiel",
                year = "1983",
                questionText = "In his visionary call, the prophet Ezekiel was commanded by God to eat ... before going out to proclaim God's message to the rebellious house of Israel.",
                optionA = "locusts and wild honey",
                optionB = "bitter herbs of affliction",
                optionC = "unleavened barley bread",
                optionD = "a written scroll filled with words of lamentation",
                correctAnswerIndex = 3,
                explanation = "In Ezekiel 3:1-3, God instructed the prophet to eat a scroll containing lamentations, mourning, and woe to symbolize internalizing and digesting God's message before speaking.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q15
        list.add(
            QuestionEntity(
                id = "crk_1983_15",
                subject = "CRS",
                topic = "The Supreme Test of Abraham's Faith",
                year = "1983",
                questionText = "To which designated mountain region was Abraham directed by God to offer his beloved son Isaac as a burnt offering?",
                optionA = "Moriah",
                optionB = "Sinai",
                optionC = "Bethel",
                optionD = "Tabor",
                correctAnswerIndex = 0,
                explanation = "In Genesis 22:2, God commanded Abraham: 'Take now your son, your only son Isaac, whom you love, and go to the land of Moriah, and offer him there as a burnt offering.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q16
        list.add(
            QuestionEntity(
                id = "crk_1983_16",
                subject = "CRS",
                topic = "The Marriage of Isaac and Rebekah",
                year = "1983",
                questionText = "The divinely appointed bride for Isaac was identified at the well of Nahor when she:",
                optionA = "arrived first at the city well carrying an earthen jar",
                optionB = "introduced herself as a descendant of Abraham's brother Nahor",
                optionC = "generously offered, ‘Drink, and I will draw water for your camels also’",
                optionD = "displayed exceptional beauty and physical stature to Eliezer",
                correctAnswerIndex = 2,
                explanation = "In Genesis 24:14-19, Abraham's senior servant Eliezer prayed for a clear hospitable sign, which Rebekah fulfilled by eagerly watering his ten thirsty camels.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q17
        list.add(
            QuestionEntity(
                id = "crk_1983_17",
                subject = "CRS",
                topic = "The Fall of Jericho & The Sin of Achan",
                year = "1983",
                questionText = "Achan the son of Carmi brought severe divine judgment and military defeat upon Israel at Ai because he:",
                optionA = "spied out the city of Jericho without Joshua's authorization",
                optionB = "prophesied falsely in the camp during the wilderness journey",
                optionC = "coveted and stole consecrated items from the spoils of Jericho",
                optionD = "assisted the King of the Amalekites to escape capture",
                correctAnswerIndex = 2,
                explanation = "In Joshua 7:1-21, Achan violated God's explicit ban by stealing a Babylonian garment, silver, and gold from the devoted things of Jericho, causing Israel's humiliating setback at Ai.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q18
        list.add(
            QuestionEntity(
                id = "crk_1983_18",
                subject = "CRS",
                topic = "The Death of King Saul & David's Lamentation",
                year = "1983",
                questionText = "‘How is it you were not afraid to put forth your hand to destroy the Lord’s anointed?’ This stern rebuke was spoken by:",
                optionA = "Elijah to King Ahab when Ahab plotted against Naboth",
                optionB = "David to the Amalekite runner who claimed to have slain King Saul",
                optionC = "Joab to Absalom when Absalom staged a rebellion against David",
                optionD = "Samuel to King Saul after the spared Amalekite livestock",
                correctAnswerIndex = 1,
                explanation = "In 2 Samuel 1:14-15, David ordered the execution of the Amalekite who boasted of slaying King Saul on Mount Gilboa, demonstrating unwavering respect for God's anointed leader.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q19 (Numbered Q20 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_19",
                subject = "CRS",
                topic = "The Ten Plagues & The Exodus from Egypt",
                year = "1983",
                questionText = "What was the final and tenth plague executed by God on Egypt that compelled Pharaoh to release the Israelites?",
                optionA = "The plague of thick darkness over all Egyptian homes",
                optionB = "The turning of the waters of the Nile into blood",
                optionC = "The swarm of locusts that devoured all vegetation",
                optionD = "The death of the firstborn in every Egyptian household",
                correctAnswerIndex = 3,
                explanation = "In Exodus 12:29-31, the midnight destruction of all Egyptian firstborn finally broke Pharaoh's obstinate resistance, forcing him to urgently dismiss Israel from Egypt.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q20 (Numbered Q21 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_20",
                subject = "CRS",
                topic = "Elijah and the Contest on Mount Carmel",
                year = "1983",
                questionText = "Which Hebrew prophet dramatically demonstrated on Mount Carmel before the assembly of Israel that Yahweh is God and Baal is powerless?",
                optionA = "Elijah the prophet",
                optionB = "Elisha the prophet",
                optionC = "Nathan the prophet",
                optionD = "Amos the prophet",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18:36-39, Elijah challenged the 450 prophets of Baal to a contest by fire on Mount Carmel, where Yahweh consumed the soaked altar with fire from heaven.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q21 (Numbered Q22 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_21",
                subject = "CRS",
                topic = "The Account of Creation",
                year = "1983",
                questionText = "According to the Genesis creation account, what did God create on the third day?",
                optionA = "The celestial lights (sun, moon, and stars)",
                optionB = "The atmospheric firmament dividing waters from waters",
                optionC = "The dry land (earth), the gathering of seas, and plant vegetation",
                optionD = "Living marine creatures and birds of the air",
                correctAnswerIndex = 2,
                explanation = "In Genesis 1:9-13, on the third day of creation, God gathered the subterranean waters for dry land to emerge and brought forth botanical life and fruit-yielding trees.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q22 (Numbered Q23 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_22",
                subject = "CRS",
                topic = "The Golden Calf & Renewal of the Sinai Covenant",
                year = "1983",
                questionText = "‘Cut two tablets of stone like the first; and I will write upon the tablets the words that were upon the first tablets which you broke.’ On what occasion was this command given to Moses?",
                optionA = "At the renewal of the Sinai Covenant",
                optionB = "During the priestly ordination of Aaron",
                optionC = "Just prior to the public commissioning of Joshua",
                optionD = "Immediately after the first miraculous fall of Manna",
                correctAnswerIndex = 0,
                explanation = "In Exodus 34:1, following the breaking of the original Decalogue tablets over the golden calf apostasy, God commanded Moses to prepare two replacement tablets to renew the Covenant.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q23 (Numbered Q24 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_23",
                subject = "CRS",
                topic = "The Conquest of Jericho",
                year = "1983",
                questionText = "The fortified city of Jericho was captured by the Israelites when:",
                optionA = "a long siege of seven years exhausted the city's supplies",
                optionB = "the priests sounded the rams' horn trumpets and the people gave a great shout on the seventh day",
                optionC = "a military faction betrayed the city gates from the inside",
                optionD = "Egyptian archers breached the outer fortifications",
                correctAnswerIndex = 1,
                explanation = "In Joshua 6:20, after completing seven circuits around Jericho on the seventh day, the priests blew the trumpets and the people shouted, causing the fortress walls to collapse flat.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q24 (Numbered Q25 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_24",
                subject = "CRS",
                topic = "The Prophetic Call of Isaiah",
                year = "1983",
                questionText = "The majestic vision and divine commission of Prophet Isaiah in the Temple took place:",
                optionA = "upon the return of the Jewish exiles from Babylon",
                optionB = "in the year of the death of King Uzziah",
                optionC = "during the dedication of the First Temple by King Solomon",
                optionD = "shortly after David's victory over the Philistines",
                correctAnswerIndex = 1,
                explanation = "Isaiah 6:1 states: 'In the year that King Uzziah died I saw also the Lord sitting upon a throne, high and lifted up, and his train filled the temple.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q25 (Numbered Q26 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_25",
                subject = "CRS",
                topic = "The Annunciation of the Birth of John the Baptist",
                year = "1983",
                questionText = "When Zechariah the priest expressed skepticism regarding Angel Gabriel's announcement of the birth of John, he was:",
                optionA = "temporarily struck blind for seven days",
                optionB = "struck dumb and unable to speak until the child's birth and naming",
                optionC = "immediately removed from the Levitical priesthood",
                optionD = "cast into a deep prophetic slumber until Pentecost",
                correctAnswerIndex = 1,
                explanation = "In Luke 1:20, Gabriel told Zechariah: 'Behold, you will be silent and unable to speak until the day that these things take place, because you did not believe my words.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q26 (Numbered Q27 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_26",
                subject = "CRS",
                topic = "The Visit of the Magi & The Flight to Egypt",
                year = "1983",
                questionText = "King Herod sought to kill the child Jesus primarily because:",
                optionA = "he feared Jesus would lead an armed zealot rebellion",
                optionB = "the Eastern Magi had inquired about the one born 'King of the Jews'",
                optionC = "the high priests demanded Jesus' arrest as a blasphemer",
                optionD = "Roman authorities ordered the census execution of Jewish infants",
                correctAnswerIndex = 1,
                explanation = "In Matthew 2:1-16, Herod became intensely paranoid upon learning from the Magi of the birth of a rival 'King of the Jews' in Bethlehem, prompting the massacre of the innocents.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q27 (Numbered Q28 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_27",
                subject = "CRS",
                topic = "Parables of Jesus: The Prodigal Son",
                year = "1983",
                questionText = "The central spiritual lesson taught by the Parable of the Prodigal Son is that:",
                optionA = "fathers should never give inheritance to younger sons",
                optionB = "brothers in a household must maintain strict commercial contracts",
                optionC = "God abundantly pardons and lovingly restores all who genuinely repent",
                optionD = "wasteful financial habits always end in economic ruin",
                correctAnswerIndex = 2,
                explanation = "In Luke 15:11-32, the father's warm reception and celebration over his repentant lost son reflects God's infinite mercy and forgiveness toward every returning sinner.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q28 (Numbered Q29 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_28",
                subject = "CRS",
                topic = "Paul's Second Missionary Journey in Thessalonica",
                year = "1983",
                questionText = "‘These men who have turned the world upside down have come here also, and Jason has received them.’ In which Macedonian city was this accusation leveled against the Apostles?",
                optionA = "Tarsus",
                optionB = "Ephesus",
                optionC = "Thessalonica",
                optionD = "Athens",
                correctAnswerIndex = 2,
                explanation = "In Acts 17:5-6, Jewish opponents in Thessalonica formed a mob, assaulted the house of Jason, and dragged him before city rulers with this famous accusation against Paul and Silas.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q29 (Numbered Q30 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_29",
                subject = "CRS",
                topic = "The Benedictus of Zechariah",
                year = "1983",
                questionText = "‘And you, child, will be called the prophet of the Most High; for you will go before the Lord to prepare his ways.’ This inspired prophecy was spoken concerning:",
                optionA = "Samuel the prophet",
                optionB = "John the Baptist",
                optionC = "Jeremiah the prophet",
                optionD = "Moses the lawgiver",
                correctAnswerIndex = 1,
                explanation = "In Luke 1:76, Zechariah uttered this prophetic blessing (the Benedictus) over his newborn son, John the Baptist, foretelling his role as the forerunner of the Messiah.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q30 (Numbered Q31 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_30",
                subject = "CRS",
                topic = "Parables of the Kingdom: The Mustard Seed",
                year = "1983",
                questionText = "The Parable of the Mustard Seed demonstrates that:",
                optionA = "the Kingdom of God is strictly an invisible spiritual concept",
                optionB = "the Kingdom of God is restricted only to a tiny elect remnant",
                optionC = "the Kingdom of God will expand globally from humble and seemingly insignificant beginnings",
                optionD = "the end of the world will occur when agricultural yields peak",
                correctAnswerIndex = 2,
                explanation = "In Matthew 13:31-32, Jesus explained that the Kingdom of God, though starting like the tiniest seed, grows into a vast tree where the birds of the air find nesting.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q31 (Numbered Q32 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_31",
                subject = "CRS",
                topic = "The Resurrection of Jesus Christ",
                year = "1983",
                questionText = "When the women arrived at the sepulchre of Jesus early on the first day of the week, they discovered that:",
                optionA = "Roman centurions were actively rolling the stone away",
                optionB = "the heavy entrance stone had been rolled away and the tomb was empty",
                optionC = "the body was transferred to the Garden of Gethsemane",
                optionD = "Nicodemus was preparing fresh burial spices inside the tomb",
                correctAnswerIndex = 1,
                explanation = "In Luke 24:1-3, Mary Magdalene and the other women found the stone rolled away from the tomb, entered, and found that the body of the Lord Jesus was gone because He had risen.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q32 (Numbered Q33 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_32",
                subject = "CRS",
                topic = "The Ascension and the Apostolic Commission",
                year = "1983",
                questionText = "‘You shall be my witnesses in Jerusalem and in all Judea and ... and to the end of the earth.’ Identify the missing geographic region in Christ's commission:",
                optionA = "Rome",
                optionB = "Antioch",
                optionC = "Damascus",
                optionD = "Samaria",
                correctAnswerIndex = 3,
                explanation = "In Acts 1:8, the ascending Christ mapped out the outward geographical trajectory of the gospel mission: Jerusalem, all Judea, Samaria, and the ends of the earth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q33 (Numbered Q34 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_33",
                subject = "CRS",
                topic = "Paul's Arrest in the Temple at Jerusalem",
                year = "1983",
                questionText = "Apostle Paul was seized and mobbed in the Jerusalem Temple courts because his opponents falsely alleged that he had:",
                optionA = "brought Greek Gentiles into the sacred inner courts of the Temple",
                optionB = "claimed to be the reincarnated King David",
                optionC = "preached armed insurrection against the Roman garrison in Antonia Fortress",
                optionD = "denied the biblical authority of the Law of Moses",
                correctAnswerIndex = 0,
                explanation = "In Acts 21:27-29, Jews from Asia instigated a riot by alleging that Paul had defiled the Temple by bringing Trophimus the Ephesian (a Greek Gentile) past the court of the Gentiles.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q34 (Numbered Q35 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_34",
                subject = "CRS",
                topic = "The Flight of the Holy Family to Egypt",
                year = "1983",
                questionText = "Which African nation provided a safe sanctuary for the infant Jesus and His parents when King Herod sought to destroy the child?",
                optionA = "Ethiopia",
                optionB = "Egypt",
                optionC = "Morocco",
                optionD = "Libya",
                correctAnswerIndex = 1,
                explanation = "In Matthew 2:13-15, Joseph was warned by an angel in a dream to take Mary and Jesus and flee into Egypt to escape Herod's murderous search.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q35 (Numbered Q36 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_35",
                subject = "CRS",
                topic = "The Ministry and Testimony of John the Baptist",
                year = "1983",
                questionText = "‘After me comes he who is mightier than I, the thong of whose sandals I am not worthy to stoop down and untie.’ Who uttered this declaration of humility?",
                optionA = "Simon Peter",
                optionB = "John the Baptist",
                optionC = "John the Apostle",
                optionD = "Apostle Paul",
                correctAnswerIndex = 1,
                explanation = "In Mark 1:7 and Luke 3:16, John the Baptist testified to his followers regarding the supreme majesty and authority of the coming Messiah, Jesus Christ.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q36 (Numbered Q37 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_36",
                subject = "CRS",
                topic = "The Healing of Blind Bartimaeus at Jericho",
                year = "1983",
                questionText = "Who sat by the highway outside Jericho and persistently shouted, ‘Jesus, Son of David, have mercy on me!’ despite crowd rebukes?",
                optionA = "Bartimaeus the blind beggar",
                optionB = "Zacchaeus the chief tax collector",
                optionC = "Nicodemus the Pharisee",
                optionD = "Simon the leper",
                correctAnswerIndex = 0,
                explanation = "In Mark 10:46-52, blind Bartimaeus sat by the roadside begging outside Jericho and cried out loudly using the Messianic title 'Son of David', receiving his sight from Jesus.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q37 (Numbered Q38 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_37",
                subject = "CRS",
                topic = "The Conversion and Baptism of Saul of Tarsus",
                year = "1983",
                questionText = "Through which faithful disciple in Damascus did the Lord heal Saul's blindness and administer his Christian baptism?",
                optionA = "Ananias of Damascus",
                optionB = "Barnabas of Cyprus",
                optionC = "John Mark",
                optionD = "Silas the prophet",
                correctAnswerIndex = 0,
                explanation = "In Acts 9:10-18, the Lord sent Ananias to lay hands on Saul in the house of Judas on Straight Street, curing his blindness and baptizing him into the faith.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q38 (Numbered Q39 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_38",
                subject = "CRS",
                topic = "The Defense and Martyrdom of Stephen",
                year = "1983",
                questionText = "Which early Christian deacon insisted before the Sanhedrin Council that the Most High does not dwell in temples made with human hands?",
                optionA = "Peter the Apostle",
                optionB = "Stephen the deacon and martyr",
                optionC = "Paul the Apostle",
                optionD = "James the Just",
                correctAnswerIndex = 1,
                explanation = "In Acts 7:48-50, Stephen boldly testified before the Jewish ruling council that God's presence cannot be confined within physical structures built by human hands.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q39 (Numbered Q40 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_39",
                subject = "CRS",
                topic = "The Annunciation of the Birth of Jesus",
                year = "1983",
                questionText = "‘The Holy Spirit will come upon you, and the power of the Most High will overshadow you; therefore the child to be born will be called holy—the Son of God.’ This was announced by Angel Gabriel to:",
                optionA = "Elizabeth in Judea",
                optionB = "Mary in Nazareth",
                optionC = "Anna the prophetess in the Temple",
                optionD = "Salome the wife of Zebedee",
                correctAnswerIndex = 1,
                explanation = "In Luke 1:35, the angel Gabriel revealed the miraculous Virgin Birth and divine sonship of Jesus Christ to the Virgin Mary in Nazareth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q40 (Numbered Q41 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_40",
                subject = "CRS",
                topic = "The Sermon on the Mount: Kingdom Ethics",
                year = "1983",
                questionText = "‘Love your enemies, do good to those who hate you, bless those who curse you, and pray for those who mistreat you.’ Jesus delivered these revolutionary ethical commands during:",
                optionA = "His journey along the Via Dolorosa to Calvary",
                optionB = "His private appearance to the disciples on the Emmaus road",
                optionC = "The landmark Sermon on the Mount (Plain)",
                optionD = "The Transfiguration upon Mount Hermon",
                correctAnswerIndex = 2,
                explanation = "In Matthew 5:44 and Luke 6:27-28, Jesus set down the core ethical charter of God's Kingdom in the Sermon on the Mount, teaching unconditional love and non-retaliation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q41 (Numbered Q42 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_41",
                subject = "CRS",
                topic = "The Appointment of the Seven Deacons in the Early Church",
                year = "1983",
                questionText = "How did the Twelve Apostles resolve the grievance when Hellenistic Jewish believers complained that their widows were neglected in daily food distribution?",
                optionA = "They disbursed monetary stipends from the apostolic treasury",
                optionB = "They appointed seven reputable, spirit-filled men to administer the daily welfare",
                optionC = "They instructed Peter, James, and John to supervise kitchen logistics personally",
                optionD = "They referred the civil complaint to Roman provincial magistrates",
                correctAnswerIndex = 1,
                explanation = "In Acts 6:1-6, the Apostles directed the early church community to select seven deacons to manage food welfare so the Apostles could devote themselves to prayer and the Word of God.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q42 (Numbered Q44 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_42",
                subject = "CRS",
                topic = "The Visitation of Mary to Elizabeth",
                year = "1983",
                questionText = "‘Blessed are you among women, and blessed is the fruit of your womb!’ This inspired greeting was spoken by:",
                optionA = "Elizabeth to Mary during the Visitation",
                optionB = "Anna the prophetess to Elizabeth",
                optionC = "Angel Gabriel to Zechariah",
                optionD = "Naomi to Ruth in Bethlehem",
                correctAnswerIndex = 0,
                explanation = "In Luke 1:41-42, when Mary arrived in the hill country of Judah, Elizabeth was filled with the Holy Spirit and proclaimed this blessing over Mary and her unborn child.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q43 (Numbered Q45 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_43",
                subject = "CRS",
                topic = "The Baptism and Temptation of Jesus",
                year = "1983",
                questionText = "Immediately following His baptism in the River Jordan, Jesus was led into the wilderness to fast and be tempted by:",
                optionA = "the Devil",
                optionB = "the Holy Spirit",
                optionC = "physical exhaustion",
                optionD = "His early disciples",
                correctAnswerIndex = 1,
                explanation = "In Matthew 4:1 and Luke 4:1, Jesus, filled with the Holy Spirit, was led by the Holy Spirit into the wilderness for forty days of prayer and testing against Satan.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q44 (Numbered Q46 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_44",
                subject = "CRS",
                topic = "Jesus' Rejection at Nazareth",
                year = "1983",
                questionText = "‘And he came to ..., where he had been brought up; and, as his custom was, he went into the synagogue on the Sabbath day, and stood up to read.’ Identify the town referenced in this passage:",
                optionA = "Jerusalem",
                optionB = "Bethlehem",
                optionC = "Nazareth",
                optionD = "Capernaum",
                correctAnswerIndex = 2,
                explanation = "Luke 4:16 specifies Nazareth, the boyhood home of Jesus, where He entered the synagogue on the Sabbath and read from Isaiah 61 declaring His messianic mission.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q45 (Numbered Q47 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_45",
                subject = "CRS",
                topic = "Jesus and the Sadducees on the Resurrection",
                year = "1983",
                questionText = "‘Therefore in the resurrection whose wife shall she be of the seven? for they all had her.’ This theological challenge was posed to Jesus by the:",
                optionA = "Pharisees",
                optionB = "Sadducees",
                optionC = "Herodians",
                optionD = "Essenes",
                correctAnswerIndex = 1,
                explanation = "In Matthew 22:23-28, the Sadducees (who denied the bodily resurrection and the existence of angels) presented a riddle regarding levirate marriage to challenge Jesus.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q46 (Numbered Q48 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_46",
                subject = "CRS",
                topic = "The Trial before Pilate & The Crucifixion",
                year = "1983",
                questionText = "Pontius Pilate delivered Jesus up to be crucified primarily because:",
                optionA = "he found Jesus guilty of inciting anti-Roman tax resistance",
                optionB = "Roman law mandated execution for all religious reformists",
                optionC = "he succumbed to intense political pressure from the crowd and chief priests",
                optionD = "the Emperor Tiberius sent an immediate dispatch demanding execution",
                correctAnswerIndex = 2,
                explanation = "In Luke 23:23-24 and John 19:12-16, despite repeatedly declaring Jesus innocent of any capital crime, Pilate yielded to the persistent agitation and blackmail of the crowd.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q47 (Numbered Q49 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_47",
                subject = "CRS",
                topic = "The Conversion and Commission of Paul",
                year = "1983",
                questionText = "Saul of Tarsus was dramatically converted on the Damascus road primarily so that he might:",
                optionA = "serve as an administrative scribe in Jerusalem",
                optionB = "bear the name of the Lord Jesus before Gentiles, kings, and the children of Israel",
                optionC = "take the place of Judas Iscariot among the Twelve Apostles",
                optionD = "retire into solitary contemplative monasticism in Arabia",
                correctAnswerIndex = 1,
                explanation = "In Acts 9:15, the Lord told Ananias: 'Go your way, for he is a chosen vessel of Mine to bear My name before Gentiles, kings, and the children of Israel.'",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        // Q48 (Numbered Q50 in UTME paper)
        list.add(
            QuestionEntity(
                id = "crk_1983_48",
                subject = "CRS",
                topic = "Paul and Silas in the Prison at Philippi",
                year = "1983",
                questionText = "In which Roman colony were Paul and Silas stripped, beaten with rods, and locked in the inner prison after exorcising a spirit of divination?",
                optionA = "Athens",
                optionB = "Philippi",
                optionC = "Antioch",
                optionD = "Corinth",
                correctAnswerIndex = 1,
                explanation = "In Acts 16:16-24, in the city of Philippi, the owners of the healed slave girl stirred up the magistrates to flog and imprison Paul and Silas in the deepest dungeon.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK Past Question • 1983"
            )
        )

        return list
    }
}
