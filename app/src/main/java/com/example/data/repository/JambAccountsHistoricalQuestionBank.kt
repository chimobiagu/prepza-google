package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and verified authentic JAMB Principles of Accounts / Financial Accounting
 * past examination series (1994 & 1995 Series).
 */
object JambAccountsHistoricalQuestionBank {

    fun getHistoricalAccountsQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =====================================================================
        // PRINCIPLES OF ACCOUNTS - YEAR: 1994
        // =====================================================================
        list.add(
            QuestionEntity(
                id = "acc_1994_01",
                subject = "Financial Accounting",
                topic = "Accounting Concepts & Conventions",
                year = "1994",
                questionText = "The term ‘accounting period’ is used to refer to the:",
                optionA = "time span during which taxes are paid to the Inland Revenue Board",
                optionB = "budget period, usually one year, relied on by the accountant",
                optionC = "time span, usually one year covered by financial statement",
                optionD = "period within which debtors are expected to settle accounts",
                correctAnswerIndex = 2,
                explanation = "The accounting period concept divides the continuous life of a business entity into regular, equal time intervals (commonly twelve months) to measure periodic performance and financial standing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_02",
                subject = "Financial Accounting",
                topic = "Accounting Concepts & Conventions",
                year = "1994",
                questionText = "Assigning revenues to the accounting period in which goods were sold or services rendered and expenses incurred is known as:",
                optionA = "passing of entries",
                optionB = "consistency convention",
                optionC = "matching concept",
                optionD = "adjusting for revenue",
                correctAnswerIndex = 2,
                explanation = "Under the matching concept, revenues earned must be associated and recorded alongside all related expenses incurred to generate them within the same accounting period.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_03",
                subject = "Financial Accounting",
                topic = "Accounting Concepts & Conventions",
                year = "1994",
                questionText = "The accounting convention which states that ‘profit must not be recognized until realized while all losses should be adequately provided for’ is termed:",
                optionA = "materiality",
                optionB = "objectivity",
                optionC = "consistency",
                optionD = "conservatism",
                correctAnswerIndex = 3,
                explanation = "Conservatism (or prudence) requires that accountants play safe by recognizing all anticipated losses immediately while delaying profit recognition until it is certain.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_04",
                subject = "Financial Accounting",
                topic = "Users of Accounting Information",
                year = "1994",
                questionText = "Accounting information is used by investors and creditors of a company to predict:",
                optionA = "future cash flows of the company",
                optionB = "future tax payments of the company",
                optionC = "potential merger candidates for the company",
                optionD = "appropriate remuneration for the company’s staff",
                correctAnswerIndex = 0,
                explanation = "Investors and creditors depend on financial records to evaluate the capacity of a business to generate positive net cash inflows for future dividends or interest payments.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_05",
                subject = "Financial Accounting",
                topic = "Double Entry Bookkeeping",
                year = "1994",
                questionText = "Antics Electronics Company recently bought six generators for store operations. Which of the following is the correct method of recording this transaction?",
                optionA = "Debit generator account and credit cash account",
                optionB = "Debit purchases account and credit cash account",
                optionC = "Debit cash account and credit purchases account",
                optionD = "Debit cash account and credit generator account",
                correctAnswerIndex = 0,
                explanation = "Since generators are non-current assets purchased for long-term use rather than resale, the transaction must be recorded by debiting the specific asset (Generator) account and crediting Cash.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_06",
                subject = "Financial Accounting",
                topic = "Capital & Revenue Expenditure",
                year = "1994",
                questionText = "When a business incurs labour cost in installing a fixed asset, the cost is treated as:",
                optionA = "additional cost to the asset",
                optionB = "business wages and salaries",
                optionC = "installation cost of the asset",
                optionD = "business cost of the asset",
                correctAnswerIndex = 0,
                explanation = "Capital expenditure rules dictate that any directly attributable costs, such as installation wages, required to bring a non-current asset to its functional state must be capitalized as part of the asset's cost.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_07",
                subject = "Financial Accounting",
                topic = "Double Entry Bookkeeping",
                year = "1994",
                questionText = "What is the cardinal rule of the double entry system?",
                optionA = "Debit the increasing account and credit the decreasing account",
                optionB = "Debit the receiving account and credit the giving account",
                optionC = "Debit the asset account and credit the liability account",
                optionD = "Debit the revenue account and credit the expenditure account",
                correctAnswerIndex = 1,
                explanation = "The fundamental pillar of double-entry bookkeeping states that for every transaction, the account that receives value is debited, and the account that gives value is credited.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_08",
                subject = "Financial Accounting",
                topic = "Correction of Errors",
                year = "1994",
                questionText = "Malam Gambo bought a freezer for his shop costing N10,500. In recording, he debited office expenses account. What type of error is this?",
                optionA = "Error of commission",
                optionB = "Error of reversal of entries",
                optionC = "Error of principle",
                optionD = "Compensating error",
                correctAnswerIndex = 2,
                explanation = "This represents an error of principle because Malam Gambo violated basic accounting standards by treating a capital asset transaction (freezer) as a revenue expenditure (office expense).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_09",
                subject = "Financial Accounting",
                topic = "Books of Original Entry & Ledger",
                year = "1994",
                questionText = "The use of the folio column in the ledger is for:",
                optionA = "Referencing purposes",
                optionB = "Particulars of the transaction",
                optionC = "The account titles",
                optionD = "Only credit items",
                correctAnswerIndex = 0,
                explanation = "Folio columns in journals and ledgers are utilized exclusively as cross-references to trace ledger entries back to their original journals and vice-versa.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_10",
                subject = "Financial Accounting",
                topic = "Ledger Accounts & Balancing",
                year = "1994",
                questionText = "Account of Tanko Nig Ltd:\nDr. Side: 1/10 Bal. b/f N5,000; Sales N10,000\nCr. Side: 2/10 Cash N3,000; 15/10 Bank N6,500\nWhat is the closing balance of the account shown above?",
                optionA = "N5,000",
                optionB = "N6,500",
                optionC = "N5,500",
                optionD = "N15,000",
                correctAnswerIndex = 2,
                explanation = "Total debits equal N15,000 (5,000 + 10,000) and total credits equal N9,500 (3,000 + 6,500). Subtracting credits from debits yields a closing debit balance of N5,500 (15,000 - 9,500 = N5,500).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_11",
                subject = "Financial Accounting",
                topic = "Correction of Errors & Suspense Account",
                year = "1994",
                questionText = "The suspense account is NOT used to correct bookkeeping errors where the:",
                optionA = "amount involved is quite significant",
                optionB = "item involved is not material",
                optionC = "item involved is unknown",
                optionD = "error does not affect the agreement of the trial balance",
                correctAnswerIndex = 3,
                explanation = "A suspense account is a temporary holding account used only when double-entry records disagree (affecting the trial balance total). Errors that do not disrupt trial balance agreement (e.g. errors of omission, principle, commission) cannot be corrected via suspense account.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_12",
                subject = "Financial Accounting",
                topic = "Cash Book & Discounts",
                year = "1994",
                questionText = "The discount columns of a three-column cashbook are not balanced off against each other but periodically transferred to their respective discount accounts because discounts:",
                optionA = "are not important in the cash book",
                optionB = "are cash items only",
                optionC = "do not form part of the double entry inside the cash book itself",
                optionD = "are used exclusively for bank reconciliation",
                correctAnswerIndex = 2,
                explanation = "The discount columns in a cashbook serve merely as a memorandum; their totals are separately transferred to the Discount Allowed and Discount Received ledger accounts to complete the double entry.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_13",
                subject = "Financial Accounting",
                topic = "Petty Cash & Imprest System",
                year = "1994",
                questionText = "When is a petty cash account debited under the imprest system?",
                optionA = "When the fund is established and every time money is spent",
                optionB = "When the fund is established and every time it is replenished",
                optionC = "When the fund is established and when the size of the float is decreased",
                optionD = "Every time money is drawn from the petty cash box",
                correctAnswerIndex = 1,
                explanation = "The petty cash account is debited initially to set up the cash float and subsequently whenever the fund is replenished back to its original amount.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_14",
                subject = "Financial Accounting",
                topic = "Bank Reconciliation Statement",
                year = "1994",
                questionText = "When preparing a bank reconciliation statement starting with the balance per bank statement, which of the following is deducted?",
                optionA = "Bank charges",
                optionB = "Uncleared cheques / uncredited lodgements",
                optionC = "Dishonoured cheques",
                optionD = "Unpresented cheques",
                correctAnswerIndex = 3,
                explanation = "Unpresented cheques (cheques issued to creditors but not yet presented to the bank for payment) must be deducted from the balance per bank statement to align it with the adjusted cash book balance.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1994_15",
                subject = "Financial Accounting",
                topic = "Final Accounts & Balance Sheet",
                year = "1994",
                questionText = "The financial position of an organization at a particular date can be ascertained from the:",
                optionA = "statement of sources and application of funds",
                optionB = "statement of retained earnings",
                optionC = "balance sheet (statement of financial position)",
                optionD = "profit and loss account",
                correctAnswerIndex = 2,
                explanation = "The Balance Sheet (or Statement of Financial Position) lists an organization's assets, liabilities, and equity at a specific point in time to show its financial position.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1994"
            )
        )

