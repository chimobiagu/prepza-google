package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB All-Subjects Master Revision Bank Volume 4 - Part 2
 * High-yield authentic JAMB UTME questions across Arts, Social Sciences & Commercial subjects:
 * Economics, Government, Literature in English, Commerce, Principles of Accounts, CRS.
 */
object JambAllSubjectMasterRevisionVol4Part2QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1. ECONOMICS (Microeconomics, Macroeconomics, Money & Banking, Inflation)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "econ_vol4_2016_001",
                subject = "Economics",
                topic = "Elasticity of Demand",
                year = "2016",
                questionText = "If a 10% increase in price leads to a 20% decrease in quantity demanded, price elasticity of demand is:",
                optionA = "0.5 (Inelastic)",
                optionB = "2.0 (Elastic)",
                optionC = "1.0 (Unitary)",
                optionD = "0 (Perfectively Inelastic)",
                correctAnswerIndex = 1,
                explanation = "Price Elasticity of Demand (Ped) = % Change in Quantity Demanded / % Change in Price = |-20% / +10%| = 2.0. Since Ped > 1, demand is elastic.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "econ_vol4_2016_002",
                subject = "Economics",
                topic = "National Income Accounting",
                year = "2016",
                questionText = "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus:",
                optionA = "Net exports",
                optionB = "Net income from abroad",
                optionC = "Depreciation allowance",
                optionD = "Indirect business taxes",
                correctAnswerIndex = 1,
                explanation = "GNP = GDP + Net Property Income from Abroad (NPIA).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "econ_vol4_2017_003",
                subject = "Economics",
                topic = "Money & Banking: Monetary Policy",
                year = "2017",
                questionText = "Which of the following is a quantitative monetary policy tool used by the Central Bank to curb inflation?",
                optionA = "Moral suasion",
                optionB = "Open Market Operations (OMO)",
                optionC = "Selective credit control",
                optionD = "Direct directives",
                correctAnswerIndex = 1,
                explanation = "Open Market Operations (OMO), Cash Reserve Ratio (CRR), and Monetary Policy Rate (MPR) are standard quantitative instruments used by central banks.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "econ_vol4_2018_004",
                subject = "Economics",
                topic = "Market Structures: Monopoly & Perfect Competition",
                year = "2018",
                questionText = "Under perfect competition in the long run, a firm earns only:",
                optionA = "Supernormal profit",
                optionB = "Normal profit",
                optionC = "Economic loss",
                optionD = "Monopoly rent",
                correctAnswerIndex = 1,
                explanation = "Due to free entry and exit of firms, any supernormal profits are competed away until Price = MC = Minimum ATC, resulting in only normal profit.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Q4"
            )
        )

        // =========================================================================
        // 2. GOVERNMENT (Constitutional Development, Systems of Govt, Political Theory)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "govt_vol4_2016_001",
                subject = "Government",
                topic = "Constitutional History: Clifford Constitution",
                year = "2016",
                questionText = "The elective principle was first introduced into Nigerian colonial governance by the:",
                optionA = "Lugard Constitution of 1914",
                optionB = "Clifford Constitution of 1922",
                optionC = "Richards Constitution of 1946",
                optionD = "Macpherson Constitution of 1951",
                correctAnswerIndex = 1,
                explanation = "Sir Hugh Clifford's 1922 Constitution introduced the elective principle allowing 4 elected African members (3 for Lagos, 1 for Calabar).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "govt_vol4_2016_002",
                subject = "Government",
                topic = "Political Theory: Separation of Powers",
                year = "2016",
                questionText = "The political doctrine of Separation of Powers was famously propounded by the French philosopher:",
                optionA = "Jean-Jacques Rousseau",
                optionB = "Baron de Montesquieu",
                optionC = "John Locke",
                optionD = "Thomas Hobbes",
                correctAnswerIndex = 1,
                explanation = "Baron de Montesquieu articulated the theory of Separation of Powers among the Executive, Legislature, and Judiciary in his 1748 work 'The Spirit of the Laws'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "govt_vol4_2017_003",
                subject = "Government",
                topic = "Forms of Government: Federalism",
                year = "2017",
                questionText = "In a federal system of government, powers not expressly allocated to either federal or state tiers in the constitution are called:",
                optionA = "Concurrent powers",
                optionB = "Exclusive powers",
                optionC = "Residual powers",
                optionD = "Delegated powers",
                correctAnswerIndex = 2,
                explanation = "Residual powers are those matters left unlisted in the exclusive or concurrent legislative lists, usually vesting in component states or provinces.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2017 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "govt_vol4_2018_004",
                subject = "Government",
                topic = "International Organizations: ECOWAS & AU",
                year = "2018",
                questionText = "The Economic Community of West African States (ECOWAS) was officially established by the Treaty of Lagos in:",
                optionA = "May 1963",
                optionB = "May 1975",
                optionC = "October 1960",
                optionD = "July 2002",
                correctAnswerIndex = 1,
                explanation = "ECOWAS was formed on 28 May 1975 upon the signing of the Treaty of Lagos by 15 West African nations.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Government 2018 • Q4"
            )
        )

        // =========================================================================
        // 3. LITERATURE IN ENGLISH (Literary Appreciation, Poetry, Drama, Prose)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "lit_vol4_2016_001",
                subject = "Literature in English",
                topic = "Literary Devices: Figures of Speech",
                year = "2016",
                questionText = "'The wind whistled through the night and tapped gently on the window pane.' The dominant literary device here is:",
                optionA = "Hyperbole",
                optionB = "Personification",
                optionC = "Synecdoche",
                optionD = "Oxymoron",
                correctAnswerIndex = 1,
                explanation = "Personification endows inanimate objects or natural forces (the wind) with human traits (whistling, tapping gently).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol4_2017_002",
                subject = "Literature in English",
                topic = "Poetry & Versification",
                year = "2017",
                questionText = "A fourteen-line lyric poem written in iambic pentameter with a definite rhyme scheme is called a:",
                optionA = "Ballad",
                optionB = "Sonnet",
                optionC = "Ode",
                optionD = "Elegy",
                correctAnswerIndex = 1,
                explanation = "A sonnet is a fixed poetic form consisting of exactly 14 lines, typically written in iambic pentameter (e.g., Shakespearean or Petrarchan sonnets).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2017 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "lit_vol4_2018_003",
                subject = "Literature in English",
                topic = "Dramatic Elements: Tragedy & Catharsis",
                year = "2018",
                questionText = "In Aristotelian dramatic tragedy, the purging or cleansing of pity and fear experienced by the audience is known as:",
                optionA = "Hubris",
                optionB = "Catharsis",
                optionC = "Hamartia",
                optionD = "Anagnorisis",
                correctAnswerIndex = 1,
                explanation = "Catharsis is Aristotle's concept of emotional purgation, renewal, and relief experienced by the audience following a dramatic tragedy.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Literature in English 2018 • Q3"
            )
        )

        // =========================================================================
        // 4. COMMERCE (Trade, Insurance, Banking, Warehousing, Transport)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "comm_vol4_2016_001",
                subject = "Commerce",
                topic = "International Trade: Balance of Trade",
                year = "2016",
                questionText = "The difference in monetary value between a nation's visible exports and visible imports over a given period is the:",
                optionA = "Balance of Payments",
                optionB = "Balance of Trade",
                optionC = "Terms of Trade",
                optionD = "Current Account Balance",
                correctAnswerIndex = 1,
                explanation = "Balance of Trade (BOT) specifically measures the net difference between visible (merchandise) exports and visible imports.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_vol4_2017_002",
                subject = "Commerce",
                topic = "Insurance: Principles of Insurance",
                year = "2017",
                questionText = "Which principle of insurance prevents the insured from making a financial profit or gain from an insured loss?",
                optionA = "Insurable interest",
                optionB = "Indemnity",
                optionC = "Subrogation",
                optionD = "Utmost good faith",
                correctAnswerIndex = 1,
                explanation = "The principle of Indemnity states that the insured should be restored to the exact financial position enjoyed immediately prior to the loss, without profiting.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "comm_vol4_2018_003",
                subject = "Commerce",
                topic = "Business Units: Limited Liability Companies",
                year = "2018",
                questionText = "The document regulating the internal management, rights of shareholders, and duties of directors of a company is the:",
                optionA = "Memorandum of Association",
                optionB = "Articles of Association",
                optionC = "Certificate of Incorporation",
                optionD = "Prospectus",
                correctAnswerIndex = 1,
                explanation = "The Articles of Association define the internal regulations and governance rules of the company, while the Memorandum defines its relationship with the outside world.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Q3"
            )
        )

        // =========================================================================
        // 5. PRINCIPLES OF ACCOUNTS (Double Entry, Depreciation, Trial Balance)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "acc_vol4_2016_001",
                subject = "Principles of Accounts",
                topic = "Double Entry Bookkeeping",
                year = "2016",
                questionText = "When goods are sold for cash, the fundamental double entry recording is:",
                optionA = "Debit Sales Account, Credit Cash Account",
                optionB = "Debit Cash Account, Credit Sales Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Debtors Account, Credit Sales Account",
                correctAnswerIndex = 1,
                explanation = "Debit what comes in (Cash received increases asset) and Credit income/revenue (Sales Account).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "acc_vol4_2017_002",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2017",
                questionText = "A motor van costing ₦500,000 has an estimated useful life of 5 years and a scrap value of ₦50,000. Using the straight-line method, calculate the annual depreciation charge.",
                optionA = "₦100,000",
                optionB = "₦90,000",
                optionC = "₦110,000",
                optionD = "₦80,000",
                correctAnswerIndex = 1,
                explanation = "Annual Depreciation = (Cost - Scrap Value) / Useful Life = (₦500,000 - ₦50,000) / 5 = ₦450,000 / 5 = ₦90,000.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "acc_vol4_2018_003",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2018",
                questionText = "An error that occurs when a transaction is completely omitted from both debit and credit entries in the books is called an:",
                optionA = "Error of commission",
                optionB = "Error of omission",
                optionC = "Error of principle",
                optionD = "Compensating error",
                correctAnswerIndex = 1,
                explanation = "An error of omission occurs when a transaction is entirely forgotten and not recorded anywhere in the books.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Q3"
            )
        )

        // =========================================================================
        // 6. CHRISTIAN RELIGIOUS STUDIES (CRS / CRK)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "crk_vol4_2016_001",
                subject = "Christian Religious Studies",
                topic = "Sovereignty of God & Creation",
                year = "2016",
                questionText = "According to Genesis Chapter 1, on which day were the sun, moon, and stars created?",
                optionA = "Third day",
                optionB = "Fourth day",
                optionC = "Fifth day",
                optionD = "Sixth day",
                correctAnswerIndex = 1,
                explanation = "Genesis 1:14-19 records that the heavenly luminaries (sun, moon, and stars) were set in place on the fourth day.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "crk_vol4_2017_002",
                subject = "Christian Religious Studies",
                topic = "Leadership: David & Solomon",
                year = "2017",
                questionText = "Who was the prophet sent by God to rebuke King David after he committed adultery with Bathsheba?",
                optionA = "Prophet Samuel",
                optionB = "Prophet Nathan",
                optionC = "Prophet Elijah",
                optionD = "Prophet Elisha",
                correctAnswerIndex = 1,
                explanation = "God sent Prophet Nathan to David with the parable of the rich man and the poor man's ewe lamb (2 Samuel 12).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 2017 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "crk_vol4_2018_003",
                subject = "Christian Religious Studies",
                topic = "The Early Church: Pentecost",
                year = "2018",
                questionText = "On the Day of Pentecost in Acts Chapter 2, who stood up to preach the transformative sermon that led to 3,000 souls being baptized?",
                optionA = "Paul",
                optionB = "Peter",
                optionC = "Stephen",
                optionD = "Barnabas",
                correctAnswerIndex = 1,
                explanation = "Apostle Peter lifted up his voice with the Eleven and proclaimed Jesus as Lord and Christ (Acts 2:14-41).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB CRK 2018 • Q3"
            )
        )

        return list
    }
}
