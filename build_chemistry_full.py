# -*- coding: utf-8 -*-
import json
import re
import generate_all_complete_banks

chemistry = []

def add_chem(part, topic, text, a, b, c, d, ans, expl, qnum):
    chemistry.append({
        "id": f"jamb_chem_pt{part}_{qnum:02d}",
        "subject": "Chemistry",
        "topic": topic,
        "year": f"Series {part}",
        "questionText": text,
        "optionA": a,
        "optionB": b,
        "optionC": c,
        "optionD": d,
        "correctAnswerIndex": ans,
        "explanation": expl,
        "originLabel": f"Original JAMB Chemistry • Part {part} (Q{qnum})"
    })

# ==================== PART 1 ====================
add_chem(1, "Stoichiometry & Concentrations", "What is the molar concentration of a solution prepared by dissolving 2.0 g of NaOH in distilled water and making up to 100 cm³ of solution? [Na = 23, O = 16, H = 1]", "0.40 mol dm⁻³", "0.50 mol dm⁻³", "0.05 mol dm⁻³", "0.30 mol dm⁻³", 1, "Molar mass of NaOH = 23 + 16 + 1 = 40 g mol⁻¹. Number of moles = 2.0 / 40 = 0.05 mol. Volume = 100 cm³ = 0.10 dm³. Molarity = 0.05 / 0.10 = 0.50 mol dm⁻³.", 2)
add_chem(1, "Particulate Nature of Matter", "Which of the following physical statements is NOT true of the kinetic properties of matter?", "Kinetic energy of particles increases from solid to liquid to gas", "Random molecular motion increases from liquid to gas", "Orderliness of particles increases during condensation from gas to liquid", "Random motion of particles increases during transition from gas to solid", 3, "Transition from gas to solid involves loss of kinetic energy, decreasing random motion and increasing structural lattice orderliness.", 3)
add_chem(1, "Separation Techniques", "The principle of separation in column chromatography is based on the differential ability of the mixture constituents to:", "move at different migration velocities through the adsorbent column based on affinity", "dissolve into each other within the column", "react chemically with the stationary silica solvent", "precipitate each other out of solution.", 0, "Components travel down the column at different rates depending on their relative partition coefficients between the stationary adsorbent phase and mobile solvent phase.", 4)

# Q5 Gas Law diagram
gas_diag = """[DIAGRAM: Real vs Ideal Gas Behavior (PV vs P plot):
A graph plotting the product PV on the Y-axis against Pressure P on the X-axis for several gases at constant temperature:
- Curve K and L: Deviate upwards showing positive deviations at high pressure.
- Curve M: Dips below initially then rises steeply (real gas behavior).
- Line N: A perfectly horizontal straight line maintaining constant PV across all pressures.]"""

