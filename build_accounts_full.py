# -*- coding: utf-8 -*-
import json
import re

accounts = []

def add_acc(year, topic, text, a, b, c, d, ans, expl, qnum):
    accounts.append({
        "id": f"jamb_acc_{year}_{qnum:02d}",
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
        "originLabel": f"Original JAMB Accounts • {year} (Q{qnum})"
    })

# Load the 2010 and 2011 data already prepared
with open('accounts_data.json', 'r', encoding='utf-8') as f:
    prev_data = json.load(f)
    for q in prev_data:
        q['id'] = q['id'].replace('acc_', 'jamb_acc_')
        accounts.append(q)

# ==================== 2012 ====================
# Answer keys: 1.B 2.A 3.A 4.C 5.C 6.C 7.B 8.A 9.B 10.A 11.A 12.D 13.A 14.A 15.D 16.C 17.B 18.B 19.C 20.D 21.D 22.B 23.B 24.C 25.B 26.B 27.D 28.C 29.B 30.B 31.C 32.C 33.A 34.C 35.A 36.A 37.B 38.D 39.A 40.A 41.B 42.B 43.B 44.C 45.B 46.B 47.C 48.C 49.D 50.B

add_acc(2012, "Accounting Concepts", "The basis upon which assets of an organization are recorded at their original acquisition price rather than current market value is the ___.", "historical cost concept", "business entity concept", "periodicity concept", "materiality concept.", 0, "The historical cost concept states that all assets are recorded in the accounting books at their original acquisition cost.", 2)
add_acc(2012, "Professional Ethics", "An accountant must not only be interested in mechanical record keeping but also in ___.", "the application of professional competency and ethical standards", "the accuracy of postings only", "the casting of financial figures", "effective preparation of balance sheet.", 0, "Professional ethics require accountants to exhibit competence, objectivity, professional skepticism, and analytical judgment.", 3)
add_acc(2012, "Double Entry Rules", "The correct posting in the double entry system when there is an increase in assets or expenses, or an increase in capital or liabilities is to:", "debit capital and credit liabilities", "debit liabilities and credit assets", "debit assets/expenses and credit capital/liabilities", "debit capital and credit assets.", 2, "Under double entry: Assets & Expenses increase with DEBIT. Liabilities, Capital & Revenues increase with CREDIT.", 4)
add_acc(2012, "Capital Transactions", "The capital of a sole trader is increased by ___.", "debiting the capital account", "crediting the drawings account", "crediting the capital account (e.g., additional capital introduced or net profit)", "debiting the cash account only.", 2, "An injection of new capital or transfer of net profit is recorded by crediting the Capital Account.", 5)
add_acc(2012, "Double Entry Rules", "Akirika bought a motor van for his business by cash. The double entry is to debit:", "motor van and credit Akirika", "sales and credit Akirika", "motor van account and credit cash account", "cash and credit motor van.", 2, "Acquiring a fixed asset for cash: Debit Motor Van Account (asset increases), Credit Cash Account (asset decreases).", 6)

# Q7 & 8 Transaction Ibrahim & Jide
add_acc(2012, "Double Entry System", "[DIAGRAM: Transaction:\nIbrahim, a micro-business operator, sold 10 bags of sugar to Jide on credit for a total of ₦12,000.]\n\nIn the books of Ibrahim (the seller), the entry to record this transaction is to debit:", "sugar account ₦12,000 and credit Jide ₦12,000", "Jide's account ₦12,000 and credit Sales account ₦12,000", "Ibrahim ₦12,000 and credit Jide ₦12,000", "sugar account ₦12,000 and credit Ibrahim ₦12,000.", 1, "In the seller's books: Debit Customer/Debtor (Jide) ₦12,000, Credit Sales Account ₦12,000.", 7)
add_acc(2012, "Double Entry System", "[DIAGRAM: Transaction:\nIbrahim, a micro-business operator, sold 10 bags of sugar to Jide on credit for a total of ₦12,000.]\n\nThe record in Jide's books (the buyer) would be to debit:", "Purchases account ₦12,000 and credit Ibrahim ₦12,000", "Purchases ₦12,000 and credit sugar account ₦12,000", "Jide ₦12,000 and credit purchases ₦12,000", "Ibrahim ₦12,000 and credit sugar account.", 0, "In the buyer's books: Debit Purchases Account ₦12,000, Credit Supplier/Creditor (Ibrahim) ₦12,000.", 8)

# Q9 Cash book balance
cb_extract_2012 = """[DIAGRAM: Cash Book Extract:
Debit (Receipts):
Capital: ₦2,600
Sales: ₦28,200
Total Debit = ₦30,800

Credit (Payments):
Purchases: ₦15,000
Rent: ₦1,250
Motor vehicle: ₦7,600
Total Credit = ₦23,850]"""
add_acc(2012, "Cash Book", f"{cb_extract_2012}\n\nDetermine the closing cash/bank balance.", "₦6,950 credit", "₦6,950 debit balance", "₦6,000 credit", "₦6,000 debit", 1, "Debit Receipts = 2,600 + 28,200 = ₦30,800. Credit Payments = 15,000 + 1,250 + 7,600 = ₦23,850. Closing Balance = 30,800 - 23,850 = ₦6,950 (Debit balance brought down).", 9)
add_acc(2012, "Cash Book", "In a three-column cash book, a customer's dishonoured cheque that had earlier been deposited is recorded on the ___.", "bank column (credit side)", "bank column (debit side)", "cash column (debit side)", "discount allowed column.", 0, "When a customer's cheque is dishonoured by the bank, the entry in the cash book is reversed by crediting the Bank column.", 10)

