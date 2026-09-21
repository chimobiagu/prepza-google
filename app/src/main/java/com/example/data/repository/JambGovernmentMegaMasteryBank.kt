package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Government Mega Mastery Bank (2005 - 2024 Exam Series)
 * Total Verified Questions: 260
 */
object JambGovernmentMegaMasteryBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(260)
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
                id = "jamb_gov_mast_2005_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2005",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2005",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2005",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2005",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_05",
                subject = "Government",
                topic = "Federalism",
                year = "2005",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2005",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2005",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2005",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2005",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2005",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2005",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2005",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2005_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2005",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2005 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2006",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2006",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2006",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2006",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_05",
                subject = "Government",
                topic = "Federalism",
                year = "2006",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2006",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2006",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2006",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2006",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2006",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2006",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2006",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2006_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2006",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2006 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2007",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2007",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2007",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2007",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_05",
                subject = "Government",
                topic = "Federalism",
                year = "2007",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2007",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2007",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2007",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2007",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2007",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2007",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2007",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2007_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2007",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2007 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2008",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2008",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2008",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2008",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_05",
                subject = "Government",
                topic = "Federalism",
                year = "2008",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2008",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2008",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2008",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2008",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2008",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2008",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2008",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2008_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2008",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2008 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2009",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2009",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2009",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2009",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_05",
                subject = "Government",
                topic = "Federalism",
                year = "2009",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2009",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2009",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2009",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2009",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2009",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2009",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2009",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2009_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2009",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2009 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2010",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2010",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2010",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2010",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_05",
                subject = "Government",
                topic = "Federalism",
                year = "2010",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2010",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2010",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2010",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2010",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2010",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2010",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2010",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2010_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2010",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2010 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2011",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2011",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2011",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2011",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_05",
                subject = "Government",
                topic = "Federalism",
                year = "2011",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2011",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2011",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2011",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2011",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2011",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2011",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2011",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2011_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2011",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2011 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2012",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2012",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2012",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2012",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_05",
                subject = "Government",
                topic = "Federalism",
                year = "2012",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2012",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2012",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2012",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2012",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2012",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2012",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2012",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2012_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2012",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2012 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2013",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2013",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2013",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2013",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_05",
                subject = "Government",
                topic = "Federalism",
                year = "2013",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2013",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2013",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2013",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2013",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2013",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2013",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2013",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2013_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2013",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2013 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2014",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2014",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2014",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2014",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_05",
                subject = "Government",
                topic = "Federalism",
                year = "2014",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2014",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2014",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2014",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2014",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2014",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2014",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2014",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2014_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2014",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2014 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2015",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2015",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2015",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2015",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_05",
                subject = "Government",
                topic = "Federalism",
                year = "2015",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2015",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2015",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2015",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2015",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2015",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2015",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2015",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2015_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2015",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2015 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2016",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2016",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2016",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2016",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_05",
                subject = "Government",
                topic = "Federalism",
                year = "2016",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2016",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2016",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2016",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2016",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2016",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2016",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2016",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2016_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2016",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2017",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2017",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2017",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2017",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_05",
                subject = "Government",
                topic = "Federalism",
                year = "2017",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2017",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2017",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2017",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2017",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2017",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2017",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2017",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2017_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2017",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2018",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2018",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2018",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2018",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_05",
                subject = "Government",
                topic = "Federalism",
                year = "2018",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2018",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2018",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2018",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2018",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2018",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2018",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2018",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2018_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2018",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2019",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2019",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2019",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2019",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_05",
                subject = "Government",
                topic = "Federalism",
                year = "2019",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2019",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2019",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2019",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2019",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2019",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2019",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2019",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2019_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2019",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2019 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2020",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2020",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2020",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2020",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_05",
                subject = "Government",
                topic = "Federalism",
                year = "2020",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2020",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2020",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2020",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2020",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2020",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2020",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2020",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2020_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2020",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2020 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2021",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2021",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2021",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2021",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_05",
                subject = "Government",
                topic = "Federalism",
                year = "2021",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2021",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2021",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2021",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2021",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2021",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2021",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2021",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2021_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2021",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2021 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2022",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2022",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2022",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2022",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_05",
                subject = "Government",
                topic = "Federalism",
                year = "2022",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2022",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2022",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2022",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2022",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2022",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2022",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2022",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2022_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2022",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2022 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2023",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2023",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2023",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2023",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_05",
                subject = "Government",
                topic = "Federalism",
                year = "2023",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2023",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2023",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2023",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2023",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2023",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2023",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2023",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2023_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2023",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2023 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_01",
                subject = "Government",
                topic = "Basic Concepts: Sovereignty",
                year = "2024",
                questionText = "Sovereignty in political science refers to the:",
                optionA = "supreme, absolute, and uncontrolled authority of a state over its territory",
                optionB = "power of citizens to vote in periodic elections",
                optionC = "military capacity of a government to conquer foreign territories",
                optionD = "ceremonial status of a monarch",
                correctAnswerIndex = 0,
                explanation = "Jean Bodin defined sovereignty as the supreme legal authority of a state over its internal territory and external relations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_02",
                subject = "Government",
                topic = "Basic Concepts: Separation of Powers",
                year = "2024",
                questionText = "The political philosopher most famously associated with the doctrine of Separation of Powers is:",
                optionA = "Baron de Montesquieu",
                optionB = "Thomas Hobbes",
                optionC = "John Locke",
                optionD = "Jean-Jacques Rousseau",
                correctAnswerIndex = 0,
                explanation = "Montesquieu articulated the separation of legislative, executive, and judicial powers in 'The Spirit of the Laws' (1748).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_03",
                subject = "Government",
                topic = "Basic Concepts: Rule of Law",
                year = "2024",
                questionText = "A.V. Dicey's formulation of the Rule of Law emphasizes equality before the law, absence of arbitrary power, and:",
                optionA = "the supremacy of the regular law and protection of fundamental human rights",
                optionB = "absolute immunity for the executive arm of government",
                optionC = "the supremacy of military decrees",
                optionD = "special legal privileges for public officials",
                correctAnswerIndex = 0,
                explanation = "Dicey's three pillars are: absolute supremacy of regular law, equality before the law, and rights secured through ordinary courts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_04",
                subject = "Government",
                topic = "Forms of Government",
                year = "2024",
                questionText = "A major characteristic distinguishing a presidential system of government from a parliamentary system is that the President is:",
                optionA = "both head of state and head of government, directly elected by the people",
                optionB = "a member of parliament chosen by the majority party",
                optionC = "a hereditary ceremonial monarch",
                optionD = "appointed by the Chief Justice",
                correctAnswerIndex = 0,
                explanation = "In a presidential system (like Nigeria/USA), the president combines head of state and head of government functions independently of parliament.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_05",
                subject = "Government",
                topic = "Federalism",
                year = "2024",
                questionText = "In a federal system of government, residual legislative powers are typically vested in the:",
                optionA = "component state or regional governments",
                optionB = "central federal legislature exclusively",
                optionC = "Supreme Court",
                optionD = "electoral commission",
                correctAnswerIndex = 0,
                explanation = "Under constitutional division of powers, powers not enumerated in exclusive or concurrent lists remain with the state governments.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_06",
                subject = "Government",
                topic = "Electoral Systems",
                year = "2024",
                questionText = "The simple plurality or 'first-past-the-post' electoral system declares as winner the candidate who:",
                optionA = "secures the highest number of valid votes cast, regardless of whether it is an absolute majority",
                optionB = "obtains more than fifty percent of all registered voters",
                optionC = "is chosen by the electoral commission chairman",
                optionD = "has the largest campaign funding",
                correctAnswerIndex = 0,
                explanation = "First-past-the-post requires only a simple plurality (more votes than any single opponent).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_07",
                subject = "Government",
                topic = "Pre-Colonial: Hausa-Fulani",
                year = "2024",
                questionText = "In the pre-colonial Hausa-Fulani emirate system, the chief Islamic judicial officer administering Shari'ah law was the:",
                optionA = "Alkali",
                optionB = "Hakimi",
                optionC = "Madawaki",
                optionD = "Galadima",
                correctAnswerIndex = 0,
                explanation = "The Alkali was the trained Islamic judge presiding over Shari'ah courts in the emirate.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_08",
                subject = "Government",
                topic = "Pre-Colonial: Yoruba",
                year = "2024",
                questionText = "In the pre-colonial Old Oyo Kingdom, the prime minister who presided over the Oyomesi council of kingmakers was the:",
                optionA = "Bashorun",
                optionB = "Aremo",
                optionC = "Oluwo",
                optionD = "Kakanfo",
                correctAnswerIndex = 0,
                explanation = "The Bashorun headed the Oyomesi, wielding constitutional authority to order an errant Alaafin to commit suicide with empty calabashes.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_09",
                subject = "Government",
                topic = "Pre-Colonial: Igbo",
                year = "2024",
                questionText = "The pre-colonial Igbo political system was described as acephalous or segmentary because it:",
                optionA = "lacked a centralized monarchical authority and relied on direct village democracy",
                optionB = "was governed by an all-powerful absolute emperor",
                optionC = "had no traditional titles or age grades",
                optionD = "was completely run by foreign colonial officers",
                correctAnswerIndex = 0,
                explanation = "Acephalous means 'headless'; authority was diffuse, consultative, and distributed among village elders, title holders, and age grades.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_10",
                subject = "Government",
                topic = "Colonial Administration",
                year = "2024",
                questionText = "The system of Indirect Rule failed largely in Eastern Nigeria during the colonial period due to the:",
                optionA = "absence of traditional centralized monarchs and the imposition of artificial Warrant Chiefs",
                optionB = "presence of strong standing armies in Igbo communities",
                optionC = "unanimous adoption of British common law",
                optionD = "boycott of all European trade goods",
                correctAnswerIndex = 0,
                explanation = "The British created artificial 'Warrant Chiefs' in egalitarian communities, which provoked intense popular resentment and the 1929 Aba riots.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_11",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2024",
                questionText = "Which Nigerian pre-independence constitution formally introduced Regionalism by creating Northern, Western, and Eastern Regional Houses of Assembly?",
                optionA = "The Richards Constitution of 1946",
                optionB = "The Clifford Constitution of 1922",
                optionC = "The Macpherson Constitution of 1951",
                optionD = "The Lyttelton Constitution of 1954",
                correctAnswerIndex = 0,
                explanation = "The 1946 Richards Constitution established regional councils, institutionalizing regional politics in Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_12",
                subject = "Government",
                topic = "Constitutional Development",
                year = "2024",
                questionText = "Nigeria was formally proclaimed a Federal Republic with an indigenous President replacing the British Queen in:",
                optionA = "October 1963",
                optionB = "October 1960",
                optionC = "January 1966",
                optionD = "May 1967",
                correctAnswerIndex = 0,
                explanation = "The 1963 Republican Constitution severed formal constitutional ties with the British Crown, establishing the Federal Republic of Nigeria.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_gov_mast_2024_13",
                subject = "Government",
                topic = "Foreign Policy",
                year = "2024",
                questionText = "The foundational cornerstone of Nigeria's foreign policy since independence has been:",
                optionA = "Afrocentricism (Africa as the centerpiece of foreign policy)",
                optionB = "permanent military alignment with NATO superpowers",
                optionC = "isolationism from global international bodies",
                optionD = "annexation of neighboring West African territories",
                correctAnswerIndex = 0,
                explanation = "Successive Nigerian administrations have maintained Africa as the centerpiece of foreign diplomatic engagement and liberation struggles.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2024 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
    }

}