        // =====================================================================
        // PRINCIPLES OF ACCOUNTS - YEAR: 1995
        // =====================================================================
        list.add(
            QuestionEntity(
                id = "acc_1995_01",
                subject = "Financial Accounting",
                topic = "Evolution & Nature of Accounting",
                year = "1995",
                questionText = "Which of the following factors has aided the modern development of Accounting?",
                optionA = "The emergence of nation states",
                optionB = "The discovery of mineral resources in commercial quantity",
                optionC = "The growth in size of businesses and the separation of ownership and management",
                optionD = "The development and management of a sophisticated monetary system",
                correctAnswerIndex = 2,
                explanation = "As businesses expanded into joint-stock companies, the separation of company owners (shareholders) from day-to-day managers necessitated objective reporting and stewardship auditing.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1995"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1995_02",
                subject = "Financial Accounting",
                topic = "Accounting Concepts & Conventions",
                year = "1995",
                questionText = "Which of the following concepts stipulates that accounting profit is the difference between revenue earned and expenses incurred?",
                optionA = "Accrual concept",
                optionB = "Conservation concept",
                optionC = "Prudence concept",
                optionD = "Materiality concept",
                correctAnswerIndex = 0,
                explanation = "The accrual concept dictates that revenue and expenses are recognized as they are earned or incurred (rather than when cash is received or paid), defining periodic accounting profit.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1995"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1995_03",
                subject = "Financial Accounting",
                topic = "Users of Accounting Information",
                year = "1995",
                questionText = "An effective accounting system should provide information:",
                optionA = "on new engineering products and factory methods",
                optionB = "for customer feedback and service requirements",
                optionC = "on internal and external reporting for managers and third parties",
                optionD = "for promoters, directors, labour unions and distributors exclusively",
                correctAnswerIndex = 2,
                explanation = "The core function of accounting is to serve as an information utility providing relevant reports for both internal governance (managers) and external stakeholders (investors, creditors, government).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1995"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1995_04",
                subject = "Financial Accounting",
                topic = "Source Documents & Books of Original Entry",
                year = "1995",
                questionText = "Which of the following accounting records are source documents?",
                optionA = "Journals and ledgers",
                optionB = "Sales invoice and cashbook",
                optionC = "Cash book and debit note",
                optionD = "Sales invoice and debit note",
                correctAnswerIndex = 3,
                explanation = "Invoices and debit notes are original evidence documents generated at the point of sale/transaction, whereas cashbooks and journals are books of original entry.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1995"
            )
        )

        list.add(
            QuestionEntity(
                id = "acc_1995_05",
                subject = "Financial Accounting",
                topic = "Accounting Equation & Capital",
                year = "1995",
                questionText = "Given:\nMotor van N3,600, Premises N5,000, Loan N1,000, Cash at bank N1,650, Stock of goods N4,800, Creditors N2,560, Cash in hand N250, and Debtors N6,910.\nCalculate the capital figure.",
                optionA = "N19,650",
                optionB = "N18,650",
                optionC = "N17,850",
                optionD = "N19,850",
                correctAnswerIndex = 1,
                explanation = "Total Assets = N22,210 (3,600 + 5,000 + 1,650 + 4,800 + 250 + 6,910). Total Liabilities = N3,560 (1,000 + 2,560). Using Capital = Assets - Liabilities: 22,210 - 3,560 = N18,650.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts Past Question • 1995"
            )
        )

        return list
    }
}