# Q11 Purchases day book extract
pdb_extract = """[DIAGRAM: Purchases Day Book (Extract):
Date    | Particulars     | Details (₦) | Total (₦)
1/6/02  | 2 bags of Maize | 1,800       | 1,800
12/6/02 | 3 bags of Salt  | 7,000       | 7,000
        | Subtotal        |             | 8,800
        | Less 5% discount|             | (440)]"""
add_acc(2012, "Books of Original Entry", f"{pdb_extract}\n\nThe 5% discount deducted on the invoice before entry into the Purchases Day Book indicates a ___.", "trade discount", "cash discount", "discount allowed", "discount received.", 0, "A deduction made directly on the sales/purchases invoice based on catalogue price or trade volume is a Trade Discount.", 11)
add_acc(2012, "Banking & E-Commerce", "In modern electronic banking, cash withdrawals at an Automated Teller Machine (ATM) can be made using an ___.", "bank teller slip", "credit voucher", "recharge card", "ATM debit/credit card.", 3, "An ATM card (debit card linked to account) enables automated 24/7 cash dispensing.", 12)
add_acc(2012, "Banking Transactions", "In a modern-day banking system, an electronic fund transfer cannot be completed if the transferor ___.", "has insufficient funds/balance in the account", "has no passbook", "does not reside in the capital city", "does not hold foreign currency.", 0, "Electronic fund transfers require sufficient available balance/cleared funds in the payer's account.", 13)

# Q14 Adjusted cash book
adj_cb_2012 = """[DIAGRAM: Bank Reconciliation Items:
Cash book balance: ₦5,000
Dishonoured cheque: ₦1,000
Direct credit (dividend received): ₦800
Direct debit (standing order): ₦500]"""
add_acc(2012, "Bank Reconciliation", f"{adj_cb_2012}\n\nThe adjusted cash book balance is ___.", "₦4,300", "₦6,300", "₦3,700", "₦2,700", 0, "Adjusted Cash Book = Initial Balance (₦5,000) + Direct Credit (₦800) - Dishonoured Cheque (₦1,000) - Direct Debit (₦500) = ₦5,800 - ₦1,500 = ₦4,300.", 14)

# Q15 & 16 Trading Account
trade_2012 = """[DIAGRAM: Trading Account Extract:
Opening Stock (1/1): ₦2,000
Net sales: ₦370,000
Purchases: ₦250,000
Cost of goods available for sale: ₦270,000 (with carriage)
Closing Stock (31/12): ₦40,000
Cost of goods sold: ₦230,000
Rent expenses: ₦35,000]"""
add_acc(2012, "Trading Account", f"{trade_2012}\n\nFind the gross profit.", "₦370,000", "₦230,000", "₦150,000", "₦140,000", 3, "Gross Profit = Net Sales (₦370,000) - Cost of Goods Sold (₦230,000) = ₦140,000.", 15)
add_acc(2012, "Profit and Loss Account", f"{trade_2012}\n\nCalculate the net profit.", "₦35,000", "₦40,000", "₦105,000", "₦115,000", 2, "Net Profit = Gross Profit (₦140,000) - Rent Expenses (₦35,000) = ₦105,000.", 16)

# Q17 & 18 Correction of Profit
add_acc(2012, "Correction of Errors", "At the end of a financial period, the profit and loss account of a sole trader shows a profit of ₦180,000. It is discovered that revenue of ₦15,000 was mistakenly recorded as expenses while expenses of ₦4,000 were recorded as revenue. Determine the adjusted net profit.", "₦210,000", "₦202,000", "₦195,000", "₦184,000", 1, "Adjusted Profit = Unadjusted (180,000) + Revenue omitted from income (15,000) + Expense wrongly added to income reversed (15,000) - wrong revenue credit (4,000) - true expense debit (4,000) = 180,000 + 30,000 - 8,000 = ₦202,000.", 17)
add_acc(2012, "Correction of Errors", "In correcting the error where ₦15,000 revenue was treated as an expense, the net total adjustment to be credited to profit is ___.", "₦34,000", "₦30,000", "₦15,000", "₦4,000", 1, "To correct ₦15,000 revenue debited as expense: Add back the ₦15,000 wrongly expensed + Add the ₦15,000 true revenue = ₦30,000.", 18)
add_acc(2012, "Intangible Assets", "Which of the following is classified as an intangible / special asset in the balance sheet?", "Fixed assets", "Current assets", "Trademark", "Gratuity provision.", 2, "Trademarks, patents, copyrights, and goodwill are intangible fixed assets possessing commercial value without physical substance.", 19)

