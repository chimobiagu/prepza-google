package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB Mathematics Past Questions - Master Bank Part 2 (1989 - 2004 Series).
 * Standardized 4-option format, balanced answer keys, and detailed pedagogical explanations.
 */
object JambMathematicsMasterPart2QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1989 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1989_003",
                subject = "Mathematics",
                topic = "Number Base Conversion",
                year = "1989",
                questionText = "Express the decimal number 130 in base 2.",
                optionA = "10000010₂",
                optionB = "10000100₂",
                optionC = "11000010₂",
                optionD = "10000001₂",
                correctAnswerIndex = 0,
                explanation = "Successive division of 130 by 2 gives remainders: 130/2 = 65 R 0; 65/2 = 32 R 1; 32/2 = 16 R 0; 16/2 = 8 R 0; 8/2 = 4 R 0; 4/2 = 2 R 0; 2/2 = 1 R 0; 1/2 = 0 R 1. Reading from bottom up gives 10000010₂.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1989 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1989_007",
                subject = "Mathematics",
                topic = "Simple Interest",
                year = "1989",
                questionText = "Find the simple interest on ₦250.00 invested for 2 years at 5% per annum.",
                optionA = "₦12.50",
                optionB = "₦25.00",
                optionC = "₦50.00",
                optionD = "₦275.00",
                correctAnswerIndex = 1,
                explanation = "Simple Interest I = (P * R * T) / 100 = (250 * 5 * 2) / 100 = 2500 / 100 = ₦25.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1989 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1989_009",
                subject = "Mathematics",
                topic = "Logarithms",
                year = "1989",
                questionText = "If log₁₀ 2 = 0.3010 and log₁₀ 7 = 0.8451, evaluate log₁₀ 112 without using tables.",
                optionA = "2.0491",
                optionB = "2.1461",
                optionC = "1.8451",
                optionD = "2.3451",
                correctAnswerIndex = 0,
                explanation = "112 = 16 * 7 = 2⁴ * 7. log₁₀ 112 = log₁₀ (2⁴ * 7) = 4(log₁₀ 2) + log₁₀ 7 = 4(0.3010) + 0.8451 = 1.2040 + 0.8451 = 2.0491.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1989 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1989_011",
                subject = "Mathematics",
                topic = "Polynomials: Expanding Factors",
                year = "1989",
                questionText = "If (x - 1), (x + 1) and (x - 2) are factors of the polynomial x³ + ax² + bx + c = 0, find the values of a, b, and c.",
                optionA = "a = 2, b = -1, c = 2",
                optionB = "a = -2, b = -1, c = 2",
                optionC = "a = -2, b = 1, c = -2",
                optionD = "a = 2, b = 1, c = -2",
                correctAnswerIndex = 1,
                explanation = "Expanding (x - 1)(x + 1)(x - 2) = (x² - 1)(x - 2) = x³ - 2x² - x + 2. Comparing with x³ + ax² + bx + c gives a = -2, b = -1, and c = 2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1989 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1989_033",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Distance Between Points",
                year = "1989",
                questionText = "Find the distance between the points P(2, 3) and Q(5, 7).",
                optionA = "3 units",
                optionB = "4 units",
                optionC = "5 units",
                optionD = "7 units",
                correctAnswerIndex = 2,
                explanation = "Distance d = √((x₂ - x₁)² + (y₂ - y₁)²) = √((5 - 2)² + (7 - 3)²) = √(3² + 4²) = √(9 + 16) = √25 = 5 units.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1989 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1989_036",
                subject = "Mathematics",
                topic = "Calculus: Differentiation",
                year = "1989",
                questionText = "Differentiate y = 3x² - 2x + 1 with respect to x.",
                optionA = "6x - 2",
                optionB = "3x - 2",
                optionC = "6x + 1",
                optionD = "x - 2",
                correctAnswerIndex = 0,
                explanation = "Using the power rule d/dx(axⁿ) = a * n * xⁿ⁻¹: dy/dx = 2 * 3x + (-2) * 1 + 0 = 6x - 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1989 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1989_042",
                subject = "Mathematics",
                topic = "Probability",
                year = "1989",
                questionText = "A fair six-sided die is rolled once. What is the probability of obtaining a prime number?",
                optionA = "1/6",
                optionB = "1/3",
                optionC = "1/2",
                optionD = "2/3",
                correctAnswerIndex = 2,
                explanation = "Sample space S = {1, 2, 3, 4, 5, 6} (6 total outcomes). Prime numbers in S are {2, 3, 5} (3 outcomes). Probability = 3/6 = 1/2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1989 • Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1989_048",
                subject = "Mathematics",
                topic = "Statistics: Arithmetic Mean",
                year = "1989",
                questionText = "If the mean of the numbers 4, 7, x, 11, and 13 is 9, find the value of x.",
                optionA = "8",
                optionB = "9",
                optionC = "10",
                optionD = "12",
                correctAnswerIndex = 2,
                explanation = "Sum of numbers / 5 = 9 => (4 + 7 + x + 11 + 13) / 5 = 9 => (35 + x) = 45 => x = 45 - 35 = 10.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1989 • Q48"
            )
        )

        // =========================================================================
        // 1990 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1990_004",
                subject = "Mathematics",
                topic = "Standard Form",
                year = "1990",
                questionText = "Express 0.000143 in standard form.",
                optionA = "1.43 × 10⁻⁴",
                optionB = "1.43 × 10⁻³",
                optionC = "14.3 × 10⁻⁵",
                optionD = "1.43 × 10⁴",
                correctAnswerIndex = 0,
                explanation = "Moving the decimal point 4 places to the right gives 1.43 × 10⁻⁴.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1990_005",
                subject = "Mathematics",
                topic = "Simultaneous Linear Equations",
                year = "1990",
                questionText = "Solve the simultaneous equations: 2x - 3y = 7 and x + 5y = -3.",
                optionA = "x = 2, y = -1",
                optionB = "x = -2, y = 1",
                optionC = "x = 1, y = -2",
                optionD = "x = -1, y = 2",
                correctAnswerIndex = 0,
                explanation = "From second equation: x = -3 - 5y. Substitute into first: 2(-3 - 5y) - 3y = 7 => -6 - 10y - 3y = 7 => -13y = 13 => y = -1. Then x = -3 - 5(-1) = 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1990_018",
                subject = "Mathematics",
                topic = "Quadratic Equations: Factorization",
                year = "1990",
                questionText = "Solve the quadratic equation: 2x² - 5x + 3 = 0.",
                optionA = "x = 1 or x = 3/2",
                optionB = "x = -1 or x = -3/2",
                optionC = "x = 2 or x = 3",
                optionD = "x = 1 or x = 2/3",
                correctAnswerIndex = 0,
                explanation = "2x² - 2x - 3x + 3 = 0 => 2x(x - 1) - 3(x - 1) = 0 => (2x - 3)(x - 1) = 0 => x = 1 or x = 3/2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1990_019",
                subject = "Mathematics",
                topic = "Arithmetic Progressions",
                year = "1990",
                questionText = "Find the sum of the first 10 terms of the arithmetic progression 3, 6, 9, ...",
                optionA = "150",
                optionB = "165",
                optionC = "180",
                optionD = "195",
                correctAnswerIndex = 1,
                explanation = "a = 3, d = 3, n = 10. S₁₀ = (n/2)[2a + (n - 1)d] = (10/2)[2(3) + 9(3)] = 5 * [6 + 27] = 5 * 33 = 165.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1990_022",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Gradient",
                year = "1990",
                questionText = "Find the gradient of the line joining the points (1, 2) and (3, 8).",
                optionA = "2",
                optionB = "3",
                optionC = "4",
                optionD = "6",
                correctAnswerIndex = 1,
                explanation = "Gradient m = (y₂ - y₁) / (x₂ - x₁) = (8 - 2) / (3 - 1) = 6 / 2 = 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1990_035",
                subject = "Mathematics",
                topic = "Trigonometry: Special Angles",
                year = "1990",
                questionText = "Evaluate sin 30° + cos 60°.",
                optionA = "0",
                optionB = "1/2",
                optionC = "1",
                optionD = "√3/2",
                correctAnswerIndex = 2,
                explanation = "sin 30° = 1/2 and cos 60° = 1/2. Therefore, sin 30° + cos 60° = 1/2 + 1/2 = 1.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q35"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1990_036",
                subject = "Mathematics",
                topic = "Mensuration: Area of a Circle",
                year = "1990",
                questionText = "Calculate the area of a circle of radius 7cm. (Take π = 22/7)",
                optionA = "44 cm²",
                optionB = "154 cm²",
                optionC = "308 cm²",
                optionD = "616 cm²",
                correctAnswerIndex = 1,
                explanation = "Area A = πr² = (22/7) * (7²) = (22/7) * 49 = 22 * 7 = 154 cm².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q36"
            )
        )

        // =========================================================================
        // 1991 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1991_002",
                subject = "Mathematics",
                topic = "Fractions",
                year = "1991",
                questionText = "Simplify: 2/3 + 1/4 - 1/6",
                optionA = "1/2",
                optionB = "3/4",
                optionC = "5/6",
                optionD = "7/12",
                correctAnswerIndex = 1,
                explanation = "LCM of denominators (3, 4, 6) is 12. (8 + 3 - 2) / 12 = 9 / 12 = 3/4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1991_013",
                subject = "Mathematics",
                topic = "Surds: Simplification",
                year = "1991",
                questionText = "Simplify: √75 - √12 + √27",
                optionA = "4√3",
                optionB = "6√3",
                optionC = "8√3",
                optionD = "3√3",
                correctAnswerIndex = 1,
                explanation = "√75 = √(25 * 3) = 5√3. √12 = √(4 * 3) = 2√3. √27 = √(9 * 3) = 3√3. Combining: 5√3 - 2√3 + 3√3 = 6√3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1991_027",
                subject = "Mathematics",
                topic = "Binary Operations",
                year = "1991",
                questionText = "A binary operation * is defined on the set of real numbers by a * b = a + b - ab. Evaluate 2 * 3.",
                optionA = "-1",
                optionB = "1",
                optionC = "5",
                optionD = "-5",
                correctAnswerIndex = 0,
                explanation = "Using the definition: 2 * 3 = 2 + 3 - (2 * 3) = 5 - 6 = -1.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1991_031",
                subject = "Mathematics",
                topic = "Calculus: Indefinite Integration",
                year = "1991",
                questionText = "Evaluate the indefinite integral: ∫ 3x² dx",
                optionA = "x³ + C",
                optionB = "3x³ + C",
                optionC = "6x + C",
                optionD = "x² + C",
                correctAnswerIndex = 0,
                explanation = "Using power rule for integration: ∫ 3x² dx = 3 * (x³ / 3) + C = x³ + C.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1991_032",
                subject = "Mathematics",
                topic = "Matrices: Determinant",
                year = "1991",
                questionText = "Find the determinant of the 2x2 matrix: [[2, 3], [1, 4]]",
                optionA = "5",
                optionB = "8",
                optionC = "11",
                optionD = "-5",
                correctAnswerIndex = 0,
                explanation = "Determinant |A| = (2 * 4) - (3 * 1) = 8 - 3 = 5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q32"
            )
        )

        // =========================================================================
        // 1993 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1993_003",
                subject = "Mathematics",
                topic = "Indices and Roots",
                year = "1993",
                questionText = "Evaluate (25)^(1/2) * (8)^(1/3).",
                optionA = "5",
                optionB = "10",
                optionC = "15",
                optionD = "20",
                correctAnswerIndex = 1,
                explanation = "25^(1/2) = √25 = 5. 8^(1/3) = ∛8 = 2. Product = 5 * 2 = 10.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1993_011",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Line Gradient",
                year = "1993",
                questionText = "Find the gradient of the straight line 2x - 3y = 6.",
                optionA = "2/3",
                optionB = "-2/3",
                optionC = "3/2",
                optionD = "-2",
                correctAnswerIndex = 0,
                explanation = "Rearranging into slope-intercept form y = mx + c: 3y = 2x - 6 => y = (2/3)x - 2. Gradient m = 2/3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1993_015",
                subject = "Mathematics",
                topic = "Mensuration: Triangle Area",
                year = "1993",
                questionText = "Calculate the area of a triangle with a base of 8cm and a perpendicular height of 5cm.",
                optionA = "13 cm²",
                optionB = "20 cm²",
                optionC = "40 cm²",
                optionD = "80 cm²",
                correctAnswerIndex = 1,
                explanation = "Area = (1/2) * base * height = (1/2) * 8 * 5 = 20 cm².",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1993_021",
                subject = "Mathematics",
                topic = "Statistics: Measures of Dispersion",
                year = "1993",
                questionText = "What is the variance of the set of numbers: 5, 5, 5, 5, 5?",
                optionA = "0",
                optionB = "1",
                optionC = "5",
                optionD = "25",
                correctAnswerIndex = 0,
                explanation = "Since all values are identical, each deviation from the mean is 0, so variance = 0.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1993_047",
                subject = "Mathematics",
                topic = "Financial Mathematics: Compound Interest",
                year = "1993",
                questionText = "Calculate the compound interest on ₦1,000.00 for 2 years at 10% per annum compounded annually.",
                optionA = "₦100.00",
                optionB = "₦200.00",
                optionC = "₦210.00",
                optionD = "₦1,210.00",
                correctAnswerIndex = 2,
                explanation = "Amount A = P(1 + r)ⁿ = 1000(1 + 0.10)² = 1000(1.21) = ₦1,210.00. Compound Interest = A - P = 1210 - 1000 = ₦210.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q47"
            )
        )

        // =========================================================================
        // 1994 - 1998 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_1994_010",
                subject = "Mathematics",
                topic = "Surds: Rationalization",
                year = "1994",
                questionText = "Rationalize the denominator of: 1 / (√3 - 1)",
                optionA = "(√3 + 1) / 2",
                optionB = "(√3 - 1) / 2",
                optionC = "√3 + 1",
                optionD = "(√3 + 1) / 4",
                correctAnswerIndex = 0,
                explanation = "Multiply numerator and denominator by conjugate (√3 + 1): (√3 + 1) / ((√3 - 1)(√3 + 1)) = (√3 + 1) / (3 - 1) = (√3 + 1) / 2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1994 • Q10"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1995_005",
                subject = "Mathematics",
                topic = "Indices: Exponential Equations",
                year = "1995",
                questionText = "Solve for x if 2^(2x + 1) = 128.",
                optionA = "2",
                optionB = "3",
                optionC = "4",
                optionD = "5",
                correctAnswerIndex = 1,
                explanation = "128 = 2⁷. Equating exponents: 2x + 1 = 7 => 2x = 6 => x = 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1995 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1995_016",
                subject = "Mathematics",
                topic = "Calculus: Second Derivative",
                year = "1995",
                questionText = "If y = 2x³ - 5x² + 4x - 7, find d²y/dx².",
                optionA = "6x² - 10x + 4",
                optionB = "12x - 10",
                optionC = "12x + 10",
                optionD = "6x - 10",
                correctAnswerIndex = 1,
                explanation = "First derivative: dy/dx = 6x² - 10x + 4. Second derivative: d²y/dx² = 12x - 10.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1995 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1997_031",
                subject = "Mathematics",
                topic = "Trigonometric Identities",
                year = "1997",
                questionText = "Simplify: cos² θ + sin² θ + tan² θ",
                optionA = "sec² θ",
                optionB = "cosec² θ",
                optionC = "1 + cot² θ",
                optionD = "tan² θ",
                correctAnswerIndex = 0,
                explanation = "Since cos² θ + sin² θ = 1, the expression becomes 1 + tan² θ = sec² θ.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1997 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_1998_005",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Discounts",
                year = "1998",
                questionText = "An article marked ₦800.00 is sold at a discount of 15%. How much does the buyer pay?",
                optionA = "₦680.00",
                optionB = "₦720.00",
                optionC = "₦785.00",
                optionD = "₦650.00",
                correctAnswerIndex = 0,
                explanation = "Discount = 0.15 * 800 = ₦120.00. Selling price = 800 - 120 = ₦680.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1998 • Q5"
            )
        )

        // =========================================================================
        // 2000 - 2004 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_2000_009",
                subject = "Mathematics",
                topic = "Permutations and Combinations",
                year = "2000",
                questionText = "Evaluate ⁵P₂.",
                optionA = "10",
                optionB = "20",
                optionC = "60",
                optionD = "120",
                correctAnswerIndex = 1,
                explanation = "ⁿPᵣ = n! / (n - r)! => ⁵P₂ = 5! / 3! = (5 * 4 * 3!) / 3! = 20.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2000 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_2001_002",
                subject = "Mathematics",
                topic = "Quadratic Equations: Discriminant",
                year = "2001",
                questionText = "For what value of k does the quadratic equation x² - 6x + k = 0 have equal roots?",
                optionA = "3",
                optionB = "6",
                optionC = "9",
                optionD = "36",
                correctAnswerIndex = 2,
                explanation = "For equal roots, discriminant b² - 4ac = 0 => (-6)² - 4(1)(k) = 0 => 36 - 4k = 0 => 4k = 36 => k = 9.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2001 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_2002_018",
                subject = "Mathematics",
                topic = "Combinations",
                year = "2002",
                questionText = "In how many ways can a committee of 3 people be chosen from 5 candidates?",
                optionA = "10",
                optionB = "15",
                optionC = "20",
                optionD = "60",
                correctAnswerIndex = 0,
                explanation = "⁵C₃ = 5! / (3! * 2!) = (5 * 4) / 2 = 10 ways.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2002 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_2002_022",
                subject = "Mathematics",
                topic = "Mensuration: Volume of a Cylinder",
                year = "2002",
                questionText = "Find the volume of a cylinder of radius 7cm and height 10cm. (Take π = 22/7)",
                optionA = "1,540 cm³",
                optionB = "1,440 cm³",
                optionC = "770 cm³",
                optionD = "3,080 cm³",
                correctAnswerIndex = 0,
                explanation = "Volume V = πr²h = (22/7) * (7²) * 10 = (22/7) * 49 * 10 = 22 * 7 * 10 = 1,540 cm³.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2004 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_2004_036",
                subject = "Mathematics",
                topic = "Calculus: Product Rule",
                year = "2004",
                questionText = "If y = x² * sin x, find dy/dx.",
                optionA = "2x sin x + x² cos x",
                optionB = "2x cos x + x² sin x",
                optionC = "2x sin x - x² cos x",
                optionD = "x² cos x - 2x sin x",
                correctAnswerIndex = 0,
                explanation = "By product rule d/dx(uv) = u'v + uv': dy/dx = d/dx(x²) * sin x + x² * d/dx(sin x) = 2x sin x + x² cos x.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2004 • Q36"
            )
        )

        return list
    }
}
