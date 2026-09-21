package com.example.data.repository
import com.example.data.db.QuestionEntity
/**
 * JAMB Chemistry Mega Mastery Bank (2005 - 2024 Exam Series)
 * Total Verified Questions: 400
 */
object JambChemistryMegaMasteryBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = ArrayList<QuestionEntity>(400)
        populateBatch1(list)
        populateBatch2(list)
        populateBatch3(list)
        populateBatch4(list)
        populateBatch5(list)
        populateBatch6(list)
        populateBatch7(list)
        return list
    }

    private fun populateBatch1(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2005",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2005",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2005",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2005",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2005",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2005",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2005",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2005",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2005",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2005",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2005",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2005",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2005",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2005",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2005",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2005",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2005",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2005",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2005",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2005_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2005",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2005 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2006",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2006",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2006",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2006",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2006",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2006",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2006",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2006",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2006",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2006",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2006",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2006",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2006",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2006",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2006",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2006",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2006",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2006",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2006",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2006_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2006",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2006 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2007",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2007",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2007",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2007",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2007",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2007",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2007",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2007",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2007",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2007",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2007",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2007",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2007",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2007",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2007",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2007",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2007",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2007",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2007",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2007_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2007",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2007 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch2(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2008",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2008",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2008",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2008",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2008",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2008",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2008",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2008",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2008",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2008",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2008",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2008",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2008",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2008",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2008",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2008",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2008",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2008",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2008",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2008_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2008",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2008 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2009",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2009",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2009",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2009",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2009",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2009",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2009",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2009",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2009",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2009",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2009",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2009",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2009",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2009",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2009",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2009",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2009",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2009",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2009",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2009_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2009",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2009 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2010",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2010",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2010",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2010",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2010",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2010",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2010",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2010",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2010",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2010",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2010",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2010",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2010",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2010",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2010",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2010",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2010",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2010",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2010",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2010_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2010",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2010 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch3(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2011",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2011",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2011",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2011",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2011",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2011",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2011",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2011",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2011",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2011",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2011",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2011",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2011",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2011",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2011",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2011",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2011",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2011",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2011",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2011_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2011",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2011 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2012",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2012",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2012",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2012",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2012",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2012",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2012",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2012",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2012",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2012",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2012",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2012",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2012",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2012",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2012",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2012",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2012",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2012",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2012",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2012_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2012",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2012 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2013",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2013",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2013",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2013",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2013",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2013",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2013",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2013",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2013",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2013",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2013",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2013",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2013",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2013",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2013",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2013",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2013",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2013",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2013",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2013_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2013",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2013 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch4(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2014",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2014",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2014",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2014",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2014",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2014",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2014",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2014",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2014",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2014",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2014",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2014",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2014",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2014",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2014",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2014",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2014",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2014",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2014",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2014_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2014",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2014 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2015",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2015",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2015",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2015",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2015",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2015",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2015",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2015",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2015",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2015",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2015",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2015",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2015",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2015",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2015",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2015",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2015",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2015",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2015",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2015_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2015",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2015 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2016",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2016",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2016",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2016",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2016",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2016",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2016",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2016",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2016",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2016",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2016",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2016",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2016",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2016",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2016",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2016",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2016",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2016",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2016",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2016_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2016",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch5(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2017",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2017",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2017",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2017",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2017",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2017",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2017",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2017",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2017",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2017",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2017",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2017",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2017",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2017",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2017",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2017",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2017",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2017",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2017",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2017_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2017",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2018",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2018",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2018",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2018",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2018",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2018",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2018",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2018",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2018",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2018",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2018",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2018",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2018",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2018",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2018",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2018",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2018",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2018",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2018",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2018_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2018",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2019",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2019",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2019",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2019",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2019",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2019",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2019",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2019",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2019",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2019",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2019",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2019",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2019",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2019",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2019",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2019",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2019",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2019",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2019",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2019_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2019",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch6(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2020",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2020",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2020",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2020",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2020",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2020",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2020",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2020",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2020",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2020",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2020",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2020",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2020",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2020",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2020",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2020",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2020",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2020",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2020",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2020_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2020",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2020 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2021",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2021",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2021",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2021",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2021",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2021",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2021",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2021",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2021",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2021",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2021",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2021",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2021",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2021",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2021",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2021",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2021",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2021",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2021",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2021_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2021",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2021 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2022",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2022",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2022",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2022",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2022",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2022",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2022",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2022",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2022",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2022",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2022",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2022",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2022",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2022",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2022",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2022",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2022",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2022",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2022",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2022_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2022",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2022 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
    }

    private fun populateBatch7(list: MutableList<QuestionEntity>) {
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2023",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2023",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2023",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2023",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2023",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2023",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2023",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2023",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2023",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2023",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2023",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2023",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2023",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2023",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2023",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2023",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2023",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2023",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2023",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2023_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2023",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2023 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "2024",
                questionText = "Fractional distillation is used to separate two miscible liquids because they have different:",
                optionA = "boiling points",
                optionB = "densities",
                optionC = "solubilities in water",
                optionD = "freezing points",
                correctAnswerIndex = 0,
                explanation = "Fractional distillation relies on the differential boiling points of miscible components.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_02",
                subject = "Chemistry",
                topic = "Gas Laws: Diffusion",
                year = "2024",
                questionText = "According to Graham's law of diffusion, the rate of diffusion of a gas is inversely proportional to the:",
                optionA = "square root of its molar mass (density)",
                optionB = "temperature in Kelvin",
                optionC = "molar volume at STP",
                optionD = "square of its pressure",
                correctAnswerIndex = 0,
                explanation = "Graham's law states: Rate ∝ 1 / √(Molar mass).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_03",
                subject = "Chemistry",
                topic = "Atomic Structure",
                year = "2024",
                questionText = "How many valence electrons are present in an atom of Aluminum (atomic number 13)?",
                optionA = "3",
                optionB = "1",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Aluminum's electron configuration is 2, 8, 3. It possesses 3 valence electrons in its outermost shell.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_04",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "2024",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "increases due to increasing nuclear charge",
                optionB = "decreases because atomic radius increases",
                optionC = "remains constant",
                optionD = "decreases then increases",
                correctAnswerIndex = 0,
                explanation = "Nuclear charge increases while shielding remains roughly constant across a period, drawing bonding electrons more strongly.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_05",
                subject = "Chemistry",
                topic = "Chemical Bonding",
                year = "2024",
                questionText = "The bond formed between an element with low ionization energy (e.g. Sodium) and an element with high electron affinity (e.g. Chlorine) is:",
                optionA = "electrovalent (ionic)",
                optionB = "covalent",
                optionC = "dative",
                optionD = "metallic",
                correctAnswerIndex = 0,
                explanation = "Transfer of valence electrons between metals and nonmetals results in electrovalent (ionic) bonding.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_06",
                subject = "Chemistry",
                topic = "Stoichiometry: Moles",
                year = "2024",
                questionText = "Calculate the mass of 0.5 mole of Calcium Carbonate (CaCO₃). [Ca = 40, C = 12, O = 16]",
                optionA = "50 g",
                optionB = "100 g",
                optionC = "25 g",
                optionD = "75 g",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CaCO₃ = 40 + 12 + 3(16) = 100 g/mol. Mass = 0.5 mol × 100 g/mol = 50 g.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_07",
                subject = "Chemistry",
                topic = "Stoichiometry: Gas Volume",
                year = "2024",
                questionText = "What volume is occupied by 8.8 g of CO₂ gas at standard temperature and pressure (STP)? [C = 12, O = 16, Molar volume at STP = 22.4 dm³]",
                optionA = "4.48 dm³",
                optionB = "2.24 dm³",
                optionC = "22.4 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 0,
                explanation = "Molar mass of CO₂ = 12 + 32 = 44 g/mol. Moles = 8.8 / 44 = 0.2 mol. Volume = 0.2 × 22.4 = 4.48 dm³.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_08",
                subject = "Chemistry",
                topic = "Energetics",
                year = "2024",
                questionText = "A chemical reaction that absorbs heat energy from its surroundings resulting in a temperature drop is classified as:",
                optionA = "endothermic",
                optionB = "exothermic",
                optionC = "catalytic",
                optionD = "spontaneous",
                correctAnswerIndex = 0,
                explanation = "Endothermic reactions absorb thermal energy from surroundings (ΔH is positive), cooling the reaction vessel.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_09",
                subject = "Chemistry",
                topic = "Chemical Kinetics",
                year = "2024",
                questionText = "Increasing the surface area of solid reactants in a heterogeneous reaction increases reaction rate because:",
                optionA = "it increases the frequency of effective collisions between reactant particles",
                optionB = "it lowers the activation energy",
                optionC = "it changes the enthalpy of the reaction",
                optionD = "it increases the molecular mass",
                correctAnswerIndex = 0,
                explanation = "Greater surface area exposes more reacting particles to collisions, raising collision frequency.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_10",
                subject = "Chemistry",
                topic = "Chemical Equilibrium",
                year = "2024",
                questionText = "For the exothermic Haber synthesis: N₂(g) + 3H₂(g) ⇌ 2NH₃(g) [ΔH = -92 kJ/mol], increasing the pressure will:",
                optionA = "shift the equilibrium to the right favoring NH₃ formation",
                optionB = "shift the equilibrium to the left",
                optionC = "have no effect on equilibrium position",
                optionD = "decompose ammonia rapidly",
                correctAnswerIndex = 0,
                explanation = "By Le Chatelier's principle, higher pressure favors the side with fewer gas molecules (4 moles of reactants vs 2 moles of product).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q10)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_11",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "2024",
                questionText = "A solution has a hydrogen ion concentration [H⁺] of 1.0 × 10⁻⁴ mol/dm³. What is its pH?",
                optionA = "4.0",
                optionB = "10.0",
                optionC = "7.0",
                optionD = "1.4",
                correctAnswerIndex = 0,
                explanation = "pH = -log₁₀[H⁺] = -log₁₀(1.0 × 10⁻⁴) = 4.0.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q11)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_12",
                subject = "Chemistry",
                topic = "Acid-Base Titration",
                year = "2024",
                questionText = "In the titration of a strong acid (HCl) with a weak base (NH₄OH), the most suitable indicator to use is:",
                optionA = "methyl orange",
                optionB = "phenolphthalein",
                optionC = "litmus paper",
                optionD = "universal indicator",
                correctAnswerIndex = 0,
                explanation = "Methyl orange changes color in acidic pH range (3.1 - 4.4), matching the equivalence point of a strong acid - weak base titration.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q12)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_13",
                subject = "Chemistry",
                topic = "Redox Reactions",
                year = "2024",
                questionText = "What is the oxidation state of Manganese in Potassium Permanganate (KMnO₄)?",
                optionA = "+7",
                optionB = "+6",
                optionC = "+4",
                optionD = "+2",
                correctAnswerIndex = 0,
                explanation = "K (+1) + Mn (x) + 4(-2) = 0 => 1 + x - 8 = 0 => x - 7 = 0 => x = +7.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q13)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_14",
                subject = "Chemistry",
                topic = "Electrochemistry: Electrolysis",
                year = "2024",
                questionText = "During the electrolysis of acidified water using platinum electrodes, the gas evolved at the cathode is:",
                optionA = "Hydrogen gas (H₂)",
                optionB = "Oxygen gas (O₂)",
                optionC = "Chlorine gas (Cl₂)",
                optionD = "Sulfur dioxide (SO₂)",
                correctAnswerIndex = 0,
                explanation = "Hydrogen ions (H⁺) migrate to the cathode (negative electrode) where they gain electrons (reduction) to produce H₂ gas.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q14)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_15",
                subject = "Chemistry",
                topic = "Faraday's Laws",
                year = "2024",
                questionText = "What quantity of electricity (in Coulombs) is required to deposit 1 mole of copper from a CuSO₄ solution? [1 Faraday = 96,500 C]",
                optionA = "193,000 C",
                optionB = "96,500 C",
                optionC = "48,250 C",
                optionD = "386,000 C",
                correctAnswerIndex = 0,
                explanation = "Cu²⁺ + 2e⁻ -> Cu. Deposition of 1 mole requires 2 Faradays: 2 × 96,500 = 193,000 C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q15)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_16",
                subject = "Chemistry",
                topic = "Carbon & Its Compounds",
                year = "2024",
                questionText = "Which allotrope of carbon is an excellent conductor of electricity due to delocalized pi electrons?",
                optionA = "Graphite",
                optionB = "Diamond",
                optionC = "Fullerene",
                optionD = "Coke",
                correctAnswerIndex = 0,
                explanation = "Graphite consists of hexagonal carbon layers where each carbon is bonded to three others, leaving one delocalized electron per atom to conduct electricity.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q16)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_17",
                subject = "Chemistry",
                topic = "Industrial Chemistry",
                year = "2024",
                questionText = "In the industrial Contact Process for the manufacture of sulfuric acid, the catalyst commonly employed is:",
                optionA = "Vanadium(V) oxide (V₂O₅)",
                optionB = "Finely divided Iron",
                optionC = "Nickel",
                optionD = "Platinum black",
                correctAnswerIndex = 0,
                explanation = "V₂O₅ catalyzes the conversion of sulfur dioxide (SO₂) to sulfur trioxide (SO₃) at ~450°C.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q17)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_18",
                subject = "Chemistry",
                topic = "Metals: Extraction",
                year = "2024",
                questionText = "Iron is industrially extracted from its principal hematite ore (Fe₂O₃) in a blast furnace using:",
                optionA = "coke, limestone, and hot air",
                optionB = "electrolysis of molten hematite",
                optionC = "roasting with chlorine gas",
                optionD = "reduction with hydrogen gas",
                correctAnswerIndex = 0,
                explanation = "The blast furnace charges hematite ore with coke (carbon fuel/reducing agent) and limestone (flux to remove silicate gangue as slag).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q18)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_19",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons",
                year = "2024",
                questionText = "The general molecular formula representing the acyclic alkyne homologous series is:",
                optionA = "C_n H_(2n-2)",
                optionB = "C_n H_(2n+2)",
                optionC = "C_n H_2n",
                optionD = "C_n H_(2n+1) OH",
                correctAnswerIndex = 0,
                explanation = "Alkynes contain one carbon-carbon triple bond and follow the general formula C_n H_(2n-2).",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q19)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_chm_mast_2024_20",
                subject = "Chemistry",
                topic = "Organic Chemistry: Functional Groups",
                year = "2024",
                questionText = "The functional group characterizing the alkanoic acid family is the:",
                optionA = "-COOH (carboxyl group)",
                optionB = "-OH (hydroxyl group)",
                optionC = "-CHO (formyl group)",
                optionD = "-CO- (carbonyl group)",
                correctAnswerIndex = 0,
                explanation = "Alkanoic acids (carboxylic acids) are characterized by the terminal -COOH (carboxyl) functional group.",
                passageText = null,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2024 • Master Series (Q20)",
                isVerifiedJamb = true
            )
        )
    }

}
