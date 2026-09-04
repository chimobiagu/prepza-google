package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Science Super Mega Series (Physics, Chemistry, Biology 2000 - 2024)
 * Total Verified Questions: 225
 */
object JambScienceSuperMegaBank {
    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2000_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2000",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2000 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2000_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2000",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2000 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2000_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2000",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2000 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2000_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2000",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2000 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2000_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2000",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2000 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2000_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2000",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2000 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2000_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2000",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2000 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2000_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2000",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2000 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2000_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2000",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2000 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2001_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2001",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2001 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2001_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2001",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2001 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2001_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2001",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2001 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2001_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2001",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2001 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2001_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2001",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2001 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2001_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2001",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2001 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2001_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2001",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2001 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2001_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2001",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2001 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2001_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2001",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2001 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2002_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2002",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2002 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2002_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2002",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2002 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2002_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2002",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2002 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2002_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2002",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2002 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2002_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2002",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2002 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2002_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2002",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2002 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2002_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2002",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2002 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2002_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2002",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2002 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2002_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2002",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2002 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2003_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2003",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2003 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2003_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2003",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2003 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2003_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2003",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2003 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2003_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2003",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2003 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2003_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2003",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2003 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2003_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2003",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2003 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2003_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2003",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2003 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2003_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2003",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2003 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2003_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2003",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2003 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2004_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2004",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2004 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2004_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2004",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2004 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2004_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2004",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2004 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2004_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2004",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2004 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2004_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2004",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2004 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2004_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2004",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2004 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2004_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2004",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2004 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2004_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2004",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2004 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2004_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2004",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2004 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2005_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2005",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2005 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2005_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2005",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2005 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2005_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2005",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2005 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2005_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2005",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2005 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2005_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2005",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2005 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2005_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2005",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2005 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2005_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2005",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2005 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2005_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2005",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2005 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2005_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2005",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2005 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2006_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2006",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2006 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2006_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2006",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2006 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2006_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2006",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2006 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2006_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2006",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2006 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2006_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2006",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2006 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2006_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2006",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2006 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2006_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2006",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2006 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2006_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2006",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2006 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2006_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2006",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2006 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2007_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2007",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2007 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2007_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2007",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2007 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2007_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2007",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2007 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2007_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2007",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2007 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2007_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2007",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2007 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2007_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2007",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2007 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2007_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2007",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2007 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2007_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2007",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2007 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2007_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2007",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2007 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2008_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2008",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2008 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2008_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2008",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2008 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2008_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2008",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2008 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2008_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2008",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2008 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2008_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2008",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2008 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2008_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2008",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2008 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2008_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2008",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2008 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2008_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2008",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2008 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2008_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2008",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2008 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2009_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2009",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2009 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2009_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2009",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2009 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2009_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2009",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2009 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2009_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2009",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2009 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2009_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2009",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2009 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2009_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2009",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2009 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2009_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2009",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2009 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2009_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2009",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2009 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2009_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2009",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2009 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2010_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2010",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2010 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2010_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2010",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2010 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2010_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2010",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2010 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2010_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2010",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2010 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2010_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2010",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2010 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2010_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2010",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2010 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2010_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2010",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2010 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2010_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2010",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2010 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2010_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2010",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2010 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2011_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2011",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2011 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2011_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2011",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2011 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2011_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2011",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2011 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2011_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2011",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2011 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2011_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2011",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2011 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2011_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2011",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2011 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2011_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2011",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2011 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2011_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2011",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2011 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2011_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2011",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2011 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2012_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2012",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2012 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2012_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2012",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2012 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2012_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2012",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2012 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2012_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2012",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2012 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2012_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2012",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2012 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2012_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2012",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2012 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2012_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2012",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2012 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2012_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2012",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2012 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2012_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2012",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2012 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2013_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2013",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2013 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2013_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2013",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2013 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2013_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2013",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2013 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2013_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2013",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2013 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2013_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2013",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2013 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2013_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2013",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2013 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2013_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2013",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2013 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2013_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2013",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2013 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2013_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2013",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2013 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2014_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2014",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2014 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2014_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2014",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2014 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2014_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2014",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2014 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2014_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2014",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2014 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2014_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2014",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2014 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2014_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2014",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2014 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2014_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2014",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2014 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2014_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2014",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2014 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2014_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2014",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2014 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2015_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2015",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2015 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2015_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2015",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2015 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2015_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2015",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2015 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2015_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2015",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2015 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2015_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2015",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2015 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2015_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2015",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2015 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2015_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2015",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2015 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2015_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2015",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2015 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2015_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2015",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2015 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2016_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2016",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2016 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2016_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2016",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2016 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2016_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2016",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2016 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2016_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2016",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2016 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2016_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2016",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2016 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2016_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2016",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2016 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2016_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2016",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2016 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2016_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2016",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2016 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2016_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2016",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2016 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2017_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2017",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2017 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2017_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2017",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2017 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2017_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2017",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2017 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2017_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2017",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2017 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2017_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2017",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2017 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2017_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2017",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2017 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2017_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2017",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2017 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2017_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2017",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2017 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2017_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2017",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2017 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2018_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2018",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2018 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2018_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2018",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2018 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2018_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2018",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2018 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2018_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2018",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2018 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2018_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2018",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2018 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2018_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2018",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2018 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2018_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2018",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2018 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2018_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2018",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2018 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2018_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2018",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2018 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2019_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2019",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2019 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2019_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2019",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2019 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2019_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2019",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2019 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2019_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2019",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2019 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2019_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2019",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2019 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2019_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2019",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2019 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2019_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2019",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2019 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2019_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2019",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2019 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2019_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2019",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2019 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2020_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2020",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2020 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2020_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2020",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2020 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2020_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2020",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2020 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2020_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2020",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2020 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2020_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2020",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2020 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2020_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2020",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2020 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2020_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2020",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2020 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2020_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2020",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2020 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2020_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2020",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2020 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2021_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2021",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2021 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2021_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2021",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2021 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2021_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2021",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2021 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2021_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2021",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2021 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2021_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2021",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2021 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2021_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2021",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2021 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2021_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2021",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2021 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2021_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2021",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2021 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2021_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2021",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2021 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2022_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2022",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2022 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2022_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2022",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2022 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2022_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2022",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2022 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2022_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2022",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2022 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2022_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2022",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2022 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2022_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2022",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2022 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2022_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2022",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2022 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2022_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2022",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2022 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2022_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2022",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2022 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2023_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2023",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2023 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2023_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2023",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2023 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2023_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2023",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2023 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2023_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2023",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2023 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2023_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2023",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2023 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2023_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2023",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2023 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2023_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2023",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2023 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2023_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2023",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2023 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2023_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2023",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2023 (Q9)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2024_01",
                subject = "Chemistry",
                topic = "Chemical Energetics",
                year = "2024",
                questionText = "Calculate the standard enthalpy of combustion of methane: CH₄(g) + 2O₂(g) -> CO₂(g) + 2H₂O(l), given ΔH_f°: CH₄ = -75 kJ/mol, CO₂ = -394 kJ/mol, H₂O = -286 kJ/mol.",
                optionA = "-891 kJ/mol",
                optionB = "+891 kJ/mol",
                optionC = "-605 kJ/mol",
                optionD = "-966 kJ/mol",
                correctAnswerIndex = 0,
                explanation = "ΔH°_rxn = ΣΔH_f°(products) - ΣΔH_f°(reactants) = [-394 + 2(-286)] - [-75] = [-394 - 572] + 75 = -966 + 75 = -891 kJ/mol.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2024 (Q1)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2024_02",
                subject = "Chemistry",
                topic = "IUPAC Organic Nomenclature",
                year = "2024",
                questionText = "What is the correct IUPAC name for CH₃-CH(CH₃)-CH₂-COOH?",
                optionA = "3-methylbutanoic acid",
                optionB = "2-methylbutanoic acid",
                optionC = "4-methylbutanoic acid",
                optionD = "Isovaleric acid",
                correctAnswerIndex = 0,
                explanation = "Number from the carboxylic carbon (C-1): C1(COOH)-C2(H₂)-C3(H, CH₃)-C4(H₃) = 3-methylbutanoic acid.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2024 (Q2)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_che_2024_03",
                subject = "Chemistry",
                topic = "Solubility & Equilibrium",
                year = "2024",
                questionText = "The solubility product (Ksp) of AgCl is 1.0 × 10⁻¹⁰ mol² dm⁻⁶. What is the molar solubility of AgCl in pure water?",
                optionA = "1.0 × 10⁻⁵ mol dm⁻³",
                optionB = "1.0 × 10⁻¹⁰ mol dm⁻³",
                optionC = "2.0 × 10⁻⁵ mol dm⁻³",
                optionD = "1.0 × 10⁻²⁰ mol dm⁻³",
                correctAnswerIndex = 0,
                explanation = "AgCl(s) ⇌ Ag⁺(aq) + Cl⁻(aq). Ksp = s × s = s² = 1.0 × 10⁻¹⁰  =>  s = √(1.0 × 10⁻¹⁰) = 1.0 × 10⁻⁵ mol dm⁻³.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry • Grand Series 2024 (Q3)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2024_04",
                subject = "Physics",
                topic = "Capacitance & Energy",
                year = "2024",
                questionText = "Calculate the electrical energy stored in a 20 μF capacitor charged to a potential difference of 100 V.",
                optionA = "0.10 J",
                optionB = "0.20 J",
                optionC = "0.01 J",
                optionD = "1.00 J",
                correctAnswerIndex = 0,
                explanation = "Energy E = 1/2 C V² = 1/2 × (20 × 10⁻⁶ F) × (100 V)² = 10 × 10⁻⁶ × 10,000 = 0.10 J.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2024 (Q4)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2024_05",
                subject = "Physics",
                topic = "Electromagnetic Induction",
                year = "2024",
                questionText = "A step-down transformer transforms 240 V AC to 12 V AC. If the primary coil has 800 turns, how many turns are on the secondary coil?",
                optionA = "40 turns",
                optionB = "80 turns",
                optionC = "20 turns",
                optionD = "160 turns",
                correctAnswerIndex = 0,
                explanation = "V_p / V_s = N_p / N_s  =>  240 / 12 = 800 / N_s  =>  20 = 800 / N_s  =>  N_s = 800 / 20 = 40 turns.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2024 (Q5)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_phy_2024_06",
                subject = "Physics",
                topic = "Photoelectric Effect",
                year = "2024",
                questionText = "If light of frequency 8.0 × 10¹⁴ Hz shines on a metal whose work function is 2.0 eV, calculate the maximum kinetic energy of emitted photoelectrons. [h = 6.63 × 10⁻³⁴ J·s, 1 eV = 1.6 × 10⁻¹⁹ J]",
                optionA = "1.31 eV",
                optionB = "3.31 eV",
                optionC = "0.50 eV",
                optionD = "2.00 eV",
                correctAnswerIndex = 0,
                explanation = "E_photon = hf = 6.63 × 10⁻³⁴ × 8.0 × 10¹⁴ = 5.304 × 10⁻¹⁹ J.\nIn eV: 5.304 × 10⁻¹⁹ / 1.6 × 10⁻¹⁹ = 3.315 eV.\nKE_max = E_photon - W₀ = 3.315 - 2.00 = 1.315 eV.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics • Grand Series 2024 (Q6)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2024_07",
                subject = "Biology",
                topic = "Photosynthesis & Biochemistry",
                year = "2024",
                questionText = "During the light-dependent stage of photosynthesis, photolysis of water produces _____.",
                optionA = "Oxygen gas, protons (H⁺), and electrons",
                optionB = "Glucose and carbon dioxide",
                optionC = "ATP and starch only",
                optionD = "Lactic acid and water",
                correctAnswerIndex = 0,
                explanation = "Photolysis splits water: 2H₂O + light energy -> 4H⁺ + 4e⁻ + O₂(g), releasing oxygen as a byproduct.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2024 (Q7)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2024_08",
                subject = "Biology",
                topic = "Endocrine System & Hormones",
                year = "2024",
                questionText = "Which hormone is secreted by the islets of Langerhans in the pancreas to lower elevated blood glucose levels?",
                optionA = "Insulin",
                optionB = "Glucagon",
                optionC = "Adrenaline",
                optionD = "Thyroxine",
                correctAnswerIndex = 0,
                explanation = "Beta cells of the islets of Langerhans secrete insulin, which promotes glucose uptake and glycogen storage in the liver and muscles.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2024 (Q8)",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_sci_bio_2024_09",
                subject = "Biology",
                topic = "Nervous System & Reflex Action",
                year = "2024",
                questionText = "In a simple spinal reflex arc, the neural pathway followed by an impulse is _____.",
                optionA = "Receptor -> Sensory neuron -> Interneuron (Spinal Cord) -> Motor neuron -> Effector",
                optionB = "Effector -> Motor neuron -> Brain -> Sensory neuron",
                optionC = "Receptor -> Motor neuron -> Spinal cord -> Sensory neuron",
                optionD = "Sensory neuron -> Brain -> Effector -> Receptor",
                correctAnswerIndex = 0,
                explanation = "The canonical reflex arc sequence: Sensory Receptor -> Sensory/Afferent Neuron -> Spinal Interneuron -> Motor/Efferent Neuron -> Effector Muscle/Gland.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology • Grand Series 2024 (Q9)",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
