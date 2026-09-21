package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified Principles of Accounts UTME Past Exam Question Bank.
 * Features comprehensive step-by-step accounting workings, double-entry rules, and standard accounting principles.
 */
object JambAccountsPastExamMegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        fun addQ(
            id: String,
            year: String,
            topic: String,
            text: String,
            optA: String,
            optB: String,
            optC: String,
            optD: String,
            correct: Int,
            explanation: String,
            qNum: Int
        ) {
            list.add(
                QuestionEntity(
                    id = id,
                    subject = "Principles of Accounts",
                    topic = topic,
                    year = year,
                    questionText = text,
                    optionA = optA,
                    optionB = optB,
                    optionC = optC,
                    optionD = optD,
                    correctAnswerIndex = correct,
                    explanation = explanation,
                    difficulty = "Medium",
                    originType = "JAMB_ORIGINAL",
                    originLabel = "JAMB Accounts $year • Q$qNum"
                )
            )
        }

        // Q1: Accounting Concepts
        addQ(
            "acc_past_01", "1994", "Accounting Concepts & Conventions",
            "The term 'accounting period' is used to refer to the:",
            "time span during which taxes are paid to the Inland Revenue Board",
            "budget period, usually one year, relied on by the accountant",
            "time span, usually one year, covered by financial statements",
            "period within which debtors are expected to settle accounts",
            2,
            "An accounting period is the specific time span (conventionally 12 months/one year) covered by a complete set of financial statements (Trading, Profit & Loss Account, and Balance Sheet).",
            1
        )

        // Q2: Matching Concept
        addQ(
            "acc_past_02", "1994", "Accounting Concepts & Conventions",
            "Assigning revenues to the accounting period in which goods were sold or services rendered and expenses incurred is known as the:",
            "passing of entries",
            "consistency convention",
            "matching concept",
            "adjusting for revenue",
            2,
            "The matching concept (or accrual principle) requires revenues and the related expenses incurred in generating those revenues to be recognized and matched in the same accounting period.",
            2
        )

        // Q3: Conservatism / Prudence
        addQ(
            "acc_past_03", "1994", "Accounting Concepts & Conventions",
            "The accounting convention which states that 'profit must not be recognized until realized while all possible losses should be adequately provided for' is termed:",
            "materiality",
            "objectivity",
            "consistency",
            "conservatism (prudence)",
            3,
            "The conservatism (or prudence) convention dictates that accountants should anticipate no profits until realized, but provide for all foreseeable losses and liabilities.",
            3
        )

        // Q7: Double Entry
        addQ(
            "acc_past_07", "1994", "Double Entry Bookkeeping",
            "What is the cardinal fundamental rule of the double entry system?",
            "Debit the increasing account and credit the decreasing account",
            "Debit the receiving account and credit the giving account",
            "Debit the asset account and credit the liability account",
            "Debit the revenue account and credit the expenditure account",
            1,
            "The foundational rule of double-entry bookkeeping states: 'Debit the receiver (or account receiving value), Credit the giver (or account giving value)'.",
            7
        )

        // Q9: Ledger Folio
        addQ(
            "acc_past_09", "1994", "Books of Original Entry & Ledgers",
            "The primary purpose of the folio column in the ledger is for:",
            "referencing and cross-checking entries between journals and ledgers",
            "recording the particulars of the transaction",
            "listing the titles of the accounts",
            "calculating credit discounts",
            0,
            "The folio column provides cross-referencing between books of prime entry (journals) and ledger accounts to facilitate auditing and error tracking.",
            9
        )

        // Q11: Trial Balance & Errors
        addQ(
            "acc_past_11", "1994", "Correction of Errors & Suspense Account",
            "A suspense account is used to temporarily record and correct bookkeeping errors where the:",
            "amount involved is quite significant",
            "item involved is not material",
            "item involved is completely unknown",
            "error causes a disagreement in the trial balance totals",
            3,
            "A suspense account is a temporary holding account opened when a trial balance fails to agree due to one-sided errors or mathematical discrepancies in the ledgers.",
            11
        )

        // Q13: Petty Cash Imprest
        addQ(
            "acc_past_13", "1995", "Cash Book & Imprest System",
            "Under the imprest system, when is a petty cash account debited?",
            "When the fund is first established and whenever the float is reimbursed/replenished",
            "Every time money is spent on small expenses",
            "Only at the end of every fiscal year",
            "When cash is withdrawn by the proprietor",
            0,
            "The petty cash account is debited initially when the petty cash float is established, and when reimbursement cheques are cashed to restore the float to its agreed limit.",
            13
        )

        // Q14: Bank Reconciliation
        addQ(
            "acc_past_14", "1995", "Bank Reconciliation Statement",
            "When preparing a bank reconciliation statement starting from the balance per bank statement, which of the following is deducted?",
            "Bank charges",
            "Uncredited lodgements (deposits in transit)",
            "Returned dishonored cheques",
            "Unpresented cheques",
            3,
            "Unpresented cheques (cheques issued to creditors but not yet presented for payment at the bank) are deducted from the bank statement balance to reconcile with the cash book balance.",
            14
        )

        // Q15: Balance Sheet
        addQ(
            "acc_past_15", "1995", "Final Accounts of a Sole Trader",
            "The financial position and net worth of an enterprise at a specific point in time is ascertained from the:",
            "Statement of Sources and Application of Funds",
            "Statement of Retained Earnings",
            "Balance Sheet (Statement of Financial Position)",
            "Trading, Profit and Loss Account",
            2,
            "The Balance Sheet shows the financial status of a business at a specific date by detailing its total assets, liabilities, and owner's capital equity.",
            15
        )

        // Q16: Cost of Goods Sold
        addQ(
            "acc_past_16", "1995", "Trading Account Computations",
            "Given: Opening stock ₦10,000, Purchases ₦20,000, Carriage inwards ₦5,000, Closing stock ₦5,000. What is the Cost of Goods Sold?",
            "₦30,000", "₦25,000", "₦20,000", "₦15,000",
            0,
            "Cost of Goods Sold = Opening Stock (₦10,000) + Purchases (₦20,000) + Carriage Inwards (₦5,000) - Closing Stock (₦5,000) = ₦35,000 - ₦5,000 = ₦30,000.",
            16
        )

        // Q22: Bad Debts Recovered
        addQ(
            "acc_past_22", "1996", "Bad Debts & Provisions",
            "If a bad debt previously written off in a prior year is subsequently recovered and repaid in cash, the amount collected is credited as:",
            "an income in the profit and loss account (Bad Debts Recovered)",
            "an income directly in the balance sheet",
            "a reduction in the trade creditors account",
            "an expense in the manufacturing account",
            0,
            "When bad debts previously written off are recovered: Debit Cash/Bank, Credit Bad Debts Recovered Account. The balance of Bad Debts Recovered is then transferred as other income to the credit of the Profit and Loss Account.",
            22
        )

        // Q34: Partnership Final Accounts
        addQ(
            "acc_past_34", "1996", "Partnership Accounts",
            "The major distinguishing financial account between the final accounts of a partnership and a sole trader is the:",
            "Drawings Account",
            "Profit and Loss Appropriation Account",
            "Capital Account",
            "Trade Creditors Account",
            1,
            "A partnership prepares a Profit and Loss Appropriation Account to distribute net profit among partners (interest on capital, partners' salaries, interest on drawings, and residual profit/loss sharing), which a sole trader does not require.",
            34
        )

        // Q35: Goodwill Recognition
        addQ(
            "acc_past_35", "1997", "Partnership Accounts (Goodwill)",
            "Goodwill appears in the balance sheet of a business only when it has been:",
            "purchased at a specific price during a business acquisition or takeover",
            "estimated subjectively by the company's directors",
            "calculated on the retirement of an employee",
            "created to inflate the net assets of an insolvent firm",
            0,
            "Under standard accounting principles (e.g., IFRS/GAAP), internally generated goodwill is not recognized on the balance sheet; only purchased goodwill arising from a business acquisition is capitalized.",
            35
        )

        // Q38: Partnership Dissolution
        addQ(
            "acc_past_38", "1997", "Partnership Accounts (Dissolution)",
            "Under which of the following conditions is a partnership formally dissolved by law?",
            "Admission of a new partner or death/bankruptcy of a partner (in the absence of agreement)",
            "Change of the partnership's physical head office",
            "Purchase of a large quantity of fixed assets",
            "Retirement of an office manager who is not a partner",
            0,
            "A partnership is legally dissolved upon the death, bankruptcy, or retirement of a partner, or when partners mutually agree to terminate business or convert to a company.",
            38
        )

        // Q40: Company Accounts (Nominal Share Value)
        addQ(
            "acc_past_40", "1998", "Company Accounts",
            "A limited liability company has an authorized share capital of ₦50 million split into 100 million shares. What is the nominal (par) value of each share?",
            "₦2.00", "₦0.80", "₦0.60", "₦0.50 (50k)",
            3,
            "Nominal Value per share = Total Authorized Share Capital / Total Number of Shares = ₦50,000,000 / 100,000,000 shares = ₦0.50 (or 50 kobo).",
            40
        )

        // Q41: Issued Capital
        addQ(
            "acc_past_41", "1998", "Company Accounts",
            "If 80 million shares of nominal value 50k each were offered and fully subscribed by the public, what is the issued share capital?",
            "₦40 million", "₦48 million", "₦50 million", "₦80 million",
            0,
            "Issued Capital = Number of shares issued × Nominal value per share = 80,000,000 × ₦0.50 = ₦40,000,000 (₦40 million).",
            41
        )

        // Q42: Articles of Association
        addQ(
            "acc_past_42", "1998", "Company Accounts (Regulations)",
            "The statutory document setting out the internal regulations regarding shares, voting rights, directors' powers, and company meetings is known as:",
            "Memorandum of Association",
            "Articles of Association",
            "Prospectus",
            "Certificate of Incorporation",
            1,
            "The Articles of Association governs the internal management, operations, rights of shareholders, and duties of directors, whereas the Memorandum governs external relations with the public.",
            42
        )

        // Q43: Financial Ratios
        addQ(
            "acc_past_43", "1999", "Financial Ratio Analysis",
            "An advantage of using accounting financial ratios in financial statement analysis is that they:",
            "are easily memorized without computation",
            "facilitate meaningful comparison and decision-making over time and across firms",
            "prevent all corporate fraud automatically",
            "replace the need for balance sheets",
            1,
            "Financial ratios standardize financial data, allowing managers, investors, and creditors to compare liquidity, profitability, and solvency across different operating periods and industries.",
            43
        )

        // Q44: Acid Test Ratio
        addQ(
            "acc_past_44", "1999", "Financial Ratio Analysis (Liquidity)",
            "The Quick Ratio (Acid Test Ratio) measures a company's ability to:",
            "pay off its immediate short-term liabilities without relying on the sale of inventory",
            "maximize long-term return on capital employed",
            "increase total annual turnover",
            "distribute high dividends to ordinary shareholders",
            0,
            "Quick Ratio = (Current Assets - Inventory) / Current Liabilities. It evaluates instantaneous liquidity by excluding less liquid inventory.",
            44
        )

        // Q51: Public Sector Accounting
        addQ(
            "acc_past_51", "2000", "Public Sector & Government Accounting",
            "The allocated sum of money authorized by the legislature for a specific ministry or expenditure item in a government budget is called a:",
            "Vote",
            "Deposit",
            "Loan",
            "Grant",
            0,
            "In public sector accounting, a 'Vote' is the formal legislative appropriation authorizing a government department or ministry to spend a designated amount of public funds for a specified purpose.",
            51
        )

        return list
    }
}