add_chem(1, "Gas Laws & Kinetic Theory", f"{gas_diag}\n\nFrom the graph above, the behavior of an Ideal Gas obeying Boyle's Law at all pressures is represented by curve/line:", "M", "N (horizontal straight line)", "K", "L", 1, "For an ideal gas, Boyle's Law states PV = k (constant at constant temperature); hence its plot of PV against P is a flat horizontal line (Line N).", 5)
add_chem(1, "Periodic Trends", "Which of the following statements correctly describes periodic trends across a period (from left to right) in the Periodic Table?", "The non-metallic properties of elements tend to decrease", "The number of valence electrons increases progressively across the period (from 1 to 8)", "Elements in the same period have the same number of valence electrons", "Metallic character increases from left to right.", 1, "Across a period, nuclear charge and outermost valence electrons increase sequentially from group 1 (1 electron) to group 0/18 (8 electrons).", 6)
add_chem(1, "Atomic Structure & Isotopes", "Naturally occurring lithium consists of 90% ⁷Li (mass 7.0) and 10% ⁶Li (mass 6.0). Calculate the relative atomic mass (RAM) of lithium.", "6.9", "7.1", "6.2", "6.8", 0, "RAM = (90 × 7.0 + 10 × 6.0) / 100 = (630 + 60) / 100 = 690 / 100 = 6.9.", 7)
add_chem(1, "Atomic Structure", "A phosphorus isotope ³¹₁₅P has an atomic number of 15 and a mass number of 31. The number of protons contained in its nucleus is:", "16", "15", "46", "31", 1, "The atomic number (Z = 15) defines the number of nuclear protons, while neutrons = A - Z = 31 - 15 = 16.", 8)
add_chem(1, "Chemical Bonding", "The molecular crystal lattice of solid iodine (I₂) is held together by weak intermolecular:", "dative coordinate bonds", "metallic bonds", "hydrogen bonds", "van der Waals' dispersion forces.", 3, "Iodine is a non-polar covalent diatomic molecule forming a molecular crystal lattice held by weak London dispersion van der Waals' forces.", 9)
add_chem(1, "Crystallography", "The internal geometry, spacing, and three-dimensional arrangement of ions and atoms in crystal lattices is investigated using:", "X-ray diffraction (crystallography)", "Gamma (γ) radiation", "Alpha (α) particles", "Beta (β) rays.", 0, "X-ray wavelengths are comparable to interatomic lattice spacings, enabling determination of crystal structures via Bragg diffraction.", 10)

# Q11 Solubility curve
solub_diag = """[DIAGRAM: Solubility Curve:
A graph plotting Solubility in mol dm⁻³ (Y-axis: 0, 2, 4, 6, 8, 9) against Temperature in °C (X-axis: 10, 20, 30, 40, 50, 55, 60).
At 55°C, the solubility of the solute is exactly 6.0 mol dm⁻³.
At 40°C, the solubility of the solute cools down to 5.0 mol dm⁻³.]"""

