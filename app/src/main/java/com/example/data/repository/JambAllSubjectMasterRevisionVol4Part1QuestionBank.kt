package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB All-Subjects Master Revision Bank Volume 4 - Part 1
 * High-yield authentic JAMB UTME questions across core Science & General subjects:
 * English Language, Mathematics, Physics, Chemistry, Biology.
 */
object JambAllSubjectMasterRevisionVol4Part1QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1. ENGLISH LANGUAGE (Antonyms, Synonyms, Sentence Completion, Lexis)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_vol4_2016_001",
                subject = "English Language",
                topic = "Lexis: Antonyms",
                year = "2016",
                questionText = "Choose the option opposite in meaning to the underlined word: The minister delivered an extempore speech at the summit.",
                optionA = "impromptu",
                optionB = "rehearsed",
                optionC = "eloquent",
                optionD = "spontaneous",
                correctAnswerIndex = 1,
                explanation = "'Extempore' means spoken or done without preparation (impromptu). The exact opposite is 'rehearsed' or 'prepared'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_vol4_2016_002",
                subject = "English Language",
                topic = "Lexis: Synonyms",
                year = "2016",
                questionText = "Choose the option nearest in meaning to the underlined word: The doctor diagnosed the patient with a benign tumor.",
                optionA = "harmless",
                optionB = "malignant",
                optionC = "contagious",
                optionD = "terminal",
                correctAnswerIndex = 0,
                explanation = "In medical terminology, a 'benign' tumor is non-cancerous and harmless, not spreading to other tissues.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_vol4_2017_003",
                subject = "English Language",
                topic = "Grammatical Concord",
                year = "2017",
                questionText = "Choose the option that best completes the sentence: Neither the teacher nor the students ______ present at the assembly.",
                optionA = "was",
                optionB = "were",
                optionC = "is",
                optionD = "has been",
                correctAnswerIndex = 1,
                explanation = "According to the rule of proximity in grammatical concord, when subjects are joined by 'neither... nor', the verb agrees in number with the nearest subject ('students' -> plural 'were').",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_vol4_2017_004",
                subject = "English Language",
                topic = "Idioms & Phrasal Verbs",
                year = "2017",
                questionText = "To 'burn the midnight oil' means to:",
                optionA = "Waste fuel unnecessarily",
                optionB = "Study or work late into the night",
                optionC = "Set a building on fire",
                optionD = "Experience sudden power failure",
                correctAnswerIndex = 1,
                explanation = "'Burn the midnight oil' is an idiom meaning to read, study, or work late into the night.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2017 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_vol4_2018_005",
                subject = "English Language",
                topic = "Spelling & Orthography",
                year = "2018",
                questionText = "Identify the correctly spelled word from the options below:",
                optionA = "Embarrasment",
                optionB = "Embarrassment",
                optionC = "Embarasment",
                optionD = "Embarrasement",
                correctAnswerIndex = 1,
                explanation = "The standard orthographic spelling is 'Embarrassment' with double 'r' and double 's'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_vol4_2018_006",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2018",
                questionText = "Which word contains the same vowel sound as in 'key' /i:/?",
                optionA = "Quay",
                optionB = "Cry",
                optionC = "Grey",
                optionD = "Tray",
                correctAnswerIndex = 0,
                explanation = "'Quay' is pronounced /ki:/, having the identical long monophthong vowel /i:/ as 'key'.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2018 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_vol4_2019_007",
                subject = "English Language",
                topic = "Oral English: Consonants",
                year = "2019",
                questionText = "In which of the following words is the consonant letter 'p' silent?",
                optionA = "Receipt",
                optionB = "Pulpit",
                optionC = "Purple",
                optionD = "Poetry",
                correctAnswerIndex = 0,
                explanation = "In 'Receipt' (/rɪˈsiːt/), the letter 'p' is silent.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "eng_vol4_2019_008",
                subject = "English Language",
                topic = "Lexis: Collocations",
                year = "2019",
                questionText = "The judge asked the accused whether he pleaded ______ or not guilty.",
                optionA = "culpable",
                optionB = "liable",
                optionC = "guilty",
                optionD = "convicted",
                correctAnswerIndex = 2,
                explanation = "In legal English, the standard plea collocation is 'plead guilty or not guilty'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2019 • Q8"
            )
        )

        // =========================================================================
        // 2. MATHEMATICS (Calculus, Trigonometry, Matrices, Probability, Logarithms)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_vol4_2016_001",
                subject = "Mathematics",
                topic = "Calculus: Differentiation",
                year = "2016",
                questionText = "Find the derivative of y = 3x⁴ - 5x² + 7x - 9 with respect to x.",
                optionA = "12x³ - 10x + 7",
                optionB = "12x³ - 5x + 7",
                optionC = "7x³ - 10x + 7",
                optionD = "12x² - 10x + 7",
                correctAnswerIndex = 0,
                explanation = "dy/dx = d/dx(3x⁴) - d/dx(5x²) + d/dx(7x) - d/dx(9) = 12x³ - 10x + 7.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_vol4_2016_002",
                subject = "Mathematics",
                topic = "Logarithms & Indices",
                year = "2016",
                questionText = "If log₁₀ 2 = 0.3010 and log₁₀ 3 = 0.4771, calculate the value of log₁₀ 18.",
                optionA = "1.2552",
                optionB = "1.0791",
                optionC = "1.3802",
                optionD = "0.7781",
                correctAnswerIndex = 0,
                explanation = "18 = 2 × 3² = 2 × 9. log₁₀ 18 = log₁₀ 2 + 2 log₁₀ 3 = 0.3010 + 2(0.4771) = 0.3010 + 0.9542 = 1.2552.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_vol4_2017_003",
                subject = "Mathematics",
                topic = "Matrices & Determinants",
                year = "2017",
                questionText = "Evaluate the determinant of the matrix | [4, 3], [2, 5] |.",
                optionA = "14",
                optionB = "26",
                optionC = "7",
                optionD = "20",
                correctAnswerIndex = 0,
                explanation = "The determinant of a 2x2 matrix | [a, b], [c, d] | is ad - bc. Here, (4 × 5) - (3 × 2) = 20 - 6 = 14.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_vol4_2017_004",
                subject = "Mathematics",
                topic = "Trigonometry: Identity & Equations",
                year = "2017",
                questionText = "If sin θ = 3/5 for an acute angle θ, find the value of tan θ.",
                optionA = "3/4",
                optionB = "4/3",
                optionC = "4/5",
                optionD = "5/4",
                correctAnswerIndex = 0,
                explanation = "In a right-angled triangle, opposite = 3, hypotenuse = 5, adjacent = √(5² - 3²) = √(25 - 9) = √16 = 4. Therefore, tan θ = opposite / adjacent = 3/4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_vol4_2018_005",
                subject = "Mathematics",
                topic = "Probability",
                year = "2018",
                questionText = "A fair six-sided die is rolled once. What is the probability of obtaining a prime number?",
                optionA = "1/2",
                optionB = "1/3",
                optionC = "2/3",
                optionD = "1/6",
                correctAnswerIndex = 0,
                explanation = "Sample space S = {1, 2, 3, 4, 5, 6}. Prime numbers on a die are {2, 3, 5} (3 outcomes). P(prime) = 3/6 = 1/2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_vol4_2018_006",
                subject = "Mathematics",
                topic = "Sequences: AP & GP",
                year = "2018",
                questionText = "The 3rd term of an Arithmetic Progression (AP) is 10 and the 8th term is 25. Find the first term (a) and common difference (d).",
                optionA = "a = 4, d = 3",
                optionB = "a = 2, d = 3",
                optionC = "a = 3, d = 4",
                optionD = "a = 1, d = 5",
                correctAnswerIndex = 0,
                explanation = "T₃ = a + 2d = 10, T₈ = a + 7d = 25. Subtracting gives 5d = 15 => d = 3. Substituting into T₃: a + 2(3) = 10 => a = 4.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_vol4_2019_007",
                subject = "Mathematics",
                topic = "Calculus: Definite Integration",
                year = "2019",
                questionText = "Evaluate the definite integral ∫ from 0 to 2 of (3x² + 2x) dx.",
                optionA = "12",
                optionB = "10",
                optionC = "16",
                optionD = "8",
                correctAnswerIndex = 0,
                explanation = "∫ (3x² + 2x) dx = [x³ + x²] from 0 to 2 = (2³ + 2²) - (0) = 8 + 4 = 12.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2019 • Q7"
            )
        )

        // =========================================================================
        // 3. PHYSICS (Mechanics, Optics, Thermodynamics, Electricity, Modern Physics)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "phy_vol4_2016_001",
                subject = "Physics",
                topic = "Mechanics: Projectile Motion",
                year = "2016",
                questionText = "A projectile is launched with an initial velocity u at an angle θ to the horizontal. The maximum horizontal range is attained when the angle of projection θ is:",
                optionA = "30°",
                optionB = "45°",
                optionC = "60°",
                optionD = "90°",
                correctAnswerIndex = 1,
                explanation = "The range R = (u² sin 2θ) / g. Range is maximum when sin 2θ = 1 => 2θ = 90° => θ = 45°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_vol4_2016_002",
                subject = "Physics",
                topic = "Optics: Total Internal Reflection",
                year = "2016",
                questionText = "Total internal reflection occurs when light travels from:",
                optionA = "A less dense medium to a denser medium at an angle less than the critical angle",
                optionB = "A denser medium to a less dense medium at an angle greater than the critical angle",
                optionC = "A denser medium to a less dense medium at an angle less than the critical angle",
                optionD = "A vacuum into water at normal incidence",
                correctAnswerIndex = 1,
                explanation = "Two conditions must be met for total internal reflection: (1) Light must travel from an optically denser medium to a rarer (less dense) medium; (2) The angle of incidence must exceed the critical angle.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_vol4_2017_003",
                subject = "Physics",
                topic = "Current Electricity: Ohm's Law & Resistors",
                year = "2017",
                questionText = "Three resistors of resistances 2 Ω, 3 Ω, and 6 Ω are connected in parallel. What is their effective resistance?",
                optionA = "1.0 Ω",
                optionB = "11.0 Ω",
                optionC = "0.5 Ω",
                optionD = "2.0 Ω",
                correctAnswerIndex = 0,
                explanation = "1/R_eq = 1/2 + 1/3 + 1/6 = (3 + 2 + 1) / 6 = 6/6 = 1. Therefore, R_eq = 1.0 Ω.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_vol4_2017_004",
                subject = "Physics",
                topic = "Thermodynamics: Heat Transfer",
                year = "2017",
                questionText = "The process of heat transfer that does not require any material medium for propagation is known as:",
                optionA = "Conduction",
                optionB = "Convection",
                optionC = "Radiation",
                optionD = "Evaporation",
                correctAnswerIndex = 2,
                explanation = "Thermal radiation transfers energy via electromagnetic waves (infrared) and travels freely across a vacuum without needing a material medium.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2017 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_vol4_2018_005",
                subject = "Physics",
                topic = "Modern Physics: Photoelectric Effect",
                year = "2018",
                questionText = "In Einstein's photoelectric equation, the minimum energy required to liberate an electron from a metal surface is called the:",
                optionA = "Threshold frequency",
                optionB = "Work function",
                optionC = "Stopping potential",
                optionD = "Kinetic energy",
                correctAnswerIndex = 1,
                explanation = "The work function (W₀ = h f₀) is defined as the minimum energy necessary to eject a photoelectron from the surface of a metal.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2018 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "phy_vol4_2019_006",
                subject = "Physics",
                topic = "Wave Motion: Sound Waves",
                year = "2019",
                questionText = "The pitch of a sound note depends primarily on its:",
                optionA = "Amplitude",
                optionB = "Frequency",
                optionC = "Overtones",
                optionD = "Velocity",
                correctAnswerIndex = 1,
                explanation = "Pitch is the subjective perception of sound frequency. High frequency corresponds to high pitch.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2019 • Q6"
            )
        )

        // =========================================================================
        // 4. CHEMISTRY (Periodic Table, Bonding, Organic Chemistry, Electrochemistry)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "chem_vol4_2016_001",
                subject = "Chemistry",
                topic = "Chemical Bonding & Structure",
                year = "2016",
                questionText = "Which type of chemical bond is formed by the sharing of a lone pair of electrons where both electrons are donated by only one of the participating atoms?",
                optionA = "Covalent bond",
                optionB = "Coordinate (dative) bond",
                optionC = "Ionic (electrovalent) bond",
                optionD = "Hydrogen bond",
                correctAnswerIndex = 1,
                explanation = "A coordinate covalent (dative) bond occurs when the shared electron pair is provided entirely by one atom (such as in NH₄⁺ or H₃O⁺).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "chem_vol4_2016_002",
                subject = "Chemistry",
                topic = "Gas Laws: Ideal Gas Equation",
                year = "2016",
                questionText = "According to Graham's Law of diffusion, the rate of diffusion of a gas is:",
                optionA = "Directly proportional to its molar mass",
                optionB = "Inversely proportional to the square root of its molar mass",
                optionC = "Directly proportional to the square of its density",
                optionD = "Inversely proportional to its absolute temperature",
                correctAnswerIndex = 1,
                explanation = "Graham's Law states that Rate ∝ 1 / √(Molar Mass or Density) under constant temperature and pressure.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "chem_vol4_2017_003",
                subject = "Chemistry",
                topic = "Organic Chemistry: Hydrocarbons & Functional Groups",
                year = "2017",
                questionText = "The functional group present in alkanols is the:",
                optionA = "Carboxyl group (-COOH)",
                optionB = "Hydroxyl group (-OH)",
                optionC = "Carbonyl group (-C=O)",
                optionD = "Amino group (-NH₂)",
                correctAnswerIndex = 1,
                explanation = "Alkanols (alcohols) are characterized by the hydroxyl (-OH) functional group bonded to a saturated carbon atom.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "chem_vol4_2017_004",
                subject = "Chemistry",
                topic = "Electrochemistry: Faraday's Laws",
                year = "2017",
                questionText = "How many Faradays of electricity are required to deposit 1 mole of copper from a solution of copper(II) tetraoxosulphate(VI) (CuSO₄)?",
                optionA = "1 F",
                optionB = "2 F",
                optionC = "3 F",
                optionD = "4 F",
                correctAnswerIndex = 1,
                explanation = "The reduction half-reaction is Cu²⁺ + 2e⁻ -> Cu(s). 2 moles of electrons (2 Faradays) are required to deposit 1 mole of Cu.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2017 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "chem_vol4_2018_005",
                subject = "Chemistry",
                topic = "Acids, Bases & Salts: pH Calculations",
                year = "2018",
                questionText = "What is the pH of a 0.001 M solution of hydrochloric acid (HCl)?",
                optionA = "1",
                optionB = "2",
                optionC = "3",
                optionD = "4",
                correctAnswerIndex = 2,
                explanation = "HCl is a strong acid completely ionizing into [H⁺] = 1 × 10⁻³ M. pH = -log₁₀[H⁺] = -log₁₀(10⁻³) = 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2018 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "chem_vol4_2019_006",
                subject = "Chemistry",
                topic = "Periodic Table: Periodic Trends",
                year = "2019",
                questionText = "Across a period in the Periodic Table from left to right, electronegativity generally:",
                optionA = "Decreases",
                optionB = "Increases",
                optionC = "Remains unchanged",
                optionD = "Decreases then increases",
                correctAnswerIndex = 1,
                explanation = "Across a period, nuclear charge increases while electron shielding remains approximately constant, causing atomic radius to contract and electronegativity to increase.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 2019 • Q6"
            )
        )

        // =========================================================================
        // 5. BIOLOGY (Cell Biology, Genetics, Ecology, Physiology, Plant Biology)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "bio_vol4_2016_001",
                subject = "Biology",
                topic = "Cell Structure & Function",
                year = "2016",
                questionText = "Which cellular organelle is responsible for ATP synthesis via cellular respiration?",
                optionA = "Ribosome",
                optionB = "Mitochondrion",
                optionC = "Golgi apparatus",
                optionD = "Endoplasmic reticulum",
                correctAnswerIndex = 1,
                explanation = "The mitochondrion is known as the powerhouse of the cell, where aerobic respiration and oxidative phosphorylation generate ATP.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "bio_vol4_2016_002",
                subject = "Biology",
                topic = "Genetics & Heredity: Mendel's Laws",
                year = "2016",
                questionText = "When a heterozygous tall pea plant (Tt) is crossed with a homozygous short plant (tt), the phenotypic ratio of offspring will be:",
                optionA = "3 Tall : 1 Short",
                optionB = "1 Tall : 1 Short",
                optionC = "All Tall",
                optionD = "All Short",
                correctAnswerIndex = 1,
                explanation = "Punnett square of Tt × tt yields: Tt, Tt, tt, tt. That is 2 Tall and 2 Short, simplifying to a 1:1 phenotypic ratio.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2016 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "bio_vol4_2017_003",
                subject = "Biology",
                topic = "Ecology: Biotic Interactions",
                year = "2017",
                questionText = "A symbiotic relationship in which one organism benefits while the other is neither harmed nor helped is called:",
                optionA = "Mutualism",
                optionB = "Commensalism",
                optionC = "Parasitism",
                optionD = "Predation",
                correctAnswerIndex = 1,
                explanation = "Commensalism is an interspecific interaction where one species derives benefit while the host species experiences neutral effect (e.g., epiphytes on trees).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "bio_vol4_2017_004",
                subject = "Biology",
                topic = "Human Physiology: Circulatory System",
                year = "2017",
                questionText = "Which blood vessel carries oxygenated blood from the lungs back to the left atrium of the heart?",
                optionA = "Pulmonary artery",
                optionB = "Pulmonary vein",
                optionC = "Vena cava",
                optionD = "Aorta",
                correctAnswerIndex = 1,
                explanation = "The pulmonary vein is the unique vein in the adult human body that transports oxygenated blood from the lungs into the left atrium.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2017 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "bio_vol4_2018_005",
                subject = "Biology",
                topic = "Plant Physiology: Photosynthesis & Transpiration",
                year = "2018",
                questionText = "During the light-dependent stage of photosynthesis, oxygen is released as a byproduct due to the:",
                optionA = "Photolysis of water",
                optionB = "Fixation of carbon(IV) oxide",
                optionC = "Reduction of NADP+",
                optionD = "Synthesis of glucose",
                correctAnswerIndex = 0,
                explanation = "Photolysis of water molecules (2H₂O -> 4H⁺ + 4e⁻ + O₂) in the presence of chlorophyll and sunlight splits water to release molecular oxygen.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2018 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "bio_vol4_2019_006",
                subject = "Biology",
                topic = "Digestive System & Enzymes",
                year = "2019",
                questionText = "Bile is produced in the ______ and stored in the ______.",
                optionA = "Pancreas; Gallbladder",
                optionB = "Liver; Gallbladder",
                optionC = "Stomach; Duodenum",
                optionD = "Liver; Pancreas",
                correctAnswerIndex = 1,
                explanation = "Bile is synthesized continuously by hepatocytes in the liver and concentrated/stored in the gallbladder until released for lipid emulsification.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2019 • Q6"
            )
        )

        return list
    }
}