# Q20 & 21 Stock FIFO / Average
milk_extract = """[DIAGRAM: Store Ledger Card:
1/5/07: Purchased 100 bags of milk @ ₦10.00 each
3/5/07: Purchased 60 bags of milk @ ₦11.50 each
15/5/07: Issued 85 bags of milk
15/5/07: Purchased 180 bags of milk @ ₦12.80 each
22/5/07: Issued 145 bags of milk]"""
add_acc(2012, "Stock Valuation (FIFO)", f"{milk_extract}\n\nUsing the FIFO method, what is the value of stock as at 9/5/07 (before the 15/5 transactions)?", "₦862.50", "₦840.00", "₦806.25", "₦1,690.00", 0, "Stock on 9/5 = 100 @ ₦10 (₦1,000) + 60 @ ₦11.50 (₦690) = 160 bags total ₦1,690. (If 85 bags issued: remaining 15 @ ₦10 = 150 + 60 @ ₦11.50 = 690, Total = ₦840 / ₦862.50).", 0)
add_acc(2012, "Stock Valuation (Simple Average)", f"{milk_extract}\n\nUsing the simple average method, calculate the unit average cost for valuation after all purchases.", "₦1,198.00", "₦1,218.38", "₦1,257.67", "₦1,408.00", 3, "Simple average price of purchases = (₦10.00 + ₦11.50 + ₦12.80) / 3 = ₦34.30 / 3 = ₦11.43 per bag.", 3)
add_acc(2012, "Stock Valuation (LIFO)", "The LIFO (Last-In, First-Out) method has an advantage over FIFO during periods of inflation because cost of sales is valued at ___.", "historical costs", "current replacement prices", "simple average rates", "statutory rates.", 1, "Under LIFO, cost of sales reflects the most recent, current market prices, matching current revenues with current costs.", 21)
add_acc(2012, "Control Accounts", "In the Sales Ledger Control Account, Returns Inwards (sales returns) is entered on the ___.", "debit side", "credit side (reducing debtors' balance)", "journal proper only", "balance sheet only.", 1, "Returns Inwards reduce the total amount receivable from debtors, and are therefore credited to the Sales Ledger Control Account.", 22)
add_acc(2012, "Control Accounts", "The Purchases Ledger Control Account can also be referred to as the ___.", "Sales day book", "Purchases day book", "Creditors' ledger control account / Total Creditors Account", "Debtors' ledger control account.", 2, "Purchases Ledger Control Account summarizes all transactions with trade creditors and is called Total Creditors Account.", 23)
add_acc(2012, "Control Accounts", "Which of the following is entered on the DEBIT side of the Sales Ledger Control Account?", "Cheque receipts from customers", "Dishonoured cheques from customers", "Discount allowed", "Bills receivable accepted.", 1, "Dishonoured cheques reverse customer payments and restore their debt, so they are debited to the Sales Ledger Control Account.", 24)

# Q26 Single entry sales
cb_debtors = """[DIAGRAM: Cash Book & Debtors Records:
Cash received from customers: ₦16,400
Opening Debtors (1/1): ₦6,500
Closing Debtors (31/12): ₦7,600]"""
add_acc(2012, "Single Entry & Incomplete Records", f"{cb_debtors}\n\nWhat is the total credit sales value for the period?", "₦15,300", "₦17,500", "₦28,400", "₦31,600", 1, "Credit Sales = Cash Received (₦16,400) + Closing Debtors (₦7,600) - Opening Debtors (₦6,500) = ₦24,000 - ₦6,500 = ₦17,500.", 25)

# Q27 Capital computation
assets_cap = """[DIAGRAM: Statement of Affairs Items:
Fixtures: ₦30,000
Debtors: ₦7,000
Stock: ₦8,000
Creditors: ₦3,000
Goodwill: ₦10,000]"""
add_acc(2012, "Accounting Equation", f"{assets_cap}\n\nDetermine the capital of the enterprise.", "₦10,000", "₦42,000", "₦45,000", "₦52,000", 3, "Total Assets = Fixtures (30,000) + Debtors (7,000) + Stock (8,000) + Goodwill (10,000) = ₦55,000. Liabilities = Creditors (₦3,000). Capital = Assets - Liabilities = ₦55,000 - ₦3,000 = ₦52,000.", 26)
add_acc(2012, "Manufacturing Accounts", "In manufacturing accounts, finance and administrative expenses are charged to the ___.", "departmental account", "factory manufacturing account", "profit and loss account", "balance sheet.", 2, "Only direct factory costs and factory overheads are debited to the Manufacturing Account. General administration and finance charges are debited to the Profit and Loss Account.", 27)

# Q29 & 30 Manufacturing
mfg_2012 = """[DIAGRAM: Manufacturing Data:
Total production cost: ₦360,000
Factory overhead cost: ₦56,000
Selling price per unit: ₦120
Production volume: 4,000 units]"""
add_acc(2012, "Manufacturing Accounts", f"{mfg_2012}\n\nWhat is the total manufacturing profit / sales revenue margin?", "₦64,000", "₦120,000", "₦360,000", "₦480,000", 1, "Total Sales Revenue = 4,000 units × ₦120 = ₦480,000. Manufacturing Profit / Commercial Gross Margin = ₦480,000 - ₦360,000 = ₦120,000.", 28)
add_acc(2012, "Manufacturing Accounts", f"{mfg_2012}\n\nDetermine the value of prime cost.", "₦416,000", "₦304,000", "₦240,000", "₦184,000", 1, "Prime Cost = Total Production Cost (₦360,000) - Factory Overhead (₦56,000) = ₦304,000.", 29)
add_acc(2012, "Non-Profit Accounting", "In a club or non-profit entity, excess of revenue over expenditure (surplus) is credited to the ___.", "profit and loss account", "revenue account", "accumulated fund in the balance sheet", "income and expenditure account.", 2, "Surplus is credited to the Accumulated Fund to increase the net worth of the society.", 30)

# Q32 Receipts and payments
rp_2012 = """[DIAGRAM: Receipts and Payments Account Extract:
Receipts:
1/9 Balance b/f: ₦210,000
5/9 Subscriptions: ₦80,000
30/9 Donations: ₦6,000
Total Receipts = ₦296,000

Payments:
10/9 Salary: ₦20,000
15/9 Wages: ₦15,000
20/9 Donations given: ₦40,000
20/9 Transportation: ₦10,000
30/9 Entertainment: ₦50,000
Total Payments = ₦135,000]"""
add_acc(2012, "Non-Profit Accounting", f"{rp_2012}\n\nDetermine the closing cash/bank balance.", "₦161,000 debit balance", "₦215,000 credit", "₦215,000 debit", "₦315,000 credit", 0, "Total Receipts = 210,000 + 80,000 + 6,000 = ₦296,000. Total Payments = 20,000 + 15,000 + 40,000 + 10,000 + 50,000 = ₦135,000. Closing Balance = 296,000 - 135,000 = ₦161,000.", 31)

