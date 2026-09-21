package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB Chemistry Master Revision Table (1983 - 2004 Series)
 * Comprehensive collection of authentic historical Chemistry examination questions
 * covering Chemical Combinations, Stoichiometry, Electrolysis, Redox, Organic Chemistry,
 * Gas Laws, Periodic Trends, Acids/Bases/Salts, and Qualitative Analysis.
 */
object JambChemistryMasterRevisionTableBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(q("chem_rev_1983_q01", "X is a crystalline salt of sodium. A solution of X in water turns litmus red and produces a gas which turns lime water milky when added to sodium carbonate. With barium chloride solution, X gives a white precipitate which is insoluble in dilute hydrochloric acid. X is",
            "A. Na₂CO₃", "B. NaHCO₃", "C. NaHSO₄", "D. Na₂SO₄", 2,
            "NaHSO₄ is an acid salt that yields H⁺ ions in solution, turning litmus red and reacting with carbonates to release CO₂ gas. Its sulfate group also forms a white, acid-insoluble precipitate of BaSO₄ with barium chloride.", "1983:Q1", "Acids, Bases and Salts"))

        list.add(q("chem_rev_1983_q02", "The alkanol obtained from the production of soap is",
            "A. ethanol", "B. glycerol", "C. methanol", "D. propanol", 1,
            "Saponification is the alkaline hydrolysis of fats and oils (esters of glycerol and fatty acids) with caustic alkalis, yielding soap and glycerol (propane-1,2,3-triol) as a sweet by-product.", "1983:Q2", "Organic Chemistry"))

        list.add(q("chem_rev_1983_q03", "The flame used by welders in cutting metals is",
            "A. butane gas flame", "B. acetylene flame", "C. kerosene flame", "D. oxy-acetylene flame", 3,
            "An oxy-acetylene flame, produced by burning ethyne (acetylene) in excess oxygen, reaches extremely high temperatures of over 3000°C, making it ideal for welding and cutting metals.", "1983:Q3", "Applied Chemistry"))

        list.add(q("chem_rev_1983_q04", "Consecutive members of an alkane homologous series differ by",
            "A. -CH-", "B. -CH₂-", "C. -CH₃-", "D. -CₙH₂ₙ-", 1,
            "Homologous series represent families of organic compounds where consecutive members differ structurally by a constant methylene group (-CH₂-) and by a relative molecular mass of 14.", "1983:Q4", "Organic Chemistry"))

        list.add(q("chem_rev_1983_q05", "If an element has the electronic configuration 1s² 2s² 2p⁶ 3s² 3p², it is",
            "A. a metal", "B. an alkaline earth metal", "C. an s-block element", "D. a p-block element", 3,
            "The element is Silicon (atomic number 14). Its valence shell has electrons in the 3p subshell, classifying it as a p-block element because its outer shell configuration ends in p.", "1983:Q5", "Atomic Structure"))

        list.add(q("chem_rev_1983_q06", "Some copper (II) sulphate pentahydrate (CuSO₄·5H₂O) was heated at 120°C with the following results: Wt of crucible = 10.00 g; Wt of crucible + CuSO₄·5H₂O = 14.98 g; Wt of crucible + residue = 13.54 g. How many molecules of water of crystallization were lost? [H=1, Cu=63.5, O=16, S=32]",
            "A. 1", "B. 2", "C. 3", "D. 4", 3,
            "Initial mass of CuSO₄·5H₂O = 4.98 g (0.02 mol, since molar mass is 249.5 g/mol). Mass of water lost = 14.98 - 13.54 = 1.44 g (0.08 mol). The ratio of moles of water lost to hydrate is 0.08 / 0.02 = 4.", "1983:Q6", "Stoichiometry"))

        list.add(q("chem_rev_1983_q07", "The three-dimensional shape of methane is",
            "A. hexagonal", "B. trigonal planar", "C. linear", "D. tetrahedral", 3,
            "Methane (CH₄) has four bonding pairs and zero lone pairs around its central carbon atom. According to VSEPR theory, these pairs adopt sp³ hybridization and a symmetrical tetrahedral shape with bond angles of 109.5°.", "1983:Q7", "Chemical Bonding"))

        list.add(q("chem_rev_1983_q08", "Compound W (obtained by reacting ethanol with ethanoic acid in the presence of concentrated H₂SO₄) is",
            "A. a soap", "B. an oil", "C. an alkane", "D. an ester", 3,
            "Reacting ethanol with ethanoic acid in the presence of a concentrated sulfuric acid catalyst produces ethyl ethanoate, which belongs to the ester family.", "1983:Q8", "Organic Chemistry"))

        list.add(q("chem_rev_1983_q09", "The molecular formula of a carbohydrate X having a relative molecular mass of 180 and an empirical atomic ratio of C, H, O as 1:2:1 is",
            "A. C₁₂H₂₂O₁₁", "B. C₆H₁₂O₆", "C. C₃H₆O₃", "D. C₅H₁₀O₅", 1,
            "The empirical formula is CH₂O (formula mass = 12 + 2 + 16 = 30). With a relative molecular mass of 180, the scaling factor n = 180 / 30 = 6, yielding the molecular formula C₆H₁₂O₆ (glucose/fructose).", "1983:Q9", "Stoichiometry"))

        list.add(q("chem_rev_1983_q10", "The fermentation reaction of glucose with yeast forms the basis of the",
            "A. plastic industry", "B. textile industry", "C. brewing industry", "D. soap industry", 2,
            "Yeast contains the enzyme zymase which anaerobically ferments glucose into ethanol and carbon dioxide. This chemical pathway is the foundational process of the brewing and alcohol industry.", "1983:Q10", "Applied Chemistry"))

        list.add(q("chem_rev_1983_q11", "A mixture of common salt, ammonium chloride, and barium sulphate can best be separated by",
            "A. addition of water followed by filtration then sublimation", "B. addition of water followed by sublimation then filtration", "C. sublimation followed by addition of water then filtration", "D. fractional distillation", 2,
            "Heating the dry mixture sublimates volatile ammonium chloride first. Adding water to the remaining residue dissolves the salt (NaCl) while leaving barium sulfate insoluble, which is then separated by filtration.", "1983:Q11", "Separation Techniques"))

        list.add(q("chem_rev_1983_q12", "Which of the following relationships between the pressure P, volume V, and absolute temperature T represents ideal gas behavior?",
            "A. P ∝ VT", "B. P ∝ T / V", "C. PT ∝ V", "D. PV ∝ V / T", 1,
            "According to the Ideal Gas Equation (PV = nRT), pressure is directly proportional to absolute temperature and inversely proportional to volume, represented as P ∝ T/V.", "1983:Q12", "Gas Laws"))

        list.add(q("chem_rev_1983_q13", "In an experiment where solid ammonium chloride is heated in a test tube with a damp neutral litmus paper placed at the mouth, the litmus paper will initially",
            "A. be bleached", "B. turn green", "C. turn red", "D. turn blue", 3,
            "Ammonium chloride undergoes thermal decomposition to yield NH₃ and HCl. Since alkaline ammonia gas (NH₃) is lighter (RMM 17) and diffuses faster than acidic HCl (RMM 36.5), it reaches the litmus paper first, turning it blue initially.", "1983:Q13", "Gas Laws & Diffusion"))

        list.add(q("chem_rev_1983_q16", "In which of the following processes is iron being oxidized?\n(1) Fe + H₂SO₄ → H₂ + FeSO₄\n(2) FeSO₄ + H₂S → FeS + H₂SO₄\n(3) 2FeCl₂ + Cl₂ → 2FeCl₃\n(4) 2FeCl₃ + SnCl₂ → 2FeCl₂ + SnCl₄",
            "A. 1 only", "B. 2 only", "C. 3 only", "D. 1 and 3", 3,
            "In reaction (1), Fe goes from oxidation state 0 to +2. In reaction (3), Fe goes from +2 to +3. Both represent oxidation because iron loses electrons and its oxidation number increases.", "1983:Q16", "Redox Reactions"))

        list.add(q("chem_rev_1983_q17", "A current was passed for 10 minutes and 0.63 g of copper was deposited on the cathode of a CuSO₄ cell. The mass of silver deposited in an AgNO₃ cell connected in series during the same period would be [Cu = 63, Ag = 108]",
            "A. 0.54 g", "B. 1.08 g", "C. 1.62 g", "D. 2.16 g", 3,
            "By Faraday's second law: Mass of Ag / Mass of Cu = Equivalent Wt of Ag / Equivalent Wt of Cu. Equivalent wt of Cu = 63 / 2 = 31.5; Equivalent wt of Ag = 108 / 1 = 108. Mass of Ag = 0.63 × (108 / 31.5) = 2.16 g.", "1983:Q17", "Electrolysis"))

        list.add(q("chem_rev_1983_q18", "In the reaction Fe + Cu²⁺ → Fe²⁺ + Cu, iron displaces copper ions to form metallic copper. This is because",
            "A. iron is in the metallic form while copper is in the ionic form", "B. the atomic weight of copper is greater than that of iron", "C. copper metal has more electrons than iron metal", "D. iron is higher in the electrochemical series than copper", 3,
            "Iron is located above copper in the electrochemical activity series. It has a higher oxidation potential and is more electropositive, allowing it to readily reduce and displace copper ions from solution.", "1983:Q18", "Electrochemistry"))

        list.add(q("chem_rev_1983_q19", "What is the correct IUPAC name of the compound C₂H₅-C(CH₃)=CH₂?",
            "A. 2-methylbut-1-ene", "B. 2-methylbut-2-ene", "C. 3-methylbut-1-ene", "D. 2-methylprop-1-ene", 0,
            "The longest carbon chain containing the double bond has four carbon atoms, numbering from the right end to give the double bond index 1. A methyl group is attached to carbon-2, making it 2-methylbut-1-ene.", "1983:Q19", "Organic Chemistry"))

        list.add(q("chem_rev_1983_q21", "A piece of burning sulphur will continue to burn in a gas jar of oxygen to give misty fumes which readily dissolve in water. The resulting liquid is",
            "A. sulphur (VI) trioxide", "B. tetraoxosulphate (VI) acid", "C. trioxosulphate (IV) acid", "D. hydrogen sulphide", 2,
            "Burning sulfur produces sulfur dioxide gas (SO₂). Dissolving SO₂ gas in water yields weak trioxosulphate (IV) acid (sulfurous acid, H₂SO₃).", "1983:Q21", "Non-Metals and their Compounds"))

        list.add(q("chem_rev_1983_q22", "Sodium sulphate decahydrate (Na₂SO₄·10H₂O) on exposure to air loses all its water of crystallization. This process is known as",
            "A. Efflorescence", "B. Hygroscopy", "C. Deliquescence", "D. Effervescence", 0,
            "Efflorescence is the property of hydrated crystals to spontaneously lose some or all of their water of crystallization to the atmosphere on exposure to dry air.", "1983:Q22", "Water and Solutions"))

        list.add(q("chem_rev_1983_q23", "Which of the following occurs during the electrolysis of molten sodium chloride?",
            "A. Sodium ion loses an electron", "B. Chlorine atom gains an electron", "C. Chloride ion gains an electron", "D. Chloride ion is oxidized", 3,
            "During electrolysis of molten NaCl, chloride ions (Cl⁻) migrate to the positive anode and lose electrons (undergo oxidation) to form chlorine gas (2Cl⁻ → Cl₂ + 2e⁻).", "1983:Q23", "Electrolysis"))

        list.add(q("chem_rev_1983_q24", "Crude petroleum pollutant usually seen on some Nigerian creeks and waterways can be dispersed or removed by",
            "A. heating the affected parts in order to boil off the petroleum", "B. mechanically stirring to dissolve the petroleum in water", "C. pouring organic solvents to dissolve the petroleum", "D. spraying the water with detergents", 3,
            "Detergents contain surfactant molecules with hydrophilic and lipophilic properties that act as emulsifiers, breaking up oil slicks into fine droplets to disperse them safely in water.", "1983:Q24", "Environmental Chemistry"))

        list.add(q("chem_rev_1983_q25", "An element is electronegative if",
            "A. it has a tendency to exist in the gaseous form", "B. its ions dissolve readily in water", "C. it has a tendency to lose electrons", "D. it has a tendency to gain electrons", 3,
            "Electronegativity is defined as the measure of the relative tendency or power of an atom in a molecule to attract and acquire shared electrons.", "1983:Q25", "Periodic Properties"))

        list.add(q("chem_rev_1983_q26", "Solutions X, Y, and Z have pH values of 3.0, 5.0, and 9.0 respectively. Which of the following statements is correct?",
            "A. All the solutions are acidic", "B. All solutions are basic", "C. Y and Z are more acidic than water", "D. Z is the least acidic", 3,
            "Since pH scales from 1 (most acidic) to 14 (most alkaline), a lower pH indicates higher acidity. Z has a pH of 9.0 (alkaline), making it the least acidic of the three.", "1983:Q26", "Acids, Bases and Salts"))

        list.add(q("chem_rev_1983_q28", "Which of the following metals (Mg, Fe, Pb, and Cu) will dissolve in dilute hydrochloric acid?",
            "A. All the metals", "B. Mg, Fe, and Cu", "C. Mg, Fe, and Pb", "D. Mg and Fe only", 2,
            "Metals that lie above hydrogen in the electrochemical activity series (such as Magnesium, Iron, and Lead) react with dilute acids to liberate hydrogen gas and dissolve as chloride salts.", "1983:Q28", "Metals and their Compounds"))

        list.add(q("chem_rev_1983_q29", "Stainless steel is an alloy composed of",
            "A. Carbon, iron and lead", "B. Carbon, iron and chromium", "C. Carbon, iron and copper", "D. Carbon, iron and silver", 1,
            "Stainless steel is an alloy containing iron, carbon, and at least 10.5% chromium by mass, which provides its exceptional corrosion and rust resistance.", "1983:Q29", "Metals & Alloys"))

        list.add(q("chem_rev_1983_q30", "What volume of 0.50 M H₂SO₄ will exactly neutralize 20 cm³ of 0.1 M NaOH solution?",
            "A. 2.0 cm³", "B. 5.0 cm³", "C. 6.8 cm³", "D. 8.3 cm³", 0,
            "The reaction is H₂SO₄ + 2NaOH → Na₂SO₄ + 2H₂O. Using (CₐVₐ / C_bV_b) = (nₐ / n_b): (0.50 × Vₐ) / (0.10 × 20) = 1/2. Thus, 1.0 × Vₐ = 2.0 → Vₐ = 2.0 cm³.", "1983:Q30", "Volumetric Analysis"))

        list.add(q("chem_rev_1983_q35", "Increasing the pressure of a fixed mass of gas at constant temperature",
            "A. lowers the average kinetic energy of the molecules", "B. decreases the density of the gas", "C. decreases the temperature of the gas", "D. increases the density of the gas", 3,
            "According to Boyle's law, increasing pressure decreases the volume of a fixed mass of gas, packing molecules closer together and thereby increasing its density (density = mass / volume).", "1983:Q35", "Gas Laws"))

        list.add(q("chem_rev_1983_q36", "2.50 g of a hydrated barium salt gave on heating 2.13 g of the anhydrous salt. Given that the relative molecular mass of the anhydrous salt is 208, the number of molecules of water of crystallization of the barium salt is [H=1, O=16]",
            "A. 10", "B. 7", "C. 5", "D. 2", 3,
            "Mass of water lost = 2.50 - 2.13 = 0.37 g. Moles of anhydrous Ba salt = 2.13 / 208 = 0.0102 mol. Moles of H₂O = 0.37 / 18 = 0.0205 mol. Mole ratio = 0.0205 / 0.0102 ≈ 2 molecules.", "1983:Q36", "Stoichiometry"))

        list.add(q("chem_rev_1983_q43", "A jet plane carrying 3,000 kg of ethane burns off all the gas forming water and carbon dioxide. If all the carbon dioxide is expelled and the water formed is condensed and kept on board the plane, then the gain in weight is [C=12, H=1, O=16]",
            "A. 1,800 kg", "B. 900 kg", "C. 600 kg", "D. 2,400 kg", 3,
            "Combustion: 2C₂H₆ + 7O₂ → 4CO₂ + 6H₂O. 60 g of ethane reacts with 224 g of atmospheric oxygen to produce 108 g of water. For 3,000 kg of ethane, atmospheric oxygen absorbed = 11,200 kg; CO₂ lost = 8,800 kg. Net gain = 11,200 - 8,800 = 2,400 kg.", "1983:Q43", "Stoichiometry"))

        list.add(q("chem_rev_1983_q48", "The rate of the chemical reaction Zn + H₂SO₄ → ZnSO₄ + H₂ will be greatly increased if",
            "A. the zinc is in the powdered form", "B. a greater volume of dilute acid is used", "C. a smaller volume of acid is used", "D. the reaction vessel is immersed in an ice-bath", 0,
            "Finely dividing a solid reactant into powder dramatically increases its exposed surface area, allowing more frequent successful collisions between the zinc atoms and hydrogen ions.", "1983:Q48", "Rates of Reactions"))

        list.add(q("chem_rev_1984_q01", "Sodium chloride may be obtained from brine by",
            "A. titration", "B. decantation", "C. distillation", "D. evaporation to dryness", 3,
            "Since sodium chloride is a non-volatile, highly soluble salt dissolved in water, evaporating the water solvent leaves behind dry solid crystals of NaCl.", "1984:Q1", "Separation Techniques"))

        list.add(q("chem_rev_1984_q02", "20 cm³ of hydrogen gas are sparked with 20 cm³ of oxygen gas in an eudiometer at 373 K and 1 atm. The resulting mixture is cooled to 298 K and passed over calcium chloride. The volume of the residual gas is",
            "A. 40 cm³", "B. 20 cm³", "C. 30 cm³", "D. 10 cm³", 3,
            "Reaction: 2H₂(g) + O₂(g) → 2H₂O(g). 20 cm³ of H₂ reacts with 10 cm³ of O₂. On cooling to 298 K, water condenses and is absorbed by anhydrous CaCl₂, leaving 10 cm³ of unreacted oxygen gas.", "1984:Q2", "Gas Calculations"))

        list.add(q("chem_rev_1984_q03", "For the reaction NH₄NO₂ → N₂ + 2H₂O, calculate the volume of nitrogen produced at S.T.P. from 3.20 g of the salt. [N=14, O=16, H=1, GMV = 22.4 dm³]",
            "A. 2.24 dm³", "B. 22.4 dm³", "C. 4.48 dm³", "D. 1.12 dm³", 3,
            "Molar mass of NH₄NO₂ = 14 + 4 + 14 + 32 = 64 g/mol. Moles of salt used = 3.20 / 64 = 0.05 mol. Since 1 mole of salt yields 1 mole of N₂, 0.05 mol yields 0.05 × 22.4 dm³ = 1.12 dm³.", "1984:Q3", "Stoichiometry"))

        list.add(q("chem_rev_1984_q04", "Manganese (IV) oxide reacts with concentrated hydrochloric acid according to the equation MnO₂ + xHCl → MnCl₂ + Cl₂ + yH₂O. The values of x and y are",
            "A. 2 and 5 respectively", "B. 2 and 4 respectively", "C. 4 and 2 respectively", "D. 4 and 1 respectively", 2,
            "To balance chlorine and hydrogen atoms on both sides: MnO₂ + 4HCl → MnCl₂ + Cl₂ + 2H₂O. Thus, x = 4 and y = 2.", "1984:Q4", "Chemical Equations"))

        list.add(q("chem_rev_1984_q05", "A 1.0 M solution of caustic soda (NaOH) can be prepared by dissolving",
            "A. 40 g NaOH in 100 g of water", "B. 40 g NaOH in 100 g of solution", "C. 20 g NaOH in 500 cm³ of solution", "D. 20 g NaOH in 1000 cm³ of solution", 2,
            "A 1.0 M solution contains 1 mole (40 g NaOH) per 1000 cm³ (1 dm³) of solution. Dissolving 20 g (0.5 mol) of NaOH in 500 cm³ (0.5 dm³) of solution maintains this exact 1.0 M concentration.", "1984:Q5", "Volumetric Analysis"))

        list.add(q("chem_rev_1984_q11", "The balanced chemical equation for the reaction of tetraoxosulphate (VI) acid with aluminium hydroxide is",
            "A. H₂SO₄ + AlSO₄ → 2H₂O + AlSO₄", "B. HSO₄ + AlOH → H₂O + AlSO₄", "C. 3H₂SO₄ + 2AlH₃ → 6H₂O + Al(SO₄)₃", "D. 3H₂SO₄ + 2Al(OH)₃ → 6H₂O + Al₂(SO₄)₃", 3,
            "Aluminium hydroxide reacts with sulfuric acid in a neutralization reaction to yield aluminium sulfate and water: 3H₂SO₄ + 2Al(OH)₃ → Al₂(SO₄)₃ + 6H₂O.", "1984:Q11", "Chemical Equations"))

        list.add(q("chem_rev_1984_q14", "In which of the following reactions does hydrogen peroxide act as a reducing agent?",
            "A. H₂S + H₂O₂ → S + 2H₂O", "B. PbSO₃ + H₂O₂ → PbSO₄ + H₂O", "C. 2I⁻ + 2H⁺ + H₂O₂ → I₂ + 2H₂O", "D. PbO₂ + 2HNO₃ + H₂O₂ → Pb(NO₃)₂ + 2H₂O + O₂", 3,
            "In reaction D, lead is reduced from +4 in PbO₂ to +2 in Pb(NO₃)₂. Concurrently, the oxygen atoms in H₂O₂ are oxidized from -1 to 0 in O₂ gas, proving H₂O₂ acts as a reducing agent.", "1984:Q14", "Redox Reactions"))

        list.add(q("chem_rev_1984_q19", "Which of the following methods is used to prepare trioxonitrate (V) acid in the laboratory?",
            "A. Heating ammonia gas with tetraoxosulphate (IV) acid", "B. Heating ammonium trioxosulphate (V) with tetraoxonitrate (V) acid", "C. Heating sodium trioxonitrate (V) with concentrated tetraoxosulphate (VI) acid", "D. Heating potassium trioxonitrate (V) with calcium hydroxide", 2,
            "In the laboratory, volatile HNO₃ is prepared by heating a metal nitrate (such as NaNO₃ or KNO₃) with less volatile concentrated sulfuric acid (H₂SO₄) in an all-glass retort.", "1984:Q19", "Acids and Bases"))

        list.add(q("chem_rev_1984_q20", "Lime-water, which is used in the laboratory for the detection of carbon (IV) oxide, is an aqueous solution of",
            "A. Ca(OH)₂", "B. CaCO₃", "C. Ca(HCO₃)₂", "D. CaSO₄", 0,
            "Lime water is a clear, aqueous saturated solution of calcium hydroxide (Ca(OH)₂). It turns milky upon reacting with carbon dioxide to precipitate insoluble calcium carbonate.", "1984:Q20", "Qualitative Analysis"))

        list.add(q("chem_rev_1984_q26", "In the reaction 3Cl₂ + 2NH₃ → N₂ + 6HCl, ammonia acts as",
            "A. a reducing agent", "B. an oxidizing agent", "C. a dehydrating agent", "D. a catalyst", 0,
            "The oxidation number of nitrogen in ammonia increases from -3 in NH₃ to 0 in N₂ gas, meaning ammonia loses electrons, undergoes oxidation, and acts as the reducing agent.", "1984:Q26", "Redox Reactions"))

        list.add(q("chem_rev_1984_q27", "In the Haber process for the industrial manufacture of ammonia, finely divided iron is used as",
            "A. an ionizing agent", "B. a reducing agent", "C. a catalyst", "D. a dehydrating agent", 2,
            "Finely divided iron serves as a heterogeneous catalyst to lower the activation energy of the reaction between nitrogen and hydrogen gases, accelerating the reaction rate.", "1984:Q27", "Chemical Equilibrium & Catalysis"))

        list.add(q("chem_rev_1984_q30", "When the heavy kerosene fraction of petroleum is heated at high temperature and pressure, lower boiling liquids are obtained. This process is known as",
            "A. polymerization", "B. refining", "C. hydrogenation", "D. cracking", 3,
            "Cracking is the thermal or catalytic decomposition of heavy, higher-boiling alkane hydrocarbons into smaller, more valuable alkenes and volatile alkanes for motor fuels.", "1984:Q30", "Petroleum Chemistry"))

        list.add(q("chem_rev_1984_q31", "What is the IUPAC name for the organic compound CH₃-CH₂-COOH?",
            "A. acetic acid", "B. propanal", "C. propanol", "D. propanoic acid", 3,
            "The compound contains three carbon atoms in a continuous saturated chain ending in a carboxylic acid group (-COOH), which gives it the IUPAC name propanoic acid.", "1984:Q31", "Organic Chemistry"))

        list.add(q("chem_rev_1984_q32", "Alkaline hydrolysis of naturally occurring fats and oils yields",
            "A. fats and acids", "B. soaps and glycerol", "C. margarine and butter", "D. esters and water", 1,
            "Alkaline hydrolysis (saponification) of natural triglycerides (esters of fatty acids) with sodium hydroxide produces sodium salts of fatty acids (soaps) and propane-1,2,3-triol (glycerol).", "1984:Q32", "Organic Chemistry"))

        list.add(q("chem_rev_1984_q36", "If the cost of electricity required to deposit 1 g of magnesium is ₦5.00, how much would it cost to deposit 10 g of aluminium? [Al = 27, Mg = 24]",
            "A. ₦10.00", "B. ₦27.00", "C. ₦44.44", "D. ₦66.67", 3,
            "Equivalent mass of Mg = 24 / 2 = 12 g. Depositing 1 g of Mg requires 1/12 F, costing ₦5.00. Equivalent mass of Al = 27 / 3 = 9 g. Depositing 10 g of Al requires 10/9 F. Cost = (10/9) / (1/12) × ₦5.00 = (120/9) × 5 = ₦66.67.", "1984:Q36", "Electrolysis"))

        list.add(q("chem_rev_1984_q41", "Sodium hydroxide (NaOH) pellets on exposure to air become wet and eventually form a solution. This shows that NaOH is",
            "A. deliquescent", "B. hygroscopic", "C. efflorescent", "D. hydrated", 0,
            "Deliquescence is the phenomenon where a substance absorbs sufficient atmospheric moisture to dissolve completely in it and form an aqueous solution.", "1984:Q41", "Water and Solutions"))

        list.add(q("chem_rev_1984_q45", "The primary function of concentrated H₂SO₄ in the esterification of ethanoic acid with ethanol is to",
            "A. serve as a solvent", "B. serve as a reducing agent", "C. act as a catalyst and dehydrating agent", "D. prevent any side reaction", 2,
            "Concentrated sulfuric acid acts as an acid catalyst to protonate the carbonyl group, accelerating ester formation, while simultaneously absorbing product water to shift the equilibrium forward.", "1984:Q45", "Organic Chemistry"))

        list.add(q("chem_rev_1984_q50", "At S.T.P., how many litres of hydrogen can be obtained from the reaction of 500 cm³ of 0.5 M H₂SO₄ with excess zinc metal? [GMV = 22.4 dm³/mol]",
            "A. 22.4 dm³", "B. 11.2 dm³", "C. 6.5 dm³", "D. 5.6 dm³", 3,
            "Reaction: Zn + H₂SO₄ → ZnSO₄ + H₂. Moles of H₂SO₄ = 0.500 dm³ × 0.5 mol/dm³ = 0.25 mol. Excess zinc produces 0.25 mol of H₂ gas. Volume at S.T.P. = 0.25 × 22.4 dm³ = 5.6 dm³ (litres).", "1984:Q50", "Gas Calculations"))

        list.add(q("chem_rev_1985_q01", "Which block of the Periodic Table do elements on the far right (Groups 13 to 18) belong to?",
            "A. s-block", "B. d-block", "C. f-block", "D. p-block", 3,
            "In the modern periodic table layout, main-group elements on the far right (Groups 13 to 18) fill their outer valence electrons into p-orbitals, forming the p-block.", "1985:Q1", "Periodic Table"))

        list.add(q("chem_rev_1985_q02", "Which of the following allotropes of carbon conducts electricity?",
            "A. Sulphur", "B. Graphite", "C. Diamond", "D. Coal", 1,
            "Graphite has sp² hybridized carbon atoms arranged in planar hexagonal sheets with delocalized, unhybridized p-electrons that move freely across layers to conduct electric current.", "1985:Q2", "Carbon and its Compounds"))

        list.add(q("chem_rev_1985_q03", "An organic compound contains 72% carbon, 12% hydrogen, and 16% oxygen by mass. The empirical formula of the compound is [C=12, H=1, O=16]",
            "A. C₆H₂₂O₃", "B. C₆H₁₀O₃", "C. C₁₂H₁₂O", "D. C₆H₁₂O", 3,
            "Moles: C = 72 / 12 = 6; H = 12 / 1 = 12; O = 16 / 16 = 1. Dividing by smallest value (1) gives the integer ratio C:H:O = 6:12:1, which gives the empirical formula C₆H₁₂O.", "1985:Q3", "Stoichiometry"))

        list.add(q("chem_rev_1985_q04", "0.499 g of hydrated copper (II) sulphate (CuSO₄·xH₂O) when heated to constant weight gave a residue of 0.346 g. The value of x is [Cu=63.5, S=32, O=16, H=1]",
            "A. 1.0", "B. 2.0", "C. 3.0", "D. 5.0", 3,
            "Residue anhydrous CuSO₄ = 0.346 g (0.346 / 159.5 = 0.00217 mol). Mass of water lost = 0.499 - 0.346 = 0.153 g (0.153 / 18 = 0.0085 mol). Mole ratio x = 0.0085 / 0.00217 ≈ 5 (CuSO₄·5H₂O).", "1985:Q4", "Stoichiometry"))

        list.add(q("chem_rev_1985_q05", "In a laboratory experiment, which of the following observations would confirm that a solid sample is an impure mixture?",
            "A. The solid can be ground to a fine powder", "B. The density of the solid is 2.25 g/dm³", "C. The solid begins to melt at 648 K and completes at 748 K", "D. The solid absorbs moisture from the atmosphere", 2,
            "Pure chemical substances exhibit sharp, definite melting points, whereas impure mixtures melt gradually over an extended temperature range.", "1985:Q5", "States of Matter & Purity"))

        list.add(q("chem_rev_1985_q17", "Copper sulphate solution is electrolyzed using inert platinum electrodes. A current of 0.193 amperes is passed for 2 hours. How many grams of copper are deposited? [Cu = 63.5, 1 F = 96,500 C]",
            "A. 0.457 g", "B. 0.500 g", "C. 0.882 g", "D. 0.914 g", 0,
            "Charge Q = I × t = 0.193 A × 7200 s = 1389.6 C. Cu²⁺ + 2e⁻ → Cu (requires 2 × 96,500 = 193,000 C per mole of Cu). Mass = (1389.6 × 63.5) / 193,000 = 0.457 g.", "1985:Q17", "Electrolysis"))

        list.add(q("chem_rev_1985_q25", "Which of the following metals will displace iron from an aqueous solution of iron(II) tetraoxosulphate(VI)?",
            "A. Copper", "B. Mercury", "C. Silver", "D. Zinc", 3,
            "Zinc lies above iron in the electrochemical activity series. Being more electropositive, zinc reduces and displaces Fe²⁺ ions to form metallic iron.", "1985:Q25", "Metals & Activity Series"))

        list.add(q("chem_rev_1985_q26", "Complete catalytic hydrogenation of ethyne gas yields",
            "A. benzene", "B. methane", "C. ethene", "D. ethane", 3,
            "Catalytic hydrogenation of ethyne (an alkyne) with excess hydrogen gas over a nickel catalyst first reduces it to ethene (alkene) and finally to fully saturated ethane (alkane).", "1985:Q26", "Organic Chemistry"))

        list.add(q("chem_rev_1985_q27", "Which of the following gases is used in the industrial manufacture of bleaching powder?",
            "A. sulphur dioxide", "B. chlorine", "C. hydrogen chloride", "D. nitrogen dioxide", 1,
            "Bleaching powder (calcium oxychloride, CaOCl₂) is manufactured by passing chlorine gas over dry slaked lime (calcium hydroxide, Ca(OH)₂).", "1985:Q27", "Industrial Chemistry"))

        list.add(q("chem_rev_1985_q34", "Tetraoxosulphate (VI) ions (SO₄²⁻) in aqueous solution are confirmed using",
            "A. acidified silver nitrate", "B. acidified barium chloride", "C. lime-water", "D. dilute hydrochloric acid", 1,
            "Acidified BaCl₂ reacts with SO₄²⁻ to form a dense white precipitate of BaSO₄, which remains insoluble even after adding excess dilute hydrochloric acid.", "1985:Q34", "Qualitative Analysis"))

        list.add(q("chem_rev_1985_q35", "What is the IUPAC name for the branched alkene CH₃-CH(CH₃)-CH(CH₃)-CH=CH-CH₃?",
            "A. 2-methyl-3-pentene", "B. 4,5-dimethylhex-2-ene", "C. 2-methyl-2-pentene", "D. 4-methyl-3-pentene", 1,
            "The longest continuous carbon chain containing the double bond has six carbons (hex-2-ene, numbered from the double bond end). Methyl groups reside on carbons 4 and 5, giving 4,5-dimethylhex-2-ene.", "1985:Q35", "Organic Chemistry"))

        list.add(q("chem_rev_1985_q36", "Mixing aqueous solutions of barium hydroxide and sodium tetraoxocarbonate(IV) produces a white precipitate of",
            "A. barium oxide", "B. sodium oxide", "C. sodium hydroxide", "D. barium tetraoxocarbonate", 3,
            "Barium hydroxide reacts with sodium carbonate in an aqueous double displacement reaction to precipitate insoluble barium carbonate (BaCO₃): Ba(OH)₂ + Na₂CO₃ → BaCO₃↓ + 2NaOH.", "1985:Q36", "Acids, Bases and Salts"))

        list.add(q("chem_rev_1986_q02", "What mass of a divalent metal M (atomic mass = 40) would react with excess hydrochloric acid to liberate 224 cm³ of dry hydrogen gas measured at S.T.P.? [GMV = 22,400 cm³]",
            "A. 8.0 g", "B. 4.0 g", "C. 0.4 g", "D. 2.0 g", 2,
            "Reaction: M + 2HCl → MCl₂ + H₂. 1 mole of divalent metal M (40 g) liberates 1 mole of H₂ (22,400 cm³ at S.T.P.). Thus, 224 cm³ (0.01 mol) requires 0.01 × 40 = 0.4 g of metal M.", "1986:Q2", "Stoichiometry"))

        list.add(q("chem_rev_1986_q05", "How many grams of magnesium are required to react completely with 250 cm³ of 0.5 M HCl? [Mg = 24]",
            "A. 0.3 g", "B. 1.5 g", "C. 2.4 g", "D. 3.0 g", 1,
            "Reaction: Mg + 2HCl → MgCl₂ + H₂. Moles of HCl = 0.250 dm³ × 0.5 mol/dm³ = 0.125 mol. Required moles of Mg = 0.125 / 2 = 0.0625 mol. Mass = 0.0625 × 24 = 1.5 g.", "1986:Q5", "Stoichiometry"))

        list.add(q("chem_rev_1986_q13", "Which of the following compounds is an acid salt?",
            "A. NaHSO₄", "B. Na₂SO₄", "C. CH₃COONa", "D. Na₂S", 0,
            "An acid salt is formed when only part of the replaceable hydrogen atoms in a polybasic acid are replaced by a metal. NaHSO₄ retains an ionizable H⁺ ion.", "1986:Q13", "Acids, Bases and Salts"))

        list.add(q("chem_rev_1986_q16", "How many coulombs of electricity are passed through an electrolyte when a steady current of 6.5 amperes runs for 1.0 hour?",
            "A. 3.90 × 10² C", "B. 5.50 × 10³ C", "C. 6.54 × 10³ C", "D. 2.34 × 10⁴ C", 3,
            "Quantity of charge Q = I × t = 6.5 A × 3600 seconds = 23,400 C = 2.34 × 10⁴ coulombs.", "1986:Q16", "Electrolysis"))

        list.add(q("chem_rev_1986_q38", "The solid residue left after strongly heating zinc carbonate, which is yellow when hot and white when cold, is",
            "A. lead (II) oxide", "B. calcium oxide", "C. zinc oxide", "D. copper (II) oxide", 2,
            "Thermal decomposition of ZnCO₃ yields zinc oxide (ZnO) and CO₂ gas. ZnO exhibits thermochromism, appearing yellow when hot and reverting to white upon cooling.", "1986:Q38", "Metals and their Compounds"))

        list.add(q("chem_rev_1986_q46", "When ethanol is heated with excess concentrated sulphuric acid at 170°C, the ethanol undergoes",
            "A. oxidation to ethanal", "B. polymerization to polyethene", "C. dehydration to ethene", "D. dehydration to ethyne", 2,
            "At 170°C with excess concentrated sulfuric acid, ethanol is intramolecularly dehydrated to eliminate a water molecule and produce ethene gas (C₂H₅OH → C₂H₄ + H₂O).", "1986:Q46", "Organic Chemistry"))

        list.add(q("chem_rev_1987_q03", "What is the number of molecules of carbon (IV) oxide produced when 10.0 g CaCO₃ is treated with 0.2 dm³ of 1.0 M HCl? [Ca=40, O=16, C=12, N_A = 6.02 × 10²³]",
            "A. 1.00 × 10²³", "B. 6.02 × 10²³", "C. 6.02 × 10²²", "D. 3.01 × 10²²", 2,
            "Reaction: CaCO₃ + 2HCl → CaCl₂ + H₂O + CO₂. Moles of CaCO₃ = 10 / 100 = 0.1 mol. Moles of HCl = 0.2 × 1.0 = 0.2 mol. 0.1 mol of CaCO₃ reacts with 0.2 mol of HCl to yield 0.1 mol of CO₂. Molecules = 0.1 × 6.02 × 10²³ = 6.02 × 10²².", "1987:Q3", "Stoichiometry"))

        list.add(q("chem_rev_1987_q10", "An element Z consists of two isotopes: 90% of ¹⁶Z and 10% of ¹⁸Z. The relative atomic mass of Z is",
            "A. 16.0", "B. 16.2", "C. 17.0", "D. 17.8", 1,
            "Relative atomic mass = (16 × 0.90) + (18 × 0.10) = 14.4 + 1.8 = 16.2.", "1987:Q10", "Atomic Structure"))

        list.add(q("chem_rev_1987_q19", "The basicity of tetraoxophosphate (V) acid (H₃PO₄) is",
            "A. 7", "B. 5", "C. 4", "D. 3", 3,
            "Basicity is the number of replaceable hydrogen ions per molecule of an acid. H₃PO₄ has three ionizable hydrogen atoms, so its basicity is 3 (tribasic).", "1987:Q19", "Acids, Bases and Salts"))

        list.add(q("chem_rev_1987_q21", "A quantity of electricity liberates 3.6 g of silver from its salt. What mass of aluminium will be liberated from its salt by the same quantity of electricity? [Ag = 108, Al = 27]",
            "A. 2.7 g", "B. 1.2 g", "C. 0.9 g", "D. 0.3 g", 3,
            "By Faraday's second law: Mass of Al / Mass of Ag = Eq. mass of Al / Eq. mass of Ag. Eq. mass of Ag = 108 / 1 = 108; Eq. mass of Al = 27 / 3 = 9. Mass of Al = 3.6 × (9 / 108) = 0.3 g.", "1987:Q21", "Electrolysis"))

        list.add(q("chem_rev_1988_q02", "The formula of the compound formed in a reaction between a trivalent metal M and a tetravalent non-metal X is",
            "A. MX", "B. M₂X₃", "C. M₄X₃", "D. M₃X₂", 2,
            "By exchanging valencies (M has valency 3, X has valency 4), the subscripts balance the charges, giving the empirical formula M₄X₃.", "1988:Q2", "Chemical Formulas"))

        list.add(q("chem_rev_1988_q10", "Which of the following periodic properties decreases across a period in the periodic table from left to right?",
            "A. Ionization energy", "B. Electron affinity", "C. Electronegativity", "D. Atomic radius", 3,
            "Across a period from left to right, nuclear charge increases while electron shielding remains constant, pulling the valence shell closer to the nucleus and decreasing the atomic radius.", "1988:Q10", "Periodic Trends"))

        list.add(q("chem_rev_1988_q20", "What volume of 0.1 M H₃PO₄ is required to completely neutralize 45.0 cm³ of 0.2 M NaOH solution?",
            "A. 10.0 cm³", "B. 20.0 cm³", "C. 27.0 cm³", "D. 30.0 cm³", 3,
            "Reaction: H₃PO₄ + 3NaOH → Na₃PO₄ + 3H₂O. Using (CₐVₐ / C_bV_b) = (nₐ / n_b): (0.1 × Vₐ) / (0.2 × 45.0) = 1/3. Thus, 0.1 × Vₐ = 3.0 → Vₐ = 30.0 cm³.", "1988:Q20", "Volumetric Analysis"))

        list.add(q("chem_rev_1988_q33", "In the reaction C₁₂H₂₂O₁₁ → 12C + 11H₂O, concentrated H₂SO₄ is acting as",
            "A. a reducing agent", "B. an oxidizing agent", "C. a dehydrating agent", "D. a catalyst", 2,
            "Concentrated sulfuric acid removes the elements of water (hydrogen and oxygen in a 2:1 ratio) from carbohydrate compounds, leaving behind a black spongy mass of elemental carbon.", "1988:Q33", "Acids and Bases"))

        list.add(q("chem_rev_1989_q04", "20.00 cm³ of a solution containing 0.53 g of anhydrous Na₂CO₃ in 100 cm³ requires 25.00 cm³ of H₂SO₄ for complete neutralization. The concentration of the acid solution in mol/dm³ is [Na=23, C=12, O=16]",
            "A. 0.02 M", "B. 0.04 M", "C. 0.08 M", "D. 0.10 M", 1,
            "Molar mass of Na₂CO₃ = 106 g/mol. Moles in 100 cm³ = 0.53 / 106 = 0.005 mol. Molarity = 0.005 / 0.1 dm³ = 0.05 M. Neutralization: Na₂CO₃ + H₂SO₄ → Na₂SO₄ + H₂O + CO₂. CₐVₐ = C_bV_b → Cₐ × 25 = 0.05 × 20 → Cₐ = 1.0 / 25 = 0.04 M.", "1989:Q4", "Volumetric Analysis"))

        list.add(q("chem_rev_1989_q22", "The same current is passed for the same duration through solutions of AgNO₃ and CuSO₄ connected in series. How much silver will be deposited if 1.0 g of copper is produced? [Ag = 108, Cu = 64]",
            "A. 1.7 g", "B. 3.4 g", "C. 6.8 g", "D. 13.6 g", 1,
            "Equivalent mass of Cu = 64 / 2 = 32 g. Equivalent mass of Ag = 108 / 1 = 108 g. Mass of Ag = 1.0 × (108 / 32) = 3.375 g ≈ 3.4 g.", "1989:Q22", "Electrolysis"))

        list.add(q("chem_rev_1990_q03", "In the reaction SnO₂ + 2C → Sn + 2CO, what mass of coke containing 80% carbon is required to reduce 0.032 kg of pure tin(IV) oxide? [Sn = 119, O = 16, C = 12]",
            "A. 0.40 kg", "B. 0.20 kg", "C. 0.06 kg", "D. 0.006 kg", 3,
            "Molar mass of SnO₂ = 119 + 32 = 151 g/mol. Moles of SnO₂ = 32 g / 151 = 0.212 mol. Required pure carbon = 2 × 0.212 = 0.424 mol = 5.088 g. Since coke is 80% carbon, mass of coke = 5.088 / 0.80 = 6.36 g = 0.00636 kg ≈ 0.006 kg.", "1990:Q3", "Stoichiometry"))

        list.add(q("chem_rev_1990_q21", "What volume of 11.0 M concentrated hydrochloric acid must be diluted with water to prepare 1.0 dm³ of 0.05 M dilute acid?",
            "A. 4.5 cm³", "B. 9.1 cm³", "C. 11.0 cm³", "D. 22.0 cm³", 0,
            "Using the dilution formula M₁V₁ = M₂V₂: 11.0 × V₁ = 0.05 × 1000 cm³ → V₁ = 50 / 11.0 = 4.54 cm³.", "1990:Q21", "Volumetric Analysis"))

        list.add(q("chem_rev_1990_q22", "If 10.8 g of silver is deposited in a silver coulometer connected in series with a dilute acid cell, the volume of dry oxygen liberated at S.T.P. is [Ag = 108, GMV = 22.4 dm³]",
            "A. 0.56 dm³", "B. 5.50 dm³", "C. 11.20 dm³", "D. 22.40 dm³", 0,
            "10.8 g of Ag = 10.8 / 108 = 0.1 mol Ag = 0.1 Faradays of charge. Oxygen half-reaction: 2H₂O → O₂ + 4H⁺ + 4e⁻ (requires 4 F per mole of O₂). Moles of O₂ = 0.1 / 4 = 0.025 mol. Volume at S.T.P. = 0.025 × 22.4 dm³ = 0.56 dm³.", "1990:Q22", "Electrolysis"))

        list.add(q("chem_rev_1990_q24", "In the redox reaction Cr₂O₇²⁻ + 6Fe²⁺ + 14H⁺ → 2Cr³⁺ + 6Fe³⁺ + 7H₂O, the oxidation state of chromium changes from",
            "A. +7 to +3", "B. +6 to +3", "C. +5 to +3", "D. -2 to +3", 1,
            "In the dichromate ion (Cr₂O₇²⁻): 2(Cr) + 7(-2) = -2 → 2Cr - 14 = -2 → 2Cr = +12 → Cr = +6. In Cr³⁺, the oxidation state is +3. Thus, chromium is reduced from +6 to +3.", "1990:Q24", "Redox Reactions"))

        list.add(q("chem_rev_1991_q05", "30 cm³ of oxygen gas at 10 atmospheres pressure is transferred into a 20 dm³ container. Calculate the new pressure if temperature is kept constant.",
            "A. 6.7 atm", "B. 15.0 atm", "C. 0.015 atm", "D. 0.15 atm", 2,
            "By Boyle's law: P₁V₁ = P₂V₂. V₁ = 30 cm³ = 0.030 dm³, P₁ = 10 atm, V₂ = 20 dm³. P₂ = (10 × 0.030) / 20 = 0.30 / 20 = 0.015 atm.", "1991:Q5", "Gas Laws"))

        list.add(q("chem_rev_1991_q17", "The solubility of copper (II) tetraoxosulphate (VI) is 75 g in 100 g of water at 100°C and 25 g in 100 g of water at 30°C. What mass of the salt would crystallize if 50 g of the solution saturated at 100°C is cooled to 30°C?",
            "A. 57.5 g", "B. 42.9 g", "C. 28.6 g", "D. 14.3 g", 3,
            "At 100°C, 175 g of saturated solution contains 75 g of salt and 100 g of water. In 50 g of this solution: salt = (75/175) × 50 = 21.43 g; water = 28.57 g. At 30°C, 28.57 g of water holds (25/100) × 28.57 = 7.14 g of salt. Mass crystallized = 21.43 - 7.14 = 14.29 g ≈ 14.3 g.", "1991:Q17", "Solubility"))

        list.add(q("chem_rev_1991_q22", "What volume of CO₂ at S.T.P. would be obtained by reacting 10 cm³ of 0.1 M solution of anhydrous sodium carbonate with excess hydrochloric acid? [GMV = 22,400 cm³]",
            "A. 2.24 cm³", "B. 22.40 cm³", "C. 224.0 cm³", "D. 22.4 dm³", 1,
            "Reaction: Na₂CO₃ + 2HCl → 2NaCl + H₂O + CO₂. Moles of Na₂CO₃ = 0.010 dm³ × 0.1 mol/dm³ = 0.001 mol. 0.001 mol of Na₂CO₃ produces 0.001 mol of CO₂. Volume = 0.001 × 22,400 cm³ = 22.4 cm³.", "1991:Q22", "Gas Calculations"))

        list.add(q("chem_rev_1992_q03", "How many moles of H⁺ ions are present in 1.0 dm³ of 0.5 M solution of H₂SO₄?",
            "A. 2.0 moles", "B. 1.0 mole", "C. 0.5 mole", "D. 0.25 mole", 1,
            "H₂SO₄ is a strong dibasic acid that ionizes completely: H₂SO₄ → 2H⁺ + SO₄²⁻. 0.5 M H₂SO₄ yields 2 × 0.5 = 1.0 mole of H⁺ ions per dm³.", "1992:Q3", "Acids, Bases and Salts"))

        list.add(q("chem_rev_1992_q21", "How many grams of H₂SO₄ are required to prepare 0.175 dm³ of 6.00 M H₂SO₄? [S=32, O=16, H=1]",
            "A. 206.0 g", "B. 103.0 g", "C. 98.1 g", "D. 102.9 g", 3,
            "Moles needed = Molarity × Volume = 6.00 mol/dm³ × 0.175 dm³ = 1.05 moles. Molar mass of H₂SO₄ = 2 + 32 + 64 = 98 g/mol. Mass = 1.05 × 98 = 102.9 g.", "1992:Q21", "Volumetric Analysis"))

        list.add(q("chem_rev_1993_q03", "How many moles of oxygen molecules (O₂) are produced from the complete thermal decomposition of 2.5 moles of potassium trioxochlorate (V)?",
            "A. 2.50", "B. 3.50", "C. 3.75", "D. 7.50", 2,
            "Reaction: 2KClO₃ → 2KCl + 3O₂. Decomposing 2 moles of KClO₃ yields 3 moles of O₂. Thus, 2.5 moles of KClO₃ yields (3/2) × 2.5 = 3.75 moles of O₂.", "1993:Q3", "Stoichiometry"))

        list.add(q("chem_rev_1994_q04", "8.0 g of methane (CH₄) occupies 11.2 dm³ at S.T.P. What volume would 22.0 g of propane (C₃H₈) occupy under the same conditions? [C=12, H=1]",
            "A. 3.7 dm³", "B. 11.2 dm³", "C. 22.4 dm³", "D. 33.6 dm³", 1,
            "Molar mass of propane = (3 × 12) + (8 × 1) = 44 g/mol. Moles of propane = 22.0 / 44 = 0.5 mol. Since 1 mole of any ideal gas occupies 22.4 dm³ at S.T.P., 0.5 mol occupies 0.5 × 22.4 = 11.2 dm³.", "1994:Q4", "Gas Laws"))

        list.add(q("chem_rev_1994_q22", "20 cm³ of a 2.0 M solution of ethanoic acid was added to excess sodium hydroxide. What is the mass of sodium ethanoate produced? [Na=23, C=12, O=16, H=1]",
            "A. 2.50 g", "B. 2.73 g", "C. 3.28 g", "D. 4.54 g", 2,
            "Reaction: CH₃COOH + NaOH → CH₃COONa + H₂O. Moles of acid = 0.020 dm³ × 2.0 mol/dm³ = 0.04 mol. Molar mass of CH₃COONa = 12 + 3 + 12 + 32 + 23 = 82 g/mol. Mass of salt = 0.04 × 82 = 3.28 g.", "1994:Q22", "Organic Stoichiometry"))

        list.add(q("chem_rev_1995_q24", "How many moles of metallic copper would be deposited by passing 3 Faradays of electricity through a solution of copper (II) tetraoxosulphate (VI)?",
            "A. 0.5", "B. 1.0", "C. 1.5", "D. 3.0", 2,
            "Half-reaction: Cu²⁺ + 2e⁻ → Cu. Depositing 1 mole of copper requires 2 Faradays of charge. Therefore, 3 F will deposit 3 / 2 = 1.5 moles of copper.", "1995:Q24", "Electrolysis"))

        list.add(q("chem_rev_1998_q04", "From the combustion equation C₃H₈(g) + 5O₂(g) → 3CO₂(g) + 4H₂O(g), the volume of oxygen required to burn 50 cm³ of propane completely is",
            "A. 250 cm³", "B. 150 cm³", "C. 100 cm³", "D. 50 cm³", 0,
            "By Gay-Lussac's law of combining volumes, the volume ratio of propane to oxygen is 1 : 5. Burning 50 cm³ of propane requires 5 × 50 = 250 cm³ of oxygen.", "1998:Q4", "Gas Calculations"))

        list.add(q("chem_rev_1999_q01", "200 cm³ each of 0.1 M solution of lead (II) nitrate and hydrochloric acid were mixed. Assuming lead (II) chloride is completely insoluble, calculate the mass of PbCl₂ precipitated. [Pb = 207, Cl = 35.5]",
            "A. 2.78 g", "B. 5.56 g", "C. 8.34 g", "D. 11.12 g", 0,
            "Reaction: Pb(NO₃)₂ + 2HCl → PbCl₂↓ + 2HNO₃. Moles of Pb²⁺ = 0.2 × 0.1 = 0.02 mol. Moles of Cl⁻ = 0.2 × 0.1 = 0.02 mol. Since 1 mol Pb²⁺ requires 2 mol Cl⁻, Cl⁻ is the limiting reactant, producing 0.02 / 2 = 0.01 mol of PbCl₂. Molar mass of PbCl₂ = 207 + 71 = 278 g/mol. Mass = 0.01 × 278 = 2.78 g.", "1999:Q1", "Stoichiometry & Precipitation"))

        list.add(q("chem_rev_2000_q05", "How many moles of HCl are required to react with potassium heptaoxodichromate (VI) to produce 3 moles of chlorine gas?",
            "A. 14", "B. 12", "C. 11", "D. 10", 0,
            "Balanced equation: K₂Cr₂O₇ + 14HCl → 2KCl + 2CrCl₃ + 3Cl₂ + 7H₂O. The stoichiometric ratio directly shows that 14 moles of HCl produce 3 moles of Cl₂.", "2000:Q5", "Redox & Stoichiometry"))

        list.add(q("chem_rev_2001_q02", "What mass of water is produced when 8.0 g of hydrogen gas reacts completely with excess oxygen?",
            "A. 72.0 g", "B. 36.0 g", "C. 16.0 g", "D. 8.0 g", 0,
            "Reaction: 2H₂ + O₂ → 2H₂O. 4 g of H₂ reacts with oxygen to yield 36 g of H₂O. Thus, 8.0 g of H₂ produces (8.0 / 4) × 36 = 72.0 g of water.", "2001:Q2", "Stoichiometry"))

        list.add(q("chem_rev_2001_q12", "An oxide XO₂ has a vapour density of 32. What is the relative atomic mass of element X? [O = 16]",
            "A. 20", "B. 32", "C. 14", "D. 12", 1,
            "Relative molecular mass = 2 × vapour density = 2 × 32 = 64. Formula is XO₂, so X + 2(16) = 64 → X + 32 = 64 → X = 32 (which is Sulfur).", "2001:Q12", "Atomic Structure & Gas Density"))

        list.add(q("chem_rev_2001_q24", "What steady current in amperes will deposit 2.7 g of aluminium in 2 hours? [Al = 27, 1 F = 96,500 C]",
            "A. 32 A", "B. 16 A", "C. 8 A", "D. 4 A", 3,
            "Al³⁺ + 3e⁻ → Al. Moles of Al = 2.7 / 27 = 0.1 mol, requiring 0.1 × 3 = 0.3 Faradays = 0.3 × 96,500 = 28,950 C. Time = 2 × 3600 = 7200 s. Current I = Q / t = 28,950 / 7200 = 4.02 A ≈ 4 A.", "2001:Q24", "Electrolysis"))

        list.add(q("chem_rev_2002_q25", "A gas X diffuses twice as fast as gas Y under the same conditions. If the relative molecular mass of X is 28, calculate the relative molecular mass of Y.",
            "A. 14", "B. 56", "C. 112", "D. 120", 2,
            "By Graham's law of diffusion: Rate_X / Rate_Y = √(MM_Y / MM_X). Given Rate_X / Rate_Y = 2: 2 = √(MM_Y / 28) → 4 = MM_Y / 28 → MM_Y = 4 × 28 = 112.", "2002:Q25", "Gas Laws & Diffusion"))

        list.add(q("chem_rev_2002_q44", "25 cm³ of a 0.2 mol/dm³ solution of Na₂CO₃ requires 20 cm³ of a solution of HCl for complete neutralization. The concentration of the HCl solution is",
            "A. 0.2 mol/dm³", "B. 0.4 mol/dm³", "C. 0.5 mol/dm³", "D. 0.6 mol/dm³", 2,
            "Reaction: Na₂CO₃ + 2HCl → 2NaCl + H₂O + CO₂. Using (CₐVₐ / C_bV_b) = (nₐ / n_b): (Cₐ × 20) / (0.2 × 25) = 2/1 → 20 Cₐ = 2 × 5.0 = 10 → Cₐ = 10 / 20 = 0.5 mol/dm³.", "2002:Q44", "Volumetric Analysis"))

        list.add(q("chem_rev_2003_q03", "What is the percentage by mass of oxygen in hydrated aluminium sulphate Al₂(SO₄)₃·2H₂O? [Al = 27, S = 32, H = 1, O = 16]",
            "A. 14.29%", "B. 25.39%", "C. 50.79%", "D. 59.25%", 3,
            "Molar mass of Al₂(SO₄)₃·2H₂O = (2 × 27) + 3(32 + 64) + 2(18) = 54 + 288 + 36 = 378 g/mol. Total mass of oxygen = 14 atoms × 16 = 224 g. Percentage = (224 / 378) × 100% = 59.25%.", "2003:Q3", "Stoichiometry"))

        list.add(q("chem_rev_2004_q05", "The mass of silver deposited when a steady current of 10 A is passed through a solution of a silver salt for 4830 seconds is [Ag = 108, 1 F = 96,500 C]",
            "A. 54.0 g", "B. 27.0 g", "C. 13.5 g", "D. 108.0 g", 0,
            "Charge Q = 10 A × 4830 s = 48,300 C = 48,300 / 96,500 = 0.5 Faradays. Since Ag⁺ + e⁻ → Ag requires 1 F per mole, 0.5 F deposits 0.5 × 108 = 54.0 g of silver.", "2004:Q5", "Electrolysis"))

        list.add(q("chem_rev_2004_q10", "What volume of gas is evolved at S.T.P. if 2.0 g of calcium trioxocarbonate (IV) is added to excess dilute hydrochloric acid? [Ca = 40, C = 12, O = 16, GMV = 22.4 dm³]",
            "A. 224 cm³", "B. 112 cm³", "C. 448 cm³", "D. 2240 cm³", 2,
            "Reaction: CaCO₃ + 2HCl → CaCl₂ + H₂O + CO₂. Moles of CaCO₃ = 2.0 / 100 = 0.02 mol. Yielded CO₂ = 0.02 mol. Volume at S.T.P. = 0.02 × 22,400 cm³ = 448 cm³.", "2004:Q10", "Gas Calculations"))

        return list
    }

    private fun q(
        id: String,
        text: String,
        a: String,
        b: String,
        c: String,
        d: String,
        correctIdx: Int,
        explanation: String,
        year: String,
        topic: String
    ): QuestionEntity {
        return QuestionEntity(
            id = id,
            subject = "Chemistry",
            questionText = text,
            optionA = a,
            optionB = b,
            optionC = c,
            optionD = d,
            correctAnswerIndex = correctIdx,
            explanation = explanation,
            year = year,
            topic = topic
        )
    }
}
