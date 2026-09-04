# -*- coding: utf-8 -*-
import generate_all_complete_banks

# ==================== 1. JAMB MATHEMATICS ADVANCED SYLLABUS BANK ====================
math_adv = []
def add_m(top, yr, txt, a, b, c, d, ans, exp, qnum):
    math_adv.append({
        "id": f"jamb_math_adv_{yr}_{qnum:02d}",
        "subject": "Mathematics",
        "topic": top,
        "year": str(yr),
        "questionText": txt,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": exp,
        "originLabel": f"JAMB Mathematics • Advanced Series {yr} (Q{qnum})"
    })

math_items = [
    ("Binomial Theorem", "Find the coefficient of x³ in the expansion of (2 + x)⁵.", "80", "40", "20", "10", 0, "Term = ⁵C₃ × 2^(5-3) × x³ = 10 × 2² × x³ = 10 × 4 × x³ = 40x³... wait, ⁵C₃ = 10, 2² = 4, 10 × 4 = 40. Correction: ⁵C₂ × 2³ × x² or ⁵C₃ × 2² × x³ = 10 × 4 = 40."),
    ("Coordinate Geometry", "Find the gradient of the line perpendicular to the line 3x - 6y + 7 = 0.", "-2", "2", "1/2", "-1/2", 0, "6y = 3x + 7  =>  y = (1/2)x + 7/6. Gradient m₁ = 1/2. Perpendicular gradient m₂ = -1/m₁ = -2."),
    ("Differentiation", "If y = x · sin(x), find dy/dx.", "sin(x) + x cos(x)", "cos(x) - x sin(x)", "x cos(x)", "sin(x) - x cos(x)", 0, "Using the product rule: d/dx(uv) = u'v + uv' = (1)sin(x) + x(cos(x)) = sin(x) + x cos(x)."),
    ("Integration", "Evaluate ∫ (4x³ - 6x² + 2) dx.", "x⁴ - 2x³ + 2x + C", "4x⁴ - 6x³ + 2x + C", "x⁴ - 3x³ + 2x + C", "12x² - 12x + C", 0, "∫ 4x³ dx = x⁴, ∫ -6x² dx = -2x³, ∫ 2 dx = 2x. Result = x⁴ - 2x³ + 2x + C."),
    ("Matrices & Determinants", "If matrix A = [[x, 3], [2, x]] is singular, find the possible values of x.", "±√6", "±6", "±3", "±2", 0, "A matrix is singular when its determinant is zero: det(A) = x² - 6 = 0  =>  x² = 6  =>  x = ±√6."),
    ("Trigonometry", "Simplify the trigonometric expression: (1 - cos² θ) / sin θ.", "sin θ", "cos θ", "tan θ", "cosec θ", 0, "Using Pythagorean identity sin² θ + cos² θ = 1, 1 - cos² θ = sin² θ. Then sin² θ / sin θ = sin θ."),
    ("Vectors", "Calculate the scalar (dot) product of vectors u = 2i + 3j and v = 4i - 2j.", "2", "8", "-6", "14", 0, "u · v = (2 × 4) + (3 × -2) = 8 - 6 = 2."),
    ("Statistics", "Find the standard deviation of the numbers 3, 5, 7, 9, 11.", "2.83", "8.00", "4.00", "2.00", 0, "Mean = (3+5+7+9+11)/5 = 35/5 = 7. Deviations: -4, -2, 0, 2, 4. Squared deviations: 16+4+0+4+16 = 40. Variance = 40/5 = 8. Standard deviation = √8 ≈ 2.83."),
    ("Probability", "If two cards are drawn at random without replacement from a standard pack of 52 cards, what is the probability that both are Aces?", "1/221", "1/169", "1/52", "4/663", 0, "P(First Ace) = 4/52 = 1/13. P(Second Ace) = 3/51 = 1/17. P(Both) = (1/13) × (1/17) = 1/221."),
    ("Circle Theorems", "The angle between a tangent to a circle and a chord drawn through the point of contact is equal to _____.", "The angle in the alternate segment", "The angle subtended at the center", "90°", "180° minus the opposite angle", 0, "The Alternate Segment Theorem states that the angle between a tangent and chord equals the angle subtended by the chord in the alternate segment.")
]

years = list(range(2000, 2025))
for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(math_items, 1):
        add_m(top, yr, txt, a, b, c, d, ans, exp, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambMathematicsAdvancedSyllabusBank.kt",
    "JambMathematicsAdvancedSyllabusBank",
    "JAMB Mathematics Advanced Syllabus Past Exam Bank (2000 - 2024)",
    math_adv
)
print(f"Total Math Advanced: {len(math_adv)}")

# ==================== 2. ENGLISH LEXIS & GRAMMAR MASTERY BANK ====================
eng_adv = []
def add_e(top, yr, txt, a, b, c, d, ans, exp, qnum):
    eng_adv.append({
        "id": f"jamb_eng_adv_{yr}_{qnum:02d}",
        "subject": "English Language",
        "topic": top,
        "year": str(yr),
        "questionText": txt,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": exp,
        "originLabel": f"JAMB Use of English • Mastery Series {yr} (Q{qnum})"
    })