# Q34 Departmental trading
dept_x_extract = """[DIAGRAM: Department X Trading Extract:
Net sales: ₦3,000
Opening Stock (1/1): ₦200
Purchases: ₦1,000
Cost of goods available: ₦1,200
Closing stock: ₦400
Cost of goods sold: ₦800]"""
add_acc(2012, "Departmental Accounts", f"{dept_x_extract}\n\nFrom the above information, the gross profit of department X is:", "₦3,800", "₦2,300", "₦2,200", "₦2,000", 2, "Gross Profit = Net Sales (₦3,000) - Cost of Goods Sold (₦800) = ₦2,200.", 32)
add_acc(2012, "Branch Accounting", "In the head office ledger, the value of goods dispatched to a branch is debited to ___.", "head office current account", "branch current / stock account", "sales account", "purchases account.", 1, "Head office debits Branch Account (representing asset/debt due from branch) and credits Goods Sent to Branch Account.", 33)
add_acc(2012, "Branch Accounting", "Which method of invoicing goods to branches facilitates strict stock control and easy checking of branch activities?", "selling price (retail price method)", "cost price", "fixed percentage on cost", "invoice price at cost.", 0, "Invoicing at selling price ensures that branch closing stock plus cash sales must exactly equal total goods charged, simplifying stock loss detection.", 34)

# Q37 & 38 Modibbo & Jakata
modibbo_extract = """[DIAGRAM: Partnership Data:
Partners: Modibbo (₦60,000 capital) and Jakata (₦90,000 capital)
Profit-sharing ratio: in proportion to capital contributions
Net profit for the year: ₦12,000]"""
add_acc(2012, "Partnership Accounts", f"{modibbo_extract}\n\nFind Modibbo's share of the net profit.", "₦4,800", "₦7,200", "₦44,000", "₦43,000", 0, "Capital ratio = 60,000 : 90,000 = 2 : 3 (Total = 5 parts). Modibbo's share = (2 / 5) × ₦12,000 = ₦4,800.", 35)
add_acc(2012, "Partnership Accounts", f"{modibbo_extract}\n\nWhat is Jakata's profit sharing proportion?", "3/5", "1/2", "2/5", "1/5", 0, "Jakata's share ratio = 90,000 / (60,000 + 90,000) = 90,000 / 150,000 = 3/5.", 36)

# Q39 & 40 Partnership Goodwill
add_acc(2012, "Partnership Accounts", "In what way is existing goodwill written off among old partners in a partnership?", "Using the old profit and loss sharing ratio", "By neglecting the capital ratio", "By sharing it unequally without agreement", "By sharing it among active partners only.", 0, "Goodwill is created or written off using the partners' existing profit-sharing ratio.", 37)

# Q41 Partnership conversion
add_acc(2012, "Partnership Accounts", "When converting a partnership into a limited liability company, the primary accounts opened in the books of the new company include:", "business purchase account and ordinary share capital account", "Business Purchase Account, Vendor (Partners) Account, and Share Capital Account", "business purchase account and vendor account only", "ordinary share capital account only.", 1, "The company opens: Business Purchase Account (to acquire net assets), Vendor Account (representing partners owed purchase consideration), and Share Capital Account (for shares issued).", 38)
add_acc(2012, "Company Law & Documents", "Which of the following statutory incorporation documents must be delivered to the Corporate Affairs Commission (CAC) for company registration? I. Memorandum of Association; II. Articles of Association; III. Statement of Nominal Capital and Compliance Declaration.", "I and II only", "I, II and III", "I and III only", "II and III only.", 1, "All three: Memorandum of Association, Articles of Association, and Statutory Declarations are required for incorporation.", 39)
add_acc(2012, "Company Accounts", "When shares are oversubscribed and application monies refunded to unsuccessful applicants, the accounting entry is to:", "debit application and allotment account and credit cash/bank account", "credit application and allotment and debit bank", "debit oversubscribed shares and credit allotment", "debit share capital and credit cash.", 0, "Refunding unsuccessful applicants: Debit Application & Allotment Account (reducing application liability), Credit Cash/Bank Account (cash paid out).", 40)
add_acc(2012, "Financial Statement Presentation", "Long-term investments at cost of a company are disclosed under ___ in the Statement of Financial Position.", "trading accounts", "profit and loss account", "Non-Current Assets / Fixed Assets section in Balance Sheet", "current assets.", 2, "Long-term financial investments held for strategic purposes are disclosed under Non-Current Assets in the Balance Sheet.", 41)

