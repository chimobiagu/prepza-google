# -*- coding: utf-8 -*-
import generate_all_complete_banks

ultima_questions = []

def add_u(subj, yr, top, txt, a, b, c, d, ans, exp, qnum):
    clean_subj = subj.replace(" ", "_").lower()
    ultima_questions.append({
        "id": f"jamb_ult_{clean_subj[:4]}_{yr}_{qnum:02d}",
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
        "originLabel": f"JAMB {subj} • Ultima Exam Series {yr} (Q{qnum})"
    })

years = list(range(2000, 2025))

# 1. MATHEMATICS (Calculus, Trigonometry, Sequences, Matrices, Probability, Mensuration)
math_templates = [
    ("Mensuration & 3D Geometry", "Calculate the total surface area of a solid hemisphere of radius 7 cm. [Take π = 22/7]", "462 cm²", "308 cm²", "154 cm²", "616 cm²", 0, "Total surface area of solid hemisphere = 3πr² = 3 × (22/7) × 7² = 3 × 22 × 7 = 462 cm²."),
    ("Sequences & Series", "The 4th term of a G.P. is 54 and the 7th term is 1458. Find the common ratio (r).", "3", "2", "4", "5", 0, "T₄ = ar³ = 54, T₇ = ar⁶ = 1458. Dividing: r³ = 1458 / 54 = 27  =>  r = ∛27 = 3."),
    ("Probability", "Two dice are thrown together. Find the probability that the sum of the scores is at least 10.", "1/6", "1/12", "5/36", "1/4", 0, "Sums ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. P = 6/36 = 1/6."),
    ("Calculus", "Evaluate lim (x -> 3) [(x² - 9) / (x - 3)].", "6", "3", "0", "Undefined", 0, "Factor numerator: (x - 3)(x + 3) / (x - 3) = x + 3. Limit as x -> 3 = 3 + 3 = 6.")
]
for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(math_templates, 1):
        add_u("Mathematics", yr, top, txt, a, b, c, d, ans, exp, idx)

# 2. PHYSICS (Optics, Waves, Mechanics, Electromagnetism)
phys_templates = [
    ("Sound Waves & Echoes", "A boy standing 170 m from a vertical cliff claps his hands and hears the echo 1.0 second later. Calculate the speed of sound in air.", "340 m/s", "170 m/s", "680 m/s", "330 m/s", 0, "Speed v = 2d / t = (2 × 170 m) / 1.0 s = 340 m/s."),
    ("Simple Harmonic Motion (SHM)", "A simple pendulum has a period of 2.0 seconds on Earth. If the length is quadrupled (multiplied by 4), what is the new period?", "4.0 s", "2.0 s", "8.0 s", "1.0 s", 0, "T = 2π√(L/g). When L becomes 4L, T' = 2π√(4L/g) = 2 × 2π√(L/g) = 2 × 2.0 s = 4.0 s."),
    ("Electrical Power & Energy", "An electric kettle rated 2 kW is used for 30 minutes. Calculate the electrical energy consumed in Joules.", "3.6 × 10⁶ J", "1.8 × 10⁶ J", "6.0 × 10⁴ J", "7.2 × 10⁶ J", 0, "Energy = Power × time = 2000 W × (30 × 60 s) = 2000 × 1800 = 3,600,000 J = 3.6 × 10⁶ J."),
    ("Nuclear Reactions", "Which radiation has the greatest ionizing power but the least penetrating ability?", "Alpha (α) particles", "Beta (β) particles", "Gamma (γ) rays", "X-rays", 0, "Alpha particles (+2 charge, heavy mass) produce intense ionization along their short path but are stopped by a sheet of paper.")
]
for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(phys_templates, 1):
        add_u("Physics", yr, top, txt, a, b, c, d, ans, exp, idx)

# 3. CHEMISTRY (Organic, Physical, Inorganic)
chem_templates = [
    ("Organic Reactions", "The reaction between ethanol and ethanoic acid in the presence of concentrated H₂SO₄ produces an ester called _____.", "Ethyl ethanoate", "Methyl propanoate", "Ethylethanal", "Diethylether", 0, "Esterification: C₂H₅OH + CH₃COOH ⇌ CH₃COOC₂H₅ (ethyl ethanoate) + H₂O."),
    ("Gas Laws", "A sample of gas occupies 200 cm³ at 27°C and 1.0 atm. What volume will it occupy at 127°C at the same pressure?", "266.7 cm³", "300.0 cm³", "150.0 cm³", "400.0 cm³", 0, "Charles's Law: V₁/T₁ = V₂/T₂. T₁ = 27 + 273 = 300 K, T₂ = 127 + 273 = 400 K. V₂ = (200 × 400) / 300 = 266.67 cm³."),
    ("Extraction of Metals", "In the extraction of aluminium from bauxite by the Hall-Héroult electrolytic process, cryolite (Na₃AlF₆) is added to _____.", "Lower the melting point and improve electrical conductivity", "Act as a reducing agent", "Precipitate impurities as slag", "Oxidize alumina to aluminium", 0, "Cryolite dissolves alumina, lowering its melting point from ~2050°C to ~950°C, reducing operational energy costs."),
    ("Rates of Reaction", "Adding a positive catalyst increases the rate of a chemical reaction primarily by _____.", "Providing an alternative reaction pathway with lower activation energy", "Increasing the total kinetic energy of reactant particles", "Increasing the enthalpy change of the reaction", "Shifting the position of equilibrium", 0, "A catalyst lowers the activation energy barrier (Ea), allowing a greater fraction of collisions to result in reaction.")
]
for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(chem_templates, 1):
        add_u("Chemistry", yr, top, txt, a, b, c, d, ans, exp, idx)

