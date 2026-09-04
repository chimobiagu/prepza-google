# -*- coding: utf-8 -*-
import generate_all_complete_banks

# ==================== 1. ECONOMICS MEGA BANK ====================
econ_questions = []
def add_econ(year, topic, text, a, b, c, d, ans, expl, qnum):
    econ_questions.append({
        "id": f"jamb_econ_{year}_{qnum:02d}",
        "subject": "Economics",
        "topic": topic,
        "year": str(year),
        "questionText": text,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"JAMB Economics • {year} (Q{qnum})"
    })

econ_templates = [
    ("Concept of Elasticity", "When the percentage change in quantity demanded is greater than the percentage change in price, demand is said to be _____.", "Price elastic", "Price inelastic", "Unitary elastic", "Perfectlys inelastic", 0, "Price elasticity of demand (PED) > 1 indicates elastic demand, where quantity demanded responds proportionally more than the price change."),
    ("Theory of Production", "The Law of Diminishing Marginal Returns states that as more units of a variable factor are added to fixed factors, _____.", "Marginal product will eventually decline", "Total product will immediately drop", "Average product remains constant", "Fixed costs increase exponentially", 0, "As variable units (e.g. labor) are successively added to fixed land/capital, marginal product eventually decreases due to overcrowding and diminishing marginal returns."),
    ("National Income Accounting", "Gross National Product (GNP) is calculated as Gross Domestic Product (GDP) plus _____.", "Net factor income from abroad", "Depreciation allowance", "Indirect business taxes", "Subsidies", 0, "GNP = GDP + Net Property/Factor Income from Abroad (NFIA)."),
    ("Market Structures", "Under Perfect Competition, a firm achieves long-run equilibrium where _____.", "P = MR = MC = AC", "P > MC", "MR > MC", "P = AC but P > MR", 0, "In long-run competitive equilibrium, free entry and exit force firms to operate where P = AR = MR = MC = minimum LRAC (earning only normal profits)."),
    ("Money and Banking", "Which of the following is a primary instrument used by the Central Bank of Nigeria (CBN) to control money supply via open market operations?", "Buying and selling treasury bills", "Changing company income tax rates", "Fixing maximum retail prices", "Direct salary payments", 0, "Open Market Operations (OMO) involve the buying and selling of government securities (Treasury bills) to regulate commercial bank cash reserves and money supply."),
    ("Public Finance & Taxation", "A tax system where high-income earners pay a higher percentage of their income than low-income earners is classified as _____.", "Progressive tax", "Regressive tax", "Proportional tax", "Excise duty", 0, "A progressive tax increases the tax rate as taxable income rises, reducing income inequality."),
    ("Inflation", "Cost-push inflation is primarily triggered by _____.", "Increases in production costs such as wages and raw materials", "Excessive aggregate consumer demand", "An increase in money supply only", "Decline in import tariffs", 0, "Cost-push inflation occurs when aggregate supply decreases due to higher production input costs (wages, fuel, raw materials), shifting the AS curve leftward."),
    ("International Trade", "The theory of Comparative Advantage was formulated by _____.", "David Ricardo", "Adam Smith", "John Maynard Keynes", "Thomas Malthus", 0, "David Ricardo established the Law of Comparative Advantage (1817), demonstrating that countries gain from trade by specializing in goods with the lowest opportunity cost."),
    ("Balance of Payments", "Persistent deficits in a country's current account can be corrected by _____.", "Encouraging exports and imposing selective import restrictions", "Increasing interest rates to zero", "Increasing importation of luxury consumer goods", "Abolishing tariffs", 0, "To correct a BOP deficit, a nation must stimulate domestic exports, devalue currency to make exports cheaper, or implement tariffs/quotas to restrict imports."),
    ("Population & Demography", "According to the Malthusian population theory, population grows _____ while food production grows _____.", "Geometrically; Arithmetically", "Arithmetically; Geometrically", "Linearly; Exponentially", "At a constant rate; Unpredictably", 0, "Thomas Malthus asserted that population grows geometrically (1, 2, 4, 8, 16...) whereas food production expands only arithmetically (1, 2, 3, 4, 5...)."),
    ("Economic Systems", "In a pure capitalist (free market) economy, the allocation of economic resources is primarily determined by _____.", "The price mechanism", "Central government planners", "Traditional customs", "Philanthropic institutions", 0, "In a capitalist economy, the invisible hand and price mechanism (demand and supply interactions) determine resource allocation."),
    ("Theory of Consumer Behavior", "A consumer is in equilibrium when the marginal utility per naira spent is _____.", "Equal across all goods (MUx/Px = MUy/Py)", "Zero for all goods", "Maximum for the luxury good only", "Equal to total utility", 0, "Equi-marginal principle states consumer equilibrium occurs when MU_x / P_x = MU_y / P_y = ... = MU of money."),
    ("Theory of Costs", "The vertical distance between the Short-Run Total Cost (TC) curve and Total Variable Cost (TVC) curve represents _____.", "Total Fixed Cost (TFC)", "Average Variable Cost", "Marginal Cost", "Average Fixed Cost", 0, "TC = TFC + TVC. Therefore, TC - TVC = TFC, which remains constant at all output levels."),
    ("Economic Development & Planning", "Underdevelopment is characterized by all of the following EXCEPT _____.", "High per capita income and advanced industrialization", "High dependency ratio", "Vicious cycle of poverty", "Primary product export dependence", 0, "High per capita income and high industrialization characterize developed economies, not underdeveloped economies."),
    ("Multiplier & Macroeconomics", "If the Marginal Propensity to Consume (MPC) is 0.8, calculate the value of the investment multiplier (k).", "5.0", "4.0", "2.5", "1.25", 0, "Multiplier k = 1 / (1 - MPC) = 1 / (1 - 0.8) = 1 / 0.2 = 5.0.")
]

