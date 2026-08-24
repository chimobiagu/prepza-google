package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * JAMB All-Subjects Master Revision Bank Volume 3 - Part 1 (100 Questions)
 * Subjects: English Language, Mathematics, Physics, Chemistry, Biology
 * Standardized 4-Option CBT format with comprehensive pedagogical explanations.
 */
object JambAllSubjectMasterRevisionVol3Part1QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1. USE OF ENGLISH (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "eng_vol3_2012_051",
                subject = "English Language",
                topic = "Lexis & Structure: Nearest in Meaning",
                year = "2012",
                questionText = "Choose the option nearest in meaning to the italicized word: Okibe was rusticated for his derogated remark about the principal.",
                optionA = "complimentary",
                optionB = "unsavoury",
                optionC = "unwarranted",
                optionD = "confirmed",
                correctAnswerIndex = 1,
                explanation = "A 'derogated' (derogatory) remark is one that is disparaging, disrespectful, or highly unpleasant, which is best synonymized by 'unsavoury'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q51"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2012_052",
                subject = "English Language",
                topic = "Idioms & Idiomatic Expressions",
                year = "2012",
                questionText = "Choose the option nearest in meaning to the italicized word: Some men will continue to cause offences until they are given a taste of their own medicine.",
                optionA = "placated",
                optionB = "revenged on",
                optionC = "recompensed for",
                optionD = "cured",
                correctAnswerIndex = 1,
                explanation = "Getting a 'taste of one's own medicine' is an idiomatic expression that means experiencing the same harmful or unpleasant treatment that one has given to others (retaliation or being revenged on).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q52"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2011_036",
                subject = "English Language",
                topic = "Lexis & Structure: Nearest in Meaning",
                year = "2011",
                questionText = "Choose the option nearest in meaning to the italicized word: Since its inception in 1983, the newspaper has attracted thousands of readers.",
                optionA = "renaissance",
                optionB = "coming",
                optionC = "commencement",
                optionD = "publication",
                correctAnswerIndex = 2,
                explanation = "'Inception' refers to the starting point, establishment, or beginning of an institution or activity, which translates directly to its 'commencement'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2013_041",
                subject = "English Language",
                topic = "Idioms: Interpretation",
                year = "2013",
                questionText = "Identify the option that best explains the meaning of the italicized expression: You need to brush up on your Spanish.",
                optionA = "You need to study the history of Spain",
                optionB = "You need to improve your skills",
                optionC = "You need a brush from Spain",
                optionD = "You need to learn to play with a Spaniard",
                correctAnswerIndex = 1,
                explanation = "To 'brush up on' a skill or language means to refresh one's knowledge, revise, or improve proficiency that has degraded over time.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2013_042",
                subject = "English Language",
                topic = "Idioms: Interpretation",
                year = "2013",
                questionText = "Identify the option that best explains the meaning of the italicized expression: Amaka would pass for a beauty queen.",
                optionA = "She would pass the drink to the queen sitting next to her",
                optionB = "She would be accepted by all as a beauty queen",
                optionC = "She walked past the beauty queen",
                optionD = "She was acting as a beauty queen",
                correctAnswerIndex = 1,
                explanation = "To 'pass for' someone or something means to be accepted, mistaken, or regarded as that entity because of matching characteristics.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2013_043",
                subject = "English Language",
                topic = "Idioms: Interpretation",
                year = "2013",
                questionText = "Identify the option that best explains the meaning of the italicized expression: 'I can't wait to become a mother,' the new bride declared.",
                optionA = "She sees motherhood as a burden",
                optionB = "She is excited about motherhood",
                optionC = "She is not keen on becoming a mother",
                optionD = "Motherhood is delayed",
                correctAnswerIndex = 1,
                explanation = "The colloquial idiom 'can't wait' is used to express strong enthusiasm, eagerness, or excitement about a future event.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2013 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2014_050",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word: The lamp shades were translucent.",
                optionA = "opaque",
                optionB = "interested",
                optionC = "luminous",
                optionD = "transparent",
                correctAnswerIndex = 0,
                explanation = "'Translucent' substances allow light to pass through partially. Its direct opposite is 'opaque', which completely blocks the passage of light.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q50"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2014_052",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word: Some of my neighbours have an antipathy to dogs.",
                optionA = "enmity towards",
                optionB = "affection for",
                optionC = "acronym for",
                optionD = "alarm for",
                correctAnswerIndex = 1,
                explanation = "'Antipathy' refers to a deep-seated feeling of dislike or aversion. The antonym is 'affection for', representing liking or fondness.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q52"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2014_054",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word: The testimony of the witness was vague.",
                optionA = "disturbing",
                optionB = "true",
                optionC = "ambiguous",
                optionD = "clear",
                correctAnswerIndex = 3,
                explanation = "'Vague' indicates something unclear, imprecise, or hazy. Its direct grammatical opposite is 'clear'.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q54"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2014_055",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2014",
                questionText = "Choose the option opposite in meaning to the italicized word: As a student, Isa tried communal living for a few years.",
                optionA = "collective",
                optionB = "general",
                optionC = "shared",
                optionD = "private",
                correctAnswerIndex = 3,
                explanation = "'Communal' refers to something shared by all members of a community. Its opposite is 'private', denoting individual or personal ownership.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2014 • Q55"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2015_059",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2015",
                questionText = "Choose the option opposite in meaning to the italicized word: Garuba’s performance in the competition was horrid.",
                optionA = "terrible",
                optionB = "encouraging",
                optionC = "commendable",
                optionD = "rigid",
                correctAnswerIndex = 2,
                explanation = "'Horrid' means extremely unpleasant, offensive, or poor. Its positive antonym in this context is 'commendable' (worthy of praise).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q59"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2015_062",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2015",
                questionText = "Choose the option opposite in meaning to the italicized word: The man has a strong distaste for alcohol.",
                optionA = "love",
                optionB = "aversion",
                optionC = "desire",
                optionD = "excitement",
                correctAnswerIndex = 0,
                explanation = "'Distaste' means a dislike or aversion. Its opposite is 'love' or strong liking.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q62"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2015_063",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2015",
                questionText = "Choose the option opposite in meaning to the italicized word: The schism in the organization is on the increase.",
                optionA = "disagreement",
                optionB = "understanding",
                optionC = "opportunity",
                optionD = "rot",
                correctAnswerIndex = 1,
                explanation = "'Schism' means a split or division caused by strongly opposed beliefs. Its antonym is 'understanding' or unity.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q63"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2015_064",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2015",
                questionText = "Choose the option opposite in meaning to the italicized word: Sule admires people who have an unbending character.",
                optionA = "mobile",
                optionB = "steady",
                optionC = "wavering",
                optionD = "unstable",
                correctAnswerIndex = 2,
                explanation = "An 'unbending' character is rigid, resolute, and uncompromising. Its opposite is 'wavering' (hesitant, flexible, or easily influenced).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q64"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2015_065",
                subject = "English Language",
                topic = "Antonyms: Opposite in Meaning",
                year = "2015",
                questionText = "Choose the option opposite in meaning to the italicized word: He detests honesty.",
                optionA = "likes",
                optionB = "hates",
                optionC = "encourages",
                optionD = "commands",
                correctAnswerIndex = 0,
                explanation = "'Detest' means to intensely dislike or hate. Its antonym is 'likes' or appreciates.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2015 • Q65"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2012_071",
                subject = "English Language",
                topic = "Grammar: Subject-Verb Agreement",
                year = "2012",
                questionText = "Choose the option that best completes the gap: A wide range of options _______ made available to students in the final year last year.",
                optionA = "is",
                optionB = "were",
                optionC = "are",
                optionD = "was",
                correctAnswerIndex = 3,
                explanation = "The subject 'A wide range' is singular and takes a singular verb. Since the sentence indicates past time ('last year'), 'was' is the correct past singular form.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q71"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2012_072",
                subject = "English Language",
                topic = "Grammar: Concord & Relative Clauses",
                year = "2012",
                questionText = "Choose the option that best completes the gap: One of the women who _______ in the premises _______ been ordered to quit.",
                optionA = "sells / have",
                optionB = "sell / has",
                optionC = "sell / have",
                optionD = "sells / has",
                correctAnswerIndex = 1,
                explanation = "In the relative clause 'who sell', 'who' refers to the plural antecedent 'women' (hence plural verb 'sell'). The main subject is 'One', which is singular and takes the singular verb 'has' ('has been ordered to quit').",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q72"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2012_073",
                subject = "English Language",
                topic = "Grammar: Order of Adjectives",
                year = "2012",
                questionText = "Choose the option that best completes the gap: The new trade agreement should facilitate _______.",
                optionA = "more economic rapid growth",
                optionB = "economic more rapid growth",
                optionC = "rapid economic more growth",
                optionD = "more rapid economic growth",
                correctAnswerIndex = 3,
                explanation = "Adjectives follow a specific modifier order: 'more' (degree modifier) precedes 'rapid' (descriptive adjective) which precedes 'economic' (classifying adjective) qualifying the noun 'growth'.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q73"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2012_074",
                subject = "English Language",
                topic = "Grammar: Prepositional Collocations",
                year = "2012",
                questionText = "Choose the option that best completes the gap: The principal said that he was pleased _______ my effort.",
                optionA = "on",
                optionB = "of",
                optionC = "with",
                optionD = "about",
                correctAnswerIndex = 2,
                explanation = "The adjective 'pleased' takes the preposition 'with' when referring to satisfaction with a person's work, actions, or efforts.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2012 • Q74"
            )
        )

        list.add(
            QuestionEntity(
                id = "eng_vol3_2011_086",
                subject = "English Language",
                topic = "Oral English: Vowel Sounds",
                year = "2011",
                questionText = "Choose the option that has the same vowel sound as the one represented by the underlined letters: bubble",
                optionA = "guy",
                optionB = "bull",
                optionC = "bumper",
                optionD = "gurgle",
                correctAnswerIndex = 2,
                explanation = "The letter 'u' in 'bubble' represents the short central vowel /ʌ/. The word 'bumper' (/ˈbʌm.pər/) contains this identical /ʌ/ vowel sound.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Use of English 2011 • Q86"
            )
        )

        // =========================================================================
        // 2. MATHEMATICS (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_vol3_1983_001",
                subject = "Mathematics",
                topic = "Statistics: Measures of Central Tendency",
                year = "1983",
                questionText = "If M represents the median and D the mode of the measurements 5, 9, 3, 5, 8 then (M, D) is:",
                optionA = "(6, 5)",
                optionB = "(5, 8)",
                optionC = "(5, 7)",
                optionD = "(5, 5)",
                correctAnswerIndex = 3,
                explanation = "Arranging scores in ascending order: 3, 5, 5, 8, 9. Median (middle term) is 5, and Mode (most frequent term) is 5. Thus, (M, D) is (5, 5).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_002",
                subject = "Mathematics",
                topic = "Commercial Arithmetic: Profit Sharing",
                year = "1983",
                questionText = "A construction company is owned by two partners X and Y and it is agreed that their profit will be divided in the ratio 4:5. At the end of the year, Y received ₦5,000 more than X. What is the total profit of the company for the year?",
                optionA = "₦20,000.00",
                optionB = "₦25,000.00",
                optionC = "₦30,000.00",
                optionD = "₦45,000.00",
                correctAnswerIndex = 3,
                explanation = "Let total profit be P. Y's share minus X's share is (5/9)P - (4/9)P = (1/9)P = 5,000. Therefore, P = 5,000 * 9 = ₦45,000.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_003",
                subject = "Mathematics",
                topic = "Geometry: Polygons",
                year = "1983",
                questionText = "Given a regular hexagon, calculate each interior angle of the hexagon.",
                optionA = "60°",
                optionB = "30°",
                optionC = "120°",
                optionD = "45°",
                correctAnswerIndex = 2,
                explanation = "Sum of interior angles = (n - 2) * 180°. For a hexagon (n = 6), sum = 4 * 180° = 720°. Each interior angle is 720° / 6 = 120°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_004",
                subject = "Mathematics",
                topic = "Algebra: Simultaneous Linear Equations",
                year = "1983",
                questionText = "Solve the equations: 4x - 3 = 3x + y = 2y + 5x - 12.",
                optionA = "x = 5, y = 2",
                optionB = "x = 2, y = 5",
                optionC = "x = -2, y = -5",
                optionD = "x = 5, y = -2",
                correctAnswerIndex = 0,
                explanation = "From 4x - 3 = 3x + y, we get y = x - 3. Substitute into 3x + y = 2y + 5x - 12: 3x + (x - 3) = 2(x - 3) + 5x - 12 => 4x - 3 = 7x - 18 => 3x = 15 => x = 5, y = 2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_005",
                subject = "Mathematics",
                topic = "Algebra: Polynomial Roots",
                year = "1983",
                questionText = "If x = 1 is a root of the equation x³ - 2x² - 5x + 6 = 0, find the other roots.",
                optionA = "-3 and 2",
                optionB = "-2 and 2",
                optionC = "3 and -2",
                optionD = "1 and 3",
                correctAnswerIndex = 2,
                explanation = "Dividing x³ - 2x² - 5x + 6 by (x - 1) gives x² - x - 6 = (x - 3)(x + 2) = 0. Hence the other roots are x = 3 and x = -2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_006",
                subject = "Mathematics",
                topic = "Algebra: Variation",
                year = "1983",
                questionText = "If x is jointly proportional to the cube of y and the fourth power of z. In what ratio is x increased or decreased when y is halved and z is doubled?",
                optionA = "4:1 increase",
                optionB = "2:1 increase",
                optionC = "1:4 decrease",
                optionD = "1:1 no change",
                correctAnswerIndex = 1,
                explanation = "x = k · y³ · z⁴. New value x' = k · (y/2)³ · (2z)⁴ = k · (y³/8) · 16z⁴ = 2(k · y³ · z⁴) = 2x. This represents a 2:1 increase.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_012",
                subject = "Mathematics",
                topic = "Statistics: Pie Charts",
                year = "1983",
                questionText = "In a class of 60 pupils, the statistical distribution of pupils offering subjects is represented in a pie chart: Additional Maths (2x - 24)°, Biology (3x - 18)°, Geography (x + 12)°, French (2x + 12)°, History x°. How many pupils offer Additional Mathematics?",
                optionA = "15",
                optionB = "10",
                optionC = "18",
                optionD = "12",
                correctAnswerIndex = 1,
                explanation = "Sum of angles = 360°: (2x - 24) + (3x - 18) + (x + 12) + (2x + 12) + x = 360° => 9x - 18 = 360 => 9x = 378 => x = 42°. Additional Maths sector = 2(42) - 24 = 60°. Pupils = (60/360) * 60 = 10.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_016",
                subject = "Mathematics",
                topic = "Geometry: Pythagoras' Theorem",
                year = "1983",
                questionText = "The lengths of the sides of a right-angled triangle are (3x + 1)cm, (3x - 1)cm and x cm. Find x.",
                optionA = "2",
                optionB = "6",
                optionC = "18",
                optionD = "12",
                correctAnswerIndex = 3,
                explanation = "By Pythagoras' theorem: (3x + 1)² = (3x - 1)² + x² => 9x² + 6x + 1 = 9x² - 6x + 1 + x² => 12x = x². Since x > 0, x = 12.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_017",
                subject = "Mathematics",
                topic = "Statistics: Median",
                year = "1983",
                questionText = "The scores of a set of final year students in a paper are: 41, 29, 55, 21, 47, 70, 70, 40, 43, 56, 73, 23, 50, 50. Find the median of the scores.",
                optionA = "47",
                optionB = "48.5",
                optionC = "50",
                optionD = "43",
                correctAnswerIndex = 1,
                explanation = "Ordering the 14 scores: 21, 23, 29, 40, 41, 43, 47, 50, 50, 55, 56, 70, 70, 73. The 7th and 8th scores are 47 and 50. Median = (47 + 50) / 2 = 48.5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_021",
                subject = "Mathematics",
                topic = "Number Bases: Conversion & Equations",
                year = "1983",
                questionText = "Find x if (x_base 4)² = 1001000_base 2",
                optionA = "6",
                optionB = "12",
                optionC = "100",
                optionD = "210",
                correctAnswerIndex = 1,
                explanation = "Convert 1001000₂ to base 10: 2⁶ + 2³ = 64 + 8 = 72. (x_base 4)² = 144 (base 10) => x = 12 (base 10).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_027",
                subject = "Mathematics",
                topic = "Statistics: Sectorial Angles",
                year = "1983",
                questionText = "Find the angle of the sectors representing each item in a pie chart of the following data: 6, 10, 14, 16, 26.",
                optionA = "15°, 25°, 35°, 40°, 65°",
                optionB = "60°, 100°, 140°, 160°, 260°",
                optionC = "6°, 10°, 14°, 16°, 26°",
                optionD = "30°, 50°, 70°, 80°, 130°",
                correctAnswerIndex = 3,
                explanation = "Sum of values = 6 + 10 + 14 + 16 + 26 = 72. Sectorial multiplier = 360° / 72 = 5°. Angles: 6*5=30°, 10*5=50°, 14*5=70°, 16*5=80°, 26*5=130°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_028",
                subject = "Mathematics",
                topic = "Statistics: Mean & Median & Mode",
                year = "1983",
                questionText = "The scores of 16 students in a Mathematics test are: 65, 65, 55, 60, 60, 65, 60, 70, 75, 70, 65, 70, 60, 65, 65, 70. What is the sum of the median and modal scores?",
                optionA = "125",
                optionB = "130",
                optionC = "140",
                optionD = "150",
                correctAnswerIndex = 1,
                explanation = "Mode is 65 (frequency 6). Arranged scores: 55, 60, 60, 60, 60, 65, 65, 65, 65, 65, 65, 70, 70, 70, 70, 75. Median = (65 + 65)/2 = 65. Sum = 65 + 65 = 130.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1983_029",
                subject = "Mathematics",
                topic = "Probability: Single Event",
                year = "1983",
                questionText = "The letters of the word MATRICULATION are cut and put into a box. One of the letters is drawn at random from the box. Find the probability of drawing a vowel.",
                optionA = "2/13",
                optionB = "5/13",
                optionC = "6/13",
                optionD = "8/13",
                correctAnswerIndex = 2,
                explanation = "Total letters = 13. Vowels are A, I, U, A, I, O (6 vowels). Probability = 6/13.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1984_001",
                subject = "Mathematics",
                topic = "Fractions: BODMAS",
                year = "1984",
                questionText = "Simplify: (2/3 - 1/5) / (1/3 of 2/5)",
                optionA = "1/7",
                optionB = "7/2",
                optionC = "1/3",
                optionD = "3",
                correctAnswerIndex = 1,
                explanation = "Numerator: 2/3 - 1/5 = (10 - 3)/15 = 7/15. Denominator: 1/3 * 2/5 = 2/15. Quotient: (7/15) / (2/15) = 7/2 = 3.5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1984_002",
                subject = "Mathematics",
                topic = "Number Bases: Base Determination",
                year = "1984",
                questionText = "If 263 + 441 = 714, what number base has been used?",
                optionA = "12",
                optionB = "11",
                optionC = "10",
                optionD = "9",
                correctAnswerIndex = 3,
                explanation = "In base b: (2b² + 6b + 3) + (4b² + 4b + 1) = 7b² + b + 4 => 6b² + 10b + 4 = 7b² + b + 4 => b² - 9b = 0 => b = 9.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1984_004",
                subject = "Mathematics",
                topic = "Commercial Arithmetic: Percentage Profit & Loss",
                year = "1984",
                questionText = "P sold his bicycle to Q at a profit of 10%. Q sold it to R for ₦209 at a loss of 5%. How much did the bicycle cost P?",
                optionA = "₦200.00",
                optionB = "₦196.00",
                optionC = "₦180.00",
                optionD = "₦205.00",
                correctAnswerIndex = 0,
                explanation = "Let P's cost be C. Q's cost = 1.10C. R's price = 0.95(1.10C) = 1.045C = ₦209 => C = 209 / 1.045 = ₦200.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1984_006",
                subject = "Mathematics",
                topic = "Commercial Arithmetic: Investments & Dividend",
                year = "1984",
                questionText = "A man invested a total of ₦50,000 in two companies paying dividends of 6% and 8% respectively. How much did he invest at 8% if the total yield is ₦3,700?",
                optionA = "₦15,000",
                optionB = "₦29,600",
                optionC = "₦21,400",
                optionD = "₦35,000",
                correctAnswerIndex = 3,
                explanation = "Let x be amount at 8%, then (50,000 - x) is at 6%. 0.08x + 0.06(50,000 - x) = 3,700 => 0.02x + 3,000 = 3,700 => 0.02x = 700 => x = ₦35,000.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1984_007",
                subject = "Mathematics",
                topic = "Statistics: Combined Mean",
                year = "1984",
                questionText = "Thirty boys and x girls sat for a test. The mean of the boys' scores and that of the girls were respectively 6 and 8. Find x if the total score was 468.",
                optionA = "38",
                optionB = "24",
                optionC = "36",
                optionD = "22",
                correctAnswerIndex = 2,
                explanation = "Boys' total score = 30 * 6 = 180. Girls' total score = 8x. 180 + 8x = 468 => 8x = 288 => x = 36.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1984_008",
                subject = "Mathematics",
                topic = "Statistics: Pie Chart Angles",
                year = "1984",
                questionText = "The cost of production of an article is: Labour ₦70, Power ₦15, Materials ₦30, Miscellaneous ₦5. Find the angle of the sector representing labour in a pie chart.",
                optionA = "210°",
                optionB = "105°",
                optionC = "175°",
                optionD = "150°",
                correctAnswerIndex = 0,
                explanation = "Total cost = 70 + 15 + 30 + 5 = ₦120. Sector angle for Labour = (70 / 120) * 360° = 70 * 3 = 210°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_vol3_1984_009",
                subject = "Mathematics",
                topic = "Probability: Divisibility",
                year = "1984",
                questionText = "Bola chooses at random a number between 1 and 300. What is the probability that the number is divisible by 4?",
                optionA = "1/3",
                optionB = "1/4",
                optionC = "1/5",
                optionD = "1/6",
                correctAnswerIndex = 1,
                explanation = "Numbers divisible by 4 from 1 to 300 are 4, 8, 12, ..., 300 (total = 300 / 4 = 75). Probability = 75 / 300 = 1/4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q9"
            )
        )

        // =========================================================================
        // 3. PHYSICS (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_001",
                subject = "Physics",
                topic = "Waves & Sound: Resonance in Pipes",
                year = "1983",
                questionText = "In a resonance tube experiment, a tube of fixed length is closed at one end and several tuning forks of increasing frequency are used to obtain resonance at the open end. If the tuning fork with the lowest frequency which gave resonance had a frequency f₁ and the next tuning fork to give resonance had a frequency f₂, find the ratio f₂/f₁.",
                optionA = "8",
                optionB = "3",
                optionC = "2",
                optionD = "1/2",
                correctAnswerIndex = 1,
                explanation = "For a closed pipe of fixed length, resonance occurs at odd harmonics: f₁, 3f₁, 5f₁, etc. The next resonant frequency f₂ = 3f₁. Therefore, f₂/f₁ = 3.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_002",
                subject = "Physics",
                topic = "Scalars and Vectors",
                year = "1983",
                questionText = "Which of the following is NOT a vector quantity?",
                optionA = "Force",
                optionB = "Altitude",
                optionC = "Weight",
                optionD = "Displacement",
                correctAnswerIndex = 1,
                explanation = "Altitude represents vertical height above a reference level and is a scalar quantity described by magnitude alone. Force, weight, and displacement are vectors.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_003",
                subject = "Physics",
                topic = "Mechanics: Friction",
                year = "1983",
                questionText = "A brick at rest on a horizontal table is pulled by a horizontal cord. The force of friction on the brick:",
                optionA = "Increases if the pull increases but the brick does not move.",
                optionB = "Is directly horizontal to the right.",
                optionC = "Decreases if an identical brick is placed on the first.",
                optionD = "Is zero if the brick is pulled hard enough.",
                correctAnswerIndex = 0,
                explanation = "Static friction is a self-adjusting force that matches the applied pulling force up to the limiting frictional value as long as the object remains stationary.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_004",
                subject = "Physics",
                topic = "Mechanics: Gravitational Force",
                year = "1983",
                questionText = "The force with which an object is attracted to the earth is called its:",
                optionA = "Acceleration",
                optionB = "Mass",
                optionC = "Gravity",
                optionD = "Weight",
                correctAnswerIndex = 3,
                explanation = "Weight (W = mg) is defined as the gravitational force exerted by the Earth on a given body of mass.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_005",
                subject = "Physics",
                topic = "Optics: Refraction of Light",
                year = "1983",
                questionText = "The refractive index of a liquid is 1.5. If the velocity of light in vacuum is 3.0 × 10⁸ m/s, find the velocity of light in the liquid.",
                optionA = "1.5 × 10⁸ m/s",
                optionB = "2.0 × 10⁸ m/s",
                optionC = "3.0 × 10⁸ m/s",
                optionD = "4.5 × 10⁸ m/s",
                correctAnswerIndex = 1,
                explanation = "Refractive index n = c / v => v = c / n = (3.0 × 10⁸) / 1.5 = 2.0 × 10⁸ m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_006",
                subject = "Physics",
                topic = "Properties of Matter: Density & Mass",
                year = "1983",
                questionText = "If the relative density of a metal is 19, what will be the mass of 20 cm³ of the metal when immersed in water?",
                optionA = "380g",
                optionB = "400g",
                optionC = "360g",
                optionD = "39g",
                correctAnswerIndex = 0,
                explanation = "Mass is an intrinsic property that does not change upon immersion: Mass = Density × Volume = 19 g/cm³ × 20 cm³ = 380 g.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_007",
                subject = "Physics",
                topic = "Thermal Physics: Gas Laws",
                year = "1983",
                questionText = "If the pressure on 1000 cm³ of an ideal gas is doubled while its Kelvin temperature is halved, then the new volume of the gas will become:",
                optionA = "250 cm³",
                optionB = "500 cm³",
                optionC = "100 cm³",
                optionD = "200 cm³",
                correctAnswerIndex = 0,
                explanation = "P₁V₁/T₁ = P₂V₂/T₂ => P₁(1000)/T₁ = (2P₁)V₂/(0.5T₁) => 1000 = 4V₂ => V₂ = 250 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_008",
                subject = "Physics",
                topic = "Kinematics: Linear Motion",
                year = "1983",
                questionText = "A train has an initial velocity of 44 m/s and an acceleration of -4 m/s². Its velocity after 10 seconds is:",
                optionA = "2 m/s",
                optionB = "4 m/s",
                optionC = "8 m/s",
                optionD = "12 m/s",
                correctAnswerIndex = 1,
                explanation = "v = u + at = 44 + (-4 * 10) = 44 - 40 = 4 m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_009",
                subject = "Physics",
                topic = "Dynamics: Newton's Laws",
                year = "1983",
                questionText = "A force of 16 N is applied to a 4.0 kg block that is at rest on a smooth horizontal surface. What is the velocity of the block at t = 5 seconds?",
                optionA = "4 m/s",
                optionB = "10 m/s",
                optionC = "20 m/s",
                optionD = "50 m/s",
                correctAnswerIndex = 2,
                explanation = "Acceleration a = F / m = 16 / 4.0 = 4 m/s². Velocity v = u + at = 0 + (4 * 5) = 20 m/s.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_011",
                subject = "Physics",
                topic = "Elasticity: Hooke's Law",
                year = "1983",
                questionText = "The total length of a spring when a mass of 200 g is hung from its end is 14 cm, while its total length is 16 cm when a mass of 300 g is hung. Calculate the unstretched length of the spring.",
                optionA = "9.33 cm",
                optionB = "10.00 cm",
                optionC = "10.66 cm",
                optionD = "12.00 cm",
                correctAnswerIndex = 1,
                explanation = "L = L₀ + km. 14 = L₀ + 200k, 16 = L₀ + 300k. Subtracting: 2 = 100k => k = 0.02 cm/g. L₀ = 14 - 200(0.02) = 14 - 4 = 10.00 cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_012",
                subject = "Physics",
                topic = "Atomic Physics: Atomic Structure",
                year = "1983",
                questionText = "Which of the following statements is CORRECT? (I) The mass number equals total protons and electrons. (II) The atomic number equals the number of protons. (III) The number of electrons equals total protons and neutrons.",
                optionA = "I only",
                optionB = "II only",
                optionC = "III only",
                optionD = "I and II only",
                correctAnswerIndex = 1,
                explanation = "Atomic number (Z) is strictly defined as the number of protons in the nucleus of an atom.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1983_014",
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
                id = "phy_vol3_1984_015",
                subject = "Physics",
                topic = "Kinematics: Graphical Analysis",
                year = "1984",
                questionText = "The distance travelled by a particle starting from rest is plotted against the square of the time elapsed (t²). The resulting graph is linear. The slope of this graph is a measure of:",
                optionA = "Initial displacement",
                optionB = "Initial velocity",
                optionC = "Acceleration",
                optionD = "Half the acceleration",
                correctAnswerIndex = 3,
                explanation = "From s = ut + ½at² with u = 0, s = ½a(t²). In a plot of s versus t², the slope equals ½a (half the acceleration).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1984 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1984_016",
                subject = "Physics",
                topic = "Current Electricity: Electric Charge",
                year = "1984",
                questionText = "The unit quantity of electricity is called:",
                optionA = "The ampere",
                optionB = "The volt",
                optionC = "The coulomb",
                optionD = "The ammeter",
                correctAnswerIndex = 2,
                explanation = "The coulomb (C) is the SI unit of electric charge (quantity of electricity), defined as 1 Ampere × 1 second.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1984 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1984_017",
                subject = "Physics",
                topic = "Thermal Physics: States of Matter",
                year = "1984",
                questionText = "If a solid changes directly into a gas when heat is applied, the process is called:",
                optionA = "Vaporization",
                optionB = "Evaporation",
                optionC = "Sublimation",
                optionD = "Ionization",
                correctAnswerIndex = 2,
                explanation = "Sublimation is the direct phase transition from solid to gas without passing through the liquid phase.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1984 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1984_018",
                subject = "Physics",
                topic = "Mechanics: Perpendicular Forces & Acceleration",
                year = "1984",
                questionText = "A body of mass 5 kg initially at rest is acted upon by two mutually perpendicular forces 12 N and 5 N. Calculate the magnitude of the acceleration produced.",
                optionA = "0.40 m/s²",
                optionB = "1.40 m/s²",
                optionC = "2.60 m/s²",
                optionD = "3.40 m/s²",
                correctAnswerIndex = 2,
                explanation = "Resultant force F = √(12² + 5²) = √(144 + 25) = 13 N. Acceleration a = F / m = 13 / 5 = 2.60 m/s².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1984 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1984_019",
                subject = "Physics",
                topic = "Momentum: Recoil of Gun",
                year = "1984",
                questionText = "A gun of mass 2.0 kg fires a bullet of mass 1.6 × 10⁻² kg due East with a velocity of 150 m/s. What is the recoil velocity of the gun?",
                optionA = "1.2 m/s due West",
                optionB = "1.2 × 10⁻⁴ m/s due West",
                optionC = "1.2 m/s due East",
                optionD = "150 m/s due West",
                correctAnswerIndex = 0,
                explanation = "By conservation of momentum: m_g * v_g + m_b * v_b = 0 => v_g = -(1.6 × 10⁻² * 150) / 2.0 = -1.2 m/s (1.2 m/s due West).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1984 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1985_020",
                subject = "Physics",
                topic = "Units & Dimensions: SI Units",
                year = "1985",
                questionText = "Which of the following is NOT a fundamental S.I. unit?",
                optionA = "Metre",
                optionB = "Ampere",
                optionC = "Kelvin",
                optionD = "Radian",
                correctAnswerIndex = 3,
                explanation = "The radian is a supplementary dimensionless unit for angles; the fundamental SI units are metre, kilogram, second, ampere, kelvin, mole, and candela.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1985 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_1985_021",
                subject = "Physics",
                topic = "Simple Harmonic Motion: Pendulum",
                year = "1985",
                questionText = "A simple pendulum with a period of 2.0 s has its length doubled. Its new period is:",
                optionA = "1.00 s",
                optionB = "1.41 s",
                optionC = "2.83 s",
                optionD = "4.00 s",
                correctAnswerIndex = 2,
                explanation = "T = 2π√(L/g). When length is doubled, T' = T * √2 = 2.0 * 1.414 = 2.83 s.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 1985 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "phy_vol3_2004_012",
                subject = "Physics",
                topic = "Work, Energy & Power: Kinetic Energy",
                year = "2004",
                questionText = "A body of mass 4 kg is acted on by a constant force of 12 N for 3 seconds. Calculate the kinetic energy gained by the body.",
                optionA = "162 J",
                optionB = "144 J",
                optionC = "72 J",
                optionD = "81 J",
                correctAnswerIndex = 0,
                explanation = "Acceleration a = F/m = 12/4 = 3 m/s². Velocity v = at = 3 * 3 = 9 m/s. Kinetic energy = ½mv² = ½ * 4 * 9² = 2 * 81 = 162 J.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Physics 2004 • Q12"
            )
        )

        // =========================================================================
        // 4. CHEMISTRY (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_001",
                subject = "Chemistry",
                topic = "Salts: Identification & Properties",
                year = "1983",
                questionText = "X is a crystalline salt of sodium. A solution of X in water turns litmus red and produces a gas which turns lime water milky when added to sodium carbonate. With barium chloride solution, X gives a white precipitate insoluble in dilute HCl. X is:",
                optionA = "Na₂CO₃",
                optionB = "NaHCO₃",
                optionC = "NaHSO₄",
                optionD = "Na₂SO₄",
                correctAnswerIndex = 2,
                explanation = "NaHSO₄ (sodium hydrogen sulphate) is an acid salt that releases H⁺ ions, reacts with carbonates to produce CO₂, and yields SO₄²⁻ ions which form insoluble BaSO₄ with BaCl₂.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_002",
                subject = "Chemistry",
                topic = "Organic Chemistry: Saponification",
                year = "1983",
                questionText = "The alkanol obtained as a by-product from the commercial production of soap is:",
                optionA = "ethanol",
                optionB = "glycerol",
                optionC = "methanol",
                optionD = "glycol",
                correctAnswerIndex = 1,
                explanation = "Saponification represents alkaline hydrolysis of fats and oils (esters of fatty acids and glycerol), yielding soap and glycerol (propane-1,2,3-triol).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_003",
                subject = "Chemistry",
                topic = "Industrial Chemistry: Oxy-acetylene Flame",
                year = "1983",
                questionText = "The high-temperature flame used by welders in cutting and joining metals is:",
                optionA = "butane gas flame",
                optionB = "acetylene flame",
                optionC = "kerosene flame",
                optionD = "oxy-acetylene flame",
                correctAnswerIndex = 3,
                explanation = "Combustion of ethyne (acetylene) in pure oxygen produces an oxy-acetylene flame exceeding 3000°C, sufficient for metal cutting and welding.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_004",
                subject = "Chemistry",
                topic = "Organic Chemistry: Homologous Series",
                year = "1983",
                questionText = "Consecutive members of an alkane homologous series differ in molecular formula by:",
                optionA = "-CH-",
                optionB = "-CH₂-",
                optionC = "-CH₃-",
                optionD = "-C₂H₅-",
                correctAnswerIndex = 1,
                explanation = "Consecutive members of any homologous series differ structurally by a methylene group (-CH₂-), corresponding to a relative molecular mass difference of 14.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_005",
                subject = "Chemistry",
                topic = "Periodic Table: Electronic Configuration",
                year = "1983",
                questionText = "If an element has the electronic configuration 1s² 2s² 2p⁶ 3s² 3p², it is classified as:",
                optionA = "a metal",
                optionB = "an alkaline earth metal",
                optionC = "an s-block element",
                optionD = "a p-block element",
                correctAnswerIndex = 3,
                explanation = "The valence differentiating electrons enter the 3p subshell, placing Silicon (Z=14) in the p-block of the Periodic Table.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_006",
                subject = "Chemistry",
                topic = "Stoichiometry: Water of Crystallization",
                year = "1983",
                questionText = "Some CuSO₄·5H₂O was heated at 120°C: Weight of crucible = 10.00 g; Crucible + CuSO₄·5H₂O = 14.98 g; Crucible + residue = 13.54 g. How many molecules of water of crystallization were lost? [Cu=63.5, S=32, O=16, H=1]",
                optionA = "1",
                optionB = "2",
                optionC = "3",
                optionD = "4",
                correctAnswerIndex = 3,
                explanation = "Initial mass of hydrate = 4.98 g (0.020 mol). Mass of water lost = 14.98 - 13.54 = 1.44 g (0.080 mol). Ratio = 0.080 / 0.020 = 4 molecules of water lost.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_007",
                subject = "Chemistry",
                topic = "Chemical Bonding: Molecular Geometry",
                year = "1983",
                questionText = "The three-dimensional shape of a methane (CH₄) molecule is:",
                optionA = "hexagonal",
                optionB = "trigonal planar",
                optionC = "linear",
                optionD = "tetrahedral",
                correctAnswerIndex = 3,
                explanation = "Methane possesses sp³ hybridization with four equivalent C-H bonding pairs directed towards the corners of a regular tetrahedron (bond angle 109.5°).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_011",
                subject = "Chemistry",
                topic = "Separation Techniques: Mixtures",
                year = "1983",
                questionText = "A mixture of common salt (NaCl), ammonium chloride (NH₄Cl) and barium sulphate (BaSO₄) can best be separated by:",
                optionA = "addition of water followed by filtration then sublimation",
                optionB = "addition of water followed by sublimation then filtration",
                optionC = "sublimation followed by addition of water then filtration",
                optionD = "fractional distillation",
                correctAnswerIndex = 2,
                explanation = "Heating sublimes volatile NH₄Cl first. Adding water dissolves soluble NaCl, leaving insoluble BaSO₄, which is separated by filtration.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_012",
                subject = "Chemistry",
                topic = "Gas Laws: Ideal Gas Behavior",
                year = "1983",
                questionText = "Which of the following mathematical relationships represents ideal gas behavior?",
                optionA = "P ∝ VT",
                optionB = "P ∝ T / V",
                optionC = "PT ∝ V",
                optionD = "PV ∝ VT",
                correctAnswerIndex = 1,
                explanation = "From the Ideal Gas Equation PV = nRT, P = nRT / V. For constant moles n, Pressure P is directly proportional to T and inversely proportional to V (P ∝ T/V).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_013",
                subject = "Chemistry",
                topic = "Gas Diffusion & Thermal Decomposition",
                year = "1983",
                questionText = "In an experiment where solid ammonium chloride is heated in a test tube with a damp neutral litmus paper at the mouth, the litmus paper will initially:",
                optionA = "be bleached",
                optionB = "turn green",
                optionC = "turn red",
                optionD = "turn blue",
                correctAnswerIndex = 3,
                explanation = "Thermal decomposition yields NH₃ (molar mass 17) and HCl (molar mass 36.5). NH₃ diffuses faster (Graham's Law) and reaches the mouth first, turning litmus blue (alkaline).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_017",
                subject = "Chemistry",
                topic = "Electrochemistry: Faraday's Second Law",
                year = "1983",
                questionText = "A current was passed for 10 minutes and 0.63 g of copper was deposited on the cathode of a CuSO₄ cell. The weight of silver deposited on a series-connected AgNO₃ cell during the same period would be: [Cu = 63, Ag = 108]",
                optionA = "0.54 g",
                optionB = "1.08 g",
                optionC = "1.62 g",
                optionD = "2.16 g",
                correctAnswerIndex = 3,
                explanation = "By Faraday's Second Law: Mass Ag / Mass Cu = (108 / 1) / (63 / 2) = 108 / 31.5 = 3.428 => Mass Ag = 0.63 * 3.428 = 2.16 g.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_018",
                subject = "Chemistry",
                topic = "Electrochemistry: Activity Series",
                year = "1983",
                questionText = "In the reaction Fe + Cu²⁺ → Fe²⁺ + Cu, iron displaces copper ions. This is due to the fact that:",
                optionA = "iron is in metallic form while copper is in ionic form",
                optionB = "the atomic weight of copper is greater than that of iron",
                optionC = "copper metal has more electrons than iron metal",
                optionD = "iron is higher in the electrochemical series than copper",
                correctAnswerIndex = 3,
                explanation = "Iron is positioned higher in the electrochemical activity series than copper, giving it a higher oxidation potential to displace Cu²⁺ ions.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_019",
                subject = "Chemistry",
                topic = "Organic Chemistry: IUPAC Nomenclature",
                year = "1983",
                questionText = "The correct IUPAC name of the compound with structural formula C₂H₅-C(CH₃)=CH₂ is:",
                optionA = "2-methylbut-1-ene",
                optionB = "2-methylbut-2-ene",
                optionC = "3-methylbut-1-ene",
                optionD = "2-methylprop-1-ene",
                correctAnswerIndex = 0,
                explanation = "The longest continuous chain containing the double bond has 4 carbons (butene), numbered from the double bond end: C1=C2(CH₃)-C3H₂-C4H₃, giving 2-methylbut-1-ene.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_021",
                subject = "Chemistry",
                topic = "Non-Metals: Sulphur Compounds",
                year = "1983",
                questionText = "A piece of burning sulphur continues to burn in a gas jar of oxygen giving misty fumes which readily dissolve in water. The resulting liquid is:",
                optionA = "sulphur (VI) trioxide",
                optionB = "tetraoxosulphate (VI) acid",
                optionC = "trioxosulphate (IV) acid",
                optionD = "dioxosulphate (II) acid",
                correctAnswerIndex = 2,
                explanation = "Burning sulphur in oxygen yields sulphur dioxide gas (SO₂). When SO₂ dissolves in water, it forms trioxosulphate (IV) acid (sulphurous acid, H₂SO₃).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_022",
                subject = "Chemistry",
                topic = "Salts: Efflorescence",
                year = "1983",
                questionText = "Sodium decahydrate (Na₂SO₄·10H₂O) on exposure to air loses all its water of crystallization. The process of loss is known as:",
                optionA = "Efflorescence",
                optionB = "Hygroscopy",
                optionC = "Deliquescence",
                optionD = "Effervescence",
                correctAnswerIndex = 0,
                explanation = "Efflorescence is the spontaneous loss of water of crystallization from hydrated salt crystals into the surrounding atmosphere.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1983_023",
                subject = "Chemistry",
                topic = "Electrochemistry: Molten NaCl",
                year = "1983",
                questionText = "Which of the following processes occurs during the electrolysis of molten sodium chloride?",
                optionA = "Sodium ion loses an electron",
                optionB = "Chlorine atom gains an electron",
                optionC = "Chloride ion gains an electron",
                optionD = "Chloride ion is oxidized",
                correctAnswerIndex = 3,
                explanation = "At the anode, chloride ions (Cl⁻) migrate and undergo oxidation by losing electrons to form chlorine gas (2Cl⁻ → Cl₂ + 2e⁻).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1983 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1984_001",
                subject = "Chemistry",
                topic = "Separation Techniques: Evaporation",
                year = "1984",
                questionText = "Sodium chloride may be obtained from brine by:",
                optionA = "titration",
                optionB = "decantation",
                optionC = "distillation",
                optionD = "evaporation",
                correctAnswerIndex = 3,
                explanation = "Evaporation drives off water vapor from brine, leaving behind crystallized sodium chloride solute.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1984 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1984_003",
                subject = "Chemistry",
                topic = "Gas Stoichiometry: Decomposition",
                year = "1984",
                questionText = "For the reaction NH₄NO₂ → N₂ + 2H₂O, calculate the volume of nitrogen produced at S.T.P. from 3.20 g of the salt. [N=14, O=16, H=1, Molar Volume = 22.4 dm³]",
                optionA = "2.24 dm³",
                optionB = "2.24 cm³",
                optionC = "1.12 cm³",
                optionD = "1.12 dm³",
                correctAnswerIndex = 3,
                explanation = "Molar mass of NH₄NO₂ = 64 g/mol. Moles of salt = 3.20 / 64 = 0.05 mol. Stoichiometric ratio of salt to N₂ is 1:1, so volume of N₂ = 0.05 * 22.4 = 1.12 dm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1984 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1984_004",
                subject = "Chemistry",
                topic = "Chemical Equations: Balancing",
                year = "1984",
                questionText = "Manganese (IV) oxide reacts with concentrated hydrochloric acid according to: MnO₂ + xHCl → MnCl₂ + Cl₂ + yH₂O. The values of x and y are:",
                optionA = "2 and 5 respectively",
                optionB = "2 and 4 respectively",
                optionC = "4 and 2 respectively",
                optionD = "4 and 1 respectively",
                correctAnswerIndex = 2,
                explanation = "Balancing the equation gives: MnO₂ + 4HCl → MnCl₂ + Cl₂ + 2H₂O. Thus x = 4 and y = 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1984 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "chem_vol3_1984_005",
                subject = "Chemistry",
                topic = "Volumetric Analysis: Molar Solution",
                year = "1984",
                questionText = "A 1.0 molar solution of caustic soda (NaOH) is prepared by dissolving: [Na=23, O=16, H=1]",
                optionA = "40 g NaOH in 100 g of water",
                optionB = "40 g NaOH in 1000 g of water",
                optionC = "20 g NaOH in 500 cm³ of solution",
                optionD = "20 g NaOH in 1000 cm³ of solution",
                correctAnswerIndex = 2,
                explanation = "A 1.0 M NaOH solution contains 40 g (1.0 mol) in 1000 cm³ of solution. Dissolving 20 g in 500 cm³ produces the exact same 1.0 M concentration.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Chemistry 1984 • Q5"
            )
        )

        // =========================================================================
        // 5. BIOLOGY (20 Questions)
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "bio_vol3_1983_022",
                subject = "Biology",
                topic = "Microbiology & Pathology: Pathogens",
                year = "1983",
                questionText = "Which of the following diseases is NOT caused by a virus?",
                optionA = "Rinderpest",
                optionB = "Maize rust",
                optionC = "Newcastle disease",
                optionD = "Cassava mosaic disease",
                correctAnswerIndex = 1,
                explanation = "Maize rust is caused by the pathogenic fungus Puccinia sorghi, whereas rinderpest, Newcastle disease, and cassava mosaic are viral.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1983_023",
                subject = "Biology",
                topic = "Invertebrates: Myriapoda",
                year = "1983",
                questionText = "A centipede differs structurally from a millipede by possessing:",
                optionA = "numerous abdominal segments",
                optionB = "one pair of legs per abdominal segment",
                optionC = "two pairs of legs per abdominal segment",
                optionD = "poison claws and one pair of legs per segment",
                correctAnswerIndex = 1,
                explanation = "Centipedes (Chilopoda) have exactly one pair of legs per segment and are carnivorous, while millipedes (Diplopoda) have two pairs per segment.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1983_048",
                subject = "Biology",
                topic = "Excretion & Physiology: Urea Synthesis",
                year = "1983",
                questionText = "In the human body, urea is synthesized primarily in the:",
                optionA = "liver",
                optionB = "urinary bladder",
                optionC = "spleen",
                optionD = "kidneys",
                correctAnswerIndex = 0,
                explanation = "Urea is synthesized in the liver from excess deaminated amino acids and toxic ammonia via the ornithine urea cycle, before being transported to the kidneys for filtration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q48"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1983_049",
                subject = "Biology",
                topic = "Genetics: Mendelian Inheritance",
                year = "1983",
                questionText = "What is the phenotypic ratio of the F₂ generation when heterozygous members of the F₁ generation (Tt) are allowed to self-pollinate?",
                optionA = "1 tall : 3 short",
                optionB = "3 tall : 1 short",
                optionC = "1 tall : 1 short",
                optionD = "4 tall : 0 short",
                correctAnswerIndex = 1,
                explanation = "A monohybrid cross (Tt x Tt) yields offspring in the genotypic ratio 1 TT : 2 Tt : 1 tt, resulting in a 3 dominant (tall) to 1 recessive (short) phenotypic ratio.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q49"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1983_050",
                subject = "Biology",
                topic = "Circulatory System: Hepatic Portal System",
                year = "1983",
                questionText = "The correct anatomical pathway taken by absorbed glucose from the ileum to the heart is:",
                optionA = "ileum → hepatic portal vein → hepatic artery → vena cava → heart",
                optionB = "ileum → hepatic portal artery → hepatic artery → vena cava → heart",
                optionC = "ileum → hepatic portal vein → vena cava → heart",
                optionD = "ileum → hepatic portal vein → hepatic vein → vena cava → heart",
                correctAnswerIndex = 3,
                explanation = "Glucose is absorbed into villi capillaries, enters the hepatic portal vein to the liver, exits via the hepatic vein into the inferior vena cava, and enters the right atrium of the heart.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1983 • Q50"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1984_022",
                subject = "Biology",
                topic = "Digestive System: Pancreatic Enzymes",
                year = "1984",
                questionText = "The surgical removal of a human pancreas impairs the digestion of:",
                optionA = "starch only",
                optionB = "starch, proteins and fats",
                optionC = "oils and fats only",
                optionD = "proteins only",
                correctAnswerIndex = 1,
                explanation = "The exocrine pancreas secretes pancreatic amylase (carbohydrates), trypsin/chymotrypsin (proteins), and lipase (lipids/fats). Removing it impairs digestion of all three.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1984 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1984_023",
                subject = "Biology",
                topic = "Parasitology: Platyhelminthes",
                year = "1984",
                questionText = "The anatomical structures used by a tapeworm (Taenia) to fasten itself to the host's intestinal mucosa are:",
                optionA = "neck and suckers",
                optionB = "hooks and suckers",
                optionC = "rostellum and body segments",
                optionD = "neck and hooks",
                correctAnswerIndex = 1,
                explanation = "The scolex (head) of a tapeworm possesses chitinous hooks and muscular suckers that anchor the parasite firmly to the host's intestinal wall.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1984 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1984_040",
                subject = "Biology",
                topic = "Circulatory System: Blood Clotting",
                year = "1984",
                questionText = "Which sequence correctly represents the cascade of blood clotting? (1) Fibrin forms a mesh of threads, (2) Red blood cells are caught and a clot is formed, (3) Fibrinogen in plasma changes into insoluble fibrin, (4) Blood is exposed to air.",
                optionA = "4, 3, 2, 1",
                optionB = "4, 3, 1, 2",
                optionC = "3, 1, 4, 2",
                optionD = "1, 2, 3, 4",
                correctAnswerIndex = 1,
                explanation = "Exposure to air/tissue factor (4) activates thrombin which converts soluble fibrinogen into insoluble fibrin (3), forming a network of threads (1) that traps blood cells to form a clot (2).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1984 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1985_024",
                subject = "Biology",
                topic = "Excretion: Kidney Nephron Function",
                year = "1985",
                questionText = "The primary physiological function of the loop of Henle in the mammalian nephron is to:",
                optionA = "increase the total flow of urine",
                optionB = "concentrate amino acids in urine",
                optionC = "concentrate sodium chloride in the medulla of the kidney",
                optionD = "increase the overall volume of urine",
                correctAnswerIndex = 2,
                explanation = "The loop of Henle acts as a countercurrent multiplier system, generating a high hypertonic gradient of NaCl and urea in the renal medulla to facilitate water reabsorption.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1985 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1985_022",
                subject = "Biology",
                topic = "Dentition & Anatomy: Tooth Structure",
                year = "1985",
                questionText = "The external crown of a mammalian tooth is covered by an extremely hard mineralized layer called:",
                optionA = "cement",
                optionB = "dentine",
                optionC = "caries",
                optionD = "enamel",
                correctAnswerIndex = 3,
                explanation = "Enamel is the hardest biological substance in the mammalian body, covering and protecting the exposed crown of the tooth.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1985 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1985_023",
                subject = "Biology",
                topic = "Cellular Respiration: Anaerobic Glycolysis",
                year = "1985",
                questionText = "In living muscle cells, insufficient oxygen during vigorous activity causes glucose to break down into:",
                optionA = "fatty acids",
                optionB = "lactic acid",
                optionC = "glycogen",
                optionD = "carbon dioxide and water",
                correctAnswerIndex = 1,
                explanation = "Under anaerobic conditions (oxygen debt), muscle cells undergo anaerobic glycolysis, converting pyruvate into lactic acid to regenerate NAD⁺.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1985 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1985_024b",
                subject = "Biology",
                topic = "Plant Physiology: Transpiration",
                year = "1985",
                questionText = "Which of the following environmental factors will bring about the greatest increase in the rate of transpiration in plants?",
                optionA = "Increased atmospheric humidity",
                optionB = "Reduced temperature",
                optionC = "Reduced wind speed",
                optionD = "Reduced atmospheric humidity",
                correctAnswerIndex = 3,
                explanation = "Low relative humidity steepens the water vapor diffusion gradient between the stomatal substomatal cavities and the dry atmosphere, accelerating transpiration.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1985 • Q24b"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1986_021",
                subject = "Biology",
                topic = "Biochemical Tests: Food Nutrients",
                year = "1986",
                questionText = "A food substance which when mixed with sodium hydroxide and copper sulphate turns violet/purple indicates the presence of:",
                optionA = "protein",
                optionB = "carbohydrates",
                optionC = "fats",
                optionD = "reducing sugar",
                correctAnswerIndex = 0,
                explanation = "This is the Biuret test for proteins: peptide bonds react with Cu²⁺ ions in an alkaline medium to produce a characteristic violet/purple coordination complex.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1986 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1986_022",
                subject = "Biology",
                topic = "Nutrition & Energetics: Calorific Value",
                year = "1986",
                questionText = "The greatest amount of energy (ATP) will be obtained by the complete cellular oxidation of 100g of:",
                optionA = "lean meat",
                optionB = "butter",
                optionC = "refined sugar",
                optionD = "biscuits",
                correctAnswerIndex = 1,
                explanation = "Fats/lipids (butter) yield approximately 9 kcal/g (37 kJ/g) upon oxidation, more than double the energy released by carbohydrates (4 kcal/g) or proteins (4 kcal/g).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1986 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1986_023",
                subject = "Biology",
                topic = "Circulatory System: Cardiac Anatomy",
                year = "1986",
                questionText = "The chamber of the mammalian heart with the thickest muscular wall is the:",
                optionA = "right ventricle",
                optionB = "left auricle",
                optionC = "right auricle",
                optionD = "left ventricle",
                correctAnswerIndex = 3,
                explanation = "The left ventricle possesses the thickest myocardium because it must generate high systemic pressure to pump oxygenated blood throughout the entire body.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1986 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_1986_024",
                subject = "Biology",
                topic = "Circulatory System: Serum vs Plasma",
                year = "1986",
                questionText = "Serum differs compositionally from blood plasma because serum:",
                optionA = "contains blood cells and fibrinogen",
                optionB = "contains soluble nutrients and minerals",
                optionC = "lacks fibrinogen and clotting factors",
                optionD = "lacks antibodies",
                correctAnswerIndex = 2,
                explanation = "Serum is the clear fluid remaining after blood has fully clotted; it contains electrolytes and antibodies but lacks fibrinogen and clotting proteins consumed in clot formation.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 1986 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_2012_020",
                subject = "Biology",
                topic = "Sensory Organs & Adaptations",
                year = "2012",
                questionText = "The sensory organs most useful to giant African pouched rats in navigating underground tunnels in total darkness are:",
                optionA = "nostrils",
                optionB = "eyes",
                optionC = "vibrissae (tactile whiskers)",
                optionD = "tails",
                correctAnswerIndex = 2,
                explanation = "Vibrissae (whiskers) are highly sensitive tactile sensory hairs rich in mechanoreceptors that allow burrowing rodents to navigate in dark subterranean tunnels.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_2012_021",
                subject = "Biology",
                topic = "Ecology: Soil Water Content Calculation",
                year = "2012",
                questionText = "A crucible of 5g weighed 10g after filling with fresh soil. It is heated in an oven at 100°C for 1 hour. After cooling, the weight was 8g. The percentage of water in the soil is:",
                optionA = "8%",
                optionB = "20%",
                optionC = "40%",
                optionD = "60%",
                correctAnswerIndex = 2,
                explanation = "Mass of fresh soil = 10 - 5 = 5g. Mass of dry soil = 8 - 5 = 3g. Mass of water evaporated = 5 - 3 = 2g. Percentage of water = (2 / 5) * 100% = 40%.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_2012_022",
                subject = "Biology",
                topic = "Plant Excretion & Industrial Uses",
                year = "2012",
                questionText = "The secondary metabolic waste product of plants used in the commercial tanning of animal hides into leather is:",
                optionA = "alkaloid",
                optionB = "resin",
                optionC = "tannin",
                optionD = "latex",
                correctAnswerIndex = 2,
                explanation = "Tannins are astringent polyphenolic plant compounds used in the leather industry to precipitate gelatin and cross-link collagen proteins in animal skins.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2012 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "bio_vol3_2011_021",
                subject = "Biology",
                topic = "Excretion: Pathology & Oedema",
                year = "2011",
                questionText = "In humans, generalized puffiness and fluid retention (oedema) across body tissues is a classic clinical symptom of:",
                optionA = "urinary bladder malfunction",
                optionB = "poor digestion",
                optionC = "kidney malfunction",
                optionD = "obesity",
                correctAnswerIndex = 2,
                explanation = "Renal failure/kidney malfunction reduces glomerular filtration and salt excretion, causing systemic fluid retention and tissue oedema (puffiness).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Biology 2011 • Q21"
            )
        )

        return list
    }
}