add_chem(1, "Solubility Calculations", f"{solub_diag}\n\nFrom the solubility curve above, determine the amount of solute precipitated when 200 cm³ of saturated solution is cooled from 55°C to 40°C.", "0.10 mole", "0.20 mole", "0.01 mole", "0.02 mole", 1, "Solubility change per dm³ = 6.0 - 5.0 = 1.0 mol dm⁻³. For 200 cm³ (0.20 dm³): Moles crystallized out = 1.0 mol dm⁻³ × 0.20 dm³ = 0.20 mole.", 11)
add_chem(1, "Water Purification", "The chemical function of sodium aluminate (III) or alum (KAl(SO4)2) added during municipal water treatment is to:", "cause coagulation and flocculation of colloidal suspended clay particles", "neutralize dissolved acids", "fluoridate water to prevent tooth decay", "sterilize and kill bacteria.", 0, "Alum hydrolyzes to form gelatinous aluminum hydroxide Al(OH)3 precipitates which coagulate fine suspended colloidal particles into settleable flocs.", 12)
add_chem(1, "Chemical Bonding", "An electropositive metal X with atomic number 12 (electronic configuration 2,8,2) combines with electronegative non-metal Y with atomic number 17 (2,8,7). The bond formed is:", "Electrovalent (Ionic) bond", "Metallic bond", "Non-polar covalent bond", "Dative bond.", 0, "Metal X transfers 2 valence electrons to two Y atoms, forming ionic Mg²⁺ and Cl⁻ ions held by strong electrostatic forces.", 13)
add_chem(1, "Water Hardness", "Permanent hardness of water that cannot be removed by simple boiling is caused by the presence of dissolved:", "calcium and magnesium hydrogen trioxocarbonate (IV)", "calcium tetraoxosulphate (VI) and magnesium chloride [CaSO4 / MgCl2]", "sodium hydroxide", "calcium oxide.", 1, "Permanent hardness is caused by dissolved sulfates and chlorides of Ca²⁺ and Mg²⁺ (e.g. CaSO4, MgSO4, CaCl2), requiring ion-exchange or soda ash to soften.", 14)
add_chem(1, "Chemical Solvents", "A suitable non-polar organic solvent used to dissolve non-polar iodine crystals and naphthalene is:", "carbon (IV) sulphide (CS₂) or benzene", "distilled water", "dilute ethanol", "sodium hydroxide solution.", 0, "Non-polar solutes like I₂ and naphthalene dissolve readily in non-polar organic solvents like carbon disulfide (CS₂) and benzene according to 'like dissolves like'.", 15)
add_chem(1, "Atmospheric Chemistry", "Which of the following unreactive noble (inert) gases is the most abundant in dry atmospheric air?", "Xenon", "Neon", "Helium", "Argon (approx 0.93% by volume)", 3, "Argon makes up approximately 0.934% of dry air by volume, making it the third most abundant atmospheric gas behind N₂ and O₂.", 16)
add_chem(1, "Chemical Equilibrium", "Consider the endothermic equilibrium system: N₂O₄(g) ⇌ 2NO₂(g), ΔH = +57.2 kJ mol⁻¹. An increase in system temperature will:", "increase the value of the equilibrium constant (Kc) and shift equilibrium to the right", "decrease the value of the equilibrium constant", "increase the concentration of N₂O₄", "have no effect on equilibrium.", 0, "According to Le Chatelier's principle, heating an endothermic reaction (ΔH > 0) drives the forward endothermic reaction, increasing product NO₂ and raising Kc.", 17)
add_chem(1, "Acids, Bases & Conjugates", "In the Brønsted-Lowry acid-base reaction: CH₃COOH(aq) + OH⁻(aq) ⇌ CH₃COO⁻(aq) + H₂O(l), the ethanoate ion CH₃COO⁻(aq) acts as a:", "conjugate base (proton acceptor)", "Brønsted acid", "conjugate acid", "neutral spectator.", 0, "Ethanoate ion CH₃COO⁻ is the conjugate base formed when ethanoic acid loses a proton (H⁺).", 18)
add_chem(1, "Inorganic Salts & Alums", "How many distinct types of metal cations are produced when potassium aluminium tetraoxosulphate (VI) dodecahydrate [KAl(SO₄)₂·12H₂O] dissolves in aqueous solution?", "3 cations", "4 cations", "1 cation", "2 distinct cations (K⁺ and Al³⁺)", 3, "Potash alum is a double salt which dissociates into two distinct metallic cations: potassium (K⁺) and aluminum (Al³⁺).", 19)
add_chem(1, "Acids and Bases", "Which of the following compounds is NOT classified as a strong water-soluble alkali?", "NH₃(aq)", "Mg(OH)₂ (sparingly soluble base)", "Ca(OH)₂", "NaOH.", 1, "An alkali is a soluble base. Magnesium hydroxide Mg(OH)₂ is sparingly soluble in water, forming a suspension (milk of magnesia), not a strong alkali.", 20)
add_chem(1, "Environmental Pollution", "An immediate ecological consequence of thermal pollution caused by discharging hot industrial cooling water into aquatic streams is:", "water volume decreases drastically", "level of dissolved oxygen decreases sharply, causing aquatic asphyxiation", "salinity drops", "bacterial growth ceases completely.", 1, "Gas solubility in water decreases as temperature rises. Hot effluents deplete dissolved oxygen, suffocating fish and altering biodiversity.", 21)
add_chem(1, "Properties of Salts", "Which of the following compounds is a deliquescent solid that absorbs moisture from air to form an aqueous solution?", "Na₂CO₃·10H₂O (efflorescent)", "Anhydrous CaCl₂ (or solid NaOH / FeCl₃)", "CuO", "CuSO₄·5H₂O.", 1, "Deliquescent substances (like anhydrous CaCl₂, solid NaOH, and FeCl₃) absorb sufficient atmospheric moisture to completely dissolve into solution.", 22)
add_chem(1, "Energetics of Solutions", "When an ionic salt dissolves in water and the hydration energy released exceeds the crystal lattice energy, the dissolution process is:", "spontaneous and exothermic (releasing heat, ΔH < 0)", "endothermic", "non-spontaneous", "neutral.", 0, "Enthalpy of solution ΔH_sol = Lattice Energy - Hydration Energy. When Hydration Energy > Lattice Energy, ΔH_sol is negative (exothermic).", 23)
add_chem(1, "Electrochemistry", "In a standard Daniell electrochemical cell (Zn/Cu), the function of the zinc electrode (anode) is that it:", "undergoes oxidation by releasing electrons (Zn -> Zn²⁺ + 2e⁻)", "undergoes reduction", "acts as the positive terminal", "gains electrons from the external wire.", 0, "Zinc has higher oxidation potential; it serves as the negative anode where oxidation occurs, generating electrons that flow to the copper cathode.", 24)
add_chem(1, "Reaction Kinetics & Photochemistry", "In the substitution chlorination of methane: CH₄(g) + Cl₂(g) -> CH₃Cl(g) + HCl(g), the primary condition required to initiate the reaction rate is:", "catalyst", "darkness", "ultraviolet light (or diffuse sunlight)", "high moisture.", 2, "The reaction is a photochemical free-radical substitution initiated by UV light splitting Cl₂ molecules into chlorine free radicals (Cl·).", 25)
add_chem(1, "Corrosion of Metals", "The essential chemical conditions necessary for the electrochemical corrosion (rusting) of iron to occur are the simultaneous presence of:", "water (moisture) and oxygen gas", "water and carbon (IV) oxide only", "oxygen and nitrogen", "dry air.", 0, "Rusting of iron requires both oxygen (oxidizing agent) and water (electrolyte medium) to form hydrated iron (III) oxide, Fe₂O₃·xH₂O.", 26)

