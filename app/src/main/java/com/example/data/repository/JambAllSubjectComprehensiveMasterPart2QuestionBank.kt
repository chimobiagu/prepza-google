package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB UTME Comprehensive All-Subjects Master Revision Bank Part 2.
 * Covers: Chemistry, Biology, Economics (1983 - 2004 Series).
 */
object JambAllSubjectComprehensiveMasterPart2QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 4. CHEMISTRY (1983 - 2004 HISTORICAL SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "chem_comp_1983_001",
                subject = "Chemistry",
                topic = "Salts: Identification & Properties",
                year = "1983",
                questionText = "X is a crystalline salt of sodium. A solution of X in water turns litmus red and produces a gas which turns lime water milky when added to sodium carbonate. With barium chloride, X gives a white precipitate insoluble in HCl. X is:",
                optionA = "Na₂CO₃",
                optionB = "NaHCO₃",
                optionC = "NaHSO₄",
                optionD = "Na₂SO₄",
                correctAnswerIndex = 2,
                explanation = "NaHSO₄ (sodium hydrogen sulfate) is an acid salt that releases H⁺ ions (turning litmus red), reacts with carbonates to produce CO₂, and furnishes SO₄²⁻ ions which form insoluble BaSO₄ with BaCl₂.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_002",
                subject = "Chemistry",
                topic = "Organic Chemistry: Saponification & Alkanols",
                year = "1983",
                questionText = "The alkanol obtained as a by-product from the commercial production of soap is:",
                optionA = "ethanol",
                optionB = "glycerol",
                optionC = "methanol",
                optionD = "glycol",
                correctAnswerIndex = 1,
                explanation = "Glycerol (propane-1,2,3-triol) is a trihydric alcohol produced during the alkaline hydrolysis (saponification) of fats and oils.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_004",
                subject = "Chemistry",
                topic = "Organic Chemistry: Homologous Series",
                year = "1983",
                questionText = "Consecutive members of an alkane homologous series differ in molecular formula by:",
                optionA = "-CH-",
                optionB = "-CH₂-",
                optionC = "-CH₃-",
                optionD = "-C₂H₅-",
                correctAnswerIndex = 1,
                explanation = "Consecutive members in any homologous series differ by a methylene group (-CH₂-), corresponding to a relative molecular mass difference of 14.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_005",
                subject = "Chemistry",
                topic = "Atomic Structure: Electronic Configuration",
                year = "1983",
                questionText = "If an element has the electronic configuration 1s² 2s² 2p⁶ 3s² 3p², it is classified as:",
                optionA = "a metal",
                optionB = "an s-block element",
                optionC = "a p-block element",
                optionD = "a transition element",
                correctAnswerIndex = 2,
                explanation = "The differentiating valence electrons enter the 3p subshell, placing the element (Silicon, Z=14) squarely in the p-block of the Periodic Table.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_006",
                subject = "Chemistry",
                topic = "Hydrated Salts: Water of Crystallization",
                year = "1983",
                questionText = "Some CuSO₄·5H₂O was heated at 120°C: Weight of crucible = 10.00g; Crucible + CuSO₄·5H₂O = 14.98g; Crucible + residue = 13.54g. How many water molecules were lost? [Cu=63.5, S=32, O=16, H=1]",
                optionA = "1",
                optionB = "2",
                optionC = "3",
                optionD = "4",
                correctAnswerIndex = 3,
                explanation = "Initial salt mass = 4.98g (0.020 mol). Mass of water lost = 14.98 - 13.54 = 1.44g (0.080 mol). Ratio = 0.080 / 0.020 = 4 molecules of water lost.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_007",
                subject = "Chemistry",
                topic = "Chemical Bonding: Molecular Geometry",
                year = "1983",
                questionText = "The three-dimensional shape of a methane (CH₄) molecule is:",
                optionA = "hexagonal",
                optionB = "trigonal planar",
                optionC = "linear",
                optionD = "tetrahedral",
                correctAnswerIndex = 3,
                explanation = "The central carbon atom undergoes sp³ hybridization with four equivalent bonding pairs pointing to the vertices of a regular tetrahedron (109.5°).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_009",
                subject = "Chemistry",
                topic = "Stoichiometry: Empirical & Molecular Formula",
                year = "1983",
                questionText = "The molecular formula of compound X having a relative molecular mass of 180 and an atomic ratio of C, H, O as 1:2:1 is: [C=12, H=1, O=16]",
                optionA = "C₁₂H₂₂O₁₁",
                optionB = "C₆H₁₂O₆",
                optionC = "C₃H₆O₃",
                optionD = "C₅H₁₀O₅",
                correctAnswerIndex = 1,
                explanation = "Empirical formula is CH₂O (mass = 30). Molecular formula factor n = 180 / 30 = 6 => (CH₂O)₆ = C₆H₁₂O₆ (glucose/fructose).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_017",
                subject = "Chemistry",
                topic = "Electrochemistry: Faraday's Laws",
                year = "1983",
                questionText = "A steady current deposited 0.63g of copper on the cathode of a CuSO₄ cell. The weight of silver deposited on a series-connected AgNO₃ cell during the same period is: [Cu = 63, Ag = 108]",
                optionA = "0.54g",
                optionB = "1.08g",
                optionC = "2.16g",
                optionD = "3.24g",
                correctAnswerIndex = 2,
                explanation = "By Faraday's Second Law: Mass Ag / Mass Cu = (108 / 1) / (63 / 2) = 108 / 31.5 = 3.428. Mass Ag = 0.63 * (108 / 31.5) = 2.16g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_018",
                subject = "Chemistry",
                topic = "Electrochemistry: Displacement Reactions",
                year = "1983",
                questionText = "In the reaction Fe + Cu²⁺ -> Fe²⁺ + Cu, iron displaces copper. This is because:",
                optionA = "iron has a higher density than copper",
                optionB = "iron is higher in the electrochemical series than copper",
                optionC = "copper is more reactive than iron",
                optionD = "iron has fewer valence electrons than copper",
                correctAnswerIndex = 1,
                explanation = "Iron is positioned above copper in the electrochemical activity series, meaning it has a higher oxidation potential and readily displaces Cu²⁺ ions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_022",
                subject = "Chemistry",
                topic = "Salts: Efflorescence",
                year = "1983",
                questionText = "Sodium decahydrate (Na₂SO₄·10H₂O) on exposure to dry air loses all its water of crystallization. This phenomenon is called:",
                optionA = "Efflorescence",
                optionB = "Hygroscopy",
                optionC = "Deliquescence",
                optionD = "Effervescence",
                correctAnswerIndex = 0,
                explanation = "Efflorescence is the spontaneous loss of water of crystallization from a hydrated salt to the surrounding atmosphere.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_030",
                subject = "Chemistry",
                topic = "Volumetric Analysis: Acid-Base Neutralization",
                year = "1983",
                questionText = "What volume of 0.50 M H₂SO₄ will exactly neutralize 20 cm³ of 0.10 M NaOH solution?",
                optionA = "2.0 cm³",
                optionB = "5.0 cm³",
                optionC = "10.0 cm³",
                optionD = "20.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Equation: H₂SO₄ + 2NaOH -> Na₂SO₄ + 2H₂O. (Ca * Va) / (Cb * Vb) = 1 / 2 => (0.50 * Va) / (0.10 * 20) = 1/2 => 0.50Va = 1.0 => Va = 2.0 cm³.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1983_043",
                subject = "Chemistry",
                topic = "Stoichiometry: Combustion of Hydrocarbons",
                year = "1983",
                questionText = "A jet plane carrying 3,000 kg of ethane (C₂H₆) burns off all the gas forming water and CO₂. If CO₂ is expelled and water condensed and kept on board, the net gain in weight is: [C=12, H=1, O=16]",
                optionA = "1,800 kg",
                optionB = "900 kg",
                optionC = "2,400 kg",
                optionD = "1,200 kg",
                correctAnswerIndex = 2,
                explanation = "2C₂H₆ (60g) + 7O₂ -> 4CO₂ + 6H₂O (108g). Weight of water formed = 3,000 * (108 / 60) = 5,400 kg. Since 3,000 kg of ethane was consumed, net weight gain = 5,400 - 3,000 = 2,400 kg.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1984_002",
                subject = "Chemistry",
                topic = "Gas Stoichiometry: Eudiometry",
                year = "1984",
                questionText = "20 cm³ of hydrogen are sparked with 20 cm³ of oxygen. The resulting mixture is cooled to 298 K and passed over anhydrous CaCl₂. The volume of residual gas is:",
                optionA = "40 cm³",
                optionB = "20 cm³",
                optionC = "30 cm³",
                optionD = "10 cm³",
                correctAnswerIndex = 3,
                explanation = "2H₂ + O₂ -> 2H₂O. 20 cm³ of H₂ reacts completely with 10 cm³ of O₂. Unreacted O₂ = 20 - 10 = 10 cm³. Water vapor condenses and is absorbed by CaCl₂.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1984 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1984_003",
                subject = "Chemistry",
                topic = "Gas Calculations: Molar Volume",
                year = "1984",
                questionText = "Calculate the volume of nitrogen gas produced at S.T.P. from the thermal decomposition of 3.20g of NH₄NO₂: [N=14, O=16, H=1, GMV=22.4 dm³]",
                optionA = "2.24 dm³",
                optionB = "1.12 dm³",
                optionC = "4.48 dm³",
                optionD = "11.20 dm³",
                correctAnswerIndex = 1,
                explanation = "NH₄NO₂ -> N₂ + 2H₂O. Molar mass of NH₄NO₂ = 64g/mol. Moles = 3.20 / 64 = 0.05 mol. Volume of N₂ = 0.05 * 22.4 = 1.12 dm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1984 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1984_014",
                subject = "Chemistry",
                topic = "Redox Reactions: Reducing Agents",
                year = "1984",
                questionText = "In which of the following reactions does H₂O₂ act as a reducing agent?",
                optionA = "H₂S + H₂O₂ -> S + 2H₂O",
                optionB = "PbSO₃ + H₂O₂ -> PbSO₄ + H₂O",
                optionC = "PbO₂ + 2HNO₃ + H₂O₂ -> Pb(NO₃)₂ + 2H₂O + O₂",
                optionD = "2I⁻ + 2H⁺ + H₂O₂ -> I₂ + 2H₂O",
                correctAnswerIndex = 2,
                explanation = "In PbO₂ + 2HNO₃ + H₂O₂, Pb is reduced from +4 to +2 in Pb(NO₃)₂, while oxygen in H₂O₂ is oxidized from -1 to 0 (O₂), demonstrating H₂O₂ acting as a reducing agent.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1984 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1984_036",
                subject = "Chemistry",
                topic = "Industrial Electrochemistry: Cost Analysis",
                year = "1984",
                questionText = "If the electricity required to deposit 1g of Mg is ₦5.00, how much would it cost to deposit 10g of Al? [Al=27, Mg=24]",
                optionA = "₦10.00",
                optionB = "₦27.00",
                optionC = "₦66.67",
                optionD = "₦44.44",
                correctAnswerIndex = 2,
                explanation = "Eq mass Mg = 24/2 = 12g. Depositing 1g Mg requires 1/12 F costing ₦5.00 => 1 F costs ₦60.00. Eq mass Al = 27/3 = 9g. Depositing 10g Al requires 10/9 F => Cost = (10/9) * 60 = ₦66.67.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1984 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1985_004",
                subject = "Chemistry",
                topic = "Gravimetric Analysis: Hydrated Compounds",
                year = "1985",
                questionText = "0.499 g of CuSO₄·xH₂O was heated to constant weight giving 0.346 g of anhydrous residue. Find x: [Cu=63.5, S=32, O=16, H=1]",
                optionA = "2.0",
                optionB = "3.0",
                optionC = "4.0",
                optionD = "5.0",
                correctAnswerIndex = 3,
                explanation = "Residue mass (CuSO₄, RMM 159.5) = 0.346g (0.00217 mol). Water lost (RMM 18) = 0.499 - 0.346 = 0.153g (0.0085 mol). x = 0.0085 / 0.00217 = 3.92 ≈ 5.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1985 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_1990_022",
                subject = "Chemistry",
                topic = "Electrochemistry & Gas Volumes",
                year = "1990",
                questionText = "If 10.8g of Ag is deposited at the cathode of a voltameter, what volume of oxygen gas is liberated at S.T.P. at the anode? [Ag = 108, GMV = 22.4 dm³]",
                optionA = "0.56 dm³",
                optionB = "5.50 dm³",
                optionC = "11.20 dm³",
                optionD = "22.40 dm³",
                correctAnswerIndex = 0,
                explanation = "10.8g Ag = 0.10 mol Ag = 0.10 F of electricity. Anode reaction: 2H₂O -> O₂ + 4H⁺ + 4e⁻. 4 F liberates 1 mol O₂. 0.10 F liberates 0.10/4 = 0.025 mol O₂ = 0.025 * 22.4 = 0.56 dm³.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1990 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_2002_025",
                subject = "Chemistry",
                topic = "Gas Laws: Graham's Law of Diffusion",
                year = "2002",
                questionText = "A gas X diffuses twice as fast as gas Y under identical conditions. If the relative molecular mass of X is 28, calculate that of Y.",
                optionA = "14",
                optionB = "56",
                optionC = "112",
                optionD = "120",
                correctAnswerIndex = 2,
                explanation = "Graham's Law: Rx / Ry = √(My / Mx) => 2 = √(My / 28) => 4 = My / 28 => My = 4 * 28 = 112.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2002 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_comp_2004_005",
                subject = "Chemistry",
                topic = "Electrochemistry: Mass of Metal Deposited",
                year = "2004",
                questionText = "Calculate the mass of silver deposited when a 10 A current is passed through an aqueous silver salt for 4830 seconds: [Ag = 108, 1 Faraday = 96500 C]",
                optionA = "54.0 g",
                optionB = "27.0 g",
                optionC = "13.5 g",
                optionD = "108.0 g",
                correctAnswerIndex = 0,
                explanation = "Quantity of charge Q = I * t = 10 * 4830 = 48,300 C = 0.50 Faraday. Mass of Ag deposited = 0.50 * 108 = 54.0 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2004 • Q5"
            )
        )

        // =========================================================================
        // 5. BIOLOGY (1983 - 2012 HISTORICAL SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "bio_comp_1983_050",
                subject = "Biology",
                topic = "Ecology: Soil Capillarity",
                year = "1983",
                questionText = "If soil tubes are suspended in a trough of water, water will rise highest after a few hours in:",
                optionA = "sand",
                optionB = "loam",
                optionC = "clay",
                optionD = "humus",
                correctAnswerIndex = 2,
                explanation = "Clay consists of the finest microscopic particles and narrowest pore spaces, generating the greatest capillary tension that draws water highest.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q50"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1987_001",
                subject = "Biology",
                topic = "Cell Structure: Endoplasmic Reticulum",
                year = "1987",
                questionText = "The primary function of the endoplasmic reticulum in a cell is:",
                optionA = "protein synthesis only",
                optionB = "intracellular transport of materials",
                optionC = "digestion of foreign bodies",
                optionD = "production of ATP energy",
                correctAnswerIndex = 1,
                explanation = "The endoplasmic reticulum forms a network of interconnected tubular membranes that transports proteins, lipids, and other molecules throughout the cytoplasm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1987 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1987_024",
                subject = "Biology",
                topic = "Excretion: Kidney Nephron",
                year = "1987",
                questionText = "The function of the loop of Henle in the mammalian kidney is to:",
                optionA = "increase the flow of urine",
                optionB = "concentrate amino acids",
                optionC = "concentrate sodium chloride in the medulla of the kidney",
                optionD = "increase the total volume of urine",
                correctAnswerIndex = 2,
                explanation = "The loop of Henle operates as a countercurrent multiplier system, generating a high hypertonic gradient of NaCl and urea in the renal medulla to facilitate water reabsorption.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1987 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1987_041",
                subject = "Biology",
                topic = "Public Health: Parasitic Control",
                year = "1987",
                questionText = "The control of guinea worm disease in a community is best achieved by:",
                optionA = "treating diagnosed cases with antibiotics",
                optionB = "public health education campaigns only",
                optionC = "accelerating rural industrialization",
                optionD = "provision of safe, potable drinking water",
                correctAnswerIndex = 3,
                explanation = "Guinea worm (Dracunculus medinensis) infection is acquired solely by drinking stagnant water containing infected Cyclops; providing clean pipe-borne or borehole water halts transmission.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1987 • Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1987_042",
                subject = "Biology",
                topic = "Reproduction: Binary Fission",
                year = "1987",
                questionText = "During binary fission in unicellular organisms, the nucleus is known to undergo:",
                optionA = "mitosis",
                optionB = "meiosis",
                optionC = "fragmentation",
                optionD = "mutation",
                correctAnswerIndex = 0,
                explanation = "Binary fission is an asexual division mechanism where the eukaryotic nucleus replicates and divides equitably by mitosis to form two genetically identical daughter cells.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1987 • Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1987_043",
                subject = "Biology",
                topic = "Genetics: Mendelian Experiments",
                year = "1987",
                questionText = "One major methodological reason for the success of Mendel's work in genetics is that he:",
                optionA = "was the first person to carry out genetic research",
                optionB = "introduced modern microscopes into his work",
                optionC = "selected only one or two clear contrasting characteristics at a time for study",
                optionD = "worked with complex animals",
                correctAnswerIndex = 2,
                explanation = "Mendel simplified the variables in his breeding experiments by isolating and tracking only distinct, sharply contrasting traits (e.g., tall vs dwarf, yellow vs green).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1987 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_2010_001",
                subject = "Biology",
                topic = "Cell Biology: Mitochondria & Respiration",
                year = "2010",
                questionText = "Which cell organelle represents the site of aerobic cellular respiration?",
                optionA = "Cell Membrane",
                optionB = "Nucleolus",
                optionC = "Mitochondrion",
                optionD = "Endoplasmic Reticulum",
                correctAnswerIndex = 2,
                explanation = "The mitochondrion houses the enzymes of the Krebs cycle and the electron transport chain required for oxidative phosphorylation and ATP synthesis during aerobic respiration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_2010_002",
                subject = "Biology",
                topic = "Cell Biology: Rough Endoplasmic Reticulum",
                year = "2010",
                questionText = "What is the primary function of the rough endoplasmic reticulum?",
                optionA = "Synthesis of lipids and steroid hormones",
                optionB = "Protein synthesis, folding, and transport",
                optionC = "Breakdown of waste products",
                optionD = "Phagocytic intracellular digestion",
                correctAnswerIndex = 1,
                explanation = "The rough ER is studded with ribosomes and is specialized for synthesizing, post-translationally modifying, and packaging secretory and membrane proteins.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2010 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_2012_046",
                subject = "Biology",
                topic = "Skeletal System: Vertebrae Structure",
                year = "2012",
                questionText = "The vertebral type characterized by a very large, robust centrum and broad transverse processes for muscular attachment is the:",
                optionA = "Atlas vertebra",
                optionB = "Lumbar vertebra",
                optionC = "Axis vertebra",
                optionD = "Sacral vertebra",
                correctAnswerIndex = 1,
                explanation = "Lumbar vertebrae are situated in the lower back and bear the greatest weight of the upper body, resulting in a thick, massive centrum and strong transverse processes.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Q46"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_2012_047",
                subject = "Biology",
                topic = "Skeletal System: Vertebral Canal",
                year = "2012",
                questionText = "The central opening in a typical vertebra through which the spinal cord passes is called the:",
                optionA = "Centrum",
                optionB = "Neural canal",
                optionC = "Neural spine",
                optionD = "Transverse process",
                correctAnswerIndex = 1,
                explanation = "The neural canal (vertebral foramen) forms the continuous protective conduit through which the spinal cord runs along the spinal column.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1983_015",
                subject = "Biology",
                topic = "Circulatory System: Cardiac Muscle",
                year = "1983",
                questionText = "The mammalian heart is described as myogenic because its rhythmic heartbeat is initiated by:",
                optionA = "nerves from the central nervous system",
                optionB = "hormones in the bloodstream",
                optionC = "specialized muscle fibers within the heart itself (sinoatrial node)",
                optionD = "mechanical stretching of the auricles",
                correctAnswerIndex = 2,
                explanation = "Myogenic contractions originate intrinsically from specialized cardiac muscle pacemaker cells (the SA node) without requiring external nervous stimulation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1983_016",
                subject = "Biology",
                topic = "Respiratory System: Insects",
                year = "1983",
                questionText = "The internal respiratory organ of an insect consists of a branching system of air-filled tubes called:",
                optionA = "gills",
                optionB = "lungs",
                optionC = "tracheae",
                optionD = "spiracles",
                correctAnswerIndex = 2,
                explanation = "Insects breathe through an internal network of chitin-lined tubes called tracheae that branch into tracheoles delivering oxygen directly to body tissues.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1983_018",
                subject = "Biology",
                topic = "Ecology: Adaptations & Camouflage",
                year = "1983",
                questionText = "The adaptive morphological resemblance of a leaf insect to green foliage to avoid predators is an example of:",
                optionA = "warning coloration",
                optionB = "camouflage (cryptic appearance)",
                optionC = "Batesian mimicry",
                optionD = "mutualism",
                correctAnswerIndex = 1,
                explanation = "Camouflage (cryptic coloration and shape) allows an organism to blend seamlessly into its natural background to remain undetectable by predators.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1983_025",
                subject = "Biology",
                topic = "Vertebrate Adaptations: Volant Animals",
                year = "1983",
                questionText = "Which of the following organisms exhibits structural skeletal adaptation for true active flight?",
                optionA = "Bat",
                optionB = "Toad",
                optionC = "Lizard",
                optionD = "Earthworm",
                correctAnswerIndex = 0,
                explanation = "Bats are the only mammals capable of true sustained powered flight, having forelimbs modified into wings with an elastic patagium membrane stretched over elongated phalanges.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1984_010",
                subject = "Biology",
                topic = "Ecosystem Dynamics: Energy Flow",
                year = "1984",
                questionText = "In terrestrial and aquatic ecosystem dynamics, the primary ultimate source of energy is:",
                optionA = "green plants",
                optionB = "decomposers",
                optionC = "the sun",
                optionD = "chemical nutrients",
                correctAnswerIndex = 2,
                explanation = "Solar radiant energy from the sun is the fundamental energy input driving all ecosystems, captured by photosynthetic autotrophs at the base of the food web.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1984 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1984_022",
                subject = "Biology",
                topic = "Plant Nutrition: Mineral Deficiencies",
                year = "1984",
                questionText = "Which of the following is a classic symptom of nitrogen deficiency in flowering plants?",
                optionA = "Stunted growth and yellowing of leaves (chlorosis)",
                optionB = "Deep purple coloration of stems",
                optionC = "Poor lateral root development",
                optionD = "Excessive leaf curling",
                correctAnswerIndex = 0,
                explanation = "Nitrogen is essential for amino acids and chlorophyll synthesis. Its deficiency impairs chlorophyll production (causing general chlorosis/yellowing) and severely stunting vegetative growth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1984 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1985_030",
                subject = "Biology",
                topic = "Plant & Fungal Nutrition",
                year = "1985",
                questionText = "The mode of nutrition in mushrooms and other higher fungi is described as:",
                optionA = "autotrophic",
                optionB = "saprophytic",
                optionC = "parasitic",
                optionD = "symbiotic",
                correctAnswerIndex = 1,
                explanation = "Mushrooms lack chlorophyll and obtain organic nutrition saprophytically by secreting extracellular enzymes to digest dead decaying organic matter.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1985 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1985_035",
                subject = "Biology",
                topic = "Public Health: Insect Vectors",
                year = "1985",
                questionText = "The biological vector that transmits the malaria parasite (Plasmodium) is the:",
                optionA = "female Anopheles mosquito",
                optionB = "male Anopheles mosquito",
                optionC = "female Aedes mosquito",
                optionD = "tsetse fly",
                correctAnswerIndex = 0,
                explanation = "The female Anopheles mosquito requires blood meals for egg development and inoculates Plasmodium sporozoites into the human bloodstream during feeding.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1985 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_comp_1985_040",
                subject = "Biology",
                topic = "Endocrine System: Blood Glucose Regulation",
                year = "1985",
                questionText = "The pancreatic hormone that lowers the concentration of glucose in human blood is:",
                optionA = "thyroxine",
                optionB = "adrenaline",
                optionC = "insulin",
                optionD = "auxin",
                correctAnswerIndex = 2,
                explanation = "Insulin, secreted by the beta cells of the islets of Langerhans in the pancreas, stimulates cellular uptake of glucose and promotes glycogenesis in the liver and muscle.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1985 • Q40"
            )
        )

        // =========================================================================
        // 6. ECONOMICS (1983 - 2002 HISTORICAL SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "econ_comp_1983_001",
                subject = "Economics",
                topic = "National Income Accounting: Income Approach",
                year = "1983",
                questionText = "Which of the following items is NOT included when measuring national income by the income approach?",
                optionA = "Wages and salaries of public servants",
                optionB = "Student grants, bursaries, and scholarships",
                optionC = "Undistributed corporate profits",
                optionD = "Income of self-employed professional lawyers",
                correctAnswerIndex = 1,
                explanation = "Student grants and scholarships are unearned transfer payments; they do not correspond to any current productive output and are excluded to avoid double counting.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_002",
                subject = "Economics",
                topic = "Price Determination: Demand & Supply",
                year = "1983",
                questionText = "A downward-sloping demand curve intersects a fixed upward-sloping supply curve. A shift of this demand curve to the right implies that:",
                optionA = "both equilibrium price and equilibrium quantity will increase",
                optionB = "only price increases while quantity stays fixed",
                optionC = "only quantity increases while price falls",
                optionD = "price remains constant while supply decreases",
                correctAnswerIndex = 0,
                explanation = "An increase in demand (rightward shift) causes excess demand at the initial price, bidding up both equilibrium price and equilibrium quantity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_007",
                subject = "Economics",
                topic = "Production Possibility Curve: Opportunity Cost",
                year = "1983",
                questionText = "Based on a production possibility schedule (R: 3 units of shelter, 9 units of food; S: 2 units of shelter, 12 units of food), the real opportunity cost of producing one additional unit of food when moving from R to S is:",
                optionA = "One unit of shelter",
                optionB = "Three units of shelter",
                optionC = "One third (1/3) of a unit of shelter",
                optionD = "Six units of shelter",
                correctAnswerIndex = 2,
                explanation = "Gaining 3 food units (12 - 9) requires sacrificing 1 shelter unit (3 - 2). The opportunity cost per unit of food = 1 / 3 unit of shelter.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_013",
                subject = "Economics",
                topic = "Theory of Cost: MC and AC Relationships",
                year = "1983",
                questionText = "The Marginal Cost (MC) curve always intersects the Average Cost (AC) curve:",
                optionA = "From above at its highest point",
                optionB = "From below before the lowest point",
                optionC = "From below at its lowest (minimum) point",
                optionD = "From below after the lowest point",
                correctAnswerIndex = 2,
                explanation = "When MC < AC, AC falls; when MC > AC, AC rises. Therefore, MC must intersect AC exactly at AC's minimum point from below.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_024",
                subject = "Economics",
                topic = "Division of Labour: Limitations",
                year = "1983",
                questionText = "Division of labour has numerous advantages. Notwithstanding, it is primarily limited by the:",
                optionA = "Monotony of factory work",
                optionB = "Decline of individual craftsmanship",
                optionC = "Risk of occupational unemployment",
                optionD = "Extent of the market demand",
                correctAnswerIndex = 3,
                explanation = "As Adam Smith demonstrated in 'The Wealth of Nations', specialization and division of labour are strictly bounded by the size and purchasing power of the market.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1991_015",
                subject = "Economics",
                topic = "Elasticity of Demand: Cross Elasticity",
                year = "1991",
                questionText = "The cross-elasticity of demand between complementary goods is always:",
                optionA = "Unitary",
                optionB = "Positive",
                optionC = "Zero",
                optionD = "Negative",
                correctAnswerIndex = 3,
                explanation = "Complementary goods (e.g., petrol and cars) are consumed together. An increase in the price of one reduces the demand for the other, yielding a negative cross-elasticity coefficient.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1991_016",
                subject = "Economics",
                topic = "Market Structures: Allocative Efficiency",
                year = "1991",
                questionText = "Economic resources are said to be efficiently allocated in an industry when production takes place at the output level where price equals:",
                optionA = "Marginal revenue",
                optionB = "Average variable cost",
                optionC = "Marginal cost",
                optionD = "Total cost",
                correctAnswerIndex = 2,
                explanation = "Allocative efficiency occurs where Price (Marginal Social Benefit) equals Marginal Cost (Marginal Social Cost): P = MC.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1991_048",
                subject = "Economics",
                topic = "National Income: Income Approach Formula",
                year = "1991",
                questionText = "If W stands for wages, P for profit, R for interest and Z for rent, then national income (Y) via the income approach is expressed as:",
                optionA = "Y = W - P - R - Z",
                optionB = "Y = W + P + Z - R",
                optionC = "Y = P - R - Z + W",
                optionD = "Y = W + P + R + Z",
                correctAnswerIndex = 3,
                explanation = "The income approach sums the factor rewards earned by all factors of production: Wages (labour) + Profit (enterprise) + Interest (capital) + Rent (land).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1991 • Q48"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_003",
                subject = "Economics",
                topic = "Location of Industries: Rural Economics",
                year = "1983",
                questionText = "Which of the following points is NOT an economic argument for locating industries in rural areas?",
                optionA = "Rural areas supply agricultural raw materials",
                optionB = "The pace of regional development will be quickened",
                optionC = "Employment will be provided for rural inhabitants",
                optionD = "Capital is easily available in rural areas",
                correctAnswerIndex = 3,
                explanation = "Commercial capital, banking facilities, and venture financing are predominantly concentrated in major urban centers, making capital scarcity a challenge in rural areas.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_005",
                subject = "Economics",
                topic = "Population: Natural Growth Rate",
                year = "1983",
                questionText = "The natural growth rate of a human population is defined as the:",
                optionA = "Sum of the birth rate and the death rate",
                optionB = "Sum of the birth rate and the net migration rate",
                optionC = "Birth rate minus the death rate",
                optionD = "Birth rate divided by the net migration rate",
                correctAnswerIndex = 2,
                explanation = "Natural population growth measures biological expansion alone, calculated simply as Crude Birth Rate minus Crude Death Rate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_006",
                subject = "Economics",
                topic = "Factors of Production",
                year = "1983",
                questionText = "Which of the following combinations fully represents the traditional economic factors of production?",
                optionA = "Sunlight, machinery, man, land",
                optionB = "Land, labour, capital, enterprise",
                optionC = "Capital, technology, ideas, market",
                optionD = "Land, water, weather, machinery",
                correctAnswerIndex = 1,
                explanation = "The four classical factors of production are Land (natural resources), Labour (human effort), Capital (man-made wealth used in production), and Enterprise (organization and risk-taking).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_008",
                subject = "Economics",
                topic = "Production Theory: Economic Efficiency",
                year = "1983",
                questionText = "The concept of economic efficiency in production primarily refers to:",
                optionA = "Obtaining the maximum output from available resources at the lowest possible cost",
                optionB = "Strict conservation of finite petroleum resources",
                optionC = "Complete equity in the distribution of national wealth",
                optionD = "Producing zero industrial emissions",
                correctAnswerIndex = 0,
                explanation = "Economic efficiency combines productive efficiency (producing at least cost) with allocative efficiency (producing output optimal for society's welfare).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_009",
                subject = "Economics",
                topic = "Theory of Production: Diminishing Returns",
                year = "1983",
                questionText = "Adding successive units of variable labour to a fixed plot of land eventually yields diminishing additions to total output. This illustrates:",
                optionA = "The productivity of labour",
                optionB = "The law of diminishing marginal utility",
                optionC = "The law of diminishing returns",
                optionD = "The concept of factor intensity",
                correctAnswerIndex = 2,
                explanation = "The Law of Diminishing Returns states that as equal increments of a variable factor are added to fixed factors, the marginal product of the variable factor eventually declines.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_010",
                subject = "Economics",
                topic = "Theory of Demand: Law of Demand",
                year = "1983",
                questionText = "A household’s demand curve for a normal good is downward sloping from left to right because:",
                optionA = "The demand for the commodity is exceptionally high",
                optionB = "The local markets are flooded with substitutes",
                optionC = "The commodity is manufactured domestically",
                optionD = "Higher prices induce lower quantities demanded while lower prices induce larger quantities demanded",
                correctAnswerIndex = 3,
                explanation = "The law of demand establishes an inverse relationship between price and quantity demanded due to substitution and income effects, producing a downward slope.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_014",
                subject = "Economics",
                topic = "Business Organizations: Sole Proprietorship",
                year = "1983",
                questionText = "In a sole proprietorship, all fundamental executive and operational business decisions are made by the:",
                optionA = "Government",
                optionB = "Board of directors",
                optionC = "Appointed management committee",
                optionD = "Owner (sole proprietor)",
                correctAnswerIndex = 3,
                explanation = "A sole proprietorship is owned, funded, and managed by a single individual who holds total managerial autonomy and bears all risks.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_1983_015",
                subject = "Economics",
                topic = "Public Enterprises & Utilities",
                year = "1983",
                questionText = "Which of the following enterprises does NOT pursue the sole objective of commercial profit maximization?",
                optionA = "Roads Nigeria Ltd",
                optionB = "Union Bank of Nigeria Ltd",
                optionC = "Nigerian Electric Power Authority (NEPA)",
                optionD = "Volkswagen (VW) Nigeria Ltd",
                correctAnswerIndex = 2,
                explanation = "Public utility statutory corporations like NEPA were created primarily to provide essential public services and promote social welfare rather than maximize profit.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 1983 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_2000_001",
                subject = "Economics",
                topic = "Basic Economic Concepts: Definition",
                year = "2000",
                questionText = "Economics is fundamentally defined as the science of:",
                optionA = "reduction in financial spending in the face of austerity",
                optionB = "allocation of scarce resources among competing alternative uses",
                optionC = "commercial marketing behaviour of small business units",
                optionD = "mathematical computation of national tax aggregates",
                correctAnswerIndex = 1,
                explanation = "As formulated by Lionel Robbins, Economics studies human behaviour as a relationship between ends and scarce means which have alternative uses.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2000 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_2000_002",
                subject = "Economics",
                topic = "Fundamental Economic Problems",
                year = "2000",
                questionText = "Which combination represents the fundamental resource allocation questions in economic analysis?\nI. What and how much will be produced?\nII. How will goods be produced?\nIII. For whom will goods be produced?\nIV. How much will be exported?",
                optionA = "I, II and III",
                optionB = "I, II and IV",
                optionC = "I, III and IV",
                optionD = "II, III and IV",
                correctAnswerIndex = 0,
                explanation = "Every economic system must solve the three fundamental problems: What to produce, How to produce (technique/efficiency), and For whom to produce (distribution).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2000 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_2002_026",
                subject = "Economics",
                topic = "Cost Concepts: Fixed Costs",
                year = "2002",
                questionText = "Which of the following expenditure items is an example of a fixed cost for a manufacturing firm in the short run?",
                optionA = "Fuel and energy cost for machines",
                optionB = "Hourly wages for casual labor",
                optionC = "Rent on factory buildings",
                optionD = "Transportation and haulage expenses",
                correctAnswerIndex = 2,
                explanation = "Fixed costs (such as contractual building rent) remain constant in total amount regardless of whether factory production increases, decreases, or shuts down.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "econ_comp_2002_042",
                subject = "Economics",
                topic = "Public Finance: Fiscal Deficits & Debt",
                year = "2002",
                questionText = "National public debt is a direct and expected cumulative outcome of a recurring:",
                optionA = "deficit budget",
                optionB = "consolidated budget",
                optionC = "balanced budget",
                optionD = "surplus budget",
                correctAnswerIndex = 0,
                explanation = "When government planned expenditure exceeds projected fiscal revenue (a deficit budget), the shortfall must be financed via domestic or external borrowing, creating national debt.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Economics 2002 • Q42"
            )
        )

        return list
    }
}
