import re

raw_data = """
1. The term ‘accounting period’ is used to refer to the
Options: A. time span during which taxes are paid to the Inland RevenueBoard B. Budget period, usually one year, relied on by the accountant C. time span, usually one year covered by financial statement D. period within which debtors are expectedto settle accounts.
Answer: C Confidence: high
Reason: Accounting period = time span (usually one year) covered by financial statements.
Source question: 1 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

2. Accounting information is used by investors and credi- tors of a company to predict
Options: A. future cash flows of the company B. future tax payments of thecompany C. potential merger candidates for thecompany D. appropriate remuneration for the company’s staff.
Answer: A Confidence: high
Reason: Investors and creditors use accounting info to assess and predict the company’s future cash flows.
Source question: 4 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

3. Antics Electronics Company recently bought six genera- tors. Which of the following is the correct method of recording this transaction.
Options: A. Debit generator account and credit cash account. B. Debit purchases account and credit cash account. C. Debit cash account and credit purchases account. D. Debit cash account and credit generator account.
Answer: A Confidence: high
Reason: Buying generators increases the asset (debit generator) and decreases cash (credit cash).
Source question: 5 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

4. When a business incurs labours cost in installing a fixed asset, the cost is treated as
Options: A. additional cost to the asset B. business wages and salaries C. installation cost of the asset D. business cost of the asset.
Answer: A Confidence: high
Reason: Installation labour is capitalized as part of the asset’s cost (additional cost to the asset).
Source question: 6 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

5. What is the cardinal rule of the double entry system?
Options: A. Debit the increasing account and credit the decreasing account. B. Debit the receiving account and credit the giving account. C. Debit the asset account and credit the liability account. D. Debit the revenue account and credit the expenditure account.
Answer: B Confidence: medium
Reason: Fundamental double-entry rule often stated as “debit the receiver, credit the giver.”
Source question: 7 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

6. The use of the folio in the ledger is for
Options: A. Referencing purposes B. Particulars of the transaction C. the account titles D. Only credititems.
Answer: A Confidence: high
Reason: Folio in the ledger is used for cross-referencing (reference to source pages).
Source question: 9 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

7. The suspense account is used to correct book keeping errors wherethe
Options: A. amount involved is quite significant B. item involved is not material C. item involved isunknown D. error does not affect the agreement of the trial balance.
Answer: C Confidence: high
Reason: A suspense account holds amounts where the correct account/item is unknown until identified.
Source question: 11 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

8. The discount column of a three column cashbook is not balanced off but periodically transferred to the discount accounts because discounts.
Options: A. are not important in cashbook B. are cash items only C. do not form part of double entry D. are used for bank reconciliation.
Answer: C Confidence: medium
Reason: Discount column entries are not balanced in the cashbook but posted to discount accounts (they are not part of the cash/bank balancing entries).
Source question: 12 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

9. When is a petty cash account debited?
Options: A. When the fund is established and every time money is spent B. when the fund is established and every time it is replenished C. when the fund is established and when the size of the float is decreased D. Everytimemoneyis drawn from the pettycash.
Answer: B Confidence: medium
Reason: Petty cash is debited when the fund is established and when additional cash is put into the fund (replenishment/increase in float).
Source question: 13 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

10. The financial position of an organization at a particular time can be ascertained from the
Options: A. statement of sources and application of funds B. statement of retainedearnings C. balance sheet D. profit and loss account.
Answer: C Confidence: high
Reason: The balance sheet (statement of financial position) shows an organisation's financial position at a particular date.
Source question: 15 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

11. The net profit or loss for the year is determined in the profit and loss account after
Options: A. deducting purchases from sales B. deducting cost of goods sold from sales and adding administrative expenses C. adding commissions received to gross profit D. eliminating all expenses from gross profit and adding any otherincome.
Answer: D Confidence: high
Reason: Net profit/loss is arrived at by deducting all expenses from gross profit and adding any other income.
Source question: 17 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

12. A trial balance shows provision for doubtful debts, N 190 and debtors, N 6,000. It is required to write offfurther N320 as bad debts and maintain the provision at 2½% of debtors. To do this, the profit and loss should show a
Options: A. credit ofN 20 and a debit of N 100 B. credit ofN 28 and a debit of N 300 C. credit ofN 48 D. debit entry ofN 414
Answer: C Confidence: medium
Reason: After writing off N320 debtors become N5,680; required provision 2.5% = N142, existing N190 so a release of N48 (credit to P&L) is needed.
Source question: 20 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

13. If a bad debt previously written off is subsequently repaid, the amount collected is recorded as an
Options: A. income in the profit and lossaccount B. income in the balancesheet C. addition cash in the profit and loss account D. expense in the balance sheet.
Answer: A Confidence: high
Reason: Recovery of a previously written-off debt is treated as income (bad debts recovered) in the profit and loss account.
Source question: 21 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

14. The major difference between the receipt and payment account and the income and expenditure ac- count is that while the former
Options: A. is kept by the treasurer, the latter is not B. deals with all receipt and payments in the year regardless ofthe time it relates to the latter is for just that year C. is a T-account the latter is not D. is not in the ledger, the latter is.
Answer: B Confidence: high
Reason: Receipt & payment shows all cash receipts/payments (cash basis) regardless of period; income & expenditure records income/expenses for the accounting year (accrual basis).
Source question: 29 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

15. The net profit from thetrading account ofa non-profit making organization would be treated as income in the
Options: A. income and expenditureaccount B. receipt and payment account C. balance sheet D. statement ofaffairs
Answer: A Confidence: high
Reason: Trading profit of a non-profit is transferred to and treated as income in the income and expenditure account.
Source question: 31 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

16. Good will appears in the books of a business only if it has been
Options: A. purchased at a certainprice B. raised in connection with the admission ofa newpartner C. raised to account for the true value of a business on the death of a partner D. raised in order to prevent the balance sheet showing that the business is insolvent.
Answer: A Confidence: high
Reason: Goodwill is recognised in the books only when it has been purchased (bought goodwill is an intangible asset).
Source question: 35 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

17. Under which of the following conditions is a partnership dissolved?
Options: A. Change of the partnership’s headoffice. B. Admission ofa new partner. C. Purchase of a large quatityof fixed assets. D. Retirement ofa manager who is not a partner.
Answer: B Confidence: high
Reason: Admission of a new partner changes the partnership composition and normally dissolves the existing partnership agreement.
Source question: 37 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

18. When shares issued are paid for the accounting entry required is
Options: A. debit bank or cash account and credit share capital and/or premiumaccount B. credit bank or cash account and debit shares capital and/or premiumaccount C. debit shares account and credit capitalaccount D. credit shares account and debit capital account.
Answer: A Confidence: high
Reason: Receipt of cash for issued shares is recorded by debiting bank/cash and crediting share capital (and premium if any).
Source question: 38 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

19. The document setting out theregulations regarding shares, meetings and internal organization of a company is known as
Options: A. memorandum ofassociation B. articles of association C. prospectus D. companylaw.
Answer: B Confidence: high
Reason: The Articles of Association set out a company’s internal rules on shares, meetings and organization.
Source question: 41 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

20. An advantage of using accounting ratio is that they
Options: A. can be easily calculated B. facilitatedecision-making C. are stipulated bylaw D. show errors and frauds.
Answer: B Confidence: high
Reason: Ratios summarise financial data to aid analysis and facilitate decision-making.
Source question: 42 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

21. What is the net profit (or loss) contributed by depart- ment B?
Options: A. N2,000 B. (N2,000) C. (N300) D. N300.
Answer: C Confidence: high
Reason: Dept B gross profit = 4,000−(1,500+3,000−2,500)=2,000; expense share = 1/5 of (8,300+3,200)=2,300; net = 2,000−2,300 = (N300).
Source question: 46 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

22. The receipts from a special tax levyto pay maturing inter- est obligation are recorded in
Options: A. CapitalProject Fund B. Debt ServiceFund C. Tax Assessment Fund D.Special RevenueFund.
Answer: B Confidence: high
Reason: A Debt Service Fund is used to account for resources raised to pay principal and interest on debt.
Source question: 48 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

23. Which of the following factors’ has aided the develop- ment of Accounting?
Options: A. The emergency of nation states B. The discovery of mineral resources in commercial quantity. C. The growth in size of businesses and the separation of ownership andmanagement. D. Thedevelopment and management of a sophisticated monetary system.
Answer: C Confidence: high
Reason: The growth in business size and separation of ownership and management increased the need for formal accounting.
Source question: 1 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

24. An effective accounting system should provide infor- mation
Options: A. on new products and methods B. for customer feedback and requirements C. on internal and external reportingfor managers and thirdparties D. for promoters, directors, labour unions and distributors.
Answer: C Confidence: high
Reason: An effective accounting system must provide information for both internal managers and external third parties.
Source question: 3 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

25. Which of the following accounting records are source documents?
Options: A. Journals and ledgers B. Sales invoice and cashbook C. Cash book and debit note D. Sales invoice and debit note.
Answer: D Confidence: high
Reason: Sales invoices and debit notes are source documents that provide primary evidence of transactions.
Source question: 4 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

26. Which ofthe following transactions is BEST recorded in the generaljournal?
Options: A. Payment of rent with acheque. B. Payment of stock with cash C. Purchase of an asset on credit terms D. Transfer of cash from head office to branch.
Answer: C Confidence: high
Reason: Purchase of a non-routine asset on credit is recorded in the general journal (not in special journals like cash or purchases).
Source question: 6 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

27. Diamon Ringo business was started when Mr. Diamon brought in a Cheque of N 500,000 which was paid into the bank account. Which of the following entries prop- erly records the transaction?
Options: A. Cash account was credited with N 500,000 and the capital account wasdebited with N 500,000 B. Bank account was debited with N 500,000 and capital account was credited with N 500,000 C. Bank account wascredited with N 500,000 and capital account was debited with N 500,000. D. Mr. Diamon’s’account was debited with N500,000 and the cheque account was credited with N500,000.
Answer: B Confidence: high
Reason: Owner's cheque paid into bank increases bank (debit) and increases capital (credit).
Source question: 7 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

28. One major advantage of a ledger is that it
Options: A. is a book of originalentry B. is only accessible to shareholders during liquidation C. removesthe need for preparing a balance sheet after each transaction D. can be used by any type of business.
Answer: D Confidence: medium
Reason: A ledger is a general accounting book applicable to any type of business (universal posting of accounts).
Source question: 8 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

29. Atrial balance is usuallyprepared byan accounting from account balances in the ledger for the purpose of
Options: A. classifying account in the ledger B. testing arithmetical accuracties of the ledger account balances C. identifying the balance sheetitems D. providing a basis for establishing the accountant’s competence.
Answer: B Confidence: high
Reason: A trial balance is prepared to test the arithmetic equality of ledger debit and credit balances.
Source question: 9 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

30. A payment of cash of N20 to John was entered on the receipt side ofthe cashbook in error and credited to John’s account. Which of the following journal entries can be used to correct the error?
Options: A. John: N 40 Dr,Cash N 40Cr B. Cash N 40 Dr, John: N 40 Cr. C. John: N 20Dr,Cash N 20 Cr. D. Cash:N 20 Dr,John:N 20 Cr.
Answer: A Confidence: high
Reason: To correct a cash receipt entry made instead of a cash payment you must reverse the wrong postings and record the correct ones: John Dr 40, Cash Cr 40.
Source question: 12 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

31. Why are adjustments in the profit and loss account nec- essary?
Options: A. to cover some expenses of the followingyear. B to ascertain the actual expenses incurred and income earned during the year. C. To show the provisions made during the year D. To show the total expenses paid and income received during the year.
Answer: B Confidence: high
Reason: Adjustments ensure expenses and incomes are matched to the correct accounting period (actual incurred/earned amounts).
Source question: 15 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

32. The trial balance showed wages N 2,500 and a note stated that N500 wages were due but unpaid. When preparing final accounts and balance sheet, it is required to debit profit and loss account with
Options: A. N3,000 and show wages accrued N500 in the balance sheet B. N2,000 and show wages accrued N 500 in the balance sheet C. N3,000 and show wagesprepaid N500 in the balance sheet. D. N2,000 and show wagespaid in advanceN500 in the balance sheet.
Answer: A Confidence: high
Reason: Wages expense should include the N500 accrued (2,500+500=3,000) and N500 shown as wages accrued (liability) on the balance sheet.
Source question: 20 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

33. The starting point for the production of accounts from incomplete records isto
Options: A. ascertain the total sales B. compute the opening stock of goods sold C. verify the total purchases D. prepare an opening statement of affairs.
Answer: D Confidence: high
Reason: From incomplete records you first prepare an opening statement of affairs to establish opening capital and assets/liabilities for reconstruction.
Source question: 23 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

34. The factory cost of goods produced is made up of
Options: A. prime Cost and factory overhead B. prime cost and office overhead C. rawmaterials consumed and fixed cost D. Rawmaterials andAdministrative overhead.
Answer: A Confidence: high
Reason: Factory cost of goods produced = prime cost (direct materials+labour) plus factory (manufacturing) overhead.
Source question: 27 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

35. Subscription in arrears are credited to the income and expenditure account and shown as
Options: A. liability in the balance sheet B. debited to the income and expenditure account and shown as an asset in the balance sheet C. credited to the income and expenditure account and shown as an asset in the balance sheet D. debited to the income and expenditure account and shown as a liability in the balancesheet.
Answer: C Confidence: high
Reason: Subscriptions in arrears are earned income (credit I&E) and represent a receivable (asset) on the balance sheet.
Source question: 29 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

36. Where a non-profit making organization prepares the account using accruals basis of reporting the statement showing how well the organization is doing is the
Options: A. appropriation account B. balance sheet C. income and expenditureaccount D. receipts and payment account.
Answer: C Confidence: high
Reason: Under accrual basis the Income and Expenditure account shows performance (surplus/deficit) of a non-profit.
Source question: 30 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

37. Which of the following is a strong featureof partnership?
Options: A. The life of the partnership is generallyas- sumed to beindefinite B. The owners are liable personally for all debts of the business. C. The transfer of ownership is frequent and easy to accomplish D. The partnership is complex to form because of many legal and reporting requirements.
Answer: B Confidence: high
Reason: A key feature of partnership is partners’ personal (unlimited) liability for business debts.
Source question: 33 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

38. Interest on a partner’s drawing is debited tothe
Options: A. partner’s current account and credited to the profit and loss appropriation account B. profit and loss appropriation account C. profit and loss account and credited to the partner’s current account. D. partner’s current account and credited to the profit and loss account.
Answer: A Confidence: high
Reason: Interest on drawings is charged to the partner (debited to partner’s current account) and credited to the profit & loss appropriation account.
Source question: 34 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

39. A partnership on admitting a new member, revalued the business’ land and building from N30,000 to N70,000. The differenceofN40,000 should be
Options: A. credited to land and building account B. debited to asset revaluation account C. credited to asset revaluation account D. credited to profit and loss appropriation account
Answer: C Confidence: high
Reason: An upward revaluation is credited to the asset revaluation account (with the asset debited for the increase).
Source question: 35 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

40. Hamed’s share of the profit should be
Options: A. credited to partners’ capital account B. credited to partners’ current account C. credited to appropriation account D. debited to partners’ drawings account.
Answer: B Confidence: high
Reason: Partners’ shares of profit are credited to their current accounts when distributing the appropriation of profit.
Source question: 37 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

41. The conversion of a partnership business into a limited liabilitycompany affords the
Options: A. general partners the chance of enjoying the limited liabilityprotection B. limited liability partners the chance of enjoying the limited liabilityprotection C. creditors the chance of enjoying the limited liabilityprotection D. debtors the chance of enjoying the limited liabilityprotection.
Answer: A Confidence: high
Reason: On conversion partners (especially general partners) become shareholders of a limited company and gain limited liability protection.
Source question: 38 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

42. Department accounts are maintained to ascertain the
Options: A. profits of the entire organization B. contribution of each department C. expenses of each department D. sales of each department.
Answer: B Confidence: high
Reason: Department accounts are kept to determine each department’s contribution/profit to the business.
Source question: 44 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

43. Which of the following statement is current about the head office current account and the branch current account?
Options: A. Both always have debit balances B. Both always have credit balances C. Thehead officecurrent account has a credit balance while the branch current account has a debit balance. D. The head officecurrent account has a debit balance while the branch current account has a credit balance.
Answer: C Confidence: medium
Reason: Typically the Head Office current account (in branch books) shows a credit (amount owing to HO) while the Branch current account (in HO books) shows a debit (amount receivable from branch).
Source question: 46 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

44. The most important reason for studying accounting is that
Options: A. the information provided by accounting is useful in making decisions B. accounting plays an important role in a society C. the study of accounting leads to a challenging career D. accounting provides gross profitinformation.
Answer: A Confidence: high
Reason: Accounting’s primary value is providing information useful for business decision-making.
Source question: 1 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

45. Creditors use accounting information for the purpose of
Options: A. planning sales to a company B. controlling a company’saffairs C. investing in a company D. assessing a company liquidity.
Answer: D Confidence: high
Reason: Creditors use accounting data to assess a company’s ability to meet short-term obligations (liquidity).
Source question: 3 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

46. The effects of the payment of a liability is that it
Options: A. increases both assets and liabilities B. increases assets and decreases liabilities C. decreases assets and increases liabilities D. decrease both assets and liabilities.
Answer: D Confidence: high
Reason: Paying a liability reduces an asset (e.g., bank) and reduces the liability—both decrease.
Source question: 6 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

47. Books of original entry are use for
Options: A. recording business transactions B. the adjustment of accounts C. reminding the bookkeeper to post transactions in the ledger D. Informing about the state ofaffairs.
Answer: A Confidence: high
Reason: Books of original entry (journals) are used for the initial recording of business transactions.
Source question: 7 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

48. The term posting in accounting refersto
Options: A. recording entries in the journal B. transferring the balances in the ledger to the trial balance C. tracing amounts from the journal to the ledger to finderrors D. transferring entries to the ledger from the journal.
Answer: D Confidence: high
Reason: Posting means transferring recorded journal entries into the ledger accounts.
Source question: 8 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

49. Which of the following demonstrates the imprest system?
Options: A. Float-> expenses paid —>cash in bank--> float. B. Float --> cash from bank --> expensespaid float C. Float--> expenses paid--> cash from bank --> float D. Float--> cash in bank--> expenses paid -> float.
Answer: C Confidence: high
Reason: Imprest: fixed float is used to pay expenses, then replenished from bank to restore the float (Float → expenses paid → cash from bank → float).
Source question: 11 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

50. When rent is paid in advance at the end of an accounting year, the adjustment needed is:
Options: A. debit rent account and credit adjustment account B. debit prepayment account and credit rent account C. debit cash account and credit rent prepayment account D. debit adjustment account and credit prepayment account
Answer: B Confidence: high
Reason: Prepaid expense adjustment requires debiting Prepaid Rent (Asset) and crediting Rent Account (Expense) to reduce the current year's expense.
Source question: 15 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

51. The principal use of control accounts is to
Options: A. Localizeerrors within the ledgers B. prevent fraud C. increase sales D. record assets andliabilities
Answer: A Confidence: high
Reason: Control accounts are used to check and reconcile subsidiary ledgers and help localize errors within the ledgers.
Source question: 22 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

52. In the absence of a sales daybook or sales account, the credit for sales can be computedfrom
Options: A. creditors control account B. debtors control account C. opening figures of the balance sheet D. closing figures of the balance sheet
Answer: B Confidence: high
Reason: Credit sales can be derived from movements in the debtors (sales ledger) control account when sales daybook/account is missing.
Source question: 23 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

53. Which of the following conditions best represents the net effect of discount allowed on credit sales on the account of a business?
Options: A. Decrease in the closing balance of sales ledger control account B. increase in netprofit C. increase in the values of sales. D. decreasein the valueofpurchasesin thetrading account.
Answer: A Confidence: high
Reason: Discount allowed reduces amounts owed by customers, thus reducing the closing balance of the sales ledger control account.
Source question: 24 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

54. Given Sales of N85,000, Cost of Sales of N25,000, and Expenses of N15,000, what is the Net Profit for the period?
Options: A. N45,000 B. N35,000 C. N25,000 D. N60,000
Answer: A Confidence: high
Reason: Gross Profit = Sales (N85,000) - Cost of Sales (N25,000) = N60,000. Net Profit = Gross Profit (N60,000) - Expenses (N15,000) = N45,000.
Source question: 26 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

55. The recording of wages due but not yet paid, is an example ofan adjustment for
Options: A. apportionment ofrevenue between twoperiods B. recognizing accrued expenses C. recognizing unaccounted revenue D. recognizing prepaid expenses.
Answer: B Confidence: high
Reason: Wages due but unpaid are accrued expenses — recognized as an accrual adjusting entry.
Source question: 20 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

56. In analyzing incomplete records, which ofthe following should be investigated?
Options: A. The generalledger. B. The purchases daybook and sales day book C. The nature trading activities and the basis on which goods are sold. D. The asset register together with the depreciation schedule
Answer: C Confidence: medium
Reason: When reconstructing incomplete records you must investigate the nature of trading activities and how goods are sold to understand transactions and accounting basis.
Source question: 27 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

57. Which of the following stock valuation methods is suitable under inflationaryconditions?
Options: A. FIFO B. LIFO C. Simpleaverage D. Weighed average
Answer: B Confidence: high
Reason: Under inflation LIFO matches current (higher) costs to revenue, reducing profit and showing current cost of inventory.
Source question: 28 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

58. The understatement of closing value of work-in- process would have the effect of
Options: A. understating cost of goods manufactured B. overstating prime cost of goodsmanufactured C. overstating cost of goods manufactured D. understating prime cost of goods manufactured.
Answer: C Confidence: high
Reason: Understating closing WIP reduces the deduction from total manufacture costs, thereby overstating cost of goods manufactured.
Source question: 30 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

59. The difference between a trading account and a manufacturing account is that while the manufacturing account
Options: A. has no particular period, the trading account has B. does not consider the cost of goods involved, the trading account does C. is concerned with the cost of production the trading account is not D. is not concerned with the stock of raw materials, the trading account is.
Answer: C Confidence: high
Reason: A manufacturing account deals with cost of production (direct materials, labour, overhead); a trading account does not compile production costs.
Source question: 32 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

60. An income and expenditure account is a summary of
Options: A. all income and expenditure during a period B. revenue income and expenditure during a period C. receipts and payment during a period D. the trading income during a period
Answer: B Confidence: high
Reason: An income and expenditure account summarises revenue (accrual) incomes and expenditures of a non-profit for a period.
Source question: 33 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

61. If a partnership records a loss of N1,500 before Faruk's salary of N9,000, and profit/loss sharing ratio is 3:7 between Faruk and Osawe, the appropriate distribution of the net loss is:
Options: A. Faruk (N450); Osawe (N1,050) B. Faruk (N3,150); Osawe (N7,350) C. Faruk (N2,250); Osawe (N5,250) D. Faruk (N8,550); Osawe (N1,050)
Answer: B Confidence: high
Reason: Net divisible loss after allocating partner salary = N1,500 + N9,000 = N10,500. Faruk's share (3/10) = N3,150 loss; Osawe's share (7/10) = N7,350 loss.
Source question: 29 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

62. On partnership dissolution, ifpartner’s capital account has a debit balance and the partner is insolvent, the deficiencywill in accordance with the decision ofthe case of Garner vMurry, be
Options: A. Borne byall the partners B. Borne by the insolventpartner, C. Written off, D. Borne by the solvent partners in the ratio of their last agreed capitals.
Answer: D Confidence: high
Reason: If a partner is insolvent on dissolution the unpaid deficiency is absorbed by the solvent partners in their capital ratio (Garner v Murray rule).
Source question: 40 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

63. Which of the following are advantages of departmental accounts? (i) The department making the highest profit can be easily determined (ii) The capital of the business can be calculated easily (iii) Easy knowledge of the sources of funding (iv) Encouragement of healthyrivalry among the variousdepartments.
Options: A. i and iv only B. ii and iii only C. ii and iv only D. iii and iv only
Answer: A Confidence: high
Reason: Departmental accounts identify most profitable departments (i) and encourage healthy rivalry (iv); they do not simplify capital calculation or funding sources.
Source question: 48 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

64. The end result ofgovernmental accounting procedure is to
Options: A. keep proper records of government expenditures B. givefinancial information to the public and investors C. produce timely and accurate financial reports for legislators and the public D. give information on the performance of public enterprises
Answer: C Confidence: high
Reason: Governmental accounting aims to produce timely, accurate financial reports for legislators and the public to ensure accountability.
Source question: 50 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

65. Cost reports for attention of management should reflect
Options: A. as much details as possible B. summary figuresonly C. details of non-controllable expenses D. cost and comparable data useful in decision- making.
Answer: D Confidence: high
Reason: Management needs cost data plus comparable information useful for decision-making (relevant and usable, not just raw detail).
Source question: 2 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

66. An advantage of the use of the voucher system is that it
Options: A. reduces the number of cheques that will be written during any given period B. provides a highly flexible system for handling unusual transactions C. provides a comprehensive record of business done with particularsuppliers D. ensures that everyexpenditure is reviewed and verified before payment is made.
Answer: D Confidence: high
Reason: A voucher system requires supporting documents and authorization, ensuring each expenditure is reviewed before payment.
Source question: 4 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

67. A business transaction is recorded in the books of accounts when the
Options: A. owner of the business invests his N10,000 in another company B. business retains part of its profits for future expansion purposes C. business applies for overdraft facilities from its bankers D. owner of the business collects N5,000 from the accountant for personal drawings.
Answer: D Confidence: high
Reason: The owner collecting N5,000 is a measurable economic event (a drawing) that affects accounts and must be recorded.
Source question: 5 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

68. When a transaction causes an asset account to increase, thereis
Options: A. a decrease of equal amount in theowner’s equity account B. an increase in a liability account C. an increase of equal amount in another asset account D. a decrease of equal amount in a liability account.
Answer: B Confidence: medium
Reason: Commonly an increase in an asset (e.g. purchased on credit) is accompanied by an increase in a liability (accounts payable).
Source question: 6 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

69. The purchase of two generators by Hassan Electronics Enterprises for use in the business should be recorded as
Options: A. an acquisition of fixed assets. B. an expense in its general officeexpenses column. C. an acquisition of stock, D. a part of capital in the capital account.
Answer: A Confidence: high
Reason: Generators purchased for business use are plant/equipment (fixed assets); their purchase is a capital (fixed asset) acquisition.
Source question: 8 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

70. If the inventory at the end of the current year is understated and the error is not caught during the following year, the effect is to
Options: A. understate income this year and understate in next year B. overstate income this year and overstate in next year C. understate this year’s income and overstate next year's income D. overstate the income for the two-yearperiod.
Answer: C Confidence: high
Reason: Ending inventory understated -> Cost of Goods Sold overstated -> Current Year Income understated; Next year opening stock understated -> Next Year Income overstated.
Source question: 9 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

71. The total of the discounts received column in the cash book is posted tothe
Options: A. credit of the discounts received account B. debit of the discounts allowed account C. credit of the discounts allowed account D. debit of the discounts received account.
Answer: A Confidence: high
Reason: Discounts received are income and therefore are posted to the credit of the Discounts Received account.
Source question: 10 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

72. State Bank collected a note for Al-Makura Company. This collection, not yet recorded in Al- Makura’s books, appears on the bank reconciliation as
Options: A. an addition to balance per books B. a deduction from balance per bank statement C. an addition to balance per bank statement D. a deduction from balance per books.
Answer: A Confidence: high
Reason: Bank collections increase the bank balance on the bank statement but not yet in the company books, so add to the balance per books on reconciliation.
Source question: 13 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

73. Mayana Corporation uses special journals to record its transactions. If one of Mayana’s customers returns merchandize purchased with cash (for a refund), it makes an entry in the
Options: A. cash receipts journal B. salesjournal C. general journal D. cash disbursement journal.
Answer: D Confidence: high
Reason: A cash refund to a customer is a cash payment and is recorded in the cash disbursements journal.
Source question: 14 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

74. The balance on a purchases ledger control account represents the
Options: A. present amount that a business owes its suppliers at date. B. Total credit available to the business at the end of the year to be utilized infuture C. total credit the business enjoyed for the particular year from its suppliers. D. totalcredit owed the business by its customers.
Answer: A Confidence: high
Reason: The purchases ledger control account is the payable control — it shows the amount currently owed to suppliers.
Source question: 20 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

75. The statement ofaffairs prepared from incomplete records can be described as
Options: A. the summary of all the business transac tions of the trader ascertained by the accountant B. a balance sheet at a particular date showing the assets and liabilities of the business C. a schedule of all the business ventures entered into for the period to which the records relate D. the statement that shows the profit or loss made during theperiod.
Answer: B Confidence: high
Reason: A statement of affairs from incomplete records is essentially a balance sheet showing assets and liabilities at a date.
Source question: 25 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

76. The contribution margin on a job is the
Options: A. gross profit B. net profit C. excess of sales revenue over variable costs D. differencebetween fixed and variablecosts.
Answer: C Confidence: high
Reason: Contribution margin is defined as sales revenue less variable costs.
Source question: 26 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

77. The objective of allocating all costs to product is to
Options: A. produce a scientifically accurate cost B. avoid unallocated overhead and compute total product cost C. co-ordinate the cost and financial accounts D. compute the contribution of the product to the finalprofit.
Answer: B Confidence: high
Reason: Allocating all costs to product ensures no overhead is left unallocated and yields the total product cost.
Source question: 27 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

78. A non-profit-makingorganization differsfrom a profit making on inthat
Options: A. it does not earn income B. proceeds from saleof shares form part of its income C. all its income is committed D. annual subscriptions and levies form part of its income.
Answer: D Confidence: high
Reason: Non-profits commonly treat annual subscriptions and levies as their primary income sources.
Source question: 30 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

79. The limitations ofthe receipts and paymentsaccount arise mainly because of the reliance on
Options: A. cash movement as evidence of transaction B. the accounting officer to report C. the capital account of theorganization D. the transaction papers as evidence of transaction
Answer: A Confidence: high
Reason: Receipts and payments accounts are limited because they rely solely on cash movements as evidence of transactions (no accruals).
Source question: 31 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

80. The trading account is to a sole trader what income and expenditure account is to a
Options: A. partnership B. public limitedorganization C. manufacturing organization D. non-profit-making organization.
Answer: D Confidence: high
Reason: The trading account for a trader corresponds to the income and expenditure account used by non-profit organisations.
Source question: 32 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

81. When forming a partnership, new partners should record non-monetary assets on the new partnership’s books at
Options: A. their current fair market values B. their historical costs when first used C. their historical costs when first purchased by each new partner D. the highest values practical so that future incometax deductions aremaximized.
Answer: A Confidence: high
Reason: Non-monetary contributions are recorded at their current fair market (agreed) value to reflect true capital introduced.
Source question: 34 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

82. Theordinaryshareholders enjoythe following rights except the rightto
Options: A. vote at annual general meetings B. elect the board of directors C. participate in additional issues of shares D. receive dividends at a predetermined rate.
Answer: D Confidence: high
Reason: Ordinary shareholders do not have a predetermined dividend rate; dividends are variable and declared by the board.
Source question: 40 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

83. Granada Corporation has net assets of N600,000 and contributed capital of N180,000. The corporation has 30,000 shares of common stock outstanding with no preferred stock. This suggests that the corporation has
Options: A. a book value of N14 pershare B. a book value of N20 pershare C. a deficitofN420,000 D. retained earnings ofN600,000
Answer: B Confidence: high
Reason: Book value per share = net assets ÷ shares = 600,000 ÷ 30,000 = N20 per share.
Source question: 41 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

84. Tocompute gearing ratio, divide
Options: A. profit by capitalemployed B. current assets by current liability C. profit by total assets D. long-term debt by equitycapital.
Answer: D Confidence: high
Reason: Gearing (leverage) is commonly measured as long-term debt divided by equity capital.
Source question: 44 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

85. Which of the following entries is effected by a department when goods are charged to it at selling prices?
Options: A. Stock account is debited B. Purchases account is debited C. stock account is credited D. mark-up account isdebited.
Answer: A Confidence: medium
Reason: When goods are charged to a department at selling price the receiving department debits its stock (inventory) account for that amount.
Source question: 45 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

86. The difference between the closure of the books of a branch and those of a separate company is that
Options: A. there is retained earnings account on the branch books B. the revenue and expense account is closed to branch current account C. there is no retained earnings account on the branch books D. the revenue and expense account is not closed to the home office current account
Answer: C Confidence: high
Reason: Branch books normally have no retained earnings account; results are carried in a branch current account with the head office.
Source question: 46 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

87. The term fiscal compliance means
Options: A. all financial and related laws and regulations are adhered to B. only the budget for the current period is compiled with and no deficits allowed C. allphysicalassetsrequirementshavebeenmet accountability in the public sector. D. compliance with administrative protocols only.
Answer: A Confidence: high
Reason: Fiscal compliance means adhering to applicable financial laws, rules and regulations.
Source question: 47 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

88. In a public corporation, the capital expenditure incurred in a financial period is
Options: A. spread over the useful life of the assets through depreciation B. apportioned at a pre-determinedrate stipulated by law C. written off in the year in which theyoccur D. merged with recurrent expenditure and reported in one lump sum.
Answer: A Confidence: high
Reason: Capital expenditure is capitalized and allocated over the asset’s useful life via depreciation.
Source question: 48 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

89. Moneynot required to meet chargeable expenditure in any fiscal year under cash accounting, shouldbe
Options: A. surrendered to the consolidated revenue fund B. carried forward to the next financial year C. reserved to meet any deficits or contingencies D. returned to thetaxpayer.
Answer: A Confidence: high
Reason: Under cash accounting unspent public funds are surrendered to the consolidated revenue fund rather than carried forward or returned to taxpayers.
Source question: 49 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

90. Accrual concept stipulates that
Options: A. revenue should be recognized when it is earned B. costs should be recognized when the expenditure ispaid C. revenue should be recognized only when cash is paid D. costs should be recognized when they are incurred.
Answer: A Confidence: high
Reason: The accrual concept recognizes revenue when earned (and expenses when incurred), regardless of cash receipt.
Source question: 1 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

91. The basic role of accounting is to;
Options: A. detect fraud B. altest to financialstatement C. measure performance D. protect shareholders
Answer: C Confidence: high
Reason: Accounting's primary role is to measure and report performance (financial results and position) of an entity.
Source question: 2 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

92. The need for changes in accounting theory in Nigeria was influenced by the
Options: A. dynamics of commercialization and privatization policies B. growth in size of business units C. introduction of he structural adjustment programme D. inconvertibilityof the nation’s currency.
Answer: A Confidence: medium
Reason: Commercialization and privatization changed organizational structures and reporting needs, driving changes in accounting theory in Nigeria.
Source question: 3 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

93. A book-keeping error occurs when there is a.
Options: A. deliberate manipulation ofrecords B. unintentional correct posting in the ledger C. intentional failure to record transactions and oversights that are no intended D. incorrect records and unintended oversights during recording.
Answer: D Confidence: medium
Reason: Book-keeping errors are inadvertent mistakes or oversights in recording transactions, not deliberate actions.
Source question: 4 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

94. When a proprietor withdraw cash from the business for private use, he
Options: A. debits cash account and credits drawings account B. credits cash account and debit its bank account C. debits bank account and credit drawings account D. credits cash account and debit drawings accounts.
Answer: D Confidence: high
Reason: Drawings (owner's withdrawal) are debited and cash is credited to show cash reduction and increase in drawings.
Source question: 5 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

95. A basic unifying concept in accounting implies that
Options: A. where creditors’ account is zero, the assets are equal to the owner’s equity B. there should be a balance in the creditors’ account in order to measure total assets C. revenues should be supported by invested and owners’ capital D. total assets can be less than liability and equity.
Answer: A Confidence: high
Reason: From the basic accounting equation: Assets = Liabilities + Owner’s Equity; if creditors (liabilities) are zero, assets equal owner’s equity.
Source question: 6 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

96. If the total discount allowed in cash book was N230 and the total discount received was N255 and the total following is true concerning the two discounts?
Options: A. They must be balanced in the cash book and the difference taken to the debtors ledger B. they must be balanced in the cash, balance and the difference taken to the trial balance. C. They should not be balanced in the cash book before being taken to the trial balance. D. They should not appear in the trial balance as they were already either received or paid out.
Answer: C Confidence: medium
Reason: Discount columns in the cash book are usually posted to discount allowed/received ledger accounts and not balanced in the cash book itself before trial balance.
Source question: 9 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

97. Which of the following bank reconciliation items should not be added or subtracted from the bank statement balance to determine the adjusted cash balance?
Options: A. Outstanding cheques B. Bank service charges C. deposits in the mail not yet received by the bank D. Bank error, charging a company for another company’s cheques.
Answer: B Confidence: high
Reason: Bank service charges appear on the bank statement and must be adjusted in the books (book balance), not added/subtracted to the bank statement balance in the reconciliation.
Source question: 10 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

98. Depreciation on a particular piece ofmachinery was N2,700 during the fifth year of its service life and N4,050 during the sixth year. The logical explanation for this is that.
Options: A. an addition was made to the asset during thesixth year. B. the estimate of salvage value on this equipment was decreased at the beginning of the fifthyear C. a unit-of-output method ofdepreciation was used during the sixthyear. D. theestimated remaining service life of the asset was increased at the beginning of the sixth year.
Answer: A Confidence: high
Reason: An addition to the asset in the sixth year would increase the depreciable base and so raise depreciation in that year.
Source question: 17 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

99. The main features of the single entry system are that
Options: A. books of accounts are not maintained and business relies only on bank statement B. the journal records are absent and only the main ledger is kept C. there are incomplete classifications and recording procedures D. only credit sales transactions and credit purchases are recorded.
Answer: C Confidence: high
Reason: Single-entry records are incomplete with limited classification and recording procedures rather than full double-entry ledgers.
Source question: 18 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

100. The principal function ofa sales ledger control account is to
Options: A. serve as internal check and provide quick information for the preparation of interim financialstatements B. serve as external check and provide quick information for the preparation of interim financialstatements C. provide quick information for the preparation of customers’ statements, D. provide information for the controlof salesmen’s activities
Answer: A Confidence: high
Reason: A sales ledger control account summarises receivables as an internal check and provides quick information for interim financial statements.
Source question: 19 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

101. In dealing with incomplete records, fixedassets are posted to
Options: A. opening profit and loss as brought forward figures B. closing balance sheet as carriedforward figures C. closing balance sheet as brought forward figures D. closing profit and loss as bought forward figures.
Answer: C Confidence: medium
Reason: In incomplete records fixed assets are shown in the balance sheet (closing balance sheet) as brought forward figures.
Source question: 20 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

102. When the factory cost of production has been ascertained, manufactured goods are transferred to trading accounts by
Options: A. debiting manufacturing account and crediting trading account B. crediting sales account and debiting trading account C. debiting sales account and crediting trading account D. crediting manufacturing account and debiting trading account.
Answer: D Confidence: high
Reason: When finished goods are transferred out, the manufacturing account is credited and the trading (or finished goods) account debited.
Source question: 24 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

103. Lawal and Co makes blocks and sells to builders. In computing prime cost, which of the following costs would be considered appropriate?
Options: A. Cement, sand and carriage outward B. Water, carriage inwards and cement C. Sales boys wages, cement and sand D. carriage outwards, carriage inwards and cement.
Answer: B Confidence: high
Reason: Prime cost includes direct materials and direct production costs; cement and carriage inwards are direct production costs (water used in production can be direct), while carriage outwards and sales wages are selling costs.
Source question: 25 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

104. Manufacturing cost can be classified based on
Options: A. timing of charges, degree of averaging, ease of traceability and timing of charges B. degree carriage inwards and cements C. degree of averaging and size of capital D. number of employed, timing of chargesand management style.
Answer: A Confidence: high
Reason: Common classifications of manufacturing cost use bases such as timing of charges, degree of averaging and ease of traceability—these are listed in A.
Source question: 26 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

105. A credit balance on a receipts and payments account indicates that the non-profit making organisation.
Options: A. had more revenues than expenses during the period B. did not owe much liabilities during the period C. received morecash than it paid out during the period D. made more cash payments than it received during the period.
Answer: D Confidence: high
Reason: A receipts and payments account is credited for cash payments, so a credit balance means payments exceeded receipts (more cash paid out).
Source question: 30 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

106. Goodwill can be valued in partnership when,
Options: A. partners makeprofits B. large losses aremade C. a partner retires D. a new branch is opened.
Answer: C Confidence: high
Reason: Goodwill is usually valued when the partnership is reconstituted (e.g., a partner retires) requiring valuation for adjustment.
Source question: 31 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

107. When a partner makes a drawing of stock items from a partnership, the accounting impact of the drawing is to increase the partner’s
Options: A. Goodwill account balance B. Current account creditbalance C. Current account debit balance D. Profit and account credit loss balance.
Answer: C Confidence: high
Reason: Drawings reduce a partner’s account, increasing the debit (drawing) balance of the partner’s current account.
Source question: 33 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

108. Dele and Seun who are in partnership, have decided to convert their business into a limited liability company where both become directors. To convert the business
Options: A. They will simply continue since there are no newmembers. B. The partnership is formally ended and new company books opened. C. The shares and all other items will be shared equally and not in their former ratios. D. Computation of goodwill must b e doneas it is legallyrequired.
Answer: B Confidence: high
Reason: Conversion requires formally ending the partnership and opening new company books for the incorporated entity.
Source question: 35 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

109. If a sole proprietorship is purchased for cash, then
Options: A. The purchaser debits his business purchase account with the consideration he pays. B. All assets and liabilities must be bought C. Goodwill results where value liabilities taken is higher than the value of assets. D. The vendor debits his businesspurchase account with the consideration he receives.
Answer: A Confidence: high
Reason: The purchaser records the acquisition by debiting a business purchase account with the cash consideration paid.
Source question: 36 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

110. The market price per ordinary share of a corporation listed on the stock exchangeis most closelyrelated to its
Options: A. Earnings pershare B. Redemption price pershare C. Book value per share D. Call price per share
Answer: A Confidence: high
Reason: Market price is most closely linked to expected earnings per share (investors value shares by earnings, i.e., P/E relationship).
Source question: 37 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

111. Which of the following events increases a corporation’s shareholders equity?
Options: A. Donation of shares out of the corporation’s own stock to the corporation B. The corporation’s purchase of treasury stock. C. Shares of previously subscribed stock issued to subscribing stockholders D. A municipality donation of land to the corporation
Answer: D Confidence: high
Reason: A municipality donating land increases the corporation’s assets and therefore increases shareholders’ equity (a contributed gain).
Source question: 38 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

112. Ifa promote pays a lawyer N5,000 for servicesrendered in preparing a Memorandum of Incorporation, the journal entry is to debit
Options: A. Preliminaryexpenses, credit cash, accounts. B. Promoters, credit creditors’Accounts. C. Lawyer’s credit cash accounts D. Cash credit incorporation accounts.
Answer: A Confidence: high
Reason: Promoters’ pre-incorporation costs are charged to preliminary (incorporation) expenses (debited) with cash credited.
Source question: 41 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

113. Shares issued to a vendour in payment of business purchased would require a debit to
Options: A. Cash account and credit to share capital account B. Share capital account and credit tovendor’s account C. Vendor’s account and credit to share capital account. D. Share capital account and credit to cash account.
Answer: C Confidence: high
Reason: Issuing shares to the vendor extinguishes the vendor liability — debit Vendor’s account; credit Share Capital.
Source question: 43 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

114. The best method of allocating expenses among departments is to
Options: A. Allocate expenses to each department in proportion to the sales of that department B. Charge against each department those costs which are within itscontrol C. Charge expenses against each department in proportion to the purchases of that department. D. Allocate expenses to each section of the department in relation to the number of people.
Answer: B Confidence: high
Reason: Best practice is to charge each department with the costs it controls (direct allocation).
Source question: 44 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

115. To record the transfer of stock fro one department to another, the correct entry would be to debit
Options: A. Gods outwards and credit goods inwards. B. Merchandise account and credit department stock account C. Department transferringand credit department receiving D. Department receiving and credit department transferring.
Answer: D Confidence: high
Reason: The receiving department’s stock increases (debit) and the transferring department’s stock decreases (credit).
Source question: 45 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

116. Theprofit margin should be
Options: A. debited to goods sent to branch account B. debited to branch stock adjustment account C. credited to branch adjustment account D. credited to branch stock account.
Answer: B Confidence: medium
Reason: The profit element on returned goods is reversed by debiting the Branch Stock Adjustment account to remove the margin.
Source question: 46 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

117. What is the correct entry in the head office books at the point of initial transfer of thegoods?
Options: A. Branch stock account would be credited withN10,000 B. Branch stock account would be debited withN12,000 C. Goods sent to branch account would be debited withN10,800. D. Goods sent to branch account would be credited withN12,000.
Answer: B Confidence: high
Reason: Invoice price = 10,000 + 20% = 12,000, so Branch Stock (or branch stock account) is debited with N12,000 on transfer.
Source question: 47 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

118. Capital and revenue expenditures of government are usually accounted for under funds which include
Options: A. Personal advances, technical and public funds. B. Technical, special trust and commercial funds. C. Personal advances, treasury clearance andspecial trust funds. D. Commercial loans and treasuryclearance funds.
Answer: B Confidence: medium
Reason: Government accounting commonly recognises technical, special/trust and commercial funds as separate fund categories.
Source question: 48 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

119. Which of the following accounts is kept by local gov- ernments inNigeria?
Options: A. Balance sheet B. Advances account. C. Debtors account D. Profit and loss accounts.
Answer: B Confidence: medium
Reason: Local governments maintain internal control records such as advances accounts for staff and operations.
Source question: 49 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

120. The conventional source of public revenue include
Options: A. Loans, taxation, foreign reserves anddividends. B. Interest, royalties, taxation andloans C. Crude oil, interest, posted price and taxation D. Taxation, deficit budgeting, royalties and loans.
Answer: B Confidence: high
Reason: Conventional public revenue sources include taxation, interest, royalties and loans.
Source question: 50 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

121. To write off bad debt, debit
Options: A. Debtor’s account and credit provision for bad debt. B. Bad debt account and credit debtor’s account. C. Debtor’ account and credit bad debt. D. Provision for bad debt.
Answer: B Confidence: high
Reason: Writing off a bad debt requires debiting Bad Debts (expense) and crediting the Debtor’s (accounts receivable) account.
Source question: 2 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

122. The main object of book keeping is to record economic.
Options: A. Transactions systematicallyfor routine managerial decision making. B. Events clearly to ensure adequate checksand bal- ances C. Events clearlytofacilitate strategic managerial de- cision-making D. Transactions systematically to ascertain the finan- cial position of a business.
Answer: D Confidence: medium
Reason: Bookkeeping’s primary purpose is to record transactions systematically so as to determine the financial position of a business.
Source question: 6 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

123. A general journalcontains
Options: A. Date narration, folio, debit and credit. B. Date narration, folio, debit and purchases. C. Folio, credit, date, debit and sales. D. Debit, credit, narration, date and discount.
Answer: A Confidence: high
Reason: A general journal shows date, narration (particulars), folio and the debit and credit amounts.
Source question: 11 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

124. Which of the following errors will affect the trial bal- ance totals?
Options: A. Posting discount allowed to the debit side of the discount allowed account. B. Omission of one account from the list when ex- tracting from the ledgers. C. Failure to post sales of N 2,000 and purchasesof N 2,000 from subsidiaryledgers. D. Omission of sales of N 3,000 and purchase of N2,000.
Answer: B Confidence: medium
Reason: Omitting one account when extracting the trial balance removes either a debit or credit total and will cause the trial balance totals to disagree.
Source question: 12 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

125. An expense account is closed by a debit to
Options: A. An asset account and credit to the expense account. B. The expense account and a credit to an asset account. C. Profit and loss account and a credit to the expense account. D. The expense account and a credit to profit and loss account.
Answer: C Confidence: high
Reason: To close an expense the entry is: Debit Profit and Loss (or Income Summary) and credit the Expense account.
Source question: 13 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

126. The simplest form of single entry procedure consistof keeping a
Options: A. Day book or generaljournal B. Cash book and ledger accounts showing debt- ors and creditors balances C. Cash journal, sales journal and purchasesjour- nal D. Day book in which transaction are described in chronologicalorder.
Answer: B Confidence: high
Reason: The simplest single-entry system is just a cash book plus ledger/list showing debtors and creditors balances.
Source question: 23 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

127. A fixed cost is fixed only in relation to
Options: A. The quantity of goods produced B. The quantity of goods sold C. A given period of time a range of activities D. A given period of time and the nature of activity.
Answer: C Confidence: high
Reason: Fixed costs are fixed only for a given period and within a relevant range (range of activity) — they vary outside that range.
Source question: 24 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

128. One of the shortcomings of single entry procedures is that
Options: A. A trial balance is notavailable B. Profits areoverestimated C. There are no subsidiary books D. There are no control accounts.
Answer: A Confidence: high
Reason: A key shortcoming of single-entry is that no trial balance can be prepared (double-entry checks are absent).
Source question: 25 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

129. When a customer’schequeisreturned unpaid in a debtor’s control accounting system, the treatment will be
Options: A. debit bank, credit customer and credit control account. B. credit bank, debit customer and debit control account. C. debit customer, credit control accountand credit bank. D. credit control account, debit bank and debit customer.
Answer: B Confidence: high
Reason: Dishonoured cheque reverses the bank receipt: credit Bank and reinstate the debtor by debiting the customer and the debtors' control account.
Source question: 26 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

130. Didi Ltd. Offered 10,000 ordinaryshares of N1.50 each at a discount of 2% which were fully subscribed. With regard to the offer above,
Options: A. Shares are never offered at a discount; the offer is invalid B. The value of shares in the capital account will be lowered by2%. C. The company incurs a loss to the tune of 2% of the offer. D. Each of the subscribers loses 2% of investment.
Answer: A Confidence: high
Reason: Companies are not allowed to issue shares at a discount to nominal (par) value, so such an offer is invalid.
Source question: 27 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

131. Which of the following items does not feature in the balance sheet of a club?
Options: A. Arrears of current year’ssubscription B. Salary arrears paid in the current year C. Rental income received in advance D. Advance subscription in respect of a coming year.
Answer: B Confidence: high
Reason: Salary arrears paid in the current year are settled (not outstanding) and therefore do not appear on the balance sheet.
Source question: 30 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

132. When a purchased business isrevalued the effects is that.
Options: A. a decrease in the value of assets has no effect no value ofgoodwill B. an increase in the value of asset is treated as an increase in the value of goodwill C. a decrease in the value of asset is treated as a decrease in the value ofgoodwill D. an increase in the value of asset is treated as decrease in the value ofgoodwill
Answer: D Confidence: high
Reason: If purchase asset values are increased after acquisition, the implied goodwill (purchase consideration minus net assets) falls.
Source question: 37 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

133. An item of appropriation in partnership profit and loss account is.
Options: A. interest on partners’capital B. interest on partners’loan C. employees’ salaries D. partners drawings
Answer: A Confidence: high
Reason: Interest on partners' capital is an appropriation of profit (allocated to partners) rather than a trading expense.
Source question: 38 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

134. A business is acquired at par when the
Options: A. purchase consideration equals good will B. purchase consideration equals net value C. purchase consideration is greater than the net value D. purchase consideration is less than liabilities.
Answer: B Confidence: high
Reason: Acquired at par means the purchase consideration equals the net asset value of the business.
Source question: 41 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

135. The partnership Deed noramally specifies
Options: A. how profits or losses are to be shared B. the capital to be contributed annually C. how salaries are paid to employees. D. the profit that should be earned annually
Answer: A Confidence: high
Reason: The partnership deed normally stipulates how profits or losses are to be shared among partners.
Source question: 35 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

136. In public sector accounting, the body constitutionally charged with auditing the accounts of the Federation is the:
Options: A. Auditor-General for the Federation B. Public Accounts Committee C. Accountant-General of the Federation D. Federal Ministry of Finance
Answer: A Confidence: high
Reason: Section 85 of the 1999 Constitution vests the audit of public accounts of the Federation in the Auditor-General for the Federation.
Source question: 44 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

137. Given: Opening Cash balance N 20,000, Sale of match tickets N15,000, Donation from local government N3,800, Clearing of pitch N1,200, Refreshments N3,500, Referees’ allowance N1,000, Cost of petrol for bus N1,120. The club’s closing cash balance is:
Options: A. N39,180 B. N34,830 C. N32,500 D. N31,980
Answer: D Confidence: high
Reason: Closing cash = Opening (20,000) + Receipts (15,000 + 3,800) - Payments (1,200 + 3,500 + 1,000 + 1,120) = 38,800 - 6,820 = N31,980.
Source question: 32 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

138. A major benefit derived from the reconciliation ofbranch and head office books is to
Options: A. determine accurate returns by thebranch B ascertain the correct profit or loss on branch activites C. enable the branch to keep control over stock D. enablethe branch toascertain debtorsbalance
Answer: A Confidence: high
Reason: Reconciliation ensures branch returns agree with head office and detects errors, giving accurate branch returns.
Source question: 49 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

139. If total bad debts written off during the year is N18,000 and the company maintains an allowance for doubtful debts of 15% on ending debtors of N40,800, the required provision is:
Options: A. N6,120 B. N6,120,300 C. N8,280 D. N8,820
Answer: A Confidence: high
Reason: Allowance for doubtful debts = 15% of N40,800 = N6,120.
Source question: 97 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

140. The current growth in the volume of trading and financial dealings in Nigeria is helped by
Options: A. Increased financialactivities. B. Government intervention C. Credit as a factor in business D. Paying for goods in cash.
Answer: C Confidence: medium
Reason: Credit expands purchasing power and trading activity, thereby increasing volume of trade and financial dealings.
Source question: 1 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

141. The main objective of accounting report is to provide information about
Options: A. A company’s shareholding B. An entity’s management C. The efficacy ofassets D. A company’s economic resources.
Answer: D Confidence: high
Reason: Accounting reports primarily disclose an entity’s economic resources (assets) and claims to inform users.
Source question: 3 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

142. The accuracyof journalizing is checked by
Options: A. Ensuring that debit totals equal credittotals. B. Posting all journal entries to ledger accounts. C. Adding all figures in the debit column. D. Comparing accounts in the ledger against the jour- nals.
Answer: A Confidence: high
Reason: Correct journalizing is checked by verifying total debits equal total credits in the journal.
Source question: 7 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

143. The excess of income over expenditure is usuallytrans- ferred to the
Options: A. Accumulated fund B. Profit and loss account C. Current assets in the balance sheet D. Current liabilities in the balance sheet.
Answer: A Confidence: high
Reason: For non-profit/club accounts, surplus of income over expenditure is transferred to the accumulated fund.
Source question: 32 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

144. On the dissolution of a partnership business, the net book value of the assets is transferred to
Options: A. Debit of realizationaccount. B. Credit of realization account. C. Debit of bank account D. Credit of bankaccount
Answer: A Confidence: high
Reason: On dissolution assets are removed by debiting Realisation account and crediting the asset accounts; hence net book value is debited to Realisation.
Source question: 36 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

145. Where a company acquires controlling shares of an- other and the consideration is paid in cash, the entries in the books of the purchases are debit
Options: A. Investment and credit cash B. Investment and credit shares C. Purchases and credit cash D. Purchases and credit shares.
Answer: A Confidence: high
Reason: Acquiring controlling shares is an investment for the purchaser — debit Investment and credit Cash when paid in cash.
Source question: 38 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

146. The main difference between the ordinary and prefer- ence shareholders is that
Options: A. The former receive dividends while the latter do not B. The latter are not members of the company while the formerare C. In the case of winding up, the former are paid first before thelatter. D. The former have voting rights while the latter generally do not.
Answer: D Confidence: medium
Reason: Ordinary shareholders normally have voting rights while preference shareholders typically have limited or no voting rights.
Source question: 40 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

147. The lawthat currentlyregulatesthe registration ofcom- panies in Nigeria is the
Options: A. Constitution of the Federal Republic of Nigeria, 1999. B. Nigerian Enterprises Promotion Decree,1972. C. Companies and Allied Matters Act D. Companies Decree,1968.
Answer: C Confidence: medium
Reason: Company registration is governed by the Companies and Allied Matters legislation (CAMA).
Source question: 43 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

148. The correct entry to reflect the receipt of cash sent by a branch to a head office is
Options: A. Debit cash and credit branch current account B. Debit branch current account credit cash C. Credit branch debtors and debit cash D. Credit branch current account and debit branch debtors.
Answer: A Confidence: high
Reason: Head office receiving cash from a branch increases Cash (debit) and reduces the branch current account (credit).
Source question: 46 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

149. To account for expenses paid by head office on behalf of the branch, the branch should
Options: A. Debit head office account and credit cash B. Debit profit and loss account and credit head of- fice account C. Credit cash and debit profit and loss account D. Credit profit and loss account and debit head of- fice account.
Answer: B Confidence: high
Reason: When HO pays expenses for a branch, the branch records the expense (debit P&L) and a liability to HO (credit Head Office account).
Source question: 47 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

150. In an incomplete record, the preparation of the bank reconciliation ensured that
Options: A. All cash taking arebanked B. The cash book is correct C. There are nooverdrafts D. There are nohidden loans.
Answer: B Confidence: medium
Reason: Preparing a bank reconciliation identifies and corrects differences so the cash book can be brought to correctness.
Source question: 6 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

151. The normal accounting entry to record the dishonour of a cheque by a customer is to
Options: A. Debit cash book and credit suspense account. B. Debit cash book and credit drawer C. Credit cash book and debit suspense account D. Credit cash book and debit drawer (customer account).
Answer: D Confidence: high
Reason: A dishonoured cheque reverses the bank receipt — credit the cash/bank book and debit the drawer (customer) to reinstate the receivable.
Source question: 11 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

152. Nasara manufacturing Plc has three direct labour em- ployees that work 40 hours each a week for 50weeks a year. Factory overhead costs of N60,000 is distributed on the basis of direct labour hours. Compute the over-head rate.
Options: A. N12 per hour B. N16 per hour C. N10 per hour D. N15 per hour
Answer: C Confidence: high
Reason: Total direct labour hours = 3 × 40 × 50 = 6,000; overhead rate = 60,000 ÷ 6,000 = N10 per hour.
Source question: 23 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

153. The gross profit on manufactured goods is the differ- ence between the cost of goods manufactured and the
Options: A. Market value of goods produced B. Prime cost ofproduction C. Indirect cost of production D. Goods produced.
Answer: A Confidence: high
Reason: Gross profit = market (selling) value of goods produced minus cost of goods manufactured.
Source question: 30 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

154. In a control account, discount received is found on the
Options: A. Debit side of the purchases ledger control account B. Debit side of the sales ledger contol account C. Credit side of the purchases ledger control account D. Credit side of the sales ledger controlaccount.
Answer: A Confidence: high
Reason: Discount received reduces amounts owed to suppliers, so it is entered on the debit side of the purchases ledger control account.
Source question: 38 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

155. In an incomplete record system, a trading account can- not be prepared until the
Options: A. Day book has been balanced B. Amount of personal drawings has been estab- lished C. Cash book has been balanced D. Amount of sales and purchases has been established.
Answer: D Confidence: high
Reason: A trading account requires the amounts of sales and purchases to compute cost of goods sold and gross profit.
Source question: 39 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

156. Given an incomplete record without sufficient informa- tion to determine profit, the necessary thing to do it to
Options: A. Draw up the statement of affairs. B. Draw up a T-account to establish theamount. C. Compare the journal entries with the cash book . D. Cross-check the cash book for further information.
Answer: A Confidence: high
Reason: Drawing up opening and closing statements of affairs allows calculation of profit via capital comparison.
Source question: 42 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

157. Keeping records under the single entry system has the advantage of
Options: A. Duality in terms ofrecords B. Completeness in terms ofrecords C. Accuracy in terms ofoperation D. Simplicityin terms ofoperation
Answer: D Confidence: high
Reason: Single entry system is simple to operate (simplicity is its main advantage).
Source question: 44 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

158. Upon the dissolution of a partnership, the Partnership Act provides that the amount realized should be
Options: A. Used to pay all taxes due to government B. Used to start a newpartnership business bymem- berswho arewilling C. Shared equally bythe existing partners D. Used in paying thedebts and liabilities ofthe firm to persons who are not partners.
Answer: D Confidence: high
Reason: On dissolution realized amounts are first applied to pay the firm's debts and liabilities to external creditors as required by the Partnership Act.
Source question: 49 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

159. In the public sector, the method of accounting that re- ports revenues and expenditures in the period in which they are received and paid is called
Options: A. Fund accounting B. Commitment accounting C. Cash accounting D. Accrual accounting
Answer: C Confidence: high
Reason: Reporting revenues/expenditures when received/paid is the cash (cash-basis) method of accounting.
Source question: 50 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

160. Which of the following is used to update the cash book in bankreconciliation?
Options: A. Interest received and unpresented cheques B. Commission and debit note C. Unpresented cheques and direct credit D. Interest received and directcredit
Answer: D Confidence: high
Reason: Items used to update the cash book are those shown by the bank but not in the cash book, e.g. interest received and direct credits.
Source question: 1 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

161. The two legally recognized professional accounting bodies in Nigeria arethe
Options: A. Institute of Certified Public Accountants of Nigeria and the Institute of Cost and Management Accountants ofNigeria. B. Association of Accountants of Nigeria and the Institute of Management Accountants of Nigeria C. Institute of Chartered Accountants of Nigeria and the Association ofNational Accountants of Nigeria D. Nigeria Accounting Association and the Executive Cost and Management Accountants ofNigeria.
Answer: C Confidence: high
Reason: The two legally recognised accounting bodies in Nigeria are ICAN (Institute of Chartered Accountants of Nigeria) and ANAN (Association of National Accountants of Nigeria).
Source question: 2 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

162. A retailer recorded sales representing 95% cash and 5% credit. If he banked the total cash sales of N19,000, what was the total sales of the business?
Options: A. N20,000 B. N19,950 C. N21,000 D. N22,000
Answer: A Confidence: high
Reason: Total sales = N19,000 / 0.95 = N20,000 (with credit sales = 5% of N20,000 = N1,000).
Source question: 4 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

163. The transaction that completes its double entry in the same ledger account appears in.
Options: A. cash account and personal account B. bank account and general ledger C. discount received and discount allowed D. cash account and bank account in three-column cash book
Answer: D Confidence: medium
Reason: Contra entries (transfers between cash and bank) are recorded within the cash book and thus complete their double entry between cash and bank columns in the same book.
Source question: 9 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

164. Given: Capital N1,000, Liabilities N500, Assets N1,500. The accounting equation can be expressed as:
Options: A. N1000 + N500 + N1500 = N3000 B. N1000 – N500 + N1500 = N2000 C. N1,000 + N500 = N1,500 D. N1,500 + N500 = N2,000
Answer: C Confidence: high
Reason: Accounting equation: Assets = Capital + Liabilities, so N1,500 = N1,000 + N500.
Source question: 10 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

165. Provision for discount allowed can be recorded as a debit to
Options: A. the profit and loss account and a credit to provision for discount allowed B. provision for discount allowed and a credit to the profit and loss account C. discount allowed and a credit to the profit and loss account D. expenses and a credit to customers’ account
Answer: A Confidence: medium
Reason: Creating a provision for discount allowed is treated as an expense (debit Profit & Loss) and credited to the provision for discount allowed account.
Source question: 17 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

166. In a control account, provision for bad debts is found on the
Options: A. debit side of the purchases ledger control account B. debit side of the sales ledger control account C. credit side of the purchases ledger control account D. credit side of the sales ledger control account
Answer: D Confidence: high
Reason: Provision for bad debts reduces receivables, so it is shown on the credit side of the sales ledger (debtors) control account.
Source question: 22 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

167. The stock valuation data is important because it enables management to
Options: A. separate debtors from creditors B. determine the cost of stock at the end of business C. determine the cost of stock at the beginning of business D. determine the total cost of goods purchased
Answer: B Confidence: high
Reason: Stock valuation data is used to determine the cost/value of closing stock (stock at the end of the period) for financial reporting.
Source question: 23 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

168. Advertising expenses incurred on a product in a business organization should be charged to
Options: A. production department B. sales department C. administration department D. purchases department
Answer: B Confidence: high
Reason: Advertising is a selling expense and is charged to the sales (selling) department.
Source question: 25 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

169. Four broad classifications of overheadsare
Options: A. production, selling, distribution andmaterial B. production, selling, distribution and administration C. selling, distribution, production and wages D. distribution, selling, administration and material
Answer: B Confidence: high
Reason: Standard classification of overheads: production (manufacturing), selling, distribution and administration.
Source question: 26 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

170. Which of the following expenses is apportioned between departments on the basis of floor area occupied?
Options: A. Rent and rates B. Staff canteen expenses C. Delivery van expenses D. Sales commissions
Answer: A Confidence: high
Reason: Rent, rates, heating, and lighting are apportioned on the basis of floor space occupied by each department.
Source question: 27 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

171. The first step in converting a single entry to a double entry system of bookkeeping is to prepare a:
Options: A. Suspense account B. Statement of affairs at start C. Realization account D. Trial balance
Answer: B Confidence: high
Reason: When converting single entry to double entry the first step is to prepare a statement of affairs to ascertain capital and balances.
Source question: 35 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

172. Which of these is a capital expenditure warrant in government accounting?
Options: A. Provisional general warrant B. Development fund general warrant C. Reserved expenditure general warrant D. Supplementary warrant
Answer: B Confidence: medium
Reason: A development fund relates to capital (development) expenditure, so a development fund general warrant is for capital spending.
Source question: 40 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

173. In manufacturing accounting, overhead costs include:
Options: A. Direct materials and direct labour B. Factory rent, indirect labour and machinery depreciation C. Selling expenses and distribution costs D. Administrative salaries and office stationery
Answer: B Confidence: high
Reason: Factory overheads comprise all indirect manufacturing costs including factory rent, indirect wages, and plant depreciation.
Source question: 28 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

174. Given Cost of Goods Sold of N28,000 and Sales of N40,000 with Operating Expenses of N4,000, what is the Net Profit?
Options: A. N12,000 B. N8,000 C. N16,000 D. N4,000
Answer: B Confidence: high
Reason: Gross Profit = N40,000 - N28,000 = N12,000. Net Profit = N12,000 - N4,000 = N8,000.
Source question: 43 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

175. The necessary accounts to be opened on the issue of ordinary share capital are
Options: A. preference share capital, cash and allotment accounts B. bank and ordinary share capital accounts C. cash and ordinary share capital accounts D. nominal value and ordinaryshare capital accounts
Answer: C Confidence: medium
Reason: On issue of ordinary shares the basic accounts opened are the cash (or bank) account and the ordinary share capital account.
Source question: 45 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

176. The amount of each invoiced goods sent to the branch is debited to
Options: A. branch expense account and credited to branch debtors’ account B. branch stock account and credited to the goods sent to branch account C. branch debtors’ account and credited to branch expense account D. goods sent to branch account and credited to branch expense account
Answer: B Confidence: medium
Reason: When invoiced goods are sent to a branch the branch stock account is debited (stock at branch increases) and the goods sent to branch account is credited.
Source question: 46 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

177. Gross profit in the branch adjustment account is transferred to the branch
Options: A. trading account B. receipts and payments account C. profit and loss account D. income and expenditureaccount
Answer: C Confidence: high
Reason: Gross profit in the branch adjustment account is transferred to the profit and loss account to determine overall profit.
Source question: 49 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

178. The accounting principle that is applied to check arbitrary actions on the part of accountants is
Options: A. Consistency B. Materiality C. Objectivity D. Realization
Answer: C Confidence: high
Reason: Objectivity principle requires verifiable evidence and checks arbitrary actions by accountants.
Source question: 1 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

179. The balance on the provision for depreciation account is
Options: A. added to fixed assets on the balance sheet B. deducted from fixed assets on the balance sheet C. deducted from the profit and loss account D. added to the current liabilities of theaccount
Answer: B Confidence: high
Reason: Provision for depreciation is a contra asset and is deducted from the fixed asset value on the balance sheet.
Source question: 12 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

180. Where closing stock is undervalued, the effectis
Options: A. an increase in grossprofit, B. a decrease in gross profit, C. an increase in purchases, D. a decrease in purchases
Answer: B Confidence: high
Reason: Undervalued closing stock increases cost of sales, thereby decreasing gross profit.
Source question: 16 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

181. In a sales ledger, contra entry is found on the
Options: A. debit side of the debtors’ control account B. debit side of the creditors’ control account C. credit side of the debtors’ control account D. credit side of the creditors’ control account
Answer: C Confidence: high
Reason: A contra in the sales (debtors) ledger is shown as a credit in the debtors' control account to reduce debtor balances.
Source question: 19 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

182. Given rent paid by cheque of N671 and cash of N70, with accrued rent b/f of N65 and accrued rent c/f of N115, what amount is charged to Profit and Loss?
Options: A. N606 B. N786 C. N791 D. N856
Answer: C Confidence: high
Reason: Expense charged = cash paid (671 + 70 = 741) + closing accrual (115) - opening accrual (65) = N791.
Source question: 27 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

183. In converting single entry to final account, the balanc- ing figures on the income and expenses accounts are transferred to the
Options: A. revenue and expenditure account B. receipts and payments account C. profit and loss appropriation account D. profit and loss account
Answer: D Confidence: high
Reason: When converting single entry to final accounts, income and expense balancing figures go to the profit and loss account.
Source question: 22 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

184. A rapidly growing business organisation with multiple units that is interested in comparing the performances and weakness of each unit should adopt
Options: A. manufacturing accounts B. consolidated accounts C. departmental accounts D. joint venture accounts
Answer: C Confidence: high
Reason: Departmental accounts allow performance comparison and identification of strengths/weaknesses by unit.
Source question: 32 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

185. How are credit sales by a departmenttreated?
Options: A. the same was as normal debtors’ transactions B. in a different way from normal debtors’ transac- tions C. as an addition to the sales manager’s account D. as an addition tothe production manager’s account
Answer: A Confidence: high
Reason: Department credit sales are recorded like ordinary debtors’ transactions in the department ledgers.
Source question: 35 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

186. Discounts granted to branch customers are treated as a debit to branch
Options: A. stock account and a credit to branch debtors’ ac- count B. discount account and a credit to branch bank ac- count C. stock account and a credit to branch bank account D. discount account and a credit to branch debtors’ account
Answer: D Confidence: high
Reason: Discount allowed to branch customers is an expense — debit branch discount account and credit branch debtors to reduce the debtor balance.
Source question: 36 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

187. When a newpartner isadmitted toa partnership thereis a need to revalue the
Options: A. capital of the business B. capital and liabilities of thebusiness C. assets and capital of the business D. assets and liabilities of the business
Answer: D Confidence: high
Reason: On admission of a new partner assets and liabilities are revalued to current/realizable values before adjusting capitals.
Source question: 41 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

188. The accounting entry to record the premium on good- will is to debit
Options: A. cash and credit old partners’capita, B. goodwill and creditrevaluation C. assets and credit capital D. capital and credit assets
Answer: A Confidence: high
Reason: Premium on goodwill received from the incoming partner is cash — debit Cash and credit the old partners’ capital accounts.
Source question: 42 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

189. Debentures can be redeemed out of
Options: A. existing share capital reserve B. existing generalreserve C. proceeds from new issue of shares D. withholdingtax
Answer: C Confidence: high
Reason: Debentures are often redeemed using funds raised from a fresh issue of shares (proceeds of a new issue).
Source question: 44 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

190. According to the provisions of the 1999 constitution, all revenue generated by the Federal Government must be paid into the
Options: A. Consolidated revenue fund, B. Federation account C. revenue mobilization allocation and fiscal commission’s account, D. equalization fund
Answer: A Confidence: high
Reason: By the 1999 Constitution federal receipts are to be paid into the Consolidated Revenue Fund.
Source question: 48 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf

191. The statement of assets and liabilities in the public sector can be described as the
Options: A. income and expenditure account of government B. appropriation account ofgovernment C. balance sheet ofgovernment D. funds flow statement ofgovernment
Answer: C Confidence: high
Reason: The statement of assets and liabilities for the public sector is the government’s balance sheet.
Source question: 50 Source: JAMBPRINCIPLES-OF-ACCOUNTSPASTQUESTION1994-2004.pdf
"""

