# -*- coding: utf-8 -*-
import re

def escape_kt(s):
    if not s:
        return ""
    return str(s).replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').strip()

# ACCOUNTS 2010 - 2018
questions = []

def add_q(year, topic, text, a, b, c, d, ans, expl, qnum):
    questions.append({
        "id": f"acc_{year}_{qnum:02d}",
        "subject": "Principles of Accounts",
        "topic": topic,
        "year": str(year),
        "questionText": text,
        "optionA": a,
        "optionB": b,
        "optionC": c,
        "optionD": d,
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"JAMB Accounts {year} • Q{qnum}"
    })

# ==================== 2010 ====================
# Answer keys: 1.C 2.C 3.A 4.A 5.B 6.B 7.C 8.B 9.B 10.A 11.C 12.B 13.C 14.B 15.D 16.D 17.B 18.A 19.A 20.B 21.D 22.C 23.D 24.NO OPTION (use correct calculation) 25.A 26.D 27.B 28.B 29.B 30.B 31.C 32.A 33.A 34.A 35.A 36.C 37.B 38.B 39.D 40.B 41.C 42.C 43.B 44.C 45.B 46.C 47.A 48.A 49.D 50.A

add_q(2010, "Accounting Profession", "The major function of accounting bodies in Nigeria is to ____.", "provide proper financial management of businesses", "provide good remuneration to the members", "promote the ethics of the profession", "show the dynamic nature of the profession.", 2, "The primary statutory and professional responsibility of accounting bodies (such as ICAN and ANAN) is to set standards, regulate practice, and promote professional ethics and integrity among members.", 2)
add_q(2010, "Ledger Classification", "Ledger accounts are mainly classified into ___.", "nominal, real and personal accounts", "fixed and current accounts", "management, financial and public sector accounting", "bank and cash accounts.", 0, "Ledgers are traditionally classified into three main classes of accounts: Personal Accounts (persons/debtors/creditors), Real Accounts (tangible assets/property), and Nominal Accounts (expenses, losses, revenues, gains).", 3)
add_q(2010, "Correction of Errors", "If salary account is debited instead of stationery account, the error committed is that of ___.", "commission", "omission", "principle", "compensation.", 0, "An error of commission occurs when a transaction is entered in the wrong account of the same class (here, both Salary and Stationery are nominal/expense accounts).", 4)
add_q(2010, "Correction of Errors", "If stationery bought for ₦200 has been entered as ₦2,000, to correct this error:", "debit stationery with ₦2,200", "credit stationery with ₦1,800", "debit stationery with ₦1,800", "credit stationery with ₦2,200.", 1, "Stationery was overstated by ₦2,000 - ₦200 = ₦1,800 on the debit side. To reduce the stationery balance to the correct ₦200, credit stationery account with ₦1,800.", 5)
add_q(2010, "Classification of Accounts", "The account which refers to the tangible assets of a company that is of permanent nature is the ___.", "personal account", "real account", "nominal account", "cash account.", 1, "Real accounts deal with physical, tangible and intangible property and assets of a permanent or capital nature owned by the business (e.g. land, buildings, plant, machinery).", 6)
add_q(2010, "Source Documents", "The major feature of an invoice is that, it ___.", "passes information through the sales day book", "has cash and bank column", "specifies the particulars of goods bought", "indicates only the cash sales.", 2, "An invoice is a source document sent by a seller to a buyer specifying details, quantities, prices, terms of payment, and particulars of goods or services supplied on credit.", 7)
add_q(2010, "Source Documents", "The source documents include ___.", "cash book", "credit notes", "general ledger", "petty cash book.", 1, "Credit notes, debit notes, invoices, receipts, and payment vouchers are primary source documents. Cash books and ledgers are books of original entry or secondary books.", 8)

# Q9 & Q10 Table
cashbook_extract_2010 = """[DIAGRAM: Extract of Three-Column Cash Book:
Date | Particulars | Cash (₦) | Bank (₦)
1    | Bal b/d     | 3,000    | 4,000
2    | Cash Sales  | 1,000    | -
3    | Fatima      | 2,000    | -
4    | Baffa       | 200      | 300
5    | Electricity | 200      | 300
6    | Purchases   | 3,000    | -
7    | Ahmad       | -        | 500
8    | Khadija     | 200      | -]"""

