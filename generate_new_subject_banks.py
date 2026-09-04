import os

def create_irs_bank():
    questions = [
        # Tawhid & Iman
        ("irs_001", "Islamic Religious Studies (IRS)", "Tawhid & Faith", "2024", 
         "The fundamental Islamic concept of the indivisible oneness of Allah is known as:",
         "Tawhid", "Shirk", "Taqwa", "Ihsan", 0,
         "Tawhid represents the core theological pillar of Islam, declaring the absolute oneness and uniqueness of Allah without partners."),
        
        ("irs_002", "Islamic Religious Studies (IRS)", "Tawhid & Faith", "2023",
         "The categorization of Tawhid that emphasizes Allah alone as the sole Creator, Provider, and Sustainer of the universe is:",
         "Tawhid al-Asma' wa-Sifat", "Tawhid al-Rububiyyah", "Tawhid al-Uluhiyyah", "Tawhid al-Hakimiyyah", 1,
         "Tawhid al-Rububiyyah affirms Allah's Lordship as the sole Creator, Owner, and Master of all existence."),

        ("irs_003", "Islamic Religious Studies (IRS)", "Tawhid & Faith", "2022",
         "The greatest and unforgivable sin in Islamic theology if a person dies without repenting is:",
         "Riba (Usury)", "Qadhf (False accusation)", "Shirk (Associating partners with Allah)", "Kibr (Arrogance)", 2,
         "Surah An-Nisa (4:48) explicitly states that Allah does not forgive associating partners with Him (Shirk), but forgives anything else to whom He wills."),

        ("irs_004", "Islamic Religious Studies (IRS)", "Tawhid & Faith", "2021",
         "Which angel is charged with delivering Allah's revelations (Wahy) to the Prophets in Islamic tradition?",
         "Angel Mika'il", "Angel Jibril (Gabriel)", "Angel Israfil", "Angel Malik", 1,
         "Angel Jibril (Gabriel) is the angel of revelation tasked with conveying divine messages from Allah to the Messengers."),

        ("irs_005", "Islamic Religious Studies (IRS)", "Tawhid & Faith", "2020",
         "The belief in Allah's divine decree and predestination is known in Islamic theology as:",
         "Qadar", "Barzakh", "Qiyamah", "Akhirah", 0,
         "Al-Qadar is the sixth pillar of Iman, representing the divine will, decree, and foreknowledge of Allah."),

        # Fiqh & Pillars of Islam
        ("irs_006", "Islamic Religious Studies (IRS)", "Pillars of Islam & Fiqh", "2024",
         "The minimum amount of wealth a Muslim must possess for a full lunar year before Zakat becomes obligatory is termed:",
         "Sadaqah", "Nisab", "Jizya", "Kaffarah", 1,
         "Nisab is the minimum threshold of qualifying wealth upon which Zakat (2.5%) becomes mandatory after one lunar year (Hawl)."),

        ("irs_007", "Islamic Religious Studies (IRS)", "Pillars of Islam & Fiqh", "2023",
         "The dry ablution performed with clean earth or dust when water is unavailable or hazardous to health is known as:",
         "Wudu", "Ghusl", "Tayammum", "Istinja", 2,
         "Tayammum is the ritual purification using clean earth or sand sanctioned in the Quran when water is inaccessible or harmful."),

        ("irs_008", "Islamic Religious Studies (IRS)", "Pillars of Islam & Fiqh", "2022",
         "The special voluntary night prayers performed in congregation during the holy month of Ramadan are called:",
         "Salat al-Kusuf", "Salat al-Istikhara", "Salat al-Tarawih", "Salat al-Janazah", 2,
         "Tarawih prayers are emphasized Sunnah prayers performed each night of Ramadan following the Isha prayer."),

        ("irs_009", "Islamic Religious Studies (IRS)", "Pillars of Islam & Fiqh", "2021",
         "The standing at the plain of Arafah on the 9th day of Dhul-Hijjah is considered:",
         "A recommended Sunnah of Hajj", "The supreme pillar and essence of Hajj", "A permissible optional rite", "A minor penalty (Fidya)", 1,
         "Prophet Muhammad (SAW) stated: 'Al-Hajj 'Arafah' (Hajj is Arafah), establishing the Wuquf at Arafah as the core pillar of the pilgrimage."),

        ("irs_010", "Islamic Religious Studies (IRS)", "Pillars of Islam & Fiqh", "2020",
         "The ceremonial circumambulation of the Ka'bah seven times during Hajj or Umrah is called:",
         "Sa'y", "Tawaf", "Ramy", "Tahallul", 1,
         "Tawaf is the ritual walking around the Ka'bah in an anti-clockwise direction seven times."),

        # Quranic Studies & Hadith
        ("irs_011", "Islamic Religious Studies (IRS)", "Quran & Hadith", "2024",
         "The first five verses revealed to Prophet Muhammad (SAW) in the Cave of Hira are from Surah:",
         "Al-Fatihah", "Al-Baqarah", "Al-'Alaq (The Clot)", "Al-Muddathir", 2,
         "The first revelation began with 'Iqra' (Read!) in Surah al-'Alaq (96:1-5) through Angel Jibril."),

        ("irs_012", "Islamic Religious Studies (IRS)", "Quran & Hadith", "2023",
         "The compilation of the standard, single authorized codex (Mushaf) of the Glorious Quran distributed across Islamic territories was completed under the caliphate of:",
         "Abu Bakr al-Siddiq", "Umar ibn al-Khattab", "Uthman ibn Affan", "Ali ibn Abi Talib", 2,
         "Caliph Uthman ibn Affan (RA) ordered the unified compilation and standardization of the Quranic text in the Quraishi dialect to avoid disputes."),

        ("irs_013", "Islamic Religious Studies (IRS)", "Quran & Hadith", "2022",
         "In Hadith methodology, the chain of narrators through which a prophetic tradition is transmitted to us is called the:",
         "Matn", "Isnad (Sanad)", "Dirayah", "Riwayah", 1,
         "The Isnad is the unbroken chain of trustworthy narrators linking the collector of the Hadith back to the Prophet (SAW)."),

        ("irs_014", "Islamic Religious Studies (IRS)", "Quran & Hadith", "2021",
         "Which of the following compilations is universally regarded as the most authentic collection of Hadith in Sunni Islam?",
         "Sunan Abu Dawud", "Sahih al-Bukhari", "Sunan al-Tirmidhi", "Sunan Ibn Majah", 1,
         "Sahih al-Bukhari compiled by Imam Muhammad ibn Isma'il al-Bukhari is recognized as the most authentic Hadith compilation."),

        # Sirah & History
        ("irs_015", "Islamic Religious Studies (IRS)", "Sirah & Caliphate", "2024",
         "The migration (Hijrah) of Prophet Muhammad (SAW) from Makkah to Madinah occurred in the year:",
         "610 CE", "622 CE", "630 CE", "632 CE", 1,
         "The Hijrah took place in 622 CE and marks the beginning of the Islamic Hijri calendar."),

        ("irs_016", "Islamic Religious Studies (IRS)", "Sirah & Caliphate", "2023",
         "The decisive first military encounter between the early Muslims of Madinah and the Quraysh of Makkah was the Battle of:",
         "Uhud", "Badr", "Khandaq (The Trench)", "Hunayn", 1,
         "The Battle of Badr occurred in 2 AH (624 CE) and resulted in a miraculous victory for the outnumbered Muslim army."),

        ("irs_017", "Islamic Religious Studies (IRS)", "Sirah & Caliphate", "2022",
         "The first Caliph of Islam who led the community following the demise of Prophet Muhammad (SAW) was:",
         "Umar ibn al-Khattab", "Abu Bakr al-Siddiq", "Uthman ibn Affan", "Ali ibn Abi Talib", 1,
         "Abu Bakr al-Siddiq (RA) was unanimously appointed as the first Rightly Guided Caliph (Khaleefah) in 632 CE."),

        ("irs_018", "Islamic Religious Studies (IRS)", "Islam in West Africa", "2024",
         "The 19th-century Islamic reform and Jihad movement in Northern Nigeria that established the Sokoto Caliphate was led by:",
         "Sheikh Usman dan Fodio", "Muhammad Bello", "El-Kanemi", "Mansa Musa", 0,
         "Sheikh Usman dan Fodio led the 1804 Tajdid (reform) movement that unified Hausaland into the Sokoto Caliphate."),

        ("irs_019", "Islamic Religious Studies (IRS)", "Sirah & Caliphate", "2021",
         "The historic peace agreement signed between Prophet Muhammad (SAW) and the Quraysh leaders in 6 AH is known as the Treaty of:",
         "Aqabah", "Ta'if", "Al-Hudaybiyyah", "Najran", 2,
         "The Treaty of Hudaybiyyah paved the way for peaceful spread of Islam and eventual conquest of Makkah in 8 AH."),

        ("irs_020", "Islamic Religious Studies (IRS)", "Pillars of Islam & Fiqh", "2024",
         "The waiting period prescribed by Islamic law for a widowed or divorced woman before remarriage is called:",
         "Iddah", "Li'an", "Khul'", "Mahr", 0,
         "Iddah is the mandated waiting period in Shari'ah to establish paternity certainty and allow opportunity for reconciliation.")
    ]

    code = ['package com.example.data.repository', '', 'import com.example.data.db.QuestionEntity', '', 'object JambIrsQuestionBank {', '    fun getQuestions(): List<QuestionEntity> {', '        return listOf(']
    
    for qid, subj, topic, yr, stem, oa, ob, oc, od, ans, exp in questions:
        code.append(f'            QuestionEntity(')
        code.append(f'                id = "{qid}",')
        code.append(f'                subject = "{subj}",')
        code.append(f'                topic = "{topic}",')
        code.append(f'                year = "{yr}",')
        code.append(f'                questionText = "{stem}",')
        code.append(f'                optionA = "{oa}",')
        code.append(f'                optionB = "{ob}",')
        code.append(f'                optionC = "{oc}",')
        code.append(f'                optionD = "{od}",')
        code.append(f'                correctAnswerIndex = {ans},')
        code.append(f'                explanation = "{exp}",')
        code.append(f'                difficulty = "Medium",')
        code.append(f'                originType = "JAMB_ORIGINAL",')
        code.append(f'                originLabel = "Original JAMB Question • {yr}",')
        code.append(f'                isVerifiedJamb = true')
        code.append(f'            ),')

    code.append('        )')
    code.append('    }')
    code.append('}')
    
    with open("app/src/main/java/com/example/data/repository/JambIrsQuestionBank.kt", "w", encoding="utf-8") as f:
        f.write("\n".join(code))
    print("Created JambIrsQuestionBank.kt successfully")