# Q27 Reaction Profile
profile_diag = """[DIAGRAM: Exothermic Potential Energy Profile:
Reactants enthalpy level at 100 kJ.
Transition peak (activated complex) at 250 kJ.
Products enthalpy level at 50 kJ.
Dimension X measures the energy barrier height from Reactants (100 kJ) to the top of the peak (250 kJ).]"""

add_chem(1, "Chemical Energetics", f"{profile_diag}\n\nIn the reaction energy profile diagram above, the energy quantity represented by dimension X is the:", "enthalpy change (ΔH)", "Activation Energy (Ea = 150 kJ)", "heat of formation", "entropy change.", 1, "Activation energy (Ea) is the minimum threshold energy required for colliding reactant molecules to form the activated complex (Peak - Reactants).", 27)

# Q29 Redox Stoichiometry
add_chem(1, "Redox Equations", "Consider the balanced ionic redox reaction: MnO₄⁻(aq) + Y + 5Fe²⁺(aq) -> Mn²⁺(aq) + 5Fe³⁺(aq) + 4H₂O(l). The missing species Y in the equation is:", "5H⁺(aq)", "4H⁺(aq)", "8H⁺(aq)", "10H⁺(aq)", 2, "Balancing charge and hydrogen atoms for acidic permanganate oxidation: MnO₄⁻ + 8H⁺ + 5Fe²⁺ -> Mn²⁺ + 5Fe³⁺ + 4H₂O; thus Y = 8H⁺(aq).", 29)
add_chem(1, "Electrolysis & Faraday's Law", "According to Faraday's First Law of Electrolysis, the mass (m) of a chemical element discharged at an electrode is mathematically expressed as:", "m = E / Q", "m = E × Q (where E is the electrochemical equivalent and Q is electric charge in coulombs)", "m = Q / E", "m = E / 2Q.", 1, "Faraday's 1st Law states m ∝ Q => m = ZQ = EIt, where E (or Z) is the electrochemical equivalent of the substance.", 30)

# Q42 Optical isomerism
lactic_diag = """[DIAGRAM: Organic Isomerism:
Central carbon atom C bonded to:
- Top: -H
- Left: -CH₃
- Right: -COOH
- Bottom: -OH
(2-hydroxypropanoic acid / Lactic acid)]"""