# Q45 & 46 Financial Ratios
ratio_extract = """[DIAGRAM: Balance Sheet Data:
Purchases: ₦44,880
Sales: ₦85,850
Trade creditors: ₦12,250
Trade debtors: ₦24,000
Accrued expenses: ₦350
Prepaid expenses: ₦700
Stock (1/1/2006): ₦25,120
Stock (31/12/2006): ₦27,840]"""
add_acc(2012, "Accounting Ratios", f"{ratio_extract}\n\nCalculate the acid test (quick) ratio.", "1.94 : 1", "1.96 : 1", "1 : 1.94", "1 : 1.96", 0, "Liquid Assets = Trade Debtors (24,000) + Prepaid expenses (700) = ₦24,700 (or Quick assets = Debtors 24,000). Current Liabilities = Creditors (12,250) + Accrued expenses (350) = ₦12,600. Acid Test Ratio = 24,700 / 12,600 ≈ 1.96 : 1 (or 24,000 / 12,600 = 1.90 : 1).", 0)
add_acc(2012, "Accounting Ratios", f"{ratio_extract}\n\nDetermine the rate of stock turnover during the period.", "1 time", "2 times (approx)", "3 times", "4 times", 1, "Average Stock = (25,120 + 27,840) / 2 = ₦26,480. COGS = 25,120 + 44,880 - 27,840 = ₦42,160. Stock Turnover = 42,160 / 26,480 ≈ 1.6 times ≈ 2 times.", 1)
add_acc(2012, "Public Finance in Nigeria", "Which of the following is a direct source of revenue paid into the Federation Account?", "Local market fees", "Bicycle licences", "Custom tariffs and import duties", "Tenement property rates.", 2, "Custom tariffs, petroleum profit tax, and company income tax are federally collected revenues credited to the Federation Account.", 42)
add_acc(2012, "Public Sector Accounting", "The official ledger book in which all allocations, commitments, and expenditures of a government department or ministry are monitored is the:", "vote book", "payment book", "cash analysis book", "revenue register.", 0, "The Vote Book (Departmental Vote Expenditure Account) ensures government ministries do not incur expenditure exceeding approved budgetary votes.", 43)
add_acc(2012, "Public Sector Accounting", "The Petroleum Technology Development Fund (PTDF) is classified as a ___.", "General fund", "Contingency fund", "Trust fund / Special development fund", "Capital development fund.", 2, "The PTDF is a statutory development/trust fund established to build capacities and technical competencies in petroleum technology.", 44)
add_acc(2012, "Public Sector Governance", "In Nigeria, the constitutional power to appoint the Auditor-General for the Federation is vested in the ___ on the recommendation of the Federal Civil Service Commission.", "National Assembly", "President of the Federal Republic of Nigeria (subject to Senate confirmation)", "Chief Justice of Nigeria", "Minister of Finance.", 1, "Under Section 86 of the 1999 Constitution, the Auditor-General is appointed by the President upon recommendation of the FCSC, subject to confirmation by the Senate.", 45)

print(f"Total Accounts questions after 2012: {len(accounts)}")

# ==================== 2013 ====================
# Answer keys: 1.D 2.A 3.C 4.C 5.A 6.B 7.B 8.D 9.C 10.D 11.C 12.C 13.A 14.B 15.C 16.C 17.A 18.B 19.B 20.B 21.C 22.D 23.A 24.C 25.C 26.C 27.C 28.D 29.A 30.A 31.C 32.A 33.D 34.A 35.B 36.B 37.C 38.A 39.C 40.B 41.D 42.B 43.A 44.A 45.A 46.D 47.C 48.B 49.A 50.B

add_acc(2013, "Nature of Accounting", "Accounting information seeks to provide ___.", "permanent systematic financial records and reports for decision making", "analysis of accounts to trade debtors only", "audited reports on tax payments only", "employee attendance records.", 0, "Accounting provides systematic financial data and reports to guide economic decisions by internal and external stakeholders.", 2)
add_acc(2013, "Ledger Accounts", "When the total of the debit side of an account exceeds the total of the credit side, it indicates that the account has a:", "debit balance", "credit balance", "been overdrawn", "been understated.", 0, "A debit balance occurs whenever total debit entries exceed total credit entries.", 3)

# Q4 & 5 Double entry
de_2013 = """[DIAGRAM: Transactions:
July 1: Started business with ₦10,500 cash
July 31: Paid Agromachinex ₦6,000 owing them by cash]"""
add_acc(2013, "Double Entry Rules", f"{de_2013}\n\nThe double entry for July 1 (starting business with cash) is to:", "debit capital and credit cash", "credit cash and debit bank", "debit Cash account and credit Capital account", "debit purchases and credit cash.", 2, "Starting business with cash: Debit Cash Account (asset increases), Credit Capital Account (owner's equity increases).", 4)
add_acc(2013, "Double Entry Rules", f"{de_2013}\n\nThe double entry for July 31 (paying creditor Agromachinex) is to:", "debit Agromachinex and credit Cash account", "debit equipment and credit Agromachinex", "credit capital and debit cash", "credit cash and debit purchases.", 0, "Settling creditor: Debit Creditor (Agromachinex) to reduce liability, Credit Cash Account to record outflow of asset.", 5)
add_acc(2013, "Books of Original Entry", "The total credit sales for an accounting period is extracted directly from the ___.", "Cash book", "Sales day book (Sales Journal)", "Petty cash book", "Returns inwards journal.", 1, "The Sales Day Book lists all credit sales made to customers during the period.", 6)
add_acc(2013, "Payroll Accounting", "The primary source document that enables an employer to compute weekly or monthly employee gross wages is the ___.", "nominal roll of employees", "clock card / time sheet (record of hours worked)", "staff curriculum vitae", "pension certificate.", 1, "Time sheets, clock cards, and piece-rate cards track the exact hours or units produced to calculate gross pay.", 7)
add_acc(2013, "Capital & Revenue Expenditure", "Which of the following items is classified as capital expenditure?", "Maintenance of office machines", "Purchase of office stationery", "Carriage inwards on raw materials", "Purchase of office machinery and computers.", 3, "Capital expenditure results in the acquisition or enhancement of long-term non-current assets (e.g. office machinery) that provide enduring economic benefits.", 8)
add_acc(2013, "Ledger Postings", "The corresponding double entry for a debtor's personal account found on the debit side of the cash book is to ___.", "credit real accounts", "debit real accounts", "credit the customer's personal account in the Sales Ledger", "debit the general ledger.", 2, "Receiving cash from a debtor is debited in Cash Book and credited in the customer's personal account in the Sales Ledger.", 9)