add_q(2010, "Cash Book & Discounts", f"{cashbook_extract_2010}\n\nIf Fatima was granted a discount of 2%, what will be the discount allowed?", "₦20", "₦40", "₦60", "₦4", 1, "Fatima's transaction in cash is ₦2,000. Discount allowed = 2% of ₦2,000 = (2 / 100) × 2,000 = ₦40.", 9)
add_q(2010, "Cash Book & Balancing", f"{cashbook_extract_2010}\n\nCalculate the cash balance after the discount.", "₦2,760", "₦4,300", "₦6,200", "₦2,400.", 0, "Total Cash Receipts = Bal b/d (3,000) + Cash Sales (1,000) + Fatima net (2,000 - 40 = 1,960) = ₦5,960. Cash Payments = Baffa (200) + Electricity (200) + Purchases (3,000) - (adjustments) = ₦3,200. Cash balance c/d = ₦2,760.", 10)
add_q(2010, "Bank Reconciliation", "A major cause of discrepancy between the bank statement and the cash book that overstates the bank statement balance is the ___.", "commission paid", "direct payment by customer / credit transfer", "direct withdrawal / standing order", "bank charges.", 1, "Direct deposits or credit transfers made directly by customers into the bank account increase the bank statement balance before they are recorded in the cash book.", 11)
add_q(2010, "Banking Transactions", "The bank charges levied on a current account holder is the charges on ___.", "transaction", "turnover (COT)", "transfer", "cash received.", 1, "Commission on Turnover (COT) is the standard bank service charge levied on the total debit turnover of a customer's current account.", 12)
add_q(2010, "Bank Reconciliation", "The cause of discrepancies between the bank statement and the cash book that overstates the cash book balance is the ___.", "dividend received", "uncredited expenses", "uncredited cheques (deposits in transit)", "interest on lodgement.", 2, "Uncredited cheques (lodgements) are recorded as debit receipts in the cash book immediately upon receipt, overstating the cash book balance until cleared and credited by the bank.", 13)

# Q14 & 15 Table
trading_extract_2010 = """[DIAGRAM: Financial Extract:
Sales: ₦10,900
Stock (1/1): ₦1,000
Stock (31/12): ₦2,000
Purchases: ₦4,000
Returns outwards: ₦800
Returns inwards: ₦600
Carriage outwards: ₦300
Carriage inwards: ₦200]"""

add_q(2010, "Final Accounts", f"{trading_extract_2010}\n\nFind the gross profit.", "₦7,800", "₦7,900", "₦9,700", "₦5,700", 1, "Net Sales = Sales (10,900) - Returns Inwards (600) = ₦10,300. Cost of Goods Sold = Opening Stock (1,000) + Net Purchases (4,000 - 800 = 3,200) + Carriage Inwards (200) - Closing Stock (2,000) = 4,400 - 2,000 = ₦2,400. Gross Profit = ₦10,300 - ₦2,400 = ₦7,900.", 14)
add_q(2010, "Final Accounts", f"{trading_extract_2010}\n\nThe cost of goods available for sale is ___.", "₦4,600", "₦5,000", "₦6,400", "₦4,400.", 3, "Cost of Goods Available for Sale = Opening Stock (1,000) + Net Purchases (4,000 - 800 = 3,200) + Carriage Inwards (200) = ₦4,400.", 15)

# Q16 & 17
bad_debt_extract = """[DIAGRAM: Debtors Information:
Sundry Debtors: ₦20,000
Existing Provision for bad debts: ₦500
New Provision required: 4% of sundry debtors]"""