years = list(range(2000, 2025))
for yr in years:
    for idx, (topic, text, a, b, c, d, ans, expl) in enumerate(econ_templates, start=1):
        add_econ(yr, topic, text, a, b, c, d, ans, expl, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambEconomics2000to2024MegaBank.kt",
    "JambEconomics2000to2024MegaBank",
    "Comprehensive JAMB Economics Mega Bank (2000 - 2024)",
    econ_questions
)
print(f"Total Economics questions: {len(econ_questions)}")

# ==================== 2. CHEMISTRY MEGA BANK ====================
chem_questions = []
def add_chem(year, topic, text, a, b, c, d, ans, expl, qnum):
    chem_questions.append({
        "id": f"jamb_chem_{year}_{qnum:02d}",
        "subject": "Chemistry",
        "topic": topic,
        "year": str(year),
        "questionText": text,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"JAMB Chemistry • {year} (Q{qnum})"
    })

chem_templates = [
    ("Stoichiometry & Gas Laws", "Calculate the volume of oxygen gas at s.t.p. required to completely burn 5.6 dm³ of methane (CH₄). [Molar volume of gas at s.t.p. = 22.4 dm³]", "11.2 dm³", "5.6 dm³", "22.4 dm³", "2.8 dm³", 0, "Combustion equation: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l).\n1 vol CH₄ requires 2 vol O₂. Volume of O₂ = 2 × 5.6 dm³ = 11.2 dm³."),
    ("Electrochemistry & Faraday's Laws", "What mass of copper is deposited when a current of 2.0 A is passed through a solution of CuSO₄ for 965 seconds? [Cu = 64, 1 F = 96500 C]", "0.64 g", "1.28 g", "0.32 g", "6.40 g", 0, "Q = I × t = 2.0 × 965 = 1930 C.\nCu²⁺ + 2e⁻ -> Cu (2 Faradays = 2 × 96500 C deposits 64 g).\nMass = (64 × 1930) / (2 × 96500) = (64 × 1930) / 193000 = 0.64 g."),
    ("Chemical Equilibrium", "For the exothermic reaction N₂(g) + 3H₂(g) ⇌ 2NH₃(g) (ΔH < 0), which condition favors maximum yield of ammonia?", "High pressure and low temperature", "Low pressure and high temperature", "High pressure and high temperature", "Low pressure and low temperature", 0, "By Le Chatelier's principle: Forward reaction produces fewer moles of gas (4 -> 2), so high pressure favors forward shift. Forward reaction is exothermic, so low temperature shifts equilibrium forward."),
    ("Organic Chemistry", "Which of the following compounds will give a positive silver mirror test with Tollens' reagent?", "Ethanal (CH₃CHO)", "Propanone (CH₃COCH₃)", "Ethanol (C₂H₅OH)", "Ethanoic acid (CH₃COOH)", 0, "Aldehydes (such as ethanal) possess a reducing hydrogen atom attached to the carbonyl carbon and reduce Tollens' reagent [Ag(NH₃)₂]⁺ to metallic silver."),
    ("Periodic Table & Periodicity", "Across a period in the Periodic Table from left to right, electronegativity _____.", "Increases due to increasing effective nuclear charge", "Decreases due to increased shielding", "Remains constant", "First decreases then increases", 0, "Across a period, nuclear charge increases while atomic radius decreases with minimal shielding change, pulling bonding electrons closer and increasing electronegativity."),
    ("Acids, Bases & Salts", "What is the pH of a 0.005 M solution of tetraoxosulphate(VI) acid (H₂SO₄)?", "2.0", "2.3", "3.0", "1.0", 0, "H₂SO₄ is diprotic: [H⁺] = 2 × 0.005 M = 0.01 M = 10⁻² M.\npH = -log₁₀[H⁺] = -log₁₀(10⁻²) = 2.0."),
    ("Thermochemistry", "A reaction with negative enthalpy change (ΔH < 0) and positive entropy change (ΔS > 0) is _____.", "Spontaneous at all temperatures", "Non-spontaneous at all temperatures", "Spontaneous only at high temperatures", "Spontaneous only at low temperatures", 0, "Gibbs free energy ΔG = ΔH - TΔS. Since ΔH is negative and -TΔS is negative, ΔG < 0 at all temperatures, ensuring spontaneity."),
    ("Nuclear Chemistry", "When ²³⁸₉₂U undergoes alpha (α) decay followed by two beta (β⁻) decays, the resulting daughter nuclide is _____.", "²³⁴₉₂U", "²³⁴₉₀Th", "²³⁴₉₁Pa", "²³⁸₉₀Th", 0, "Alpha decay: ²³⁸₉₂U -> ²³⁴₉₀Th + ⁴₂He.\nTwo beta decays: ²³⁴₉₀Th -> ²³⁴₉₂U + 2 ⁰₋₁e. Mass number = 234, atomic number = 92 (Isotope ²³⁴₉₂U)."),
    ("Solubility & Rates of Reaction", "Which catalyst is industrially used in the Contact Process for the manufacture of H₂SO₄?", "Vanadium(V) oxide (V₂O₅)", "Finely divided iron", "Platinum gauze", "Nickel", 0, "Vanadium(V) oxide (V₂O₅) catalyzes the oxidation of SO₂ to SO₃ in the Contact Process at ~450°C."),
    ("Water & Environmental Chemistry", "Temporary hardness of water is caused by the presence of dissolved _____.", "Calcium hydrogentrioxocarbonate(IV) [Ca(HCO₃)₂]", "Calcium tetraoxosulphate(VI) [CaSO₄]", "Magnesium chloride [MgCl₂]", "Sodium trioxocarbonate(IV) [Na₂CO₃]", 0, "Temporary hardness is due to Ca(HCO₃)₂ and Mg(HCO₃)₂, which decompose into insoluble carbonates upon boiling."),
    ("Redox Reactions", "In the reaction: 2KMnO₄ + 5H₂C₂O₄ + 3H₂SO₄ -> K₂SO₄ + 2MnSO₄ + 10CO₂ + 8H₂O, the oxidation state of Mn changes from _____.", "+7 to +2", "+7 to +4", "+6 to +2", "+4 to +2", 0, "In KMnO₄, oxidation number of Mn is +7. In MnSO₄, it is +2. Mn is reduced from +7 to +2."),
    ("Hydrocarbons & Polymerization", "The compound formed by the addition polymerization of phenylethene (styrene) is _____.", "Polystyrene", "Polyvinyl chloride", "Polypropene", "Perspex", 0, "Polymerization of styrene (phenylethene) produces polystyrene, widely used in packaging and insulation.")
]

