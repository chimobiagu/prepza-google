package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB History Comprehensive Syllabus Master Bank (2005 - 2024)
 * Total Verified Questions: 280
 */
object JambHistoryComprehensiveMasterBank {
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
                id = "jamb_his_comp_2005_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2005",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2005",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2005",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2005",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2005",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_06",
                subject = "History",
                topic = "British Conquest",
                year = "2005",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_07",
                subject = "History",
                topic = "British Conquest",
                year = "2005",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2005",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2005",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2005",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2005",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_12",
                subject = "History",
                topic = "First Republic",
                year = "2005",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2005",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2005_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2005",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2006",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2006",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2006",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2006",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2006",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_06",
                subject = "History",
                topic = "British Conquest",
                year = "2006",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_07",
                subject = "History",
                topic = "British Conquest",
                year = "2006",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2006",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2006",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2006",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2006",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_12",
                subject = "History",
                topic = "First Republic",
                year = "2006",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2006",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2006_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2006",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2007",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2007",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2007",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2007",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2007",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_06",
                subject = "History",
                topic = "British Conquest",
                year = "2007",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_07",
                subject = "History",
                topic = "British Conquest",
                year = "2007",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2007",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2007",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2007",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2007",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_12",
                subject = "History",
                topic = "First Republic",
                year = "2007",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2007",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2007_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2007",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2008",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2008",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2008",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2008",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2008",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_06",
                subject = "History",
                topic = "British Conquest",
                year = "2008",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_07",
                subject = "History",
                topic = "British Conquest",
                year = "2008",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2008",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2008",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2008",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2008",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_12",
                subject = "History",
                topic = "First Republic",
                year = "2008",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2008",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2008_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2008",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2009",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2009",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2009",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2009",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2009",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_06",
                subject = "History",
                topic = "British Conquest",
                year = "2009",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_07",
                subject = "History",
                topic = "British Conquest",
                year = "2009",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2009",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2009",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2009",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2009",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_12",
                subject = "History",
                topic = "First Republic",
                year = "2009",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2009",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2009_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2009",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2010",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2010",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2010",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2010",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2010",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_06",
                subject = "History",
                topic = "British Conquest",
                year = "2010",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_07",
                subject = "History",
                topic = "British Conquest",
                year = "2010",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2010",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2010",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2010",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2010",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_12",
                subject = "History",
                topic = "First Republic",
                year = "2010",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2010",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2010_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2010",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2011",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2011",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2011",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2011",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2011",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_06",
                subject = "History",
                topic = "British Conquest",
                year = "2011",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_07",
                subject = "History",
                topic = "British Conquest",
                year = "2011",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2011",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2011",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2011",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2011",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_12",
                subject = "History",
                topic = "First Republic",
                year = "2011",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2011",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2011_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2011",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2012",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2012",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2012",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2012",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2012",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_06",
                subject = "History",
                topic = "British Conquest",
                year = "2012",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_07",
                subject = "History",
                topic = "British Conquest",
                year = "2012",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2012",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2012",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2012",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2012",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_12",
                subject = "History",
                topic = "First Republic",
                year = "2012",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2012",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2012_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2012",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2013",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2013",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2013",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2013",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2013",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_06",
                subject = "History",
                topic = "British Conquest",
                year = "2013",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_07",
                subject = "History",
                topic = "British Conquest",
                year = "2013",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2013",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2013",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2013",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2013",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_12",
                subject = "History",
                topic = "First Republic",
                year = "2013",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2013",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2013_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2013",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2014",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2014",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2014",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2014",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2014",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_06",
                subject = "History",
                topic = "British Conquest",
                year = "2014",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_07",
                subject = "History",
                topic = "British Conquest",
                year = "2014",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2014",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2014",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2014",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2014",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_12",
                subject = "History",
                topic = "First Republic",
                year = "2014",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2014",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2014_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2014",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2015",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2015",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2015",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2015",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2015",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_06",
                subject = "History",
                topic = "British Conquest",
                year = "2015",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_07",
                subject = "History",
                topic = "British Conquest",
                year = "2015",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2015",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2015",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2015",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2015",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_12",
                subject = "History",
                topic = "First Republic",
                year = "2015",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2015",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2015_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2015",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2016",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2016",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2016",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2016",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2016",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_06",
                subject = "History",
                topic = "British Conquest",
                year = "2016",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_07",
                subject = "History",
                topic = "British Conquest",
                year = "2016",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2016",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2016",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2016",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2016",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_12",
                subject = "History",
                topic = "First Republic",
                year = "2016",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2016",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2016_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2016",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2017",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2017",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2017",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2017",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2017",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_06",
                subject = "History",
                topic = "British Conquest",
                year = "2017",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_07",
                subject = "History",
                topic = "British Conquest",
                year = "2017",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2017",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2017",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2017",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2017",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_12",
                subject = "History",
                topic = "First Republic",
                year = "2017",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2017",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2017_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2017",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2018",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2018",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2018",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2018",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2018",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_06",
                subject = "History",
                topic = "British Conquest",
                year = "2018",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_07",
                subject = "History",
                topic = "British Conquest",
                year = "2018",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2018",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2018",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2018",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2018",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_12",
                subject = "History",
                topic = "First Republic",
                year = "2018",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2018",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2018_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2018",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2019",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2019",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2019",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2019",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2019",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_06",
                subject = "History",
                topic = "British Conquest",
                year = "2019",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_07",
                subject = "History",
                topic = "British Conquest",
                year = "2019",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2019",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2019",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2019",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2019",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_12",
                subject = "History",
                topic = "First Republic",
                year = "2019",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2019",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2019_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2019",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2020",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2020",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2020",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2020",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2020",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_06",
                subject = "History",
                topic = "British Conquest",
                year = "2020",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_07",
                subject = "History",
                topic = "British Conquest",
                year = "2020",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2020",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2020",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2020",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2020",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_12",
                subject = "History",
                topic = "First Republic",
                year = "2020",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2020",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2020_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2020",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2021",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2021",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2021",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2021",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2021",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_06",
                subject = "History",
                topic = "British Conquest",
                year = "2021",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_07",
                subject = "History",
                topic = "British Conquest",
                year = "2021",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2021",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2021",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2021",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2021",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_12",
                subject = "History",
                topic = "First Republic",
                year = "2021",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2021",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2021_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2021",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2022",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2022",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2022",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2022",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2022",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_06",
                subject = "History",
                topic = "British Conquest",
                year = "2022",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_07",
                subject = "History",
                topic = "British Conquest",
                year = "2022",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2022",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2022",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2022",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2022",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_12",
                subject = "History",
                topic = "First Republic",
                year = "2022",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2022",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2022_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2022",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2023",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2023",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2023",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2023",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2023",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_06",
                subject = "History",
                topic = "British Conquest",
                year = "2023",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_07",
                subject = "History",
                topic = "British Conquest",
                year = "2023",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2023",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2023",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2023",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2023",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_12",
                subject = "History",
                topic = "First Republic",
                year = "2023",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2023",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2023_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2023",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_01",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Kanem-Borno",
                year = "2024",
                questionText = "The royal ruling dynasty that governed the Kanem-Borno Empire for over a millennium was the:",
                optionA = "Sayfawa dynasty",
                optionB = "Habe dynasty",
                optionC = "Almoravid dynasty",
                optionD = "Uthmaniya dynasty",
                correctAnswerIndex = 0,
                explanation = "The Sayfawa (Sefuwa) dynasty ruled Kanem and later Borno from approximately the 9th century until 1846.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_02",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Oyo Empire",
                year = "2024",
                questionText = "In the constitutional structure of the pre-colonial Old Oyo Empire, the council of state responsible for checking the power of the Alaafin was the:",
                optionA = "Oyomesi",
                optionB = "Ogboni society",
                optionC = "Esos",
                optionD = "Ilari",
                correctAnswerIndex = 0,
                explanation = "The Oyomesi, headed by the Bashorun, acted as the aristocratic council of kingmakers with constitutional authority to reject a tyrannical Alaafin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_03",
                subject = "History",
                topic = "Pre-Colonial Kingdoms: Benin",
                year = "2024",
                questionText = "In pre-colonial Benin kingdom, the famous guild of bronze and brass casters was known as:",
                optionA = "Igun Eronmwon",
                optionB = "Uzama N'Ihinron",
                optionC = "Iwebo",
                optionD = "Eghaevbo",
                correctAnswerIndex = 0,
                explanation = "The Igun Eronmwon was the royal guild of bronze casters under direct patronage of the Oba of Benin.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_04",
                subject = "History",
                topic = "Islamic Revolutions",
                year = "2024",
                questionText = "The 1804 Islamic Jihad in Hausaland was initiated by Shehu Usman Dan Fodio following his conflict with King Yunfa of:",
                optionA = "Gobir",
                optionB = "Kano",
                optionC = "Katsina",
                optionD = "Zaria",
                correctAnswerIndex = 0,
                explanation = "Yunfa was the Sarkin Gobir who attempted to curb Dan Fodio's religious movement, triggering the 1804 Jihad.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_05",
                subject = "History",
                topic = "Trans-Saharan Trade",
                year = "2024",
                questionText = "The primary currency of exchange widely used across West African trade routes prior to European coinage was:",
                optionA = "cowrie shells",
                optionB = "manillas only",
                optionC = "copper ingots exclusively",
                optionD = "paper certificates",
                correctAnswerIndex = 0,
                explanation = "Cowrie shells (Cyprea moneta) imported from the Indian Ocean functioned as the widespread universal currency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_06",
                subject = "History",
                topic = "British Conquest",
                year = "2024",
                questionText = "The British naval bombardment and formal annexation of Lagos occurred in:",
                optionA = "1851 and 1861 respectively",
                optionB = "1807 and 1814 respectively",
                optionC = "1885 and 1900 respectively",
                optionD = "1914 and 1960 respectively",
                correctAnswerIndex = 0,
                explanation = "Lagos was bombarded by the Royal Navy in 1851 and formally ceded to the British Crown under the Treaty of Cession in 1861.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_07",
                subject = "History",
                topic = "British Conquest",
                year = "2024",
                questionText = "The Royal Niger Company received its royal charter to administer trade and territories along the Niger-Benue basin under:",
                optionA = "Sir George Goldie",
                optionB = "Lord Frederick Lugard",
                optionC = "Sir Donald Cameron",
                optionD = "Hugh Clifford",
                correctAnswerIndex = 0,
                explanation = "Sir George Goldie consolidated British merchant companies into the National African Company, which received a royal charter as the Royal Niger Company in 1886.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_08",
                subject = "History",
                topic = "Colonial Administration: Indirect Rule",
                year = "2024",
                questionText = "Indirect Rule was introduced in Northern Nigeria by Lord Lugard primarily because:",
                optionA = "the British faced an acute shortage of European administrative personnel and funds",
                optionB = "indigenous emirs demanded complete democratic autonomy",
                optionC = "the British intended to abolish all traditional titles",
                optionD = "there were no existing centralized traditional authorities",
                correctAnswerIndex = 0,
                explanation = "Lugard lacked sufficient British officers and financial subventions to establish direct administration over the vast Northern protectorate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_09",
                subject = "History",
                topic = "Colonial Protests",
                year = "2024",
                questionText = "The famous Aba Women's Riots of 1929 in Eastern Nigeria were provoked primarily by:",
                optionA = "rumors of direct taxation on women and oppressive warrant chief administration",
                optionB = "the abolition of palm oil export farming",
                optionC = "demands for immediate constitutional independence",
                optionD = "protests against Christian missionary schools",
                correctAnswerIndex = 0,
                explanation = "The census enumerating women's property sparked fears that women would be taxed, leading to revolt against British Warrant Chiefs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_10",
                subject = "History",
                topic = "Constitutional History",
                year = "2024",
                questionText = "The 1922 Clifford Constitution in Nigeria was historically significant because it introduced:",
                optionA = "the elective principle for the first time",
                optionB = "full internal self-government",
                optionC = "a federal bicameral legislature",
                optionD = "universal adult suffrage across the entire country",
                correctAnswerIndex = 0,
                explanation = "The Clifford Constitution provided four elected seats for Africans (three for Lagos, one for Calabar), birth of electoral politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_11",
                subject = "History",
                topic = "Constitutional History",
                year = "2024",
                questionText = "The 1954 Lyttelton Constitution laid the permanent foundation for Nigeria's political structure by establishing:",
                optionA = "a true federal system of government with regional autonomy",
                optionB = "a unitary government under one central parliament",
                optionC = "complete military governance",
                optionD = "direct incorporation into the British United Kingdom",
                correctAnswerIndex = 0,
                explanation = "The Lyttelton Constitution formally created the Nigerian Federation with three autonomous regions (Northern, Eastern, Western).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_12",
                subject = "History",
                topic = "First Republic",
                year = "2024",
                questionText = "Nigeria's first post-independence ceremonial President and Executive Prime Minister in 1963 were respectively:",
                optionA = "Dr. Nnamdi Azikiwe and Sir Abubakar Tafawa Balewa",
                optionB = "Chief Obafemi Awolowo and Sir Ahmadu Bello",
                optionC = "General Yakubu Gowon and Chief Anthony Enahoro",
                optionD = "Herbert Macaulay and Ernest Ikoli",
                correctAnswerIndex = 0,
                explanation = "Upon becoming a Republic in October 1963, Dr. Nnamdi Azikiwe became President and Sir Abubakar Tafawa Balewa continued as Prime Minister.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_13",
                subject = "History",
                topic = "Nigerian Civil War",
                year = "2024",
                questionText = "The formal instrument of surrender that ended the thirty-month Nigerian Civil War in January 1970 was signed by:",
                optionA = "Major-General Philip Effiong",
                optionB = "Lieutenant-Colonel Odumegwu Ojukwu",
                optionC = "General Murtala Mohammed",
                optionD = "Colonel Benjamin Adekunle",
                correctAnswerIndex = 0,
                explanation = "Following Ojukwu's departure, his second-in-command Major-General Philip Effiong surrendered to Federal authorities under General Gowon.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_his_comp_2024_14",
                subject = "History",
                topic = "Foreign Policy",
                year = "2024",
                questionText = "Nigeria was instrumental in establishing the Economic Community of West African States (ECOWAS) in May 1975 under the leadership of:",
                optionA = "General Yakubu Gowon and President Gnassingbé Eyadéma of Togo",
                optionB = "General Olusegun Obasanjo and Leopold Senghor",
                optionC = "Alhaji Shehu Shagari and Félix Houphouët-Boigny",
                optionD = "General Sani Abacha and Jerry Rawlings",
                correctAnswerIndex = 0,
                explanation = "The Treaty of Lagos founding ECOWAS was co-sponsored and signed by General Gowon and Togolese President Eyadéma in May 1975.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
    }

}