def parse_items():
    blocks = raw_data.strip().split("\n\n")
    questions = []
    for b in blocks:
        lines = [l.strip() for l in b.strip().split("\n") if l.strip()]
        if len(lines) < 4:
            continue
        # Extract number and question text
        num_m = re.match(r"^(\d+)\.\s*(.*)", lines[0])
        if not num_m:
            continue
        num = int(num_m.group(1))
        stem = num_m.group(2)
        
        # Options line
        opt_line = ""
        ans_line = ""
        reason_line = ""
        for line in lines[1:]:
            if line.startswith("Options:"):
                opt_line = line
            elif line.startswith("Answer:"):
                ans_line = line
            elif line.startswith("Reason:"):
                reason_line = line
                
        # Parse options
        opt_m = re.search(r"A\.\s*(.*?)\s*B\.\s*(.*?)\s*C\.\s*(.*?)\s*D\.\s*(.*)", opt_line)
        if opt_m:
            oa, ob, oc, od = opt_m.group(1), opt_m.group(2), opt_m.group(3), opt_m.group(4)
        else:
            oa, ob, oc, od = "Option A", "Option B", "Option C", "Option D"
            
        ans_m = re.search(r"Answer:\s*([A-D])", ans_line)
        ans_idx = 0
        if ans_m:
            ans_idx = ord(ans_m.group(1).upper()) - ord('A')
            
        explanation = reason_line.replace("Reason:", "").strip()
        if not explanation:
            explanation = f"Option {chr(ord('A') + ans_idx)} is the correct answer according to JAMB Principles of Accounts syllabus."
            
        questions.append({
            "num": num,
            "stem": stem,
            "optionA": oa,
            "optionB": ob,
            "optionC": oc,
            "optionD": od,
            "ans_idx": ans_idx,
            "explanation": explanation
        })
    return questions

items = parse_items()
print(f"Parsed {len(items)} Accounts questions successfully!")
