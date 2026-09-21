package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned, standardized, and authentic JAMB Chemistry past examination series
 * covering historical papers from 1983 through 2004.
 * Formatted into standard 4-option structure (A-D) with verified keys, topics,
 * and detailed step-by-step educational explanations.
 */
object JambChemistryHistoricalQuestionBank {

    fun getHistoricalChemistryQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // ==========================================
        // 1983 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q1
        list.add(
            QuestionEntity(
                id = "chm_1983_01",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts",
                year = "1983",
                questionText = "X is a crystalline salt of sodium. Solution of X in water turns litmus red and produces a gas which turns lime water milky when added to sodium carbonate. With barium chloride solution, X gives a white precipitate which is insoluble in dilute hydrochloric acid. X is:",
                optionA = "Na₂CO₃",
                optionB = "NaHCO₃",
                optionC = "NaHSO₄",
                optionD = "Na₂SO₄",
                correctAnswerIndex = 2,
                explanation = "NaHSO₄ (sodium hydrogen tetraoxosulphate(VI)) is an acid salt that hydrolyzes to turn blue litmus red. It reacts with carbonates to release CO₂ gas (which turns lime water milky) and provides SO₄²⁻ ions that precipitate with Ba²⁺ to form insoluble BaSO₄.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q2
        list.add(
            QuestionEntity(
                id = "chm_1983_02",
                subject = "Chemistry",
                topic = "Organic Chemistry (Alkanols & Saponification)",
                year = "1983",
                questionText = "The alkanol obtained from the production of soap is:",
                optionA = "Ethanol",
                optionB = "Glycerol",
                optionC = "Methanol",
                optionD = "Propanol",
                correctAnswerIndex = 1,
                explanation = "Glycerol (propane-1,2,3-triol) is a trihydric alkanol produced as a major sweet-tasting by-product during the alkaline hydrolysis (saponification) of vegetable oils or animal fats to yield soap.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q3
        list.add(
            QuestionEntity(
                id = "chm_1983_03",
                subject = "Chemistry",
                topic = "Hydrocarbons (Alkynes & Industrial Uses)",
                year = "1983",
                questionText = "The flame used by welders in cutting and joining metals is:",
                optionA = "Butane gas flame",
                optionB = "Acetylene flame in air",
                optionC = "Kerosene flame",
                optionD = "Oxy-acetylene flame",
                correctAnswerIndex = 3,
                explanation = "The combustion of ethyne (acetylene) in pure oxygen produces the oxy-acetylene flame, reaching extremely high temperatures (> 3000°C) capable of melting, cutting, and welding metals.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q4
        list.add(
            QuestionEntity(
                id = "chm_1983_04",
                subject = "Chemistry",
                topic = "Organic Chemistry (Homologous Series)",
                year = "1983",
                questionText = "Consecutive members of an alkane homologous series differ by:",
                optionA = "CH",
                optionB = "CH₂",
                optionC = "CH₃",
                optionD = "CₙH₂ₙ₊₂",
                correctAnswerIndex = 1,
                explanation = "Consecutive members in any homologous series differ by a constant methylene group (-CH₂-), corresponding to a molecular mass difference of 14 g/mol.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "chm_1983_05",
                subject = "Chemistry",
                topic = "Atomic Structure & Periodic Table",
                year = "1983",
                questionText = "If an element has the electronic configuration 1s² 2s² 2p⁶ 3s² 3p², it is:",
                optionA = "A reactive alkali metal",
                optionB = "An alkaline earth metal",
                optionC = "An s-block element",
                optionD = "A p-block element",
                correctAnswerIndex = 3,
                explanation = "The highest energy electrons occupy the 3p subshell (3p²), which places this element (Silicon, Z=14) squarely in the p-block of the Periodic Table.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q6
        list.add(
            QuestionEntity(
                id = "chm_1983_06",
                subject = "Chemistry",
                topic = "Water of Crystallization & Stoichiometry",
                year = "1983",
                questionText = "Some copper (II) sulphate pentahydrate (CuSO₄·5H₂O) was heated at 120°C with the following results: Mass of crucible = 10.00 g; Mass of crucible + CuSO₄·5H₂O = 14.98 g; Mass of crucible + residue = 13.54 g. How many molecules of water of crystallization were lost? [H=1, Cu=63.5, O=16, S=32]",
                optionA = "1",
                optionB = "2",
                optionC = "3",
                optionD = "4",
                correctAnswerIndex = 3,
                explanation = "Mass of hydrate = 14.98 - 10.00 = 4.98 g. Molar mass of CuSO₄·5H₂O = 249.5 g/mol. Moles of hydrate = 4.98 / 249.5 = 0.020 mol. Mass of water lost = 14.98 - 13.54 = 1.44 g. Moles of water lost = 1.44 / 18 = 0.080 mol. Ratio = 0.080 / 0.020 = 4 molecules.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q7
        list.add(
            QuestionEntity(
                id = "chm_1983_07",
                subject = "Chemistry",
                topic = "Chemical Bonding & Shapes of Molecules",
                year = "1983",
                questionText = "The three-dimensional spatial geometry of a methane molecule (CH₄) is:",
                optionA = "Hexagonal planar",
                optionB = "Trigonal bipyramidal",
                optionC = "Linear",
                optionD = "Tetrahedral",
                correctAnswerIndex = 3,
                explanation = "Methane has four sp³ hybrid orbitals that repel equally to minimize electron repulsion (VSEPR theory), orienting symmetrically toward the corners of a regular tetrahedron with bond angles of 109.5°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q8
        list.add(
            QuestionEntity(
                id = "chm_1983_08",
                subject = "Chemistry",
                topic = "Organic Chemistry (Esterification)",
                year = "1983",
                questionText = "Compound W (obtained by reacting ethanol with ethanoic acid in the presence of concentrated H₂SO₄) belongs to which homologous series?",
                optionA = "Soap",
                optionB = "An alkane",
                optionC = "An ester",
                optionD = "An ether",
                correctAnswerIndex = 2,
                explanation = "The reaction of an alkanol (ethanol) with an alkanoic acid (ethanoic acid) in the presence of a mineral acid catalyst forms ethyl ethanoate, an ester with a pleasant fruity smell (esterification).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q9
        list.add(
            QuestionEntity(
                id = "chm_1983_09",
                subject = "Chemistry",
                topic = "Empirical & Molecular Formula",
                year = "1983",
                questionText = "The molecular formula of compound X with a relative molecular mass of 180 and an atomic ratio of C, H, O of 1:2:1 is: [C=12, H=1, O=16]",
                optionA = "C₁₂H₂₂O₁₁",
                optionB = "C₆H₁₂O₆",
                optionC = "C₃H₆O₃",
                optionD = "C₅H₁₀O₅",
                correctAnswerIndex = 1,
                explanation = "The empirical formula is CH₂O, with empirical formula mass = 12 + 2(1) + 16 = 30 g/mol. The multiplier n = 180 / 30 = 6. Thus, the molecular formula is (CH₂O)₆ = C₆H₁₂O₆ (glucose).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "chm_1983_10",
                subject = "Chemistry",
                topic = "Industrial Chemistry (Fermentation)",
                year = "1983",
                questionText = "The anaerobic fermentation of glucose (compound X) with yeast forms the basis of the:",
                optionA = "Plastics industry",
                optionB = "Textile industry",
                optionC = "Brewing industry",
                optionD = "Detergent industry",
                correctAnswerIndex = 2,
                explanation = "Zymase enzymes present in yeast convert glucose into ethanol and carbon dioxide (C₆H₁₂O₆ → 2C₂H₅OH + 2CO₂), which is the biochemical foundation of the brewing and alcoholic beverage industry.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q11
        list.add(
            QuestionEntity(
                id = "chm_1983_11",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "1983",
                questionText = "A mixture of common salt (NaCl), ammonium chloride (NH₄Cl), and barium sulphate (BaSO₄) can best be separated in sequence by:",
                optionA = "Addition of water followed by filtration then sublimation",
                optionB = "Addition of water followed by sublimation then filtration",
                optionC = "Sublimation followed by addition of water then filtration",
                optionD = "Fractional distillation followed by crystallization",
                correctAnswerIndex = 2,
                explanation = "Heating the dry mixture sublimates volatile NH₄Cl. Adding water dissolves the soluble NaCl while leaving insoluble BaSO₄ behind, which is separated by filtration. Evaporation then recovers NaCl.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q12
        list.add(
            QuestionEntity(
                id = "chm_1983_12",
                subject = "Chemistry",
                topic = "Gas Laws & Kinetic Theory",
                year = "1983",
                questionText = "Which of the following mathematical proportionalities represents ideal gas behavior?",
                optionA = "P ∝ V · T",
                optionB = "P ∝ T / V",
                optionC = "P · T ∝ V",
                optionD = "P · V ∝ V · T",
                correctAnswerIndex = 1,
                explanation = "From the Ideal Gas Law PV = nRT, rearranging for pressure gives P = (nRT)/V, which implies that P is directly proportional to absolute temperature T and inversely proportional to volume V (P ∝ T/V).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q13
        list.add(
            QuestionEntity(
                id = "chm_1983_13",
                subject = "Chemistry",
                topic = "Gases & Diffusion (Graham's Law)",
                year = "1983",
                questionText = "In an experiment where solid ammonium chloride is heated in a test tube with a damp neutral litmus paper placed at the mouth, the litmus paper will initially:",
                optionA = "Be bleached colorless",
                optionB = "Turn bright green",
                optionC = "Turn red immediately",
                optionD = "Turn blue first",
                correctAnswerIndex = 3,
                explanation = "NH₄Cl thermal decomposition yields NH₃ (molar mass 17) and HCl (molar mass 36.5). By Graham's law, lighter NH₃ gas diffuses faster and reaches the mouth first, turning the damp litmus paper blue before acidic HCl arrives.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q16
        list.add(
            QuestionEntity(
                id = "chm_1983_16",
                subject = "Chemistry",
                topic = "Redox Reactions & Oxidation States",
                year = "1983",
                questionText = "In which of the following chemical processes is iron being oxidized?\n\n(1) Fe + H₂SO₄ → H₂ + FeSO₄\n(2) FeSO₄ + H₂S → FeS + H₂SO₄\n(3) 2FeCl₂ + Cl₂ → 2FeCl₃\n(4) 2FeCl₃ + SnCl₂ → 2FeCl₂ + SnCl₄",
                optionA = "1 only",
                optionB = "2 only",
                optionC = "3 only",
                optionD = "1 and 3 only",
                correctAnswerIndex = 3,
                explanation = "Oxidation involves an increase in oxidation number: In (1), Fe⁰ → Fe²⁺ (oxidation); In (3), Fe²⁺ → Fe³⁺ (oxidation). In (2) there is no change in oxidation state (+2 to +2), and in (4) Fe is reduced (+3 to +2).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q17
        list.add(
            QuestionEntity(
                id = "chm_1983_17",
                subject = "Chemistry",
                topic = "Electrochemistry & Faraday's Laws",
                year = "1983",
                questionText = "A steady current was passed for 10 minutes and 0.63 g of copper was deposited on the cathode of a CuSO₄ voltameter. What mass of silver would be deposited on a AgNO₃ voltameter connected in series during the same period? [Cu = 63, Ag = 108]",
                optionA = "0.54 g",
                optionB = "1.08 g",
                optionC = "1.62 g",
                optionD = "2.16 g",
                correctAnswerIndex = 3,
                explanation = "By Faraday's second law: (Mass of Ag / Equivalent mass of Ag) = (Mass of Cu / Equivalent mass of Cu). Eq. mass of Ag = 108/1 = 108; Eq. mass of Cu = 63/2 = 31.5. Mass of Ag = 0.63 × (108 / 31.5) = 2.16 g.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q18
        list.add(
            QuestionEntity(
                id = "chm_1983_18",
                subject = "Chemistry",
                topic = "Electrochemical Series & Reactivity",
                year = "1983",
                questionText = "In the displacement reaction Fe + Cu²⁺ → Fe²⁺ + Cu, iron readily displaces copper ions from solution. This occurs because:",
                optionA = "Iron is in metallic form while copper is in ionic form",
                optionB = "The atomic weight of copper is greater than that of iron",
                optionC = "Copper has more valence electrons than iron",
                optionD = "Iron is higher in the electrochemical series than copper",
                correctAnswerIndex = 3,
                explanation = "Iron lies higher than copper in the activity (electrochemical) series, meaning iron has a greater tendency to lose electrons (higher oxidation potential) and can spontaneously reduce Cu²⁺ ions to metallic copper.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q19
        list.add(
            QuestionEntity(
                id = "chm_1983_19",
                subject = "Chemistry",
                topic = "IUPAC Nomenclature of Alkenes",
                year = "1983",
                questionText = "The correct IUPAC systematic name of the compound with the structural formula C₂H₅-C(CH₃)=CH₂ is:",
                optionA = "2-methylbut-1-ene",
                optionB = "2-methylbut-2-ene",
                optionC = "3-methylbut-1-ene",
                optionD = "2-methylprop-1-ene",
                correctAnswerIndex = 0,
                explanation = "The longest continuous carbon chain containing the double bond has 4 carbons (but-1-ene, numbered from the double bond end as C1). At C2, there is a methyl substituent group (-CH₃), giving 2-methylbut-1-ene.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q21
        list.add(
            QuestionEntity(
                id = "chm_1983_21",
                subject = "Chemistry",
                topic = "Non-Metals & Their Compounds (Sulphur)",
                year = "1983",
                questionText = "A piece of burning sulphur continues to burn in a gas jar of oxygen to give misty fumes which readily dissolve in water. The resulting liquid solution is:",
                optionA = "Sulphur (VI) trioxide",
                optionB = "Tetraoxosulphate (VI) acid",
                optionC = "Trioxosulphate (IV) acid",
                optionD = "Dioxosulphate (II) acid",
                correctAnswerIndex = 2,
                explanation = "Sulphur burns in oxygen to form sulphur dioxide gas (S + O₂ → SO₂). Dissolving SO₂ in water produces trioxosulphate (IV) acid, also known as sulphurous acid (SO₂ + H₂O → H₂SO₃).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "chm_1983_22",
                subject = "Chemistry",
                topic = "Solubility & Efflorescence",
                year = "1983",
                questionText = "Sodium sulphate decahydrate (Na₂SO₄·10H₂O) on exposure to dry atmospheric air loses its water of crystallization to become powdery. This process is known as:",
                optionA = "Efflorescence",
                optionB = "Hygroscopy",
                optionC = "Deliquescence",
                optionD = "Dehydration",
                correctAnswerIndex = 0,
                explanation = "Efflorescence is the spontaneous loss of water of crystallization by hydrated crystals when exposed to the air because the vapour pressure of the hydrate exceeds that of water vapour in the surrounding atmosphere.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q23
        list.add(
            QuestionEntity(
                id = "chm_1983_23",
                subject = "Chemistry",
                topic = "Electrolysis of Molten Salts",
                year = "1983",
                questionText = "Which of the following primary chemical changes happens at the electrode during the electrolysis of molten sodium chloride?",
                optionA = "Sodium ion loses an electron",
                optionB = "Chlorine atom gains an electron",
                optionC = "Chloride ion gains an electron",
                optionD = "Chloride ion is oxidized",
                correctAnswerIndex = 3,
                explanation = "At the positive anode, chloride ions (Cl⁻) lose electrons to form chlorine gas (2Cl⁻ → Cl₂ + 2e⁻). The loss of electrons represents oxidation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q24
        list.add(
            QuestionEntity(
                id = "chm_1983_24",
                subject = "Chemistry",
                topic = "Environmental Chemistry & Pollution",
                year = "1983",
                questionText = "Crude petroleum pollutants usually seen on Nigerian creeks and coastal waterways can effectively be dispersed or remediated by:",
                optionA = "Heating the affected water bodies to boil off petroleum",
                optionB = "Mechanically stirring to dissolve petroleum in water",
                optionC = "Pouring organic solvents to dissolve the petroleum",
                optionD = "Spraying the surface with specialized detergents",
                correctAnswerIndex = 3,
                explanation = "Detergents contain surfactant molecules with hydrophilic heads and hydrophobic tails that emulsify oil slicks into tiny colloidal droplets, dispersing the petroleum across the water column for natural biodegradation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q25
        list.add(
            QuestionEntity(
                id = "chm_1983_25",
                subject = "Chemistry",
                topic = "Periodic Trends (Electronegativity)",
                year = "1983",
                questionText = "An element is defined as electronegative if:",
                optionA = "It readily exists in gaseous molecular form",
                optionB = "Its ions dissolve readily in polar solvents",
                optionC = "It has a marked tendency to lose electrons",
                optionD = "It has a marked tendency to attract or gain electrons",
                correctAnswerIndex = 3,
                explanation = "Electronegativity is the relative power or tendency of an atom in a molecule to attract shared bonding electrons or gain electrons to form stable negative anions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q26
        list.add(
            QuestionEntity(
                id = "chm_1983_26",
                subject = "Chemistry",
                topic = "Acids, Bases & pH Scale",
                year = "1983",
                questionText = "Solutions X, Y, and Z have pH values 3.0, 5.0, and 9.0 respectively. Which of the following statements is correct?",
                optionA = "All the solutions are acidic",
                optionB = "All the solutions are basic",
                optionC = "Y and Z are more acidic than water",
                optionD = "Z is the least acidic solution",
                correctAnswerIndex = 3,
                explanation = "The pH scale ranges from 0 (most acidic) to 14 (most alkaline), with 7 being neutral. Lower pH values indicate higher hydrogen ion concentration. Solution Z has a pH of 9.0 (basic), making it the least acidic of the three.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q28
        list.add(
            QuestionEntity(
                id = "chm_1983_28",
                subject = "Chemistry",
                topic = "Metals & Reactivity Series",
                year = "1983",
                questionText = "Which of the following metals (Mg, Fe, Pb, and Cu) will react and dissolve in dilute hydrochloric acid?",
                optionA = "All the metals (Mg, Fe, Pb, Cu)",
                optionB = "Mg, Fe, and Cu",
                optionC = "Mg, Fe, and Pb",
                optionD = "Mg and Fe only",
                correctAnswerIndex = 2,
                explanation = "Metals positioned above hydrogen in the electrochemical/reactivity series (Mg, Fe, Pb) displace hydrogen from dilute non-oxidizing acids like HCl, forming metal chlorides and H₂ gas. Copper is below hydrogen and will not dissolve.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q29
        list.add(
            QuestionEntity(
                id = "chm_1983_29",
                subject = "Chemistry",
                topic = "Metals & Alloys",
                year = "1983",
                questionText = "Stainless steel is an alloy composed primarily of:",
                optionA = "Carbon, iron, and lead",
                optionB = "Carbon, iron, and chromium",
                optionC = "Carbon, iron, and copper",
                optionD = "Carbon and iron only",
                correctAnswerIndex = 1,
                explanation = "Stainless steel is an alloy of iron, carbon, and chromium (often with nickel), where chromium provides excellent corrosion resistance by forming a passive oxide layer.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q30
        list.add(
            QuestionEntity(
                id = "chm_1983_30",
                subject = "Chemistry",
                topic = "Volumetric Analysis (Acid-Base Titration)",
                year = "1983",
                questionText = "What volume of 0.50 M H₂SO₄ will exactly neutralize 20 cm³ of 0.1 M NaOH solution?",
                optionA = "2.0 cm³",
                optionB = "5.0 cm³",
                optionC = "6.8 cm³",
                optionD = "8.3 cm³",
                correctAnswerIndex = 0,
                explanation = "The neutralization reaction is H₂SO₄ + 2NaOH → Na₂SO₄ + 2H₂O. Using the volumetric mole ratio: (Cₐ × Vₐ) / (C_b × V_b) = nₐ / n_b ⇒ (0.50 × Vₐ) / (0.10 × 20) = 1 / 2. This gives 0.50 × Vₐ = 1.0 ⇒ Vₐ = 2.0 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q35
        list.add(
            QuestionEntity(
                id = "chm_1983_35",
                subject = "Chemistry",
                topic = "Gas Laws & Kinetic Theory",
                year = "1983",
                questionText = "Increasing the external pressure on a fixed mass of gas at constant temperature will:",
                optionA = "Lower the average kinetic energy of the molecules",
                optionB = "Decrease the density of the gas",
                optionC = "Decrease the temperature of the gas",
                optionD = "Increase the density of the gas",
                correctAnswerIndex = 3,
                explanation = "By Boyle's law (P₁V₁ = P₂V₂), increasing pressure decreases volume. Since density = mass / volume, compressing a fixed mass into a smaller volume increases its density.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q36
        list.add(
            QuestionEntity(
                id = "chm_1983_36",
                subject = "Chemistry",
                topic = "Water of Crystallization Calculations",
                year = "1983",
                questionText = "2.50 g of a hydrated barium salt gave on heating 2.13 g of the anhydrous salt. Given that the relative molecular mass of the anhydrous salt is 208, what is the number of molecules of water of crystallization in the barium salt? [H=1, O=16]",
                optionA = "10",
                optionB = "7",
                optionC = "5",
                optionD = "2",
                correctAnswerIndex = 3,
                explanation = "Mass of water lost = 2.50 - 2.13 = 0.37 g. Moles of anhydrous salt = 2.13 / 208 = 0.01024 mol. Moles of H₂O = 0.37 / 18 = 0.02055 mol. Ratio of H₂O to salt = 0.02055 / 0.01024 ≈ 2 molecules (e.g. BaCl₂·2H₂O).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q43
        list.add(
            QuestionEntity(
                id = "chm_1983_43",
                subject = "Chemistry",
                topic = "Stoichiometry & Combustion of Hydrocarbons",
                year = "1983",
                questionText = "A jet plane carrying 3,000 kg of ethane burns off all the gas forming water and carbon dioxide. If all the carbon dioxide is expelled and the water formed is condensed and kept on board the plane, what is the net gain in weight?",
                optionA = "1,800 kg",
                optionB = "900 kg",
                optionC = "600 kg",
                optionD = "2,400 kg",
                correctAnswerIndex = 3,
                explanation = "The balanced combustion equation is: 2C₂H₆ + 7O₂ → 4CO₂ + 6H₂O. For 60 kg of ethane, 224 kg of O₂ is consumed from the atmosphere, 176 kg of CO₂ is expelled, and 108 kg of H₂O is retained. Scaling for 3,000 kg ethane (multiplier = 50): atmospheric O₂ intake = 11,200 kg; CO₂ vented = 8,800 kg. Net gain in weight = 11,200 - 8,800 = 2,400 kg (or 5,400 kg water retained - 3,000 kg initial ethane = 2,400 kg).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // Q48
        list.add(
            QuestionEntity(
                id = "chm_1983_48",
                subject = "Chemistry",
                topic = "Rates of Chemical Reactions",
                year = "1983",
                questionText = "The rate of the chemical reaction Zn(s) + H₂SO₄(aq) → ZnSO₄(aq) + H₂(g) will be greatly increased if:",
                optionA = "The zinc is used in finely powdered form",
                optionB = "A greater total volume of the acid is used",
                optionC = "A smaller volume of the acid is used",
                optionD = "The zinc is used in the form of large pellets",
                correctAnswerIndex = 0,
                explanation = "Using finely powdered zinc increases the surface area exposed to acid collision per unit time, resulting in a higher frequency of effective collisions and significantly accelerating the reaction rate.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1983"
            )
        )

        // ==========================================
        // 1984 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q1
        list.add(
            QuestionEntity(
                id = "chm_1984_01",
                subject = "Chemistry",
                topic = "Separation Techniques",
                year = "1984",
                questionText = "Solid sodium chloride (table salt) may best be recovered from natural brine by:",
                optionA = "Titration",
                optionB = "Decantation",
                optionC = "Fractional distillation",
                optionD = "Evaporation",
                correctAnswerIndex = 3,
                explanation = "Sodium chloride is a non-volatile solid dissolved in water. Heating brine drives off the water solvent through evaporation to dryness, leaving crystalline sodium chloride behind.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q2
        list.add(
            QuestionEntity(
                id = "chm_1984_02",
                subject = "Chemistry",
                topic = "Gay-Lussac's Law & Eudiometry",
                year = "1984",
                questionText = "20 cm³ of hydrogen gas are sparked with 20 cm³ of oxygen gas in an eudiometer at 373 K and 1 atm. The resulting mixture is cooled to 298 K and passed over anhydrous calcium chloride. What is the volume of the residual gas?",
                optionA = "40 cm³",
                optionB = "20 cm³",
                optionC = "30 cm³",
                optionD = "10 cm³",
                correctAnswerIndex = 3,
                explanation = "Reaction: 2H₂(g) + O₂(g) → 2H₂O(l). By Gay-Lussac's law, 20 cm³ of H₂ reacts completely with 10 cm³ of O₂. The unreacted O₂ is 20 - 10 = 10 cm³. Upon cooling to 298 K and absorbing water vapour with CaCl₂, 10 cm³ of pure O₂ gas remains.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q3
        list.add(
            QuestionEntity(
                id = "chm_1984_03",
                subject = "Chemistry",
                topic = "Stoichiometry & Molar Gas Volume",
                year = "1984",
                questionText = "For the thermal decomposition reaction NH₄NO₂ → N₂ + 2H₂O, calculate the volume of nitrogen gas produced at S.T.P. from 3.20 g of ammonium dioxonitrate (III). [N=14, O=16, H=1, Molar volume at STP = 22.4 dm³]",
                optionA = "2.24 dm³",
                optionB = "2.24 cm³",
                optionC = "4.48 dm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 3,
                explanation = "Molar mass of NH₄NO₂ = 14 + 4(1) + 14 + 2(16) = 64 g/mol. Moles of NH₄NO₂ = 3.20 / 64 = 0.05 mol. Since 1 mole NH₄NO₂ yields 1 mole N₂: Volume of N₂ = 0.05 × 22.4 dm³ = 1.12 dm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q4
        list.add(
            QuestionEntity(
                id = "chm_1984_04",
                subject = "Chemistry",
                topic = "Chemical Equations & Stoichiometry",
                year = "1984",
                questionText = "Manganese (IV) oxide reacts with concentrated hydrochloric acid according to the equation: MnO₂ + xHCl → MnCl₂ + Cl₂ + yH₂O. The stoichiometric coefficients x and y are respectively:",
                optionA = "2 and 5",
                optionB = "2 and 4",
                optionC = "4 and 2",
                optionD = "4 and 1",
                correctAnswerIndex = 2,
                explanation = "Balancing chlorine: right side has 2 + 2 = 4 Cl atoms, so x = 4. Balancing hydrogen: left side has 4 H atoms, so 2y = 4 ⇒ y = 2. The balanced equation is MnO₂ + 4HCl → MnCl₂ + Cl₂ + 2H₂O.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "chm_1984_05",
                subject = "Chemistry",
                topic = "Volumetric Analysis & Concentration",
                year = "1984",
                questionText = "A 1.0 M (molar) standard solution of caustic soda (NaOH) can be prepared in the laboratory by dissolving:",
                optionA = "40 g NaOH in 100 g of water",
                optionB = "40 g NaOH in 1000 g of water",
                optionC = "20 g NaOH in 500 cm³ of solution",
                optionD = "20 g NaOH in 1000 cm³ of solution",
                correctAnswerIndex = 2,
                explanation = "Molar mass of NaOH = 23 + 16 + 1 = 40 g/mol. A 1 M solution requires 1 mol/dm³ = 40 g in 1000 cm³. Proportionally, 20 g (0.5 mol) dissolved in 500 cm³ (0.5 dm³) of solution provides exactly (0.5 mol / 0.5 dm³) = 1.0 M.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q11
        list.add(
            QuestionEntity(
                id = "chm_1984_11",
                subject = "Chemistry",
                topic = "Chemical Equations & Stoichiometry",
                year = "1984",
                questionText = "The balanced chemical equation for the neutralization reaction of tetraoxosulphate (VI) acid with aluminium hydroxide is:",
                optionA = "H₂SO₄ + AlSO₄ → 2H₂O + AlSO₄",
                optionB = "HSO₄ + AlOH → H₂O + AlSO₄",
                optionC = "3H₂SO₄ + 2AlH₃ → 6H₂O + Al(SO₄)₃",
                optionD = "3H₂SO₄ + 2Al(OH)₃ → 6H₂O + Al₂(SO₄)₃",
                correctAnswerIndex = 3,
                explanation = "Aluminium has a valency of +3 and forms Al(OH)₃, while sulphate is SO₄²⁻. Neutralization yields aluminium sulphate Al₂(SO₄)₃ and water: 3H₂SO₄ + 2Al(OH)₃ → Al₂(SO₄)₃ + 6H₂O.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q14
        list.add(
            QuestionEntity(
                id = "chm_1984_14",
                subject = "Chemistry",
                topic = "Redox Reactions & Hydrogen Peroxide",
                year = "1984",
                questionText = "In which of the following chemical reactions does hydrogen peroxide (H₂O₂) act as a reducing agent?",
                optionA = "H₂S + H₂O₂ → S + 2H₂O",
                optionB = "PbSO₃ + H₂O₂ → PbSO₄ + H₂O",
                optionC = "2I⁻ + 2H⁺ + H₂O₂ → I₂ + 2H₂O",
                optionD = "PbO₂ + 2HNO₃ + H₂O₂ → Pb(NO₃)₂ + 2H₂O + O₂",
                correctAnswerIndex = 3,
                explanation = "In PbO₂ + 2HNO₃ + H₂O₂ → Pb(NO₃)₂ + 2H₂O + O₂, lead is reduced from +4 in PbO₂ to +2 in Pb(NO₃)₂, while oxygen in H₂O₂ is oxidized from -1 to 0 in O₂ gas, proving H₂O₂ acts as a reducing agent.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q19
        list.add(
            QuestionEntity(
                id = "chm_1984_19",
                subject = "Chemistry",
                topic = "Nitrogen Compounds & Preparation of HNO₃",
                year = "1984",
                questionText = "Which of the following methods is used for the laboratory preparation of trioxonitrate (V) acid (HNO₃)?",
                optionA = "Heating ammonia gas with tetraoxosulphate (IV) acid",
                optionB = "Heating ammonium trioxosulphate (V) with trioxonitrate (V) acid",
                optionC = "Heating sodium trioxonitrate (V) with concentrated tetraoxosulphate (VI) acid",
                optionD = "Heating potassium trioxonitrate (V) with calcium hydroxide",
                correctAnswerIndex = 2,
                explanation = "In the laboratory, volatile trioxonitrate(V) acid is prepared by gently heating solid sodium or potassium nitrate with less volatile concentrated H₂SO₄: NaNO₃(s) + H₂SO₄(l) → NaHSO₄(s) + HNO₃(g).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q20
        list.add(
            QuestionEntity(
                id = "chm_1984_20",
                subject = "Chemistry",
                topic = "Carbon & Compounds (Qualitative Analysis)",
                year = "1984",
                questionText = "Lime-water, which is routinely used in the laboratory for the qualitative detection of carbon (IV) oxide gas, is an aqueous solution of:",
                optionA = "Ca(OH)₂",
                optionB = "CaCO₃",
                optionC = "Ca(HCO₃)₂",
                optionD = "CaSO₄",
                correctAnswerIndex = 0,
                explanation = "Lime water is a saturated aqueous solution of calcium hydroxide, Ca(OH)₂. Passing CO₂ through it produces a milky white precipitate of insoluble calcium carbonate (CaCO₃).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q26
        list.add(
            QuestionEntity(
                id = "chm_1984_26",
                subject = "Chemistry",
                topic = "Redox Reactions (Ammonia)",
                year = "1984",
                questionText = "In the reaction 3Cl₂ + 2NH₃ → N₂ + 6HCl, ammonia functions as:",
                optionA = "A reducing agent",
                optionB = "An oxidizing agent",
                optionC = "An Arrhenius acid",
                optionD = "A catalyst",
                correctAnswerIndex = 0,
                explanation = "In NH₃, nitrogen has an oxidation number of -3, which increases to 0 in N₂ gas. Since nitrogen loses electrons and undergoes oxidation, ammonia functions as the reducing agent.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q27
        list.add(
            QuestionEntity(
                id = "chm_1984_27",
                subject = "Chemistry",
                topic = "Industrial Chemistry (Haber Process)",
                year = "1984",
                questionText = "In the industrial Haber process for the synthesis of ammonia (N₂ + 3H₂ ⇌ 2NH₃), finely divided iron is used as:",
                optionA = "An ionizing agent",
                optionB = "A reducing agent",
                optionC = "A catalyst",
                optionD = "A dehydrating agent",
                correctAnswerIndex = 2,
                explanation = "Finely divided iron serves as a heterogeneous catalyst to lower the activation energy and accelerate the rate of equilibrium attainment between nitrogen and hydrogen gases.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q30
        list.add(
            QuestionEntity(
                id = "chm_1984_30",
                subject = "Chemistry",
                topic = "Petroleum Chemistry & Cracking",
                year = "1984",
                questionText = "When high-boiling petroleum fractions such as kerosene or heavy gas oil are heated to high temperatures under pressure to yield lower-boiling hydrocarbons, the process is called:",
                optionA = "Polymerization",
                optionB = "Hydrogenation",
                optionC = "Esterification",
                optionD = "Cracking",
                correctAnswerIndex = 3,
                explanation = "Cracking (thermal or catalytic) is the chemical process of breaking down high-molecular-weight, high-boiling hydrocarbons into smaller, more volatile, and valuable fractions (such as petrol and alkenes).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q31
        list.add(
            QuestionEntity(
                id = "chm_1984_31",
                subject = "Chemistry",
                topic = "IUPAC Nomenclature of Carboxylic Acids",
                year = "1984",
                questionText = "What is the systematic IUPAC name for the organic compound CH₃-CH₂-COOH?",
                optionA = "Ethanoic acid",
                optionB = "Propanal",
                optionC = "Propanol",
                optionD = "Propanoic acid",
                correctAnswerIndex = 3,
                explanation = "The molecule contains a continuous chain of three carbon atoms with a terminal carboxylic acid functional group (-COOH), which corresponds to propanoic acid.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q32
        list.add(
            QuestionEntity(
                id = "chm_1984_32",
                subject = "Chemistry",
                topic = "Organic Chemistry (Saponification)",
                year = "1984",
                questionText = "The alkaline hydrolysis of naturally occurring fats and oils (triglycerides) yields:",
                optionA = "Fatty acids and mineral acids",
                optionB = "Soaps and glycerol",
                optionC = "Margarine and paraffin wax",
                optionD = "Esters and alkanes",
                correctAnswerIndex = 1,
                explanation = "Alkaline hydrolysis (saponification) of natural triglycerides with sodium or potassium hydroxide cleaves ester linkages to yield carboxylate salts (soaps) and propane-1,2,3-triol (glycerol).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q36
        list.add(
            QuestionEntity(
                id = "chm_1984_36",
                subject = "Chemistry",
                topic = "Quantitative Electrolysis (Faraday's Laws)",
                year = "1984",
                questionText = "If the cost of electricity required to deposit 1.0 g of magnesium is ₦5.00, how much would it cost to deposit 10.0 g of aluminium? [Al = 27, Mg = 24]",
                optionA = "₦10.00",
                optionB = "₦27.00",
                optionC = "₦44.44",
                optionD = "₦66.67",
                correctAnswerIndex = 3,
                explanation = "Equivalent mass of Mg = 24 / 2 = 12 g. Depositing 1 g Mg requires (1/12) F of charge, which costs ₦5.00. Equivalent mass of Al = 27 / 3 = 9 g. Depositing 10 g Al requires (10/9) F of charge. Cost = [(10/9) / (1/12)] × ₦5.00 = (120 / 9) × 5 = ₦66.67.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q41
        list.add(
            QuestionEntity(
                id = "chm_1984_41",
                subject = "Chemistry",
                topic = "Solubility & Deliquescence",
                year = "1984",
                questionText = "Solid sodium hydroxide (NaOH) pellets exposed to moist air rapidly absorb water to dissolve and form a concentrated liquid solution. This behavior shows that NaOH is:",
                optionA = "Deliquescent",
                optionB = "Hygroscopic",
                optionC = "Efflorescent",
                optionD = "Fluorescent",
                correctAnswerIndex = 0,
                explanation = "Deliquescence is the property where a solid absorbs so much moisture from the atmosphere that it completely dissolves into an aqueous solution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q45
        list.add(
            QuestionEntity(
                id = "chm_1984_45",
                subject = "Chemistry",
                topic = "Organic Reactions (Esterification)",
                year = "1984",
                questionText = "The primary function of concentrated H₂SO₄ in the esterification reaction of ethanoic acid with ethanol is to:",
                optionA = "Act as an oxidizing agent",
                optionB = "Serve strictly as an inert solvent",
                optionC = "Act as a catalyst (and dehydrating agent)",
                optionD = "Prevent hydrolysis of the reactants",
                correctAnswerIndex = 2,
                explanation = "Concentrated H₂SO₄ acts as an acid catalyst to protonate the carbonyl group, increasing the reaction rate, while also absorbing water to shift equilibrium towards higher ester yield.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // Q50
        list.add(
            QuestionEntity(
                id = "chm_1984_50",
                subject = "Chemistry",
                topic = "Stoichiometry & Molar Volume",
                year = "1984",
                questionText = "At S.T.P., how many litres (dm³) of hydrogen gas can be obtained from the complete reaction of 500 cm³ of 0.50 M H₂SO₄ with excess zinc metal? [Molar volume at STP = 22.4 dm³/mol]",
                optionA = "22.4 dm³",
                optionB = "11.2 dm³",
                optionC = "6.5 dm³",
                optionD = "5.6 dm³",
                correctAnswerIndex = 3,
                explanation = "Reaction: Zn + H₂SO₄ → ZnSO₄ + H₂. Moles of H₂SO₄ = 0.50 dm³ × 0.50 mol/dm³ = 0.25 mol. Since 1 mole H₂SO₄ yields 1 mole H₂, moles of H₂ = 0.25 mol. Volume of H₂ = 0.25 × 22.4 dm³ = 5.6 dm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1984"
            )
        )

        // ==========================================
        // 1985 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q1
        list.add(
            QuestionEntity(
                id = "chm_1985_01",
                subject = "Chemistry",
                topic = "Periodic Table & Electronic Configuration",
                year = "1985",
                questionText = "Which set of elements in the main groups of the Periodic Table belongs to the p-block?",
                optionA = "Alkali metals and alkaline earth metals (Groups 1 & 2)",
                optionB = "Transition metals in the central block (Groups 3 to 12)",
                optionC = "Lanthanides and actinides in the f-block",
                optionD = "Main group elements on the right of the table (Groups 13 to 18)",
                correctAnswerIndex = 3,
                explanation = "The p-block comprises Groups 13 to 18 (IIIA to VIIIA) on the right side of the Periodic Table, where valence electrons progressively fill the outermost p-subshells.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q2
        list.add(
            QuestionEntity(
                id = "chm_1985_02",
                subject = "Chemistry",
                topic = "Allotropy of Carbon",
                year = "1985",
                questionText = "Which of the following crystalline allotropes of carbon is a good conductor of electricity?",
                optionA = "Diamond",
                optionB = "Graphite",
                optionC = "Fullerene",
                optionD = "Amorphous carbon",
                correctAnswerIndex = 1,
                explanation = "In graphite, each carbon atom is sp² hybridized and covalently bonded to three adjacent carbon atoms in planar hexagonal layers. The fourth valence electron is delocalized across the layers, allowing electric current to flow freely.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q3
        list.add(
            QuestionEntity(
                id = "chm_1985_03",
                subject = "Chemistry",
                topic = "Empirical Formula Calculations",
                year = "1985",
                questionText = "An organic compound contains 72% carbon, 12% hydrogen, and 16% oxygen by mass. What is the empirical formula of the compound? [C=12, H=1, O=16]",
                optionA = "C₆H₂₂O₃",
                optionB = "C₆H₁₀O₃",
                optionC = "C₁₂H₁₂O",
                optionD = "C₆H₁₂O",
                correctAnswerIndex = 3,
                explanation = "Mole ratio: C = 72/12 = 6; H = 12/1 = 12; O = 16/16 = 1. Dividing by the smallest value (1) gives C : H : O = 6 : 12 : 1. The empirical formula is C₆H₁₂O.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q4
        list.add(
            QuestionEntity(
                id = "chm_1985_04",
                subject = "Chemistry",
                topic = "Hydrates & Water of Crystallization",
                year = "1985",
                questionText = "0.499 g of hydrated copper(II) sulphate (CuSO₄·xH₂O) when heated to constant weight gave an anhydrous residue of 0.346 g. What is the value of x? [Cu=63.5, S=32, O=16, H=1]",
                optionA = "1.0",
                optionB = "2.0",
                optionC = "3.0",
                optionD = "5.0",
                correctAnswerIndex = 3,
                explanation = "Mass of water lost = 0.499 - 0.346 = 0.153 g. Moles of H₂O = 0.153 / 18 = 0.00850 mol. Molar mass of CuSO₄ = 63.5 + 32 + 64 = 159.5 g/mol. Moles of CuSO₄ = 0.346 / 159.5 = 0.00217 mol. Ratio x = 0.00850 / 0.00217 ≈ 5.0 (CuSO₄·5H₂O).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "chm_1985_05",
                subject = "Chemistry",
                topic = "Purity of Chemical Substances",
                year = "1985",
                questionText = "In a laboratory experiment, which of the following physical observations confirms that a solid sample is an impure mixture rather than a pure chemical substance?",
                optionA = "The solid can be ground into a fine powder",
                optionB = "The density of the solid is 2.25 g/cm³",
                optionC = "The solid begins to melt at 648 K and completes melting at 748 K over a wide range",
                optionD = "The solid absorbs atmospheric moisture",
                correctAnswerIndex = 2,
                explanation = "A pure substance melts sharply at a definite and constant temperature. An impure sample or mixture melts gradually over a wide temperature range due to depression and variation in melting points.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q17
        list.add(
            QuestionEntity(
                id = "chm_1985_17",
                subject = "Chemistry",
                topic = "Quantitative Electrolysis (Faraday's First Law)",
                year = "1985",
                questionText = "Copper sulphate solution is electrolyzed using platinum electrodes. A steady current of 0.193 amperes is passed for 2 hours. What mass of copper is deposited on the cathode? [Cu = 63.5, 1 Faraday = 96,500 C]",
                optionA = "0.457 g",
                optionB = "0.500 g",
                optionC = "0.882 g",
                optionD = "0.914 g",
                correctAnswerIndex = 0,
                explanation = "Quantity of charge Q = I × t = 0.193 A × (2 × 3600 s) = 1389.6 C. Since Cu²⁺ + 2e⁻ → Cu, depositing 1 mole (63.5 g) requires 2 × 96500 C = 193,000 C. Mass of Cu deposited = (1389.6 × 63.5) / 193,000 = 0.457 g.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q25
        list.add(
            QuestionEntity(
                id = "chm_1985_25",
                subject = "Chemistry",
                topic = "Electrochemical Activity Series",
                year = "1985",
                questionText = "Which of the following metals will displace iron from an aqueous solution of iron (II) tetraoxosulphate (VI)?",
                optionA = "Copper",
                optionB = "Mercury",
                optionC = "Silver",
                optionD = "Zinc",
                correctAnswerIndex = 3,
                explanation = "Zinc is higher than iron in the activity (electrochemical) series (higher oxidation potential). Therefore, metallic zinc readily reduces Fe²⁺ ions to form metallic iron deposit and Zn²⁺ in solution.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q26
        list.add(
            QuestionEntity(
                id = "chm_1985_26",
                subject = "Chemistry",
                topic = "Organic Chemistry (Hydrogenation of Alkynes)",
                year = "1985",
                questionText = "The complete catalytic hydrogenation of ethyne (acetylene, C₂H₂) in the presence of nickel catalyst yields:",
                optionA = "Benzene",
                optionB = "Methane",
                optionC = "Ethene",
                optionD = "Ethane",
                correctAnswerIndex = 3,
                explanation = "Hydrogenation of ethyne (C₂H₂) with excess hydrogen first produces ethene (C₂H₄), which undergoes further reduction to fully saturate into ethane (C₂H₆).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q27
        list.add(
            QuestionEntity(
                id = "chm_1985_27",
                subject = "Chemistry",
                topic = "Halogens & Bleaching Powder",
                year = "1985",
                questionText = "Which of the following gases is used in the industrial manufacture of bleaching powder?",
                optionA = "Sulphur dioxide",
                optionB = "Chlorine",
                optionC = "Hydrogen sulphide",
                optionD = "Nitrogen dioxide",
                correctAnswerIndex = 1,
                explanation = "Bleaching powder (calcium hypochlorite / oxychloride, CaOCl₂) is produced industrially by passing dry chlorine gas over dry slaked lime: Ca(OH)₂ + Cl₂ → CaOCl₂ + H₂O.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q34
        list.add(
            QuestionEntity(
                id = "chm_1985_34",
                subject = "Chemistry",
                topic = "Qualitative Analysis (Sulphate Test)",
                year = "1985",
                questionText = "Tetraoxosulphate (VI) ions (SO₄²⁻) in aqueous solution are confirmatory tested using:",
                optionA = "Acidified silver nitrate solution",
                optionB = "Acidified barium chloride solution",
                optionC = "Lime-water",
                optionD = "Dilute hydrochloric acid only",
                correctAnswerIndex = 1,
                explanation = "Adding acidified BaCl₂ (or Ba(NO₃)₂) to a solution containing SO₄²⁻ gives a dense white precipitate of BaSO₄ that remains insoluble in dilute hydrochloric acid.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q35
        list.add(
            QuestionEntity(
                id = "chm_1985_35",
                subject = "Chemistry",
                topic = "IUPAC Nomenclature of Branched Alkenes",
                year = "1985",
                questionText = "What is the systematic IUPAC name for the alkene: CH₃-CH(CH₃)-CH(CH₃)-CH=CH-CH₃?",
                optionA = "2-methyl-3-pentene",
                optionB = "4,5-dimethylhex-2-ene",
                optionC = "2,3-dimethylhex-4-ene",
                optionD = "4-methyl-3-pentene",
                correctAnswerIndex = 1,
                explanation = "The longest continuous carbon chain containing the double bond has 6 carbons (hex-2-ene, numbered from the right to give the double bond the lowest locant 2). Methyl substituent groups are at C4 and C5, giving 4,5-dimethylhex-2-ene.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // Q36
        list.add(
            QuestionEntity(
                id = "chm_1985_36",
                subject = "Chemistry",
                topic = "Inorganic Reactions (Precipitation)",
                year = "1985",
                questionText = "Mixing aqueous solutions of barium hydroxide, Ba(OH)₂, and sodium trioxocarbonate (IV), Na₂CO₃, yields a white precipitate of:",
                optionA = "Barium oxide",
                optionB = "Sodium hydroxide",
                optionC = "Sodium oxide",
                optionD = "Barium trioxocarbonate (IV)",
                correctAnswerIndex = 3,
                explanation = "A double decomposition reaction occurs: Ba(OH)₂(aq) + Na₂CO₃(aq) → BaCO₃(s) + 2NaOH(aq). Insoluble barium carbonate precipitates as a white solid.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1985"
            )
        )

        // ==========================================
        // 1986 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q2
        list.add(
            QuestionEntity(
                id = "chm_1986_02",
                subject = "Chemistry",
                topic = "Stoichiometry & Molar Gas Volume",
                year = "1986",
                questionText = "What mass of a divalent metal M (atomic mass = 40) would react with excess hydrochloric acid to liberate 224 cm³ of dry hydrogen gas measured at S.T.P.? [Molar volume at STP = 22,400 cm³]",
                optionA = "8.0 g",
                optionB = "4.0 g",
                optionC = "0.4 g",
                optionD = "2.0 g",
                correctAnswerIndex = 2,
                explanation = "Reaction: M + 2HCl → MCl₂ + H₂. 1 mole of divalent metal M (40 g) liberates 1 mole of H₂ (22,400 cm³ at STP). Moles of H₂ = 224 / 22,400 = 0.01 mol. Required mass of metal M = 0.01 mol × 40 g/mol = 0.4 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1986"
            )
        )

        // Q5
        list.add(
            QuestionEntity(
                id = "chm_1986_05",
                subject = "Chemistry",
                topic = "Stoichiometry & Volumetric Reactions",
                year = "1986",
                questionText = "What mass of magnesium is required to react completely with 250 cm³ of 0.50 M HCl? [Mg = 24]",
                optionA = "0.3 g",
                optionB = "1.5 g",
                optionC = "2.4 g",
                optionD = "3.0 g",
                correctAnswerIndex = 1,
                explanation = "Reaction: Mg + 2HCl → MgCl₂ + H₂. Moles of HCl = 0.25 dm³ × 0.50 mol/dm³ = 0.125 mol. Required moles of Mg = 0.125 / 2 = 0.0625 mol. Mass of Mg = 0.0625 × 24 = 1.5 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1986"
            )
        )

        // Q13
        list.add(
            QuestionEntity(
                id = "chm_1986_13",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts (Acid Salts)",
                year = "1986",
                questionText = "Which of the following compounds is an acid salt?",
                optionA = "NaHSO₄",
                optionB = "Na₂SO₄",
                optionC = "CH₃COONa",
                optionD = "Na₂S",
                correctAnswerIndex = 0,
                explanation = "An acid salt is formed when only part of the replaceable hydrogen atoms of a polybasic acid is replaced by a metal. NaHSO₄ contains an ionizable hydrogen atom (H⁺) from dibasic H₂SO₄.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1986"
            )
        )

        // Q16
        list.add(
            QuestionEntity(
                id = "chm_1986_16",
                subject = "Chemistry",
                topic = "Electrochemistry (Quantity of Charge)",
                year = "1986",
                questionText = "How many coulombs of electricity are passed through an electrolyte solution when a steady current of 6.5 amperes is allowed to run for 1.0 hour?",
                optionA = "3.90 × 10² C",
                optionB = "5.50 × 10³ C",
                optionC = "6.54 × 10³ C",
                optionD = "2.34 × 10⁴ C",
                correctAnswerIndex = 3,
                explanation = "Using the charge equation Q = I × t: Q = 6.5 A × (1.0 × 3600 s) = 23,400 C = 2.34 × 10⁴ coulombs.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1986"
            )
        )

        // Q38
        list.add(
            QuestionEntity(
                id = "chm_1986_38",
                subject = "Chemistry",
                topic = "Thermal Decomposition & Metal Oxides",
                year = "1986",
                questionText = "The solid residue left after strongly heating a sample of zinc trioxocarbonate (IV), which is yellow when hot and turns white when cold, is:",
                optionA = "Lead (II) oxide",
                optionB = "Calcium oxide",
                optionC = "Zinc oxide",
                optionD = "Lead (II) nitrate",
                correctAnswerIndex = 2,
                explanation = "Zinc carbonate undergoes thermal decomposition: ZnCO₃(s) → ZnO(s) + CO₂(g). Zinc oxide (ZnO) exhibits a characteristic thermochromic property: yellow when hot and white when cold.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1986"
            )
        )

        // Q46
        list.add(
            QuestionEntity(
                id = "chm_1986_46",
                subject = "Chemistry",
                topic = "Organic Chemistry (Dehydration of Alkanols)",
                year = "1986",
                questionText = "When ethanol is heated with excess concentrated sulphuric acid at 170°C, the ethanol undergoes:",
                optionA = "Oxidation to ethene",
                optionB = "Polymerization to polyethene",
                optionC = "Dehydration to ethene",
                optionD = "Dehydration to ethyne",
                correctAnswerIndex = 2,
                explanation = "Excess concentrated H₂SO₄ at 170°C acts as a strong dehydrating agent, removing one molecule of water from ethanol (C₂H₅OH) to produce ethene gas: C₂H₅OH → C₂H₄ + H₂O.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1986"
            )
        )

        // ==========================================
        // 1987 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q3
        list.add(
            QuestionEntity(
                id = "chm_1987_03",
                subject = "Chemistry",
                topic = "Avogadro's Number & Stoichiometry",
                year = "1987",
                questionText = "What is the number of molecules of carbon (IV) oxide produced when 10.0 g of CaCO₃ is treated with 0.20 dm³ of 1.0 M HCl? [Ca=40, C=12, O=16, N_A = 6.02 × 10²³ molecules/mol]",
                optionA = "1.00 × 10²³",
                optionB = "6.02 × 10²³",
                optionC = "6.02 × 10²²",
                optionD = "3.01 × 10²²",
                correctAnswerIndex = 2,
                explanation = "Reaction: CaCO₃ + 2HCl → CaCl₂ + H₂O + CO₂. Moles of CaCO₃ = 10 / 100 = 0.10 mol. Moles of HCl = 0.20 × 1.0 = 0.20 mol. Since 0.10 mol CaCO₃ reacts exactly with 0.20 mol HCl, 0.10 mol of CO₂ is produced. Number of CO₂ molecules = 0.10 × (6.02 × 10²³) = 6.02 × 10²² molecules.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1987"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "chm_1987_10",
                subject = "Chemistry",
                topic = "Atomic Structure & Relative Atomic Mass",
                year = "1987",
                questionText = "An element Z consists of two isotopes: 90% of ¹⁶Z and 10% of ¹⁸Z. What is the relative atomic mass of element Z?",
                optionA = "16.0",
                optionB = "16.2",
                optionC = "17.0",
                optionD = "17.8",
                correctAnswerIndex = 1,
                explanation = "Relative atomic mass (RAM) = Σ (mass × fractional abundance) = (16 × 0.90) + (18 × 0.10) = 14.4 + 1.8 = 16.2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1987"
            )
        )

        // Q19
        list.add(
            QuestionEntity(
                id = "chm_1987_19",
                subject = "Chemistry",
                topic = "Acids, Bases & Basicity",
                year = "1987",
                questionText = "The basicity of tetraoxophosphate (V) acid (H₃PO₄) is:",
                optionA = "7",
                optionB = "5",
                optionC = "4",
                optionD = "3",
                correctAnswerIndex = 3,
                explanation = "Basicity is the number of replaceable hydrogen ions (H⁺) per molecule of an acid. H₃PO₄ contains three ionizable protons, making it a tribasic acid with a basicity of 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1987"
            )
        )

        // Q21
        list.add(
            QuestionEntity(
                id = "chm_1987_21",
                subject = "Chemistry",
                topic = "Quantitative Electrolysis (Faraday's Second Law)",
                year = "1987",
                questionText = "A quantity of electricity liberates 3.6 g of silver from its salt. What mass of aluminium will be liberated from its molten salt by the same quantity of electricity? [Ag = 108, Al = 27]",
                optionA = "2.7 g",
                optionB = "1.2 g",
                optionC = "0.9 g",
                optionD = "0.3 g",
                correctAnswerIndex = 3,
                explanation = "By Faraday's second law: (Mass of Al / Mass of Ag) = (Eq. Mass of Al / Eq. Mass of Ag). Eq. mass of Ag = 108 / 1 = 108; Eq. mass of Al = 27 / 3 = 9. Mass of Al = 3.6 × (9 / 108) = 0.3 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1987"
            )
        )

        // ==========================================
        // 1988 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q2
        list.add(
            QuestionEntity(
                id = "chm_1988_02",
                subject = "Chemistry",
                topic = "Chemical Formulae & Valency",
                year = "1988",
                questionText = "The chemical formula of the compound formed in a reaction between a trivalent metal M and a tetravalent non-metal X is:",
                optionA = "MX",
                optionB = "M₂X₃",
                optionC = "M₄X₃",
                optionD = "M₃X₂",
                correctAnswerIndex = 2,
                explanation = "Metal M has a valency of 3 (M³⁺) and non-metal X has a valency of 4 (X⁴⁻). Swapping valency subscripts to balance overall charge gives M₄X₃.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1988"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "chm_1988_10",
                subject = "Chemistry",
                topic = "Periodic Trends",
                year = "1988",
                questionText = "Which of the following atomic properties decreases across a period in the Periodic Table from left to right?",
                optionA = "Ionization potential",
                optionB = "Electron affinity",
                optionC = "Electronegativity",
                optionD = "Atomic radius",
                correctAnswerIndex = 3,
                explanation = "Moving from left to right across a period, effective nuclear charge increases while shielding remains approximately constant, drawing the valence electron shell closer to the nucleus and decreasing atomic radius.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1988"
            )
        )

        // Q20
        list.add(
            QuestionEntity(
                id = "chm_1988_20",
                subject = "Chemistry",
                topic = "Volumetric Analysis (Polybasic Titration)",
                year = "1988",
                questionText = "What volume of a 0.10 M H₃PO₄ solution will be required to neutralize 45.0 cm³ of a 0.20 M NaOH solution?",
                optionA = "10.0 cm³",
                optionB = "20.0 cm³",
                optionC = "27.0 cm³",
                optionD = "30.0 cm³",
                correctAnswerIndex = 3,
                explanation = "Reaction: H₃PO₄ + 3NaOH → Na₃PO₄ + 3H₂O. Using the ratio (Cₐ × Vₐ) / (C_b × V_b) = nₐ / n_b ⇒ (0.10 × Vₐ) / (0.20 × 45.0) = 1 / 3 ⇒ 0.30 × Vₐ = 9.0 ⇒ Vₐ = 30.0 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1988"
            )
        )

        // Q33
        list.add(
            QuestionEntity(
                id = "chm_1988_33",
                subject = "Chemistry",
                topic = "Reactions of Concentrated H₂SO₄",
                year = "1988",
                questionText = "In the reaction C₆H₁₂O₆ (or carbohydrate) → 6C + 6H₂O under concentrated H₂SO₄, the acid acts as:",
                optionA = "A reducing agent",
                optionB = "An oxidizing agent",
                optionC = "A dehydrating agent",
                optionD = "A catalyst only",
                correctAnswerIndex = 2,
                explanation = "Concentrated H₂SO₄ has a strong affinity for water and removes the elements of water (H and O in a 2:1 ratio) from organic carbohydrates, leaving behind elemental black carbon (charring/dehydration).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1988"
            )
        )

        // ==========================================
        // 1989 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q4
        list.add(
            QuestionEntity(
                id = "chm_1989_04",
                subject = "Chemistry",
                topic = "Volumetric Analysis & Standard Solutions",
                year = "1989",
                questionText = "20.00 cm³ of a solution containing 0.53 g of anhydrous Na₂CO₃ in 100 cm³ requires 25.00 cm³ of H₂SO₄ for complete neutralization. The concentration of the acid solution in mol/dm³ is: [Na=23, C=12, O=16]",
                optionA = "0.02 M",
                optionB = "0.04 M",
                optionC = "0.08 M",
                optionD = "0.10 M",
                correctAnswerIndex = 1,
                explanation = "Molar mass of Na₂CO₃ = 106 g/mol. Concentration of Na₂CO₃ = (0.53 / 106) mol / 0.1 dm³ = 0.05 M. Reaction: Na₂CO₃ + H₂SO₄ → Na₂SO₄ + H₂O + CO₂ (1:1 mole ratio). Cₐ × Vₐ = C_b × V_b ⇒ Cₐ × 25.0 = 0.05 × 20.0 ⇒ Cₐ = 1.0 / 25.0 = 0.04 M.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1989"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "chm_1989_22",
                subject = "Chemistry",
                topic = "Quantitative Electrolysis (Series Voltameters)",
                year = "1989",
                questionText = "The same electric current is passed for the same duration through solutions of AgNO₃ and CuSO₄ connected in series. What mass of silver will be deposited if 1.0 g of copper is produced? [Ag = 108, Cu = 64]",
                optionA = "1.7 g",
                optionB = "3.4 g",
                optionC = "6.8 g",
                optionD = "13.6 g",
                correctAnswerIndex = 1,
                explanation = "Equivalent mass of Cu = 64 / 2 = 32 g. Equivalent mass of Ag = 108 / 1 = 108 g. By Faraday's second law: Mass Ag = Mass Cu × (Eq. mass Ag / Eq. mass Cu) = 1.0 × (108 / 32) = 3.375 g ≈ 3.4 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1989"
            )
        )

        // ==========================================
        // 1990 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q3
        list.add(
            QuestionEntity(
                id = "chm_1990_03",
                subject = "Chemistry",
                topic = "Stoichiometry & Metallurgy",
                year = "1990",
                questionText = "In the extraction of tin, SnO₂ + 2C → Sn + 2CO, what mass of coke containing 80% carbon is required to reduce 0.032 kg of pure tin(IV) oxide? [Sn = 119, O = 16, C = 12]",
                optionA = "0.40 kg",
                optionB = "0.20 kg",
                optionC = "0.06 kg",
                optionD = "0.006 kg",
                correctAnswerIndex = 3,
                explanation = "Molar mass of SnO₂ = 119 + 32 = 151 g/mol. Mass of SnO₂ = 32 g ⇒ Moles of SnO₂ = 32 / 151 = 0.2119 mol. Required pure carbon = 2 × 0.2119 = 0.4238 mol = 0.4238 × 12 = 5.086 g. With coke at 80% purity: Mass of coke = 5.086 / 0.80 = 6.36 g = 0.00636 kg ≈ 0.006 kg.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1990"
            )
        )

        // Q21
        list.add(
            QuestionEntity(
                id = "chm_1990_21",
                subject = "Chemistry",
                topic = "Dilution of Solutions",
                year = "1990",
                questionText = "What volume of 11.0 M concentrated hydrochloric acid must be diluted with distilled water to prepare 1.0 dm³ of 0.050 M acid solution?",
                optionA = "4.5 cm³",
                optionB = "9.1 cm³",
                optionC = "11.0 cm³",
                optionD = "22.0 cm³",
                correctAnswerIndex = 0,
                explanation = "Using the dilution equation M₁V₁ = M₂V₂: 11.0 M × V₁ = 0.050 M × 1000 cm³ ⇒ V₁ = 50 / 11.0 = 4.545 cm³ ≈ 4.5 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1990"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "chm_1990_22",
                subject = "Chemistry",
                topic = "Quantitative Electrolysis (Gas Evolution)",
                year = "1990",
                questionText = "If 10.8 g of silver is deposited in a silver voltameter connected in series with an electrolytic water cell, what volume of oxygen gas is liberated at S.T.P.? [Ag = 108, Molar gas volume at STP = 22.4 dm³]",
                optionA = "0.56 dm³",
                optionB = "5.50 dm³",
                optionC = "11.20 dm³",
                optionD = "22.40 dm³",
                correctAnswerIndex = 0,
                explanation = "Moles of Ag deposited = 10.8 / 108 = 0.10 mol, corresponding to 0.10 Faradays of charge. The anode half-reaction for oxygen evolution is 2H₂O → O₂ + 4H⁺ + 4e⁻ (4 F per mole O₂). Moles of O₂ = 0.10 / 4 = 0.025 mol. Volume of O₂ = 0.025 × 22.4 dm³ = 0.56 dm³.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1990"
            )
        )

        // Q24
        list.add(
            QuestionEntity(
                id = "chm_1990_24",
                subject = "Chemistry",
                topic = "Redox Reactions (Oxidation Numbers)",
                year = "1990",
                questionText = "In the redox equation Cr₂O₇²⁻ + 6Fe²⁺ + 14H⁺ → 2Cr³⁺ + 6Fe³⁺ + 7H₂O, the oxidation state of chromium changes from:",
                optionA = "+7 to +3",
                optionB = "+6 to +3",
                optionC = "+5 to +3",
                optionD = "-2 to +3",
                correctAnswerIndex = 1,
                explanation = "In dichromate Cr₂O₇²⁻: 2(Cr) + 7(-2) = -2 ⇒ 2Cr - 14 = -2 ⇒ 2Cr = +12 ⇒ Cr = +6. In the product Cr³⁺, chromium has an oxidation state of +3. Thus, chromium changes from +6 to +3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1990"
            )
        )

        // ==========================================
        // 1991 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q5
        list.add(
            QuestionEntity(
                id = "chm_1991_05",
                subject = "Chemistry",
                topic = "Boyle's Law Calculations",
                year = "1991",
                questionText = "30 cm³ of oxygen gas at 10 atmospheres pressure is transferred into a 20 dm³ container. Calculate the new pressure if temperature remains constant.",
                optionA = "6.7 atm",
                optionB = "15.0 atm",
                optionC = "0.015 atm",
                optionD = "0.15 atm",
                correctAnswerIndex = 2,
                explanation = "By Boyle's law: P₁V₁ = P₂V₂. V₁ = 30 cm³ = 0.030 dm³, P₁ = 10 atm, V₂ = 20 dm³. P₂ = (P₁ × V₁) / V₂ = (10 × 0.030) / 20 = 0.30 / 20 = 0.015 atm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1991"
            )
        )

        // Q17
        list.add(
            QuestionEntity(
                id = "chm_1991_17",
                subject = "Chemistry",
                topic = "Solubility & Crystallization",
                year = "1991",
                questionText = "The solubility of CuSO₄ is 75 g per 100 g of water at 100°C and 25 g per 100 g of water at 30°C. What mass of salt crystallizes when 50 g of saturated CuSO₄ solution is cooled from 100°C to 30°C?",
                optionA = "57.5 g",
                optionB = "42.9 g",
                optionC = "28.6 g",
                optionD = "14.3 g",
                correctAnswerIndex = 3,
                explanation = "At 100°C, 175 g saturated solution contains 75 g salt and 100 g water. In 50 g solution: Mass of salt = (75/175) × 50 = 21.43 g; Mass of water = 50 - 21.43 = 28.57 g. At 30°C, 28.57 g water holds (25/100) × 28.57 = 7.14 g salt. Mass crystallized = 21.43 - 7.14 = 14.29 g ≈ 14.3 g.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1991"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "chm_1991_22",
                subject = "Chemistry",
                topic = "Stoichiometry & Gas Production",
                year = "1991",
                questionText = "What volume of CO₂ gas measured at S.T.P. is produced by reacting 10.0 cm³ of 0.10 M Na₂CO₃ solution with excess hydrochloric acid? [Molar volume at STP = 22,400 cm³/mol]",
                optionA = "2.24 cm³",
                optionB = "22.40 cm³",
                optionC = "224.0 cm³",
                optionD = "22.4 dm³",
                correctAnswerIndex = 1,
                explanation = "Reaction: Na₂CO₃ + 2HCl → 2NaCl + H₂O + CO₂ (1:1 ratio). Moles of Na₂CO₃ = 0.010 dm³ × 0.10 mol/dm³ = 0.0010 mol. Produced CO₂ = 0.0010 mol × 22,400 cm³/mol = 22.40 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1991"
            )
        )

        // ==========================================
        // 1992 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q3
        list.add(
            QuestionEntity(
                id = "chm_1992_03",
                subject = "Chemistry",
                topic = "Acids, Bases & Ionization",
                year = "1992",
                questionText = "How many moles of hydrogen ions [H⁺] are present in 1.0 dm³ of a 0.50 M solution of H₂SO₄?",
                optionA = "2.0 moles",
                optionB = "1.0 mole",
                optionC = "0.50 mole",
                optionD = "0.25 mole",
                correctAnswerIndex = 1,
                explanation = "H₂SO₄ is a strong dibasic acid that completely ionizes in aqueous solution: H₂SO₄ → 2H⁺ + SO₄²⁻. Each mole of acid yields 2 moles of H⁺ ions. In 1 dm³ of 0.50 M H₂SO₄: Moles of H⁺ = 2 × 0.50 = 1.0 mole.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1992"
            )
        )

        // Q21
        list.add(
            QuestionEntity(
                id = "chm_1992_21",
                subject = "Chemistry",
                topic = "Molar Solutions & Mass Calculations",
                year = "1992",
                questionText = "How many grams of pure H₂SO₄ are needed to prepare 0.175 dm³ of a 6.00 M H₂SO₄ solution? [H=1, S=32, O=16]",
                optionA = "206.0 g",
                optionB = "103.0 g",
                optionC = "98.1 g",
                optionD = "102.9 g",
                correctAnswerIndex = 3,
                explanation = "Moles of H₂SO₄ required = Molarity × Volume = 6.00 mol/dm³ × 0.175 dm³ = 1.05 moles. Molar mass of H₂SO₄ = 2(1) + 32 + 4(16) = 98.0 g/mol. Mass required = 1.05 mol × 98.0 g/mol = 102.9 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1992"
            )
        )

        // ==========================================
        // 1993 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q3
        list.add(
            QuestionEntity(
                id = "chm_1993_03",
                subject = "Chemistry",
                topic = "Thermal Decomposition & Stoichiometry",
                year = "1993",
                questionText = "How many moles of oxygen gas (O₂) are produced from the complete thermal decomposition of 2.50 moles of potassium trioxochlorate (V), KClO₃?",
                optionA = "2.50 moles",
                optionB = "3.50 moles",
                optionC = "3.75 moles",
                optionD = "7.50 moles",
                correctAnswerIndex = 2,
                explanation = "The decomposition equation is 2KClO₃ → 2KCl + 3O₂. Molar ratio of KClO₃ to O₂ is 2 : 3. Therefore, 2.50 moles of KClO₃ yields (3 / 2) × 2.50 = 3.75 moles of O₂.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1993"
            )
        )

        // ==========================================
        // 1994 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q4
        list.add(
            QuestionEntity(
                id = "chm_1994_04",
                subject = "Chemistry",
                topic = "Avogadro's Law & Molar Gas Volume",
                year = "1994",
                questionText = "8.0 g of methane (CH₄) occupies 11.2 dm³ at S.T.P. What volume would 22.0 g of propane (C₃H₈) occupy under the exact same temperature and pressure conditions? [C=12, H=1]",
                optionA = "3.7 dm³",
                optionB = "11.2 dm³",
                optionC = "22.4 dm³",
                optionD = "33.6 dm³",
                correctAnswerIndex = 1,
                explanation = "Molar mass of propane C₃H₈ = 3(12) + 8(1) = 44 g/mol. Moles of propane = 22.0 / 44 = 0.50 mol. Since 8.0 g of CH₄ (0.50 mol) occupies 11.2 dm³, 0.50 mol of any ideal gas under the same conditions occupies the same volume, 11.2 dm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1994"
            )
        )

        // Q22
        list.add(
            QuestionEntity(
                id = "chm_1994_22",
                subject = "Chemistry",
                topic = "Organic Reactions & Stoichiometry",
                year = "1994",
                questionText = "20 cm³ of a 2.0 M solution of ethanoic acid (CH₃COOH) is completely neutralized with excess sodium hydroxide. What mass of sodium ethanoate is produced? [Na=23, C=12, O=16, H=1]",
                optionA = "2.50 g",
                optionB = "2.73 g",
                optionC = "3.28 g",
                optionD = "4.54 g",
                correctAnswerIndex = 2,
                explanation = "Reaction: CH₃COOH + NaOH → CH₃COONa + H₂O. Moles of acid = 0.020 dm³ × 2.0 mol/dm³ = 0.040 mol. Molar mass of CH₃COONa = 12 + 3(1) + 12 + 32 + 23 = 82 g/mol. Mass of salt formed = 0.040 mol × 82 g/mol = 3.28 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1994"
            )
        )

        // ==========================================
        // 1995 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q24
        list.add(
            QuestionEntity(
                id = "chm_1995_24",
                subject = "Chemistry",
                topic = "Quantitative Electrolysis (Faraday's Law)",
                year = "1995",
                questionText = "How many moles of copper metal would be deposited by passing 3.0 Faradays of electricity through an aqueous solution of copper (II) tetraoxosulphate (VI)?",
                optionA = "0.50 mole",
                optionB = "1.00 mole",
                optionC = "1.50 moles",
                optionD = "3.00 moles",
                correctAnswerIndex = 2,
                explanation = "The reduction half-reaction is Cu²⁺ + 2e⁻ → Cu. Depositing 1 mole of divalent copper requires 2 Faradays of electric charge. Passing 3.0 Faradays will deposit 3.0 / 2 = 1.50 moles of copper.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1995"
            )
        )

        // ==========================================
        // 1998 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q4
        list.add(
            QuestionEntity(
                id = "chm_1998_04",
                subject = "Chemistry",
                topic = "Gay-Lussac's Law of Combining Volumes",
                year = "1998",
                questionText = "From the equation: C₃H₈(g) + 5O₂(g) → 3CO₂(g) + 4H₂O(g), what volume of oxygen gas is required for the complete combustion of 50 cm³ of propane gas?",
                optionA = "250 cm³",
                optionB = "150 cm³",
                optionC = "100 cm³",
                optionD = "50 cm³",
                correctAnswerIndex = 0,
                explanation = "By Gay-Lussac's law, gases react in volumes that bear simple whole-number ratios to one another at constant temperature and pressure. The volume ratio of propane to oxygen is 1 : 5. Therefore, 50 cm³ of C₃H₈ requires 5 × 50 cm³ = 250 cm³ of oxygen.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1998"
            )
        )

        // ==========================================
        // 1999 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q1
        list.add(
            QuestionEntity(
                id = "chm_1999_01",
                subject = "Chemistry",
                topic = "Precipitation Reactions & Limiting Reactant",
                year = "1999",
                questionText = "200 cm³ each of 0.10 M lead (II) trioxonitrate (V) and 0.10 M hydrochloric acid were mixed. Assuming PbCl₂ is completely insoluble, what mass of PbCl₂ precipitate is formed? [Pb = 207, Cl = 35.5]",
                optionA = "2.78 g",
                optionB = "5.56 g",
                optionC = "8.34 g",
                optionD = "11.12 g",
                correctAnswerIndex = 0,
                explanation = "Reaction: Pb(NO₃)₂ + 2HCl → PbCl₂↓ + 2HNO₃. Moles of Pb²⁺ = 0.20 × 0.10 = 0.020 mol. Moles of Cl⁻ = 0.20 × 0.10 = 0.020 mol. Since 1 mol Pb²⁺ requires 2 mol Cl⁻, HCl is the limiting reactant and yields 0.020 / 2 = 0.010 mol of PbCl₂. Molar mass of PbCl₂ = 207 + 2(35.5) = 278 g/mol. Mass precipitated = 0.010 × 278 = 2.78 g.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 1999"
            )
        )

        // ==========================================
        // 2000 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q5
        list.add(
            QuestionEntity(
                id = "chm_2000_05",
                subject = "Chemistry",
                topic = "Redox Stoichiometry (Dichromate Oxidation)",
                year = "2000",
                questionText = "How many moles of HCl are required to react with potassium heptaoxodichromate (VI) to produce 3 moles of chlorine gas?",
                optionA = "14 moles",
                optionB = "12 moles",
                optionC = "11 moles",
                optionD = "10 moles",
                correctAnswerIndex = 0,
                explanation = "The balanced redox equation is: K₂Cr₂O₇ + 14HCl → 2KCl + 2CrCl₃ + 3Cl₂ + 7H₂O. The stoichiometric ratio shows that exactly 14 moles of HCl are required to produce 3 moles of chlorine gas.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2000"
            )
        )

        // ==========================================
        // 2001 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q2
        list.add(
            QuestionEntity(
                id = "chm_2001_02",
                subject = "Chemistry",
                topic = "Stoichiometry (Water Formation)",
                year = "2001",
                questionText = "What mass of water is formed when 8.0 g of hydrogen gas reacts completely with excess oxygen gas? [H=1, O=16]",
                optionA = "72.0 g",
                optionB = "36.0 g",
                optionC = "16.0 g",
                optionD = "8.0 g",
                correctAnswerIndex = 0,
                explanation = "Reaction: 2H₂ + O₂ → 2H₂O. 4.0 g of H₂ produces 36.0 g of H₂O. Therefore, 8.0 g of H₂ (2.0 times) reacts to produce 2.0 × 36.0 g = 72.0 g of water.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2001"
            )
        )

        // Q12
        list.add(
            QuestionEntity(
                id = "chm_2001_12",
                subject = "Chemistry",
                topic = "Vapour Density & Relative Atomic Mass",
                year = "2001",
                questionText = "A non-metallic oxide XO₂ has a vapour density of 32. What is the relative atomic mass of element X? [O = 16]",
                optionA = "20",
                optionB = "32",
                optionC = "14",
                optionD = "12",
                correctAnswerIndex = 1,
                explanation = "Relative molecular mass = 2 × Vapour Density = 2 × 32 = 64. Formula is XO₂ ⇒ X + 2(16) = 64 ⇒ X + 32 = 64 ⇒ X = 32 (identifying X as sulphur in SO₂).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2001"
            )
        )

        // Q24
        list.add(
            QuestionEntity(
                id = "chm_2001_24",
                subject = "Chemistry",
                topic = "Quantitative Electrolysis (Current Calculation)",
                year = "2001",
                questionText = "What electric current in amperes will deposit 2.70 g of aluminium from molten bauxite in 2 hours? [Al = 27, 1 Faraday = 96,500 C]",
                optionA = "32 A",
                optionB = "16 A",
                optionC = "8 A",
                optionD = "4 A",
                correctAnswerIndex = 3,
                explanation = "Al³⁺ + 3e⁻ → Al. Moles of Al = 2.70 / 27 = 0.10 mol, requiring 3 × 0.10 = 0.30 Faradays of charge = 0.30 × 96,500 = 28,950 C. Time = 2 × 3600 = 7,200 s. Current I = Q / t = 28,950 / 7,200 = 4.02 A ≈ 4 A.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2001"
            )
        )

        // ==========================================
        // 2002 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q25
        list.add(
            QuestionEntity(
                id = "chm_2002_25",
                subject = "Chemistry",
                topic = "Graham's Law of Gaseous Diffusion",
                year = "2002",
                questionText = "A gas X diffuses twice as fast as gas Y under the exact same physical conditions. If the relative molecular mass of X is 28, what is the relative molecular mass of gas Y?",
                optionA = "14",
                optionB = "56",
                optionC = "112",
                optionD = "120",
                correctAnswerIndex = 2,
                explanation = "By Graham's law: (Rate X / Rate Y) = √(MM Y / MM X). Given Rate X / Rate Y = 2 ⇒ 2 = √(MM Y / 28). Squaring both sides: 4 = MM Y / 28 ⇒ MM Y = 4 × 28 = 112.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2002"
            )
        )

        // Q44
        list.add(
            QuestionEntity(
                id = "chm_2002_44",
                subject = "Chemistry",
                topic = "Volumetric Analysis (Carbonate Neutralization)",
                year = "2002",
                questionText = "25.0 cm³ of a 0.20 mol/dm³ solution of Na₂CO₃ requires 20.0 cm³ of an aqueous solution of HCl for complete neutralization. What is the concentration of the HCl solution?",
                optionA = "0.20 mol/dm³",
                optionB = "0.40 mol/dm³",
                optionC = "0.50 mol/dm³",
                optionD = "0.60 mol/dm³",
                correctAnswerIndex = 2,
                explanation = "Reaction: Na₂CO₃ + 2HCl → 2NaCl + H₂O + CO₂. Volumetric formula: (Cₐ × Vₐ) / (C_b × V_b) = 2 / 1 ⇒ (Cₐ × 20.0) / (0.20 × 25.0) = 2 ⇒ 20.0 × Cₐ = 2 × 5.0 = 10.0 ⇒ Cₐ = 10.0 / 20.0 = 0.50 mol/dm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2002"
            )
        )

        // ==========================================
        // 2003 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q3
        list.add(
            QuestionEntity(
                id = "chm_2003_03",
                subject = "Chemistry",
                topic = "Percentage Composition by Mass",
                year = "2003",
                questionText = "What is the percentage by mass of oxygen in hydrated aluminium sulphate, Al₂(SO₄)₃·2H₂O? [Al = 27, S = 32, H = 1, O = 16]",
                optionA = "14.29%",
                optionB = "25.39%",
                optionC = "50.79%",
                optionD = "59.25%",
                correctAnswerIndex = 3,
                explanation = "Molar mass of Al₂(SO₄)₃·2H₂O = 2(27) + 3[32 + 4(16)] + 2(18) = 54 + 288 + 36 = 378 g/mol. Total oxygen atoms = (3 × 4) + 2 = 14. Mass of oxygen = 14 × 16 = 224 g. % Oxygen = (224 / 378) × 100% = 59.25%.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2003"
            )
        )

        // ==========================================
        // 2004 CHEMISTRY UTME EXAMINATION
        // ==========================================

        // Q5
        list.add(
            QuestionEntity(
                id = "chm_2004_05",
                subject = "Chemistry",
                topic = "Quantitative Electrolysis (Silver Deposition)",
                year = "2004",
                questionText = "What mass of silver is deposited on the cathode when a steady current of 10.0 A is passed through a silver nitrate solution for 4,830 seconds? [Ag = 108, 1 Faraday = 96,500 C]",
                optionA = "54.0 g",
                optionB = "27.0 g",
                optionC = "13.5 g",
                optionD = "108.0 g",
                correctAnswerIndex = 0,
                explanation = "Charge Q = I × t = 10.0 A × 4830 s = 48,300 C. Faradays of charge = 48,300 / 96,500 = 0.50 F. Since Ag⁺ + e⁻ → Ag (1 F deposits 1 mole = 108 g), 0.50 F deposits 0.50 × 108 g = 54.0 g of silver.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2004"
            )
        )

        // Q10
        list.add(
            QuestionEntity(
                id = "chm_2004_10",
                subject = "Chemistry",
                topic = "Stoichiometry & Gas Evolution",
                year = "2004",
                questionText = "What volume of carbon (IV) oxide gas is evolved at S.T.P. when 2.0 g of calcium trioxocarbonate (IV) is added to excess hydrochloric acid? [Ca = 40, C = 12, O = 16, Molar volume at STP = 22,400 cm³]",
                optionA = "224 cm³",
                optionB = "112 cm³",
                optionC = "448 cm³",
                optionD = "2,240 cm³",
                correctAnswerIndex = 2,
                explanation = "Reaction: CaCO₃ + 2HCl → CaCl₂ + H₂O + CO₂. Molar mass of CaCO₃ = 40 + 12 + 48 = 100 g/mol. Moles of CaCO₃ = 2.0 / 100 = 0.020 mol. Produced CO₂ = 0.020 mol × 22,400 cm³/mol = 448 cm³.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry Past Question • 2004"
            )
        )

        return list
    }
}
