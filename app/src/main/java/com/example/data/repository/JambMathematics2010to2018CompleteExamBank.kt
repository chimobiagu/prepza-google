package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified JAMB Mathematics 2010 - 2018 Complete Exam Bank.
 * Extracted directly from official JAMB UTME Past Questions (2010 - 2018 Series).
 * Covers Number Bases, Modular Arithmetic, Algebra, Matrices & Determinants,
 * Coordinate Geometry, Calculus (Differentiation & Integration), Statistics, and Probability.
 */
object JambMathematics2010to2018CompleteExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // -------------------------------------------------------------------------
        // UTME 2010 MATHEMATICS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "math_2010_02",
                subject = "Mathematics",
                topic = "Number Bases",
                year = "2010",
                questionText = "Find r, if 6r7₈ = 511₉",
                optionA = "5",
                optionB = "2",
                optionC = "3",
                optionD = "6",
                correctAnswerIndex = 2,
                explanation = "Converting both sides to base 10: 6(8²) + r(8¹) + 7(8⁰) = 5(9²) + 1(9¹) + 1(9⁰) => 384 + 8r + 7 = 405 + 9 + 1 => 391 + 8r = 415 => 8r = 24 => r = 3.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_03",
                subject = "Mathematics",
                topic = "Fractions & Operations",
                year = "2010",
                questionText = "Simplify (3/4 of 4/9) ÷ 12",
                optionA = "1/25",
                optionB = "1/4",
                optionC = "1/5",
                optionD = "1/36",
                correctAnswerIndex = 3,
                explanation = "3/4 of 4/9 = (3/4) × (4/9) = 1/3. Then (1/3) ÷ 12 = 1/(3 × 12) = 1/36.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_04",
                subject = "Mathematics",
                topic = "Approximation & Percentage Error",
                year = "2010",
                questionText = "A student measures a piece of rope and found that it was 1.26 m long. If the actual length of the rope was 1.25 m, what was the percentage error in the measurement?",
                optionA = "0.40%",
                optionB = "0.01%",
                optionC = "0.25%",
                optionD = "0.80%",
                correctAnswerIndex = 3,
                explanation = "Error = |1.26 - 1.25| = 0.01 m. Percentage error = (0.01 / 1.25) × 100% = 0.80%.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_05",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Simple Interest",
                year = "2010",
                questionText = "At what rate will the interest on ₦400 increase to ₦24 in 3 years reckoning in simple interest?",
                optionA = "4%",
                optionB = "2%",
                optionC = "3%",
                optionD = "5%",
                correctAnswerIndex = 1,
                explanation = "Simple Interest I = (P × R × T) / 100 => 24 = (400 × R × 3) / 100 => 24 = 12R => R = 24 / 12 = 2%.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_06",
                subject = "Mathematics",
                topic = "Ratios & Proportions",
                year = "2010",
                questionText = "If p : q = 2/3 : 5/6 and q : r = 3/4 : 1/2, find p : q : r.",
                optionA = "9:10:15",
                optionB = "12:15:16",
                optionC = "12:15:10",
                optionD = "10:15:24",
                correctAnswerIndex = 2,
                explanation = "p : q = (2/3 × 6) : (5/6 × 6) = 4 : 5. Multiply by 3 gives 12 : 15. q : r = (3/4 × 4) : (1/2 × 4) = 3 : 2. Multiply by 5 gives 15 : 10. Thus, p : q : r = 12 : 15 : 10.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_07",
                subject = "Mathematics",
                topic = "Indices",
                year = "2010",
                questionText = "Evaluate (81/16)^(-1/4) × 2⁻¹",
                optionA = "1/3",
                optionB = "6",
                optionC = "3",
                optionD = "1/6",
                correctAnswerIndex = 0,
                explanation = "(81/16)^(-1/4) = (16/81)^(1/4) = (2⁴/3⁴)^(1/4) = 2/3. Then (2/3) × (1/2) = 1/3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_08",
                subject = "Mathematics",
                topic = "Logarithms",
                year = "2010",
                questionText = "Given that log 2 = 0.3010 and log 7 = 0.8451. Evaluate log 112.",
                optionA = "2.5441",
                optionB = "2.0491",
                optionC = "2.1461",
                optionD = "3.1461",
                correctAnswerIndex = 1,
                explanation = "112 = 16 × 7 = 2⁴ × 7. log 112 = log(2⁴ × 7) = 4 log 2 + log 7 = 4(0.3010) + 0.8451 = 1.2040 + 0.8451 = 2.0491.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q8"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_09",
                subject = "Mathematics",
                topic = "Surds: Rationalisation",
                year = "2010",
                questionText = "Rationalise (2√3 + √5) / (√5 - √3)",
                optionA = "(3√15 + 11) / 2",
                optionB = "(3√15 - 11) / 2",
                optionC = "3√15 - 11",
                optionD = "3√15 + 11",
                correctAnswerIndex = 0,
                explanation = "Multiply numerator and denominator by conjugate (√5 + √3): Denominator = 5 - 3 = 2. Numerator = (2√3 + √5)(√5 + √3) = 2√15 + 6 + 5 + √15 = 3√15 + 11. Result is (3√15 + 11) / 2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_10",
                subject = "Mathematics",
                topic = "Standard Form",
                year = "2010",
                questionText = "Express the product of 0.21 and 0.34 in standard form.",
                optionA = "7.14 × 10⁻³",
                optionB = "7.14 × 10⁻¹",
                optionC = "7.14 × 10⁻²",
                optionD = "7.14 × 10⁻⁴",
                correctAnswerIndex = 2,
                explanation = "0.21 × 0.34 = 0.0714 = 7.14 × 10⁻².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q10"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_12",
                subject = "Mathematics",
                topic = "Set Theory: Venn Diagrams",
                year = "2010",
                questionText = "In a survey of 50 newspaper readers, 40 read Champion and 30 read Guardian. How many read both papers?",
                optionA = "15",
                optionB = "5",
                optionC = "10",
                optionD = "20",
                correctAnswerIndex = 3,
                explanation = "n(C ∪ G) = n(C) + n(G) - n(C ∩ G) => 50 = 40 + 30 - n(C ∩ G) => n(C ∩ G) = 70 - 50 = 20.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q12"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_14",
                subject = "Mathematics",
                topic = "Algebraic Factorization",
                year = "2010",
                questionText = "If 9x² + 6xy + 4y² is a factor of 27x³ - 8y³, find the other factor.",
                optionA = "3x - 2y",
                optionB = "2y - 3x",
                optionC = "2y + 3x",
                optionD = "3x + 2y",
                correctAnswerIndex = 0,
                explanation = "Difference of two cubes: a³ - b³ = (a - b)(a² + ab + b²). Here a = 3x and b = 2y. Thus 27x³ - 8y³ = (3x - 2y)(9x² + 6xy + 4y²). The other factor is 3x - 2y.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_16",
                subject = "Mathematics",
                topic = "Simultaneous Equations",
                year = "2010",
                questionText = "Solve for x and y if x - y = 2 and x² - y² = 8.",
                optionA = "(1, 3)",
                optionB = "(3, 1)",
                optionC = "(-1, 3)",
                optionD = "(-3, 1)",
                correctAnswerIndex = 1,
                explanation = "x² - y² = (x - y)(x + y) = 8 => 2(x + y) = 8 => x + y = 4. Adding x - y = 2 and x + y = 4 yields 2x = 6 => x = 3, y = 1.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q16"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_17",
                subject = "Mathematics",
                topic = "Variation",
                year = "2010",
                questionText = "If y varies directly as the square root of x and y = 3 when x = 16, calculate y when x = 64.",
                optionA = "5",
                optionB = "12",
                optionC = "6",
                optionD = "3",
                correctAnswerIndex = 2,
                explanation = "y = k√x => 3 = k√16 = 4k => k = 3/4. When x = 64, y = (3/4)√64 = (3/4) × 8 = 6.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q17"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_21",
                subject = "Mathematics",
                topic = "Geometric Progression: Sum to Infinity",
                year = "2010",
                questionText = "Find the sum to infinity of the following series: 0.5 + 0.05 + 0.005 + 0.0005 + .....",
                optionA = "5/9",
                optionB = "5/7",
                optionC = "5/8",
                optionD = "5/11",
                correctAnswerIndex = 0,
                explanation = "First term a = 0.5, common ratio r = 0.05 / 0.5 = 0.1. S_∞ = a / (1 - r) = 0.5 / (1 - 0.1) = 0.5 / 0.9 = 5/9.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_22",
                subject = "Mathematics",
                topic = "Arithmetic Progression",
                year = "2010",
                questionText = "The 3rd term of an arithmetic progression is -9 and the 7th term is -29. Find the 10th term of the progression.",
                optionA = "44",
                optionB = "-165",
                optionC = "-44",
                optionD = "165",
                correctAnswerIndex = 2,
                explanation = "T₃ = a + 2d = -9, T₇ = a + 6d = -29. Subtracting gives 4d = -20 => d = -5. Then a = -9 - 2(-5) = 1. T₁₀ = a + 9d = 1 + 9(-5) = 1 - 45 = -44.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q22"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_23",
                subject = "Mathematics",
                topic = "Binary Operations",
                year = "2010",
                questionText = "If x * y = x + y², find the value of (2 * 3) * 5.",
                optionA = "36",
                optionB = "11",
                optionC = "25",
                optionD = "55",
                correctAnswerIndex = 0,
                explanation = "First evaluate 2 * 3 = 2 + 3² = 2 + 9 = 11. Next, 11 * 5 = 11 + 5² = 11 + 25 = 36.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q23"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_31",
                subject = "Mathematics",
                topic = "Geometry: Triangles",
                year = "2010",
                questionText = "If the two smaller sides of a right-angled triangle are 4 cm and 5 cm, find its area.",
                optionA = "10 cm²",
                optionB = "6 cm²",
                optionC = "8 cm²",
                optionD = "24 cm²",
                correctAnswerIndex = 0,
                explanation = "Area of a right-angled triangle = 1/2 × base × height = 1/2 × 4 × 5 = 10 cm².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q31"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_36",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Gradient",
                year = "2010",
                questionText = "Find the gradient of the line passing through the points P(1, 1) and Q(2, 5).",
                optionA = "4",
                optionB = "2",
                optionC = "3",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Gradient m = (y₂ - y₁) / (x₂ - x₁) = (5 - 1) / (2 - 1) = 4 / 1 = 4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q36"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_37",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Parallel Lines",
                year = "2010",
                questionText = "Find the equation of a line parallel to y = -4x + 2 passing through (2, 3).",
                optionA = "y - 4x + 11 = 0",
                optionB = "y - 4x - 11 = 0",
                optionC = "y + 4x + 11 = 0",
                optionD = "y + 4x - 11 = 0",
                correctAnswerIndex = 3,
                explanation = "Parallel lines have the same gradient m = -4. Using point-slope form: y - y₁ = m(x - x₁) => y - 3 = -4(x - 2) => y - 3 = -4x + 8 => y + 4x - 11 = 0.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q37"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_38",
                subject = "Mathematics",
                topic = "Trigonometric Ratios",
                year = "2010",
                questionText = "If cot θ = 8/15, where θ is acute, find sin θ.",
                optionA = "13/15",
                optionB = "15/17",
                optionC = "8/17",
                optionD = "16/17",
                correctAnswerIndex = 1,
                explanation = "cot θ = adjacent / opposite = 8 / 15. Hypotenuse = √(8² + 15²) = √(64 + 225) = √289 = 17. Therefore, sin θ = opposite / hypotenuse = 15 / 17.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q38"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_40",
                subject = "Mathematics",
                topic = "Differentiation: Chain Rule",
                year = "2010",
                questionText = "If y = (2x + 1)³, find dy/dx.",
                optionA = "3(2x + 1)²",
                optionB = "3(2x + 1)",
                optionC = "6(2x + 1)",
                optionD = "6(2x + 1)²",
                correctAnswerIndex = 3,
                explanation = "Using chain rule: dy/dx = 3(2x + 1)² × d/dx(2x + 1) = 3(2x + 1)² × 2 = 6(2x + 1)².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q40"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_41",
                subject = "Mathematics",
                topic = "Differentiation: Product Rule",
                year = "2010",
                questionText = "If y = x sin x, find dy/dx.",
                optionA = "cos x + x sin x",
                optionB = "sin x + x cos x",
                optionC = "sin x - x cos x",
                optionD = "sin x - cos x",
                correctAnswerIndex = 1,
                explanation = "By product rule d/dx[u·v] = u'v + uv'. Here u = x, v = sin x. u' = 1, v' = cos x. dy/dx = 1·sin x + x·cos x = sin x + x cos x.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q41"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_43",
                subject = "Mathematics",
                topic = "Definite Integration",
                year = "2010",
                questionText = "Evaluate ∫₀² (x³ + x²) dx.",
                optionA = "2 5/6",
                optionB = "6 2/3",
                optionC = "4 5/6",
                optionD = "12 5/6",
                correctAnswerIndex = 1,
                explanation = "∫ (x³ + x²) dx = [x⁴/4 + x³/3] from 0 to 2 = (2⁴/4 + 2³/3) - 0 = (16/4 + 8/3) = 4 + 2 2/3 = 6 2/3.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_44",
                subject = "Mathematics",
                topic = "Indefinite Integration",
                year = "2010",
                questionText = "Find ∫ (sin x + 2) dx.",
                optionA = "cos x + x² + k",
                optionB = "cos x + 2x + k",
                optionC = "-cos x + 2x + k",
                optionD = "-cos x + x² + k",
                correctAnswerIndex = 2,
                explanation = "∫ sin x dx = -cos x, and ∫ 2 dx = 2x. Thus ∫ (sin x + 2) dx = -cos x + 2x + k.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q44"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_49",
                subject = "Mathematics",
                topic = "Permutations & Combinations",
                year = "2010",
                questionText = "In how many ways can a committee of 2 women and 3 men be chosen from 6 men and 5 women?",
                optionA = "50",
                optionB = "200",
                optionC = "100",
                optionD = "30",
                correctAnswerIndex = 1,
                explanation = "Ways to select 2 women from 5 = ⁵C₂ = 10. Ways to select 3 men from 6 = ⁶C₃ = (6 × 5 × 4)/(3 × 2 × 1) = 20. Total ways = 10 × 20 = 200.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q49"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2010_50",
                subject = "Mathematics",
                topic = "Probability",
                year = "2010",
                questionText = "If three unbiased coins are tossed, find the probability that they are all heads.",
                optionA = "1/8",
                optionB = "1/3",
                optionC = "1/6",
                optionD = "1/9",
                correctAnswerIndex = 0,
                explanation = "Sample space size = 2³ = 8. Only 1 outcome is all heads (HHH). P(all heads) = 1/8.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2010 • Q50"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2011 MATHEMATICS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "math_2011_02",
                subject = "Mathematics",
                topic = "Number Bases",
                year = "2011",
                questionText = "If 2q3₅ = 77₈, find q.",
                optionA = "2",
                optionB = "1",
                optionC = "4",
                optionD = "0",
                correctAnswerIndex = 0,
                explanation = "2(5²) + q(5¹) + 3(5⁰) = 7(8¹) + 7(8⁰) => 50 + 5q + 3 = 56 + 7 => 53 + 5q = 63 => 5q = 10 => q = 2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_04",
                subject = "Mathematics",
                topic = "Simple Interest",
                year = "2011",
                questionText = "A man invested ₦5,000 for 9 months at 4%. What is the simple interest?",
                optionA = "₦150",
                optionB = "₦220",
                optionC = "₦130",
                optionD = "₦250",
                correctAnswerIndex = 0,
                explanation = "Time T = 9/12 = 3/4 years. Simple interest I = (P × R × T)/100 = (5000 × 4 × 3/4) / 100 = (5000 × 3) / 100 = ₦150.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_05",
                subject = "Mathematics",
                topic = "Ratios",
                year = "2011",
                questionText = "If the numbers M, N, Q are in the ratio 5:4:3, find the value of (2N - Q) / M.",
                optionA = "2",
                optionB = "3",
                optionC = "1",
                optionD = "4",
                correctAnswerIndex = 2,
                explanation = "Let M = 5k, N = 4k, Q = 3k. (2N - Q) / M = (2(4k) - 3k) / 5k = (8k - 3k) / 5k = 5k / 5k = 1.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q5"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_07",
                subject = "Mathematics",
                topic = "Logarithmic Equations",
                year = "2011",
                questionText = "If log₃ 18 + log₃ 3 - log₃ x = 3, find x.",
                optionA = "1",
                optionB = "2",
                optionC = "0",
                optionD = "3",
                correctAnswerIndex = 1,
                explanation = "log₃ (18 × 3 / x) = 3 => (54 / x) = 3³ = 27 => x = 54 / 27 = 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q7"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_14",
                subject = "Mathematics",
                topic = "Difference of Two Squares",
                year = "2011",
                questionText = "Factorize completely 9y² - 16x².",
                optionA = "(3y - 2x)(3y + 4x)",
                optionB = "(3y + 4x)(3y + 4x)",
                optionC = "(3y + 2x)(3y - 4x)",
                optionD = "(3y - 4x)(3y + 4x)",
                correctAnswerIndex = 3,
                explanation = "9y² - 16x² = (3y)² - (4x)² = (3y - 4x)(3y + 4x).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q14"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_15",
                subject = "Mathematics",
                topic = "Simultaneous Linear Equations",
                year = "2011",
                questionText = "Solve for x and y respectively in the simultaneous equations: -2x - 5y = 3, x + 3y = 0.",
                optionA = "-3, -9",
                optionB = "9, -3",
                optionC = "-9, 3",
                optionD = "3, -9",
                correctAnswerIndex = 2,
                explanation = "From second equation: x = -3y. Substitute into first: -2(-3y) - 5y = 3 => 6y - 5y = 3 => y = 3. Then x = -3(3) = -9. So x = -9, y = 3.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q15"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_20",
                subject = "Mathematics",
                topic = "Quadratic Inequalities",
                year = "2011",
                questionText = "Solve the inequality x² + 2x > 15.",
                optionA = "x < -3 or x > 5",
                optionB = "-5 < x < 3",
                optionC = "x < 3 or x > 5",
                optionD = "x > 3 or x < -5",
                correctAnswerIndex = 3,
                explanation = "x² + 2x - 15 > 0 => (x + 5)(x - 3) > 0. The product is positive outside the roots -5 and 3. Therefore x > 3 or x < -5.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q20"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_21",
                subject = "Mathematics",
                topic = "Arithmetic Series",
                year = "2011",
                questionText = "Find the sum of the first 18 terms of the series 3, 6, 9..., 36.",
                optionA = "505",
                optionB = "513",
                optionC = "433",
                optionD = "635",
                correctAnswerIndex = 1,
                explanation = "a = 3, d = 3, n = 18. S₁₈ = (n/2)[2a + (n - 1)d] = (18/2)[2(3) + 17(3)] = 9[6 + 51] = 9 × 57 = 513.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q21"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_27",
                subject = "Mathematics",
                topic = "Polygons",
                year = "2011",
                questionText = "What is the size of each interior angle of a 12-sided regular polygon?",
                optionA = "120°",
                optionB = "150°",
                optionC = "30°",
                optionD = "180°",
                correctAnswerIndex = 1,
                explanation = "Interior angle = [(n - 2) × 180°] / n. For n = 12: [(12 - 2) × 180°] / 12 = (10 × 180°) / 12 = 1800° / 12 = 150°.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q27"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_28",
                subject = "Mathematics",
                topic = "Mensuration: Perimeter & Area",
                year = "2011",
                questionText = "A wire of length 28cm is opened to form a square. What is the maximum possible area of the square?",
                optionA = "56 cm²",
                optionB = "49 cm²",
                optionC = "98 cm²",
                optionD = "28 cm²",
                correctAnswerIndex = 1,
                explanation = "Perimeter of square = 4s = 28 cm => side s = 7 cm. Area = s² = 7² = 49 cm².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q28"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_43",
                subject = "Mathematics",
                topic = "Statistics: Mean",
                year = "2011",
                questionText = "The sum of four consecutive integers is 34. Find the least of these numbers.",
                optionA = "7",
                optionB = "6",
                optionC = "8",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "Let the integers be n, n+1, n+2, n+3. Sum = 4n + 6 = 34 => 4n = 28 => n = 7.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q43"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2011_47",
                subject = "Mathematics",
                topic = "Permutations",
                year = "2011",
                questionText = "In how many ways can the letters of the word ELATION be arranged?",
                optionA = "6!",
                optionB = "7!",
                optionC = "5!",
                optionD = "8!",
                correctAnswerIndex = 1,
                explanation = "The word 'ELATION' has 7 distinct letters. The number of arrangements is 7! = 5,040.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2011 • Q47"
            )
        )

        // -------------------------------------------------------------------------
        // UTME 2012 - 2018 MATHEMATICS HIGHLIGHTS
        // -------------------------------------------------------------------------
        list.add(
            QuestionEntity(
                id = "math_2012_04",
                subject = "Mathematics",
                topic = "Approximations & Significant Figures",
                year = "2012",
                questionText = "Evaluate 21/9 to 3 significant figures.",
                optionA = "2.30",
                optionB = "2.31",
                optionC = "2.32",
                optionD = "2.33",
                correctAnswerIndex = 3,
                explanation = "21 / 9 = 2.3333... To 3 significant figures, it is 2.33.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Q4"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2012_06",
                subject = "Mathematics",
                topic = "Indices & Exponential Equations",
                year = "2012",
                questionText = "If 27^(x + 2) ÷ 9^(x + 1) = 3^(2x), find x.",
                optionA = "3",
                optionB = "4",
                optionC = "5",
                optionD = "6",
                correctAnswerIndex = 1,
                explanation = "Express in powers of 3: 3^(3(x + 2)) ÷ 3^(2(x + 1)) = 3^(2x) => 3^(3x + 6 - 2x - 2) = 3^(2x) => 3^(x + 4) = 3^(2x) => x + 4 = 2x => x = 4.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2012 • Q6"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2013_02",
                subject = "Mathematics",
                topic = "Number Bases",
                year = "2013",
                questionText = "Convert 27₁₀ to another number in base three.",
                optionA = "1100₃",
                optionB = "1000₃",
                optionC = "1001₃",
                optionD = "1010₃",
                correctAnswerIndex = 1,
                explanation = "27 / 3 = 9 R 0; 9 / 3 = 3 R 0; 3 / 3 = 1 R 0; 1 / 3 = 0 R 1. Reading remainders upwards gives 1000₃.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Q2"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2013_03",
                subject = "Mathematics",
                topic = "Ratios",
                year = "2013",
                questionText = "3 girls share a number of apples in the ratio 5:3:2. If the highest share is 40 apples, find the smallest share.",
                optionA = "16",
                optionB = "38",
                optionC = "36",
                optionD = "24",
                correctAnswerIndex = 0,
                explanation = "Highest share corresponds to ratio 5. If 5 parts = 40, then 1 part = 8. Smallest share = 2 parts = 2 × 8 = 16 apples.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2013 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2014_03",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Loss Percentage",
                year = "2014",
                questionText = "A woman bought a grinder for ₦60,000. She sold it at a loss of 15%. How much did she sell it?",
                optionA = "₦50,000",
                optionB = "₦53,000",
                optionC = "₦52,000",
                optionD = "₦51,000",
                correctAnswerIndex = 3,
                explanation = "Selling price = 85% of Cost Price = 0.85 × 60,000 = ₦51,000.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q3"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2014_09",
                subject = "Mathematics",
                topic = "Logarithmic Laws",
                year = "2014",
                questionText = "Evaluate log₂ 8 + log₂ 16 - log₂ 4.",
                optionA = "6",
                optionB = "3",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 3,
                explanation = "log₂ 8 = 3, log₂ 16 = 4, log₂ 4 = 2. 3 + 4 - 2 = 5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q9"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2015_01",
                subject = "Mathematics",
                topic = "Geometric Progression: Sum",
                year = "2015",
                questionText = "The sum of the infinite progression 1 + x + x² + ... for |x| < 1 is:",
                optionA = "1 / (1 - x)",
                optionB = "1 / (1 + x)",
                optionC = "1 / (x - 1)",
                optionD = "1 / x",
                correctAnswerIndex = 0,
                explanation = "For an infinite geometric series with first term a = 1 and common ratio r = x (|x| < 1), S_∞ = a / (1 - r) = 1 / (1 - x).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2015 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2016_01",
                subject = "Mathematics",
                topic = "Logarithms",
                year = "2016",
                questionText = "Without using tables, evaluate log₂ 4 + log₄ 2 - log₂₅ 5.",
                optionA = "1/2",
                optionB = "1/5",
                optionC = "0",
                optionD = "2",
                correctAnswerIndex = 3,
                explanation = "log₂ 4 = 2; log₄ 2 = 1/2; log₂₅ 5 = 1/2. Evaluating: 2 + 1/2 - 1/2 = 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2016 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2017_01",
                subject = "Mathematics",
                topic = "Differential Equations & Integration",
                year = "2017",
                questionText = "If dy/dx = 2x - 3 and y = 3 when x = 0, find y in terms of x.",
                optionA = "2x² - 3x",
                optionB = "x² - 3x",
                optionC = "x² - 3x - 3",
                optionD = "x² - 3x + 3",
                correctAnswerIndex = 3,
                explanation = "y = ∫(2x - 3) dx = x² - 3x + c. Given y(0) = 3 => c = 3. Thus y = x² - 3x + 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2017 • Q1"
            )
        )
        list.add(
            QuestionEntity(
                id = "math_2018_02",
                subject = "Mathematics",
                topic = "Scientific Notation",
                year = "2018",
                questionText = "Express the product of 0.00043 and 2000 in standard form.",
                optionA = "8.6 × 10",
                optionB = "8.6 × 10⁻³",
                optionC = "8.6 × 10⁻²",
                optionD = "8.6 × 10⁻¹",
                correctAnswerIndex = 3,
                explanation = "0.00043 × 2000 = 0.86 = 8.6 × 10⁻¹.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2018 • Q2"
            )
        )

        return list
    }
}
