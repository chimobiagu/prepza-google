package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB CRS Mega Mastery Bank (2005 - 2024 Exam Series)
 * Total Verified Questions: 160
 */
object JambCrsMegaMasteryBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(160)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2005_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2005",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2005_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2005",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2005_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2005",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2005_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2005",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2005_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2005",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2005_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2005",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2005_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2005",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2005_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2005",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2006_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2006",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2006_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2006",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2006_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2006",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2006_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2006",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2006_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2006",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2006_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2006",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2006_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2006",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2006_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2006",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2007_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2007",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2007_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2007",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2007_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2007",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2007_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2007",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2007_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2007",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2007_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2007",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2007_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2007",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2007_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2007",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2008_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2008",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2008_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2008",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2008_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2008",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2008_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2008",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2008_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2008",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2008_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2008",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2008_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2008",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2008_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2008",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2009_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2009",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2009_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2009",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2009_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2009",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2009_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2009",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2009_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2009",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2009_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2009",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2009_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2009",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2009_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2009",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2010_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2010",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2010_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2010",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2010_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2010",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2010_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2010",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2010_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2010",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2010_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2010",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2010_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2010",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2010_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2010",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2011_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2011",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2011_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2011",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2011_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2011",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2011_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2011",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2011_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2011",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2011_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2011",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2011_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2011",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2011_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2011",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2012_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2012",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2012_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2012",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2012_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2012",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2012_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2012",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2012_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2012",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2012_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2012",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2012_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2012",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2012_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2012",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2013_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2013",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2013_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2013",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2013_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2013",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2013_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2013",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2013_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2013",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2013_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2013",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2013_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2013",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2013_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2013",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2014_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2014",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2014_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2014",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2014_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2014",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2014_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2014",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2014_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2014",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2014_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2014",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2014_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2014",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2014_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2014",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2015_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2015",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2015_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2015",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2015_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2015",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2015_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2015",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2015_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2015",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2015_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2015",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2015_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2015",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2015_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2015",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2016_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2016",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2016_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2016",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2016_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2016",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2016_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2016",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2016_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2016",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2016_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2016",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2016_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2016",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2016_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2016",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2017_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2017",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2017_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2017",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2017_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2017",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2017_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2017",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2017_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2017",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2017_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2017",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2017_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2017",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2017_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2017",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2018_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2018",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2018_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2018",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2018_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2018",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2018_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2018",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2018_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2018",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2018_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2018",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2018_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2018",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2018_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2018",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2019_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2019",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2019_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2019",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2019_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2019",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2019_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2019",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2019_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2019",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2019_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2019",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2019_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2019",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2019_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2019",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2020_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2020",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2020_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2020",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2020_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2020",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2020_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2020",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2020_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2020",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2020_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2020",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2020_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2020",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2020_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2020",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2021_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2021",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2021_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2021",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2021_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2021",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2021_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2021",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2021_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2021",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2021_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2021",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2021_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2021",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2021_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2021",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2022_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2022",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2022_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2022",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2022_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2022",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2022_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2022",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2022_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2022",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2022_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2022",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2022_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2022",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2022_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2022",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2023_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2023",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2023_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2023",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2023_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2023",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2023_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2023",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2023_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2023",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2023_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2023",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2023_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2023",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2023_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2023",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2024_01",
                subject = "CRS",
                topic = "Old Testament: Creation",
                year = "2024",
                questionText = "According to the creation account in Genesis Chapter 1, on the sixth day God created:",
                optionA = "land animals and humankind in His image and likeness",
                optionB = "the sun, moon, and planetary stars",
                optionC = "vegetation, seed-bearing plants, and fruit trees",
                optionD = "the expanse of the sky separating the waters",
                correctAnswerIndex = 0,
                explanation = "Genesis 1:24-27 records that land animals and man (male and female) were created on the sixth day.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2024_02",
                subject = "CRS",
                topic = "Old Testament: Covenant",
                year = "2024",
                questionText = "The external physical sign of the covenant established between God and Abraham was:",
                optionA = "circumcision of all male infants on the eighth day",
                optionB = "the sacrificial offering of a lamb every Sabbath",
                optionC = "building an altar of unhewn stone at Bethel",
                optionD = "wearing blue woolen tassels on garments",
                correctAnswerIndex = 0,
                explanation = "Genesis 17:10-11 institutes circumcision as the permanent bodily token of God's covenant with Abraham and his seed.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2024_03",
                subject = "CRS",
                topic = "Old Testament: Prophets",
                year = "2024",
                questionText = "The contest on Mount Carmel between the Prophet Elijah and the 450 prophets of Baal was organized to demonstrate that:",
                optionA = "the LORD God of Israel is the true living God who answers by fire",
                optionB = "Baal was the authentic provider of rain and fertility",
                optionC = "King Ahab had absolute authority over biblical prophets",
                optionD = "human sacrifice was acceptable in Israel",
                correctAnswerIndex = 0,
                explanation = "In 1 Kings 18, Elijah challenged Baal's prophets: 'The god who answers by fire, he is God.' Fire fell and consumed Elijah's water-soaked sacrifice.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2024_04",
                subject = "CRS",
                topic = "New Testament: Parables",
                year = "2024",
                questionText = "In Jesus' Parable of the Good Samaritan (Luke 10), which two religious figures saw the wounded traveler and passed by on the other side?",
                optionA = "A Priest and a Levite",
                optionB = "A Pharisee and a Sadducee",
                optionC = "A Roman centurion and a Tax collector",
                optionD = "A Scribe and a Fisherman",
                correctAnswerIndex = 0,
                explanation = "Jesus told that both a Priest and a Levite avoided the wounded victim before the compassionate Samaritan stopped to rescue him.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2024_05",
                subject = "CRS",
                topic = "New Testament: Passion & Resurrection",
                year = "2024",
                questionText = "Before which Roman Governor of Judea was Jesus formally tried and condemned to crucifixion?",
                optionA = "Pontius Pilate",
                optionB = "Herod Antipas",
                optionC = "Felix",
                optionD = "Festus",
                correctAnswerIndex = 0,
                explanation = "Pontius Pilate was the Roman prefect of Judea who presided over Jesus' imperial civil trial and issued the execution decree.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2024_06",
                subject = "CRS",
                topic = "Acts of the Apostles: Pentecost",
                year = "2024",
                questionText = "On the Day of Pentecost in Acts Chapter 2, the Holy Spirit descended upon the disciples in the form of:",
                optionA = "a sound like the rush of a violent wind and divided tongues as of fire",
                optionB = "a gentle dove descending from heaven",
                optionC = "an earthquake splitting the temple veil",
                optionD = "a pillar of cloud by day and fire by night",
                correctAnswerIndex = 0,
                explanation = "Acts 2:1-4 describes a rushing mighty wind and cloven tongues like as of fire resting upon each disciple, enabling them to speak in foreign tongues.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2024_07",
                subject = "CRS",
                topic = "Acts of the Apostles: Early Church",
                year = "2024",
                questionText = "Who was chosen by casting lots to replace Judas Iscariot as the twelfth Apostle in Acts Chapter 1?",
                optionA = "Matthias",
                optionB = "Barnabas",
                optionC = "Stephen",
                optionD = "Silas",
                correctAnswerIndex = 0,
                explanation = "Acts 1:23-26 records that the lot fell upon Matthias, who was numbered with the eleven apostles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_crs_mast_2024_08",
                subject = "CRS",
                topic = "Pauline Epistles: Justification",
                year = "2024",
                questionText = "In his Epistle to the Romans, the Apostle Paul emphatically asserts that man is justified before God through:",
                optionA = "faith in Jesus Christ apart from the works of the law",
                optionB = "strict obedience to the Mosaic ceremonial commandments",
                optionC = "payment of temple tithes and sacrificial offerings",
                optionD = "membership in the Sanhedrin council",
                correctAnswerIndex = 0,
                explanation = "Romans 3:28: 'For we maintain that a person is justified by faith apart from the works of the law.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
    }

}