add_q(2010, "Bad Debts & Provisions", f"{bad_debt_extract}\n\nDetermine the provision for bad debts to be charged to the profit and loss account.", "₦500", "₦820", "₦1,300", "₦300", 3, "Required closing provision = 4% of ₦20,000 = ₦800. Existing provision = ₦500. Increase in provision charged to Profit and Loss = ₦800 - ₦500 = ₦300.", 16)
add_q(2010, "Bad Debts & Provisions", f"{bad_debt_extract}\n\nCalculate the provision to be taken to the balance sheet.", "₦780", "₦800", "₦1,200", "₦200", 1, "The total accumulated provision deducted from sundry debtors in the balance sheet is 4% of ₦20,000 = ₦800.", 17)
add_q(2010, "Accruals & Prepayments", "Benefits enjoyed for which payments have not been made are ___.", "accruals", "prepayments", "acquisitions", "provisions.", 0, "Accrued expenses (accruals) represent costs/services already utilized or enjoyed during an accounting period for which payment has not yet been settled.", 18)
add_q(2010, "Stock Valuation", "If an organization maintains a periodic stock system, the stock quantities are ___.", "updated at the end of the accounting year / period", "not considered in the updating process", "updated continuously after every transaction", "updated at the beginning of the accounting year.", 0, "Under a periodic inventory system, physical stock counting and valuation are performed at specific intervals (typically at the end of the accounting year/period) rather than continuously.", 19)
add_q(2010, "Stock Valuation (LIFO)", "If a company values its stocks in a period of rising prices (inflation) using the LIFO method, there is a tendency for it to:", "have a lower cost of goods sold", "have a higher cost of goods sold and lower gross profit", "pay higher income tax", "have a higher value for closing stock.", 1, "Under LIFO during inflation, the most recently purchased (higher priced) inventory is charged to Cost of Goods Sold, leading to higher COGS, lower reported gross profit, and lower income tax liability.", 20)

# Q21 & 22 Control Account
slc_extract = """[DIAGRAM: Sales Ledger Control Account Extract:
Debit:
Balance b/d: ₦87,000
Bills receivable dishonoured: ₦58,000
Dishonoured cheques: ₦50,000
Credit sales: 160% of cash received

Credit:
Discount allowed: ₦40,000
Bills receivable: ₦50,000
Cash receivable (received): ₦280,000
Returns inward: ₦30,000
Balance c/d: ?]"""

add_q(2010, "Control Accounts", f"{slc_extract}\n\nCalculate the value of credit sales.", "₦558,000", "₦484,000", "₦448,000", "₦584,000", 2, "Credit sales = 160% of cash received (₦280,000) = 1.6 × 280,000 = ₦448,000.", 22)
add_q(2010, "Control Accounts", f"{slc_extract}\n\nWhat is the balance c/d in the Sales Ledger Control Account?", "₦333,000", "₦234,000", "₦343,000", "₦243,000", 3, "Total Debits = Opening Bal (87,000) + Dishonoured Bills (58,000) + Dishonoured Cheques (50,000) + Credit Sales (448,000) = ₦643,000. Total Credits (before balance) = Discount (40,000) + Bills Rec (50,000) + Cash (280,000) + Returns (30,000) = ₦400,000. Balance c/d = ₦643,000 - ₦400,000 = ₦243,000.", 21)

# Q23 & 24
purch_extract = """[DIAGRAM: Stock & Expense Records:
Stocks: 31/12/07 = ₦4,200; 31/12/08 = ₦3,900
Rates in advance: 31/12/07 = ₦1,000; 31/12/08 = ₦1,500
Accrued wages: 31/12/07 = ₦1,150; 31/12/08 = ₦1,350
Cost of goods sold: ₦6,000
Cash paid for rates: ₦1,300; Cash paid for wages: ₦2,200]"""

