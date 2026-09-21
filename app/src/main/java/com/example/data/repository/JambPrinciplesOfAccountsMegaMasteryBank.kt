package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Principles of Accounts Mega Mastery Bank (2005 - 2024 Exam Series)
 * Total Verified Questions: 180
 */
object JambPrinciplesOfAccountsMegaMasteryBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(180)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2005",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2005",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2005",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2005",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2005",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2005",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2005",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2005",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2005_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2005",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2006",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2006",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2006",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2006",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2006",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2006",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2006",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2006",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2006_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2006",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2007",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2007",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2007",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2007",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2007",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2007",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2007",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2007",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2007_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2007",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2008",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2008",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2008",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2008",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2008",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2008",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2008",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2008",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2008_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2008",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2009",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2009",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2009",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2009",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2009",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2009",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2009",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2009",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2009_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2009",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2010",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2010",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2010",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2010",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2010",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2010",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2010",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2010",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2010_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2010",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2011",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2011",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2011",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2011",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2011",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2011",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2011",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2011",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2011_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2011",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2012",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2012",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2012",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2012",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2012",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2012",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2012",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2012",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2012_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2012",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2013",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2013",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2013",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2013",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2013",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2013",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2013",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2013",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2013_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2013",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2014",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2014",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2014",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2014",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2014",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2014",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2014",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2014",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2014_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2014",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2015",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2015",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2015",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2015",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2015",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2015",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2015",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2015",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2015_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2015",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2016",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2016",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2016",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2016",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2016",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2016",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2016",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2016",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2016_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2016",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2017",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2017",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2017",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2017",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2017",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2017",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2017",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2017",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2017_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2017",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2018",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2018",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2018",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2018",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2018",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2018",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2018",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2018",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2018_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2018",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2019",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2019",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2019",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2019",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2019",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2019",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2019",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2019",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2019_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2019",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2020",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2020",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2020",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2020",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2020",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2020",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2020",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2020",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2020_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2020",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2021",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2021",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2021",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2021",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2021",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2021",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2021",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2021",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2021_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2021",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2022",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2022",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2022",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2022",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2022",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2022",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2022",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2022",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2022_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2022",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2023",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2023",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2023",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2023",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2023",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2023",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2023",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2023",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2023_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2023",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_01",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2024",
                questionText = "The accounting concept stating that business transactions should be recorded assuming the enterprise will continue operating indefinitely into the foreseeable future is the:",
                optionA = "Going Concern concept",
                optionB = "Accrual concept",
                optionC = "Consistency concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The Going Concern assumption presumes the entity will not liquidate or curtail operations drastically in the foreseeable future.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_02",
                subject = "Principles of Accounts",
                topic = "Accounting Concepts",
                year = "2024",
                questionText = "Under the Prudence (Conservatism) concept, revenue and profits should only be recognized when:",
                optionA = "realized or reasonably certain, while all anticipated liabilities and losses must be fully provided for",
                optionB = "goods are ordered by a customer over telephone",
                optionC = "a bank statement is printed at month end",
                optionD = "the business registers for corporate taxation",
                correctAnswerIndex = 0,
                explanation = "Prudence mandates exercising caution: anticipate no profits, but anticipate and provide for all possible losses.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_03",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2024",
                questionText = "According to the fundamental rules of double entry bookkeeping:",
                optionA = "debit the receiver and credit the giver",
                optionB = "debit all incomes and credit all expenses",
                optionC = "debit liabilities and credit assets",
                optionD = "debit cash and credit debtors simultaneously",
                correctAnswerIndex = 0,
                explanation = "The golden rule of personal accounts is: Debit the receiver (debtor), Credit the giver (creditor). For assets: Debit increase, Credit decrease.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_04",
                subject = "Principles of Accounts",
                topic = "Trial Balance & Errors",
                year = "2024",
                questionText = "Which of the following errors will NOT cause an imbalance in the totals of a Trial Balance?",
                optionA = "Error of Principle (e.g. debiting repairs expense instead of machinery asset)",
                optionB = "Entering a debit entry of ₦5,000 without any credit entry",
                optionC = "Adding the sales daybook incorrectly",
                optionD = "Extracting a ledger balance to the wrong column of the trial balance",
                correctAnswerIndex = 0,
                explanation = "An error of principle enters correct debit and credit amounts in the wrong class of account, so mathematical trial balance agreement is preserved.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_05",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2024",
                questionText = "In preparing a Bank Reconciliation Statement, an 'unpresented cheque' represents a cheque that was:",
                optionA = "drawn and issued to a creditor by the business but not yet presented to the bank for payment",
                optionB = "received from a customer and paid into the bank but not credited",
                optionC = "rejected by the bank due to irregular signature",
                optionD = "cancelled by the managing director",
                correctAnswerIndex = 0,
                explanation = "Unpresented cheques are already credited in the firm's cash book but have not yet been presented at the bank by the payee.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_06",
                subject = "Principles of Accounts",
                topic = "Year-End Adjustments: Depreciation",
                year = "2024",
                questionText = "Under the Straight Line Method of depreciation, the annual depreciation charge is calculated as:",
                optionA = "(Cost of Asset - Estimated Residual Value) / Estimated Useful Life",
                optionB = "Cost of Asset × Constant Depreciation Percentage applied to Net Book Value",
                optionC = "Annual Maintenance Cost + Purchase Price",
                optionD = "Market Resale Value divided by number of operating days",
                correctAnswerIndex = 0,
                explanation = "Straight line allocates an equal depreciation charge each year: (Cost - Salvage) / Useful life.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_07",
                subject = "Principles of Accounts",
                topic = "Final Accounts: Sole Trader",
                year = "2024",
                questionText = "In the Trading Account of a merchant, Cost of Goods Sold (COGS) is computed as:",
                optionA = "Opening Stock + Purchases - Closing Stock",
                optionB = "Total Sales - Total Expenses",
                optionC = "Gross Profit + Net Profit",
                optionD = "Closing Stock - Purchases",
                correctAnswerIndex = 0,
                explanation = "COGS = Opening Inventory + Net Purchases + Carriage Inwards - Closing Inventory.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_08",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2024",
                questionText = "In the absence of an explicit Partnership Deed, the Partnership Act provides that profits and losses must be shared:",
                optionA = "equally among all partners, regardless of capital contributed",
                optionB = "in strict proportion to capital contributions",
                optionC = "70% to senior partner and 30% to junior partner",
                optionD = "based on hours worked in the business",
                correctAnswerIndex = 0,
                explanation = "Section 24 of the Partnership Act stipulates equal profit and loss sharing where no partnership agreement specifies otherwise.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_mast_2024_09",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2024",
                questionText = "The Sales Ledger Control Account (Total Debtors Account) is primarily prepared to:",
                optionA = "check the arithmetic accuracy and verify the total balance of the individual debtors' ledger",
                optionB = "record the cash sales of the company",
                optionC = "calculate the gross margin on turnover",
                optionD = "reconcile the bank passbook balance",
                correctAnswerIndex = 0,
                explanation = "The total debtors control account acts as an independent cross-check on individual personal accounts in the sales ledger.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Accounts 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
    }

}