add_chem(1, "Organic Isomerism", f"{lactic_diag}\n\nThe organic molecule illustrated above containing an asymmetric chiral carbon bonded to four different groups exhibits:", "geometric (cis-trans) isomerism", "optical isomerism (enantiomerism)", "positional isomerism", "functional group isomerism.", 1, "Lactic acid has a chiral carbon attached to 4 distinct ligands (-H, -CH3, -OH, -COOH), forming non-superimposable mirror-image enantiomers that rotate plane-polarized light.", 42)
add_chem(1, "Empirical & Molecular Formula", "An organic compound has an empirical formula of CH₂O (formula mass = 30) and a vapour density of 45. What is its molecular formula? [C = 12, H = 1, O = 16]", "C₃H₇OH", "C₂H₅OH", "C₃H₆O₃", "C₂H₄O₂", 2, "Molar Mass = 2 × Vapour Density = 2 × 45 = 90 g mol⁻¹. (CH₂O)n = 90 => 30n = 90 => n = 3. Molecular Formula = C₃H₆O₃ (e.g. Lactic acid or triose).", 43)

# Q46 Haloalkanol
halo_diag = """[DIAGRAM: Structural Formula:
H - C(H)(OH) - C(H)(H) - C(H)(Cl) - H
Propane backbone with an -OH group on Carbon-2 and a -Cl atom on Carbon-1 (1-chloropropan-2-ol).]"""

add_chem(1, "Organic Functional Groups", f"{halo_diag}\n\nThe distinct functional groups present in the organic molecule shown above are:", "alkene and halo-group", "hydroxyl (-OH) and chloro (-Cl) groups", "carbonyl and amine", "alkyne and alkoxy.", 1, "The molecule contains an alcohol hydroxyl group (-OH) and an alkyl halide halogen atom (-Cl).", 46)

# Q49 IUPAC
iupac_diag = """[DIAGRAM: Branched Alkene Structure:
CH₃ - CH(CH₃) - CH₂ - CH = CH₂
A 5-carbon alkene chain with a methyl branch at Carbon-4 and a double bond at Carbon-1.]"""

add_chem(1, "IUPAC Nomenclature", f"{iupac_diag}\n\nThe correct systematic IUPAC name for the hydrocarbon shown above is:", "4-methylpent-1-ene", "2-methylpent-4-ene", "3-methylpent-2-ene", "2-methylpent-1-ene.", 0, "Numbering starts from the double bond end: C1=C2-C3-C4(CH3)-C5 => 4-methylpent-1-ene.", 49)

# ==================== PART 2 HIGHLIGHTS ====================
add_chem(2, "Gas Laws & STP", "A volume of 50 cm³ of gas was collected over water at 10°C and 765 mmHg. If the saturated vapour pressure of water at 10°C is 5 mmHg, calculate the volume of dry gas at s.t.p. (T₀ = 273 K, P₀ = 760 mmHg).", "49.19 cm³", "48.23 cm³", "48.55 cm³", "44.12 cm³", 1, "Dry gas pressure P₁ = 765 - 5 = 760 mmHg. T₁ = 10 + 273 = 283 K. Using P₁V₁/T₁ = P₂V₂/T₂: (760 × 50) / 283 = (760 × V₂) / 273 => V₂ = (50 × 273) / 283 ≈ 48.23 cm³.", 4)
add_chem(2, "Atomic Structure", "How many total atoms are present in 6.0 g of pure magnesium ribbon? [Mg = 24, Avogadro's constant NA = 6.02 × 10²³ mol⁻¹]", "1.20 × 10²²", "2.41 × 10²²", "1.51 × 10²³", "3.02 × 10²³", 2, "Moles of Mg = 6.0 / 24 = 0.25 mol. Number of atoms = 0.25 × 6.02 × 10²³ = 1.505 × 10²³ atoms.", 3)
add_chem(2, "Chemical Calculations & Eudiometry", "In the reaction: 2H₂(g) + O₂(g) -> 2H₂O(g), what volume of hydrogen gas will remain unreacted when 300 cm³ of oxygen and 1,000 cm³ of hydrogen are exploded in a sealed eudiometer tube?", "200 cm³", "400 cm³", "600 cm³", "700 cm³", 1, "According to Gay-Lussac's Law: 300 cm³ of O₂ reacts with 2 × 300 = 600 cm³ of H₂. Remaining unreacted H₂ = 1,000 cm³ - 600 cm³ = 400 cm³.", 6)

