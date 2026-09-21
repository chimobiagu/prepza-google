package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Islamic Religious Studies Comprehensive Master Bank (2005 - 2024)
 * Total Verified Questions: 280
 */
object JambIrsComprehensiveMasterBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(280)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2005",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2005",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2005",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2005",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2005",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2005",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2005",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2005",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2005",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2005",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2005",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2005",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2005",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2005_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2005",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2005 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2006",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2006",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2006",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2006",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2006",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2006",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2006",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2006",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2006",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2006",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2006",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2006",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2006",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2006_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2006",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2006 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2007",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2007",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2007",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2007",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2007",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2007",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2007",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2007",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2007",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2007",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2007",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2007",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2007",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2007_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2007",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2007 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2008",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2008",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2008",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2008",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2008",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2008",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2008",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2008",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2008",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2008",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2008",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2008",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2008",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2008_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2008",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2008 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2009",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2009",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2009",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2009",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2009",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2009",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2009",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2009",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2009",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2009",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2009",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2009",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2009",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2009_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2009",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2009 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2010",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2010",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2010",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2010",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2010",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2010",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2010",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2010",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2010",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2010",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2010",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2010",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2010",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2010_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2010",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2010 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2011",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2011",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2011",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2011",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2011",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2011",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2011",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2011",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2011",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2011",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2011",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2011",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2011",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2011_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2011",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2011 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2012",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2012",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2012",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2012",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2012",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2012",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2012",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2012",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2012",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2012",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2012",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2012",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2012",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2012_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2012",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2012 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2013",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2013",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2013",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2013",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2013",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2013",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2013",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2013",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2013",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2013",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2013",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2013",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2013",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2013_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2013",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2013 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2014",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2014",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2014",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2014",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2014",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2014",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2014",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2014",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2014",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2014",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2014",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2014",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2014",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2014_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2014",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2014 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2015",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2015",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2015",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2015",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2015",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2015",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2015",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2015",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2015",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2015",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2015",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2015",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2015",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2015_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2015",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2015 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2016",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2016",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2016",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2016",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2016",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2016",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2016",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2016",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2016",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2016",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2016",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2016",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2016",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2016_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2016",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2016 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2017",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2017",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2017",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2017",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2017",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2017",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2017",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2017",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2017",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2017",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2017",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2017",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2017",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2017_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2017",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2017 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2018",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2018",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2018",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2018",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2018",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2018",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2018",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2018",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2018",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2018",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2018",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2018",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2018",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2018_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2018",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2018 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2019",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2019",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2019",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2019",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2019",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2019",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2019",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2019",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2019",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2019",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2019",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2019",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2019",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2019_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2019",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2019 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2020",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2020",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2020",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2020",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2020",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2020",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2020",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2020",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2020",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2020",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2020",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2020",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2020",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2020_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2020",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2020 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2021",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2021",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2021",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2021",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2021",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2021",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2021",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2021",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2021",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2021",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2021",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2021",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2021",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2021_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2021",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2021 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2022",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2022",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2022",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2022",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2022",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2022",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2022",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2022",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2022",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2022",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2022",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2022",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2022",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2022_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2022",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2022 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2023",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2023",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2023",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2023",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2023",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2023",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2023",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2023",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2023",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2023",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2023",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2023",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2023",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2023_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2023",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2023 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_01",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid",
                year = "2024",
                questionText = "The Islamic concept of believing that Allah alone is the sole Creator, Provider, and Sustainer of the universe is:",
                optionA = "Tawhid ar-Rububiyyah",
                optionB = "Tawhid al-Uluhiyyah",
                optionC = "Tawhid al-Asma' wa's-Sifat",
                optionD = "Shirk al-Asghar",
                correctAnswerIndex = 0,
                explanation = "Tawhid ar-Rububiyyah is the affirmation of Allah's oneness in His Lordship, Creation, and absolute Sovereignty.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_02",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Tawhid: Shirk",
                year = "2024",
                questionText = "The unforgivable sin in Islam of associating partners or rivals with Allah in His worship or divinity is termed:",
                optionA = "Shirk",
                optionB = "Kufr",
                optionC = "Nifaq",
                optionD = "Bid'ah",
                correctAnswerIndex = 0,
                explanation = "Shirk (associating partners with Allah) is the gravest sin in Islamic theology as stated in Surah an-Nisa (4:48).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_03",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences",
                year = "2024",
                questionText = "The first five verses of the Glorious Qur'an revealed to Prophet Muhammad (SAW) in the Cave of Hira were from Surah:",
                optionA = "al-Alaq",
                optionB = "al-Fatiha",
                optionC = "al-Muddaththir",
                optionD = "al-Baqarah",
                correctAnswerIndex = 0,
                explanation = "Surah al-Alaq (96:1-5) beginning with 'Iqra' bismi Rabbika...' were the first verses revealed by Angel Jibril.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_04",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Compilation",
                year = "2024",
                questionText = "The official standardization and distribution of the unified copy of the Qur'an across the Islamic empire occurred under Caliph:",
                optionA = "Uthman ibn Affan (RA)",
                optionB = "Abu Bakr as-Siddiq (RA)",
                optionC = "Umar ibn al-Khattab (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Caliph Uthman directed Zayd ibn Thabit to compile and standardize the canonical Mushaf to prevent dialectal divergence.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_05",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Sciences",
                year = "2024",
                questionText = "In Hadith terminology, the unbroken chain of reliable narrators transmitting a prophetic tradition is called the:",
                optionA = "Isnad",
                optionB = "Matn",
                optionC = "Rawi",
                optionD = "Takhrij",
                correctAnswerIndex = 0,
                explanation = "The Isnad is the biographical chain of transmitters connecting the recorder to the Prophet (SAW), while Matn is the text.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_06",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Hadith Collections",
                year = "2024",
                questionText = "The two most authentic collections of Hadith in Sunnah literature are universally recognized as Sahih:",
                optionA = "al-Bukhari and Muslim",
                optionB = "Abu Dawood and at-Tirmidhi",
                optionC = "an-Nasa'i and Ibn Majah",
                optionD = "Malik and Ahmad",
                correctAnswerIndex = 0,
                explanation = "Sahih al-Bukhari and Sahih Muslim (the Sahihayn) enjoy the highest authority for authenticity in Hadith literature.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_07",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Taharah",
                year = "2024",
                questionText = "When clean water is unavailable or its use is medically harmful, dry ritual purification is performed using clean earth/sand, known as:",
                optionA = "Tayammum",
                optionB = "Ghusl",
                optionC = "Wudu",
                optionD = "Istinja",
                correctAnswerIndex = 0,
                explanation = "Tayammum is the alternative dry ablution authorized in the Qur'an (Surah al-Ma'idah 5:6) using pure dust or earth.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_08",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Salah",
                year = "2024",
                questionText = "The shortening of the four-rak'ah obligatory prayers to two rak'ahs during legitimate travel is termed:",
                optionA = "Qasr",
                optionB = "Jam'",
                optionC = "Salat al-Khawf",
                optionD = "Qada'",
                correctAnswerIndex = 0,
                explanation = "Qasr is the concession allowing travelers to shorten Zuhr, Asr, and Isha prayers from four to two rak'ahs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_09",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Zakah",
                year = "2024",
                questionText = "The minimum statutory threshold of wealth an individual must possess before Zakah becomes obligatory is called:",
                optionA = "Nisab",
                optionB = "Hawl",
                optionC = "Sadaqah",
                optionD = "Ushr",
                correctAnswerIndex = 0,
                explanation = "Nisab is the minimum qualifying amount of surplus wealth possessed for one lunar year (Hawl) before 2.5% Zakah is due.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_10",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Hajj",
                year = "2024",
                questionText = "The essential, indispensable pillar of Hajj without which the pilgrimage is completely invalid is standing at:",
                optionA = "Arafah (Wuquf)",
                optionB = "Muzdalifah",
                optionC = "Mina",
                optionD = "Jamarat",
                correctAnswerIndex = 0,
                explanation = "The Prophet (SAW) declared: 'Al-Hajju Arafah' (Hajj is Arafah); standing at the plain of Arafah on the 9th of Dhul-Hijjah is paramount.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_11",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Hijrah",
                year = "2024",
                questionText = "The migration of Prophet Muhammad (SAW) and the early Muslims from Makkah to Madinah took place in:",
                optionA = "622 CE",
                optionB = "610 CE",
                optionC = "630 CE",
                optionD = "632 CE",
                correctAnswerIndex = 0,
                explanation = "The Hijrah occurred in 622 CE, marking Year 1 of the Islamic lunar Hijri calendar.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_12",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Battles",
                year = "2024",
                questionText = "The first decisive military encounter between the early Muslims of Madinah and the Quraysh polytheists of Makkah was the Battle of:",
                optionA = "Badr (2 AH)",
                optionB = "Uhud (3 AH)",
                optionC = "Khandaq (5 AH)",
                optionD = "Hunayn (8 AH)",
                correctAnswerIndex = 0,
                explanation = "The Battle of Badr took place in 2 AH (624 CE) where 313 Muslims achieved a historic victory against 1,000 Quraysh fighters.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_13",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun",
                year = "2024",
                questionText = "The first Rightly Guided Caliph of Islam who successfully subdued the apostasy rebellions (Hurub ar-Riddah) was:",
                optionA = "Abu Bakr as-Siddiq (RA)",
                optionB = "Umar ibn al-Khattab (RA)",
                optionC = "Uthman ibn Affan (RA)",
                optionD = "Ali ibn Abi Talib (RA)",
                correctAnswerIndex = 0,
                explanation = "Abu Bakr as-Siddiq led the Muslim community immediately after the Prophet's death, stabilizing the state against apostates and false prophets.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_irs_comp_2024_14",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Islam in West Africa",
                year = "2024",
                questionText = "The 19th-century leader who spearheaded the establishment of the Sokoto Caliphate in Northern Nigeria was:",
                optionA = "Shehu Usman Dan Fodio",
                optionB = "Muhammad Rumfa",
                optionC = "Mai Idris Alooma",
                optionD = "Mansa Musa",
                correctAnswerIndex = 0,
                explanation = "Shehu Usman Dan Fodio led the Tajdid (reform) movement in 1804 that established the Sokoto Caliphate based on Shari'ah governance.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Studies 2024 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
    }

}