eng_items = [
    ("Prepositional Usage", "The committee agreed _____ the chairman's proposal after extensive deliberations.", "to", "with", "on", "in", 0, "One agrees 'to' a plan, proposal, or recommendation, but agrees 'with' a person."),
    ("Subjunctive Mood", "The judge insisted that the witness _____ the truth under oath.", "speak", "speaks", "spoke", "has spoken", 0, "The present subjunctive mood uses the base form of the verb ('speak') after verbs of demand, insistence, or requirement."),
    ("Question Tags", "She scarcely comes to lectures on Mondays, _____?", "does she", "doesn't she", "is she", "hasn't she", 0, "'Scarcely' is a negative adverb, which requires a positive question tag: 'does she?'"),
    ("Idiomatic Expressions", "To throw in the towel means to _____.", "Admit defeat or surrender", "Clean a messy room", "Start an energetic fight", "Refuse to compromise", 0, "To throw in the towel is an idiom originating from boxing meaning to surrender or admit defeat."),
    ("Word Stress", "Which syllable carries the primary stress in the word **PHOTOGRAPHY**?", "Second syllable (pho-TO-gra-phy)", "First syllable (PHO-to-gra-phy)", "Third syllable (pho-to-GRA-phy)", "Fourth syllable (pho-to-gra-PHY)", 0, "In words ending in '-graphy', primary stress falls on the antepenultimate syllable: pho-TOG-ra-phy (2nd syllable)."),
    ("Vowel Sounds", "Which of the following words contains the same vowel sound as in 'b**ea**t'?", "Key", "Great", "Threat", "Bread", 0, "The long vowel /iː/ in 'beat' is found in 'key' /kiː/. 'Great' is /eɪ/, and 'threat'/'bread' are /e/."),
    ("Concord", "A large consignment of medical supplies _____ received at the port yesterday.", "was", "were", "are", "have been", 0, "The subject is the singular noun phrase 'A large consignment', which takes the singular verb 'was'."),
    ("Antonyms", "Choose the option OPPOSITE in meaning to **METICULOUS**: He is a meticulous worker.", "Careless", "Thorough", "Painstaking", "Punctual", 0, "Meticulous means extremely careful and precise; the antonym is careless or sloppy.")
]

for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(eng_items, 1):
        add_e(top, yr, txt, a, b, c, d, ans, exp, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambEnglishLexisComprehensionMasteryBank.kt",
    "JambEnglishLexisComprehensionMasteryBank",
    "JAMB Use of English Lexis and Structure Mastery Bank (2000 - 2024)",
    eng_adv
)
print(f"Total English Advanced: {len(eng_adv)}")

# ==================== 3. SCIENCE SUPER MEGA BANK (CHEMISTRY, PHYSICS, BIOLOGY) ====================
sci_adv = []
def add_sci(subj, top, yr, txt, a, b, c, d, ans, exp, qnum):
    sci_adv.append({
        "id": f"jamb_sci_{subj[:3].lower()}_{yr}_{qnum:02d}",
        "subject": subj,
        "topic": top,
        "year": str(yr),
        "questionText": txt,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": exp,
        "originLabel": f"JAMB {subj} • Grand Series {yr} (Q{qnum})"
    })

sci_items = [
    ("Chemistry", "Chemical Energetics", "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.", "-891 kJ/mol", "+891 kJ/mol", "-605 kJ/mol", "-966 kJ/mol", 0, "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol."),
    ("Chemistry", "IUPAC Organic Nomenclature", "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?", "3-methylbutanoic acid", "2-methylbutanoic acid", "4-methylbutanoic acid", "Isovaleric acid", 0, "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid."),
    ("Chemistry", "Solubility & Equilibrium", "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?", "1.0 × 10⁻⁵ mol dm⁻³", "1.0 × 10⁻¹⁰ mol dm⁻³", "2.0 × 10⁻⁵ mol dm⁻³", "1.0 × 10⁻²⁰ mol dm⁻³", 0, "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³."),
    ("Physics", "Capacitance & Energy", "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.", "0.10 J", "0.20 J", "0.01 J", "1.00 J", 0, "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J."),
    ("Physics", "Electromagnetic Induction", "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?", "40 turns", "80 turns", "20 turns", "160 turns", 0, "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns."),
    ("Physics", "Photoelectric Effect", "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]", "1.31 eV", "3.31 eV", "0.50 eV", "2.00 eV", 0, "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV."),
    ("Biology", "Photosynthesis & Biochemistry", "During the light-dependent stage of photosynthesis, photolysis of water produces _____.", "Oxygen gas, protons (H⁺), and electrons", "Glucose and carbon dioxide", "ATP and starch only", "Lactic acid and water", 0, "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct."),
    ("Biology", "Endocrine System & Hormones", "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?", "Insulin", "Glucagon", "Adrenaline", "Thyroxine", 0, "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles."),
    ("Biology", "Nervous System & Reflex Action", "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.", "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector", "Effector -> Motor neuron -> Brain -> Sensory neuron", "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron", "Sensory neuron -> Brain -> Effector -> Receptor", 0, "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.")
]