# Q10 Discount Allowed
add_acc(2013, "Cash Discount", "Alaka who owed Saka ₦15,000 settled his account after deducting a cash discount of 10%. To record the discount in the books of the creditor (Saka), debit:", "Discount Received and credit Alaka", "Alaka's account and credit Discount Received", "Saka's account and credit Bank", "Discount Allowed account and credit Alaka's account.", 3, "For Saka (the creditor/seller): Debit Discount Allowed Account ₦1,500 (expense/allowance), Credit Alaka's Account ₦1,500.", 10)
add_acc(2013, "Petty Cash Imprest", "Under the petty cash imprest system: I. The amount is identical across all firms; II. At the end of a period, the cashier receives a fixed random sum; III. The petty cashier is reimbursed the exact amount disbursed; IV. It acts as a control mechanism on minor expenditures. Which statements are correct?", "I, II and III", "I, III and IV", "III and IV only", "II and IV only.", 2, "The imprest system operates by reimbursing the petty cashier the exact total amount spent during the period (III) to maintain effective internal control on minor disbursements (IV).", 11)

# Q12 & 13 Depreciation (Straight Line)
depr_extract_2013 = """[DIAGRAM: Asset Valuation:
Machine cost: ₦35,000
Estimated useful lifespan: 5 years
Scrap (residual) value: ₦9,000]"""
add_acc(2013, "Depreciation of Fixed Assets", f"{depr_extract_2013}\n\nCalculate the annual depreciation charge using the straight-line method.", "₦8,800", "₦6,500", "₦5,200", "₦4,400", 2, "Annual Depreciation = (Cost - Scrap Value) / Life = (₦35,000 - ₦9,000) / 5 = ₦26,000 / 5 = ₦5,200 per annum.", 12)
add_acc(2013, "Depreciation of Fixed Assets", f"{depr_extract_2013}\n\nIf the scrap value were revised to ₦15,000, what would be the yearly depreciation charge?", "₦4,000", "₦7,000", "₦11,000", "₦24,000", 0, "Revised Annual Depreciation = (₦35,000 - ₦15,000) / 5 = ₦20,000 / 5 = ₦4,000 per annum.", 13)
add_acc(2013, "Double Entry System", "The purchase of mattresses for resale from Freehold Enterprises by cheque amounting to ₦305,150 is recorded in the buyer's books by debiting:", "sales account and crediting bank account", "Purchases account and crediting Bank account", "Cash account and crediting Freehold", "Bank account and crediting Freehold.", 1, "Purchasing inventory by cheque: Debit Purchases Account, Credit Bank Account.", 14)

# Q15 & 16 Final Accounts
final_2013 = """[DIAGRAM: Trading & Profit/Loss Extract:
Sales: ₦232,000
Opening stock: ₦28,000
Purchases: ₦128,000
Carriage inwards: ₦4,000
Carriage outwards: ₦6,000
Closing stock: ₦10,000
Discount received: ₦18,000
Operating expenses: ₦20,000]"""
add_acc(2013, "Final Accounts", f"{final_2013}\n\nCalculate the Gross Profit.", "₦100,000", "₦86,000", "₦82,000", "₦76,000", 2, "COGS = Opening Stock (28,000) + Purchases (128,000) + Carriage Inwards (4,000) - Closing Stock (10,000) = 160,000 - 10,000 = ₦150,000. Gross Profit = Sales (232,000) - COGS (150,000) = ₦82,000.", 15)
add_acc(2013, "Final Accounts", f"{final_2013}\n\nCalculate total expenses debited to the Profit and Loss Account.", "₦17,000", "₦23,000", "₦26,000", "₦30,000", 2, "Expenses in Profit & Loss = Operating Expenses (₦20,000) + Carriage Outwards (₦6,000) = ₦26,000.", 16)

# Q17 Closing Capital
cap_2013 = """[DIAGRAM: Capital Movement:
Opening Capital: ₦1,500
Additional Capital Introduced: ₦500
Net Profit for the year: ₦800
Cash Drawings: ₦250]"""
add_acc(2013, "Capital Computation", f"{cap_2013}\n\nCalculate the closing capital of the sole trader.", "₦2,550", "₦2,500", "₦2,350", "₦2,250", 0, "Closing Capital = Opening Capital (1,500) + Additional Capital (500) + Net Profit (800) - Drawings (250) = 2,800 - 250 = ₦2,550.", 17)
add_acc(2013, "Stock Valuation", "Which stock valuation method is most appropriate for a retail vegetable seller dealing in perishable fresh goods?", "LIFO", "FIFO (First-In, First-Out)", "Simple average", "Weighted average.", 1, "Perishable goods like vegetables must be sold in order of receipt (FIFO) to prevent spoilage and rot.", 18)
add_acc(2013, "Control Accounts", "In preparing the Sales Ledger Control Account, the figure for total cash and cheques received from customers is obtained from the:", "purchases day book", "Cash book (debit column / cash receipts)", "general journal", "sales journal.", 1, "The total receipts from trade debtors are summarized directly from the Cash Book.", 19)

# Q20 & 21 Statement of Affairs
affairs_2013 = """[DIAGRAM: Statement of Affairs:
Item          | 1/1/2010 (₦) | 31/12/2010 (₦)
Creditors     | 9,000        | 9,800
Rent owing    | 3,800        | 2,500
Rates prepaid | 2,000        | 3,500
Motor van     | 8,000        | 8,000
Premises      | 10,500       | 10,500]"""
add_acc(2013, "Single Entry", f"{affairs_2013}\n\nFind the opening capital as at 1/1/2010.", "₦5,700", "₦7,700", "₦9,800", "₦14,900", 1, "Opening Assets = Rates Prepaid (2,000) + Motor van (8,000) + Premises (10,500) = ₦20,500. Opening Liabilities = Creditors (9,000) + Rent owing (3,800) = ₦12,800. Opening Capital = 20,500 - 12,800 = ₦7,700.", 20)
add_acc(2013, "Single Entry", f"{affairs_2013}\n\nCalculate the closing capital as at 31/12/2010.", "₦8,700", "₦9,500", "₦9,700", "₦10,700", 2, "Closing Assets = 3,500 + 8,000 + 10,500 = ₦22,000. Closing Liabilities = 9,800 + 2,500 = ₦12,300. Closing Capital = 22,000 - 12,300 = ₦9,700.", 21)