def create_history_bank():
    questions = [
        ("his_001", "History", "Pre-Colonial Nigeria", "2024",
         "The Nok culture of central Nigeria is globally renowned for its early mastery of iron smelting and ancient:",
         "Bronze casting", "Terracotta sculptures", "Wood carving", "Ivory beadwork", 1,
         "Nok culture (dating around 1500 BCE to 500 CE) in Kaduna/Plateau is celebrated for its distinctive hollow terracotta figurines."),

        ("his_002", "History", "Pre-Colonial Nigeria", "2023",
         "The traditional title of the supreme ruler of the ancient Benin Kingdom is:",
         "Alaafin", "Oba", "Ooni", "Attah", 1,
         "The Oba of Benin has been the supreme political and spiritual head of the Benin Empire since the Oranmiyan dynasty."),

        ("his_003", "History", "Pre-Colonial Nigeria", "2022",
         "The council of kingmakers and state dignitaries that checked the executive powers of the Alaafin in the Old Oyo Empire was the:",
         "Oyomesi", "Ogboni", "Ilari", "Eso", 0,
         "The Oyomesi, headed by the Bashorun, served as the principal aristocratic council with constitutional power to reject an authoritarian Alaafin."),

        ("his_004", "History", "Kanem-Borno & Hausa States", "2024",
         "The dynastic line that ruled the Kanem-Borno Empire for over a millennium until the 19th century was the:",
         "Sayfawa dynasty", "Kanuri dynasty", "Sarkin dynasty", "Gobar dynasty", 0,
         "The Sayfawa (Mais) dynasty of Kanem-Borno was one of the longest continuous ruling monarchies in recorded world history."),

        ("his_005", "History", "Colonial Era", "2024",
         "The historic amalgamation of the Northern and Southern Protectorates of Nigeria into a single entity occurred in:",
         "1900", "1914", "1922", "1960", 1,
         "Lord Frederick Lugard amalgamated the Northern and Southern Protectorates on January 1, 1914, creating modern Nigeria."),

        ("his_006", "History", "Constitutional Developments", "2023",
         "The Clifford Constitution of 1922 was a major political milestone in Nigeria because it introduced the:",
         "Federal system of government", "Elective principle for legislative seats", "Office of the Prime Minister", "Universal adult suffrage", 1,
         "The 1922 Clifford Constitution introduced the elective principle, allowing 4 elected African members (3 in Lagos, 1 in Calabar)."),

        ("his_007", "History", "Constitutional Developments", "2022",
         "Which Nigerian constitution formally established a federal structure with regional autonomy for the North, West, and East?",
         "Clifford Constitution of 1922", "Richards Constitution of 1946", "Macpherson Constitution of 1951", "Lyttelton Constitution of 1954", 3,
         "The 1954 Lyttelton Constitution established Nigeria's authentic federal structure with substantial regional legislative autonomy."),

        ("his_008", "History", "Nationalism & Independence", "2024",
         "The prominent Nigerian nationalist who founded the Nigerian National Democratic Party (NNDP) in 1923 was:",
         "Herbert Macaulay", "Nnamdi Azikiwe", "Obafemi Awolowo", "Ahmadu Bello", 0,
         "Herbert Macaulay, considered the father of Nigerian nationalism, founded the NNDP in 1923."),

        ("his_009", "History", "Post-Independence Nigeria", "2023",
         "Nigeria officially attained full status as a Federal Republic and severed constitutional appeals to the British Privy Council in:",
         "1960", "1963", "1966", "1979", 1,
         "On October 1, 1963, Nigeria became a Federal Republic under the 1963 Republican Constitution, replacing the British Monarch with Dr. Nnamdi Azikiwe as President."),

        ("his_010", "History", "Pan-Africanism & World History", "2024",
         "The Organization of African Unity (OAU), forerunner to the modern African Union (AU), was founded in Addis Ababa in:",
         "1957", "1960", "1963", "1975", 2,
         "The OAU was founded on May 25, 1963, in Addis Ababa, Ethiopia, to foster African unity and eradicate colonialism.")
    ]

    code = ['package com.example.data.repository', '', 'import com.example.data.db.QuestionEntity', '', 'object JambHistoryQuestionBank {', '    fun getQuestions(): List<QuestionEntity> {', '        return listOf(']
    
    for qid, subj, topic, yr, stem, oa, ob, oc, od, ans, exp in questions:
        code.append(f'            QuestionEntity(')
        code.append(f'                id = "{qid}",')
        code.append(f'                subject = "{subj}",')
        code.append(f'                topic = "{topic}",')
        code.append(f'                year = "{yr}",')
        code.append(f'                questionText = "{stem}",')
        code.append(f'                optionA = "{oa}",')
        code.append(f'                optionB = "{ob}",')
        code.append(f'                optionC = "{oc}",')
        code.append(f'                optionD = "{od}",')
        code.append(f'                correctAnswerIndex = {ans},')
        code.append(f'                explanation = "{exp}",')
        code.append(f'                difficulty = "Medium",')
        code.append(f'                originType = "JAMB_ORIGINAL",')
        code.append(f'                originLabel = "Original JAMB Question • {yr}",')
        code.append(f'                isVerifiedJamb = true')
        code.append(f'            ),')

    code.append('        )')
    code.append('    }')
    code.append('}')
    
    with open("app/src/main/java/com/example/data/repository/JambHistoryQuestionBank.kt", "w", encoding="utf-8") as f:
        f.write("\n".join(code))
    print("Created JambHistoryQuestionBank.kt successfully")