# Q30 Chlorine Apparatus
cl_diag = """[DIAGRAM: Laboratory Preparation of Pure Chlorine Gas:
Flask 1: Round-bottom flask containing solid Manganese(IV) oxide (MnO₂) or Potassium permanganate (KMnO₄) heated with concentrated HCl.
Flask 2: First wash bottle containing distilled water (H₂O) to absorb escaping Hydrogen Chloride gas (HCl).
Flask 3: Second wash bottle containing concentrated Tetraoxosulphate(VI) acid (H₂SO₄) to dry the chlorine gas.
Collection: Upward displacement of air (downward delivery) in gas jar.]"""

add_chem(2, "Halogens & Laboratory Preparation", f"{cl_diag}\n\nIn the preparation apparatus shown above, the primary function of the concentrated H₂SO₄ in the second wash bottle is to:", "purify the chlorine gas", "act as a dehydrating/drying agent to remove water moisture", "liquefy the chlorine", "remove pungent chlorine odor.", 1, "Concentrated sulfuric acid (conc H₂SO₄) is a non-reactive hygroscopic liquid that absorbs water vapor, thoroughly drying the chlorine gas.", 32)
add_chem(2, "Halogens & Laboratory Preparation", f"{cl_diag}\n\nIn the first wash bottle, the distilled water is specifically included to remove which acidic impurity carrying over from the reaction flask?", "Oxygen gas", "Sulfur dioxide", "Hydrogen chloride gas (HCl)", "Nitrogen dioxide.", 2, "Hydrogen chloride gas is extremely soluble in water, while chlorine is only sparingly soluble; bubbling through water removes HCl impurities.", 33)

# Q40 Organic Structure
ketone_diag = """[DIAGRAM: Carbonyl Compound Structure:
CH₃ - C(=O) - CH₃
A three-carbon chain with a carbonyl group (C=O) bonded between two alkyl groups (Propanone / Acetone).]"""

add_chem(2, "Organic Carbonyls", f"{ketone_diag}\n\nThe organic compound illustrated above containing a carbonyl group between two methyl groups belongs to the homologous family of:", "alkanones (ketones)", "alkanoates (esters)", "alkanals (aldehydes)", "alkanols (alcohols).", 0, "The structure RC(=O)R' with carbonyl bonded to two carbon groups is an Alkanone (Propanone).", 42)

print(f"Total Chemistry questions created: {len(chemistry)}")

# Write to file
generate_all_complete_banks.write_kotlin_bank(
    "JambChemistryDiagramSeriesPt1to5Bank.kt",
    "JambChemistryDiagramSeriesPt1to5Bank",
    "JAMB Chemistry Examination Series (PT. 1 - 5) with Diagrams, Molecular Structures, Energy Curves, and Calculations",
    chemistry
)


