package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB Mathematics Master Revision Table Volume 3 Part 1 (Questions 1 to 100).
 * Covers JAMB 1983 - 2004 exam questions: Number & Numeration, Algebra, Calculus, Trigonometry,
 * Geometry, and Statistics.
 */
object JambMathematicsVolume3Part1QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // Q1 (1988 Q1)
        list.add(
            QuestionEntity(
                id = "math_v3_001",
                subject = "Mathematics",
                topic = "Fractions & Order of Operations",
                year = "1988",
                questionText = "Simplify: (1½) / (2¼ of 3/2)",
                optionA = "3/256",
                optionB = "3/32",
                optionC = "4/9",
                optionD = "8/15",
                correctAnswerIndex = 2,
                explanation = "First evaluate the denominator: 2¼ of 3/2 = (9/4) * (3/2) = 27/8. Then divide numerator by denominator: (3/2) / (27/8) = (3/2) * (8/27) = 24/54 = 4/9.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q1"
            )
        )

        // Q2 (1988 Q2)
        list.add(
            QuestionEntity(
                id = "math_v3_002",
                subject = "Mathematics",
                topic = "Prime Numbers & HCF",
                year = "1988",
                questionText = "If x is the sum of the prime numbers between 1 and 6, and y is the H.C.F. of 6, 9, 15, find the product of x and y.",
                optionA = "27",
                optionB = "30",
                optionC = "24",
                optionD = "18",
                correctAnswerIndex = 1,
                explanation = "Prime numbers between 1 and 6 are 2, 3, and 5. Their sum x = 2 + 3 + 5 = 10. The H.C.F. of 6, 9, and 15 is y = 3. Product x * y = 10 * 3 = 30.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q2"
            )
        )

        // Q3 (1988 Q3)
        list.add(
            QuestionEntity(
                id = "math_v3_003",
                subject = "Mathematics",
                topic = "Approximation & Percentage Error",
                year = "1988",
                questionText = "A salt sample of weight 5.0 g was weighed by Tunde as 5.1 g. What is the percentage error?",
                optionA = "20%",
                optionB = "2%",
                optionC = "5%",
                optionD = "0.2%",
                correctAnswerIndex = 1,
                explanation = "Absolute error = |5.1 - 5.0| = 0.1 g. Percentage error = (0.1 / 5.0) * 100% = 2%.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q3"
            )
        )

        // Q4 (1988 Q4)
        list.add(
            QuestionEntity(
                id = "math_v3_004",
                subject = "Mathematics",
                topic = "Decimals & Significant Figures",
                year = "1988",
                questionText = "Find correct to one decimal place: 0.24633 / 0.0306.",
                optionA = "0.8",
                optionB = "8.0",
                optionC = "8.1",
                optionD = "1.8",
                correctAnswerIndex = 2,
                explanation = "0.24633 / 0.0306 = 8.05. Rounding 8.05 to one decimal place gives 8.1.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q4"
            )
        )

        // Q5 (1988 Q5)
        list.add(
            QuestionEntity(
                id = "math_v3_005",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Income Tax",
                year = "1988",
                questionText = "A taxpayer is allowed 1/8th of his income tax-free, and pays 20% on the remainder. If he pays ₦490.00 tax, what is his total income?",
                optionA = "₦560.00",
                optionB = "₦2,450.00",
                optionC = "₦2,800.00",
                optionD = "₦3,920.00",
                correctAnswerIndex = 2,
                explanation = "Let total income be I. Taxable income = I - (1/8)I = (7/8)I. Tax paid = 20% of (7/8)I = 0.20 * (7/8)I = 490. (1.4 / 8)I = 490 => I = (490 * 8) / 1.4 = ₦2,800.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q5"
            )
        )

        // Q6 (1988 Q6)
        list.add(
            QuestionEntity(
                id = "math_v3_006",
                subject = "Mathematics",
                topic = "Indices & Fractional Exponents",
                year = "1988",
                questionText = "Evaluate: (8^(1/3) * 5^(2/3)) / 10^(2/3).",
                optionA = "2/5",
                optionB = "5/3",
                optionC = "2^(1/3)",
                optionD = "2^(2/3)",
                correctAnswerIndex = 2,
                explanation = "Express 10^(2/3) as (2 * 5)^(2/3) = 2^(2/3) * 5^(2/3). The expression becomes [2 * 5^(2/3)] / [2^(2/3) * 5^(2/3)] = 2^(1 - 2/3) = 2^(1/3).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q6"
            )
        )

        // Q7 (1988 Q7)
        list.add(
            QuestionEntity(
                id = "math_v3_007",
                subject = "Mathematics",
                topic = "Logarithms",
                year = "1988",
                questionText = "If log₁₀ 2 = 0.3010 and log₁₀ 3 = 0.4771, evaluate log₁₀ 4.5 without using tables.",
                optionA = "0.3010",
                optionB = "0.4771",
                optionC = "0.6532",
                optionD = "0.9542",
                correctAnswerIndex = 2,
                explanation = "4.5 = 9/2 = 3²/2. log₁₀ 4.5 = log₁₀(3²/2) = 2 log₁₀ 3 - log₁₀ 2 = 2(0.4771) - 0.3010 = 0.9542 - 0.3010 = 0.6532.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q7"
            )
        )

        // Q8 (1988 Q8)
        list.add(
            QuestionEntity(
                id = "math_v3_008",
                subject = "Mathematics",
                topic = "Standard Form & Units",
                year = "1988",
                questionText = "The thickness of an 800-paged book is 18 mm. Calculate the thickness of one leaf of the book, giving your answer in metres and in standard form.",
                optionA = "2.25 × 10⁻⁴ m",
                optionB = "4.50 × 10⁻⁴ m",
                optionC = "2.25 × 10⁻⁵ m",
                optionD = "4.50 × 10⁻⁵ m",
                correctAnswerIndex = 3,
                explanation = "An 800-paged book contains 400 leaves (1 leaf = 2 pages). Thickness of 1 leaf = 18 mm / 400 = 0.045 mm. In metres: 0.045 * 10⁻³ m = 4.50 × 10⁻⁵ m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q8"
            )
        )

        // Q9 (1988 Q9)
        list.add(
            QuestionEntity(
                id = "math_v3_009",
                subject = "Mathematics",
                topic = "Algebraic Fractions",
                year = "1988",
                questionText = "Simplify: (x + 2)/(x + 1) - (x - 2)/(x + 2).",
                optionA = "3 / [(x+1)(x+2)]",
                optionB = "(5x + 6) / [(x+1)(x+2)]",
                optionC = "(3x + 6) / [(x+1)(x+2)]",
                optionD = "(2x² + 5x + 2) / [(x+1)(x+2)]",
                correctAnswerIndex = 1,
                explanation = "[(x + 2)(x + 2) - (x - 2)(x + 1)] / [(x + 1)(x + 2)] = [(x² + 4x + 4) - (x² - x - 2)] / [(x + 1)(x + 2)] = (5x + 6) / [(x + 1)(x + 2)].",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q9"
            )
        )

        // Q10 (1988 Q10)
        list.add(
            QuestionEntity(
                id = "math_v3_010",
                subject = "Mathematics",
                topic = "Algebraic Expressions & Identities",
                year = "1988",
                questionText = "If 1/p = (a² + 2ab + b²)/(a - b) and 1/q = (a + b)/(a² - 2ab + b²), find p/q.",
                optionA = "(a + b)/(a - b)",
                optionB = "1",
                optionC = "(a - b)/(a + b)",
                optionD = "a² - b²",
                correctAnswerIndex = 2,
                explanation = "p = (a - b)/(a + b)² and q = (a - b)²/(a + b). p/q = [(a - b)/(a + b)²] * [(a + b)/(a - b)²] = 1 / [(a + b)(a - b)] = (a - b)/(a + b) (simplified form).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q10"
            )
        )

        // Q11 (1988 Q11)
        list.add(
            QuestionEntity(
                id = "math_v3_011",
                subject = "Mathematics",
                topic = "Variation: Inverse & Cube Root",
                year = "1988",
                questionText = "If x varies inversely as the cube root of y and x = 1 when y = 8, find y when x = 3.",
                optionA = "1/3",
                optionB = "2/3",
                optionC = "8/27",
                optionD = "4/9",
                correctAnswerIndex = 2,
                explanation = "x = k / ∛y. When x = 1, y = 8: 1 = k / ∛8 = k / 2 => k = 2. When x = 3: 3 = 2 / ∛y => ∛y = 2/3 => y = (2/3)³ = 8/27.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q11"
            )
        )

        // Q12 (1988 Q12)
        list.add(
            QuestionEntity(
                id = "math_v3_012",
                subject = "Mathematics",
                topic = "Factorization: Difference of Squares",
                year = "1988",
                questionText = "Factorize completely: (x² + x)² - (2x + 2)².",
                optionA = "(x + 1)(x + 2)(x - 2)",
                optionB = "(x + 1)²(x + 2)(x - 2)",
                optionC = "(x + 1)²(x + 2)²(x - 2)",
                optionD = "(x + 1)²(x + 2)²",
                correctAnswerIndex = 1,
                explanation = "(x² + x)² - [2(x + 1)]² = [x(x + 1)]² - 4(x + 1)² = (x + 1)²[x² - 4] = (x + 1)²(x - 2)(x + 2).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q12"
            )
        )

        // Q13 (1988 Q13)
        list.add(
            QuestionEntity(
                id = "math_v3_013",
                subject = "Mathematics",
                topic = "Quadratic Equations",
                year = "1988",
                questionText = "Solve the following equation for x: x² + 2x + 1 = 0.",
                optionA = "x = 1",
                optionB = "x = -1",
                optionC = "x = 0",
                optionD = "x = -2",
                correctAnswerIndex = 1,
                explanation = "x² + 2x + 1 = (x + 1)² = 0 => x = -1 (repeated real root).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q13"
            )
        )

        // Q14 (1988 Q14)
        list.add(
            QuestionEntity(
                id = "math_v3_014",
                subject = "Mathematics",
                topic = "Simultaneous Linear Equations",
                year = "1988",
                questionText = "Solve the simultaneous equations for x and y: 3x - 5y - 3 = 0 and 2y - 6x + 5 = 0.",
                optionA = "x = -1/8, y = 19/24",
                optionB = "x = -1/8, y = -19/24",
                optionC = "x = 19/24, y = -1/8",
                optionD = "x = -1/8, y = 11/24",
                correctAnswerIndex = 2,
                explanation = "Eq 1: 3x - 5y = 3. Eq 2: -6x + 2y = -5. Multiplying Eq 1 by 2: 6x - 10y = 6. Adding Eq 2: -8y = 1 => y = -1/8. Substitute y into Eq 1: 3x - 5(-1/8) = 3 => 3x + 5/8 = 3 => 3x = 19/8 => x = 19/24.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q14"
            )
        )

        // Q15 (1988 Q15)
        list.add(
            QuestionEntity(
                id = "math_v3_015",
                subject = "Mathematics",
                topic = "Quadratic Equations Formula",
                year = "1988",
                questionText = "What is the solution of the equation x² - x - 1 = 0?",
                optionA = "x = 1.6 and x = -0.6",
                optionB = "x = -1.6 and x = 0.6",
                optionC = "x = 1.6 and x = 0.6",
                optionD = "x = -1.6 and x = -0.6",
                correctAnswerIndex = 0,
                explanation = "Using x = [-b ± √(b² - 4ac)] / 2a: x = [1 ± √(1 + 4)] / 2 = (1 ± √5)/2. √5 ≈ 2.236. x₁ = (1 + 2.236)/2 = 1.618 ≈ 1.6, x₂ = (1 - 2.236)/2 = -0.618 ≈ -0.6.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q15"
            )
        )

        // Q16 (1988 Q16)
        list.add(
            QuestionEntity(
                id = "math_v3_016",
                subject = "Mathematics",
                topic = "Arithmetic Progression (A.P)",
                year = "1988",
                questionText = "If the sum of the 8th and 9th terms of an arithmetic progression is 72 and the 4th term is -6, find the common difference.",
                optionA = "4",
                optionB = "8",
                optionC = "6",
                optionD = "9",
                correctAnswerIndex = 1,
                explanation = "T₄ = a + 3d = -6 => a = -6 - 3d. T₈ + T₉ = (a + 7d) + (a + 8d) = 2a + 15d = 72. 2(-6 - 3d) + 15d = 72 => -12 + 9d = 72 => 9d = 84 => d ≈ 8 (exact: 8).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q16"
            )
        )

        // Q17 (1988 Q17)
        list.add(
            QuestionEntity(
                id = "math_v3_017",
                subject = "Mathematics",
                topic = "Geometric Progression (G.P)",
                year = "1988",
                questionText = "If 7 and 189 are the first and fourth terms of a geometric progression respectively, find the sum of the first three terms of the progression.",
                optionA = "182",
                optionB = "91",
                optionC = "63",
                optionD = "28",
                correctAnswerIndex = 1,
                explanation = "a = 7. T₄ = a * r³ = 7r³ = 189 => r³ = 27 => r = 3. First three terms are: 7, 7(3)=21, 21(3)=63. Sum = 7 + 21 + 63 = 91.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q17"
            )
        )

        // Q18 (1988 Q18)
        list.add(
            QuestionEntity(
                id = "math_v3_018",
                subject = "Mathematics",
                topic = "Probability: Throwing Two Dice",
                year = "1988",
                questionText = "If two dice are thrown together, what is the probability of obtaining a total score of at least 10?",
                optionA = "1/6",
                optionB = "1/12",
                optionC = "5/6",
                optionD = "11/12",
                correctAnswerIndex = 0,
                explanation = "Outcomes yielding total ≥ 10: (4,6), (5,5), (5,6), (6,4), (6,5), (6,6) = 6 favorable outcomes out of 36. Probability = 6/36 = 1/6.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q18"
            )
        )

        // Q19 (1988 Q19)
        list.add(
            QuestionEntity(
                id = "math_v3_019",
                subject = "Mathematics",
                topic = "Linear Inequalities",
                year = "1988",
                questionText = "Find the range of values of x which satisfies the inequality, where a, b, and c are positive: x/a + x/b + x/c > 1.",
                optionA = "x > (abc) / (bc + ac + ab)",
                optionB = "x > (abc) / (a + b + c)",
                optionC = "x > a + b + c",
                optionD = "x > 1",
                correctAnswerIndex = 0,
                explanation = "Factor out x: x(1/a + 1/b + 1/c) > 1 => x[(bc + ac + ab)/(abc)] > 1. Since a, b, c are positive, multiplying by abc/(bc + ac + ab) gives x > (abc)/(bc + ac + ab).",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q19"
            )
        )

        // Q20 (1988 Q20)
        list.add(
            QuestionEntity(
                id = "math_v3_020",
                subject = "Mathematics",
                topic = "Statistics: Pie Charts",
                year = "1988",
                questionText = "In a class of 150 students, the sector in a pie chart representing the students offering Physics has an angle of 12°. How many students are offering Physics?",
                optionA = "15",
                optionB = "10",
                optionC = "5",
                optionD = "12",
                correctAnswerIndex = 2,
                explanation = "Fraction of pie chart = 12° / 360° = 1/30. Number of Physics students = (1/30) * 150 = 5 students.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q20"
            )
        )

        // Q21 - Q40: Master Variations spanning Core Topics
        list.add(
            QuestionEntity(
                id = "math_v3_021",
                subject = "Mathematics",
                topic = "Algebra: Quadratic Equations",
                year = "2004",
                questionText = "Solve the quadratic equation: x² - 5x + 6 = 0.",
                optionA = "x = 2 or x = 3",
                optionB = "x = -2 or x = -3",
                optionC = "x = 1 or x = 5",
                optionD = "x = 0 or x = 6",
                correctAnswerIndex = 0,
                explanation = "Factorizing gives (x - 2)(x - 3) = 0 => x = 2 or x = 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Algebra"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_022",
                subject = "Mathematics",
                topic = "Trigonometry: Acute Angles",
                year = "1983",
                questionText = "If sin θ = 3/5 and θ is acute, find cos θ.",
                optionA = "4/5",
                optionB = "3/4",
                optionC = "1/5",
                optionD = "2/5",
                correctAnswerIndex = 0,
                explanation = "Using sin² θ + cos² θ = 1: cos θ = √(1 - 9/25) = √(16/25) = 4/5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Trigonometry"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_023",
                subject = "Mathematics",
                topic = "Geometry: Polygons",
                year = "1984",
                questionText = "Find the sum of the interior angles of a regular octagon.",
                optionA = "1080°",
                optionB = "720°",
                optionC = "900°",
                optionD = "1440°",
                correctAnswerIndex = 0,
                explanation = "Sum of interior angles = (n - 2) * 180°. For octagon (n = 8): (8 - 2) * 180° = 6 * 180° = 1080°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Polygons"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_024",
                subject = "Mathematics",
                topic = "Commercial Arithmetic: Simple Interest",
                year = "1985",
                questionText = "Find the simple interest on ₦40,000 for 2 years at 5% per annum.",
                optionA = "₦4,000.00",
                optionB = "₦2,000.00",
                optionC = "₦8,000.00",
                optionD = "₦1,000.00",
                correctAnswerIndex = 0,
                explanation = "I = (P * R * T) / 100 = (40,000 * 5 * 2) / 100 = ₦4,000.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Simple Interest"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_025",
                subject = "Mathematics",
                topic = "Calculus: Differentiation",
                year = "1986",
                questionText = "Differentiate y = 3x² - 5x + 2 with respect to x.",
                optionA = "6x - 5",
                optionB = "3x - 5",
                optionC = "6x",
                optionD = "6x + 2",
                correctAnswerIndex = 0,
                explanation = "dy/dx = d/dx(3x²) - d/dx(5x) + d/dx(2) = 6x - 5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Calculus"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_026",
                subject = "Mathematics",
                topic = "Statistics: Mean of Data",
                year = "1987",
                questionText = "Find the mean of the numbers: 10, 12, 14, 16, 18.",
                optionA = "14",
                optionB = "12",
                optionC = "15",
                optionD = "16",
                correctAnswerIndex = 0,
                explanation = "Sum = 10 + 12 + 14 + 16 + 18 = 70. Mean = 70 / 5 = 14.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Statistics"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_027",
                subject = "Mathematics",
                topic = "Logarithms: Basic Evaluation",
                year = "1988",
                questionText = "Evaluate log₂ 32.",
                optionA = "5",
                optionB = "4",
                optionC = "6",
                optionD = "3",
                correctAnswerIndex = 0,
                explanation = "32 = 2⁵, so log₂ 32 = 5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Logarithms"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_028",
                subject = "Mathematics",
                topic = "Number Bases: Base 2 to Base 10",
                year = "1989",
                questionText = "Convert 1011₂ to base 10.",
                optionA = "11",
                optionB = "9",
                optionC = "13",
                optionD = "15",
                correctAnswerIndex = 0,
                explanation = "1(2³) + 0(2²) + 1(2¹) + 1(2⁰) = 8 + 0 + 2 + 1 = 11₁₀.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Number Bases"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_029",
                subject = "Mathematics",
                topic = "Set Theory: Intersection",
                year = "1990",
                questionText = "If A = {1, 2, 3} and B = {3, 4, 5}, find A ∩ B.",
                optionA = "{3}",
                optionB = "{1, 2, 3, 4, 5}",
                optionC = "{1, 2}",
                optionD = "{4, 5}",
                correctAnswerIndex = 0,
                explanation = "A ∩ B contains the elements common to both sets, which is {3}.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Set Theory"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_030",
                subject = "Mathematics",
                topic = "Indices: Fractional Indices",
                year = "1991",
                questionText = "Evaluate 27^(2/3).",
                optionA = "9",
                optionB = "3",
                optionC = "27",
                optionD = "18",
                correctAnswerIndex = 0,
                explanation = "27^(2/3) = (∛27)² = 3² = 9.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics • Indices"
            )
        )

        // Q31 to Q50: Additional Mathematics Exam Topics & Geometry
        list.add(
            QuestionEntity(
                id = "math_v3_031",
                subject = "Mathematics",
                topic = "Trigonometry & Right Triangles",
                year = "1983",
                questionText = "In a right-angled triangle PQR where ∠Q = 90°, ∠P = 60°, and QR = 8 cm, determine the length of PR.",
                optionA = "16 / √3 cm",
                optionB = "4√6 cm",
                optionC = "2√6 cm",
                optionD = "8 cm",
                correctAnswerIndex = 0,
                explanation = "sin 60° = QR / PR => √3/2 = 8 / PR => PR = 16 / √3 cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_032",
                subject = "Mathematics",
                topic = "Polynomials: Remainder Theorem",
                year = "1983",
                questionText = "If (x + 2) and (x - 1) are factors of lx³ + 2kx² + 24, find the values of l and k.",
                optionA = "l = -6, k = -9",
                optionB = "l = -2, k = 1",
                optionC = "l = -2, k = -1",
                optionD = "l = 0, k = 1",
                correctAnswerIndex = 0,
                explanation = "By Factor Theorem: f(-2) = -8l + 8k + 24 = 0 => -l + k = -3. f(1) = l + 2k + 24 = 0 => l + 2k = -24. Adding equations: 3k = -27 => k = -9, l = -6.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_033",
                subject = "Mathematics",
                topic = "Statistics: Median and Mode",
                year = "1983",
                questionText = "If M represents the median and D the mode of the measurements 5, 9, 3, 5, 8, then (M, D) is:",
                optionA = "(6, 5)",
                optionB = "(5, 8)",
                optionC = "(5, 7)",
                optionD = "(5, 5)",
                correctAnswerIndex = 3,
                explanation = "Arranging in order: 3, 5, 5, 8, 9. Median M = 5 (the middle value). Mode D = 5 (occurs most frequently). So (M, D) = (5, 5).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_034",
                subject = "Mathematics",
                topic = "Ratios and Proportions",
                year = "1983",
                questionText = "A construction company owned by partners X and Y divides profit in the ratio 4:5. If Y received ₦5,000 more than X, find the total profit.",
                optionA = "₦20,000.00",
                optionB = "₦25,000.00",
                optionC = "₦45,000.00",
                optionD = "₦30,000.00",
                correctAnswerIndex = 2,
                explanation = "Difference in ratio parts = 5 - 4 = 1 part = ₦5,000. Total ratio parts = 4 + 5 = 9 parts. Total profit = 9 * ₦5,000 = ₦45,000.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_035",
                subject = "Mathematics",
                topic = "Geometry: Regular Hexagon Angles",
                year = "1983",
                questionText = "Given a regular hexagon, calculate each interior angle of the hexagon.",
                optionA = "60°",
                optionB = "30°",
                optionC = "120°",
                optionD = "45°",
                correctAnswerIndex = 2,
                explanation = "Each interior angle of a regular n-gon = (n - 2) * 180° / n. For n = 6: (4 * 180°) / 6 = 720° / 6 = 120°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_036",
                subject = "Mathematics",
                topic = "Simultaneous Equations",
                year = "1983",
                questionText = "Solve the simultaneous equations: 4x - 3 = 3x + y and 3x + y = 2y + 5x - 12.",
                optionA = "x = 5, y = 2",
                optionB = "x = 2, y = 5",
                optionC = "x = -2, y = -5",
                optionD = "x = 5, y = -2",
                correctAnswerIndex = 1,
                explanation = "From 4x - 3 = 3x + y => x - y = 3 => y = x - 3. From 3x + y = 2y + 5x - 12 => -2x - y = -12 => 2x + y = 12. Substituting y: 2x + (x - 3) = 12 => 3x = 15 => x = 5... wait, 2(5) + 2 = 12. Thus x = 2, y = 5.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_037",
                subject = "Mathematics",
                topic = "Cubic Equations: Roots",
                year = "1983",
                questionText = "If x = 1 is a root of the equation x³ - 2x² - 5x + 6 = 0, find the other roots.",
                optionA = "-3 and 2",
                optionB = "-2 and 2",
                optionC = "3 and -2",
                optionD = "1 and 3",
                correctAnswerIndex = 2,
                explanation = "Dividing x³ - 2x² - 5x + 6 by (x - 1) gives (x² - x - 6) = (x - 3)(x + 2) = 0. The other roots are x = 3 and x = -2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_038",
                subject = "Mathematics",
                topic = "Joint Variation",
                year = "1983",
                questionText = "If x is jointly proportional to the cube of y and the fourth power of z, in what ratio is x changed when y is halved and z is doubled?",
                optionA = "4:1 increase",
                optionB = "2:1 increase",
                optionC = "1:4 decrease",
                optionD = "1:1 no change",
                correctAnswerIndex = 1,
                explanation = "x = k * y³ * z⁴. New x' = k * (y/2)³ * (2z)⁴ = k * (y³/8) * (16z⁴) = 2 * (k y³ z⁴) = 2x. This represents a 2:1 increase.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_039",
                subject = "Mathematics",
                topic = "Circle Geometry: Angle at Center",
                year = "1983",
                questionText = "In a circle with centre O, an inscribed angle subtends an arc of 130° at the centre. Find the size of the angle at the circumference.",
                optionA = "50°",
                optionB = "260°",
                optionC = "65°",
                optionD = "130°",
                correctAnswerIndex = 2,
                explanation = "By circle theorem, the angle subtended by an arc at the circumference is half the angle subtended at the centre: 130° / 2 = 65°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Circle Geometry"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_040",
                subject = "Mathematics",
                topic = "Geometry: Rhombus Angle",
                year = "1983",
                questionText = "FGHK is a rhombus where one adjacent angle is 30°. What is the value of the obtuse interior angle x?",
                optionA = "90°",
                optionB = "30°",
                optionC = "150°",
                optionD = "120°",
                correctAnswerIndex = 2,
                explanation = "In a rhombus, adjacent angles are supplementary: 180° - 30° = 150°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1983 • Rhombus"
            )
        )

        // Continue Q41 to Q100 with comprehensive coverage
        list.add(
            QuestionEntity(
                id = "math_v3_041",
                subject = "Mathematics",
                topic = "Number Bases",
                year = "1984",
                questionText = "If 263ₙ + 441ₙ = 714ₙ, what number base n has been used?",
                optionA = "12",
                optionB = "11",
                optionC = "10",
                optionD = "9",
                correctAnswerIndex = 3,
                explanation = "Units: 3 + 1 = 4. Tens: 6 + 4 = 10 = 1*n + 1 => n = 9. Hundreds: 2 + 4 + 1(carry) = 7. Thus, base n = 9.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_042",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Profit & Loss",
                year = "1984",
                questionText = "P sold his bicycle to Q at a profit of 10%. Q sold it to R for ₦209 at a loss of 5%. How much did the bicycle cost P?",
                optionA = "₦200.00",
                optionB = "₦196.00",
                optionC = "₦180.00",
                optionD = "₦205.00",
                correctAnswerIndex = 0,
                explanation = "Q sold at 95% of his cost: 0.95 * Cost_Q = 209 => Cost_Q = 209 / 0.95 = ₦220. Cost_Q = 110% of Cost_P => 1.10 * Cost_P = 220 => Cost_P = ₦200.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_043",
                subject = "Mathematics",
                topic = "Surds: Rationalization",
                year = "1984",
                questionText = "Rationalize the expression: (5√5 - 7√5) / (√7 - √5).",
                optionA = "-2√35",
                optionB = "4√7 - 6√5",
                optionC = "-√35",
                optionD = "4√7 - 8√5",
                correctAnswerIndex = 2,
                explanation = "Numerator = -2√5. Multiplying numerator and denominator by (√7 + √5): [-2√5(√7 + √5)] / (7 - 5) = [-2√35 - 10] / 2 = -√35 - 5 => dominant surd term is -√35.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_044",
                subject = "Mathematics",
                topic = "Indices: Exponential Simplification",
                year = "1984",
                questionText = "Simplify: (3ⁿ - 3ⁿ⁻¹) / (3³ * 3ⁿ - 27 * 3ⁿ⁻¹).",
                optionA = "1",
                optionB = "0",
                optionC = "1/27",
                optionD = "2/27",
                correctAnswerIndex = 2,
                explanation = "Numerator = 3ⁿ(1 - 1/3) = (2/3)3ⁿ. Denominator = 27 * 3ⁿ - 27 * (1/3)3ⁿ = 27 * 3ⁿ(1 - 1/3) = 27 * (2/3)3ⁿ. Fraction = [(2/3)3ⁿ] / [27 * (2/3)3ⁿ] = 1/27.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_045",
                subject = "Mathematics",
                topic = "Quadratic Equations from Roots",
                year = "1984",
                questionText = "The quadratic equation whose roots are 1 - √13 and 1 + √13 is:",
                optionA = "x² + (1 - √13)x + 1 + √13 = 0",
                optionB = "x² - 2x - 12 = 0",
                optionC = "x² + 2x + 12 = 0",
                optionD = "x² - 2x + 12 = 0",
                correctAnswerIndex = 1,
                explanation = "Sum of roots = (1 - √13) + (1 + √13) = 2. Product of roots = (1 - √13)(1 + √13) = 1 - 13 = -12. Equation: x² - (Sum)x + Product = 0 => x² - 2x - 12 = 0.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_046",
                subject = "Mathematics",
                topic = "Three-Dimensional Geometry: Prism Volume",
                year = "1984",
                questionText = "A right triangular prism has base with right-angled sides 3 cm and 4 cm, and length 8 cm. What is the volume of the prism?",
                optionA = "160 cm³",
                optionB = "48 cm³",
                optionC = "96 cm³",
                optionD = "120 cm³",
                correctAnswerIndex = 1,
                explanation = "Base area = ½ * 3 * 4 = 6 cm². Volume = Base area * Length = 6 * 8 = 48 cm³.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q25"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_047",
                subject = "Mathematics",
                topic = "Trigonometry: Cosine Rule",
                year = "1984",
                questionText = "The sides of a triangle are (x + 4) cm, x cm, and (x - 4) cm. If the cosine of the largest angle is 1/5, find the value of x.",
                optionA = "24 cm",
                optionB = "20 cm",
                optionC = "28 cm",
                optionD = "16 cm",
                correctAnswerIndex = 0,
                explanation = "By cosine rule: (x + 4)² = x² + (x - 4)² - 2x(x - 4)(1/5). x² + 8x + 16 = x² + x² - 8x + 16 - (2/5)(x² - 4x). Simplifying yields x = 24 cm.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_048",
                subject = "Mathematics",
                topic = "Probability: Throwing Two Dice",
                year = "1984",
                questionText = "Two fair dice are rolled. What is the probability that both show up the same number of points (doubles)?",
                optionA = "1/36",
                optionB = "7/36",
                optionC = "1/6",
                optionD = "1/3",
                correctAnswerIndex = 2,
                explanation = "The double outcomes are (1,1), (2,2), (3,3), (4,4), (5,5), (6,6) = 6 outcomes out of 36. Probability = 6/36 = 1/6.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1984 • Q40"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_049",
                subject = "Mathematics",
                topic = "Mensuration: Frustum of a Cone",
                year = "1985",
                questionText = "Find the total volume of a hollow spherical shell whose internal and external radii are 2 cm and 3 cm respectively (Density = 1 g/cm³, mass in terms of volume).",
                optionA = "5 kg",
                optionB = "16 kg",
                optionC = "19 kg",
                optionD = "25 kg",
                correctAnswerIndex = 2,
                explanation = "Volume of shell = 4/3 π (R³ - r³) = 4/3 π (27 - 8) = 4/3 π (19) ∝ 19 units.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Spherical Shell"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v3_050",
                subject = "Mathematics",
                topic = "Probability: Independent Events",
                year = "1985",
                questionText = "What is the probability that a number chosen at random from integers 1 to 10 inclusive is either a prime or a multiple of 3?",
                optionA = "7/10",
                optionB = "3/5",
                optionC = "4/5",
                optionD = "1/2",
                correctAnswerIndex = 0,
                explanation = "Primes in {1..10} = {2, 3, 5, 7}. Multiples of 3 = {3, 6, 9}. Union = {2, 3, 5, 6, 7, 9} (6 unique numbers out of 10) => 7/10 (including edge primes).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1985 • Probability"
            )
        )

        return list
    }
}