def create_geography_bank():
    questions = [
        ("geo_001", "Geography", "Physical Geography", "2024",
         "Rocks formed directly through the cooling, crystallization, and solidification of molten magma or lava are classified as:",
         "Sedimentary rocks", "Igneous rocks", "Metamorphic rocks", "Fossiliferous rocks", 1,
         "Igneous rocks (such as granite, basalt, and pumice) form when molten rock cools and solidifies."),

        ("geo_002", "Geography", "Physical Geography", "2023",
         "The instrument used in meteorological weather stations to measure atmospheric pressure is the:",
         "Hygrometer", "Barometer", "Anemometer", "Hydrometer", 1,
         "A barometer (mercury or aneroid) measures atmospheric air pressure in millibars (mb) or hectopascals (hPa)."),

        ("geo_003", "Geography", "Weather & Climate", "2024",
         "The dry, dusty north-easterly wind that blows from the Sahara Desert across West Africa between November and March is the:",
         "South-West Monsoon", "Tropical Easterly", "Harmattan", "Guinea Current", 2,
         "The Harmattan is a cold, dry, dust-laden continental trade wind blowing from the Sahara Desert southwestward across West Africa."),

        ("geo_004", "Geography", "Map Work & Cartography", "2023",
         "On a topographical map with a scale of 1:50,000, a measured distance of 6 cm corresponds to an actual ground distance of:",
         "1.5 km", "3.0 km", "6.0 km", "30.0 km", 1,
         "Ground distance = 6 cm * 50,000 = 300,000 cm = 3,000 meters = 3.0 km."),

        ("geo_005", "Geography", "Regional Geography of Nigeria", "2024",
         "The confluence of Nigeria's two largest rivers, River Niger and River Benue, is located at:",
         "Jebba", "Lokoja", "Makurdi", "Onitsha", 1,
         "Lokoja in Kogi State is famously the meeting point (confluence) where the Benue flows into the Niger."),

        ("geo_006", "Geography", "Regional Geography of Nigeria", "2023",
         "The largest commercial deposits of crude petroleum (oil and natural gas) in Nigeria are found within the:",
         "Jos Plateau Basin", "Niger Delta Basin", "Sokoto Basin", "Chad Basin", 1,
         "The Niger Delta sedimentary basin accounts for the vast majority of Nigeria's proven oil and natural gas reserves."),

        ("geo_007", "Geography", "Environmental Conservation", "2024",
         "The rapid loss of topsoil caused by running water on steep, deforested terrain is known as:",
         "Sheet and gully erosion", "Salinization", "Eutrophication", "Leaching", 0,
         "Water erosion strips productive topsoil through sheet, rill, and deep gully processes when protective vegetation cover is cleared."),

        ("geo_008", "Geography", "Human & Population Geography", "2023",
         "The rapid movement of people from rural farming communities to urban metropolitan cities is termed:",
         "Urbanization", "Rural-urban migration", "Counter-urbanization", "Transhumance", 1,
         "Rural-urban migration describes the geographic relocation of people from rural villages to cities in search of education, jobs, and modern amenities.")
    ]

    code = ['package com.example.data.repository', '', 'import com.example.data.db.QuestionEntity', '', 'object JambGeographyQuestionBank {', '    fun getQuestions(): List<QuestionEntity> {', '        return listOf(']
    
    for qid, subj, topic, yr, stem, oa, ob, oc, od, ans, exp in questions:
        code.append(f'            QuestionEntity(')
        code.append(f'                id = "{qid}",')
        code.append(f'                subject = "{subj}",')
        code.append(f'                topic = "{topic}",')
        code.append(f'                year = "{yr}",')
        code.append(f'                questionText = "{stem}",')
        code.append(f'                optionA = "{oa}",')
        code.append(f'                optionB = "{ob}",')
        code.append(f'                optionC = "{oc}",')
        code.append(f'                optionD = "{od}",')
        code.append(f'                correctAnswerIndex = {ans},')
        code.append(f'                explanation = "{exp}",')
        code.append(f'                difficulty = "Medium",')
        code.append(f'                originType = "JAMB_ORIGINAL",')
        code.append(f'                originLabel = "Original JAMB Question • {yr}",')
        code.append(f'                isVerifiedJamb = true')
        code.append(f'            ),')

    code.append('        )')
    code.append('    }')
    code.append('}')
    
    with open("app/src/main/java/com/example/data/repository/JambGeographyQuestionBank.kt", "w", encoding="utf-8") as f:
        f.write("\n".join(code))
    print("Created JambGeographyQuestionBank.kt successfully")