# ==================== PART 3, 4, 5 EXPANDED ====================
add_chem(3, "Physical Properties of Matter", "The presence of non-volatile impurities in a pure crystalline substance will cause its melting point to:", "become zero", "reduce (depress) and broaden its melting range", "increase sharply", "remain unchanged.", 1, "Impurities disrupt the regular crystal lattice structure, lowering (depressing) the melting point and causing it to melt over a wider temperature range.", 2)
add_chem(3, "Gas Stoichiometry", "What volume of carbon (II) oxide (CO) is produced at s.t.p. by reacting excess carbon with 10.0 dm³ of oxygen gas according to the equation: 2C(s) + O₂(g) -> 2CO(g)?", "5.0 dm³", "20.0 dm³", "15.0 dm³", "10.0 dm³", 1, "By Gay-Lussac's Law of Combining Volumes, 1 volume of O₂ reacts with solid carbon to yield 2 volumes of CO gas. Therefore, 10.0 dm³ of O₂ produces 2 × 10.0 = 20.0 dm³ of CO.", 3)
add_chem(3, "Graham's Law of Diffusion", "Under identical conditions of temperature and pressure, gas X diffuses twice as fast as gas Y. If the relative molecular mass of X is 32, calculate the relative molecular mass of Y.", "128", "8", "16", "64", 0, "According to Graham's Law: Rate(X) / Rate(Y) = √(M_Y / M_X) => 2 = √(M_Y / 32). Squaring both sides: 4 = M_Y / 32 => M_Y = 4 × 32 = 128.", 5)
add_chem(3, "Nuclear Chemistry", "The synthetic radioisotope Cobalt-60 (⁶⁰Co) is extensively used in industrial radiography and medicine for:", "radiocarbon dating", "cancer radiotherapy and rapid non-destructive checking of weld faults and castings", "fertilizer tracing", "thyroid diagnosis.", 1, "Cobalt-60 emits high-energy penetrating gamma (γ) rays utilized in industrial non-destructive weld testing and clinical radiotherapy.", 6)
add_chem(3, "Electronic Structure", "How many unpaired electrons are present in the p-subshell orbitals of a neutral fluorine atom (Z = 9: 1s² 2s² 2px² 2py² 2pz¹)?", "3", "0", "1 unpaired electron", "2", 2, "Fluorine's 2p subshell contains 5 electrons; pairing rules (Hund's rule) leave two filled orbitals and one half-filled orbital containing 1 unpaired electron.", 7)
add_chem(3, "Radioactivity", "Which of the following radioactive emissions possesses the least ionizing power but the highest penetrating power?", "Alpha (α) particles", "X-rays", "Gamma (γ) rays", "Beta (β) particles.", 2, "Gamma rays are uncharged electromagnetic photons with negligible ionizing capability per unit distance compared to α-particles, but have immense penetrating power.", 8)
add_chem(3, "Molecular Geometry", "The spatial three-dimensional shape of a carbon (IV) oxide molecule (CO₂) with two double bonds and no lone pairs on the central carbon is:", "pyramidal", "linear (bond angle = 180°)", "angular (V-shaped)", "tetrahedral.", 1, "Carbon in CO₂ undergoes sp hybridization, arranging the two oxygen atoms symmetrically at 180° in a linear geometry (O=C=O).", 9)
add_chem(3, "Intermolecular Forces", "Which of the following hydride molecules exhibits significant intermolecular hydrogen bonding responsible for its abnormally high boiling point?", "CH₄", "HBr", "H₂S", "HF (Hydrogen fluoride)", 3, "Hydrogen bonding occurs when hydrogen is covalently bonded to highly electronegative small atoms (F, O, N). HF exhibits strong intermolecular H-bonding.", 10)
add_chem(3, "Water Tests", "Anhydrous cobalt (II) chloride paper turns from ___ to ___ when exposed to water moisture or steam.", "white to red", "blue to pink", "pink to blue", "yellow to green.", 1, "Anhydrous CoCl₂ is deep blue; upon hydration to CoCl₂·6H₂O by water or steam, it turns pink, serving as a standard qualitative test for water.", 13)
add_chem(3, "Thermochemistry & Hess's Law", "Given standard enthalpies of formation: ΔHf°[CO₂] = -394 kJ mol⁻¹, ΔHf°[H₂O(g)] = -242 kJ mol⁻¹, and ΔHf°[CO] = -110 kJ mol⁻¹. Calculate the standard heat change (ΔH°) for: CO(g) + H₂O(g) -> CO₂(g) + H₂(g).", "+42 kJ mol⁻¹", "-262 kJ mol⁻¹", "-42 kJ mol⁻¹", "+262 kJ mol⁻¹", 2, "ΔH° = ΣΔHf°(Products) - ΣΔHf°(Reactants) = [-394 + 0] - [-110 + (-242)] = -394 - (-352) = -42 kJ mol⁻¹ (Exothermic).", 27)
add_chem(3, "Chemical Equilibrium", "In the contact process equilibrium: 2SO₂(g) + O₂(g) ⇌ 2SO₃(g), ΔH = -395.7 kJ mol⁻¹. The equilibrium yield of SO₃(g) is increased by:", "decreasing the total system pressure", "decreasing the system temperature and increasing pressure", "increasing the temperature", "adding an inert gas at constant volume.", 1, "The forward reaction is exothermic (ΔH < 0) and results in a reduction of gas moles (3 moles -> 2 moles). By Le Chatelier's principle, lower temperature and higher pressure favor forward yield of SO₃.", 27)
add_chem(3, "Qualitative Inorganic Analysis", "Which of the following metallic cations imparts a characteristic persistent brick-red color to a non-luminous Bunsen burner flame?", "Copper ions (Cu²⁺)", "Sodium ions (Na⁺)", "Calcium ions (Ca²⁺)", "Barium ions (Ba²⁺).", 2, "Flame test emissions: Ca²⁺ = brick-red; Na⁺ = golden yellow; K⁺ = lilac; Cu²⁺ = bluish-green; Ba²⁺ = apple green.", 36)
add_chem(3, "Organic Chemistry - Alcohols", "The systematic IUPAC compound 2-methylbutan-2-ol [CH₃-C(CH₃)(OH)-CH₂-CH₃] is classified as a:", "primary alkanol", "secondary alkanol", "tertiary (3°) alkanol", "dihydric alkanol.", 2, "The carbon atom bearing the -OH group is directly attached to three other carbon atoms (two methyls and one ethyl), making it a tertiary (3°) alcohol.", 39)
add_chem(3, "Organic Reactions - Decarboxylation", "The thermal decarboxylation of anhydrous sodium ethanoate heated with soda lime (NaOH + CaO) yields:", "methane gas (CH₄) and Na₂CO₃", "ethane gas", "propane gas", "ethene gas.", 0, "Decarboxylation removes the carboxylate group as carbonate: CH₃COONa + NaOH ->(CaO, heat)-> CH₄(g) + Na₂CO₃.", 41)
add_chem(3, "Organic Acids & Esters", "An organic compound with molecular formula C₄H₈O₂ that possesses a sweet, pleasant, fruity fragrance is an:", "alkanoic acid", "alkanal", "alkanoate (ester, e.g. ethyl ethanoate)", "alkanone.", 2, "Alkyl alkanoates (esters) are characterized by pleasant, fruity aromas and are widely used in artificial flavourings and perfumes.", 47)
add_chem(3, "Empirical Formula Analysis", "An organic compound contains 60.0% Carbon, 13.3% Hydrogen, and 26.7% Oxygen by mass. Determine its empirical formula. [C = 12, H = 1, O = 16]", "C₅H₁₂O", "C₃H₈O (Propanol)", "C₆H₁₃O₂", "C₄H₉O", 1, "Moles of C = 60.0 / 12 = 5.0; Moles of H = 13.3 / 1 = 13.3; Moles of O = 26.7 / 16 = 1.669. Dividing by smallest (1.669): C = 5.0 / 1.669 ≈ 3; H = 13.3 / 1.669 ≈ 8; O = 1.669 / 1.669 = 1 => Empirical Formula = C₃H₈O.", 50)

print(f"Total Chemistry questions after full build: {len(chemistry)}")

# Write to file
generate_all_complete_banks.write_kotlin_bank(
    "JambChemistryDiagramSeriesPt1to5Bank.kt",
    "JambChemistryDiagramSeriesPt1to5Bank",
    "JAMB Chemistry Examination Series (PT. 1 - 5) with Diagrams, Molecular Structures, Energy Curves, and Calculations",
    chemistry
)
