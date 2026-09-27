package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Complete JAMB Mathematics 2014 Past Questions & Answers Bank
 * Transcribed with 100% mathematical fidelity and comprehensive step-by-step solutions from EduNgr.
 * Contains 48 questions covering number bases, algebra, surds, calculus, matrices, geometry, statistics, and trigonometry.
 */
object JambMathematics2014ExamBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_01",
                subject = "Mathematics",
                topic = "Number Bases",
                year = "2014",
                questionText = "Find the value of 110111₂ + 10100₂",
                optionA = "1101011₂",
                optionB = "1001001₂",
                optionC = "1001011₂",
                optionD = "1001111₂",
                correctAnswerIndex = 2,
                explanation = "Binary addition:\n  1 1 0 1 1 1₂ (55₁₀)\n+ 0 1 0 1 0 0₂ (20₁₀)\n= 1 0 0 1 0 1 1₂ (75₁₀).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q1",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_02",
                subject = "Mathematics",
                topic = "Commercial Arithmetic",
                year = "2014",
                questionText = "A woman bought a grinder for ₦60,000. She sold it at a loss of 15%. How much did she sell it?",
                optionA = "₦53,000",
                optionB = "₦52,000",
                optionC = "₦51,000",
                optionD = "₦50,000",
                correctAnswerIndex = 2,
                explanation = "Loss = 15% of ₦60,000 = (15/100) × 60,000 = ₦9,000. Selling Price = Cost Price - Loss = ₦60,000 - ₦9,000 = ₦51,000.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q2",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_03",
                subject = "Mathematics",
                topic = "Approximation and Standard Form",
                year = "2014",
                questionText = "Express the product of 0.00043 and 2000 in standard form.",
                optionA = "8.6 × 10⁻³",
                optionB = "8.3 × 10⁻²",
                optionC = "8.6 × 10⁻¹",
                optionD = "8.6 × 10",
                correctAnswerIndex = 2,
                explanation = "0.00043 × 2000 = (4.3 × 10⁻⁴) × (2 × 10³) = 8.6 × 10⁻¹.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q3",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_04",
                subject = "Mathematics",
                topic = "Percentages",
                year = "2014",
                questionText = "A man donates 10% of his monthly net earnings to his church. If it amounts to ₦4,500, what is his net monthly income?",
                optionA = "₦40,500",
                optionB = "₦45,000",
                optionC = "₦52,500",
                optionD = "₦62,000",
                correctAnswerIndex = 1,
                explanation = "10% of Income M = ₦4,500 ⇒ (10/100) × M = 4,500 ⇒ M = 4,500 × 10 = ₦45,000.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q4",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_05",
                subject = "Mathematics",
                topic = "Logarithms",
                year = "2014",
                questionText = "If log 7.5 = 0.8751, evaluate 2 log 75 + log 750",
                optionA = "6.6252",
                optionB = "6.6253",
                optionC = "66.252",
                optionD = "66.253",
                correctAnswerIndex = 1,
                explanation = "log 75 = log(7.5 × 10) = 0.8751 + 1 = 1.8751.\nlog 750 = log(7.5 × 100) = 0.8751 + 2 = 2.8751.\n2 log 75 + log 750 = 2(1.8751) + 2.8751 = 3.7502 + 2.8751 = 6.6253.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q5",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_06",
                subject = "Mathematics",
                topic = "Indices and Algebra",
                year = "2014",
                questionText = "Solve for x in 8x⁻² = 2/25",
                optionA = "4",
                optionB = "6",
                optionC = "8",
                optionD = "10",
                correctAnswerIndex = 3,
                explanation = "8 / x² = 2 / 25 ⇒ 2x² = 8 × 25 = 200 ⇒ x² = 100 ⇒ x = √100 = 10.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q6",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_07",
                subject = "Mathematics",
                topic = "Surds",
                year = "2014",
                questionText = "Simplify (2√2 - √3) / (√2 + √3)",
                optionA = "3√6 - 7",
                optionB = "3√6 + 7",
                optionC = "3√6 - 1",
                optionD = "3√6 + 1",
                correctAnswerIndex = 0,
                explanation = "Rationalize the denominator by multiplying numerator and denominator by (√2 - √3):\n[(2√2 - √3)(√2 - √3)] / [(√2 + √3)(√2 - √3)]\n= [2(2) - 2√6 - √6 + 3] / (2 - 3)\n= (7 - 3√6) / (-1) = 3√6 - 7.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q7",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_08",
                subject = "Mathematics",
                topic = "Logarithms",
                year = "2014",
                questionText = "Evaluate Log₂ 8 + Log₂ 16 - Log₂ 4",
                optionA = "3",
                optionB = "4",
                optionC = "5",
                optionD = "6",
                correctAnswerIndex = 2,
                explanation = "Log₂ 8 = 3, Log₂ 16 = 4, Log₂ 4 = 2.\n3 + 4 - 2 = 5.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q8",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_09",
                subject = "Mathematics",
                topic = "Sets",
                year = "2014",
                questionText = "If P = {1, 2, 3, 4, 5} and P ∪ Q = {1, 2, 3, 4, 5, 6, 7}, list the elements in Q",
                optionA = "{6}",
                optionB = "{7}",
                optionC = "{6, 7}",
                optionD = "{5, 6}",
                correctAnswerIndex = 2,
                explanation = "The elements present in P ∪ Q that are not in P are {6, 7}. Thus Q contains at least {6, 7}.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q9",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_10",
                subject = "Mathematics",
                topic = "Change of Subject of Formula",
                year = "2014",
                questionText = "If gt² - k - w = 0, make g the subject of the formula",
                optionA = "(k + w) / t²",
                optionB = "(k - w) / t²",
                optionC = "(k + w) / t",
                optionD = "(k - w) / t",
                correctAnswerIndex = 0,
                explanation = "gt² = k + w ⇒ g = (k + w) / t².",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q10",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_11",
                subject = "Mathematics",
                topic = "Factorization",
                year = "2014",
                questionText = "Factorize 2y² - 15xy + 18x²",
                optionA = "(2y - 3x)(y + 6x)",
                optionB = "(2y - 3x)(y - 6x)",
                optionC = "(2y + 3x)(y - 6x)",
                optionD = "(3y + 2x)(y - 6x)",
                correctAnswerIndex = 1,
                explanation = "2y² - 12xy - 3xy + 18x² = 2y(y - 6x) - 3x(y - 6x) = (2y - 3x)(y - 6x).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q11",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_12",
                subject = "Mathematics",
                topic = "Polynomials",
                year = "2014",
                questionText = "Find the value of k if y - 1 is a factor of y³ + 4y² + ky - 6",
                optionA = "-6",
                optionB = "-4",
                optionC = "0",
                optionD = "1",
                correctAnswerIndex = 3,
                explanation = "By factor theorem, f(1) = 0:\n(1)³ + 4(1)² + k(1) - 6 = 0 ⇒ 1 + 4 + k - 6 = 0 ⇒ k - 1 = 0 ⇒ k = 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q12",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_13",
                subject = "Mathematics",
                topic = "Variation",
                year = "2014",
                questionText = "y varies directly as w². When y = 8, w = 2. Find y when w = 3",
                optionA = "18",
                optionB = "12",
                optionC = "9",
                optionD = "6",
                correctAnswerIndex = 0,
                explanation = "y = k w² ⇒ 8 = k(2)² = 4k ⇒ k = 2. When w = 3: y = 2(3)² = 2(9) = 18.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q13",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_14",
                subject = "Mathematics",
                topic = "Variation",
                year = "2014",
                questionText = "P varies directly as Q and inversely as R. When Q = 36 and R = 16, P = 27. Find the relation between P, Q and R.",
                optionA = "P = Q / (12R)",
                optionB = "P = 12Q / R",
                optionC = "P = 12QR",
                optionD = "P = 12 / (QR)",
                correctAnswerIndex = 1,
                explanation = "P = kQ / R ⇒ 27 = k(36) / 16 ⇒ k = (27 × 16) / 36 = 12. Thus P = 12Q / R.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q14",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_15",
                subject = "Mathematics",
                topic = "Inequalities",
                year = "2014",
                questionText = "What is the solution of (x - 5) / (x + 3) < -1?",
                optionA = "-3 < x < 1",
                optionB = "x < -3 or x > 1",
                optionC = "-3 < x < 5",
                optionD = "x < -3 or x > 5",
                correctAnswerIndex = 0,
                explanation = "(x - 5)/(x + 3) + 1 < 0 ⇒ (x - 5 + x + 3)/(x + 3) < 0 ⇒ (2x - 2)/(x + 3) < 0 ⇒ 2(x - 1)/(x + 3) < 0.\nTesting intervals gives -3 < x < 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q15",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_16",
                subject = "Mathematics",
                topic = "Inequalities",
                year = "2014",
                questionText = "Evaluate the inequality x/2 + 3/4 ≤ 5x/6 - 7/12",
                optionA = "x ≥ 4",
                optionB = "x ≤ 3",
                optionC = "x ≥ -3",
                optionD = "x ≤ -4",
                correctAnswerIndex = 0,
                explanation = "Multiply through by 12:\n6x + 9 ≤ 10x - 7 ⇒ 9 + 7 ≤ 10x - 6x ⇒ 16 ≤ 4x ⇒ x ≥ 4.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q16",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_17",
                subject = "Mathematics",
                topic = "Sequences and Series",
                year = "2014",
                questionText = "The 4th term of an A.P. is 13 while the 10th term is 31. Find the 24th term.",
                optionA = "89",
                optionB = "75",
                optionC = "73",
                optionD = "69",
                correctAnswerIndex = 2,
                explanation = "T₄ = a + 3d = 13, T₁₀ = a + 9d = 31.\nSubtracting gives 6d = 18 ⇒ d = 3 ⇒ a = 13 - 3(3) = 4.\nT₂₄ = a + 23d = 4 + 23(3) = 4 + 69 = 73.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q17",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_18",
                subject = "Mathematics",
                topic = "Geometric Progression",
                year = "2014",
                questionText = "What is the common ratio of the G.P. (√10 + √5) + (√10 + 2√5) + ...?",
                optionA = "√2",
                optionB = "√5",
                optionC = "3",
                optionD = "5",
                correctAnswerIndex = 0,
                explanation = "r = T₂ / T₁ = (√10 + 2√5) / (√10 + √5) = [√5(√2 + 2)] / [√5(√2 + 1)] = (√2 + 2)/(√2 + 1) = [√2(1 + √2)] / (√2 + 1) = √2.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q18",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_19",
                subject = "Mathematics",
                topic = "Binary Operations",
                year = "2014",
                questionText = "A binary operation * is defined by x * y = xʸ. If x * 2 = 12 - x, find the possible values of x",
                optionA = "3, 4",
                optionB = "3, -4",
                optionC = "-3, 4",
                optionD = "-3, -4",
                correctAnswerIndex = 1,
                explanation = "x * 2 = x² ⇒ x² = 12 - x ⇒ x² + x - 12 = 0 ⇒ (x + 4)(x - 3) = 0 ⇒ x = 3 or x = -4.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q19",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_20",
                subject = "Mathematics",
                topic = "Matrices",
                year = "2014",
                questionText = "Find y, if [[5, -6], [2, -7]] [x, y]ᵀ = [7, -11]ᵀ",
                optionA = "8",
                optionB = "5",
                optionC = "3",
                optionD = "2",
                correctAnswerIndex = 2,
                explanation = "5x - 6y = 7 ...(1)\n2x - 7y = -11 ...(2)\n2(1): 10x - 12y = 14\n5(2): 10x - 35y = -55\nSubtracting: 23y = 69 ⇒ y = 3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q20",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_21",
                subject = "Mathematics",
                topic = "Determinants",
                year = "2014",
                questionText = "If |[-x, 12], [-1, 4]| = -12, find x",
                optionA = "-6",
                optionB = "-2",
                optionC = "3",
                optionD = "6",
                correctAnswerIndex = 3,
                explanation = "Determinant: (-x)(4) - (-1)(12) = -12 ⇒ -4x + 12 = -12 ⇒ -4x = -24 ⇒ x = 6.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q21",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_22",
                subject = "Mathematics",
                topic = "Determinants",
                year = "2014",
                questionText = "Find the value of |[[0, 3, 2], [1, 7, 8], [0, 5, 4]]|",
                optionA = "12",
                optionB = "10",
                optionC = "-1",
                optionD = "-2",
                correctAnswerIndex = 3,
                explanation = "Expanding along Column 1:\n-1 × |[3, 2], [5, 4]| = -1 × (12 - 10) = -1 × 2 = -2.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q22",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_23",
                subject = "Mathematics",
                topic = "Polygons and Geometry",
                year = "2014",
                questionText = "How many sides has a regular polygon whose interior angle is 135°?",
                optionA = "12",
                optionB = "10",
                optionC = "9",
                optionD = "8",
                correctAnswerIndex = 3,
                explanation = "Exterior angle = 180° - 135° = 45°. Number of sides n = 360° / 45° = 8.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q23",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_24",
                subject = "Mathematics",
                topic = "Mensuration",
                year = "2014",
                questionText = "A cylindrical tank has a capacity of 6160m³. What is the depth of the tank if the radius of its base is 28m?",
                optionA = "8.0m",
                optionB = "7.5m",
                optionC = "5.0m",
                optionD = "2.5m",
                correctAnswerIndex = 3,
                explanation = "Volume V = π r² h ⇒ 6160 = (22/7) × 28 × 28 × h ⇒ 6160 = 22 × 4 × 28 × h = 2464 h ⇒ h = 6160 / 2464 = 2.5 m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q24",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_25",
                subject = "Mathematics",
                topic = "Loci",
                year = "2014",
                questionText = "The locus of a dog tethered to a pole with a rope of 4m is a",
                optionA = "circle with diameter 4m",
                optionB = "circle with radius 4m",
                optionC = "semi-circle with diameter 4m",
                optionD = "semi-circle with radius 4m",
                correctAnswerIndex = 1,
                explanation = "The locus of all points in a plane equidistant (4m) from a fixed central point is a circle with radius 4m.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q25",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_26",
                subject = "Mathematics",
                topic = "Coordinate Geometry",
                year = "2014",
                questionText = "Find the mid point of S(-5, 4) and T(-3, -2)",
                optionA = "-4, 2",
                optionB = "4, -2",
                optionC = "-4, 1",
                optionD = "4, -1",
                correctAnswerIndex = 2,
                explanation = "Midpoint = ((x₁ + x₂)/2, (y₁ + y₂)/2) = ((-5 - 3)/2, (4 - 2)/2) = (-8/2, 2/2) = (-4, 1).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q26",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_27",
                subject = "Mathematics",
                topic = "Coordinate Geometry",
                year = "2014",
                questionText = "The gradient of a line joining (x, 4) and (1, 2) is 1/2. Find the value of x",
                optionA = "5",
                optionB = "3",
                optionC = "-3",
                optionD = "-5",
                correctAnswerIndex = 0,
                explanation = "m = (y₂ - y₁) / (x₂ - x₁) ⇒ 1/2 = (2 - 4) / (1 - x) = -2 / (1 - x) ⇒ 1 - x = 2(-2) = -4 ⇒ -x = -5 ⇒ x = 5.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q27",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_28",
                subject = "Mathematics",
                topic = "Coordinate Geometry",
                year = "2014",
                questionText = "Calculate the mid point of the line segment y - 4x + 3 = 0, which lies between the x-axis and y-axis.",
                optionA = "(3/8, -3/2)",
                optionB = "(3, 3/8)",
                optionC = "(-2, 2)",
                optionD = "(-2, 3)",
                correctAnswerIndex = 0,
                explanation = "When y = 0: -4x + 3 = 0 ⇒ x = 3/4 ⇒ Point is (3/4, 0).\nWhen x = 0: y + 3 = 0 ⇒ y = -3 ⇒ Point is (0, -3).\nMidpoint = ((3/4 + 0)/2, (0 - 3)/2) = (3/8, -3/2).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q28",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_29",
                subject = "Mathematics",
                topic = "Straight Lines",
                year = "2014",
                questionText = "Find the equation of the straight line through (-2, 3) and perpendicular to 4x + 3y - 5 = 0",
                optionA = "3x - 4y + 18 = 0",
                optionB = "3x + 2y - 18 = 0",
                optionC = "4x + 5y + 3 = 0",
                optionD = "5x - 2y - 11 = 0",
                correctAnswerIndex = 0,
                explanation = "Slope of given line = -4/3. Perpendicular slope m = 3/4.\nEquation: y - 3 = 3/4(x + 2) ⇒ 4(y - 3) = 3(x + 2) ⇒ 4y - 12 = 3x + 6 ⇒ 3x - 4y + 18 = 0.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q29",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_30",
                subject = "Mathematics",
                topic = "Trigonometry",
                year = "2014",
                questionText = "If sin θ = 12/13, find the value of 1 + cos θ",
                optionA = "25/13",
                optionB = "18/13",
                optionC = "8/13",
                optionD = "5/13",
                correctAnswerIndex = 1,
                explanation = "cos θ = √(1 - sin²θ) = √(1 - 144/169) = √(25/169) = 5/13.\n1 + cos θ = 1 + 5/13 = 18/13.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q30",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_31",
                subject = "Mathematics",
                topic = "Differentiation",
                year = "2014",
                questionText = "If y = 4x³ - 2x² + x, find dy/dx",
                optionA = "8x² - 2x + 1",
                optionB = "8x² - 4x + 1",
                optionC = "12x² - 2x + 1",
                optionD = "12x² - 4x + 1",
                correctAnswerIndex = 3,
                explanation = "dy/dx = d/dx(4x³ - 2x² + x) = 12x² - 4x + 1.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q31",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_32",
                subject = "Mathematics",
                topic = "Differentiation",
                year = "2014",
                questionText = "If y = cos 3x, find dy/dx",
                optionA = "⅓ sin 3x",
                optionB = "-⅓ sin 3x",
                optionC = "3 sin 3x",
                optionD = "-3 sin 3x",
                correctAnswerIndex = 3,
                explanation = "By chain rule: dy/dx = -sin(3x) × d/dx(3x) = -3 sin 3x.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q32",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_33",
                subject = "Mathematics",
                topic = "Calculus and Extrema",
                year = "2014",
                questionText = "Find the minimum value of y = x² - 2x - 3",
                optionA = "4",
                optionB = "1",
                optionC = "-1",
                optionD = "-4",
                correctAnswerIndex = 3,
                explanation = "dy/dx = 2x - 2 = 0 ⇒ x = 1. Minimum value y = (1)² - 2(1) - 3 = 1 - 2 - 3 = -4.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q33",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_34",
                subject = "Mathematics",
                topic = "Integration",
                year = "2014",
                questionText = "Evaluate ∫ sin 2x dx",
                optionA = "cos 2x + k",
                optionB = "½ cos 2x + k",
                optionC = "-½ cos 2x + k",
                optionD = "-cos 2x + k",
                correctAnswerIndex = 2,
                explanation = "∫ sin 2x dx = -½ cos 2x + k.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q34",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_35",
                subject = "Mathematics",
                topic = "Integration",
                year = "2014",
                questionText = "Evaluate ∫ (2x + 3)^(½) dx",
                optionA = "¹/₁₂ (2x + 3)⁶ + k",
                optionB = "⅓ (2x + 3)^(½) + k",
                optionC = "⅓ (2x + 3)^(3/2) + k",
                optionD = "¹/₁₂ (2x + 3)^(3/4) + k",
                correctAnswerIndex = 2,
                explanation = "Let u = 2x + 3, du = 2 dx ⇒ dx = du/2.\n∫ u^(½) (du/2) = ½ × (u^(3/2) / (3/2)) + k = ⅓ (2x + 3)^(3/2) + k.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q35",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_36",
                subject = "Mathematics",
                topic = "Statistics - Measures of Location",
                year = "2014",
                questionText = "The mean of 2 - t, 4 + t, 3 - 2t, 2 + t and t - 1 is",
                optionA = "t",
                optionB = "-t",
                optionC = "2",
                optionD = "-2",
                correctAnswerIndex = 2,
                explanation = "Sum = (2 - t) + (4 + t) + (3 - 2t) + (2 + t) + (t - 1) = (2 + 4 + 3 + 2 - 1) + (-t + t - 2t + t + t) = 10 + 0 = 10.\nMean = Sum / 5 = 10 / 5 = 2.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q36",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_37",
                subject = "Mathematics",
                topic = "Statistics",
                year = "2014",
                questionText = "[TABLE: Values 0, 1, 2, 3, 4 with Frequencies 1, 2, 2, 1, 9]\nFind the mode of the distribution above",
                optionA = "1",
                optionB = "2",
                optionC = "3",
                optionD = "4",
                correctAnswerIndex = 3,
                explanation = "The mode is the value with the highest frequency. Value 4 has the highest frequency (9).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q37",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_38",
                subject = "Mathematics",
                topic = "Statistics",
                year = "2014",
                questionText = "Find the median of 5, 9, 1, 10, 3, 8, 9, 2, 4, 5, 5, 5, 7, 3 and 6",
                optionA = "6",
                optionB = "5",
                optionC = "4",
                optionD = "3",
                correctAnswerIndex = 1,
                explanation = "Arranging in ascending order (15 numbers):\n1, 2, 3, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9, 9, 10.\nThe 8th (middle) term is 5.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q38",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_39",
                subject = "Mathematics",
                topic = "Statistics - Dispersion",
                year = "2014",
                questionText = "Find the standard deviation of 5, 4, 3, 2, 1",
                optionA = "√2",
                optionB = "√3",
                optionC = "√6",
                optionD = "√10",
                correctAnswerIndex = 0,
                explanation = "Mean x̄ = (5 + 4 + 3 + 2 + 1) / 5 = 15 / 5 = 3.\nDeviations (x - x̄): 2, 1, 0, -1, -2.\nSquared deviations d²: 4, 1, 0, 1, 4.\nSum of d² = 10. Variance = 10 / 5 = 2. Standard Deviation = √2.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q39",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_40",
                subject = "Mathematics",
                topic = "Permutations and Combinations",
                year = "2014",
                questionText = "In how many ways can a team of 3 girls be selected from 7 girls?",
                optionA = "7! / 3!",
                optionB = "7! / 4!",
                optionC = "7! / (3! 4!)",
                optionD = "7! / (2! 5!)",
                correctAnswerIndex = 2,
                explanation = "Combination ⁷C₃ = 7! / [(7 - 3)! 3!] = 7! / (4! 3!) = 35 ways.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q40",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_41",
                subject = "Mathematics",
                topic = "Probability",
                year = "2014",
                questionText = "[TABLE: Die outcome numbers 1, 2, 3, 4, 5, 6 with Frequencies 18, 22, 20, 16, 10, 14 (total 100 throws)]\nWhat is the probability of obtaining at least a 4?",
                optionA = "1/5",
                optionB = "1/2",
                optionC = "2/5",
                optionD = "3/4",
                correctAnswerIndex = 2,
                explanation = "Frequencies for outcomes ≥ 4 (i.e. 4, 5, 6) = 16 + 10 + 14 = 40. Total outcomes = 100. P(at least 4) = 40 / 100 = 2/5.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q41",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_42",
                subject = "Mathematics",
                topic = "Probability",
                year = "2014",
                questionText = "A number is chosen at random from 10 to 30 both inclusive. What is the probability that the number is divisible by 3?",
                optionA = "2/15",
                optionB = "1/10",
                optionC = "1/3",
                optionD = "2/5",
                correctAnswerIndex = 2,
                explanation = "Total integers from 10 to 30 inclusive = (30 - 10) + 1 = 21.\nMultiples of 3 in range: {12, 15, 18, 21, 24, 27, 30} (7 numbers).\nP = 7 / 21 = 1/3.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q42",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_43",
                subject = "Mathematics",
                topic = "Sets and Venn Diagrams",
                year = "2014",
                questionText = "[DIAGRAM: Three intersecting Venn diagram sets P, Q, R with shaded regions (P ∩ Q) and (P ∩ R)]\nFrom the venn diagram above, the shaded parts represent",
                optionA = "(P ∩ Q) ∪ (P ∩ R)",
                optionB = "(P ∪ Q) ∩ (P ∩ R)",
                optionC = "(P ∪ Q) ∪ (P ∪ R)",
                optionD = "(P ∩ Q) ∪ (P ∪ R)",
                correctAnswerIndex = 0,
                explanation = "The shaded region consists of the intersection of P with Q unioned with the intersection of P with R: (P ∩ Q) ∪ (P ∩ R).",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q43",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_44",
                subject = "Mathematics",
                topic = "Geometry - Angles and Triangles",
                year = "2014",
                questionText = "[DIAGRAM: Parallel lines KL // NM with transversal and bisector LN of ∠KNM, ∠KLN = 54°, ∠MKN = 35°]\nIn the figure above, KL//NM, LN bisects ∠KNM. If angle KLN is 54° and angle MKN is 35°, calculate the size of angle KMN.",
                optionA = "91°",
                optionB = "89°",
                optionC = "37°",
                optionD = "19°",
                correctAnswerIndex = 2,
                explanation = "Since KL // NM, alternate angle ∠LNM = ∠KLN = 54°.\nSince LN bisects ∠KNM, ∠KNM = 2 × 54° = 108°.\nIn ΔKMN: ∠KMN + ∠MKN + ∠KNM = 180° ⇒ ∠KMN + 35° + 108° = 180° ⇒ ∠KMN = 180° - 143° = 37°.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q44",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_45",
                subject = "Mathematics",
                topic = "Geometry - Lines and Angles",
                year = "2014",
                questionText = "[DIAGRAM: Intersecting straight lines with vertically opposite angles q° = 30° and adjacent angle (p + 2q)° on straight line]\nFrom the figure above, what is the value of p?",
                optionA = "135°",
                optionB = "90°",
                optionC = "60°",
                optionD = "45°",
                correctAnswerIndex = 1,
                explanation = "q° = 30° (vertically opposite angles).\nAngles on a straight line: (p + 2q)° + 30° = 180° ⇒ p + 2(30) + 30 = 180 ⇒ p + 90 = 180 ⇒ p = 90°.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q45",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_46",
                subject = "Mathematics",
                topic = "Trigonometry - Sine Rule",
                year = "2014",
                questionText = "[DIAGRAM: Right triangle with base angles 30° and 60°, side opposite 30° = 10cm, side x opposite 60°]\nFind the value of x in the figure above",
                optionA = "20√3 cm",
                optionB = "10√3 cm",
                optionC = "5√3 cm",
                optionD = "4√3 cm",
                correctAnswerIndex = 1,
                explanation = "By Sine rule: x / sin 60° = 10 / sin 30° ⇒ x = (10 sin 60°) / sin 30° = [10 × (√3/2)] / (1/2) = 10√3 cm.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q46",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_47",
                subject = "Mathematics",
                topic = "Coordinate Geometry",
                year = "2014",
                questionText = "[DIAGRAM: Coordinate Cartesian axes showing line passing through y-intercept (0, 5) and x-intercept (5, 0)]\nIn the figure above, what is the equation of the line that passes the y-axis at (0, 5) and passes the x-axis at (5, 0)?",
                optionA = "y = x + 5",
                optionB = "y = -x + 5",
                optionC = "y = x - 5",
                optionD = "y = -x - 5",
                correctAnswerIndex = 1,
                explanation = "Intercept form: x/a + y/b = 1 ⇒ x/5 + y/5 = 1 ⇒ x + y = 5 ⇒ y = -x + 5.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q47",
                isVerifiedJamb = true
            )
        )
        list.add(
            QuestionEntity(
                id = "jamb_maths_2014_48",
                subject = "Mathematics",
                topic = "Pie Charts and Statistics",
                year = "2014",
                questionText = "[DIAGRAM: Pie chart of food items with Gari = 70°, Rice = 80°, Beans = 50°, and Yam]\nThe pie chart above shows the monthly distribution of a man's salary on food items. If he spent ₦8,000 on rice, how much did he spend on yam?",
                optionA = "₦42,000",
                optionB = "₦18,000",
                optionC = "₦16,000",
                optionD = "₦12,000",
                correctAnswerIndex = 2,
                explanation = "Yam sector angle = 360° - (70° + 80° + 50°) = 360° - 200° = 160°.\nSince 80° corresponds to ₦8,000 (i.e. ₦100 per degree), Yam expenditure (160°) = 160 × ₦100 = ₦16,000.",
                imageUrl = null,
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2014 • Q48",
                isVerifiedJamb = true
            )
        )
        return list
    }
}
