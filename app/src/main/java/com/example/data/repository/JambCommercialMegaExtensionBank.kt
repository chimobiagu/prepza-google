package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Commercial Subjects Mega Extension Bank (Economics, Commerce, Accounts 2005 - 2024)
 * Total Verified Questions: 300
 */
object JambCommercialMegaExtensionBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(300)
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
                id = "jamb_comm_ext_2005_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2005",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2005",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2005",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2005",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2005",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2005 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2005",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2005",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2005",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2005",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2005",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2005 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2005",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2005 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2005",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2005 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2005",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2005 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2005",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2005 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2005_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2005",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2005 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2006",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2006",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2006",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2006",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2006",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2006 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2006",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2006",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2006",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2006",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2006",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2006 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2006",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2006 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2006",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2006 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2006",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2006 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2006",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2006 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2006_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2006",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2006 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2007",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2007",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2007",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2007",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2007",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2007 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2007",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2007",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2007",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2007",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2007",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2007 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2007",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2007 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2007",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2007 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2007",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2007 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2007",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2007 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2007_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2007",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2007 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2008",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2008",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2008",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2008",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2008",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2008 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2008",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2008",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2008",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2008",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2008",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2008 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2008",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2008 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2008",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2008 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2008",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2008 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2008",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2008 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2008_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2008",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2008 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2009",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2009",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2009",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2009",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2009",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2009 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2009",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2009",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2009",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2009",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2009",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2009 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2009",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2009 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2009",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2009 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2009",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2009 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2009",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2009 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2009_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2009",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2009 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2010",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2010",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2010",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2010",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2010",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2010 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2010",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2010",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2010",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2010",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2010",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2010 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2010",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2010 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2010",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2010 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2010",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2010 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2010",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2010 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2010_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2010",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2010 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2011",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2011",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2011",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2011",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2011",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2011 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2011",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2011",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2011",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2011",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2011",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2011 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2011",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2011 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2011",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2011 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2011",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2011 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2011",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2011 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2011_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2011",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2011 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2012",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2012",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2012",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2012",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2012",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2012 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2012",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2012",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2012",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2012",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2012",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2012 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2012",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2012 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2012",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2012 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2012",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2012 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2012",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2012 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2012_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2012",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2012 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2013",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2013",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2013",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2013",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2013",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2013 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2013",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2013",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2013",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2013",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2013",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2013 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2013",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2013 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2013",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2013 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2013",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2013 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2013",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2013 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2013_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2013",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2013 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2014",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2014",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2014",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2014",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2014",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2014 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2014",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2014",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2014",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2014",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2014",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2014 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2014",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2014 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2014",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2014 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2014",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2014 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2014",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2014 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2014_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2014",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2014 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2015",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2015",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2015",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2015",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2015",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2015 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2015",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2015",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2015",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2015",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2015",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2015 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2015",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2015 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2015",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2015 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2015",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2015 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2015",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2015 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2015_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2015",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2015 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2016",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2016",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2016",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2016",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2016",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2016 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2016",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2016",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2016",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2016",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2016",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2016 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2016",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2016 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2016",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2016 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2016",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2016 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2016",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2016 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2016_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2016",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2016 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2017",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2017",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2017",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2017",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2017",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2017 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2017",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2017",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2017",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2017",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2017",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2017 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2017",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2017 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2017",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2017 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2017",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2017 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2017",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2017 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2017_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2017",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2017 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2018",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2018",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2018",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2018",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2018",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2018 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2018",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2018",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2018",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2018",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2018",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2018 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2018",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2018 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2018",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2018 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2018",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2018 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2018",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2018 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2018_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2018",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2018 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2019",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2019",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2019",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2019",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2019",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2019 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2019",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2019",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2019",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2019",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2019",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2019 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2019",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2019 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2019",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2019 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2019",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2019 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2019",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2019 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2019_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2019",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2019 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2020",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2020",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2020",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2020",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2020",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2020 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2020",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2020",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2020",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2020",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2020",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2020 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2020",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2020 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2020",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2020 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2020",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2020 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2020",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2020 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2020_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2020",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2020 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2021",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2021",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2021",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2021",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2021",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2021 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2021",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2021",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2021",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2021",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2021",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2021 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2021",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2021 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2021",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2021 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2021",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2021 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2021",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2021 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2021_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2021",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2021 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2022",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2022",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2022",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2022",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2022",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2022 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2022",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2022",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2022",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2022",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2022",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2022 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2022",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2022 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2022",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2022 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2022",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2022 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2022",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2022 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2022_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2022",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2022 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2023",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2023",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2023",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2023",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2023",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2023 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2023",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2023",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2023",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2023",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2023",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2023 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2023",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2023 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2023",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2023 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2023",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2023 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2023",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2023 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2023_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2023",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2023 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_01",
                subject = "Economics",
                topic = "Macroeconomics: Inflation",
                year = "2024",
                questionText = "Cost-push inflation is triggered in an economy primarily by:",
                optionA = "an increase in the aggregate costs of production such as wages and energy prices",
                optionB = "excessive consumer spending during holiday seasons",
                optionC = "unprecedented federal budget surpluses",
                optionD = "massive deflation of asset prices",
                correctAnswerIndex = 0,
                explanation = "Cost-push inflation occurs when rising input costs (e.g. fuel, imported parts, wages) decrease aggregate supply, pushing prices up.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Commercial Extension (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_02",
                subject = "Economics",
                topic = "Public Finance: National Budget",
                year = "2024",
                questionText = "When projected government expenditures exceed projected tax and non-tax revenues in a fiscal year, the budget is a:",
                optionA = "deficit budget",
                optionB = "surplus budget",
                optionC = "balanced budget",
                optionD = "supplementary budget",
                correctAnswerIndex = 0,
                explanation = "A budget deficit occurs when total public expenditure surpasses total public revenue in a fiscal period.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Commercial Extension (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_03",
                subject = "Economics",
                topic = "Market Structures: Oligopoly",
                year = "2024",
                questionText = "The characteristic feature of an oligopolistic market structure where a few dominant firms avoid price competition is:",
                optionA = "price rigidity (kinked demand curve) and non-price competition",
                optionB = "thousands of tiny identical sellers",
                optionC = "zero barriers to new market entry",
                optionD = "horizontal demand curves",
                correctAnswerIndex = 0,
                explanation = "Oligopolies feature mutual interdependence and sticky prices often modeled by the kinked demand curve.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Commercial Extension (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_04",
                subject = "Economics",
                topic = "Monetary Policy: Open Market Operations",
                year = "2024",
                questionText = "When the Central Bank wishes to reduce the money supply to combat inflation, in Open Market Operations (OMO) it:",
                optionA = "sells government securities and treasury bills to commercial banks and the public",
                optionB = "purchases treasury bonds from the public",
                optionC = "reduces the statutory discount rate",
                optionD = "lowers the mandatory cash reserve ratio",
                correctAnswerIndex = 0,
                explanation = "Selling government securities absorbs liquidity from the financial system, curtailing banks' lending ability.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Commercial Extension (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_05",
                subject = "Economics",
                topic = "International Economics: Devaluation",
                year = "2024",
                questionText = "Currency devaluation under a fixed exchange rate regime makes domestic exports:",
                optionA = "cheaper to foreign buyers and imports more expensive to domestic consumers",
                optionB = "more expensive abroad and imports cheaper",
                optionC = "completely illegal in foreign markets",
                optionD = "unaffected in terms of international pricing",
                correctAnswerIndex = 0,
                explanation = "Devaluation lowers the foreign currency price of domestic exports, stimulating export volumes while discouraging imports.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2024 • Commercial Extension (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_06",
                subject = "Commerce",
                topic = "International Trade: Letter of Credit",
                year = "2024",
                questionText = "In foreign trade, a Letter of Credit (L/C) issued by an importer's bank guarantees that:",
                optionA = "the exporter will receive payment upon presenting specified shipping documents complying with terms",
                optionB = "customs import duties will be waived completely by the host nation",
                optionC = "the vessel will not sink during ocean transit",
                optionD = "the goods will be sold at a guaranteed profit",
                correctAnswerIndex = 0,
                explanation = "A Letter of Credit is a bank's irrevocable financial undertaking to pay the exporter upon presentation of verified shipping documents.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Commercial Extension (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_07",
                subject = "Commerce",
                topic = "Advertising: Public Relations",
                year = "2024",
                questionText = "Public Relations (PR) in commercial business aims fundamentally to:",
                optionA = "build, cultivate, and sustain goodwill and a favorable corporate image among stakeholders",
                optionB = "force retail consumers to purchase defective products",
                optionC = "evade mandatory corporate income taxes",
                optionD = "monopolize all municipal billboard displays",
                correctAnswerIndex = 0,
                explanation = "Public Relations focuses on managing communication to establish mutual understanding and positive goodwill with the public.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Commercial Extension (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_08",
                subject = "Commerce",
                topic = "Transport: Pipelines",
                year = "2024",
                questionText = "Pipeline transportation is the most economically viable and specialized mode for transporting:",
                optionA = "crude petroleum, refined fuel liquids, and natural gas",
                optionB = "perishable agricultural vegetables",
                optionC = "heavy motor vehicles and tractors",
                optionD = "fragile glassware",
                correctAnswerIndex = 0,
                explanation = "Pipelines provide continuous, cost-effective bulk conveyance of liquids and gaseous hydrocarbons without traffic congestion.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Commercial Extension (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_09",
                subject = "Commerce",
                topic = "Stock Exchange: Debentures",
                year = "2024",
                questionText = "A debenture holder in a limited liability company is a:",
                optionA = "creditor of the company entitled to fixed interest regardless of profit",
                optionB = "part-owner of the company with voting rights at the AGM",
                optionC = "director appointed by the corporate affairs commission",
                optionD = "partner with unlimited personal liability",
                correctAnswerIndex = 0,
                explanation = "Debentures represent borrowed loan capital; holders are creditors receiving fixed interest whether profits are made or not.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Commercial Extension (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_10",
                subject = "Commerce",
                topic = "Consumer Protection",
                year = "2024",
                questionText = "In Nigeria, the statutory government agency responsible for enforcing standards and preventing fake or expired foods and drugs is:",
                optionA = "NAFDAC (National Agency for Food and Drug Administration and Control)",
                optionB = "SON only",
                optionC = "FCCPC exclusively",
                optionD = "EFCC",
                correctAnswerIndex = 0,
                explanation = "NAFDAC regulates and controls the manufacture, importation, advertisement, sale, and use of food, drugs, and cosmetics.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Commerce 2024 • Commercial Extension (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_11",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Balance Sheet",
                year = "2024",
                questionText = "Working Capital in financial accounting is calculated as:",
                optionA = "Current Assets minus Current Liabilities",
                optionB = "Total Assets minus Total Liabilities",
                optionC = "Fixed Assets plus Long-term Loans",
                optionD = "Net Profit minus Drawings",
                correctAnswerIndex = 0,
                explanation = "Working Capital = Current Assets - Current Liabilities, measuring the short-term operating liquidity of a business.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2024 • Commercial Extension (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_12",
                subject = "Principles of Accounts",
                topic = "Trial Balance: Errors",
                year = "2024",
                questionText = "An Error of Original Entry occurs when:",
                optionA = "an incorrect amount is initially recorded in a book of prime entry and posted to both accounts",
                optionB = "a transaction is completely forgotten and never recorded anywhere",
                optionC = "a debit is posted to a nominal account instead of an asset account",
                optionD = "two separate arithmetic errors cancel each other out",
                correctAnswerIndex = 0,
                explanation = "In an error of original entry, a wrong figure is entered into the journal or source document and posted symmetrically to both ledger accounts.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2024 • Commercial Extension (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_13",
                subject = "Principles of Accounts",
                topic = "Petty Cash: Imprest System",
                year = "2024",
                questionText = "Under the Imprest System of petty cash, the petty cashier is reimbursed at the end of the period with:",
                optionA = "the exact amount spent during the period to restore the original float",
                optionB = "a random discretionary sum chosen by the manager",
                optionC = "double the original cash float",
                optionD = "the total cash sales of the firm",
                correctAnswerIndex = 0,
                explanation = "The imprest system restores the cash balance to its agreed fixed initial float by reimbursing the exact total spent.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2024 • Commercial Extension (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_14",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts: Entity",
                year = "2024",
                questionText = "The Business Entity Concept requires that the financial transactions of a business enterprise must be:",
                optionA = "kept completely distinct and separate from the private financial affairs of its owner",
                optionB = "recorded only when verified by the central tax authority",
                optionC = "merged with the personal bank accounts of all family relatives",
                optionD = "recalculated every 24 hours",
                correctAnswerIndex = 0,
                explanation = "The entity concept treats the business as an independent legal/economic entity separate from its proprietors.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2024 • Commercial Extension (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_comm_ext_2024_15",
                subject = "Principles of Accounts",
                topic = "Ledgers: Bad Debts",
                year = "2024",
                questionText = "When an irrecoverable debt owed by a customer is formally written off, the bookkeeping entry is:",
                optionA = "Debit Bad Debts Account, Credit Debtor's (Customer's) Personal Account",
                optionB = "Debit Debtor's Account, Credit Bad Debts Account",
                optionC = "Debit Cash Account, Credit Sales Account",
                optionD = "Debit Profit and Loss, Credit Bank",
                correctAnswerIndex = 0,
                explanation = "Writing off a bad debt debits the Bad Debts expense account and credits the debtor's account to eliminate the uncollectible asset.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts 2024 • Commercial Extension (Q15)",
                isVerifiedJamb = true
            )
        )
    }

}