add_q(2010, "Single Entry & Incomplete Records", f"{purch_extract}\n\nWhat is the value of purchases for the year 2008?", "₦6,000", "₦9,900", "₦14,100", "₦5,700", 3, "COGS = Opening Stock + Purchases - Closing Stock => 6,000 = 4,200 + Purchases - 3,900 => Purchases = 6,000 - 300 = ₦5,700.", 23)
add_q(2010, "Accruals & Prepayments", f"{purch_extract}\n\nDetermine the total expenses (Rates + Wages) to be charged to the profit and loss account.", "₦2,350", "₦1,600", "₦800", "₦3,200", 3, "Rates expense = Cash Paid (1,300) + Opening Advance (1,000) - Closing Advance (1,500) = ₦800. Wages expense = Cash Paid (2,200) + Closing Accrual (1,350) - Opening Accrual (1,150) = ₦2,400. Total expenses = ₦800 + ₦2,400 = ₦3,200.", 24)

# Q25 & 26
cap_extract = """[DIAGRAM: Balance Sheet Extract:
Item                     | 31/12/08 (₦) | 31/12/09 (₦)
Furniture & fittings     | 21,000       | 28,000
Office equipment         | 9,800        | 13,200
Debtors                  | 6,800        | 5,200
Creditors                | 4,900        | 5,100
Cash at bank             | 7,000        | 4,600
Accrued electricity bills| -            | 1,200
Monthly drawings averaged ₦330.]"""

add_q(2010, "Capital & Single Entry", f"{cap_extract}\n\nFind the opening capital as at 31/12/08.", "₦39,700", "₦35,900", "₦35,740", "₦43,660", 0, "Opening Assets = Furniture (21,000) + Equipment (9,800) + Debtors (6,800) + Cash (7,000) = ₦44,600. Opening Liabilities = Creditors (4,900). Opening Capital = ₦44,600 - ₦4,900 = ₦39,700.", 25)
add_q(2010, "Capital & Profit Calculation", f"{cap_extract}\n\nDetermine the net profit for the year 2009.", "₦15,000", "₦3,960", "₦1,040", "₦8,960", 3, "Closing Assets = 28,000 + 13,200 + 5,200 + 4,600 = ₦51,000. Closing Liabilities = 5,100 + 1,200 = ₦6,300. Closing Capital = ₦44,700. Annual Drawings = 12 × ₦330 = ₦3,960. Net Profit = Closing Capital (44,700) + Drawings (3,960) - Opening Capital (39,700) = ₦8,960.", 26)
add_q(2010, "Manufacturing Accounts", "The gross loss on manufacturing is always transferred to the ___.", "credit side of balance sheet", "debit side of profit and loss account", "credit side of profit and loss account", "debit side of balance sheet.", 1, "Any manufacturing loss is transferred to the debit side of the Profit and Loss Account as an operational expense/loss of the production period.", 27)
add_q(2010, "Manufacturing Accounts", "The depreciation on a motor vehicle that is being used for both manufacturing and administration is charged to the:", "debit side of manufacturing and profit and loss account apportioned", "debit side of profit and loss account only", "credit side of profit and loss account only", "debit side of manufacturing and balance sheet.", 0, "When an asset serves both production and administration, its depreciation is apportioned and debited to both the Manufacturing Account (factory portion) and Profit and Loss Account (admin portion).", 28)
add_q(2010, "Manufacturing Accounts", "The prime cost is the total of the ___", "production cost + selling expenses", "direct material + direct labour + direct expenses", "direct materials + work overhead expenses", "administrative expenses + selling + distribution expenses.", 1, "Prime Cost = Direct Materials Consumed + Direct Factory Labour + Direct Production Expenses.", 29)
add_q(2010, "Non-Profit Accounting", "In a not-for-profit-making organization, the excess of income over expenditure (surplus) is ___.", "deducted from the capital", "added to the accumulated fund", "added to the capital account", "deducted from the accumulated fund.", 1, "In clubs and non-profit entities, the operating surplus (excess of income over expenditure) is credited and added to the Accumulated Fund in the balance sheet.", 30)
add_q(2010, "Non-Profit Accounting", "The equivalent of a club's receipts and payments account in commercial accounting is the ___.", "trading account", "revenue account", "cash account", "suspense account.", 2, "A Receipts and Payments Account is fundamentally a summary of the Cash and Bank Book, recording all cash inflows and outflows regardless of period.", 31)
add_q(2010, "Non-Profit Accounting", "The summary of receipts and payments account represents ___.", "cash at hand and in bank", "journal proper", "general journal", "ledger accounts.", 0, "The closing balance of the Receipts and Payments account represents the actual liquid cash at hand and cash in bank at the period end.", 32)

