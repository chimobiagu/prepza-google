# -*- coding: utf-8 -*-
import json
import re

def escape_kt(s):
    if not s:
        return ""
    return str(s).replace('\\', '\\\\').replace('"', '\\"').replace('$', '\\$').strip()

accounts_questions = []

def add_q(year, topic, text, a, b, c, d, ans, expl, qnum):
    accounts_questions.append({
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

# Run the 2010 part
import gen_accounts_2010_2018
accounts_questions.extend(gen_accounts_2010_2018.questions)

# ==================== 2011 ====================
add_q(2011, "Accounting History", "The historical development of accounting reveals that it ___.", "deals with debit and credit terms only", "is a product of financial development", "is a product of its own social and economic environment", "is an ideal subject for financial development.", 2, "Accounting evolved over centuries in direct response to the socio-economic needs and expanding commerce of human society.", 2)
add_q(2011, "Trial Balance", "In a trial balance, income and liabilities are ___.", "debited and credited respectively", "both credited", "credited and debited respectively", "both debited.", 1, "Under double entry rules, all revenue/income accounts and all liabilities carry credit balances in the trial balance.", 3)
add_q(2011, "Double Entry System", "The principle of double entry bookkeeping ensures ___.", "mathematical accuracy in the trial balance", "balance at the bank", "increases in assets and liabilities", "balance of cash account.", 0, "Double-entry rules (recording every debit with an equal credit) ensure that total debits equal total credits, proving arithmetical accuracy.", 4)
add_q(2011, "Balancing of Accounts", "The correct procedure for balancing a ledger account is: I. Deduct the smaller side from the bigger side; II. Add up both sides; III. Take the difference to the smaller side and add to the smaller figure.", "II, I and III", "I, III and II", "II, III and I", "I, II and III", 0, "First total both columns, find the difference between debit and credit totals, enter the difference as balance c/d on the smaller side, and rule off equal totals.", 5)

tb_extract_2011 = """[DIAGRAM: Financial Balances:
Light expenses: ₦400 (Debit)
Purchases: ₦3,000 (Debit)
Sales: ₦1,200 (Credit)
Debtors: ₦50 (Debit)]"""
add_q(2011, "Trial Balance", f"{tb_extract_2011}\n\nCalculate the total debit of the trial balance items above.", "₦4,250", "₦3,500", "₦4,300", "₦3,450", 3, "Total Debits = Light expenses (₦400) + Purchases (₦3,000) + Debtors (₦50) = ₦3,450.", 6)
add_q(2011, "General Journal", "The major feature of a general journal (journal proper) is that it has ___ columns.", "six columns: date, particulars, folio, amount, debit and credit", "five columns: date, particulars, folio, debit (₦) and credit (₦)", "three columns: date, particulars, and amount", "four columns: date, particulars, folio and amount.", 1, "A standard general journal consists of 5 columns: Date, Particulars (details/narration), Folio, Debit amount, and Credit amount.", 7)
add_q(2011, "Correction of Errors", "The medium of correcting errors whose difference is revealed in the trial balance is by the use of the ___.", "debtors' account", "creditors' account", "suspense account", "nominal account.", 2, "Discrepancies in trial balance totals are temporarily posted to a Suspense Account until individual errors are identified and corrected by journal entry.", 8)

disc_extract_2011 = """[DIAGRAM: Transaction:
Adamu Stores bought accessories from Mu'azu Beverages for ₦400 on credit.
Trade discount: 10%
Cash discount: 15%]"""
add_q(2011, "Discounts & Calculations", f"{disc_extract_2011}\n\nFind the total net amount paid if cash discount is taken.", "₦260", "₦306", "₦200", "₦380", 1, "Invoice Price = ₦400. Trade discount (10%) = ₦40. Net Invoice = ₦360. Cash discount (15% of 360) = ₦54. Net cash paid = 360 - 54 = ₦306 (closest key ₦300/306).", 9)
add_q(2011, "Discounts & Calculations", f"{disc_extract_2011}\n\nCalculate the trade discount amount deducted on invoice.", "₦40", "₦60", "₦90", "₦100", 0, "Trade discount = 10% of ₦400 = ₦40.", 10)
add_q(2011, "Bank Reconciliation", "In the bank reconciliation process, timing discrepancies arise as a result of differences between ___.", "cash book and bank statement timing of entries", "bank statement only", "cash book only", "sales ledger and purchases ledger.", 0, "Timing differences occur because transactions recorded immediately in the cash book (e.g. unpresented/uncredited cheques) take time to clear through the banking system.", 11)
add_q(2011, "Banking Operations", "The inter-bank process of settling and reconciling cheques between different banks is termed cheque ___.", "clearing", "truncation", "holding", "confirmation.", 0, "Cheque clearing (through a clearing house) is the institutional process of exchanging cheques and settling inter-bank funds.", 12)
add_q(2011, "Bank Reconciliation", "In a bank reconciliation statement starting with balance as per cash book, bank overdraft interest charged by the bank should be ___.", "deducted from the cash book balance (or credited to adjusted cash book)", "added to bank statement balance", "added to cash book balance", "ignored.", 0, "Bank charges and overdraft interest reduce the business's bank balance, so they are deducted from the cash book balance or credited in the adjusted cash book.", 13)

assets_liab_extract = """[DIAGRAM: Items:
I. Stock of goods
II. Furniture
III. Creditors
IV. Cash at bank
V. Bank Overdraft / Loan from bank]"""
add_q(2011, "Balance Sheet Classification", f"{assets_liab_extract}\n\nDetermine which of the items are current liabilities.", "III and V", "II and III", "IV and V", "I and II", 0, "Creditors (III) and short-term bank loans/overdrafts (V) are obligations payable within 12 months, making them current liabilities.", 14)
add_q(2011, "Balance Sheet Classification", f"{assets_liab_extract}\n\nFind the current assets from the list.", "III and V", "II and I", "IV and V", "I and IV", 3, "Stock of goods (I) and Cash at bank (IV) are liquid operational assets realizable within one year, classifying them as current assets.", 15)
add_q(2011, "Classification of Expenses", "The type of expense charged against administration of a firm is ___.", "repairs on administrative office building", "interest paid on debenture", "discount allowed", "tax expense.", 0, "Repairs and maintenance of office buildings and equipment are classified under Administrative Expenses in the profit and loss account.", 16)
add_q(2011, "Stock Valuation Methods", "In a period of declining prices (deflation), which stock valuation method will result in higher reported net profit?", "LIFO", "Simple average", "FIFO", "Weighted average.", 0, "When prices are falling, LIFO issues the latest lower-priced inventory to COGS, leaving higher-cost older stock in inventory, resulting in lower COGS and higher gross profit.", 17)
add_q(2011, "Trading Account", "The item appearing on the credit side of the trading account is ___.", "returns outwards", "carriage on sales", "sales", "purchases.", 2, "Sales (revenue from merchandise) is the primary credit entry in the Trading Account.", 18)

# Q19 & 20 Stock movement table
stock_mvt_2011 = """[DIAGRAM: Inventory Movement (July):
June 30: Closing stock 100 units @ ₦90
July 8: Purchased 200 units @ ₦95
July 10: Sold 160 units
July 17: Returned 80 faulty units (from July 8 batch @ ₦95)
July 18: Purchased 200 units @ ₦105
July 20: Sold 180 units
July 28: Purchased 200 units @ ₦110
July 29: Sold 120 units; July 30: Sold 100 units]"""
add_q(2011, "Stock Valuation (Units)", f"{stock_mvt_2011}\n\nHow many units were in stock at hand as at July 30?", "80 units", "100 units", "60 units", "160 units", 2, "Total units in = 100 (opening) + 200 + 200 + 200 = 700 units. Total units out = 160 (sold) + 80 (returns) + 180 (sold) + 120 (sold) + 100 (sold) = 640 units. Closing stock = 700 - 640 = 60 units.", 19)
add_q(2011, "Stock Valuation (FIFO)", f"{stock_mvt_2011}\n\nWhat is the value of stock as at the end of July 10 using FIFO?", "₦14,400", "₦13,300", "₦15,200", "₦12,600", 1, "Available before July 10: 100 @ ₦90 (₦9,000) + 200 @ ₦95 (₦19,000) = 300 units. Sold 160 units on July 10: 100 @ ₦90 + 60 @ ₦95 = 160 units. Remaining stock = 140 units @ ₦95 = ₦13,300.", 20)
add_q(2011, "Ledger Accounts", "A typical example of a real account is ___.", "prepayments", "expenses", "plant and machinery", "income.", 2, "Real accounts represent tangible physical assets and property of the business such as plant, machinery, furniture, and motor vehicles.", 21)
add_q(2011, "Control Accounts", "A control account is used primarily for ___.", "recording all individual customer transactions", "keeping track of bank deposits", "monitoring books of original entry", "checking arithmetical accuracy and detecting errors in subsidiary ledgers.", 3, "Control accounts (sales and purchases ledger control) act as independent check summaries to verify the total balances and accuracy of individual debtor and creditor accounts.", 22)

# Q23 & 24 Incomplete records
incomp_2011 = """[DIAGRAM: Incomplete Record Extract:
Sales: ₦10,600
Rent expense: ₦200
Motor vehicle cost: ₦5,000 (Depreciation at 10% per annum)
Gross profit margin: 20% on sales]"""
add_q(2011, "Incomplete Records", f"{incomp_2011}\n\nWhat is the Cost of Goods Sold?", "₦4,800", "₦8,480", "₦2,320", "₦9,900", 1, "Gross profit margin = 20% of sales = 0.20 × ₦10,600 = ₦2,120. Cost of Goods Sold = Sales (₦10,600) - Gross Profit (₦2,120) = ₦8,480.", 23)
add_q(2011, "Incomplete Records", f"{incomp_2011}\n\nCalculate the net profit for the period.", "₦1,620", "₦1,920", "₦1,420", "₦2,120", 2, "Gross profit = ₦2,120. Operating expenses: Rent = ₦200; Depreciation (10% of ₦5,000) = ₦500. Total expenses = ₦700. Net Profit = ₦2,120 - ₦700 = ₦1,420.", 24)

# Q25 & 26 Trading account
trading_2011 = """[DIAGRAM: Trading Account for Year Ended 31st Dec 2009:
Opening stock: ₦32,000
Purchases: ₦40,000
Carriage inwards: ₦1,000
Less: Returns outwards: ₦2,000
Closing stock: ₦9,000
Gross Sales: ₦48,000
Returns inwards: ₦2,000]"""
add_q(2011, "Trading Account", f"{trading_2011}\n\nFind the average stock for the period.", "₦27,000", "₦23,000", "₦28,000", "₦20,500", 3, "Average Stock = (Opening Stock + Closing Stock) / 2 = (₦32,000 + ₦9,000) / 2 = ₦41,000 / 2 = ₦20,500.", 25)
add_q(2011, "Trading Account", f"{trading_2011}\n\nCalculate the cost of goods sold.", "₦61,000", "₦58,000", "₦62,000", "₦57,000", 2, "Net Purchases = 40,000 - 2,000 = ₦38,000. Cost of goods available = Opening stock (32,000) + Net Purchases (38,000) + Carriage inwards (1,000) = ₦71,000. COGS = 71,000 - Closing Stock (9,000) = ₦62,000.", 26)
add_q(2011, "Cost Accounting", "Costs that are directly traceable and identifiable to a specific unit of product being manufactured are ___.", "partly manufactured goods", "overhead costs", "total factory expenses", "prime costs (direct costs).", 3, "Prime costs comprise direct material, direct labour, and direct expenses that are physically traceable to the manufactured item.", 27)
add_q(2011, "Cost Accounting", "Production costs that are incidental to manufacturing and facilitate production activities but do not become part of the finished product are:", "prime costs", "indirect costs (factory overheads)", "total costs", "direct costs.", 1, "Factory overheads / indirect costs include factory rent, machinery depreciation, supervisor salaries, and factory power.", 28)
add_q(2011, "Manufacturing Accounting", "Work-in-progress is defined as the ___.", "value of partly finished goods remaining in production at the end of a period", "value of finished goods in store", "sales less cost of goods sold", "value of raw materials purchased.", 0, "Work-in-progress represents partially completed goods that are still undergoing transformation on the factory floor at period-end.", 29)
add_q(2011, "Non-Profit Accounting", "The major objective of a not-for-profit-making organization is that it is formed ___.", "to maximize corporate profits", "mainly to provide services and improve the welfare of its members/community", "to trade in commodities on the stock market", "to compute receipts and payments accounts.", 1, "Non-profit organizations (clubs, associations, charities) are established for social, educational, cultural, or religious purposes to serve members without a profit motive.", 30)
add_q(2011, "Non-Profit Accounting", "Subscriptions paid in advance by members of a club are treated in the balance sheet as ___.", "a surplus", "a current liability", "a deficit", "a current asset.", 1, "Subscriptions received in advance represent income received for a future accounting period; hence they are unearned revenue and treated as a current liability.", 31)
add_q(2011, "Non-Profit Accounting", "The accumulated fund of a not-for-profit-making organization represents the ___.", "entity fund", "current assets only", "accumulated capital / excess of assets over liabilities", "statutory grant.", 2, "The Accumulated Fund in non-profit accounting is the equivalent of Capital in commercial accounting, representing total assets minus total liabilities.", 32)
add_q(2011, "Departmental Accounting", "The major objective of preparing departmental accounts is to ___.", "ascertain the separate trading profit or loss and performance of each department", "record the materials sold in each department", "calculate worker pensions", "determine the staff attendance.", 0, "Departmental accounting helps management evaluate the profitability, efficiency, and viability of each individual department.", 33)
add_q(2011, "Partnership Dissolution", "The summary account used to record the sale of assets and settlement of liabilities during the liquidation of a partnership is the ___.", "current account", "cash account", "capital account", "realization account.", 3, "A Realization Account is opened upon dissolution to determine profit or loss on the disposal of partnership assets and discharge of liabilities.", 34)
add_q(2011, "Branch Accounting", "The cost price method of charging goods to a branch is typically used where ___.", "the branch maintains its own comprehensive accounting records and sells at varying prices", "goods are sent without invoice", "goods are perishable and prices fluctuate rapidly", "the branch only acts as a delivery depot.", 0, "When goods are invoiced at cost, the branch treats the consignment as purchases and prepares its own trading account.", 35)
add_q(2011, "Branch Accounting", "The correct double entry to record goods transferred from head office to branch is to debit ___.", "branch stock / branch current account and credit goods sent to branch account", "branch supplies and credit branch stock", "branch stock and credit purchases", "goods sent to branch and credit branch stock.", 0, "Head office records: Debit Branch Current / Stock Account, Credit Goods Sent to Branch Account.", 36)
add_q(2011, "Branch Accounting", "The two primary accounts opened in the head office books to record goods sent to a branch are:", "branch supplies and branch receipts", "branch stock account and goods sent to branch account", "goods sent to branch and cash account", "branch current and sales.", 1, "The head office opens Branch Stock/Current Account and Goods Sent to Branch Account.", 37)
add_q(2011, "Branch Accounting", "Goods invoiced to a branch by the head office may be billed at ___.", "cost price, selling price, or cost plus a fixed percentage mark-up", "cost price and fixed percentage on selling price only", "market price and liquidation value", "scrap value.", 0, "Head office invoices goods to branches at: (1) Cost Price, (2) Cost plus Mark-up (Wholesale price), or (3) Selling Price (Retail price).", 38)
add_q(2011, "Partnership Accounts", "The primary clause and terms of agreement specified in a Partnership Deed include the ___.", "5% statutory loan interest only", "oral agreements among friends", "family inheritance rules", "profit and loss sharing ratio, capital contributions, and interest terms.", 3, "The Partnership Deed specifies profit-sharing ratios, interest on capital, drawings allowances, partner salaries, and dispute mechanisms.", 39)

# Q40 & 41 Partnership Keme & Kemi
part_extract_2011 = """[DIAGRAM: Partnership Data:
Partners: Keme & Kemi (Profit sharing ratio 3:2)
Capital: Keme ₦20,000, Kemi ₦10,000
Drawings: Keme ₦2,000, Kemi ₦3,000
Net Profit: ₦6,000
Interest on capital: 5% per annum
Interest on drawings: 10%]"""
add_q(2011, "Partnership Accounts", f"{part_extract_2011}\n\nCalculate the interest on Kemi's capital.", "₦1,000", "₦500", "₦4,500", "₦3,000", 1, "Interest on Kemi's Capital = 5% of ₦10,000 = 0.05 × 10,000 = ₦500 (Option B).", 40)
add_q(2011, "Partnership Accounts", f"{part_extract_2011}\n\nThe interest on Keme's drawings is calculated as:", "₦200", "₦150", "₦300", "₦100", 0, "Interest on Keme's Drawings = 10% of ₦2,000 = 0.10 × 2,000 = ₦200.", 41)
add_q(2011, "Partnership Accounts", "Which of the following accounts is opened to record revaluation of assets and liabilities upon the admission of a new partner?", "Revaluation account", "Profit and loss account", "Capital account", "Trading account.", 0, "A Revaluation Account is opened on admission of a partner to record increases/decreases in the book value of assets and liabilities.", 42)
add_q(2011, "Partnership Accounts", "Goodwill of a business reflects its established reputation and is determined based on ___.", "capital contribution of old partners", "the business earning capacity and established customer relations", "the number of partners admitted", "the number of active partners.", 1, "Goodwill represents the capitalized value of an enterprise's superior reputation, customer loyalty, brand value, and excess earning power.", 43)
add_q(2011, "Company Accounts", "The individuals who conceive the idea of forming a company and undertake all necessary registration steps are the ___.", "promoters", "shareholders", "canvassers", "stakeholders.", 0, "Company promoters are the entrepreneurs who initiate the business idea, prepare formation documents, and float the company.", 44)
add_q(2011, "Public Sector Accounting", "The statutory public fund into which all revenues and receipts of the Federal Government are paid is the ___.", "Consolidated Revenue Fund (CRF)", "Development Fund", "Trust Fund", "Contingency Fund.", 0, "Section 80 of the 1999 Constitution of Nigeria stipulates that all revenues raised or received by the federation shall be paid into the Consolidated Revenue Fund.", 45)
add_q(2011, "Public Finance in Nigeria", "Which of the following revenue sources accounts for the largest proportion of federally collected revenue in Nigeria?", "Import and custom duties", "Personal income tax", "Petroleum and oil resources", "Company income tax.", 2, "Petroleum resources (crude oil exports, royalties, and petroleum profit tax) have historically constituted the dominant share of Nigerian government revenue.", 46)

# Q47 Share Premium
add_q(2011, "Company Accounts", "If Aboki Holdings Limited issued 120,000 ordinary shares of nominal value ₦2.00 each at a market price of ₦5.50 each, the total share premium created is:", "₦500,000", "₦450,000", "₦550,000", "₦420,000", 3, "Premium per share = ₦5.50 - ₦2.00 = ₦3.50. Total Share Premium = 120,000 shares × ₦3.50 = ₦420,000.", 47)
add_q(2011, "Public Sector Accounting", "Which of the following senior public officials is a statutory signatory and custodian of Federal Government accounts?", "Auditor-General", "Governor of the Central Bank", "Accountant-General of the Federation", "Minister of National Planning.", 2, "The Accountant-General of the Federation is the chief accounting officer and treasurer of the federation, responsible for managing treasury accounts and disbursements.", 48)
add_q(2011, "Local Government Accounting", "The chief accounting officer and political head of a local government council is the ___.", "Chairman of the Council", "Treasurer", "Director of Personnel", "Auditor.", 0, "Under local government financial memoranda, the Executive Chairman is the chief executive and accounting officer of the Local Government Council.", 49)
add_q(2011, "Public Sector Accounting", "Which public official signs the General Warrant authorizing the release and expenditure of funds from the Consolidated Revenue Fund?", "Minister of Finance", "Chairman of Economic Advisory Council", "Permanent Secretary", "Auditor-General.", 0, "The Minister of Finance issues and signs the General Warrant authorizing the Accountant-General to disburse funds appropriated in the approved annual budget.", 50)

print(f"Total Accounts questions after 2011: {len(accounts_questions)}")

# Write to a JSON intermediate file or directly build the Kotlin file
with open('accounts_data.json', 'w', encoding='utf-8') as f:
    json.dump(accounts_questions, f, indent=2)

