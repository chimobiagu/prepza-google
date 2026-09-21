package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB Mathematics Past Questions - Master Bank Part 1 (1983 - 1988 Series).
 * Standardized 4-option format, balanced answer keys, and detailed pedagogical explanations.
 */
object JambMathematicsMasterPart1QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1983 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1983_001",
                subject = "Mathematics",
                topic = "Statistics: Measures of Central Tendency",
                year = "1983",
                questionText = "If M represents the median and D the mode of the measurements 5, 9, 3, 5, 8 then (M, D) is",
                optionA = "(6, 5)",
                optionB = "(5, 8)",
                optionC = "(5, 7)",
                optionD = "(5, 5)",
                correctAnswerIndex = 3,
                explanation = "Arranging the measurements in ascending order: 3, 5, 5, 8, 9. The median (middle term) M is 5, and the mode (most frequent term) D is 5. Therefore, (M, D) is (5, 5).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_002",
                subject = "Mathematics",
                topic = "Ratios and Proportions",
                year = "1983",
                questionText = "A construction company is owned by two partners X and Y and it is agreed that their profit will be divided in the ratio 4:5. At the end of the year, Y received ₦5,000 more than X. What is the total profit of the company for the year?",
                optionA = "₦20,000.00",
                optionB = "₦25,000.00",
                optionC = "₦30,000.00",
                optionD = "₦45,000.00",
                correctAnswerIndex = 3,
                explanation = "Let the total profit be P. X's share = (4/9)P and Y's share = (5/9)P. The difference is (5/9)P - (4/9)P = (1/9)P = 5,000. Solving for P gives P = 5,000 * 9 = ₦45,000.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_003",
                subject = "Mathematics",
                topic = "Polygons and Plane Geometry",
                year = "1983",
                questionText = "Given a regular hexagon, calculate each interior angle of the hexagon.",
                optionA = "60°",
                optionB = "30°",
                optionC = "120°",
                optionD = "135°",
                correctAnswerIndex = 2,
                explanation = "The sum of the interior angles of a regular n-sided polygon is given by (n - 2) * 180°. For a hexagon (n = 6), the sum is 4 * 180° = 720°. Each interior angle is 720° / 6 = 120°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_004",
                subject = "Mathematics",
                topic = "Simultaneous Linear Equations",
                year = "1983",
                questionText = "Solve the simultaneous equations: 4x - 3 = 3x + y = 2y + 5x - 12",
                optionA = "x = 5, y = 2",
                optionB = "x = 2, y = 5",
                optionC = "x = -2, y = -5",
                optionD = "x = 5, y = -2",
                correctAnswerIndex = 0,
                explanation = "From 4x - 3 = 3x + y, we get y = x - 3. Substituting this into 3x + y = 2y + 5x - 12 gives 3x + (x - 3) = 2(x - 3) + 5x - 12 => 4x - 3 = 7x - 18 => 3x = 15 => x = 5. Thus, y = 5 - 3 = 2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_005",
                subject = "Mathematics",
                topic = "Polynomials: Factor & Remainder Theorem",
                year = "1983",
                questionText = "If x = 1 is a root of the equation x³ - 2x² - 5x + 6 = 0, find the other roots.",
                optionA = "-3 and 2",
                optionB = "-2 and 2",
                optionC = "3 and -2",
                optionD = "1 and 3",
                correctAnswerIndex = 2,
                explanation = "Since x = 1 is a root, (x - 1) is a factor. Dividing the polynomial x³ - 2x² - 5x + 6 by (x - 1) yields x² - x - 6 = (x - 3)(x + 2) = 0. Thus, the other roots are 3 and -2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_006",
                subject = "Mathematics",
                topic = "Theory of Variation",
                year = "1983",
                questionText = "If x is jointly proportional to the cube of y and the fourth power of z, in what ratio is x increased or decreased when y is halved and z is doubled?",
                optionA = "4:1 increase",
                optionB = "2:1 increase",
                optionC = "1:4 decrease",
                optionD = "1:1 no change",
                correctAnswerIndex = 1,
                explanation = "x = k * y³ * z⁴. When y' = y/2 and z' = 2z, the new value x' = k * (y/2)³ * (2z)⁴ = k * (y³/8) * 16z⁴ = 2 * (k * y³ * z⁴) = 2x. Thus, x is increased in a 2:1 ratio.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_007",
                subject = "Mathematics",
                topic = "Trigonometry and Right-Angled Triangles",
                year = "1983",
                questionText = "In right-angled triangle PQR, ∠PQR = 60°, ∠QPR = 90°, ∠PRS = 90°, ∠RPS = 45°, and QR = 8cm. Determine the length of PS.",
                optionA = "2√3 cm",
                optionB = "4√6 cm",
                optionC = "8√6 cm",
                optionD = "8 cm",
                correctAnswerIndex = 1,
                explanation = "In right triangle PQR (at P), PR = QR * sin(60°) = 8 * (√3/2) = 4√3 cm. In right triangle PRS (at R), PS = PR / cos(45°) = 4√3 / (1/√2) = 4√6 cm.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_010",
                subject = "Mathematics",
                topic = "Polynomials: Factor Theorem",
                year = "1983",
                questionText = "If x + 2 and x - 1 are factors of the expression lx³ + 2kx² + 24, find the values of l and k.",
                optionA = "l = -6, k = -9",
                optionB = "l = -2, k = 1",
                optionC = "l = -2, k = -1",
                optionD = "l = 6, k = 0",
                correctAnswerIndex = 0,
                explanation = "Applying factor theorem: at x = -2: l(-8) + 2k(4) + 24 = 0 => -8l + 8k = -24 => -l + k = -3. At x = 1: l(1) + 2k(1) + 24 = 0 => l + 2k = -24. Adding both equations gives 3k = -27 => k = -9. Substituting gives l = -6.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_012",
                subject = "Mathematics",
                topic = "Statistics: Pie Charts",
                year = "1983",
                questionText = "In a class of 60 pupils, the distribution of subjects is represented in a pie chart: Additional Mathematics (2x - 24)°, Biology (3x - 18)°, Geography (x + 12)°, French (2x + 12)°, History x°. How many pupils offer Additional Mathematics?",
                optionA = "15",
                optionB = "10",
                optionC = "18",
                optionD = "12",
                correctAnswerIndex = 1,
                explanation = "Sum of angles in a pie chart: (2x - 24) + (3x - 18) + (x + 12) + (2x + 12) + x = 360° => 9x - 18 = 360° => 9x = 378° => x = 42°. Additional Mathematics sector = 2(42) - 24 = 60°. Number of pupils = (60° / 360°) * 60 = 10 pupils.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_015",
                subject = "Mathematics",
                topic = "Algebraic Fractions: Simplification",
                year = "1983",
                questionText = "Simplify: [(x - 7) / (x² - 9)] * [(x² - 3x) / (x² - 49)]",
                optionA = "x / ((x - 3)(x + 7))",
                optionB = "(x + 3)(x + 7) / x",
                optionC = "x / ((x - 3)(x - 7))",
                optionD = "x / ((x + 3)(x + 7))",
                correctAnswerIndex = 3,
                explanation = "Factorizing: [(x - 7) / ((x - 3)(x + 3))] * [x(x - 3) / ((x - 7)(x + 7))]. Canceling common factors (x - 7) and (x - 3) leaves x / ((x + 3)(x + 7)).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_016",
                subject = "Mathematics",
                topic = "Pythagoras Theorem and Quadratic Equations",
                year = "1983",
                questionText = "The lengths of the sides of a right-angled triangle are (3x + 1)cm, (3x - 1)cm and x cm. Find x.",
                optionA = "2",
                optionB = "6",
                optionC = "18",
                optionD = "12",
                correctAnswerIndex = 3,
                explanation = "By Pythagoras' theorem: (3x + 1)² = (3x - 1)² + x² => 9x² + 6x + 1 = 9x² - 6x + 1 + x² => 12x = x². Since x > 0, dividing by x gives x = 12.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_017",
                subject = "Mathematics",
                topic = "Statistics: Median of Raw Data",
                year = "1983",
                questionText = "The scores of a set of final year students in a paper are: 41, 29, 55, 21, 47, 70, 70, 40, 43, 56, 73, 23, 50, 50. Find the median of the scores.",
                optionA = "47",
                optionB = "48.5",
                optionC = "50",
                optionD = "43",
                correctAnswerIndex = 1,
                explanation = "Arranging the 14 scores in ascending order: 21, 23, 29, 40, 41, 43, 47, 50, 50, 55, 56, 70, 70, 73. The two middle values (7th and 8th) are 47 and 50. The median is (47 + 50) / 2 = 48.5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_025",
                subject = "Mathematics",
                topic = "Functions and Relations",
                year = "1983",
                questionText = "Find the missing value y in the evaluation table for y = x³ - x + 3 when x = -1.",
                optionA = "-3",
                optionB = "3",
                optionC = "-9",
                optionD = "13",
                correctAnswerIndex = 1,
                explanation = "Substitute x = -1 into y = x³ - x + 3: y = (-1)³ - (-1) + 3 = -1 + 1 + 3 = 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_027",
                subject = "Mathematics",
                topic = "Statistics: Sectorial Angles",
                year = "1983",
                questionText = "Find the angles of the sectors representing each item in a pie chart for the data: 6, 10, 14, 16, 26.",
                optionA = "15°, 25°, 35°, 40°, 65°",
                optionB = "60°, 100°, 140°, 160°, 260°",
                optionC = "30°, 50°, 70°, 80°, 130°",
                optionD = "6°, 10°, 14°, 16°, 26°",
                correctAnswerIndex = 2,
                explanation = "Total sum = 6 + 10 + 14 + 16 + 26 = 72. Sectorial angle factor = 360° / 72 = 5° per unit. Multiplying each value by 5° gives 30°, 50°, 70°, 80°, 130°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_028",
                subject = "Mathematics",
                topic = "Statistics: Mean, Median and Mode",
                year = "1983",
                questionText = "The scores of 16 students in a Mathematics test are: 65, 65, 55, 60, 60, 65, 60, 70, 75, 70, 65, 70, 60, 65, 65, 70. What is the sum of the median and modal scores?",
                optionA = "125",
                optionB = "130",
                optionC = "140",
                optionD = "150",
                correctAnswerIndex = 1,
                explanation = "Mode: 65 occurs 6 times (most frequent), so Mode = 65. Ordered scores: 55, 60, 60, 60, 60, 65, 65, 65, 65, 65, 65, 70, 70, 70, 70, 75. Middle values (8th and 9th) are 65 and 65, so Median = 65. Sum = 65 + 65 = 130.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_029",
                subject = "Mathematics",
                topic = "Probability Theory",
                year = "1983",
                questionText = "The letters of the word MATRICULATION are cut and placed in a box. If one letter is drawn at random, find the probability of drawing a vowel.",
                optionA = "2/13",
                optionB = "5/13",
                optionC = "6/13",
                optionD = "8/13",
                correctAnswerIndex = 2,
                explanation = "Total letters in MATRICULATION = 13. The vowels are A, I, U, A, I, O (6 vowels). Thus, Probability = 6/13.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_031",
                subject = "Mathematics",
                topic = "Approximation and Percentage Error",
                year = "1983",
                questionText = "If a rod of length 250cm is measured as 255cm in error, what is the percentage error in measurement?",
                optionA = "5%",
                optionB = "2%",
                optionC = "4%",
                optionD = "10%",
                correctAnswerIndex = 1,
                explanation = "Error = 255 - 250 = 5cm. Percentage error = (Error / True value) * 100% = (5 / 250) * 100% = 2%.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_032",
                subject = "Mathematics",
                topic = "Indices and Exponential Equations",
                year = "1983",
                questionText = "If (2/3)ᵐ * (3/4)ⁿ = 256/729, find the values of m and n.",
                optionA = "m = 4, n = 2",
                optionB = "m = -4, n = -2",
                optionC = "m = -4, n = 2",
                optionD = "m = 4, n = -2",
                correctAnswerIndex = 3,
                explanation = "Expressing in prime bases 2 and 3: 256/729 = 2⁸ / 3⁶ = 2⁸ * 3⁻⁶. LHS = 2ᵐ * 3⁻ᵐ * 3ⁿ * 2⁻²ⁿ = 2^(m - 2n) * 3^(n - m). Equating exponents: m - 2n = 8 and n - m = -6 => n = m - 6. Substituting gives m - 2(m - 6) = 8 => -m + 12 = 8 => m = 4. Then n = 4 - 6 = -2.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_033",
                subject = "Mathematics",
                topic = "Logarithms",
                year = "1983",
                questionText = "Without using tables, find the numerical value of log₇ 49 + log₇ (1/7).",
                optionA = "5",
                optionB = "10",
                optionC = "2",
                optionD = "1",
                correctAnswerIndex = 3,
                explanation = "log₇ 49 = log₇ (7²) = 2. log₇ (1/7) = log₇ (7⁻¹) = -1. Therefore, 2 + (-1) = 1.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1983_035",
                subject = "Mathematics",
                topic = "Polygons and Interior Angles",
                year = "1983",
                questionText = "One interior angle of a convex hexagon is 170° and each of the remaining five interior angles is equal to x°. Find x.",
                optionA = "120°",
                optionB = "110°",
                optionC = "105°",
                optionD = "100°",
                correctAnswerIndex = 1,
                explanation = "Sum of interior angles of a hexagon (n = 6) is (6 - 2) * 180° = 720°. Sum of angles: 170° + 5x° = 720° => 5x = 550 => x = 110°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q35"
            )
        )

        // =========================================================================
        // 1984 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1984_001",
                subject = "Mathematics",
                topic = "Fractions and Order of Operations (BODMAS)",
                year = "1984",
                questionText = "Simplify: (2/3 - 1/5) / (1/3 of 2/5)",
                optionA = "1/7",
                optionB = "7/2",
                optionC = "1/3",
                optionD = "3",
                correctAnswerIndex = 1,
                explanation = "Numerator: 2/3 - 1/5 = (10 - 3) / 15 = 7/15. Denominator: 1/3 of 2/5 = 2/15. Division: (7/15) / (2/15) = 7/2 = 3.5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_002",
                subject = "Mathematics",
                topic = "Number Bases",
                year = "1984",
                questionText = "If 263 + 441 = 714, what number base has been used?",
                optionA = "12",
                optionB = "11",
                optionC = "10",
                optionD = "9",
                correctAnswerIndex = 3,
                explanation = "In base b: (2b² + 6b + 3) + (4b² + 4b + 1) = 7b² + b + 4 => 6b² + 10b + 4 = 7b² + b + 4 => b² - 9b = 0 => b(b - 9) = 0. Since the base must exceed the highest digit 6, b = 9.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_004",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Profit and Loss",
                year = "1984",
                questionText = "P sold his bicycle to Q at a profit of 10%. Q sold it to R for ₦209 at a loss of 5%. How much did the bicycle cost P?",
                optionA = "₦200.00",
                optionB = "₦196.00",
                optionC = "₦180.00",
                optionD = "₦205.00",
                correctAnswerIndex = 0,
                explanation = "Let P's cost be C. Q's cost = 1.10 * C. Q sells to R at 5% loss, so R's cost = 0.95 * (1.10 * C) = 1.045C = ₦209 => C = 209 / 1.045 = ₦200.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_006",
                subject = "Mathematics",
                topic = "Financial Mathematics: Investments & Dividends",
                year = "1984",
                questionText = "A man invested a total of ₦50,000 in two companies paying dividends of 6% and 8% respectively. How much did he invest at 8% if his total annual yield is ₦3,700?",
                optionA = "₦15,000",
                optionB = "₦29,600",
                optionC = "₦21,400",
                optionD = "₦35,000",
                correctAnswerIndex = 3,
                explanation = "Let x be the amount invested at 8%, then (50,000 - x) is invested at 6%. Total yield = 0.08x + 0.06(50,000 - x) = 3,700 => 0.02x + 3,000 = 3,700 => 0.02x = 700 => x = ₦35,000.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_007",
                subject = "Mathematics",
                topic = "Statistics: Combined Mean",
                year = "1984",
                questionText = "Thirty boys and x girls sat for a test. The mean of the boys' scores and that of the girls were respectively 6 and 8. Find x if the total score was 468.",
                optionA = "38",
                optionB = "24",
                optionC = "36",
                optionD = "22",
                correctAnswerIndex = 2,
                explanation = "Total boys' score = 30 * 6 = 180. Total girls' score = 8x. Total overall score = 180 + 8x = 468 => 8x = 288 => x = 36.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_008",
                subject = "Mathematics",
                topic = "Statistics: Sectorial Angles",
                year = "1984",
                questionText = "The cost of production of an article is made up of: Labour ₦70, Power ₦15, Materials ₦30, Miscellaneous ₦5. Find the angle of the sector representing labour in a pie chart.",
                optionA = "210°",
                optionB = "105°",
                optionC = "175°",
                optionD = "150°",
                correctAnswerIndex = 0,
                explanation = "Total cost = 70 + 15 + 30 + 5 = ₦120. Angle for Labour = (70 / 120) * 360° = 70 * 3 = 210°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_009",
                subject = "Mathematics",
                topic = "Probability: Arithmetic Progressions",
                year = "1984",
                questionText = "Bola chooses at random a number between 1 and 300 inclusive. What is the probability that the number is divisible by 4?",
                optionA = "1/3",
                optionB = "1/4",
                optionC = "1/5",
                optionD = "1/6",
                correctAnswerIndex = 1,
                explanation = "Numbers divisible by 4 from 1 to 300 are 4, 8, ..., 300. Total such numbers = 300 / 4 = 75. Probability = 75 / 300 = 1/4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_010",
                subject = "Mathematics",
                topic = "Logarithms",
                year = "1984",
                questionText = "Evaluate log₃ (1/81).",
                optionA = "4",
                optionB = "-4",
                optionC = "-3/2",
                optionD = "7/3",
                correctAnswerIndex = 1,
                explanation = "1/81 = 3⁻⁴. Therefore, log₃ (1/81) = log₃ (3⁻⁴) = -4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_011",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Linear Equations",
                year = "1984",
                questionText = "A variable point P(x, y) traces a graph in a 2D plane passing through (0, -3). If x increases by 1 unit whenever y increases by 4 units, find the equation of the graph.",
                optionA = "-3 = y + 4x + 1",
                optionB = "4y = -3 + x",
                optionC = "y + 3 = 4x",
                optionD = "4y = x + 3",
                correctAnswerIndex = 2,
                explanation = "Slope m = Δy / Δx = 4 / 1 = 4. Y-intercept c = -3. Equation is y = mx + c => y = 4x - 3 => y + 3 = 4x.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_015",
                subject = "Mathematics",
                topic = "Joint and Inverse Variation",
                year = "1984",
                questionText = "p varies directly as the square of q and inversely as r. If p = 36 when q = 3 and r = 4, find p when q = 5 and r = 2.",
                optionA = "72",
                optionB = "100",
                optionC = "90",
                optionD = "200",
                correctAnswerIndex = 3,
                explanation = "p = k * q² / r. Using first values: 36 = k * (3²) / 4 => 36 = 9k/4 => k = 16. When q = 5 and r = 2: p = 16 * (5²) / 2 = 16 * 25 / 2 = 8 * 25 = 200.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_016",
                subject = "Mathematics",
                topic = "Algebraic Factorization",
                year = "1984",
                questionText = "Factorise: 6x² - 14x - 12",
                optionA = "2(x + 3)(3x - 2)",
                optionB = "6(x - 2)(x + 1)",
                optionC = "2(x - 3)(3x + 2)",
                optionD = "6(x + 2)(x - 1)",
                correctAnswerIndex = 2,
                explanation = "6x² - 14x - 12 = 2(3x² - 7x - 6). For 3x² - 7x - 6, factors of (3 * -6 = -18) summing to -7 are -9 and 2: 3x(x - 3) + 2(x - 3) = (x - 3)(3x + 2). Result = 2(x - 3)(3x + 2).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_017",
                subject = "Mathematics",
                topic = "Line and Curve Intersections",
                year = "1984",
                questionText = "A straight line y = mx meets the curve y = x² - 12x + 40 in two distinct points. If one of them is (5, 5), find the other point.",
                optionA = "(5, 6)",
                optionB = "(8, 8)",
                optionC = "(8, 5)",
                optionD = "(7, 7)",
                correctAnswerIndex = 1,
                explanation = "Since (5, 5) lies on y = mx, 5 = m(5) => m = 1, so the line is y = x. At intersections: x = x² - 12x + 40 => x² - 13x + 40 = 0 => (x - 5)(x - 8) = 0 => x = 5 or x = 8. Since y = x, the other point is (8, 8).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_020",
                subject = "Mathematics",
                topic = "Simultaneous Equations",
                year = "1984",
                questionText = "If 2x + 3y = 1 and x - 2y = 11, find the value of (x + y).",
                optionA = "5",
                optionB = "-3",
                optionC = "8",
                optionD = "2",
                correctAnswerIndex = 3,
                explanation = "From second equation: x = 2y + 11. Substitute into first: 2(2y + 11) + 3y = 1 => 7y + 22 = 1 => 7y = -21 => y = -3. Then x = 2(-3) + 11 = 5. Therefore, x + y = 5 + (-3) = 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q20"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_023",
                subject = "Mathematics",
                topic = "Quadratic Equations from Roots",
                year = "1984",
                questionText = "The quadratic equation whose roots are 1 - √13 and 1 + √13 is",
                optionA = "x² + 2x + 12 = 0",
                optionB = "x² - 2x + 12 = 0",
                optionC = "x² + 2x - 12 = 0",
                optionD = "x² - 2x - 12 = 0",
                correctAnswerIndex = 3,
                explanation = "Sum of roots = (1 - √13) + (1 + √13) = 2. Product of roots = (1 - √13)(1 + √13) = 1 - 13 = -12. Equation: x² - (Sum)x + Product = 0 => x² - 2x - 12 = 0.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_029",
                subject = "Mathematics",
                topic = "Trigonometry: Cosine Rule",
                year = "1984",
                questionText = "The sides of a triangle are (x + 4)cm, x cm and (x - 4)cm respectively. If the cosine of the largest angle is 1/5, find the value of x.",
                optionA = "24 cm",
                optionB = "20 cm",
                optionC = "28 cm",
                optionD = "18 cm",
                correctAnswerIndex = 0,
                explanation = "The largest angle is opposite the longest side (x + 4). By Cosine Rule: (x + 4)² = x² + (x - 4)² - 2x(x - 4)(1/5) => x² + 8x + 16 = 2x² - 8x + 16 - (2x² - 8x)/5 => 16x = x² - (2x² - 8x)/5 => 80x = 5x² - 2x² + 8x => 72x = 3x² => 3x = 72 => x = 24 cm.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_033",
                subject = "Mathematics",
                topic = "Inequalities: Integer Solutions",
                year = "1984",
                questionText = "Find the integral values of x which satisfy the inequalities -3 < 2 - 5x < 12.",
                optionA = "-2, -1",
                optionB = "-2, 2",
                optionC = "-1, 0",
                optionD = "1, 2",
                correctAnswerIndex = 2,
                explanation = "Left inequality: -3 < 2 - 5x => 5x < 5 => x < 1. Right inequality: 2 - 5x < 12 => -5x < 10 => x > -2. Combined: -2 < x < 1. The integers in this range are -1 and 0.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1984_040",
                subject = "Mathematics",
                topic = "Probability: Dice Outcomes",
                year = "1984",
                questionText = "Two fair dice are rolled. What is the probability that both show up the same number of points?",
                optionA = "1/36",
                optionB = "7/36",
                optionC = "1/2",
                optionD = "1/6",
                correctAnswerIndex = 3,
                explanation = "Total outcomes = 36. Doublet outcomes where both dice match: (1,1), (2,2), (3,3), (4,4), (5,5), (6,6) (6 outcomes). Probability = 6 / 36 = 1/6.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q40"
            )
        )

        // =========================================================================
        // 1985 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1985_002",
                subject = "Mathematics",
                topic = "Simple Interest",
                year = "1985",
                questionText = "A sum of money was invested at 8% per annum simple interest. If after 4 years the money amounts to ₦330.00, find the amount originally invested.",
                optionA = "₦180.00",
                optionB = "₦200.00",
                optionC = "₦220.00",
                optionD = "₦250.00",
                correctAnswerIndex = 3,
                explanation = "Amount A = P(1 + RT) => 330 = P(1 + 0.08 * 4) => 330 = 1.32P => P = 330 / 1.32 = ₦250.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1985_008",
                subject = "Mathematics",
                topic = "Logarithmic Expressions",
                year = "1985",
                questionText = "Without using tables, evaluate: log₂ 4 + log₄ 2 - log₂₅ 5",
                optionA = "2",
                optionB = "1/2",
                optionC = "0",
                optionD = "1.5",
                correctAnswerIndex = 0,
                explanation = "log₂ 4 = 2. log₄ 2 = log₄ (4^(1/2)) = 1/2. log₂₅ 5 = log₂₅ (25^(1/2)) = 1/2. Thus: 2 + 1/2 - 1/2 = 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1985_010",
                subject = "Mathematics",
                topic = "Logarithmic Equations",
                year = "1985",
                questionText = "Find x if log₉ x = 1.5",
                optionA = "72.0",
                optionB = "27.0",
                optionC = "36.0",
                optionD = "24.5",
                correctAnswerIndex = 1,
                explanation = "By logarithmic definition: x = 9^(1.5) = (3²)^(3/2) = 3³ = 27.0.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1985_018",
                subject = "Mathematics",
                topic = "Indicial Equations",
                year = "1985",
                questionText = "If 3^(2y) - 6(3^y) = 27, find y.",
                optionA = "3",
                optionB = "-1",
                optionC = "2",
                optionD = "1",
                correctAnswerIndex = 2,
                explanation = "Let u = 3^y. Equation is u² - 6u - 27 = 0 => (u - 9)(u + 3) = 0 => u = 9 or u = -3. Since 3^y > 0, 3^y = 9 => y = 2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1985_021",
                subject = "Mathematics",
                topic = "Quadratic Equations: Perfect Squares",
                year = "1985",
                questionText = "If the quadratic function 3x² - 7x + R is a perfect square, find R.",
                optionA = "49/24",
                optionB = "49/3",
                optionC = "49/6",
                optionD = "49/12",
                correctAnswerIndex = 3,
                explanation = "For ax² + bx + c to be a perfect square, the discriminant b² - 4ac must equal 0: (-7)² - 4(3)(R) = 0 => 49 - 12R = 0 => R = 49/12.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1985_029",
                subject = "Mathematics",
                topic = "Pythagoras Theorem: Isosceles Right Triangle",
                year = "1985",
                questionText = "If the hypotenuse of a right-angled isosceles triangle is 2, what is the length of each of the other sides?",
                optionA = "√2",
                optionB = "1/2",
                optionC = "2√2",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "Let the equal sides be s. By Pythagoras' theorem: s² + s² = 2² => 2s² = 4 => s² = 2 => s = √2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1985_030",
                subject = "Mathematics",
                topic = "Probability: Coin Tosses",
                year = "1985",
                questionText = "If two fair coins are tossed, what is the probability of getting at least one head?",
                optionA = "1/4",
                optionB = "1/2",
                optionC = "2/3",
                optionD = "3/4",
                correctAnswerIndex = 3,
                explanation = "Sample space = {HH, HT, TH, TT} (4 outcomes). Favorable outcomes with at least one head = {HH, HT, TH} (3 outcomes). Probability = 3/4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q30"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1985_031",
                subject = "Mathematics",
                topic = "Mensuration: Similar Solids and Volume Ratios",
                year = "1985",
                questionText = "The ratio of the length of two similar rectangular blocks is 2:3. If the volume of the larger block is 351cm³, find the volume of the smaller block.",
                optionA = "234.00 cm³",
                optionB = "526.50 cm³",
                optionC = "166.00 cm³",
                optionD = "104.00 cm³",
                correctAnswerIndex = 3,
                explanation = "Ratio of volumes is the cube of the ratio of linear dimensions: V₁ / V₂ = (2/3)³ = 8 / 27. Given V₂ = 351cm³: V₁ = (8 / 27) * 351 = 8 * 13 = 104.00 cm³.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1985_032",
                subject = "Mathematics",
                topic = "Bearings and Distances",
                year = "1985",
                questionText = "The bearing of a bird on a tree from a hunter on the ground is N72°E. What is the bearing of the hunter from the bird?",
                optionA = "S18°W",
                optionB = "S72°W",
                optionC = "S72°E",
                optionD = "S27°W",
                correctAnswerIndex = 1,
                explanation = "Back bearing reverses North to South and East to West while preserving the angle. Thus, N72°E becomes S72°W.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Q32"
            )
        )

        // =========================================================================
        // 1986 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1986_002",
                subject = "Mathematics",
                topic = "Statistics: Mean Adjustments",
                year = "1986",
                questionText = "If Musa scored 75 in Biology instead of 57, his average mark in four subjects would have been 60. What was his actual total mark?",
                optionA = "282",
                optionB = "240",
                optionC = "222",
                optionD = "210",
                correctAnswerIndex = 2,
                explanation = "Hypothetical total mark = 4 * 60 = 240. The difference between the recorded and actual score is 75 - 57 = 18. Actual total mark = 240 - 18 = 222.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_003",
                subject = "Mathematics",
                topic = "Number Theory: LCM and HCF",
                year = "1986",
                questionText = "Divide the L.C.M. of 48, 64 and 80 by their H.C.F.",
                optionA = "20",
                optionB = "30",
                optionC = "48",
                optionD = "60",
                correctAnswerIndex = 3,
                explanation = "Prime factors: 48 = 2⁴ * 3, 64 = 2⁶, 80 = 2⁴ * 5. L.C.M = 2⁶ * 3 * 5 = 64 * 15 = 960. H.C.F = 2⁴ = 16. Ratio = 960 / 16 = 60.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_004",
                subject = "Mathematics",
                topic = "Number Theory: Perfect Squares",
                year = "1986",
                questionText = "Find the smallest number by which 252 can be multiplied to obtain a perfect square.",
                optionA = "7",
                optionB = "3",
                optionC = "2",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Prime factorization of 252 is 2² * 3² * 7¹. For all exponents to be even in a perfect square, 252 must be multiplied by 7.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_005",
                subject = "Mathematics",
                topic = "Fractions and Reciprocals",
                year = "1986",
                questionText = "Find the reciprocal of: (2/3) / (1/2 + 1/3)",
                optionA = "4/5",
                optionB = "5/4",
                optionC = "2/5",
                optionD = "6/7",
                correctAnswerIndex = 1,
                explanation = "1/2 + 1/3 = 5/6. Now, (2/3) / (5/6) = (2/3) * (6/5) = 4/5. The reciprocal of 4/5 is 5/4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_006",
                subject = "Mathematics",
                topic = "Word Problems and Fractions",
                year = "1986",
                questionText = "Three boys shared some oranges. The first received 1/3 of the oranges, the second received 2/3 of the remainder. If the third boy received the remaining 12 oranges, how many oranges did they share?",
                optionA = "60",
                optionB = "54",
                optionC = "48",
                optionD = "42",
                correctAnswerIndex = 1,
                explanation = "Let total oranges be x. 1st boy gets (1/3)x, leaving (2/3)x. 2nd boy gets 2/3 * (2/3)x = (4/9)x. 3rd boy gets: x - (1/3)x - (4/9)x = (2/9)x = 12 => x = 12 * 9 / 2 = 54.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_010",
                subject = "Mathematics",
                topic = "Ratio and Sharing",
                year = "1986",
                questionText = "A number of pencils were shared among Bisi, Sola and Tunde in the ratio 2:3:5 respectively. If Bisi got 5, how many were shared in total?",
                optionA = "15",
                optionB = "25",
                optionC = "30",
                optionD = "50",
                correctAnswerIndex = 1,
                explanation = "Total parts = 2 + 3 + 5 = 10 parts. Bisi gets 2 parts = 5 pencils => 1 part = 2.5 pencils. Total pencils = 10 parts = 10 * 2.5 = 25 pencils.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_016",
                subject = "Mathematics",
                topic = "Direct Variation",
                year = "1986",
                questionText = "If x varies directly as y³ and x = 2 when y = 1, find x when y = 5.",
                optionA = "2",
                optionB = "10",
                optionC = "125",
                optionD = "250",
                correctAnswerIndex = 3,
                explanation = "x = k * y³. Given x = 2 when y = 1: 2 = k(1³) => k = 2. When y = 5: x = 2 * (5³) = 2 * 125 = 250.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_028",
                subject = "Mathematics",
                topic = "Exponential Equations",
                year = "1986",
                questionText = "Find the values of x which satisfy the equation: 16ˣ - 5(4ˣ) + 4 = 0.",
                optionA = "1 and 4",
                optionB = "-2 and 2",
                optionC = "0 and 1",
                optionD = "-1 and 0",
                correctAnswerIndex = 2,
                explanation = "Let u = 4ˣ. Equation is u² - 5u + 4 = 0 => (u - 1)(u - 4) = 0 => u = 1 or u = 4. Since u = 4ˣ: 4ˣ = 1 => x = 0; 4ˣ = 4 => x = 1. Solutions are x = 0 and x = 1.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_031",
                subject = "Mathematics",
                topic = "Polygons and Exterior Angles",
                year = "1986",
                questionText = "A regular polygon of n sides has each interior angle as 160°. Find n.",
                optionA = "18",
                optionB = "16",
                optionC = "14",
                optionD = "12",
                correctAnswerIndex = 0,
                explanation = "Each exterior angle = 180° - 160° = 20°. Number of sides n = 360° / 20° = 18 sides.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1986_032",
                subject = "Mathematics",
                topic = "Trigonometric Identities",
                year = "1986",
                questionText = "If cos θ = a/b, find 1 + tan² θ.",
                optionA = "b² / a²",
                optionB = "a² / b²",
                optionC = "(a² + b²) / (b² - a²)",
                optionD = "(2a² + b²) / (a² + b²)",
                correctAnswerIndex = 0,
                explanation = "By standard identity: 1 + tan² θ = sec² θ. Since sec θ = 1 / cos θ = b/a, sec² θ = (b/a)² = b² / a².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q32"
            )
        )

        // =========================================================================
        // 1987 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1987_001",
                subject = "Mathematics",
                topic = "Number Base Conversion",
                year = "1987",
                questionText = "Convert 241 in base 5 to base 8.",
                optionA = "71₈",
                optionB = "107₈",
                optionC = "176₈",
                optionD = "241₈",
                correctAnswerIndex = 1,
                explanation = "Convert 241₅ to base 10: 2(5²) + 4(5) + 1 = 50 + 20 + 1 = 71. Convert 71 to base 8: 71 / 8 = 8 R 7; 8 / 8 = 1 R 0; 1 / 8 = 0 R 1. Reading remainders upwards gives 107₈.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_002",
                subject = "Mathematics",
                topic = "LCM of Lengths",
                year = "1987",
                questionText = "Find the least length of a rod which can be cut into exactly equal strips, each of either 40cm or 48cm in length.",
                optionA = "120 cm",
                optionB = "240 cm",
                optionC = "360 cm",
                optionD = "480 cm",
                correctAnswerIndex = 1,
                explanation = "The least length is the LCM of 40 and 48. 40 = 2³ * 5, 48 = 2⁴ * 3. LCM = 2⁴ * 3 * 5 = 16 * 15 = 240 cm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_005",
                subject = "Mathematics",
                topic = "Average Speed and Motion",
                year = "1987",
                questionText = "A train moves from P to Q at an average speed of 90km/hr and returns from Q to P along the same route at 45km/hr. Find the average speed for the entire journey.",
                optionA = "55.00 km/hr",
                optionB = "60.00 km/hr",
                optionC = "67.50 km/hr",
                optionD = "75.00 km/hr",
                correctAnswerIndex = 1,
                explanation = "Average Speed = 2v₁v₂ / (v₁ + v₂) = (2 * 90 * 45) / (90 + 45) = 8100 / 135 = 60.00 km/hr.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_006",
                subject = "Mathematics",
                topic = "Percentages and Area Ratios",
                year = "1987",
                questionText = "If the length of a square is increased by 20% while its width is decreased by 20% to form a rectangle, what is the ratio of the area of the rectangle to the area of the square?",
                optionA = "6:5",
                optionB = "25:24",
                optionC = "24:25",
                optionD = "1:1",
                correctAnswerIndex = 2,
                explanation = "Let the side of the square be s. Area of square = s². Rectangle length = 1.2s, width = 0.8s. Area of rectangle = 1.2s * 0.8s = 0.96s². Ratio = 0.96s² / s² = 96 / 100 = 24/25.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_009",
                subject = "Mathematics",
                topic = "Simple Interest: Principal Calculation",
                year = "1987",
                questionText = "A man invests a sum of money at 4% per annum simple interest. After 3 years, the principal amounts to ₦7,000.00. Find the sum invested.",
                optionA = "₦7,840.00",
                optionB = "₦6,250.00",
                optionC = "₦6,160.00",
                optionD = "₦5,833.33",
                correctAnswerIndex = 1,
                explanation = "A = P(1 + RT) => 7000 = P(1 + 0.04 * 3) => 7000 = 1.12P => P = 7000 / 1.12 = ₦6,250.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_014",
                subject = "Mathematics",
                topic = "Logarithmic Simplification",
                year = "1987",
                questionText = "Simplify without using tables: (log₂ 6 - log₂ 3) / (log₂ 8 - 2log₂ (1/2))",
                optionA = "1/5",
                optionB = "1/2",
                optionC = "-1/2",
                optionD = "1",
                correctAnswerIndex = 0,
                explanation = "Numerator: log₂ 6 - log₂ 3 = log₂ (6/3) = log₂ 2 = 1. Denominator: log₂ 8 - 2log₂ (1/2) = 3 - 2(-1) = 3 + 2 = 5. Result = 1/5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_019",
                subject = "Mathematics",
                topic = "Compound Variation",
                year = "1987",
                questionText = "If P varies inversely as V and V varies directly as R², find the relationship between P and R given that R = 7 when P = 2.",
                optionA = "P = 98R²",
                optionB = "PR² = 98",
                optionC = "P = 1 / (98R)",
                optionD = "P = R² / 98",
                correctAnswerIndex = 1,
                explanation = "P ∝ 1/V and V ∝ R² => P ∝ 1/R² => P = K / R² => PR² = K. When R = 7 and P = 2: K = 2 * (7²) = 98. Thus, PR² = 98.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_026",
                subject = "Mathematics",
                topic = "Linear Inequalities",
                year = "1987",
                questionText = "Solve the inequality: x - 1 > 4(x + 2)",
                optionA = "x > -3",
                optionB = "x < -3",
                optionC = "x < 3",
                optionD = "x > 3",
                correctAnswerIndex = 1,
                explanation = "x - 1 > 4x + 8 => -1 - 8 > 4x - x => -9 > 3x => -3 > x => x < -3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_029",
                subject = "Mathematics",
                topic = "Arithmetic Progressions: Sum of Terms",
                year = "1987",
                questionText = "Find the sum of the first 21 terms of the arithmetic progression: -10, -8, -6, ...",
                optionA = "180",
                optionB = "190",
                optionC = "200",
                optionD = "210",
                correctAnswerIndex = 3,
                explanation = "First term a = -10, common difference d = -8 - (-10) = 2, n = 21. Sₙ = (n/2)[2a + (n - 1)d] => S₂₁ = (21/2)[2(-10) + 20(2)] = (21/2)[-20 + 40] = (21/2) * 20 = 210.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1987_030",
                subject = "Mathematics",
                topic = "Geometric Progressions: Nth Term",
                year = "1987",
                questionText = "Find the eleventh term of the progression: 4, 8, 16, ...",
                optionA = "2¹³",
                optionB = "2¹²",
                optionC = "2¹¹",
                optionD = "2¹⁰",
                correctAnswerIndex = 1,
                explanation = "First term a = 4 = 2², common ratio r = 2. Nth term Tₙ = a * rⁿ⁻¹ => T₁₁ = 2² * 2¹⁰ = 2¹².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q30"
            )
        )

        // =========================================================================
        // 1988 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1988_003",
                subject = "Mathematics",
                topic = "Percentage Error",
                year = "1988",
                questionText = "5.0g of salt was weighed by Tunde as 5.1g. What is the percentage error?",
                optionA = "20%",
                optionB = "2%",
                optionC = "0.2%",
                optionD = "5%",
                correctAnswerIndex = 1,
                explanation = "Error = 5.1 - 5.0 = 0.1g. Percentage error = (0.1 / 5.0) * 100% = 2%.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1988_014",
                subject = "Mathematics",
                topic = "Inverse Variation with Roots",
                year = "1988",
                questionText = "If x varies inversely as the cube root of y and x = 1 when y = 8, find y when x = 3.",
                optionA = "1/3",
                optionB = "2/3",
                optionC = "8/27",
                optionD = "4/9",
                correctAnswerIndex = 2,
                explanation = "x = k / ∛y. Using x = 1, y = 8: 1 = k / ∛8 = k / 2 => k = 2. When x = 3: 3 = 2 / ∛y => ∛y = 2/3 => y = (2/3)³ = 8/27.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1988_025",
                subject = "Mathematics",
                topic = "Quadratic Equations: Real Roots",
                year = "1988",
                questionText = "What is the approximate solution of the quadratic equation x² - x - 1 = 0?",
                optionA = "x = 1.6 and x = -0.6",
                optionB = "x = -1.6 and x = 0.6",
                optionC = "x = 1.6 and x = 0.6",
                optionD = "x = -1.6 and x = -0.6",
                correctAnswerIndex = 0,
                explanation = "By quadratic formula: x = [1 ± √(1 - 4(1)(-1))] / 2 = [1 ± √5] / 2 ≈ [1 ± 2.236] / 2 => x ≈ 1.618 and -0.618, giving x = 1.6 and -0.6.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1988_029",
                subject = "Mathematics",
                topic = "Geometric Progressions: Sum of Terms",
                year = "1988",
                questionText = "If 7 and 189 are the first and fourth terms of a geometric progression respectively, find the sum of the first three terms of the progression.",
                optionA = "182",
                optionB = "91",
                optionC = "63",
                optionD = "28",
                correctAnswerIndex = 1,
                explanation = "First term a = 7. T₄ = a * r³ = 189 => 7r³ = 189 => r³ = 27 => r = 3. Sum of first three terms: S₃ = 7 + 7(3) + 7(3²) = 7 + 21 + 63 = 91.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1988_036",
                subject = "Mathematics",
                topic = "Polygons: Pentagon Angles",
                year = "1988",
                questionText = "Four interior angles of a pentagon are 90° - x°, 90° + x°, 110° - 2x°, 110° + 2x°. Find the fifth interior angle.",
                optionA = "110°",
                optionB = "120°",
                optionC = "130°",
                optionD = "140°",
                correctAnswerIndex = 3,
                explanation = "Sum of interior angles of a pentagon (n = 5) is (5 - 2) * 180° = 540°. Sum of the four angles = (90 - x) + (90 + x) + (110 - 2x) + (110 + 2x) = 400°. Fifth angle = 540° - 400° = 140°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1988_050",
                subject = "Mathematics",
                topic = "Probability: Sum on Two Dice",
                year = "1988",
                questionText = "If two dice are thrown together, what is the probability of obtaining at least a score of 10?",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/6",
                optionD = "11/12",
                correctAnswerIndex = 0,
                explanation = "Outcomes with sum ≥ 10 are: (4,6), (5,5), (6,4), (5,6), (6,5), (6,6) (6 outcomes out of 36). Probability = 6 / 36 = 1/6.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q50"
            )
        )

        return list
    }
}