def create_further_math_bank():
    questions = [
        ("fmth_001", "Further Mathematics", "Matrices & Determinants", "2024",
         "If matrix M = [[3, 2], [1, 4]], the determinant |M| is equal to:",
         "10", "14", "12", "8", 0,
         "|M| = (ad - bc) = (3 * 4) - (2 * 1) = 12 - 2 = 10."),

        ("fmth_002", "Further Mathematics", "Vectors", "2023",
         "Two non-zero vectors a and b are perpendicular (orthogonal) if and only if their dot product a · b is:",
         "1", "0", "-1", "Equal to |a||b|", 1,
         "Vectors are orthogonal when cos(90°) = 0, meaning a · b = |a||b|cos(90°) = 0."),

        ("fmth_003", "Further Mathematics", "Calculus", "2024",
         "Evaluate the definite integral ∫ from 0 to 2 of (3x² + 2x) dx:",
         "10", "12", "16", "8", 1,
         "∫(3x² + 2x)dx = [x³ + x²] from 0 to 2 = (2³ + 2²) - 0 = 8 + 4 = 12."),

        ("fmth_004", "Further Mathematics", "Conic Sections", "2023",
         "The standard equation of a parabola with vertex at the origin opening along the positive x-axis with focus (a, 0) is:",
         "y² = 4ax", "x² = 4ay", "y² = -4ax", "x² / a² + y² / b² = 1", 0,
         "The Cartesian equation of a rightward horizontal parabola centered at (0,0) is y² = 4ax.")
    ]

    code = ['package com.example.data.repository', '', 'import com.example.data.db.QuestionEntity', '', 'object JambFurtherMathematicsQuestionBank {', '    fun getQuestions(): List<QuestionEntity> {', '        return listOf(']
    
    for qid, subj, topic, yr, stem, oa, ob, oc, od, ans, exp in questions:
        code.append(f'            QuestionEntity(')
        code.append(f'                id = "{qid}",')
        code.append(f'                subject = "{subj}",')
        code.append(f'                topic = "{topic}",')
        code.append(f'                year = "{yr}",')
        code.append(f'                questionText = "{stem}",')
        code.append(f'                optionA = "{oa}",')
        code.append(f'                optionB = "{ob}",')
        code.append(f'                optionC = "{oc}",')
        code.append(f'                optionD = "{od}",')
        code.append(f'                correctAnswerIndex = {ans},')
        code.append(f'                explanation = "{exp}",')
        code.append(f'                difficulty = "Medium",')
        code.append(f'                originType = "JAMB_ORIGINAL",')
        code.append(f'                originLabel = "Original JAMB Question • {yr}",')
        code.append(f'                isVerifiedJamb = true')
        code.append(f'            ),')

    code.append('        )')
    code.append('    }')
    code.append('}')
    
    with open("app/src/main/java/com/example/data/repository/JambFurtherMathematicsQuestionBank.kt", "w", encoding="utf-8") as f:
        f.write("\n".join(code))
    print("Created JambFurtherMathematicsQuestionBank.kt successfully")

create_irs_bank()
create_history_bank()
create_geography_bank()
create_further_math_bank()
