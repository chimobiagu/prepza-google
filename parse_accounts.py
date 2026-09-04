import re

# We will read the checkpoint or extract the 191 Principles of Accounts questions from OCR text
pdf_text = """
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
"""
print("Initialized parse_accounts script")
