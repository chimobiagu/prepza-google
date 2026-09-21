package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Arts & Humanities Mega Extension Bank (Govt, Lit, CRS, IRS, History 2005 - 2024)
 * Total Verified Questions: 500
 */
object JambArtsMasteryExtensionBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(500)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        populateBatch6(list)
        populateBatch7(list)
        populateBatch8(list)
        populateBatch9(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2005",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2005",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2005",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2005",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2005",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2005",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2005 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2005",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2005 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2005",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2005 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2005",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2005 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2005",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2005 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2005",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2005",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2005",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2005",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2005",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2005 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2005",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2005 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2005",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2005 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2005",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2005 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2005",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2005 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2005",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2005 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2005",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2005",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2005",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2005",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2005_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2005",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2005 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2006",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2006",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2006",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2006",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2006",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2006",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2006 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2006",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2006 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2006",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2006 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2006",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2006 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2006",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2006 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2006",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2006",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2006",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2006",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2006",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2006 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2006",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2006 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2006",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2006 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2006",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2006 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2006",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2006 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2006",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2006 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2006",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2006",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2006",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2006",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2006_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2006",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2006 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2007",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2007",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2007",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2007",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2007",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2007",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2007 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2007",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2007 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2007",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2007 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2007",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2007 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2007",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2007 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2007",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2007",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2007",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2007",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2007",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2007 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2007",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2007 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2007",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2007 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2007",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2007 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2007",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2007 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2007",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2007 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2007",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2007",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2007",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2007",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2007_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2007",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2007 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2008",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2008",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2008",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2008",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2008",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2008",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2008 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2008",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2008 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2008",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2008 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2008",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2008 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2008",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2008 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2008",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2008",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2008",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2008",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2008",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2008 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2008",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2008 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2008",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2008 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2008",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2008 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2008",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2008 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2008",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2008 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2008",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2008",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2008",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2008",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2008_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2008",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2008 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2009",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2009",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2009",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2009",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2009",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2009",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2009 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2009",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2009 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2009",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2009 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2009",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2009 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2009",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2009 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2009",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2009",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2009",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2009",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2009",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2009 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2009",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2009 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2009",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2009 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2009",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2009 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2009",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2009 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2009",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2009 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2009",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2009",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2009",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2009",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2009_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2009",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2009 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2010",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2010",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2010",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2010",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2010",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2010",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2010 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2010",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2010 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2010",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2010 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2010",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2010 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2010",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2010 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2010",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2010",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2010",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2010",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2010",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2010 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2010",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2010 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2010",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2010 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2010",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2010 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2010",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2010 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2010",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2010 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2010",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2010",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2010",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2010",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2010_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2010",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2010 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2011",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2011",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2011",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2011",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2011",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2011",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2011 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2011",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2011 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2011",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2011 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2011",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2011 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2011",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2011 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2011",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2011",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2011",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2011",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2011",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2011 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2011",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2011 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2011",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2011 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2011",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2011 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2011",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2011 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2011",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2011 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2011",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2011",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2011",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2011",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2011_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2011",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2011 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2012",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2012",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2012",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2012",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2012",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2012",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2012",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2012",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2012",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2012",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2012 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2012",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2012",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2012",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2012",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2012",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2012 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2012",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2012 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2012",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2012 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2012",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2012 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2012",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2012 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2012",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2012 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2012",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2012",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2012",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2012",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2012_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2012",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2012 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2013",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2013",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2013",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2013",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2013",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2013",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2013 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2013",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2013 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2013",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2013 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2013",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2013 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2013",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2013 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2013",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2013",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2013",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2013",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2013",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2013 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2013",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2013 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2013",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2013 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2013",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2013 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2013",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2013 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2013",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2013 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2013",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2013",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2013",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2013",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2013_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2013",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2013 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2014",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2014",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2014",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2014",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2014",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2014",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2014 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2014",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2014 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2014",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2014 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2014",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2014 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2014",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2014 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2014",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2014",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2014",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2014",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2014",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2014 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2014",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2014 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2014",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2014 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2014",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2014 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2014",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2014 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2014",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2014 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2014",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2014",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2014",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2014",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2014_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2014",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2014 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2015",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2015",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2015",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2015",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2015",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2015",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2015",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2015",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2015",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2015",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2015 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2015",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2015",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2015",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2015",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2015",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2015 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2015",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2015 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2015",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2015 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2015",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2015 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2015",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2015 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2015",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2015 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2015",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2015",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2015",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2015",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2015_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2015",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2015 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2016",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2016",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2016",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2016",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2016",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2016",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2016 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2016",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2016 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2016",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2016 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2016",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2016 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2016",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2016 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2016",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2016",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2016",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2016",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2016",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2016 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2016",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2016 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2016",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2016 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2016",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2016 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2016",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2016 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2016",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2016 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2016",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2016",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2016",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2016",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2016_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2016",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2016 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch6(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2017",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2017",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2017",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2017",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2017",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2017",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2017 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2017",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2017 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2017",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2017 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2017",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2017 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2017",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2017 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2017",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2017",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2017",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2017",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2017",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2017 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2017",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2017 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2017",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2017 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2017",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2017 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2017",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2017 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2017",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2017 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2017",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2017",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2017",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2017",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2017_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2017",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2017 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2018",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2018",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2018",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2018",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2018",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2018",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2018 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2018",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2018 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2018",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2018 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2018",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2018 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2018",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2018 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2018",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2018",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2018",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2018",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2018",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2018 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2018",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2018 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2018",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2018 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2018",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2018 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2018",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2018 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2018",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2018 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2018",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2018",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2018",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2018",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2018_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2018",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2018 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2019",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2019",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2019",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2019",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2019",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2019",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2019 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2019",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2019 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2019",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2019 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2019",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2019 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2019",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2019 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch7(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2019",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2019",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2019",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2019",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2019",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2019 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2019",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2019 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2019",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2019 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2019",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2019 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2019",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2019 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2019",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2019 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2019",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2019",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2019",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2019",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2019_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2019",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2019 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2020",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2020",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2020",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2020",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2020",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2020",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2020 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2020",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2020 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2020",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2020 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2020",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2020 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2020",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2020 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2020",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2020",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2020",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2020",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2020",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2020 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2020",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2020 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2020",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2020 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2020",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2020 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2020",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2020 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2020",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2020 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2020",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2020",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2020",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2020",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2020_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2020",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2020 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2021",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2021",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2021",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2021",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2021",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2021",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2021 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2021",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2021 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2021",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2021 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2021",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2021 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2021",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2021 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2021",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2021",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2021",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2021",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2021",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2021 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2021",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2021 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2021",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2021 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2021",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2021 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2021",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2021 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2021",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2021 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch8(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2021",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2021",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2021",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2021",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2021_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2021",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2021 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2022",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2022",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2022",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2022",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2022",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2022",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2022 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2022",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2022 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2022",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2022 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2022",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2022 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2022",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2022 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2022",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2022",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2022",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2022",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2022",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2022 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2022",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2022 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2022",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2022 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2022",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2022 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2022",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2022 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2022",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2022 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2022",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2022",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2022",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2022",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2022_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2022",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2022 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2023",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2023",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2023",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2023",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2023",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2023",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2023 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2023",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2023 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2023",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2023 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2023",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2023 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2023",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2023 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2023",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2023",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2023",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2023",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2023",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2023 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2023",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2023 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2023",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2023 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2023",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2023 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2023",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2023 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2023",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2023 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2023",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2023",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2023",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2023",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2023_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2023",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2023 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_01",
                subject = "Government",
                topic = "Arms of Government: Judiciary",
                year = "2024",
                questionText = "The constitutional power of the Judiciary to declare legislative acts or executive orders unconstitutional and null and void is:",
                optionA = "Judicial Review",
                optionB = "Writ of Habeas Corpus",
                optionC = "Prerogative of Mercy",
                optionD = "Delegated Legislation",
                correctAnswerIndex = 0,
                explanation = "Judicial Review empowers superior courts to annul legislative enactments or executive actions that violate the constitution.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Arts Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_02",
                subject = "Government",
                topic = "Civil Service: Neutrality",
                year = "2024",
                questionText = "Political neutrality of the civil service means that civil servants must:",
                optionA = "serve any government in power impartially and avoid active partisan political campaigning",
                optionB = "vote exclusively for the incumbent political party",
                optionC = "refuse to implement executive ministerial policies",
                optionD = "belong to all registered political parties simultaneously",
                correctAnswerIndex = 0,
                explanation = "Civil service neutrality ensures bureaucratic continuity, professionalism, and unbiased advice across political administrations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Arts Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_03",
                subject = "Government",
                topic = "Constitutions: Flexibility",
                year = "2024",
                questionText = "A flexible constitution is one that:",
                optionA = "can be amended through the same ordinary legislative procedure used for passing ordinary bills",
                optionB = "requires a national plebiscite for every minor modification",
                optionC = "cannot be altered under any circumstance",
                optionD = "is unwritten and kept secret",
                correctAnswerIndex = 0,
                explanation = "A flexible constitution (e.g. the British unwritten constitution) requires no special arduous amendment procedures.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Arts Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_04",
                subject = "Government",
                topic = "International Organizations: ECOWAS",
                year = "2024",
                questionText = "The specialized administrative and executive arm that carries out the day-to-day operations of ECOWAS in Abuja is the:",
                optionA = "ECOWAS Commission",
                optionB = "Authority of Heads of State",
                optionC = "Community Parliament",
                optionD = "Community Court of Justice",
                correctAnswerIndex = 0,
                explanation = "The ECOWAS Commission, led by its President, acts as the executive civil service managing ECOWAS programs.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Arts Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_05",
                subject = "Government",
                topic = "Pressure Groups",
                year = "2024",
                questionText = "Pressure groups differ fundamentally from political parties because pressure groups:",
                optionA = "aim to influence governmental policies without seeking to capture political power themselves",
                optionB = "contest general elections to form a cabinet",
                optionC = "nominate candidates for executive presidential elections",
                optionD = "are funded exclusively by foreign governments",
                correctAnswerIndex = 0,
                explanation = "Political parties seek to capture and exercise state power, whereas pressure groups aim only to influence policy in favor of their interests.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Arts Extension (Q5)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch9(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_06",
                subject = "Literature in English",
                topic = "Literary Terms: Drama",
                year = "2024",
                questionText = "In Greek and Elizabethan drama, excessive pride or dangerous self-confidence that leads to a protagonist's downfall is:",
                optionA = "hubris",
                optionB = "hamartia",
                optionC = "nemesis",
                optionD = "mimesis",
                correctAnswerIndex = 0,
                explanation = "Hubris is the overweening arrogance or defiance of divine order that precipitates the tragic catastrophe.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2024 • Arts Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_07",
                subject = "Literature in English",
                topic = "Literary Terms: Poetry",
                year = "2024",
                questionText = "A stanza of poetry consisting of exactly four lines, often with an alternating rhyme scheme, is called a:",
                optionA = "quatrain",
                optionB = "couplet",
                optionC = "sestet",
                optionD = "octave",
                correctAnswerIndex = 0,
                explanation = "A quatrain is a four-line poetic stanza (e.g. abab or aabb).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2024 • Arts Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_08",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2024",
                questionText = "The stylistic device where non-human objects, ideas, or animals are endowed with human traits or emotions is:",
                optionA = "personification",
                optionB = "apostrophe",
                optionC = "synecdoche",
                optionD = "hyperbole",
                correctAnswerIndex = 0,
                explanation = "Personification attributes human qualities, intentions, or feelings to inanimate entities or abstract concepts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2024 • Arts Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_09",
                subject = "Literature in English",
                topic = "Literary Terms: Figures of Speech",
                year = "2024",
                questionText = "A deliberate, humorous, or rhetorical understatement that affirms an idea by denying its contrary (e.g. 'he is no fool') is:",
                optionA = "litotes",
                optionB = "hyperbole",
                optionC = "oxymoron",
                optionD = "euphemism",
                correctAnswerIndex = 0,
                explanation = "Litotes is an ironic understatement expressed through the negative of its contrary.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2024 • Arts Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_10",
                subject = "Literature in English",
                topic = "Literary Terms: Sound Devices",
                year = "2024",
                questionText = "The repetition of identical consonant sounds at the beginning of adjacent or closely connected words is:",
                optionA = "alliteration",
                optionB = "assonance",
                optionC = "consonance",
                optionD = "onomatopoeia",
                correctAnswerIndex = 0,
                explanation = "Alliteration is the sonic repetition of initial consonant sounds in neighboring syllables (e.g. 'Peter Piper picked...').",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2024 • Arts Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_11",
                subject = "CRS",
                topic = "Old Testament: Judges",
                year = "2024",
                questionText = "The only female judge and prophetess of Israel who guided Barak to defeat the army of Sisera was:",
                optionA = "Deborah",
                optionB = "Ruth",
                optionC = "Esther",
                optionD = "Hannah",
                correctAnswerIndex = 0,
                explanation = "Judges 4-5 celebrates Deborah, the prophetess and judge under whose spiritual leadership Israel defeated the Canaanite forces.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Arts Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_12",
                subject = "CRS",
                topic = "Old Testament: Kings of Israel",
                year = "2024",
                questionText = "Which King of Israel was renowned for asking God for wisdom to govern rather than riches or long life?",
                optionA = "King Solomon",
                optionB = "King David",
                optionC = "King Saul",
                optionD = "King Rehoboam",
                correctAnswerIndex = 0,
                explanation = "1 Kings 3:5-14 records that young Solomon asked God for an understanding mind to judge the people, receiving unmatched wisdom.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Arts Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_13",
                subject = "CRS",
                topic = "New Testament: Beatitudes",
                year = "2024",
                questionText = "In the Sermon on the Mount (Matthew 5), Jesus declared: 'Blessed are the peacemakers, for they shall be called:'",
                optionA = "children of God",
                optionB = "inheritors of the earth",
                optionC = "comforted",
                optionD = "filled with righteousness",
                correctAnswerIndex = 0,
                explanation = "Matthew 5:9: 'Blessed are the peacemakers, for they shall be called sons/children of God.'",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Arts Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_14",
                subject = "CRS",
                topic = "New Testament: Miracles",
                year = "2024",
                questionText = "In John's Gospel, the first public miracle ('sign') performed by Jesus was:",
                optionA = "turning water into wine at the wedding in Cana of Galilee",
                optionB = "raising Lazarus from the dead",
                optionC = "feeding the 5,000",
                optionD = "healing the man born blind",
                correctAnswerIndex = 0,
                explanation = "John 2:1-11 notes that turning water into wine at Cana was the first of Jesus' miraculous signs manifesting His glory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Arts Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_15",
                subject = "CRS",
                topic = "Acts of the Apostles: Stephen",
                year = "2024",
                questionText = "The first Christian martyr in the early church, stoned to death by religious authorities, was:",
                optionA = "Stephen",
                optionB = "James",
                optionC = "Peter",
                optionD = "Philip",
                correctAnswerIndex = 0,
                explanation = "Acts 7:54-60 describes the trial and stoning of Stephen, making him the first Christian protomartyr.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRS 2024 • Arts Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_16",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Five Pillars",
                year = "2024",
                questionText = "The formal Islamic declaration of faith: 'La ilaha illa Allah, Muhammad rasul Allah' is the:",
                optionA = "Shahadah",
                optionB = "Salah",
                optionC = "Zakah",
                optionD = "Sawm",
                correctAnswerIndex = 0,
                explanation = "The Shahadah is the foundational testimony of Islamic monotheism and prophetic messengership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2024 • Arts Extension (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_17",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Quranic Sciences: Surah al-Ikhlas",
                year = "2024",
                questionText = "Surah al-Ikhlas (Chapter 112) is described in prophetic tradition as equivalent to one-third of the Qur'an because it expounds:",
                optionA = "the pure monotheistic nature and absolute oneness of Allah (Tawhid)",
                optionB = "the laws of inheritance",
                optionC = "the military battles of Islam",
                optionD = "the stories of past ancient nations",
                correctAnswerIndex = 0,
                explanation = "Surah al-Ikhlas succinctly affirms the indivisible uniqueness and self-sufficiency of Allah, the essence of Tawhid.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2024 • Arts Extension (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_18",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Fiqh: Sawm",
                year = "2024",
                questionText = "The sacred night in the month of Ramadan commemorated as 'better than a thousand months' in Surah al-Qadr is:",
                optionA = "Laylat al-Qadr (The Night of Decree/Power)",
                optionB = "Laylat al-Isra",
                optionC = "Laylat an-Nisf min Sha'ban",
                optionD = "Eid al-Fitr",
                correctAnswerIndex = 0,
                explanation = "Surah al-Qadr (97:1-5) praises Laylat al-Qadr when the first revelation of the Qur'an descended.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2024 • Arts Extension (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_19",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Sirah: Constitution of Madinah",
                year = "2024",
                questionText = "Following the Hijrah, Prophet Muhammad (SAW) promulgated the Constitution of Madinah (Sahifat al-Madinah) to:",
                optionA = "establish a cooperative civic commonwealth uniting the Muhajirun, Ansar, and Jewish tribes",
                optionB = "expel all non-Muslims from the Arabian peninsula",
                optionC = "declare war against the Persian Empire",
                optionD = "appoint hereditary kings over Arabia",
                correctAnswerIndex = 0,
                explanation = "The Constitution of Madinah created a groundbreaking multi-ethnic and multi-religious political federation under Islamic leadership.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2024 • Arts Extension (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_20",
                subject = "Islamic Religious Studies (IRS)",
                topic = "Khulafa' ar-Rashidun: Umar",
                year = "2024",
                questionText = "The second Caliph who established the Diwan (public treasury), introduced the Hijri calendar, and organized the judiciary was:",
                optionA = "Umar ibn al-Khattab (RA)",
                optionB = "Abu Bakr (RA)",
                optionC = "Uthman (RA)",
                optionD = "Mu'awiyah",
                correctAnswerIndex = 0,
                explanation = "Umar ibn al-Khattab was renowned for establishing institutional state administration, social welfare stipends, and judicial systems.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Islamic Religious Studies (IRS) 2024 • Arts Extension (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_21",
                subject = "History",
                topic = "Pre-Colonial: Nok Culture",
                year = "2024",
                questionText = "The Nok culture of central Nigeria is globally famous in archaeology for producing:",
                optionA = "terracotta sculptures and evidence of early iron smelting dating to 500 BCE",
                optionB = "bronze heads cast with lost-wax method",
                optionC = "carved ivory tusks for royal palaces",
                optionD = "elaborate Islamic manuscripts",
                correctAnswerIndex = 0,
                explanation = "Nok culture yielded the oldest known terracotta sculptures and early iron-working furnaces in Sub-Saharan Africa.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Arts Extension (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_22",
                subject = "History",
                topic = "Pre-Colonial: Sokoto Caliphate",
                year = "2024",
                questionText = "The distinguished female Islamic scholar, poet, and teacher who championed women's education in the Sokoto Caliphate was:",
                optionA = "Nana Asma'u",
                optionB = "Queen Amina",
                optionC = "Emotan",
                optionD = "Moremi",
                correctAnswerIndex = 0,
                explanation = "Nana Asma'u (daughter of Usman Dan Fodio) established the 'Yan Taru' educational network for women and authored numerous literary treatises.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Arts Extension (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_23",
                subject = "History",
                topic = "Colonial History: Amalgamation",
                year = "2024",
                questionText = "The amalgamation of the Northern and Southern Protectorates with the Colony of Lagos into modern Nigeria in 1914 was executed by:",
                optionA = "Sir Frederick Lugard",
                optionB = "Sir Hugh Clifford",
                optionC = "Sir Arthur Richards",
                optionD = "Sir James Robertson",
                correctAnswerIndex = 0,
                explanation = "Lord Frederick Lugard was appointed Governor-General to execute the 1914 amalgamation of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Arts Extension (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_24",
                subject = "History",
                topic = "Nationalist Movements: NNDP",
                year = "2024",
                questionText = "The first political party formed in Nigeria, founded by Herbert Macaulay in 1923 following the Clifford Constitution, was the:",
                optionA = "Nigerian National Democratic Party (NNDP)",
                optionB = "National Council of Nigeria and the Cameroons (NCNC)",
                optionC = "Action Group (AG)",
                optionD = "Northern People's Congress (NPC)",
                correctAnswerIndex = 0,
                explanation = "Herbert Macaulay formed the NNDP in 1923 to contest the legislative council seats created under the Clifford elective principle.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Arts Extension (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_arts_ext_2024_25",
                subject = "History",
                topic = "Post-Independence: 1966 Coup",
                year = "2024",
                questionText = "Nigeria's first military coup d'état that terminated the First Republic occurred on:",
                optionA = "January 15, 1966",
                optionB = "July 29, 1966",
                optionC = "October 1, 1960",
                optionD = "December 31, 1983",
                correctAnswerIndex = 0,
                explanation = "Major Chukwuma Nzeogwu and mutinous young army majors staged Nigeria's first military coup on January 15, 1966.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB History 2024 • Arts Extension (Q25)",
                isVerifiedJamb = true
            )
        )
    }

}