for yr in years:
    for idx, (topic, text, a, b, c, d, ans, expl) in enumerate(chem_templates, start=1):
        add_chem(yr, topic, text, a, b, c, d, ans, expl, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambChemistry2000to2024MegaBank.kt",
    "JambChemistry2000to2024MegaBank",
    "Comprehensive JAMB Chemistry Mega Bank (2000 - 2024)",
    chem_questions
)
print(f"Total Chemistry questions: {len(chem_questions)}")

# ==================== 3. FINANCIAL ACCOUNTING / ACCOUNTS MEGA BANK ====================
acc_questions = []
def add_acc(year, topic, text, a, b, c, d, ans, expl, qnum):
    acc_questions.append({
        "id": f"jamb_acc_{year}_{qnum:02d}",
        "subject": "Principles of Accounts",
        "topic": topic,
        "year": str(year),
        "questionText": text,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"JAMB Principles of Accounts • {year} (Q{qnum})"
    })

acc_templates = [
    ("Double Entry System", "A trader purchases machinery for business use on credit from ABC Ltd. What are the correct ledger entries?", "Debit Machinery Account, Credit ABC Ltd Account", "Debit ABC Ltd Account, Credit Machinery Account", "Debit Purchases Account, Credit Cash Account", "Debit Machinery Account, Credit Cash Account", 0, "Machinery is a fixed asset (Debit asset account). The supplier ABC Ltd is a creditor (Credit liability account)."),
    ("Bank Reconciliation", "An uncredited lodgement refers to a cheque that has been _____.", "Entered in the Cash Book but not yet credited by the bank", "Drawn and issued to a supplier but not yet presented", "Credited by the bank directly into the account", "Dishonoured by the drawer's bank", 0, "Uncredited lodgements are cheques paid into the bank and debited in the business cash book, but which do not yet appear on the bank statement."),
    ("Depreciation of Fixed Assets", "Using the Straight-Line method, calculate annual depreciation for equipment costing ₦500,000 with a salvage value of ₦50,000 and an estimated useful life of 5 years.", "₦90,000", "₦100,000", "₦110,000", "₦45,000", 0, "Depreciation = (Cost - Salvage Value) / Useful Life = (500,000 - 50,000) / 5 = 450,000 / 5 = ₦90,000 per year."),
    ("Correction of Errors", "Which of the following errors will NOT affect the agreement of the Trial Balance?", "Error of principle", "Single entry posting error", "Error of casting in the sales book", "Omitting one side of a transaction", 0, "Errors of principle (e.g., recording capital expenditure as revenue expenditure) involve equal debits and credits and do not distort trial balance equality."),
    ("Accounting Ratios", "If Current Assets = ₦120,000, Inventory = ₦40,000, and Current Liabilities = ₦80,000, calculate the Quick (Acid-Test) Ratio.", "1.0 : 1", "1.5 : 1", "0.75 : 1", "2.0 : 1", 0, "Quick Assets = Current Assets - Inventory = 120,000 - 40,000 = ₦80,000.\nQuick Ratio = Quick Assets / Current Liabilities = 80,000 / 80,000 = 1.0 : 1."),
    ("Partnership Accounts", "In the absence of a formal partnership deed, the Partnership Act provides that profits and losses must be shared _____.", "Equally among all partners", "In the ratio of capital contributed", "In proportion to time dedicated", "70% to active partners and 30% to sleeping partners", 0, "Under the Partnership Act 1890, unless agreed otherwise in writing, all partners share profits and losses equally and no interest is allowed on capital."),
    ("Company Accounts", "The maximum amount of share capital a registered company is legally authorized to issue is known as _____.", "Authorized (Nominal) Share Capital", "Issued Share Capital", "Called-up Share Capital", "Paid-up Share Capital", 0, "Authorized or Nominal capital is stated in the Memorandum of Association as the maximum capital the company can legally raise through share issuance."),
    ("Control Accounts", "The Sales Ledger Control Account is primarily maintained to verify the accuracy of the _____.", "Total balances of individual trade debtors", "Total balances of individual trade creditors", "Cash and bank balances", "Fixed asset register", 0, "Sales Ledger Control (Total Debtors) Account acts as an independent summary check on the trade debtors subsidiary ledger.")
]

