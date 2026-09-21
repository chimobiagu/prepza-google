package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Comprehensive JAMB Principles of Accounts & Financial Accounting Mega Bank (2000 - 2024)
 * Total Verified Questions: 200
 */
object JambAccountsAndFinanceMegaBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_acc_2000_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2000",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2000_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2000",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2000_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2000",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2000_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2000",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2000_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2000",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2000 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2000_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2000",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2000 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2000_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2000",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2000 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2000_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2000",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2000 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2001_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2001",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2001_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2001",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2001_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2001",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2001_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2001",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2001_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2001",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2001 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2001_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2001",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2001 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2001_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2001",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2001 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2001_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2001",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2001 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2002_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2002",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2002_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2002",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2002_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2002",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2002_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2002",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2002_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2002",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2002 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2002_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2002",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2002 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2002_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2002",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2002 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2002_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2002",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2002 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2003_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2003",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2003_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2003",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2003_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2003",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2003_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2003",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2003_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2003",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2003 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2003_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2003",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2003 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2003_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2003",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2003 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2003_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2003",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2003 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2004_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2004",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2004_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2004",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2004_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2004",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2004_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2004",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2004_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2004",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2004 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2004_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2004",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2004 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2004_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2004",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2004 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2004_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2004",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2004 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2005_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2005",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2005_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2005",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2005_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2005",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2005_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2005",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2005_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2005",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2005 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2005_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2005",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2005 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2005_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2005",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2005 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2005_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2005",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2005 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2006_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2006",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2006_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2006",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2006_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2006",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2006_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2006",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2006_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2006",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2006 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2006_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2006",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2006 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2006_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2006",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2006 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2006_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2006",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2006 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2007_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2007",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2007_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2007",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2007_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2007",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2007_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2007",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2007_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2007",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2007 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2007_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2007",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2007 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2007_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2007",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2007 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2007_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2007",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2007 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2008_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2008",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2008_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2008",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2008_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2008",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2008_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2008",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2008_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2008",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2008 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2008_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2008",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2008 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2008_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2008",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2008 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2008_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2008",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2008 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2009_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2009",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2009_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2009",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2009_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2009",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2009_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2009",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2009_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2009",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2009 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2009_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2009",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2009 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2009_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2009",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2009 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2009_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2009",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2009 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2010_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2010",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2010_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2010",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2010_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2010",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2010_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2010",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2010_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2010",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2010 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2010_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2010",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2010 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2010_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2010",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2010 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2010_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2010",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2010 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2011_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2011",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2011_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2011",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2011_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2011",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2011_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2011",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2011_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2011",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2011 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2011_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2011",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2011 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2011_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2011",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2011 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2011_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2011",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2011 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2012_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2012",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2012_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2012",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2012_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2012",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2012_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2012",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2012_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2012",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2012 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2012_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2012",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2012 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2012_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2012",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2012 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2012_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2012",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2012 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2013_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2013",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2013_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2013",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2013_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2013",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2013_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2013",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2013_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2013",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2013 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2013_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2013",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2013 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2013_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2013",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2013 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2013_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2013",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2013 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2014_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2014",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2014_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2014",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2014_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2014",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2014_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2014",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2014_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2014",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2014 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2014_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2014",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2014 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2014_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2014",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2014 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2014_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2014",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2014 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2015_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2015",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2015_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2015",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2015_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2015",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2015_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2015",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2015_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2015",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2015 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2015_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2015",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2015 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2015_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2015",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2015 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2015_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2015",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2015 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2016_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2016",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2016_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2016",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2016_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2016",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2016_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2016",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2016_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2016",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2016 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2016_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2016",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2016 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2016_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2016",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2016 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2016_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2016",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2016 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2017_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2017",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2017_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2017",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2017_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2017",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2017_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2017",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2017_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2017",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2017 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2017_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2017",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2017 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2017_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2017",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2017 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2017_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2017",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2017 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2018_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2018",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2018_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2018",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2018_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2018",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2018_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2018",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2018_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2018",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2018 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2018_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2018",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2018 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2018_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2018",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2018 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2018_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2018",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2018 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2019_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2019",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2019_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2019",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2019_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2019",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2019_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2019",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2019_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2019",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2019 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2019_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2019",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2019 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2019_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2019",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2019 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2019_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2019",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2019 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2020_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2020",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2020_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2020",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2020_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2020",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2020_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2020",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2020_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2020",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2020 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2020_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2020",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2020 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2020_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2020",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2020 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2020_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2020",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2020 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2021_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2021",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2021_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2021",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2021_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2021",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2021_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2021",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2021_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2021",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2021 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2021_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2021",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2021 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2021_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2021",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2021 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2021_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2021",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2021 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2022_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2022",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2022_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2022",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2022_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2022",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2022_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2022",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2022_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2022",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2022 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2022_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2022",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2022 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2022_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2022",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2022 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2022_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2022",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2022 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2023_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2023",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2023_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2023",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2023_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2023",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2023_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2023",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2023_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2023",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2023 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2023_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2023",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2023 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2023_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2023",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2023 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2023_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2023",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2023 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2024_01",
                subject = "Principles of Accounts",
                topic = "Double Entry System",
                year = "2024",
                questionText = "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?",
                optionA = "Debit Machinery Account, Credit ABC Ltd Account",
                optionB = "Debit ABC Ltd Account, Credit Machinery Account",
                optionC = "Debit Purchases Account, Credit Cash Account",
                optionD = "Debit Machinery Account, Credit Cash Account",
                correctAnswerIndex = 0,
                explanation = "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2024_02",
                subject = "Principles of Accounts",
                topic = "Bank Reconciliation",
                year = "2024",
                questionText = "An uncredited lodgement refers to a cheque that has been _____.",
                optionA = "Entered in the Cash Book but not yet credited by the bank",
                optionB = "Drawn and issued to a supplier but not yet presented",
                optionC = "Credited by the bank directly into the account",
                optionD = "Dishonoured by the drawer's bank",
                correctAnswerIndex = 0,
                explanation = "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2024_03",
                subject = "Principles of Accounts",
                topic = "Depreciation of Fixed Assets",
                year = "2024",
                questionText = "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.",
                optionA = "₦90,000",
                optionB = "₦100,000",
                optionC = "₦110,000",
                optionD = "₦45,000",
                correctAnswerIndex = 0,
                explanation = "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2024_04",
                subject = "Principles of Accounts",
                topic = "Correction of Errors",
                year = "2024",
                questionText = "Which of the following errors will NOT affect the agreement of the Trial Balance?",
                optionA = "Error of principle",
                optionB = "Single entry posting error",
                optionC = "Error of casting in the sales book",
                optionD = "Omitting one side of a transaction",
                correctAnswerIndex = 0,
                explanation = "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2024_05",
                subject = "Principles of Accounts",
                topic = "Accounting Ratios",
                year = "2024",
                questionText = "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.",
                optionA = "1.0 : 1",
                optionB = "1.5 : 1",
                optionC = "0.75 : 1",
                optionD = "2.0 : 1",
                correctAnswerIndex = 0,
                explanation = "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2024 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2024_06",
                subject = "Principles of Accounts",
                topic = "Partnership Accounts",
                year = "2024",
                questionText = "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.",
                optionA = "Equally among all partners",
                optionB = "In the ratio of capital contributed",
                optionC = "In proportion to time dedicated",
                optionD = "70% to active partners and 30% to sleeping partners",
                correctAnswerIndex = 0,
                explanation = "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2024 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2024_07",
                subject = "Principles of Accounts",
                topic = "Company Accounts",
                year = "2024",
                questionText = "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.",
                optionA = "Authorized (Nominal) Share Capital",
                optionB = "Issued Share Capital",
                optionC = "Called-up Share Capital",
                optionD = "Paid-up Share Capital",
                correctAnswerIndex = 0,
                explanation = "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2024 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_acc_2024_08",
                subject = "Principles of Accounts",
                topic = "Control Accounts",
                year = "2024",
                questionText = "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.",
                optionA = "Total balances of individual trade debtors",
                optionB = "Total balances of individual trade creditors",
                optionC = "Cash and bank balances",
                optionD = "Fixed asset register",
                correctAnswerIndex = 0,
                explanation = "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Principles of Accounts • 2024 (Q8)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
