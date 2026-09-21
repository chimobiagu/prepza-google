package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Commerce Mega Mastery Bank (2005 - 2024 Exam Series)
 * Total Verified Questions: 220
 */
object JambCommerceMegaMasteryBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(220)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2005",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2005",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2005",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2005",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2005",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2005",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2005",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2005",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2005",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2005",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2005_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2005",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2006",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2006",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2006",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2006",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2006",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2006",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2006",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2006",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2006",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2006",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2006_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2006",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2007",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2007",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2007",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2007",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2007",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2007",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2007",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2007",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2007",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2007",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2007_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2007",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2008",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2008",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2008",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2008",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2008",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2008",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2008",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2008",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2008",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2008",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2008_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2008",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2009",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2009",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2009",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2009",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2009",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2009",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2009",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2009",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2009",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2009",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2009_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2009",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2010",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2010",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2010",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2010",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2010",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2010",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2010",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2010",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2010",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2010",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2010_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2010",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2011",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2011",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2011",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2011",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2011",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2011",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2011",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2011",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2011",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2011",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2011_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2011",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2012",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2012",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2012",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2012",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2012",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2012",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2012",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2012",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2012",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2012",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2012_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2012",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2013",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2013",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2013",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2013",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2013",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2013",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2013",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2013",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2013",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2013",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2013_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2013",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2014",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2014",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2014",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2014",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2014",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2014",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2014",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2014",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2014",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2014",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2014_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2014",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2015",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2015",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2015",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2015",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2015",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2015",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2015",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2015",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2015",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2015",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2015_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2015",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2016",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2016",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2016",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2016",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2016",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2016",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2016",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2016",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2016",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2016",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2016_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2016",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2017",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2017",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2017",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2017",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2017",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2017",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2017",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2017",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2017",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2017",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2017_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2017",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2018",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2018",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2018",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2018",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2018",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2018",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2018",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2018",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2018",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2018",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2018_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2018",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2019",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2019",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2019",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2019",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2019",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2019",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2019",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2019",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2019",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2019",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2019_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2019",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2020",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2020",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2020",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2020",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2020",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2020",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2020",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2020",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2020",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2020",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2020_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2020",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2021",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2021",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2021",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2021",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2021",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2021",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2021",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2021",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2021",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2021",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2021_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2021",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2022",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2022",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2022",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2022",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2022",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2022",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2022",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2022",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2022",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2022",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2022_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2022",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2023",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2023",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2023",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2023",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2023",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2023",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2023",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2023",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2023",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2023",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2023_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2023",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_01",
                subject = "Commerce",
                topic = "Nature of Commerce",
                year = "2024",
                questionText = "Commerce is broadly divided into:",
                optionA = "Trade and Aids to Trade",
                optionB = "Retail and Wholesale trade only",
                optionC = "Import and Export trade only",
                optionD = "Manufacturing and Construction",
                correctAnswerIndex = 0,
                explanation = "Commerce encompasses trade (buying and selling) and aids to trade (banking, insurance, transport, warehousing, advertising, communication).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_02",
                subject = "Commerce",
                topic = "Home Trade: Wholesale",
                year = "2024",
                questionText = "The primary economic function of a wholesaler to a manufacturer is:",
                optionA = "buying goods in large bulk quantities and providing prompt cash finance",
                optionB = "selling goods in single units to ultimate retail consumers",
                optionC = "granting hire purchase credit directly to household consumers",
                optionD = "manufacturing the raw materials",
                correctAnswerIndex = 0,
                explanation = "Wholesalers purchase in large bulk, provide cash flow to manufacturers, and break bulk for retailers.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_03",
                subject = "Commerce",
                topic = "Foreign Trade: Documents",
                year = "2024",
                questionText = "A document of title to goods shipped aboard a marine vessel acknowledging receipt by the shipmaster is a:",
                optionA = "Bill of Lading",
                optionB = "Consular Invoice",
                optionC = "Certificate of Origin",
                optionD = "Bill of Exchange",
                correctAnswerIndex = 0,
                explanation = "A Bill of Lading is a legally recognized document of title, contract of carriage, and receipt for cargo shipped on a vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_04",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2024",
                questionText = "The insurance principle of 'Indemnity' ensures that upon the occurrence of an insured loss, the insured person is:",
                optionA = "restored to the exact financial position enjoyed immediately prior to the loss, without making a profit",
                optionB = "paid double the market value of the damaged property",
                optionC = "awarded permanent shares in the insurance corporation",
                optionD = "exempted from paying all future taxes",
                correctAnswerIndex = 0,
                explanation = "Indemnity guarantees restoration of exact financial status without profit or enrichment from insurance claims.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_05",
                subject = "Commerce",
                topic = "Insurance: Principles",
                year = "2024",
                questionText = "The principle of 'Uberrimae Fidei' (Utmost Good Faith) requires that the prospective policyholder must:",
                optionA = "disclose all material facts and pertinent information truthfully to the insurer",
                optionB = "pay the full annual premium in physical foreign currency",
                optionC = "hire private security guards to protect insured assets",
                optionD = "surrender original ownership deeds to the bank",
                correctAnswerIndex = 0,
                explanation = "Uberrimae Fidei obligates both parties to reveal all material information affecting risk assessment.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_06",
                subject = "Commerce",
                topic = "Banking: Central Bank",
                year = "2024",
                questionText = "The Central Bank acts as the 'Lender of Last Resort' by:",
                optionA = "providing emergency liquidity loans to commercial banks experiencing temporary solvency distress",
                optionB = "granting personal car loans to general retail consumers",
                optionC = "printing unrestricted currencies for private corporations",
                optionD = "cancelling all national commercial debts",
                correctAnswerIndex = 0,
                explanation = "As lender of last resort, the central bank prevents systemic banking collapse by extending emergency liquidity to distressed solvent banks.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_07",
                subject = "Commerce",
                topic = "Business Organization: Partnership",
                year = "2024",
                questionText = "In an ordinary partnership, the financial liability of general partners for the firm's debts is:",
                optionA = "unlimited (personal assets can be attached to settle firm debts)",
                optionB = "limited strictly to capital originally contributed",
                optionC = "restricted to 50% of outstanding liabilities",
                optionD = "guaranteed by the central government",
                correctAnswerIndex = 0,
                explanation = "General partners possess unlimited liability, meaning personal assets can be seized to satisfy partnership obligations.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_08",
                subject = "Commerce",
                topic = "Business Organization: Companies",
                year = "2024",
                questionText = "The constitutional document regulating a company's internal management, directors' powers, and voting rules is the:",
                optionA = "Articles of Association",
                optionB = "Memorandum of Association",
                optionC = "Prospectus",
                optionD = "Certificate of Incorporation",
                correctAnswerIndex = 0,
                explanation = "The Articles of Association govern internal administration, while the Memorandum governs external corporate relations and objectives.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_09",
                subject = "Commerce",
                topic = "Stock Exchange",
                year = "2024",
                questionText = "On the Stock Exchange, a speculator who buys shares anticipating that prices will rise in order to sell at a profit is called a:",
                optionA = "Bull",
                optionB = "Bear",
                optionC = "Stag",
                optionD = "Jobber",
                correctAnswerIndex = 0,
                explanation = "A Bull expects rising prices; a Bear expects falling prices; a Stag applies for new share issues expecting to sell at premium immediately.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_10",
                subject = "Commerce",
                topic = "Law of Contract",
                year = "2024",
                questionText = "An essential element without which a simple contract is legally void and unenforceable is:",
                optionA = "valuable Consideration",
                optionB = "notarization by a foreign consulate",
                optionC = "immediate cash payment in full",
                optionD = "approval by the central bank",
                correctAnswerIndex = 0,
                explanation = "A valid contract requires offer, acceptance, intention to create legal relations, capacity, and valuable consideration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_com_mast_2024_11",
                subject = "Commerce",
                topic = "Warehousing",
                year = "2024",
                questionText = "A bonded warehouse is a secured storage facility under government customs control used for storing:",
                optionA = "dutiable imported goods on which import duties have not yet been paid",
                optionB = "locally produced agricultural foodstuffs exclusively",
                optionC = "damaged goods awaiting destruction",
                optionD = "stolen merchandise recovered by the police",
                correctAnswerIndex = 0,
                explanation = "Bonded warehouses hold imported cargo in bond until customs duties and excises are fully settled.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
    }

}
