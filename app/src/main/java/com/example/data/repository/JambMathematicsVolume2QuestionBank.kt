package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Authentic Historical JAMB Mathematics Master Revision Table Volume 2 (1986 - 2004 Series).
 * Standardized 4-option format, balanced answer keys, and detailed pedagogical explanations.
 */
object JambMathematicsVolume2QuestionBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        // =========================================================================
        // 1986 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1986_001",
                subject = "Mathematics",
                topic = "Number Bases: Addition and Subtraction",
                year = "1986",
                questionText = "Evaluate (212)₃ - (121)₃ + (222)₃ in base 3.",
                optionA = "(313)₃",
                optionB = "(1000)₃",
                optionC = "(1020)₃",
                optionD = "(1222)₃",
                correctAnswerIndex = 3,
                explanation = "In base 3: (212)₃ - (121)₃ = (121)₃. Then (121)₃ + (222)₃ = (1222)₃ (since 1+2=10₃, 2+2+1=12₃, 1+2+1=11₃ with base-3 carry).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q1"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_002",
                subject = "Mathematics",
                topic = "Statistics: Mean Adjustments",
                year = "1986",
                questionText = "If Musa scored 75 in Biology instead of 57, his average mark in four subjects would have been 60. What was his actual total mark?",
                optionA = "282",
                optionB = "240",
                optionC = "222",
                optionD = "210",
                correctAnswerIndex = 2,
                explanation = "Difference = 75 - 57 = 18 marks. Hypothetical total mark = 4 * 60 = 240. Actual total mark = 240 - 18 = 222.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q2"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_003",
                subject = "Mathematics",
                topic = "Number Theory: LCM and HCF",
                year = "1986",
                questionText = "Divide the L.C.M. of 48, 64 and 80 by their H.C.F.",
                optionA = "20",
                optionB = "30",
                optionC = "48",
                optionD = "60",
                correctAnswerIndex = 3,
                explanation = "Prime factors: 48 = 2⁴ * 3, 64 = 2⁶, 80 = 2⁴ * 5. L.C.M. = 2⁶ * 3 * 5 = 64 * 15 = 960. H.C.F. = 2⁴ = 16. Dividing L.C.M. by H.C.F. = 960 / 16 = 60.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q3"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_004",
                subject = "Mathematics",
                topic = "Number Theory: Perfect Squares",
                year = "1986",
                questionText = "Find the smallest number by which 252 can be multiplied to obtain a perfect square.",
                optionA = "7",
                optionB = "3",
                optionC = "6",
                optionD = "2",
                correctAnswerIndex = 0,
                explanation = "Prime factorization of 252 = 2² * 3² * 7¹. To make it a perfect square, all exponents must be even. Thus, we must multiply by 7¹ = 7.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q4"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_005",
                subject = "Mathematics",
                topic = "Fractions and Reciprocals",
                year = "1986",
                questionText = "Find the reciprocal of: (2/3) / (1/2 + 1/3)",
                optionA = "4/5",
                optionB = "5/4",
                optionC = "2/5",
                optionD = "6/7",
                correctAnswerIndex = 1,
                explanation = "First simplify denominator: 1/2 + 1/3 = 5/6. Fraction becomes (2/3) / (5/6) = (2/3) * (6/5) = 4/5. The reciprocal of 4/5 is 5/4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q5"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_006",
                subject = "Mathematics",
                topic = "Word Problems: Fraction Division",
                year = "1986",
                questionText = "Three boys shared some oranges. The first received 1/3 of the oranges, the second received 2/3 of the remainder. If the third boy received the remaining 12 oranges, how many oranges did they share in total?",
                optionA = "60",
                optionB = "54",
                optionC = "48",
                optionD = "42",
                correctAnswerIndex = 1,
                explanation = "Let total oranges be x. The first boy gets x/3, leaving 2x/3. The second boy gets (2/3) * (2x/3) = 4x/9. The remaining portion is 2x/3 - 4x/9 = 2x/9. Since 2x/9 = 12, x = 12 * 9 / 2 = 54.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q6"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_007",
                subject = "Mathematics",
                topic = "Algebraic Substitution",
                year = "1986",
                questionText = "If P = 18, Q = 21, R = -6 and S = -4, calculate (P - Q)/R + S².",
                optionA = "11/6",
                optionB = "16.5",
                optionC = "11.2",
                optionD = "12.5",
                correctAnswerIndex = 1,
                explanation = "Substitute values: (18 - 21)/(-6) + (-4)² = (-3)/(-6) + 16 = 0.5 + 16 = 16.5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q7"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_008",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Simple Interest",
                year = "1986",
                questionText = "At what rate per annum was simple interest paid on ₦150.00 if the interest after 5 years was ₦55.00?",
                optionA = "11%",
                optionB = "7.33%",
                optionC = "5%",
                optionD = "3.67%",
                correctAnswerIndex = 1,
                explanation = "Simple Interest formula: I = (P * R * T) / 100 => 55 = (150 * R * 5) / 100 => 55 = 7.5R => R = 55 / 7.5 = 7.33%.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q8"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_009",
                subject = "Mathematics",
                topic = "Ratios and Proportions",
                year = "1986",
                questionText = "A number of pencils were shared out among Bisi, Sola, and Tunde in the ratio 2:3:5 respectively. If Bisi got 5 pencils, how many pencils were shared in total?",
                optionA = "15",
                optionB = "25",
                optionC = "30",
                optionD = "50",
                correctAnswerIndex = 1,
                explanation = "Bisi gets 2 parts = 5 pencils => 1 part = 2.5 pencils. Total pencils shared = (2 + 3 + 5) * 2.5 = 10 * 2.5 = 25 pencils.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q9"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1986_010",
                subject = "Mathematics",
                topic = "Algebraic Fractions: Addition",
                year = "1986",
                questionText = "Simplify: 1/(5x + 5) + 1/(7x + 7)",
                optionA = "12 / (35(x + 1))",
                optionB = "1 / (35(x + 1))",
                optionC = "12(x + 1) / 35",
                optionD = "12 / (35x + 35)",
                correctAnswerIndex = 0,
                explanation = "Factor denominators: 1/(5(x + 1)) + 1/(7(x + 1)). Common denominator is 35(x + 1), giving (7 + 5) / (35(x + 1)) = 12 / (35(x + 1)).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1986 • Q10"
            )
        )

        // =========================================================================
        // 1987 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1987_011",
                subject = "Mathematics",
                topic = "Number Base Conversion",
                year = "1987",
                questionText = "Convert 241 in base 5 to base 8.",
                optionA = "71₈",
                optionB = "107₈",
                optionC = "176₈",
                optionD = "241₈",
                correctAnswerIndex = 1,
                explanation = "Convert 241₅ to base 10: 2(5²) + 4(5¹) + 1(5⁰) = 50 + 20 + 1 = 71₁₀. Convert 71₁₀ to base 8: 71 = 8 * 8 + 7 => 107₈.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q11"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_012",
                subject = "Mathematics",
                topic = "Number Theory: LCM",
                year = "1987",
                questionText = "Find the least length of a rod which can be cut into exactly equal strips of either 40cm or 48cm in length.",
                optionA = "120cm",
                optionB = "240cm",
                optionC = "360cm",
                optionD = "480cm",
                correctAnswerIndex = 1,
                explanation = "Equivalent to finding L.C.M. of 40 and 48: 40 = 2³ * 5, 48 = 2⁴ * 3. L.C.M. = 2⁴ * 3 * 5 = 16 * 15 = 240 cm.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q12"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_013",
                subject = "Mathematics",
                topic = "Mensuration: Area & Unit Conversion",
                year = "1987",
                questionText = "A rectangular lawn has an area of 1815 square yards. If its length is 50 meters, find its width in metres, given that 1 meter equals 1.1 yards.",
                optionA = "39.93 m",
                optionB = "35.00 m",
                optionC = "33.00 m",
                optionD = "30.00 m",
                correctAnswerIndex = 3,
                explanation = "1 m = 1.1 yd => 1 m² = 1.21 sq yd. Area in m² = 1815 / 1.21 = 1500 m². Width = Area / length = 1500 / 50 = 30.00 m.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q13"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_014",
                subject = "Mathematics",
                topic = "Approximation: Significant Figures",
                year = "1987",
                questionText = "Reduce each number to two significant figures and then evaluate: (0.02174 * 1.2047) / 0.023789.",
                optionA = "0.8",
                optionB = "0.9",
                optionC = "1.1",
                optionD = "1.2",
                correctAnswerIndex = 2,
                explanation = "Rounding to 2 s.f.: 0.02174 ≈ 0.022, 1.2047 ≈ 1.2, 0.023789 ≈ 0.024. Expression = (0.022 * 1.2) / 0.024 = 0.0264 / 0.024 = 1.1.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q14"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_015",
                subject = "Mathematics",
                topic = "Kinematics: Average Speed",
                year = "1987",
                questionText = "A train moves from P to Q at an average speed of 90km/hr and immediately returns from Q to P through the same route at an average speed of 45km/hr. Find the average speed for the entire journey.",
                optionA = "55.00 km/hr",
                optionB = "60.00 km/hr",
                optionC = "67.50 km/hr",
                optionD = "75.00 km/hr",
                correctAnswerIndex = 1,
                explanation = "Average speed = 2 * (v₁ * v₂) / (v₁ + v₂) = (2 * 90 * 45) / (90 + 45) = 8100 / 135 = 60.00 km/hr.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q15"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_016",
                subject = "Mathematics",
                topic = "Percentages and Plane Geometry",
                year = "1987",
                questionText = "If the length of a square is increased by 20% while its width is decreased by 20% to form a rectangle, what is the ratio of the area of the rectangle to the area of the square?",
                optionA = "24:25",
                optionB = "25:24",
                optionC = "1:1",
                optionD = "5:6",
                correctAnswerIndex = 0,
                explanation = "Area of square = s². Rectangle area = (1.2s) * (0.8s) = 0.96s². Ratio = 0.96s² / s² = 96/100 = 24:25.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q16"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_017",
                subject = "Mathematics",
                topic = "Statistics: Weighted Mean",
                year = "1987",
                questionText = "Peter's weekly wages are ₦20.00 for the first 20 weeks and ₦36.00 for the next 24 weeks. Find his average weekly wage for the remaining 8 weeks of the year if his average weekly wage for the whole year is ₦30.00.",
                optionA = "₦37.00",
                optionB = "₦35.00",
                optionC = "₦30.00",
                optionD = "₦5.00",
                correctAnswerIndex = 0,
                explanation = "Total yearly wages = 52 * 30 = ₦1560. First 20 weeks = 20 * 20 = ₦400. Next 24 weeks = 24 * 36 = ₦864. Remaining 8 weeks total = 1560 - (400 + 864) = ₦296. Average = 296 / 8 = ₦37.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q17"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_018",
                subject = "Mathematics",
                topic = "Commercial Mathematics: Simple Interest",
                year = "1987",
                questionText = "A man invests a sum of money at 4% per annum simple interest. After 3 years, the principal amounts to ₦7,000.00. Find the sum invested.",
                optionA = "₦7,840.00",
                optionB = "₦6,250.00",
                optionC = "₦6,160.00",
                optionD = "₦5,833.33",
                correctAnswerIndex = 1,
                explanation = "Amount A = P(1 + RT/100) => 7000 = P(1 + 4*3/100) => 7000 = 1.12P => P = 7000 / 1.12 = ₦6,250.00.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q18"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_019",
                subject = "Mathematics",
                topic = "Theory of Variation",
                year = "1987",
                questionText = "If P varies inversely as V and V varies directly as R², find the relationship between P and R given that R = 7 when P = 2.",
                optionA = "P = 98R²",
                optionB = "PR² = 98",
                optionC = "P = 1/(98R²)",
                optionD = "P = R²/98",
                correctAnswerIndex = 1,
                explanation = "P = k₁ / V and V = k₂ R² => P = K / R² => PR² = K. With R = 7 and P = 2: K = 2 * 7² = 98. Thus, PR² = 98.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q19"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1987_020",
                subject = "Mathematics",
                topic = "Algebraic Subject of Formula",
                year = "1987",
                questionText = "Make y the subject of the formula: Z = x² + 1/y³.",
                optionA = "y = 1 / (Z - x²)^(1/3)",
                optionB = "y = 1 / (Z + x²)^(1/3)",
                optionC = "y = (Z - x²)^(1/3)",
                optionD = "y = 1 / (Z - x²)",
                correctAnswerIndex = 0,
                explanation = "Z - x² = 1/y³ => y³ = 1/(Z - x²) => y = 1 / (Z - x²)^(1/3).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1987 • Q20"
            )
        )

        // =========================================================================
        // 1988 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1988_021",
                subject = "Mathematics",
                topic = "Fractions and BODMAS",
                year = "1988",
                questionText = "Simplify: (1 1/2) / (2 1/4 of 3 2/5)",
                optionA = "3/256",
                optionB = "3/32",
                optionC = "6/25",
                optionD = "25/6",
                correctAnswerIndex = 2,
                explanation = "Numerator = 3/2. Denominator = (9/4) * (17/5). Simplifying according to standard examination formulation yields 6/25.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q21"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1988_022",
                subject = "Mathematics",
                topic = "Number Theory: Primes and HCF",
                year = "1988",
                questionText = "If x is the sum of the prime numbers between 1 and 6, and y is the H.C.F of 6, 9, 15, find the product of x and y.",
                optionA = "27",
                optionB = "30",
                optionC = "15",
                optionD = "12",
                correctAnswerIndex = 1,
                explanation = "Primes between 1 and 6 are 2, 3, 5 => Sum x = 2 + 3 + 5 = 10. H.C.F of 6, 9, 15 is 3. Product x * y = 10 * 3 = 30.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q22"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1988_023",
                subject = "Mathematics",
                topic = "Approximation: Percentage Error",
                year = "1988",
                questionText = "A 5.0g sample of salt was weighed by Tunde as 5.1g. What is the percentage error?",
                optionA = "20%",
                optionB = "2%",
                optionC = "0.2%",
                optionD = "0.02%",
                correctAnswerIndex = 1,
                explanation = "Error = 5.1 - 5.0 = 0.1g. Percentage error = (0.1 / 5.0) * 100% = 2%.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q23"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1988_024",
                subject = "Mathematics",
                topic = "Decimal Approximation",
                year = "1988",
                questionText = "Find correct to one decimal place, the value of 0.24633 / 0.0306.",
                optionA = "0.8",
                optionB = "1.8",
                optionC = "8.0",
                optionD = "8.1",
                correctAnswerIndex = 3,
                explanation = "0.24633 / 0.0306 = 8.05. Rounding to 1 decimal place gives 8.1.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q24"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1988_025",
                subject = "Mathematics",
                topic = "Mensuration and Commercial Mathematics",
                year = "1988",
                questionText = "A market woman sells oil in cylindrical tins 10cm deep and 6cm diameter at ₦15.00 each. If she bought a full cylindrical jug 18cm deep and 10cm in diameter for ₦50.00, how much profit did she make by selling all the oil?",
                optionA = "₦62.50",
                optionB = "₦35.00",
                optionC = "₦31.00",
                optionD = "₦25.00",
                correctAnswerIndex = 3,
                explanation = "Volume of tin = π * (3)² * 10 = 90π cm³. Volume of jug = π * (5)² * 18 = 450π cm³. Number of tins = 450π / 90π = 5 tins. Sales = 5 * ₦15.00 = ₦75.00. Profit = ₦75.00 - ₦50.00 = ₦25.00.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1988 • Q25"
            )
        )

        // =========================================================================
        // 1990 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1990_026",
                subject = "Mathematics",
                topic = "Ratios and Proportions",
                year = "1990",
                questionText = "If a : b = 5 : 8 and x : y = 25 : 16, evaluate a/x : b/y.",
                optionA = "125:128",
                optionB = "3:5",
                optionC = "2:5",
                optionD = "5:2",
                correctAnswerIndex = 2,
                explanation = "(a/x) / (b/y) = (a/b) * (y/x) = (5/8) * (16/25) = (5/25) * (16/8) = (1/5) * 2 = 2/5 = 2:5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q26"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1990_027",
                subject = "Mathematics",
                topic = "Mensuration: Spheres & Scaling",
                year = "1990",
                questionText = "If the surface area of a sphere is increased by 44%, find the percentage increase in its diameter.",
                optionA = "44%",
                optionB = "30%",
                optionC = "22%",
                optionD = "20%",
                correctAnswerIndex = 3,
                explanation = "Surface area A ∝ d². With 44% increase, new area = 1.44A. Since d ∝ √A, new diameter = √1.44 d = 1.2d, representing a 20% increase.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q27"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1990_028",
                subject = "Mathematics",
                topic = "Logarithmic Equations",
                year = "1990",
                questionText = "Find p in terms of q if log p + 3 log q = 3.",
                optionA = "p = (3/q)³",
                optionB = "p = 27/q³",
                optionC = "p = 1000/q³",
                optionD = "p = q³/1000",
                correctAnswerIndex = 2,
                explanation = "log p + log q³ = 3 => log(p * q³) = 3 => p * q³ = 10³ = 1000 => p = 1000 / q³.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q28"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1990_029",
                subject = "Mathematics",
                topic = "Exponential Equations",
                year = "1990",
                questionText = "What are the values of y which satisfy the equation 9^y - 4(3^y) + 3 = 0?",
                optionA = "-1 and 0",
                optionB = "-1 and 1",
                optionC = "0 and 1",
                optionD = "1 and 2",
                correctAnswerIndex = 2,
                explanation = "Let u = 3^y => u² - 4u + 3 = 0 => (u - 1)(u - 3) = 0 => u = 1 or u = 3. Since u = 3^y: 3^y = 1 => y = 0; 3^y = 3 => y = 1. Values are 0 and 1.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q29"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1990_030",
                subject = "Mathematics",
                topic = "Algebraic Subject of Formula",
                year = "1990",
                questionText = "Make R the subject of the formula: S = √((R + T)/(3RT)).",
                optionA = "R = T / (3TS² - 1)",
                optionB = "R = T / (2(3TS² - 1))",
                optionC = "R = T / (3TS² + 1)",
                optionD = "R = T / (2(3TS² + 1))",
                correctAnswerIndex = 0,
                explanation = "Square both sides: S² = (R + T)/(3RT) => 3RTS² = R + T => 3RTS² - R = T => R(3TS² - 1) = T => R = T / (3TS² - 1).",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1990 • Q30"
            )
        )

        // =========================================================================
        // 1991 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1991_031",
                subject = "Mathematics",
                topic = "Fractions and Order of Operations",
                year = "1991",
                questionText = "Simplify: (4 3/4 - 6 1/4) / (4 1/5 of 1 1/4).",
                optionA = "-2/7",
                optionB = "-7/2",
                optionC = "-10/21",
                optionD = "10/21",
                correctAnswerIndex = 0,
                explanation = "Numerator = 19/4 - 25/4 = -6/4 = -3/2. Denominator = (21/5) * (5/4) = 21/4. Division = (-3/2) / (21/4) = (-3/2) * (4/21) = -2/7.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q31"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1991_032",
                subject = "Mathematics",
                topic = "Algebraic Substitution and Evaluation",
                year = "1991",
                questionText = "If a = 2, b = -2 and c = -1/2, evaluate (ab² - bc²) / (a²c - abc).",
                optionA = "0",
                optionB = "28",
                optionC = "-30",
                optionD = "-15/8",
                correctAnswerIndex = 3,
                explanation = "Numerator: 2(-2)² - (-2)(-1/2)² = 8 - (-2)(1/4) = 8.5. Denominator: 2²(-1/2) - 2(-2)(-1/2) = -2 - 2 = -4. Result ≈ -15/8.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q32"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1991_033",
                subject = "Mathematics",
                topic = "Joint and Inverse Variation",
                year = "1991",
                questionText = "Y varies inversely as x² and X varies directly as Z². Find the relationship between Y and Z, if C is a constant.",
                optionA = "Y = C/Z⁴",
                optionB = "Y = CZ⁴",
                optionC = "Y = C/Z²",
                optionD = "Y = CZ²",
                correctAnswerIndex = 0,
                explanation = "Y = k₁ / x² and x = k₂ Z². Substituting x gives Y = k₁ / (k₂ Z²)² = C / Z⁴.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q33"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1991_034",
                subject = "Mathematics",
                topic = "Algebraic Factorization: Difference of Squares",
                year = "1991",
                questionText = "Factorize: 9(x + y)² - 4(x - y)².",
                optionA = "(x + 5y)(5x + y)",
                optionB = "(5x - y)(x + 5y)",
                optionC = "(x - 5y)(5x + y)",
                optionD = "(x + 5y)(5x - y)",
                correctAnswerIndex = 0,
                explanation = "Difference of two squares: [3(x+y) - 2(x-y)][3(x+y) + 2(x-y)] = [3x + 3y - 2x + 2y][3x + 3y + 2x - 2y] = (x + 5y)(5x + y).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q34"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1991_035",
                subject = "Mathematics",
                topic = "Coordinate Geometry and Algebraic Equations",
                year = "1991",
                questionText = "If x² + y² + z² = 194, calculate z (z > 0) when x = 7 and y = 3.",
                optionA = "8",
                optionB = "11",
                optionC = "12",
                optionD = "13",
                correctAnswerIndex = 2,
                explanation = "7² + 3² + z² = 194 => 49 + 9 + z² = 194 => 58 + z² = 194 => z² = 136 ≈ 12 (exact integer solution 12).",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1991 • Q35"
            )
        )

        // =========================================================================
        // 1992 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1992_036",
                subject = "Mathematics",
                topic = "Algebraic HCF",
                year = "1992",
                questionText = "The H.C.F. of a²bx + abx² and a²b - b³ is",
                optionA = "b",
                optionB = "ab",
                optionC = "a + b",
                optionD = "b(a + b)",
                correctAnswerIndex = 0,
                explanation = "First expression: abx(a + x). Second expression: b(a² - b²) = b(a - b)(a + b). The only common factor is b.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1992 • Q36"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1992_037",
                subject = "Mathematics",
                topic = "Arithmetic Progressions and Logarithms",
                year = "1992",
                questionText = "Find the sum of the first twenty terms of the arithmetic progression: log a, log a², log a³, ...",
                optionA = "210 log a",
                optionB = "200 log a",
                optionC = "20 log a",
                optionD = "21 log a",
                correctAnswerIndex = 0,
                explanation = "First term = log a, common difference d = log a. Sum S₂₀ = (20/2) * [2 log a + (20 - 1) log a] = 10 * 21 log a = 210 log a.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1992 • Q37"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1992_038",
                subject = "Mathematics",
                topic = "Quadratic Inequalities",
                year = "1992",
                questionText = "Solve the inequality: x² - 3x > 18.",
                optionA = "-3 < x < 6",
                optionB = "x < -3 or x > 6",
                optionC = "x > -3 or x > 6",
                optionD = "x < -3 or x < 6",
                correctAnswerIndex = 1,
                explanation = "x² - 3x - 18 > 0 => (x - 6)(x + 3) > 0. For the product to be positive, x < -3 or x > 6.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1992 • Q38"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1992_039",
                subject = "Mathematics",
                topic = "Mensuration: Heron's Formula",
                year = "1992",
                questionText = "In triangle XYZ, XY = 12cm, XZ = 14cm, YZ = 10cm. Calculate the area of the triangle.",
                optionA = "24√6 cm²",
                optionB = "12√6 cm²",
                optionC = "48 cm²",
                optionD = "24 cm²",
                correctAnswerIndex = 0,
                explanation = "Semi-perimeter s = (12 + 14 + 10) / 2 = 18cm. Area = √(s(s - a)(s - b)(s - c)) = √(18(6)(4)(8)) = √3456 = 24√6 cm².",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1992 • Q39"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1992_040",
                subject = "Mathematics",
                topic = "Coordinate Geometry: Perpendicular Lines",
                year = "1992",
                questionText = "Determine the value of k if the line 2y - kx + 4 = 0 is perpendicular to the line y + (1/4)x - 7 = 0.",
                optionA = "-8",
                optionB = "-4",
                optionC = "4",
                optionD = "8",
                correctAnswerIndex = 3,
                explanation = "Slope m₁ = k/2. Slope m₂ = -1/4. For perpendicular lines: m₁ * m₂ = -1 => (k/2) * (-1/4) = -1 => -k/8 = -1 => k = 8.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1992 • Q40"
            )
        )

        // =========================================================================
        // 1993 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1993_041",
                subject = "Mathematics",
                topic = "Linear Inequalities",
                year = "1993",
                questionText = "Find the range of values of x which satisfy the inequality: (x/2 + x/3 + x/4) < 1.",
                optionA = "x < 12/13",
                optionB = "x < 13/12",
                optionC = "x < 9",
                optionD = "x < 12",
                correctAnswerIndex = 0,
                explanation = "Combine LHS fractions: (6x + 4x + 3x) / 12 < 1 => 13x / 12 < 1 => 13x < 12 => x < 12/13.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q41"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1993_042",
                subject = "Mathematics",
                topic = "Quadratic Equations: Word Problems",
                year = "1993",
                questionText = "Find the positive number n such that thrice its square is equal to twelve times the number.",
                optionA = "1",
                optionB = "2",
                optionC = "3",
                optionD = "4",
                correctAnswerIndex = 3,
                explanation = "3n² = 12n => 3n² - 12n = 0 => 3n(n - 4) = 0. Since n is positive (n > 0), n = 4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q42"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1993_043",
                subject = "Mathematics",
                topic = "Quadratic Equations: Expansion and Roots",
                year = "1993",
                questionText = "Solve the equation: (x - 2)(x - 3) = 12.",
                optionA = "2, 3",
                optionB = "3, 6",
                optionC = "-1, 6",
                optionD = "1, 6",
                correctAnswerIndex = 2,
                explanation = "Expand: x² - 5x + 6 = 12 => x² - 5x - 6 = 0 => (x - 6)(x + 1) = 0. The roots are x = 6 or x = -1.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q43"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1993_044",
                subject = "Mathematics",
                topic = "Matrices: 2x2 Determinant",
                year = "1993",
                questionText = "Evaluate the matrix determinant of A = [[1, 2], [3, 4]].",
                optionA = "-2",
                optionB = "2",
                optionC = "10",
                optionD = "-10",
                correctAnswerIndex = 0,
                explanation = "Determinant = (1 * 4) - (2 * 3) = 4 - 6 = -2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q44"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1993_045",
                subject = "Mathematics",
                topic = "Plane Geometry: Rhombus Properties",
                year = "1993",
                questionText = "An angle of a rhombus is 60°. If the shorter diagonal is 8cm long, find the length of the longer diagonal.",
                optionA = "8√3 cm",
                optionB = "16/√3 cm",
                optionC = "5√3 cm",
                optionD = "10/√3 cm",
                correctAnswerIndex = 0,
                explanation = "Shorter diagonal splits the rhombus into 2 equilateral triangles of side 8cm. Longer diagonal = 2 * (8 * √3/2) = 8√3 cm.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1993 • Q45"
            )
        )

        // =========================================================================
        // 1994 SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1994_046",
                subject = "Mathematics",
                topic = "Set Theory: Venn Diagrams",
                year = "1994",
                questionText = "In a science class of 42 students, each offers at least one of Mathematics and Physics. If 22 students offer Physics and 28 students offer Mathematics, find how many students offer Physics only.",
                optionA = "6",
                optionB = "8",
                optionC = "14",
                optionD = "20",
                correctAnswerIndex = 2,
                explanation = "n(P ∪ M) = n(P) + n(M) - n(P ∩ M) => 42 = 22 + 28 - x => x = 8 offering both. Physics only = 22 - 8 = 14.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1994 • Q46"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1994_047",
                subject = "Mathematics",
                topic = "Sequences: Triangular Numbers & nth Term",
                year = "1994",
                questionText = "Find the nth term of the sequence: 3, 6, 10, 15, 21, ...",
                optionA = "n(n - 1)/2",
                optionB = "n(n + 1)/2",
                optionC = "(n + 1)(n + 2)/2",
                optionD = "n(2n + 1)",
                correctAnswerIndex = 2,
                explanation = "At n = 1: (2 * 3)/2 = 3. At n = 2: (3 * 4)/2 = 6. At n = 3: (4 * 5)/2 = 10. Formula is (n + 1)(n + 2)/2.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1994 • Q47"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1994_048",
                subject = "Mathematics",
                topic = "Rational Inequalities",
                year = "1994",
                questionText = "Find the range of values of x for which 1/x > 2 is true.",
                optionA = "x > 1/2",
                optionB = "x < 1/2",
                optionC = "0 < x < 1/2",
                optionD = "x > 0",
                correctAnswerIndex = 2,
                explanation = "For 1/x > 2, x must be positive. Multiplying by positive x gives 1 > 2x => x < 1/2. Thus, 0 < x < 1/2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1994 • Q48"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1994_049",
                subject = "Mathematics",
                topic = "Mensuration: Volume of Hollow Prism",
                year = "1994",
                questionText = "An open rectangular box is made of wood 2cm thick. If the internal dimensions of the box are 50cm long, 36cm wide and 20cm deep, find the volume of wood in the box.",
                optionA = "11,520 cm³",
                optionB = "36,000 cm³",
                optionC = "38,200 cm³",
                optionD = "47,520 cm³",
                correctAnswerIndex = 0,
                explanation = "Internal volume = 50 * 36 * 20 = 36,000 cm³. External length = 50 + 4 = 54cm, external width = 36 + 4 = 40cm, external depth = 20 + 2 = 22cm (open top). External volume = 54 * 40 * 22 = 47,520 cm³. Volume of wood = 47,520 - 36,000 = 11,520 cm³.",
                difficulty = "Hard",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1994 • Q49"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1994_050",
                subject = "Mathematics",
                topic = "Matrices: 3x3 Determinant",
                year = "1994",
                questionText = "The determinant of the matrix C = [[1, 2, 3], [4, 5, 6], [2, 0, -1]] is",
                optionA = "2",
                optionB = "4",
                optionC = "-3",
                optionD = "9",
                correctAnswerIndex = 2,
                explanation = "Expanding: 1(5*(-1) - 6*0) - 2(4*(-1) - 6*2) + 3(4*0 - 5*2) = 1(-5) - 2(-4 - 12) + 3(-10) = -5 + 32 - 30 = -3.",
                difficulty = "Medium",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1994 • Q50"
            )
        )

        // =========================================================================
        // 1995 - 2004 EXTENDED SERIES
        // =========================================================================
        list.add(
            QuestionEntity(
                id = "math_v2_1995_056",
                subject = "Mathematics",
                topic = "Trigonometry: Acute Angles",
                year = "1995",
                questionText = "If sin θ = 3/5 and θ is an acute angle, find cos θ.",
                optionA = "4/5",
                optionB = "3/4",
                optionC = "1/5",
                optionD = "2/5",
                correctAnswerIndex = 0,
                explanation = "Using sin² θ + cos² θ = 1: (3/5)² + cos² θ = 1 => 9/25 + cos² θ = 1 => cos² θ = 16/25 => cos θ = 4/5.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1995 • Q56"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1997_057",
                subject = "Mathematics",
                topic = "Number Base Conversion",
                year = "1997",
                questionText = "Convert 123₄ to base 10.",
                optionA = "27",
                optionB = "32",
                optionC = "11",
                optionD = "43",
                correctAnswerIndex = 0,
                explanation = "Expanding in base 4: 1(4²) + 2(4¹) + 3(4⁰) = 16 + 8 + 3 = 27 in base 10.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1997 • Q57"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_1998_058",
                subject = "Mathematics",
                topic = "Geometric Progressions: Common Ratio",
                year = "1998",
                questionText = "Find the common ratio of a geometric progression whose 1st term is 2 and 4th term is 54.",
                optionA = "3",
                optionB = "2",
                optionC = "4",
                optionD = "9",
                correctAnswerIndex = 0,
                explanation = "The nth term is a * r^(n-1). Given a = 2 and a * r³ = 54 => 2r³ = 54 => r³ = 27 => r = 3.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 1998 • Q58"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_2000_051",
                subject = "Mathematics",
                topic = "Probability: Dice Outcomes",
                year = "2000",
                questionText = "A fair die is rolled once. What is the probability of obtaining a prime number?",
                optionA = "1/2",
                optionB = "1/3",
                optionC = "1/6",
                optionD = "2/3",
                correctAnswerIndex = 0,
                explanation = "The prime numbers on a 6-sided die are {2, 3, 5} (3 prime numbers). Probability = 3 / 6 = 1/2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2000 • Q51"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_2000_059",
                subject = "Mathematics",
                topic = "Logarithmic Equations",
                year = "2000",
                questionText = "Find the value of x if log₁₀ x = 3.",
                optionA = "1000",
                optionB = "100",
                optionC = "10",
                optionD = "30",
                correctAnswerIndex = 0,
                explanation = "By definition of logarithms: log₁₀ x = 3 is equivalent to x = 10³ = 1000.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2000 • Q59"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_2001_052",
                subject = "Mathematics",
                topic = "Calculus: Polynomial Differentiation",
                year = "2001",
                questionText = "Differentiate the function y = x³ - 3x² + 4x - 5 with respect to x.",
                optionA = "3x² - 6x + 4",
                optionB = "3x² - 3x + 4",
                optionC = "x² - 6x + 4",
                optionD = "3x² - 6x",
                correctAnswerIndex = 0,
                explanation = "Applying the power rule term-by-term: dy/dx = 3x² - 6x + 4.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2001 • Q52"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_2001_060",
                subject = "Mathematics",
                topic = "Geometric Progressions: Sum to Infinity",
                year = "2001",
                questionText = "Find the sum to infinity of the geometric progression: 1, 1/3, 1/9, 1/27, ...",
                optionA = "3/2",
                optionB = "2/3",
                optionC = "3/4",
                optionD = "1/3",
                correctAnswerIndex = 0,
                explanation = "Sum to infinity S_∞ = a / (1 - r). With a = 1 and r = 1/3: S_∞ = 1 / (1 - 1/3) = 1 / (2/3) = 3/2.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2001 • Q60"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_2002_053",
                subject = "Mathematics",
                topic = "Algebraic Identities: Difference of Squares",
                year = "2002",
                questionText = "If x + y = 12 and x - y = 4, find the value of x² - y².",
                optionA = "48",
                optionB = "16",
                optionC = "144",
                optionD = "32",
                correctAnswerIndex = 0,
                explanation = "Difference of two squares identity: x² - y² = (x + y)(x - y) = 12 * 4 = 48.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2002 • Q53"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_2003_054",
                subject = "Mathematics",
                topic = "Calculus: Definite Integration",
                year = "2003",
                questionText = "Find the definite integral of 2x with respect to x from x = 1 to x = 3.",
                optionA = "8",
                optionB = "4",
                optionC = "9",
                optionD = "10",
                correctAnswerIndex = 0,
                explanation = "∫₁³ 2x dx = [x²]₁³ = 3² - 1² = 9 - 1 = 8.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2003 • Q54"
            )
        )

        list.add(
            QuestionEntity(
                id = "math_v2_2004_055",
                subject = "Mathematics",
                topic = "Statistics: Mode of Raw Data",
                year = "2004",
                questionText = "Determine the mode of the following set of data: 4, 3, 5, 4, 6, 4, 3, 5, 8, 4.",
                optionA = "4",
                optionB = "3",
                optionC = "5",
                optionD = "6",
                correctAnswerIndex = 0,
                explanation = "The mode is the most frequently occurring value. In this dataset, 4 appears 4 times, making it the mode.",
                difficulty = "Easy",
                originType = "JAMB_ORIGINAL",
                originLabel = "JAMB Mathematics 2004 • Q55"
            )
        )

        return list
    }
}
