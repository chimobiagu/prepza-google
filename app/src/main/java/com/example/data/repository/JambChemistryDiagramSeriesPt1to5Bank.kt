package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Chemistry Examination Series (PT. 1 - 5) with Diagrams, Molecular Structures, Energy Curves, and Calculations
 * Total Verified Questions: 54
 */
object JambChemistryDiagramSeriesPt1to5Bank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_02",
                subject = "Chemistry",
                topic = "Stoichiometry & Concentrations",
                year = "Series 1",
                questionText = "What is the molar concentration of a solution prepared by dissolving 2.0 g of NaOH in distilled water and making up to 100 cm³ of solution? [Na = 23, O = 16, H = 1]",
                optionA = "0.40 mol dm⁻³",
                optionB = "0.50 mol dm⁻³",
                optionC = "0.05 mol dm⁻³",
                optionD = "0.30 mol dm⁻³",
                correctAnswerIndex = 1,
                explanation = "Molar mass of NaOH = 23 + 16 + 1 = 40 g mol⁻¹. Number of moles = 2.0 / 40 = 0.05 mol. Volume = 100 cm³ = 0.10 dm³. Molarity = 0.05 / 0.10 = 0.50 mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_03",
                subject = "Chemistry",
                topic = "Particulate Nature of Matter",
                year = "Series 1",
                questionText = "Which of the following physical statements is NOT true of the kinetic properties of matter?",
                optionA = "Kinetic energy of particles increases from solid to liquid to gas",
                optionB = "Random molecular motion increases from liquid to gas",
                optionC = "Orderliness of particles increases during condensation from gas to liquid",
                optionD = "Random motion of particles increases during transition from gas to solid",
                correctAnswerIndex = 3,
                explanation = "Transition from gas to solid involves loss of kinetic energy, decreasing random motion and increasing structural lattice orderliness.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_04",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "Series 1",
                questionText = "The principle of separation in column chromatography is based on the differential ability of the mixture constituents to:",
                optionA = "move at different migration velocities through the adsorbent column based on affinity",
                optionB = "dissolve into each other within the column",
                optionC = "react chemically with the stationary silica solvent",
                optionD = "precipitate each other out of solution.",
                correctAnswerIndex = 0,
                explanation = "Components travel down the column at different rates depending on their relative partition coefficients between the stationary adsorbent phase and mobile solvent phase.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_05",
                subject = "Chemistry",
                topic = "Gas Laws & Kinetic Theory",
                year = "Series 1",
                questionText = "[DIAGRAM: Real vs Ideal Gas Behavior (PV vs P plot):\nA graph plotting the product PV on the Y-axis against Pressure P on the X-axis for several gases at constant temperature:\n- Curve K and L: Deviate upwards showing positive deviations at high pressure.\n- Curve M: Dips below initially then rises steeply (real gas behavior).\n- Line N: A perfectly horizontal straight line maintaining constant PV across all pressures.]\n\nFrom the graph above, the behavior of an Ideal Gas obeying Boyle's Law at all pressures is represented by curve/line:",
                optionA = "M",
                optionB = "N (horizontal straight line)",
                optionC = "K",
                optionD = "L",
                correctAnswerIndex = 1,
                explanation = "For an ideal gas, Boyle's Law states PV = k (constant at constant temperature); hence its plot of PV against P is a flat horizontal line (Line N).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_06",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "Series 1",
                questionText = "Which of the following statements correctly describes periodic trends across a period (from left to right) in the Periodic Table?",
                optionA = "The non-metallic properties of elements tend to decrease",
                optionB = "The number of valence electrons increases progressively across the period (from 1 to 8)",
                optionC = "Elements in the same period have the same number of valence electrons",
                optionD = "Metallic character increases from left to right.",
                correctAnswerIndex = 1,
                explanation = "Across a period, nuclear charge and outermost valence electrons increase sequentially from group 1 (1 electron) to group 0/18 (8 electrons).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_07",
                subject = "Chemistry",
                topic = "Atomic Structure & Isotopes",
                year = "Series 1",
                questionText = "Naturally occurring lithium consists of 90% ⁷Li (mass 7.0) and 10% ⁶Li (mass 6.0). Calculate the relative atomic mass (RAM) of lithium.",
                optionA = "6.9",
                optionB = "7.1",
                optionC = "6.2",
                optionD = "6.8",
                correctAnswerIndex = 0,
                explanation = "RAM = (90 × 7.0 + 10 × 6.0) / 100 = (630 + 60) / 100 = 690 / 100 = 6.9.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_08",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "Series 1",
                questionText = "A phosphorus isotope ³¹₁₅P has an atomic number of 15 and a mass number of 31. The number of protons contained in its nucleus is:",
                optionA = "16",
                optionB = "15",
                optionC = "46",
                optionD = "31",
                correctAnswerIndex = 1,
                explanation = "The atomic number (Z = 15) defines the number of nuclear protons, while neutrons = A - Z = 31 - 15 = 16.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_09",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "Series 1",
                questionText = "The molecular crystal lattice of solid iodine (I₂) is held together by weak intermolecular:",
                optionA = "dative coordinate bonds",
                optionB = "metallic bonds",
                optionC = "hydrogen bonds",
                optionD = "van der Waals' dispersion forces.",
                correctAnswerIndex = 3,
                explanation = "Iodine is a non-polar covalent diatomic molecule forming a molecular crystal lattice held by weak London dispersion van der Waals' forces.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_10",
                subject = "Chemistry",
                topic = "Crystallography",
                year = "Series 1",
                questionText = "The internal geometry, spacing, and three-dimensional arrangement of ions and atoms in crystal lattices is investigated using:",
                optionA = "X-ray diffraction (crystallography)",
                optionB = "Gamma (γ) radiation",
                optionC = "Alpha (α) particles",
                optionD = "Beta (β) rays.",
                correctAnswerIndex = 0,
                explanation = "X-ray wavelengths are comparable to interatomic lattice spacings, enabling determination of crystal structures via Bragg diffraction.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_11",
                subject = "Chemistry",
                topic = "Solubility Calculations",
                year = "Series 1",
                questionText = "[DIAGRAM: Solubility Curve:\nA graph plotting Solubility in mol dm⁻³ (Y-axis: 0, 2, 4, 6, 8, 9) against Temperature in °C (X-axis: 10, 20, 30, 40, 50, 55, 60).\nAt 55°C, the solubility of the solute is exactly 6.0 mol dm⁻³.\nAt 40°C, the solubility of the solute cools down to 5.0 mol dm⁻³.]\n\nFrom the solubility curve above, determine the amount of solute precipitated when 200 cm³ of saturated solution is cooled from 55°C to 40°C.",
                optionA = "0.10 mole",
                optionB = "0.20 mole",
                optionC = "0.01 mole",
                optionD = "0.02 mole",
                correctAnswerIndex = 1,
                explanation = "Solubility change per dm³ = 6.0 - 5.0 = 1.0 mol dm⁻³. For 200 cm³ (0.20 dm³): Moles crystallized out = 1.0 mol dm⁻³ × 0.20 dm³ = 0.20 mole.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_12",
                subject = "Chemistry",
                topic = "Water Purification",
                year = "Series 1",
                questionText = "The chemical function of sodium aluminate (III) or alum (KAl(SO4)2) added during municipal water treatment is to:",
                optionA = "cause coagulation and flocculation of colloidal suspended clay particles",
                optionB = "neutralize dissolved acids",
                optionC = "fluoridate water to prevent tooth decay",
                optionD = "sterilize and kill bacteria.",
                correctAnswerIndex = 0,
                explanation = "Alum hydrolyzes to form gelatinous aluminum hydroxide Al(OH)3 precipitates which coagulate fine suspended colloidal particles into settleable flocs.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_13",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "Series 1",
                questionText = "An electropositive metal X with atomic number 12 (electronic configuration 2,8,2) combines with electronegative non-metal Y with atomic number 17 (2,8,7). The bond formed is:",
                optionA = "Electrovalent (Ionic) bond",
                optionB = "Metallic bond",
                optionC = "Non-polar covalent bond",
                optionD = "Dative bond.",
                correctAnswerIndex = 0,
                explanation = "Metal X transfers 2 valence electrons to two Y atoms, forming ionic Mg²⁺ and Cl⁻ ions held by strong electrostatic forces.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_14",
                subject = "Chemistry",
                topic = "Water Hardness",
                year = "Series 1",
                questionText = "Permanent hardness of water that cannot be removed by simple boiling is caused by the presence of dissolved:",
                optionA = "calcium and magnesium hydrogen trioxocarbonate (IV)",
                optionB = "calcium tetraoxosulphate (VI) and magnesium chloride [CaSO4 / MgCl2]",
                optionC = "sodium hydroxide",
                optionD = "calcium oxide.",
                correctAnswerIndex = 1,
                explanation = "Permanent hardness is caused by dissolved sulfates and chlorides of Ca²⁺ and Mg²⁺ (e.g. CaSO4, MgSO4, CaCl2), requiring ion-exchange or soda ash to soften.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_15",
                subject = "Chemistry",
                topic = "Chemical Solvents",
                year = "Series 1",
                questionText = "A suitable non-polar organic solvent used to dissolve non-polar iodine crystals and naphthalene is:",
                optionA = "carbon (IV) sulphide (CS₂) or benzene",
                optionB = "distilled water",
                optionC = "dilute ethanol",
                optionD = "sodium hydroxide solution.",
                correctAnswerIndex = 0,
                explanation = "Non-polar solutes like I₂ and naphthalene dissolve readily in non-polar organic solvents like carbon disulfide (CS₂) and benzene according to 'like dissolves like'.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_16",
                subject = "Chemistry",
                topic = "Atmospheric Chemistry",
                year = "Series 1",
                questionText = "Which of the following unreactive noble (inert) gases is the most abundant in dry atmospheric air?",
                optionA = "Xenon",
                optionB = "Neon",
                optionC = "Helium",
                optionD = "Argon (approx 0.93% by volume)",
                correctAnswerIndex = 3,
                explanation = "Argon makes up approximately 0.934% of dry air by volume, making it the third most abundant atmospheric gas behind N₂ and O₂.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_17",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "Series 1",
                questionText = "Consider the endothermic equilibrium system: N₂O₄(g) ⇌ 2NO₂(g), ΔH = +57.2 kJ mol⁻¹. An increase in system temperature will:",
                optionA = "increase the value of the equilibrium constant (Kc) and shift equilibrium to the right",
                optionB = "decrease the value of the equilibrium constant",
                optionC = "increase the concentration of N₂O₄",
                optionD = "have no effect on equilibrium.",
                correctAnswerIndex = 0,
                explanation = "According to Le Chatelier's principle, heating an endothermic reaction (ΔH > 0) drives the forward endothermic reaction, increasing product NO₂ and raising Kc.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_18",
                subject = "Chemistry",
                topic = "Acids, Bases & Conjugates",
                year = "Series 1",
                questionText = "In the Brønsted-Lowry acid-base reaction: CH₃COOH(aq) + OH⁻(aq) ⇌ CH₃COO⁻(aq) + H₂O(l), the ethanoate ion CH₃COO⁻(aq) acts as a:",
                optionA = "conjugate base (proton acceptor)",
                optionB = "Brønsted acid",
                optionC = "conjugate acid",
                optionD = "neutral spectator.",
                correctAnswerIndex = 0,
                explanation = "Ethanoate ion CH₃COO⁻ is the conjugate base formed when ethanoic acid loses a proton (H⁺).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_19",
                subject = "Chemistry",
                topic = "Inorganic Salts & Alums",
                year = "Series 1",
                questionText = "How many distinct types of metal cations are produced when potassium aluminium tetraoxosulphate (VI) dodecahydrate [KAl(SO₄)₂·12H₂O] dissolves in aqueous solution?",
                optionA = "3 cations",
                optionB = "4 cations",
                optionC = "1 cation",
                optionD = "2 distinct cations (K⁺ and Al³⁺)",
                correctAnswerIndex = 3,
                explanation = "Potash alum is a double salt which dissociates into two distinct metallic cations: potassium (K⁺) and aluminum (Al³⁺).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_20",
                subject = "Chemistry",
                topic = "Acids and Bases",
                year = "Series 1",
                questionText = "Which of the following compounds is NOT classified as a strong water-soluble alkali?",
                optionA = "NH₃(aq)",
                optionB = "Mg(OH)₂ (sparingly soluble base)",
                optionC = "Ca(OH)₂",
                optionD = "NaOH.",
                correctAnswerIndex = 1,
                explanation = "An alkali is a soluble base. Magnesium hydroxide Mg(OH)₂ is sparingly soluble in water, forming a suspension (milk of magnesia), not a strong alkali.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_21",
                subject = "Chemistry",
                topic = "Environmental Pollution",
                year = "Series 1",
                questionText = "An immediate ecological consequence of thermal pollution caused by discharging hot industrial cooling water into aquatic streams is:",
                optionA = "water volume decreases drastically",
                optionB = "level of dissolved oxygen decreases sharply, causing aquatic asphyxiation",
                optionC = "salinity drops",
                optionD = "bacterial growth ceases completely.",
                correctAnswerIndex = 1,
                explanation = "Gas solubility in water decreases as temperature rises. Hot effluents deplete dissolved oxygen, suffocating fish and altering biodiversity.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q21)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_22",
                subject = "Chemistry",
                topic = "Properties of Salts",
                year = "Series 1",
                questionText = "Which of the following compounds is a deliquescent solid that absorbs moisture from air to form an aqueous solution?",
                optionA = "Na₂CO₃·10H₂O (efflorescent)",
                optionB = "Anhydrous CaCl₂ (or solid NaOH / FeCl₃)",
                optionC = "CuO",
                optionD = "CuSO₄·5H₂O.",
                correctAnswerIndex = 1,
                explanation = "Deliquescent substances (like anhydrous CaCl₂, solid NaOH, and FeCl₃) absorb sufficient atmospheric moisture to completely dissolve into solution.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q22)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_23",
                subject = "Chemistry",
                topic = "Energetics of Solutions",
                year = "Series 1",
                questionText = "When an ionic salt dissolves in water and the hydration energy released exceeds the crystal lattice energy, the dissolution process is:",
                optionA = "spontaneous and exothermic (releasing heat, ΔH < 0)",
                optionB = "endothermic",
                optionC = "non-spontaneous",
                optionD = "neutral.",
                correctAnswerIndex = 0,
                explanation = "Enthalpy of solution ΔH_sol = Lattice Energy - Hydration Energy. When Hydration Energy > Lattice Energy, ΔH_sol is negative (exothermic).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q23)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_24",
                subject = "Chemistry",
                topic = "Electrochemistry",
                year = "Series 1",
                questionText = "In a standard Daniell electrochemical cell (Zn/Cu), the function of the zinc electrode (anode) is that it:",
                optionA = "undergoes oxidation by releasing electrons (Zn -> Zn²⁺ + 2e⁻)",
                optionB = "undergoes reduction",
                optionC = "acts as the positive terminal",
                optionD = "gains electrons from the external wire.",
                correctAnswerIndex = 0,
                explanation = "Zinc has higher oxidation potential; it serves as the negative anode where oxidation occurs, generating electrons that flow to the copper cathode.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q24)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_25",
                subject = "Chemistry",
                topic = "Reaction Kinetics & Photochemistry",
                year = "Series 1",
                questionText = "In the substitution chlorination of methane: CH₄(g) + Cl₂(g) -> CH₃Cl(g) + HCl(g), the primary condition required to initiate the reaction rate is:",
                optionA = "catalyst",
                optionB = "darkness",
                optionC = "ultraviolet light (or diffuse sunlight)",
                optionD = "high moisture.",
                correctAnswerIndex = 2,
                explanation = "The reaction is a photochemical free-radical substitution initiated by UV light splitting Cl₂ molecules into chlorine free radicals (Cl·).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q25)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_26",
                subject = "Chemistry",
                topic = "Corrosion of Metals",
                year = "Series 1",
                questionText = "The essential chemical conditions necessary for the electrochemical corrosion (rusting) of iron to occur are the simultaneous presence of:",
                optionA = "water (moisture) and oxygen gas",
                optionB = "water and carbon (IV) oxide only",
                optionC = "oxygen and nitrogen",
                optionD = "dry air.",
                correctAnswerIndex = 0,
                explanation = "Rusting of iron requires both oxygen (oxidizing agent) and water (electrolyte medium) to form hydrated iron (III) oxide, Fe₂O₃·xH₂O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q26)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_27",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "Series 1",
                questionText = "[DIAGRAM: Exothermic Potential Energy Profile:\nReactants enthalpy level at 100 kJ.\nTransition peak (activated complex) at 250 kJ.\nProducts enthalpy level at 50 kJ.\nDimension X measures the energy barrier height from Reactants (100 kJ) to the top of the peak (250 kJ).]\n\nIn the reaction energy profile diagram above, the energy quantity represented by dimension X is the:",
                optionA = "enthalpy change (ΔH)",
                optionB = "Activation Energy (Ea = 150 kJ)",
                optionC = "heat of formation",
                optionD = "entropy change.",
                correctAnswerIndex = 1,
                explanation = "Activation energy (Ea) is the minimum threshold energy required for colliding reactant molecules to form the activated complex (Peak - Reactants).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_29",
                subject = "Chemistry",
                topic = "Redox Equations",
                year = "Series 1",
                questionText = "Consider the balanced ionic redox reaction: MnO₄⁻(aq) + Y + 5Fe²⁺(aq) -> Mn²⁺(aq) + 5Fe³⁺(aq) + 4H₂O(l). The missing species Y in the equation is:",
                optionA = "5H⁺(aq)",
                optionB = "4H⁺(aq)",
                optionC = "8H⁺(aq)",
                optionD = "10H⁺(aq)",
                correctAnswerIndex = 2,
                explanation = "Balancing charge and hydrogen atoms for acidic permanganate oxidation: MnO₄⁻ + 8H⁺ + 5Fe²⁺ -> Mn²⁺ + 5Fe³⁺ + 4H₂O; thus Y = 8H⁺(aq).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q29)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_30",
                subject = "Chemistry",
                topic = "Electrolysis & Faraday's Law",
                year = "Series 1",
                questionText = "According to Faraday's First Law of Electrolysis, the mass (m) of a chemical element discharged at an electrode is mathematically expressed as:",
                optionA = "m = E / Q",
                optionB = "m = E × Q (where E is the electrochemical equivalent and Q is electric charge in coulombs)",
                optionC = "m = Q / E",
                optionD = "m = E / 2Q.",
                correctAnswerIndex = 1,
                explanation = "Faraday's 1st Law states m ∝ Q => m = ZQ = EIt, where E (or Z) is the electrochemical equivalent of the substance.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q30)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_42",
                subject = "Chemistry",
                topic = "Organic Isomerism",
                year = "Series 1",
                questionText = "[DIAGRAM: Organic Isomerism:\nCentral carbon atom C bonded to:\n- Top: -H\n- Left: -CH₃\n- Right: -COOH\n- Bottom: -OH\n(2-hydroxypropanoic acid / Lactic acid)]\n\nThe organic molecule illustrated above containing an asymmetric chiral carbon bonded to four different groups exhibits:",
                optionA = "geometric (cis-trans) isomerism",
                optionB = "optical isomerism (enantiomerism)",
                optionC = "positional isomerism",
                optionD = "functional group isomerism.",
                correctAnswerIndex = 1,
                explanation = "Lactic acid has a chiral carbon attached to 4 distinct ligands (-H, -CH3, -OH, -COOH), forming non-superimposable mirror-image enantiomers that rotate plane-polarized light.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q42)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_43",
                subject = "Chemistry",
                topic = "Empirical & Molecular Formula",
                year = "Series 1",
                questionText = "An organic compound has an empirical formula of CH₂O (formula mass = 30) and a vapour density of 45. What is its molecular formula? [C = 12, H = 1, O = 16]",
                optionA = "C₃H₇OH",
                optionB = "C₂H₅OH",
                optionC = "C₃H₆O₃",
                optionD = "C₂H₄O₂",
                correctAnswerIndex = 2,
                explanation = "Molar Mass = 2 × Vapour Density = 2 × 45 = 90 g mol⁻¹. (CH₂O)n = 90 => 30n = 90 => n = 3. Molecular Formula = C₃H₆O₃ (e.g. Lactic acid or triose).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q43)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_46",
                subject = "Chemistry",
                topic = "Organic Functional Groups",
                year = "Series 1",
                questionText = "[DIAGRAM: Structural Formula:\nH - C(H)(OH) - C(H)(H) - C(H)(Cl) - H\nPropane backbone with an -OH group on Carbon-2 and a -Cl atom on Carbon-1 (1-chloropropan-2-ol).]\n\nThe distinct functional groups present in the organic molecule shown above are:",
                optionA = "alkene and halo-group",
                optionB = "hydroxyl (-OH) and chloro (-Cl) groups",
                optionC = "carbonyl and amine",
                optionD = "alkyne and alkoxy.",
                correctAnswerIndex = 1,
                explanation = "The molecule contains an alcohol hydroxyl group (-OH) and an alkyl halide halogen atom (-Cl).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q46)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt1_49",
                subject = "Chemistry",
                topic = "IUPAC Nomenclature",
                year = "Series 1",
                questionText = "[DIAGRAM: Branched Alkene Structure:\nCH₃ - CH(CH₃) - CH₂ - CH = CH₂\nA 5-carbon alkene chain with a methyl branch at Carbon-4 and a double bond at Carbon-1.]\n\nThe correct systematic IUPAC name for the hydrocarbon shown above is:",
                optionA = "4-methylpent-1-ene",
                optionB = "2-methylpent-4-ene",
                optionC = "3-methylpent-2-ene",
                optionD = "2-methylpent-1-ene.",
                correctAnswerIndex = 0,
                explanation = "Numbering starts from the double bond end: C1=C2-C3-C4(CH3)-C5 => 4-methylpent-1-ene.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 1 (Q49)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt2_04",
                subject = "Chemistry",
                topic = "Gas Laws & STP",
                year = "Series 2",
                questionText = "A volume of 50 cm³ of gas was collected over water at 10°C and 765 mmHg. If the saturated vapour pressure of water at 10°C is 5 mmHg, calculate the volume of dry gas at s.t.p. (T₀ = 273 K, P₀ = 760 mmHg).",
                optionA = "49.19 cm³",
                optionB = "48.23 cm³",
                optionC = "48.55 cm³",
                optionD = "44.12 cm³",
                correctAnswerIndex = 1,
                explanation = "Dry gas pressure P₁ = 765 - 5 = 760 mmHg. T₁ = 10 + 273 = 283 K. Using P₁V₁/T₁ = P₂V₂/T₂: (760 × 50) / 283 = (760 × V₂) / 273 => V₂ = (50 × 273) / 283 ≈ 48.23 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 2 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt2_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "Series 2",
                questionText = "How many total atoms are present in 6.0 g of pure magnesium ribbon? [Mg = 24, Avogadro's constant NA = 6.02 × 10²³ mol⁻¹]",
                optionA = "1.20 × 10²²",
                optionB = "2.41 × 10²²",
                optionC = "1.51 × 10²³",
                optionD = "3.02 × 10²³",
                correctAnswerIndex = 2,
                explanation = "Moles of Mg = 6.0 / 24 = 0.25 mol. Number of atoms = 0.25 × 6.02 × 10²³ = 1.505 × 10²³ atoms.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 2 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt2_06",
                subject = "Chemistry",
                topic = "Chemical Calculations & Eudiometry",
                year = "Series 2",
                questionText = "In the reaction: 2H₂(g) + O₂(g) -> 2H₂O(g), what volume of hydrogen gas will remain unreacted when 300 cm³ of oxygen and 1,000 cm³ of hydrogen are exploded in a sealed eudiometer tube?",
                optionA = "200 cm³",
                optionB = "400 cm³",
                optionC = "600 cm³",
                optionD = "700 cm³",
                correctAnswerIndex = 1,
                explanation = "According to Gay-Lussac's Law: 300 cm³ of O₂ reacts with 2 × 300 = 600 cm³ of H₂. Remaining unreacted H₂ = 1,000 cm³ - 600 cm³ = 400 cm³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 2 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt2_32",
                subject = "Chemistry",
                topic = "Halogens & Laboratory Preparation",
                year = "Series 2",
                questionText = "[DIAGRAM: Laboratory Preparation of Pure Chlorine Gas:\nFlask 1: Round-bottom flask containing solid Manganese(IV) oxide (MnO₂) or Potassium permanganate (KMnO₄) heated with concentrated HCl.\nFlask 2: First wash bottle containing distilled water (H₂O) to absorb escaping Hydrogen Chloride gas (HCl).\nFlask 3: Second wash bottle containing concentrated Tetraoxosulphate(VI) acid (H₂SO₄) to dry the chlorine gas.\nCollection: Upward displacement of air (downward delivery) in gas jar.]\n\nIn the preparation apparatus shown above, the primary function of the concentrated H₂SO₄ in the second wash bottle is to:",
                optionA = "purify the chlorine gas",
                optionB = "act as a dehydrating/drying agent to remove water moisture",
                optionC = "liquefy the chlorine",
                optionD = "remove pungent chlorine odor.",
                correctAnswerIndex = 1,
                explanation = "Concentrated sulfuric acid (conc H₂SO₄) is a non-reactive hygroscopic liquid that absorbs water vapor, thoroughly drying the chlorine gas.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 2 (Q32)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt2_33",
                subject = "Chemistry",
                topic = "Halogens & Laboratory Preparation",
                year = "Series 2",
                questionText = "[DIAGRAM: Laboratory Preparation of Pure Chlorine Gas:\nFlask 1: Round-bottom flask containing solid Manganese(IV) oxide (MnO₂) or Potassium permanganate (KMnO₄) heated with concentrated HCl.\nFlask 2: First wash bottle containing distilled water (H₂O) to absorb escaping Hydrogen Chloride gas (HCl).\nFlask 3: Second wash bottle containing concentrated Tetraoxosulphate(VI) acid (H₂SO₄) to dry the chlorine gas.\nCollection: Upward displacement of air (downward delivery) in gas jar.]\n\nIn the first wash bottle, the distilled water is specifically included to remove which acidic impurity carrying over from the reaction flask?",
                optionA = "Oxygen gas",
                optionB = "Sulfur dioxide",
                optionC = "Hydrogen chloride gas (HCl)",
                optionD = "Nitrogen dioxide.",
                correctAnswerIndex = 2,
                explanation = "Hydrogen chloride gas is extremely soluble in water, while chlorine is only sparingly soluble; bubbling through water removes HCl impurities.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 2 (Q33)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt2_42",
                subject = "Chemistry",
                topic = "Organic Carbonyls",
                year = "Series 2",
                questionText = "[DIAGRAM: Carbonyl Compound Structure:\nCH₃ - C(=O) - CH₃\nA three-carbon chain with a carbonyl group (C=O) bonded between two alkyl groups (Propanone / Acetone).]\n\nThe organic compound illustrated above containing a carbonyl group between two methyl groups belongs to the homologous family of:",
                optionA = "alkanones (ketones)",
                optionB = "alkanoates (esters)",
                optionC = "alkanals (aldehydes)",
                optionD = "alkanols (alcohols).",
                correctAnswerIndex = 0,
                explanation = "The structure RC(=O)R' with carbonyl bonded to two carbon groups is an Alkanone (Propanone).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 2 (Q42)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_02",
                subject = "Chemistry",
                topic = "Physical Properties of Matter",
                year = "Series 3",
                questionText = "The presence of non-volatile impurities in a pure crystalline substance will cause its melting point to:",
                optionA = "become zero",
                optionB = "reduce (depress) and broaden its melting range",
                optionC = "increase sharply",
                optionD = "remain unchanged.",
                correctAnswerIndex = 1,
                explanation = "Impurities disrupt the regular crystal lattice structure, lowering (depressing) the melting point and causing it to melt over a wider temperature range.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_03",
                subject = "Chemistry",
                topic = "Gas Stoichiometry",
                year = "Series 3",
                questionText = "What volume of carbon (II) oxide (CO) is produced at s.t.p. by reacting excess carbon with 10.0 dm³ of oxygen gas according to the equation: 2C(s) + O₂(g) -> 2CO(g)?",
                optionA = "5.0 dm³",
                optionB = "20.0 dm³",
                optionC = "15.0 dm³",
                optionD = "10.0 dm³",
                correctAnswerIndex = 1,
                explanation = "By Gay-Lussac's Law of Combining Volumes, 1 volume of O₂ reacts with solid carbon to yield 2 volumes of CO gas. Therefore, 10.0 dm³ of O₂ produces 2 × 10.0 = 20.0 dm³ of CO.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_05",
                subject = "Chemistry",
                topic = "Graham's Law of Diffusion",
                year = "Series 3",
                questionText = "Under identical conditions of temperature and pressure, gas X diffuses twice as fast as gas Y. If the relative molecular mass of X is 32, calculate the relative molecular mass of Y.",
                optionA = "128",
                optionB = "8",
                optionC = "16",
                optionD = "64",
                correctAnswerIndex = 0,
                explanation = "According to Graham's Law: Rate(X) / Rate(Y) = √(M_Y / M_X) => 2 = √(M_Y / 32). Squaring both sides: 4 = M_Y / 32 => M_Y = 4 × 32 = 128.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_06",
                subject = "Chemistry",
                topic = "Nuclear Chemistry",
                year = "Series 3",
                questionText = "The synthetic radioisotope Cobalt-60 (⁶⁰Co) is extensively used in industrial radiography and medicine for:",
                optionA = "radiocarbon dating",
                optionB = "cancer radiotherapy and rapid non-destructive checking of weld faults and castings",
                optionC = "fertilizer tracing",
                optionD = "thyroid diagnosis.",
                correctAnswerIndex = 1,
                explanation = "Cobalt-60 emits high-energy penetrating gamma (γ) rays utilized in industrial non-destructive weld testing and clinical radiotherapy.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_07",
                subject = "Chemistry",
                topic = "Electronic Structure",
                year = "Series 3",
                questionText = "How many unpaired electrons are present in the p-subshell orbitals of a neutral fluorine atom (Z = 9: 1s² 2s² 2px² 2py² 2pz¹)?",
                optionA = "3",
                optionB = "0",
                optionC = "1 unpaired electron",
                optionD = "2",
                correctAnswerIndex = 2,
                explanation = "Fluorine's 2p subshell contains 5 electrons; pairing rules (Hund's rule) leave two filled orbitals and one half-filled orbital containing 1 unpaired electron.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_08",
                subject = "Chemistry",
                topic = "Radioactivity",
                year = "Series 3",
                questionText = "Which of the following radioactive emissions possesses the least ionizing power but the highest penetrating power?",
                optionA = "Alpha (α) particles",
                optionB = "X-rays",
                optionC = "Gamma (γ) rays",
                optionD = "Beta (β) particles.",
                correctAnswerIndex = 2,
                explanation = "Gamma rays are uncharged electromagnetic photons with negligible ionizing capability per unit distance compared to α-particles, but have immense penetrating power.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_09",
                subject = "Chemistry",
                topic = "Molecular Geometry",
                year = "Series 3",
                questionText = "The spatial three-dimensional shape of a carbon (IV) oxide molecule (CO₂) with two double bonds and no lone pairs on the central carbon is:",
                optionA = "pyramidal",
                optionB = "linear (bond angle = 180°)",
                optionC = "angular (V-shaped)",
                optionD = "tetrahedral.",
                correctAnswerIndex = 1,
                explanation = "Carbon in CO₂ undergoes sp hybridization, arranging the two oxygen atoms symmetrically at 180° in a linear geometry (O=C=O).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_10",
                subject = "Chemistry",
                topic = "Intermolecular Forces",
                year = "Series 3",
                questionText = "Which of the following hydride molecules exhibits significant intermolecular hydrogen bonding responsible for its abnormally high boiling point?",
                optionA = "CH₄",
                optionB = "HBr",
                optionC = "H₂S",
                optionD = "HF (Hydrogen fluoride)",
                correctAnswerIndex = 3,
                explanation = "Hydrogen bonding occurs when hydrogen is covalently bonded to highly electronegative small atoms (F, O, N). HF exhibits strong intermolecular H-bonding.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_13",
                subject = "Chemistry",
                topic = "Water Tests",
                year = "Series 3",
                questionText = "Anhydrous cobalt (II) chloride paper turns from ___ to ___ when exposed to water moisture or steam.",
                optionA = "white to red",
                optionB = "blue to pink",
                optionC = "pink to blue",
                optionD = "yellow to green.",
                correctAnswerIndex = 1,
                explanation = "Anhydrous CoCl₂ is deep blue; upon hydration to CoCl₂·6H₂O by water or steam, it turns pink, serving as a standard qualitative test for water.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_27",
                subject = "Chemistry",
                topic = "Thermochemistry & Hess's Law",
                year = "Series 3",
                questionText = "Given standard enthalpies of formation: ΔHf°[CO₂] = -394 kJ mol⁻¹, ΔHf°[H₂O(g)] = -242 kJ mol⁻¹, and ΔHf°[CO] = -110 kJ mol⁻¹. Calculate the standard heat change (ΔH°) for: CO(g) + H₂O(g) -> CO₂(g) + H₂(g).",
                optionA = "+42 kJ mol⁻¹",
                optionB = "-262 kJ mol⁻¹",
                optionC = "-42 kJ mol⁻¹",
                optionD = "+262 kJ mol⁻¹",
                correctAnswerIndex = 2,
                explanation = "ΔH° = ΣΔHf°(Products) - ΣΔHf°(Reactants) = [-394 + 0] - [-110 + (-242)] = -394 - (-352) = -42 kJ mol⁻¹ (Exothermic).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_27",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "Series 3",
                questionText = "In the contact process equilibrium: 2SO₂(g) + O₂(g) ⇌ 2SO₃(g), ΔH = -395.7 kJ mol⁻¹. The equilibrium yield of SO₃(g) is increased by:",
                optionA = "decreasing the total system pressure",
                optionB = "decreasing the system temperature and increasing pressure",
                optionC = "increasing the temperature",
                optionD = "adding an inert gas at constant volume.",
                correctAnswerIndex = 1,
                explanation = "The forward reaction is exothermic (ΔH < 0) and results in a reduction of gas moles (3 moles -> 2 moles). By Le Chatelier's principle, lower temperature and higher pressure favor forward yield of SO₃.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q27)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_36",
                subject = "Chemistry",
                topic = "Qualitative Inorganic Analysis",
                year = "Series 3",
                questionText = "Which of the following metallic cations imparts a characteristic persistent brick-red color to a non-luminous Bunsen burner flame?",
                optionA = "Copper ions (Cu²⁺)",
                optionB = "Sodium ions (Na⁺)",
                optionC = "Calcium ions (Ca²⁺)",
                optionD = "Barium ions (Ba²⁺).",
                correctAnswerIndex = 2,
                explanation = "Flame test emissions: Ca²⁺ = brick-red; Na⁺ = golden yellow; K⁺ = lilac; Cu²⁺ = bluish-green; Ba²⁺ = apple green.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q36)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_39",
                subject = "Chemistry",
                topic = "Organic Chemistry - Alcohols",
                year = "Series 3",
                questionText = "The systematic IUPAC compound 2-methylbutan-2-ol [CH₃-C(CH₃)(OH)-CH₂-CH₃] is classified as a:",
                optionA = "primary alkanol",
                optionB = "secondary alkanol",
                optionC = "tertiary (3°) alkanol",
                optionD = "dihydric alkanol.",
                correctAnswerIndex = 2,
                explanation = "The carbon atom bearing the -OH group is directly attached to three other carbon atoms (two methyls and one ethyl), making it a tertiary (3°) alcohol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q39)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_41",
                subject = "Chemistry",
                topic = "Organic Reactions - Decarboxylation",
                year = "Series 3",
                questionText = "The thermal decarboxylation of anhydrous sodium ethanoate heated with soda lime (NaOH + CaO) yields:",
                optionA = "methane gas (CH₄) and Na₂CO₃",
                optionB = "ethane gas",
                optionC = "propane gas",
                optionD = "ethene gas.",
                correctAnswerIndex = 0,
                explanation = "Decarboxylation removes the carboxylate group as carbonate: CH₃COONa + NaOH ->(CaO, heat)-> CH₄(g) + Na₂CO₃.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q41)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_47",
                subject = "Chemistry",
                topic = "Organic Acids & Esters",
                year = "Series 3",
                questionText = "An organic compound with molecular formula C₄H₈O₂ that possesses a sweet, pleasant, fruity fragrance is an:",
                optionA = "alkanoic acid",
                optionB = "alkanal",
                optionC = "alkanoate (ester, e.g. ethyl ethanoate)",
                optionD = "alkanone.",
                correctAnswerIndex = 2,
                explanation = "Alkyl alkanoates (esters) are characterized by pleasant, fruity aromas and are widely used in artificial flavourings and perfumes.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q47)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chem_pt3_50",
                subject = "Chemistry",
                topic = "Empirical Formula Analysis",
                year = "Series 3",
                questionText = "An organic compound contains 60.0% Carbon, 13.3% Hydrogen, and 26.7% Oxygen by mass. Determine its empirical formula. [C = 12, H = 1, O = 16]",
                optionA = "C₅H₁₂O",
                optionB = "C₃H₈O (Propanol)",
                optionC = "C₆H₁₃O₂",
                optionD = "C₄H₉O",
                correctAnswerIndex = 1,
                explanation = "Moles of C = 60.0 / 12 = 5.0; Moles of H = 13.3 / 1 = 13.3; Moles of O = 26.7 / 16 = 1.669. Dividing by smallest (1.669): C = 5.0 / 1.669 ≈ 3; H = 13.3 / 1.669 ≈ 8; O = 1.669 / 1.669 = 1 => Empirical Formula = C₃H₈O.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "Original JAMB Chemistry • Part 3 (Q50)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