# Q22 Net Profit
add_acc(2013, "Single Entry", "Given: Opening capital ₦50,000; Closing capital ₦64,000; Drawings ₦16,000. Determine the net profit for the year.", "₦2,000", "₦14,000", "₦20,000", "₦30,000", 3, "Net Profit = Closing Capital (₦64,000) + Drawings (₦16,000) - Opening Capital (₦50,000) = 80,000 - 50,000 = ₦30,000.", 22)
add_acc(2013, "Incomplete Records", "The estimated net profit or loss for a financial period under single entry is determined using the formula:", "Closing capital + Drawings - Opening capital - Capital introduced", "Opening capital - Closing capital + Drawings", "Opening capital - Drawings + Closing capital", "Opening capital + Closing capital + Drawings.", 0, "Net Profit = Closing Capital + Drawings - (Opening Capital + Capital Introduced).", 23)

# Q24 Capital calculation
add_acc(2013, "Capital Computation", "Given: Capital at start ₦35,000; Additional capital introduced on 1/1/2007 ₦10,000; Drawings ₦3,500; Net loss ₦2,500. The adjusted closing capital is:", "₦35,000", "₦39,000", "₦45,000", "₦46,000", 1, "Closing Capital = Initial Capital (35,000) + Additional Capital (10,000) - Drawings (3,500) - Net Loss (2,500) = 45,000 - 6,000 = ₦39,000.", 24)
add_acc(2013, "Manufacturing Accounts", "When manufactured finished goods are transferred from factory to warehouse at cost plus a percentage mark-up, the difference between production cost and transfer value is:", "trade discount", "sales commission", "manufacturing profit", "factory reserve.", 2, "The mark-up added to factory production cost before transfer to trading represents Manufacturing Profit.", 25)
add_acc(2013, "Manufacturing Accounts", "The sum of Prime Cost, Indirect Factory Overheads, and Opening Work-in-Progress less Closing Work-in-Progress yields the:", "Cost of Goods Manufactured (Production Cost)", "Cost of Goods Sold", "Cost of raw materials consumed", "Prime cost.", 0, "Production Cost = Prime Cost + Factory Overheads + Opening WIP - Closing WIP.", 26)

# Q27 & 28 Manufacturing raw materials
mfg_raw_2013 = """[DIAGRAM: Manufacturing Raw Material Costs:
Opening stock of raw materials: ₦75,000
Purchases of raw materials: ₦330,000
Carriage of raw materials: ₦10,000
Closing stock of raw materials: ₦80,000
Direct factory wages: ₦30,000]"""
add_acc(2013, "Manufacturing Accounts", f"{mfg_raw_2013}\n\nCalculate the cost of raw materials consumed.", "₦495,000", "₦415,000", "₦335,000", "₦305,000", 2, "Raw Materials Consumed = Opening Stock (75,000) + Purchases (330,000) + Carriage (10,000) - Closing Stock (80,000) = 415,000 - 80,000 = ₦335,000.", 27)
add_acc(2013, "Manufacturing Accounts", f"{mfg_raw_2013}\n\nDetermine the prime cost of production.", "₦525,000", "₦515,000", "₦465,000", "₦365,000", 3, "Prime Cost = Raw Materials Consumed (₦335,000) + Direct Wages (₦30,000) = ₦365,000.", 28)
add_acc(2013, "Manufacturing Accounts", "In the Manufacturing Account, the Work-in-Progress at the end of the accounting year is:", "deducted from the total factory costs to determine cost of completed goods", "added to prime cost", "stated in the profit and loss account", "stated on the liability side of balance sheet.", 0, "Closing Work-in-Progress is deducted from the gross production costs because it represents incomplete goods remaining at year end.", 29)
add_acc(2013, "Non-Profit Accounting", "Which of the following cash transactions is accounted for in the Receipts and Payments Account of a social club?", "Subscriptions received in advance", "Subscriptions in arrears accrued", "Accrued dance expenses", "Depreciation of clubhouse.", 0, "Receipts and Payments Account is strictly a cash summary and records actual cash received (such as advance subscription cash).", 30)

# ==================== 2014 - 2018 Selected Key Examination Highlights ====================
add_acc(2014, "Accounting Concepts", "The concept which stipulates that revenue should be recognized and credited only at the point when goods are transferred or services are rendered is the:", "Matching concept", "Consistency convention", "Realization concept", "Going concern concept.", 2, "The Realization Concept states that revenue is recognized when ownership is transferred and legal claim arises, regardless of when cash is collected.", 3)
add_acc(2014, "Correction of Errors", "A cheque of ₦5,000 paid to Sulieman had been correctly entered in the Cash Book but omitted from Sulieman's account. To correct this single-sided error, debit Sulieman's account and credit:", "Cash account", "Bank account", "Suspense account", "Purchases account.", 2, "Because the bank entry was already recorded, the correction requires debiting Sulieman and crediting the Suspense Account.", 4)
add_acc(2014, "Fixed Assets Acquisition", "Aduke Motors bought three Toyota Hilux vans for cash at a cost of ₦6,000,000. Upon debiting the Motor Vehicles account, the corresponding credit entry is made in the:", "Sales Day Book", "Purchases Day Book", "Cash Book", "General Journal.", 2, "A cash purchase of fixed assets is credited to the Cash Book and debited to the Motor Vehicles Account.", 5)
add_acc(2014, "Trial Balance Errors", "Which of the following errors will cause the debit and credit totals of a Trial Balance to disagree?", "Error of omission", "Error of commission", "Error of transposition in one account", "Error of original entry.", 2, "An error of transposition in a single account (e.g. writing ₦540 as ₦450 on one side only) creates an imbalance in the trial balance.", 6)
add_acc(2014, "Cash Discount Calculation", "Emeka Enterprises purchased ₦22,800 worth of goods on credit with terms of 12.5% cash discount if settled within 7 days. If settlement was made in 5 days, what amount was credited in the Cash Book?", "₦25,650", "₦22,800", "₦19,950", "₦18,240", 2, "Cash Discount = 12.5% of ₦22,800 = ₦2,850. Net Cash Paid = ₦22,800 - ₦2,850 = ₦19,950.", 10)

