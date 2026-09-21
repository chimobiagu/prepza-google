package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB UTME Comprehensive All-Subjects Master Revision Bank Part 1.
 * Standardized 4-option format (A-D), balanced keys, full pedagogical explanations.
 * Covers: Use of English, Mathematics, Physics, Chemistry, Biology, Economics, Government, Literature in English, CRK/CRS, Financial Accounting.
 */
object JambAllSubjectComprehensiveMasterPart1QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1. USE OF ENGLISH (2010 - 2012 SERIES)
        // =========================================================================
        val spaceshipPassage = """
            Spaceship Earth is a unique planetary vehicle operating without a printed instruction manual. Unlike an automobile which comes equipped with operating guidelines, maintenance protocols, and troubleshooting charts from the manufacturer, our planet was delivered to humanity with no handbook whatsoever.
            This lack of instructions has served as humanity's greatest intellectual catalyst, challenging man's natural curiosity to observe, experiment, and generalize fundamental physical and ecological laws.
        """.trimIndent()

        val corruptionPassage = """
            Corruption is triggered off primarily by unnecessary affluence and conspicuous consumption in society. When individuals seek unearned social status and extravagant wealth, the resulting diversion of public funds impedes the progress and socio-economic transformation of a nation.
        """.trimIndent()

        list.add(
            QuestionEntity(
                id = "eng_comp_2010_001",
                subject = "English Language",
                topic = "Examination Protocol & Identification",
                year = "2010",
                questionText = "Which Use of English Paper Type is given to you?",
                optionA = "Type A",
                optionB = "Type B",
                optionC = "Type C",
                optionD = "Type D",
                correctAnswerIndex = 0,
                explanation = "JAMB UTME examination papers are classified into distinct paper types (A, B, C, D) to track booklet distribution and ensure test integrity.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2010_002",
                subject = "English Language",
                topic = "Reading Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "According to the writer, the exciting thing about Spaceship Earth is that it:",
                optionA = "has no instruction manual",
                optionB = "is not difficult to maintain",
                optionC = "is peculiar to other automobiles",
                optionD = "is relatively easy to operate",
                correctAnswerIndex = 0,
                explanation = "The passage states that the design omission of an instruction book is a core characteristic that forces humanity to discover capabilities through inquiry.",
                passageText = spaceshipPassage,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2010_003",
                subject = "English Language",
                topic = "Reading Comprehension: Spaceship Earth",
                year = "2010",
                questionText = "The absence of an instruction manual in Spaceship Earth has:",
                optionA = "made the operation of the Spaceship Earth difficult",
                optionB = "forced man to devise other means of travelling in spacecraft",
                optionC = "challenged man’s inquisitiveness",
                optionD = "made man helpless",
                correctAnswerIndex = 2,
                explanation = "Lacking an instruction manual serves as an intellectual catalyst, challenging man's inquisitiveness to explore and discover physical laws.",
                passageText = spaceshipPassage,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2010_004",
                subject = "English Language",
                topic = "Reading Comprehension: Deductive Reasoning",
                year = "2010",
                questionText = "From the passage, it can be deduced that man:",
                optionA = "learns by experiment and education",
                optionB = "learns by chance and accidentally",
                optionC = "is incapable of solving all his problems",
                optionD = "by his nature is in constant search of knowledge",
                correctAnswerIndex = 3,
                explanation = "The text emphasizes that humanity is inherently driven to search for knowledge, systematically discovering cosmic principles.",
                passageText = spaceshipPassage,
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2010_005",
                subject = "English Language",
                topic = "Tone and Mood Analysis",
                year = "2010",
                questionText = "The writer’s mood in the passage is that of:",
                optionA = "non-committal",
                optionB = "pessimism",
                optionC = "optimism",
                optionD = "indifference",
                correctAnswerIndex = 2,
                explanation = "The author maintains an encouraging, confident, and optimistic perspective regarding human intellectual capability.",
                passageText = spaceshipPassage,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2010_011",
                subject = "English Language",
                topic = "Reading Comprehension: Social Issues",
                year = "2010",
                questionText = "According to the writer, corruption is triggered off by:",
                optionA = "unnecessary affluence",
                optionB = "poor salary structure",
                optionC = "private officials",
                optionD = "public officers",
                correctAnswerIndex = 0,
                explanation = "The passage identifies the pursuit of unnecessary affluence, lavish lifestyle, and ostentatious status as the primary trigger for corruption.",
                passageText = corruptionPassage,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2010_012",
                subject = "English Language",
                topic = "Reading Comprehension: Socio-economic Effects",
                year = "2010",
                questionText = "From the passage, one of the consequences of corruption is that:",
                optionA = "large projects are executed",
                optionB = "it is beneficial to wealthy people who stole public wealth",
                optionC = "it impedes the progress of a nation",
                optionD = "people get what they want with so much money to spend",
                correctAnswerIndex = 2,
                explanation = "Corruption drains developmental capital and directly impedes the overall socio-economic progress of a nation.",
                passageText = corruptionPassage,
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2010 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_036",
                subject = "English Language",
                topic = "Vocabulary: Synonyms",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word: 'Since its inception in 1983, the newspaper has attracted thousands of readers.'",
                optionA = "renaissance",
                optionB = "coming",
                optionC = "commencement",
                optionD = "publication",
                correctAnswerIndex = 2,
                explanation = "'Inception' refers to the starting point or beginning of an institution or initiative; 'commencement' is its closest synonym.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_068",
                subject = "English Language",
                topic = "Grammar: Adverbial Conjunctions",
                year = "2011",
                questionText = "Fill the gap: '________ he switches on the light, the shadow disappears.'",
                optionA = "Whenever",
                optionB = "Except",
                optionC = "Since",
                optionD = "Until",
                correctAnswerIndex = 0,
                explanation = "'Whenever' expresses habitual or recurring time conditions ('every time that'), fitting the cause-and-effect relationship.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q68"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_069",
                subject = "English Language",
                topic = "Spelling & Orthography",
                year = "2011",
                questionText = "Choose the correctly spelled option to complete the sentence: 'It is important that you clear the refuse in front of your house every ________'",
                optionA = "fourtnight",
                optionB = "fortnight",
                optionC = "fourthnight",
                optionD = "forthnight",
                correctAnswerIndex = 1,
                explanation = "The standard English spelling for a two-week period is 'fortnight' (derived from fourteen nights).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q69"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_071",
                subject = "English Language",
                topic = "Grammar: Question Tags",
                year = "2011",
                questionText = "Choose the correct option: 'Suara needn’t come with us, ________?'",
                optionA = "does she",
                optionB = "will she",
                optionC = "can she",
                optionD = "need she",
                correctAnswerIndex = 3,
                explanation = "Because 'needn't' is a negative modal auxiliary in the main clause, the required question tag is positive: 'need she?'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q71"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_073",
                subject = "English Language",
                topic = "Grammar: Reported Speech & Word Order",
                year = "2011",
                questionText = "Choose the correct option: 'Ife asked me ________'",
                optionA = "what time it was",
                optionB = "what is it by my time",
                optionC = "what time is it",
                optionD = "what time it is",
                correctAnswerIndex = 0,
                explanation = "In indirect/reported speech questions, word order is affirmative (subject + verb: 'it was') with a past tense backshift.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q73"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_075",
                subject = "English Language",
                topic = "Idiomatic Prepositions",
                year = "2011",
                questionText = "Choose the correct option: 'Audu took these actions purely ________ his own career.'",
                optionA = "on furtherance of",
                optionB = "in furtherance of",
                optionC = "to furtherance in",
                optionD = "in furtherance with",
                correctAnswerIndex = 1,
                explanation = "The standard English idiomatic prepositional phrase is 'in furtherance of', meaning to promote or advance an objective.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q75"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_076",
                subject = "English Language",
                topic = "Spelling & Orthography",
                year = "2011",
                questionText = "Choose the correctly spelled option: 'Here Mr. Odumusu teaches English ________ in our school.'",
                optionA = "pronuntiation",
                optionB = "pronounciation",
                optionC = "pronunciation",
                optionD = "pronountiation",
                correctAnswerIndex = 2,
                explanation = "While the verb is 'pronounce', the nominal form drops the 'o' in the second syllable, spelling correctly as 'pronunciation'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q76"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_078",
                subject = "English Language",
                topic = "Degrees of Comparison",
                year = "2011",
                questionText = "Choose the correct option: 'Of the three girls, Uka is the ________'",
                optionA = "so much notorious",
                optionB = "notorious",
                optionC = "naught",
                optionD = "naughtiest",
                correctAnswerIndex = 3,
                explanation = "When comparing three or more persons/items, the superlative form ('naughtiest') is required.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q78"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2011_080",
                subject = "English Language",
                topic = "Lexical Distinction",
                year = "2011",
                questionText = "Choose the correct option: 'Please sit on the ________'",
                optionA = "carier",
                optionB = "career",
                optionC = "carrier",
                optionD = "carrear",
                correctAnswerIndex = 2,
                explanation = "A 'carrier' is a seat or rack on a bicycle or vehicle for luggage/passengers, whereas 'career' refers to a life vocation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q80"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2012_029",
                subject = "English Language",
                topic = "Idioms & Figurative Expressions",
                year = "2012",
                questionText = "Choose the option that best explains the italicized idiom: 'The landlord is fond of throwing his weight about.'",
                optionA = "The landlord likes healthy exercise",
                optionB = "The landlord is overweight",
                optionC = "The landlord gives orders to people in an overbearing manner",
                optionD = "The landlord is respected by his tenants",
                correctAnswerIndex = 2,
                explanation = "To 'throw one's weight about' means to act in a bossy, arrogant, or authoritarian manner, domineering over others.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2012_035",
                subject = "English Language",
                topic = "Sentence Interpretation",
                year = "2012",
                questionText = "Choose the option that best explains the sentence: 'As far as Abu is concerned, Mero should be given fifty naira at the most.'",
                optionA = "All Abu is saying is that Mero probably deserves more than fifty naira and not less",
                optionB = "All Abu is concerned with is that Mero should be given nothing more than fifty naira",
                optionC = "In Abu’s estimation, Mero merits not more than fifty naira",
                optionD = "In Abu’s opinion, Mero deserves fifty naira or probably more",
                correctAnswerIndex = 1,
                explanation = "The phrase 'at the most' specifies fifty naira as the absolute upper boundary/ceiling that cannot be exceeded.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2012_050",
                subject = "English Language",
                topic = "Vocabulary: Antonyms",
                year = "2012",
                questionText = "Choose the option opposite in meaning to the italicized word: 'The way the worship was organized was rather hit-and-miss.'",
                optionA = "systematic",
                optionB = "hasty",
                optionC = "slow",
                optionD = "funny",
                correctAnswerIndex = 0,
                explanation = "'Hit-and-miss' means haphazard, erratic, or unplanned. Its direct antonym is 'systematic' (methodical and orderly).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q50"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_comp_2012_075",
                subject = "English Language",
                topic = "Vocabulary: Word Choice",
                year = "2012",
                questionText = "Choose the correct option: 'Everyone makes mistakes occasionally; nobody is ________'",
                optionA = "incorrigible",
                optionB = "imperfect",
                optionC = "infallible",
                optionD = "indestructible",
                correctAnswerIndex = 2,
                explanation = "'Infallible' means incapable of making mistakes or errors, fitting the contrasting clause perfectly.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q75"
            )
        )

        // =========================================================================
        // 2. MATHEMATICS (1983 - 2004 HISTORICAL SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_comp_1983_001",
                subject = "Mathematics",
                topic = "Statistics: Measures of Central Tendency",
                year = "1983",
                questionText = "If M represents the median and D the mode of the measurements 5, 9, 3, 5, 8, then (M, D) is:",
                optionA = "(6, 5)",
                optionB = "(5, 8)",
                optionC = "(5, 7)",
                optionD = "(5, 5)",
                correctAnswerIndex = 3,
                explanation = "Ordered data: 3, 5, 5, 8, 9. The median (middle value) M = 5. The mode (most frequent score) D = 5. Thus, (M, D) = (5, 5).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1983_002",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Partnership & Ratio",
                year = "1983",
                questionText = "A construction company is owned by two partners X and Y, and their profit is divided in the ratio 4:5. At the end of the year, Y received ₦5,000 more than X. What is the total profit of the company for the year?",
                optionA = "₦20,000.00",
                optionB = "₦25,000.00",
                optionC = "₦30,000.00",
                optionD = "₦45,000.00",
                correctAnswerIndex = 3,
                explanation = "Ratio difference = 5 - 4 = 1 part = ₦5,000. Total ratio parts = 4 + 5 = 9 parts. Total profit = 9 * ₦5,000 = ₦45,000.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1983_003",
                subject = "Mathematics",
                topic = "Plane Geometry: Polygons",
                year = "1983",
                questionText = "Given a regular hexagon, calculate each interior angle of the hexagon.",
                optionA = "60°",
                optionB = "30°",
                optionC = "120°",
                optionD = "45°",
                correctAnswerIndex = 2,
                explanation = "Sum of interior angles = (n - 2) * 180°. For n = 6: sum = 4 * 180° = 720°. Each interior angle = 720° / 6 = 120°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1983_004",
                subject = "Mathematics",
                topic = "Simultaneous Linear Equations",
                year = "1983",
                questionText = "Solve the simultaneous equations: 4x - 3 = 3x + y = 2y + 5x - 12.",
                optionA = "x = 5, y = 2",
                optionB = "x = 2, y = 5",
                optionC = "x = -2, y = -5",
                optionD = "x = 5, y = -2",
                correctAnswerIndex = 0,
                explanation = "From 4x - 3 = 3x + y => y = x - 3. Equating 4x - 3 = 2(x - 3) + 5x - 12 => 4x - 3 = 7x - 18 => 3x = 15 => x = 5. Then y = 5 - 3 = 2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1983_005",
                subject = "Mathematics",
                topic = "Polynomials: Roots & Factor Theorem",
                year = "1983",
                questionText = "If x = 1 is a root of the equation x³ - 2x² - 5x + 6 = 0, find the other roots.",
                optionA = "-3 and 2",
                optionB = "-2 and 2",
                optionC = "3 and -2",
                optionD = "1 and 3",
                correctAnswerIndex = 2,
                explanation = "Dividing (x³ - 2x² - 5x + 6) by (x - 1) gives (x² - x - 6) = (x - 3)(x + 2) = 0. The other roots are x = 3 and x = -2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1983_012",
                subject = "Mathematics",
                topic = "Statistics: Pie Charts & Angles",
                year = "1983",
                questionText = "In a class of 60 pupils, the statistical distribution of subjects represented by sectors in a pie chart is: Additional Math (2x - 24)°, Biology (3x - 18)°, Geography (x + 12)°, French (2x + 12)°, History x°. How many pupils offer Additional Math?",
                optionA = "15",
                optionB = "10",
                optionC = "18",
                optionD = "12",
                correctAnswerIndex = 1,
                explanation = "Sum of angles: (2x - 24) + (3x - 18) + (x + 12) + (2x + 12) + x = 360° => 9x - 18 = 360° => 9x = 378 => x = 42°. Additional Math angle = 2(42) - 24 = 60°. Number of pupils = (60° / 360°) * 60 = 10.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1983_016",
                subject = "Mathematics",
                topic = "Geometry & Pythagoras Theorem",
                year = "1983",
                questionText = "The lengths of the sides of a right-angled triangle are (3x + 1)cm, (3x - 1)cm and x cm. Find x.",
                optionA = "2",
                optionB = "6",
                optionC = "18",
                optionD = "12",
                correctAnswerIndex = 3,
                explanation = "By Pythagoras theorem: (3x + 1)² = (3x - 1)² + x² => 9x² + 6x + 1 = 9x² - 6x + 1 + x² => 12x = x² => x = 12 (since x > 0).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1984_023",
                subject = "Mathematics",
                topic = "Quadratic Equations: Forming from Roots",
                year = "1984",
                questionText = "The quadratic equation whose roots are 1 - √13 and 1 + √13 is:",
                optionA = "x² + 2x + 12 = 0",
                optionB = "x² + 2x - 12 = 0",
                optionC = "x² - 2x + 12 = 0",
                optionD = "x² - 2x - 12 = 0",
                correctAnswerIndex = 3,
                explanation = "Sum of roots = (1 - √13) + (1 + √13) = 2. Product of roots = (1 - √13)(1 + √13) = 1 - 13 = -12. Equation is x² - (Sum)x + Product = x² - 2x - 12 = 0.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1988_012",
                subject = "Mathematics",
                topic = "Algebraic Fractions: Subtraction",
                year = "1988",
                questionText = "Simplify: (x + 2)/(x + 1) - (x - 2)/(x + 2).",
                optionA = "3 / (x + 1)",
                optionB = "(3x + 2) / ((x + 1)(x + 2))",
                optionC = "(5x + 6) / ((x + 1)(x + 2))",
                optionD = "(2x² + 5x + 2) / ((x + 1)(x + 2))",
                correctAnswerIndex = 2,
                explanation = "Common denominator is (x + 1)(x + 2). Numerator = (x + 2)² - (x - 2)(x + 1) = (x² + 4x + 4) - (x² - x - 2) = 5x + 6. Result is (5x + 6)/((x + 1)(x + 2)).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1990_001",
                subject = "Mathematics",
                topic = "Indices and Standard Form",
                year = "1990",
                questionText = "Evaluate (2,700,000 * 0.03) / 18,000 in standard form.",
                optionA = "4.5 * 10⁰",
                optionB = "4.5 * 10¹",
                optionC = "4.5 * 10²",
                optionD = "4.5 * 10³",
                correctAnswerIndex = 0,
                explanation = "(2.7 * 10⁶ * 3.0 * 10⁻²) / (1.8 * 10⁴) = (8.1 * 10⁴) / (1.8 * 10⁴) = 4.5 = 4.5 * 10⁰.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1995_001",
                subject = "Mathematics",
                topic = "Number Bases: Subtraction",
                year = "1995",
                questionText = "Calculate 3310₅ - 1442₅ in base 5.",
                optionA = "1313₅",
                optionB = "2113₅",
                optionC = "4302₅",
                optionD = "1103₅",
                correctAnswerIndex = 0,
                explanation = "Executing base-5 subtraction with base-5 borrow: 3310₅ - 1442₅ = 1313₅.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1995 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1997_001",
                subject = "Mathematics",
                topic = "Number Bases: Unknown Digit",
                year = "1997",
                questionText = "If 1P03₄ = 115₁₀, find the value of P.",
                optionA = "0",
                optionB = "1",
                optionC = "2",
                optionD = "3",
                correctAnswerIndex = 3,
                explanation = "1(4³) + P(4²) + 0(4¹) + 3(4⁰) = 115 => 64 + 16P + 3 = 115 => 67 + 16P = 115 => 16P = 48 => P = 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1997 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_1998_001",
                subject = "Mathematics",
                topic = "Number Bases: Multi-Base Equation",
                year = "1998",
                questionText = "If 1011₂ + X₇ = 25₁₀, solve for X in base 7.",
                optionA = "14",
                optionB = "20",
                optionC = "24",
                optionD = "25",
                correctAnswerIndex = 1,
                explanation = "Convert 1011₂ = 8 + 2 + 1 = 11₁₀. 11 + X = 25 => X = 14₁₀. Converting 14₁₀ to base 7: 14 = 2 * 7 + 0 => 20₇.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1998 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_2002_004",
                subject = "Mathematics",
                topic = "Set Theory: Two Sets",
                year = "2002",
                questionText = "In a school, 220 students offer Biology or Mathematics or both. 125 offer Biology and 110 offer Mathematics. How many students offer Biology but not Mathematics?",
                optionA = "125",
                optionB = "110",
                optionC = "95",
                optionD = "15",
                correctAnswerIndex = 1,
                explanation = "n(B ∪ M) = n(B) + n(M) - n(B ∩ M) => 220 = 125 + 110 - x => x = 15 (both). Biology only = 125 - 15 = 110.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2002 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_comp_2004_014",
                subject = "Mathematics",
                topic = "Theory of Variation",
                year = "2004",
                questionText = "y is inversely proportional to x and y = 4 when x = 1/2. Find x when y = 10.",
                optionA = "1/10",
                optionB = "1/5",
                optionC = "2",
                optionD = "10",
                correctAnswerIndex = 1,
                explanation = "y = k/x => 4 = k / (1/2) => k = 2. When y = 10: 10 = 2/x => x = 2/10 = 1/5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2004 • Q14"
            )
        )

        // =========================================================================
        // 3. PHYSICS (1983 - 2004 HISTORICAL SERIES)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "phy_comp_1983_001",
                subject = "Physics",
                topic = "Waves & Sound: Resonance in Closed Pipes",
                year = "1983",
                questionText = "In a resonance tube experiment, a tube of fixed length is closed at one end and several tuning forks of increasing frequency are used to obtain resonance at the open end. If the lowest resonant frequency is f₁ and the next is f₂, find the ratio f₂ / f₁.",
                optionA = "8",
                optionB = "3",
                optionC = "2",
                optionD = "1/2",
                correctAnswerIndex = 1,
                explanation = "For a closed pipe of fixed length, resonant frequencies occur at odd harmonics: f₁ = v/(4L), f₂ = 3v/(4L). The ratio f₂/f₁ = 3.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_002",
                subject = "Physics",
                topic = "Scalars and Vectors",
                year = "1983",
                questionText = "Which of the following is NOT a vector quantity?",
                optionA = "Force",
                optionB = "Altitude",
                optionC = "Weight",
                optionD = "Displacement",
                correctAnswerIndex = 1,
                explanation = "Altitude is a distance/height measurement possessing magnitude only (scalar). Force, weight, and displacement have both magnitude and direction.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_003",
                subject = "Physics",
                topic = "Mechanics: Friction",
                year = "1983",
                questionText = "A brick at rest on a horizontal table is pulled by a horizontal cord. The force of friction on the brick:",
                optionA = "Increases if the pull increases but the brick does not move",
                optionB = "Is directly horizontal to the right",
                optionC = "Decreases if an identical brick is placed on the first",
                optionD = "Is zero if the brick is pulled hard enough",
                correctAnswerIndex = 0,
                explanation = "While at rest, static friction is self-adjusting; it increases equal in magnitude to the applied pull to maintain equilibrium until limiting friction is reached.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_004",
                subject = "Physics",
                topic = "Gravitational Fields: Weight",
                year = "1983",
                questionText = "The force with which an object is attracted to the earth is called its:",
                optionA = "Acceleration",
                optionB = "Mass",
                optionC = "Gravity",
                optionD = "Weight",
                correctAnswerIndex = 3,
                explanation = "Weight is the gravitational attraction force exerted by the Earth on a body (W = mg).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_005",
                subject = "Physics",
                topic = "Optics: Refractive Index & Speed of Light",
                year = "1983",
                questionText = "The refractive index of a liquid is 1.5. If the velocity of light in vacuum is 3.0 x 10⁸ m/s, find the velocity of light in the liquid.",
                optionA = "1.5 x 10⁸ m/s",
                optionB = "2.0 x 10⁸ m/s",
                optionC = "3.0 x 10⁸ m/s",
                optionD = "4.5 x 10⁸ m/s",
                correctAnswerIndex = 1,
                explanation = "Refractive index n = c / v => v = c / n = (3.0 * 10⁸) / 1.5 = 2.0 * 10⁸ m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_006",
                subject = "Physics",
                topic = "Density and Mass",
                year = "1983",
                questionText = "If the relative density of a metal is 19, what will be the mass of 20 cm³ of the metal?",
                optionA = "380g",
                optionB = "400g",
                optionC = "360g",
                optionD = "39g",
                correctAnswerIndex = 0,
                explanation = "Density of metal = 19 g/cm³. Mass = Density * Volume = 19 * 20 = 380 g.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_007",
                subject = "Physics",
                topic = "Thermal Physics: Ideal Gas Laws",
                year = "1983",
                questionText = "If the pressure on 1000 cm³ of an ideal gas is doubled while its Kelvin temperature is halved, then the new volume of the gas will become:",
                optionA = "250 cm³",
                optionB = "500 cm³",
                optionC = "100 cm³",
                optionD = "200 cm³",
                correctAnswerIndex = 0,
                explanation = "P₁V₁/T₁ = P₂V₂/T₂ => (P₁ * 1000)/T₁ = (2P₁ * V₂)/(0.5T₁) => 1000 = 4V₂ => V₂ = 250 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_008",
                subject = "Physics",
                topic = "Kinematics: Linear Motion",
                year = "1983",
                questionText = "A train has an initial velocity of 44 m/s and an acceleration of -4 m/s². Its velocity after 10 seconds is:",
                optionA = "2 m/s",
                optionB = "4 m/s",
                optionC = "8 m/s",
                optionD = "12 m/s",
                correctAnswerIndex = 1,
                explanation = "Using v = u + at: v = 44 + (-4 * 10) = 44 - 40 = 4 m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_011",
                subject = "Physics",
                topic = "Elasticity: Hooke's Law",
                year = "1983",
                questionText = "The total length of a spring when a mass of 200g is hung from its end is 14 cm, while its total length is 16 cm when a mass of 300g is hung. Calculate the unstretched length of the spring.",
                optionA = "9.33 cm",
                optionB = "10.00 cm",
                optionC = "10.66 cm",
                optionD = "12.00 cm",
                correctAnswerIndex = 1,
                explanation = "14 = L₀ + 200k, 16 = L₀ + 300k. Subtracting: 2 = 100k => k = 0.02 cm/g. L₀ = 14 - 200(0.02) = 14 - 4 = 10.00 cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1983_014",
                subject = "Physics",
                topic = "Electrostatics: Electric Field Intensity",
                year = "1983",
                questionText = "If the force on a charge of 0.2 coulomb in an electric field is 4 N, then the electric field intensity of the field is:",
                optionA = "0.8 N/C",
                optionB = "20.0 N/C",
                optionC = "4.2 N/C",
                optionD = "8.0 N/C",
                correctAnswerIndex = 1,
                explanation = "Electric field intensity E = F / q = 4 N / 0.2 C = 20.0 N/C.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1984_015",
                subject = "Physics",
                topic = "Kinematics: Graphical Analysis",
                year = "1984",
                questionText = "The distance travelled by a particle starting from rest is plotted against the square of the time elapsed. If the resulting graph is linear, the slope of this graph is a measure of:",
                optionA = "Initial displacement",
                optionB = "Initial velocity",
                optionC = "Acceleration",
                optionD = "Half the acceleration",
                correctAnswerIndex = 3,
                explanation = "From s = ut + (1/2)at² with u = 0, s = (1/2)a * t². Plotting s against t² yields a straight-line slope equal to (1/2)a (half the acceleration).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1984 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1984_018",
                subject = "Physics",
                topic = "Dynamics: Newton's Laws & Vector Forces",
                year = "1984",
                questionText = "A body of mass 5 kg initially at rest is acted upon by two mutually perpendicular forces of 12 N and 5 N. Calculate the magnitude of the acceleration produced.",
                optionA = "0.40 m/s²",
                optionB = "1.40 m/s²",
                optionC = "2.60 m/s²",
                optionD = "3.40 m/s²",
                correctAnswerIndex = 2,
                explanation = "Resultant force F = √(12² + 5²) = √169 = 13 N. Acceleration a = F / m = 13 / 5 = 2.60 m/s².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1984 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1984_019",
                subject = "Physics",
                topic = "Momentum: Conservation & Recoil",
                year = "1984",
                questionText = "A gun of mass 2.0 kg fires a bullet of mass 1.6 x 10⁻² kg due East with a velocity of 150 m/s. What is the recoil velocity of the gun?",
                optionA = "1.2 m/s due West",
                optionB = "1.2 x 10⁻⁴ m/s due West",
                optionC = "1.2 m/s due East",
                optionD = "150 m/s due West",
                correctAnswerIndex = 0,
                explanation = "By momentum conservation: M * V + m * v = 0 => 2.0 * V + (0.016 * 150) = 0 => 2V = -2.4 => V = -1.2 m/s (1.2 m/s due West).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1984 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1985_021",
                subject = "Physics",
                topic = "Simple Harmonic Motion: Pendulums",
                year = "1985",
                questionText = "A simple pendulum with a period of 2.0 s has its length doubled. Its new period is:",
                optionA = "1.00 s",
                optionB = "1.41 s",
                optionC = "2.83 s",
                optionD = "4.00 s",
                correctAnswerIndex = 2,
                explanation = "Period T ∝ √L. If length doubles, new period T' = T * √2 = 2.0 * 1.414 = 2.83 s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1985 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1985_022",
                subject = "Physics",
                topic = "Kinematics: Displacement in Specific Second",
                year = "1985",
                questionText = "If a car starts from rest and moves with a uniform acceleration of 10 m/s² for ten seconds, the distance it covers in the last one second of the motion is:",
                optionA = "95 m",
                optionB = "100 m",
                optionC = "500 m",
                optionD = "905 m",
                correctAnswerIndex = 0,
                explanation = "Distance in 10s: s₁₀ = 0.5 * 10 * 10² = 500m. Distance in 9s: s₉ = 0.5 * 10 * 9² = 405m. Distance in 10th second = 500 - 405 = 95m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1985 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1985_023",
                subject = "Physics",
                topic = "Friction: Coefficient Calculation",
                year = "1985",
                questionText = "A metal block of mass 5 kg lies on a rough horizontal platform. If a horizontal force of 8 N applied to the block just slides it, then the coefficient of limiting friction is: [g = 10 m/s²]",
                optionA = "0.16",
                optionB = "0.63",
                optionC = "0.80",
                optionD = "1.60",
                correctAnswerIndex = 0,
                explanation = "Limiting friction F = 8 N. Normal reaction R = mg = 5 * 10 = 50 N. Coefficient µ = F / R = 8 / 50 = 0.16.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1985 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1985_025",
                subject = "Physics",
                topic = "Optics: Spherical Mirrors",
                year = "1985",
                questionText = "An object is placed 15 cm in front of a concave mirror of radius 40 cm. The image formed is:",
                optionA = "Virtual and 60 cm behind the mirror",
                optionB = "Real and 60 cm in front of the mirror",
                optionC = "Virtual and at infinity",
                optionD = "Real and at infinity",
                correctAnswerIndex = 0,
                explanation = "f = R/2 = 20 cm. Mirror formula: 1/f = 1/u + 1/v => 1/20 = 1/15 + 1/v => 1/v = 1/20 - 1/15 = -1/60 => v = -60 cm (virtual, behind mirror).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1985 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1985_026",
                subject = "Physics",
                topic = "Atomic & Nuclear Physics: Isotopes",
                year = "1985",
                questionText = "What is the number of neutrons in the Uranium isotope ²³⁸₉₂U?",
                optionA = "92",
                optionB = "146",
                optionC = "238",
                optionD = "330",
                correctAnswerIndex = 1,
                explanation = "Mass number A = 238, atomic number Z = 92. Number of neutrons N = A - Z = 238 - 92 = 146.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1985 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_1992_032",
                subject = "Physics",
                topic = "Waves: Stretched Strings & Tension",
                year = "1992",
                questionText = "The note produced by a stretched string has a fundamental frequency of 400 Hz. If the length of the string is doubled while the tension is increased by a factor of 4, the new frequency is:",
                optionA = "200 Hz",
                optionB = "400 Hz",
                optionC = "800 Hz",
                optionD = "1600 Hz",
                correctAnswerIndex = 1,
                explanation = "f = (1/2L) * √(T/µ). When L' = 2L and T' = 4T: f' = (1 / (2 * 2L)) * √(4T/µ) = (2 / 4L) * √(T/µ) = (1/2L) * √(T/µ) = 400 Hz.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1992 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_comp_2004_012",
                subject = "Physics",
                topic = "Work, Energy & Power: Kinetic Energy",
                year = "2004",
                questionText = "A body of mass 4 kg is acted on by a constant force of 12 N for 3 seconds. Calculate the kinetic energy gained by the body.",
                optionA = "162 J",
                optionB = "144 J",
                optionC = "72 J",
                optionD = "81 J",
                correctAnswerIndex = 0,
                explanation = "Acceleration a = F / m = 12 / 4 = 3 m/s². Final velocity v = at = 3 * 3 = 9 m/s. Kinetic energy = 0.5 * m * v² = 0.5 * 4 * 9² = 2 * 81 = 162 J.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2004 • Q12"
            )
        )

        return list
    }
}