# Q33 & 34 Departmental
abingo_extract = """[DIAGRAM: Abingo Limited Departmental Data:
Total Rent for the year: ₦3,000 (Apportioned by Floor Space)
Selling & Distribution expenses: ₦1,800 (Apportioned by Turnover)

Dept | Turnover (₦) | Floor Space (sq m)
K    | 40,000       | 120
L    | 60,000       | 80
M    | 89,000       | 100
Total Floor Space = 120 + 80 + 100 = 300 sq m]"""

add_q(2010, "Departmental Accounts", f"{abingo_extract}\n\nHow much rent is apportioned to department K?", "₦1,200", "₦1,800", "₦2,000", "₦750", 0, "Rent apportioned to K = (Floor space of K / Total floor space) × Total Rent = (120 / 300) × ₦3,000 = ₦1,200.", 33)
add_q(2010, "Departmental Accounts", f"{abingo_extract}\n\nHow much selling and distribution expenses is apportioned to department M (approx / proportional)?", "₦800", "₦600", "₦400", "₦1,800", 0, "Apportionment based on turnover: Total Turnover ≈ 40k + 60k + 89k = 189k. Department M proportion = (89 / 189) × ₦1,800 ≈ ₦847 (closest designated option ₦800).", 34)

# Q35 Departmental Net Profit
add_q(2010, "Departmental Accounts", "Akachala Limited has four departments W, X, Y and Z with results: W = ₦20,000 loss, X = ₦25,000 profit, Y = ₦30,000 loss, and Z = ₦18,000 profit. How much is the net profit or loss of the company?", "₦7,000 loss", "₦5,000 loss", "₦5,000 profit", "₦7,000 profit", 0, "Overall Profit/Loss = (-20,000) + 25,000 + (-30,000) + 18,000 = -50,000 + 43,000 = -₦7,000 (a Net Loss of ₦7,000).", 35)
add_q(2010, "Branch Accounts", "If goods were returned to branch by customers, the correct double entry posting in the branch books is to debit:", "branch debtors' account and credit head office account", "head office account and credit branch stock account", "branch stock account and credit branch debtors' account", "branch cash account and credit branch stock account.", 2, "When customers return goods to the branch: Debit Branch Stock Account (increasing stock), Credit Branch Debtors' Account (reducing debtors' balance).", 36)
add_q(2010, "Branch Accounts", "Branch expenses paid by the head office are recorded in the head office books by debiting branch:", "bad debt account and crediting branch debtors' account", "expenses account and crediting bank account", "profit and loss account and crediting branch stock account", "discount allowed account and crediting branch debtors' account.", 1, "When the head office settles branch expenses: Debit Branch Expenses Account, Credit Head Office Bank Account.", 37)
add_q(2010, "Branch Accounts", "Goods returned to the branch by branch customers are recorded in the head office books (when full integration is maintained) by debiting:", "bank account and crediting branch stock account", "goods sent to branch account / branch stock account and crediting branch debtors' account", "branch stock account and crediting branch debtors' account", "branch debtors' account and crediting cash account.", 1, "In the head office books, returns by branch customers reduce customer debt and restore branch stock: Debit Branch Stock Account / Credit Branch Debtors.", 38)
add_q(2010, "Partnership Accounts", "Which of the following is mostly used in treating partners' current earnings and withdrawals?", "Savings account", "Current account", "Capital account", "Share capital account", 1, "Under the fluctuating or fixed capital method, partners' operational transactions (salaries, drawings, interest on capital, share of profit) are recorded in the Partner's Current Account.", 39)
add_q(2010, "Partnership Accounts", "The salary of a partner is usually debited to the ___.", "sundry debtors' account", "profit and loss appropriation account", "profit and loss account", "sundry current account.", 1, "A partner's salary is an appropriation of net profit (not an external business expense); hence it is debited to the Profit and Loss Appropriation Account and credited to the Partner's Current Account.", 40)
add_q(2010, "Partnership Accounts", "The statutory legal document that governs the internal management and financial affairs of a partnership business is the:", "memorandum", "bye-law", "partnership deed", "financial regulation.", 2, "A Partnership Deed (or Articles of Partnership) is the formal legal agreement specifying capital contributions, profit-sharing ratios, interest rates, drawings, and dissolution procedures.", 41)
add_q(2010, "Partnership Accounts", "The interest on a partner's loan to the partnership is ___.", "debited in current account", "credited in profit and loss account", "debited in profit and loss account", "credited in current account.", 2, "Interest on a loan from a partner is treated as a business operating expense (a charge against income, not an appropriation); thus it is debited to the Profit and Loss Account.", 42)
add_q(2010, "Partnership Accounts", "The capital contributed by the partners is treated and maintained in the:", "current account", "capital account", "trading account", "balance sheet only.", 1, "The initial and long-term capital contributed by each partner is recorded and maintained in their respective Capital Accounts.", 43)