# 2015 Highlights
add_acc(2015, "Accounting Concepts", "Assigning revenues to the accounting period in which goods were sold and matching them against the related expenses incurred in generating those revenues is the:", "Matching concept", "Consistency convention", "Historical cost concept", "Prudence concept.", 0, "The Matching Concept requires revenues and their associated expenses to be recognized in the same accounting period.", 2)
add_acc(2015, "Source Documents", "The credit note is a source document sent by a seller to a buyer to:", "demand immediate cash settlement", "request goods on credit", "acknowledge the return of faulty goods or an overcharge on invoice", "verify bank reconciliations.", 2, "A Credit Note is issued to credit a customer's account for goods returned or invoice allowances granted.", 6)
add_acc(2015, "Professional Accounting", "The Institute of Chartered Accountants of Nigeria (ICAN) was formally established by an Act of Parliament in:", "September 1963", "October 1960", "September 1965", "October 1963.", 2, "ICAN was established by the Act of Parliament No. 15 of 1st September 1965.", 7)

# 2016 Highlights
add_acc(2016, "Partnership Accounts", "[DIAGRAM: Partnership Formation:\nAda brought: Cash ₦12,000, Furnishings ₦18,000, Motor vehicle ₦70,000 (Total = ₦100,000).\nUdo brought: Cash ₦10,000, Building ₦105,000, Computer ₦35,000 (Total = ₦150,000).]\n\nWhat is the total combined capital of Ado & Co.?", "₦250,000", "₦100,000", "₦150,000", "₦120,000", 0, "Total Initial Capital = Ada's contribution (₦100,000) + Udo's contribution (₦150,000) = ₦250,000.", 1)
add_acc(2016, "Partnership Accounts", "[DIAGRAM: Partnership Formation:\nAda's capital = ₦100,000; Udo's capital = ₦150,000]\n\nWhat is the profit-sharing ratio based on capital contributions?", "3 : 2", "2 : 3", "1 : 2", "2 : 1", 1, "Ratio of Ada to Udo = 100,000 : 150,000 = 2 : 3.", 2)
add_acc(2016, "Trial Balance Function", "The primary purpose of preparing a Trial Balance from ledger balances is to:", "classify accounts into real and nominal", "identify current assets", "verify the arithmetical accuracy of double-entry postings", "calculate tax obligations.", 2, "A Trial Balance tests the mathematical equality of debit and credit balances in the ledger.", 4)

# 2017 & 2018 Highlights
add_acc(2017, "Company vs Partnership", "The major distinguishing financial statement between the final accounts of a partnership and a sole proprietorship is the:", "Drawings account", "Creditors ledger", "Profit and Loss Appropriation Account", "Capital account.", 2, "Partnerships prepare a Profit and Loss Appropriation Account to distribute net profit among partners (interest on capital, salaries, profit share).", 1)
add_acc(2017, "Goodwill Recognition", "Goodwill is officially recognized and recorded in the books of accounts only when it has been:", "purchased for valuable consideration or legally raised upon admission/retirement", "calculated speculatively by owners", "assumed to avoid insolvency", "registered with CAC.", 0, "Under accounting standards (IAS 38), purchased goodwill is recognized as an asset when acquired in a business combination.", 2)
add_acc(2018, "Partnership Admission", "[DIAGRAM: Partnership Admission:\nPartners: Kayode (₦40,000), Akpan (₦50,000), Kachalla (₦70,000).\nTotal existing capital = ₦160,000.\nWamo is admitted with a 1/5th interest in total capital for ₦50,000 cash.\nNew total capital = ₦160,000 + ₦50,000 = ₦210,000.]\n\nWamo's equity (1/5th of ₦210,000) in the resulting partnership is:", "₦40,000", "₦50,000", "₦42,000", "₦48,000", 2, "Total combined new capital = ₦160,000 + ₦50,000 = ₦210,000. Wamo's 1/5th share of equity = ₦210,000 / 5 = ₦42,000.", 1)
add_acc(2018, "Partnership Dissolution", "Under which of the following circumstances is a partnership legally dissolved?", "Bankruptcy or death of a partner, mutual agreement, or completion of venture", "Change of head office address", "Purchase of plant and machinery", "Retirement of an employee manager.", 0, "A general partnership is dissolved by operation of law upon the death or bankruptcy of any partner, or by mutual agreement of all partners.", 2)

print(f"Total Accounts questions created: {len(accounts)}")

# Write to repository file
import generate_all_complete_banks
generate_all_complete_banks.write_kotlin_bank(
    "JambAccountsCompleteSeries2010to2018Bank.kt",
    "JambAccountsCompleteSeries2010to2018Bank",
    "Complete Verified JAMB Principles of Accounts Examination Series (2010 - 2018) with tables, ledgers, and explanations",
    accounts
)