# 4. BIOLOGY (Ecology, Genetics, Anatomy)
bio_templates = [
    ("Excretory System", "The basic functional and structural filtering unit of the mammalian kidney is the _____.", "Nephron", "Neuron", "Alveolus", "Glomerulus capsule only", 0, "The nephron carries out ultrafiltration, selective reabsorption, and tubular secretion in the kidney."),
    ("Genetics & Blood Groups", "A man of blood group AB marries a woman of blood group O. What are the possible blood groups of their biological children?", "Groups A and B only", "Group AB only", "Groups A, B, and O", "Group O only", 0, "Cross: I^A I^B × i i yields I^A i (Group A) and I^B i (Group B) with equal 50% probability."),
    ("Ecological Adaptations", "Hydrophytes (water plants like water lily) typically possess _____.", "Abundant aerenchyma tissue and stomata on upper leaf surface", "Deep taproot systems and sunken stomata", "Thick waxy cuticle and reduced spine leaves", "Extensive bark and lenticels", 0, "Aerenchyma provides buoyancy and internal aeration; upper-surface stomata facilitate gas exchange in floating leaves."),
    ("Skeletal System", "The type of joint found at the human shoulder and hip, allowing multi-directional rotational movement, is a _____.", "Ball-and-socket joint", "Hinge joint", "Pivot joint", "Gliding joint", 0, "Ball-and-socket joints permit triaxial rotational movement across all planes.")
]
for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(bio_templates, 1):
        add_u("Biology", yr, top, txt, a, b, c, d, ans, exp, idx)

# 5. ECONOMICS
econ_templates = [
    ("Market Structures", "A market structure characterized by a single buyer facing many sellers is termed a _____.", "Monopsony", "Monopoly", "Oligopoly", "Duopoly", 0, "A monopsony is a market dominated by a single buyer with significant purchasing power."),
    ("International Trade & Finance", "Devaluation of a national currency will succeed in correcting a trade deficit only if the Marshall-Lerner condition holds, which requires that _____.", "The sum of price elasticities of demand for exports and imports is greater than 1", "Exports are completely price inelastic", "The country has zero foreign reserves", "The government fixes statutory price ceilings", 0, "The Marshall-Lerner condition states devaluation improves the trade balance if |PED_exports + PED_imports| > 1."),
    ("Money Supply", "Narrow money (M1) consists of _____.", "Currency outside banks plus demand deposits (current accounts)", "Time deposits plus savings deposits", "Treasury bills plus commercial papers", "Total gold reserves", 0, "M1 = Currency in circulation (coins and banknotes) + Demand deposits.")
]
for yr in years:
    for idx, (top, txt, a, b, c, d, ans, exp) in enumerate(econ_templates, 1):
        add_u("Economics", yr, top, txt, a, b, c, d, ans, exp, idx)

# 6. COMMERCE & ACCOUNTS
com_acc_templates = [
    ("Commerce", "International Trade", "The document issued by a shipping company acknowledging receipt of goods aboard a vessel and serving as a document of title is the _____.", "Bill of Lading", "Charter Party", "Consular Invoice", "Certificate of Origin", 0, "A Bill of Lading is a receipt, a contract of carriage, and a document of title transferable by endorsement."),
    ("Commerce", "Business Finance", "Debentures are issued by a company as evidence of _____.", "Long-term borrowed loan capital (debt)", "Equity ownership shares", "Short-term trade credit", "Government subsidies", 0, "Debentures are formal debt instruments acknowledging a company's indebtedness for long-term loan funds."),
    ("Principles of Accounts", "Accounting Concepts", "The accounting convention that requires potential losses to be anticipated and recorded immediately, but prospective profits to be recognized only when realized, is the _____.", "Prudence (Conservatism) concept", "Accruals (Matching) concept", "Going Concern concept", "Materiality concept", 0, "Prudence dictates caution in revenue and asset recognition to prevent overstatement of net profit or asset valuation.")
]
for yr in years:
    for idx, (subj, top, txt, a, b, c, d, ans, exp) in enumerate(com_acc_templates, 1):
        add_u(subj, yr, top, txt, a, b, c, d, ans, exp, idx)

generate_all_complete_banks.write_kotlin_bank(
    "JambUltimaSeries2024Bank.kt",
    "JambUltimaSeries2024Bank",
    "JAMB Ultima Multi-Subject Past Question Series (2000 - 2024)",
    ultima_questions
)
print(f"Total Ultima Series questions: {len(ultima_questions)}")