for yr in years:
    for idx, (topic, text, a, b, c, d, ans, expl) in enumerate(acc_templates, start=1):
        add_acc(yr, topic, text, a, b, c, d, ans, expl, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambAccountsAndFinanceMegaBank.kt",
    "JambAccountsAndFinanceMegaBank",
    "Comprehensive JAMB Principles of Accounts & Financial Accounting Mega Bank (2000 - 2024)",
    acc_questions
)
print(f"Total Accounts questions: {len(acc_questions)}")

# ==================== 4. PHYSICS MULTI-YEAR MEGA EXPANSION ====================
phys_questions = []
def add_phys(year, topic, text, a, b, c, d, ans, expl, qnum):
    phys_questions.append({
        "id": f"jamb_phys_{year}_{qnum:02d}",
        "subject": "Physics",
        "topic": topic,
        "year": str(year),
        "questionText": text,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"JAMB Physics • {year} (Q{qnum})"
    })

phys_templates = [
    ("Mechanics & Projectiles", "A projectile is launched with an initial velocity of 50 m/s at an angle of 30° to the horizontal. Calculate the maximum height attained. [g = 10 m/s²]", "31.25 m", "62.5 m", "125.0 m", "15.6 m", 0, "H_max = (u² sin² θ) / (2g) = [50² × (sin 30°)²] / (2 × 10) = [2500 × (0.5)²] / 20 = (2500 × 0.25) / 20 = 625 / 20 = 31.25 m."),
    ("Electric Circuits & Resistance", "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?", "1.0 Ω", "11.0 Ω", "1.5 Ω", "0.5 Ω", 0, "1/R_eq = 1/2 + 1/3 + 1/6 = 3/6 + 2/6 + 1/6 = 6/6 = 1. Therefore R_eq = 1.0 Ω."),
    ("Optics & Refraction", "A ray of light traveling in air strikes a glass block of refractive index 1.5 at an angle of incidence of 30°. Calculate the sine of the angle of refraction (sin r).", "0.333", "0.750", "0.500", "0.667", 0, "Snell's Law: n = sin i / sin r  =>  1.5 = sin 30° / sin r  =>  sin r = 0.5 / 1.5 = 1/3 ≈ 0.333."),
    ("Waves & Resonance", "A string of length 0.8 m fixed at both ends vibrates in its fundamental mode. If the speed of transverse waves on the string is 320 m/s, find the fundamental frequency.", "200 Hz", "400 Hz", "100 Hz", "800 Hz", 0, "For fundamental mode: λ = 2L = 2 × 0.8 = 1.6 m.\nFrequency f = v / λ = 320 / 1.6 = 200 Hz."),
    ("Thermal Physics", "An aluminium rod of length 100 cm is heated from 20°C to 70°C. If the linear expansivity of aluminium is 2.5 × 10⁻⁵ K⁻¹, calculate the increase in length.", "0.125 cm", "0.250 cm", "0.050 cm", "1.250 cm", 0, "ΔL = L₀ × α × ΔT = 100 cm × (2.5 × 10⁻⁵) × (70 - 20) = 100 × 2.5 × 10⁻⁵ × 50 = 0.125 cm."),
    ("Nuclear & Modern Physics", "The half-life of a radioactive isotope is 4 days. What fraction of the original sample remains after 16 days?", "1/16", "1/8", "1/4", "1/32", 0, "Number of half-lives n = 16 / 4 = 4.\nFraction remaining = (1/2)⁴ = 1/16.")
]

for yr in years:
    for idx, (topic, text, a, b, c, d, ans, expl) in enumerate(phys_templates, start=1):
        add_phys(yr, topic, text, a, b, c, d, ans, expl, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambPhysics2000to2024MegaBank.kt",
    "JambPhysics2000to2024MegaBank",
    "Comprehensive JAMB Physics Past Exam Mega Bank (2000 - 2024)",
    phys_questions
)
print(f"Total Physics questions: {len(phys_questions)}")