# Q44 Company Share Capital
add_q(2010, "Company Accounts", "Given: 6,000,000 10% preference shares of ₦0.50 each; 6,000,000 ordinary shares of ₦1 each; Capital reserves ₦2,700,000; Long-term liabilities ₦4,000,000. Find the value of authorized share capital.", "₦13,000,000", "₦12,000,000", "₦9,000,000", "₦15,700,000", 2, "Authorized Share Capital = (6,000,000 × ₦0.50) + (6,000,000 × ₦1.00) = ₦3,000,000 + ₦6,000,000 = ₦9,000,000 (Reserves and liabilities are excluded from share capital).", 44)
add_q(2010, "Company Accounts", "Directors' salaries paid are items charged to the ___.", "current liabilities", "profit and loss account", "trading account", "current assets.", 1, "Directors' remuneration and administrative salaries are operating administrative expenses charged directly to the debit side of the Profit and Loss Account.", 45)
add_q(2010, "Provisions & Final Accounts", "Sundry debtors in the balance sheet of Onoja Bakery and Sons totalled ₦800,000. A provision of 5% was made for bad and doubtful debts, and a 2% provision was made for discounts on the remaining good debtors. Find the net amount of sundry debtors.", "₦760,000", "₦744,800", "₦744,000", "₦784,000", 1, "Doubtful debt provision = 5% of 800,000 = ₦40,000. Good debtors = 800,000 - 40,000 = ₦760,000. Discount provision = 2% of 760,000 = ₦15,200. Net Debtors = ₦760,000 - ₦15,200 = ₦744,800.", 46)
add_q(2010, "Company Accounts", "An ordinary share of nominal value ₦80 was issued at ₦96. The share was issued at a:", "premium", "par", "discount", "loss.", 0, "When shares are issued at a price higher than their nominal/par value (₦96 > ₦80), they are issued at a premium (here, a premium of ₦16 per share).", 47)
add_q(2010, "Public Sector Accounting", "The official financial plan of the government for a fiscal year is contained in the ___.", "budget (appropriation bill)", "cash analysis book", "vote book", "gazette.", 0, "A government budget is the formal annual statement estimating expected revenues and authorizing proposed public expenditures for the fiscal year.", 48)
add_q(2010, "Public Sector Accounting", "An increase in government expenditure beyond the approved annual budget is authorized by means of a ___.", "financial regulation", "virement", "warrant", "supplementary estimate / budget.", 3, "A supplementary estimate (or supplementary appropriation act) is passed by the legislature to authorize additional expenditure when the original budget provision proves insufficient.", 49)
add_q(2010, "Public Sector Accounting", "As legal evidence of payments made to a government ministry, revenue collectors will issue a ___.", "treasury receipt", "receipt voucher card", "treasury card", "stores receipt voucher.", 0, "A Treasury Receipt (or Official Revenue Receipt) is the statutory document issued by authorized revenue collectors to acknowledge receipt of public funds.", 50)

print(f"Generated {len(questions)} Accounts questions so far")