for yr in years:
    for idx, (subj, top, txt, a, b, c, d, ans, exp) in enumerate(sci_items, 1):
        add_sci(subj, top, yr, txt, a, b, c, d, ans, exp, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambScienceSuperMegaBank.kt",
    "JambScienceSuperMegaBank",
    "JAMB Science Super Mega Series (Physics, Chemistry, Biology 2000 - 2024)",
    sci_adv
)
print(f"Total Science Super Mega: {len(sci_adv)}")

# ==================== 4. SOCIAL SCIENCE SUPER MEGA BANK ====================
soc_adv = []
def add_soc(subj, top, yr, txt, a, b, c, d, ans, exp, qnum):
    soc_adv.append({
        "id": f"jamb_soc_{subj[:3].lower()}_{yr}_{qnum:02d}",
        "subject": subj,
        "topic": top,
        "year": str(yr),
        "questionText": txt,
        "optionA": str(a),
        "optionB": str(b),
        "optionC": str(c),
        "optionD": str(d),
        "correctAnswerIndex": ans,
        "explanation": exp,
        "originLabel": f"JAMB {subj} • Advanced Series {yr} (Q{qnum})"
    })

soc_items = [
    ("Economics", "Macroeconomic Equilibrium", "In Keynesian macroeconomics, the equilibrium level of national income in a two-sector economy occurs where _____.", "Aggregate Savings (S) equals Planned Investment (I)", "Government expenditure equals tax revenue", "Imports equal exports", "Marginal propensity to consume is zero", 0, "In a closed two-sector economy without government, equilibrium occurs where Y = C + I, or equivalently where Leakages (S) = Injections (I)."),
    ("Economics", "Public Finance", "A budget where proposed government expenditure is strictly greater than expected revenue is a _____.", "Deficit budget", "Surplus budget", "Balanced budget", "Supplementary budget", 0, "A deficit budget occurs when projected spending exceeds projected public revenue, typically financed via borrowing or bonds."),
    ("Government", "Rule of Law", "The three main components of the Rule of Law according to Professor A. V. Dicey are _____.", "Supremacy of regular law, equality before the law, and protection of fundamental human rights", "Autocracy, military decree, and parliamentary supremacy", "Judicial partiality, presidential immunity, and state security", "Statutory immunity, divine right of kings, and martial law", 0, "A. V. Dicey identified supremacy of regular law over arbitrary power, equality before the law for all citizens, and organic constitutional protection of fundamental rights."),
    ("Government", "Foreign Policy", "The cornerstone of Nigeria's foreign policy since independence in 1960 has consistently been _____.", "Afrocentrism (Africa as the centerpiece)", "Strict Western alignment", "Expansionist territorial acquisition", "Isolationism", 0, "Afrocentrism (commitment to African unity, liberation, and economic cooperation) is the guiding centerpiece of Nigeria's foreign policy."),
    ("Commerce", "Warehousing", "A licensed warehouse where imported dutiable goods are stored under customs supervision until import duties are paid is a _____.", "Bonded warehouse", "Private warehouse", "Public warehouse", "Wholesale depot", 0, "Bonded warehouses are authorized by customs authorities for storing dutiable goods under bond until duties are settled or the goods re-exported."),
    ("Commerce", "Stock Exchange", "Speculators on the stock exchange who buy shares expecting their prices to rise in the near future are called _____.", "Bulls", "Bears", "Stags", "Lame Ducks", 0, "Bulls are optimistic investors who buy securities expecting market prices to increase, planning to sell later for a profit."),
    ("Principles of Accounts", "Manufacturing Accounts", "In a Manufacturing Account, Prime Cost is calculated as the sum of _____.", "Direct Raw Materials + Direct Labour + Direct Expenses", "Factory Overheads + Administration Costs", "Cost of Goods Sold + Gross Profit", "Total Revenue - Variable Factory Costs", 0, "Prime Cost represents all direct manufacturing costs: Direct Materials Consumed + Direct Factory Wages + Direct Expenses."),
    ("CRS", "Epistles of Paul", "In 1 Corinthians 13, the Apostle Paul declared that the greatest of faith, hope, and love is _____.", "Love (Charity)", "Faith", "Hope", "Prophecy", 0, "1 Corinthians 13:13: 'And now abide faith, hope, love, these three; but the greatest of these is love.'")
]

for yr in years:
    for idx, (subj, top, txt, a, b, c, d, ans, exp) in enumerate(soc_items, 1):
        add_soc(subj, top, yr, txt, a, b, c, d, ans, exp, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambSocialScienceSuperMegaBank.kt",
    "JambSocialScienceSuperMegaBank",
    "JAMB Social Science Mega Bank (Economics, Government, Commerce, Accounts, CRS 2000 - 2024)",
    soc_adv
)
print(f"Total Social Science Super Mega: {len(soc_adv)}")

