package com.example.data.repository

import com.example.data.db.QuestionEntity

/**
 * Cleaned and verified Mathematics examination questions from historical UTME papers.
 * Formatted with step-by-step mathematical reasoning and verified options.
 */
object JambMathematicsPastExamMegaBank {

    fun getQuestions(): List<QuestionEntity> {
        val list = mutableListOf<QuestionEntity>()

        fun addQ(
            id: String,
            year: String,
            topic: String,
            text: String,
            optA: String,
            optB: String,
            optC: String,
            optD: String,
            correct: Int,
            explanation: String,
            qNum: Int
        ) {
            list.add(
                QuestionEntity(
                    id = id,
                    subject = "Mathematics",
                    topic = topic,
                    year = year,
                    questionText = text,
                    optionA = optA,
                    optionB = optB,
                    optionC = optC,
                    optionD = optD,
                    correctAnswerIndex = correct,
                    explanation = explanation,
                    difficulty = "Medium",
                    originType = "JAMB_ORIGINAL",
                    originLabel = "JAMB Mathematics $year • Q$qNum"
                )
            )
        }

        // Q1: Polygon Interior Angles
        addQ(
            "math_past_01", "1983", "Geometry (Polygons)",
            "Given a regular hexagon, calculate the size of each interior angle.",
            "60°", "30°", "120°", "135°",
            2,
            "Each interior angle of a regular n-sided polygon is given by (n - 2) × 180° / n. For a hexagon (n = 6): (6 - 2) × 180° / 6 = 4 × 30° = 120°.",
            1
        )

        // Q5: Statistics (Median)
        addQ(
            "math_past_05", "1984", "Statistics (Measures of Central Tendency)",
            "The scores of a set of final year students in an examination are: 41, 29, 55, 21, 47, 70, 70, 40, 43, 56, 73, 23, 50, 50. Find the median of the scores.",
            "47", "48.5", "50", "49",
            1,
            "Arranging the 14 scores in ascending order: 21, 23, 29, 40, 41, 43, 47, 50, 50, 55, 56, 70, 70, 73. The median is the average of the 7th (47) and 8th (50) values: (47 + 50) / 2 = 48.5.",
            5
        )

        // Q8: Probability
        addQ(
            "math_past_08", "1985", "Probability",
            "The letters of the word MATRICULATION are cut and put into a box. If one letter is drawn at random, find the probability of drawing a vowel.",
            "2/13", "5/13", "6/13", "8/13",
            2,
            "The word MATRICULATION contains 13 letters. The vowels are A, I, U, A, I, O (total of 6 vowels). Probability = Number of vowels / Total letters = 6/13.",
            8
        )

        // Q9: Number Bases & Significant Figures
        addQ(
            "math_past_09", "1985", "Approximations & Significant Figures",
            "Correct each of the numbers 59.81789 and 0.0746829 to three significant figures and multiply them, giving your answer to three significant figures.",
            "4.46", "4.48", "4.47", "4.50",
            2,
            "59.81789 rounded to 3 s.f. is 59.8. 0.0746829 rounded to 3 s.f. is 0.0747. Multiplying: 59.8 × 0.0747 = 4.46706, which to 3 s.f. is 4.47.",
            9
        )

        // Q10: Variation
        addQ(
            "math_past_10", "1986", "Variation",
            "If w varies inversely as V, and u varies directly as w³, find the relationship between u and V given that u = 1 when V = 2.",
            "u = 8V³", "u = 2V", "V = 8/u²", "u = 8/V³",
            3,
            "w ∝ 1/V ⇒ w = a/V. u ∝ w³ ⇒ u = k(a/V)³ = K/V³. Since u = 1 when V = 2: 1 = K / 2³ ⇒ K = 8. Thus, u = 8/V³.",
            10
        )

        // Q11: Indices
        addQ(
            "math_past_11", "1986", "Indices & Logarithms",
            "If (2/3)^m × (3/4)^n = 256/729, find the values of m and n.",
            "m = 4, n = 2", "m = -4, n = -2", "m = -4, n = 2", "m = 4, n = -2",
            3,
            "(2/3)^m × (3/4)^n = (2^m / 3^m) × (3^n / 2^{2n}) = 2^{m-2n} × 3^{n-m}. 256/729 = 2^8 / 3^6 = 2^8 × 3^{-6}. Equating powers: m - 2n = 8 and n - m = -6. Solving simultaneously gives n = -2 and m = 4.",
            11
        )

        // Q12: Factorization
        addQ(
            "math_past_12", "1986", "Algebraic Expressions",
            "Factorize completely 81a⁴ - 16b⁴.",
            "(3a + 2b)(3a - 2b)(9a² + 4b²)", "(3a - 2b)(2a - 3b)(4a² - 9b²)", "(3a - 2b)²(9a² + 4b²)", "(9a² - 4b²)²",
            0,
            "Using difference of two squares: 81a⁴ - 16b⁴ = (9a²)² - (4b²)² = (9a² - 4b²)(9a² + 4b²) = (3a - 2b)(3a + 2b)(9a² + 4b²).",
            12
        )

        // Q13: Polygons
        addQ(
            "math_past_13", "1987", "Geometry (Polygons)",
            "One interior angle of a convex hexagon is 170° and each of the remaining five interior angles is equal to x°. Find x.",
            "120°", "110°", "105°", "100°",
            1,
            "Sum of interior angles of a hexagon = (6 - 2) × 180° = 720°. Therefore: 170° + 5x = 720° ⇒ 5x = 550° ⇒ x = 110°.",
            13
        )

        // Q16: Area calculation
        addQ(
            "math_past_16", "1987", "Mensuration (Plane Shapes)",
            "On a square paper of length 2.524375 cm is inscribed a square diagram of length 0.524375 cm. Find the area of the paper not covered by the diagram correct to 3 significant figures.",
            "6.00 cm²", "6.10 cm²", "6.09 cm²", "4.00 cm²",
            1,
            "Area not covered = (2.524375)² - (0.524375)² = (2.524375 - 0.524375)(2.524375 + 0.524375) = 2 × 3.04875 = 6.0975 cm² ≈ 6.10 cm² (to 3 s.f.).",
            16
        )

        // Q19: Trigonometry
        addQ(
            "math_past_19", "1987", "Trigonometry",
            "In triangle PQR, QR = 3 cm, PR = 3 cm, and PQ = 3 cm. Find angles P and R.",
            "P = 60°, R = 90°", "P = 30°, R = 120°", "P = 90°, R = 60°", "P = 60°, R = 60°",
            3,
            "Since all three sides of triangle PQR are equal (3 cm each), the triangle is equilateral. Thus, all its interior angles are equal to 60°, so P = 60° and R = 60°.",
            19
        )

        // Q21: Mean
        addQ(
            "math_past_21", "1988", "Statistics",
            "Find the mean of the following numbers: 24.57, 25.63, 25.32, 26.01, 25.77.",
            "25.12", "25.30", "25.26", "25.46",
            3,
            "Mean = (24.57 + 25.63 + 25.32 + 26.01 + 25.77) / 5 = 127.30 / 5 = 25.46.",
            21
        )

        // Q23: Pie Chart angles
        addQ(
            "math_past_23", "1988", "Statistics (Pie Charts)",
            "The cost of production of an article is made up as follows: Labour ₦70, Power ₦15, Materials ₦30, Miscellaneous ₦5. Find the angle of the sector representing labour in a pie chart.",
            "210°", "105°", "175°", "120°",
            0,
            "Total cost = 70 + 15 + 30 + 5 = ₦120. Labour sector angle = (70 / 120) × 360° = (7 / 12) × 360° = 210°.",
            23
        )

        // Q25: Inequalities
        addQ(
            "math_past_25", "1988", "Linear Inequalities",
            "In a racing competition, Musa covered a distance of 5x km in the first hour and (x + 10) km in the next hour. He was second to Ngozi who covered a total distance of 118 km in the two hours. Which of the following inequalities is correct?",
            "0 < x < 15", "-3 < x < 3", "15 < x < 18", "0 < x < 18",
            3,
            "Musa's total distance = 5x + (x + 10) = 6x + 10. Since he covered less distance than Ngozi (118 km) and distances must be positive: 6x + 10 < 118 ⇒ 6x < 108 ⇒ x < 18. Since x > 0, the inequality is 0 < x < 18.",
            25
        )

        // Q26: Quadratic Equation / Work rate
        addQ(
            "math_past_26", "1989", "Quadratic Equations",
            "Tunde and Shola can do a piece of work in 18 days. Tunde can do it alone in x days, whilst Shola takes 15 days longer to do it alone. Which of the following equations is satisfied by x?",
            "x² - 5x - 18 = 0", "x² - 20x + 360 = 0", "x² - 21x - 270 = 0", "2x² + 42x - 190 = 0",
            2,
            "Rate equation: 1/x + 1/(x + 15) = 1/18. Multiply by 18x(x + 15): 18(x + 15) + 18x = x(x + 15) ⇒ 18x + 270 + 18x = x² + 15x ⇒ 36x + 270 = x² + 15x ⇒ x² - 21x - 270 = 0.",
            26
        )

        // Q28: Polynomial factors
        addQ(
            "math_past_28", "1989", "Polynomials (Factor Theorem)",
            "If (x - 2) and (x + 1) are factors of the expression x³ + px² + qx + 1, what is the sum of p and q?",
            "0", "-3", "3", "-2/3",
            1,
            "By Factor Theorem: at x = 2: 2³ + p(2)² + q(2) + 1 = 0 ⇒ 8 + 4p + 2q + 1 = 0 ⇒ 4p + 2q = -9 (Eq 1). At x = -1: (-1)³ + p(-1)² + q(-1) + 1 = 0 ⇒ -1 + p - q + 1 = 0 ⇒ p = q. Substitute p = q into Eq 1: 6p = -9 ⇒ p = -1.5, q = -1.5. Thus, p + q = -3.",
            28
        )

        // Q35: Integral values of inequalities
        addQ(
            "math_past_35", "1989", "Inequalities",
            "Find the integral values of x which satisfy the simultaneous inequalities: -3 < 2 - 5x < 12.",
            "-2, -1", "-2, 2", "-1, 0", "0, 1",
            2,
            "Subtract 2 from all parts: -5 < -5x < 10. Divide by -5 (reversing inequality signs): 1 > x > -2, which is -2 < x < 1. The integer values of x strictly between -2 and 1 are -1 and 0.",
            35
        )

        // Q39: Ordering fractions & decimals
        addQ(
            "math_past_39", "1990", "Fractions & Decimals",
            "Arrange the following numbers in ascending order of magnitude: 6/7, 13/15, 0.865.",
            "6/7 < 0.865 < 13/15", "6/7 < 13/15 < 0.865", "13/15 < 6/7 < 0.865", "0.865 < 6/7 < 13/15",
            0,
            "Converting each to decimal: 6/7 ≈ 0.8571, 0.865 = 0.8650, 13/15 ≈ 0.8667. In ascending order: 0.8571 < 0.8650 < 0.8667, which gives 6/7 < 0.865 < 13/15.",
            39
        )

        // Q40: Decimals
        addQ(
            "math_past_40", "1990", "Decimals & Fractions",
            "Find correct to two decimal places: 100 + 1/100 + 3/1000 + 27/10000.",
            "100.02", "1000.02", "100.22", "100.01",
            0,
            "100 + 0.01 + 0.003 + 0.0027 = 100.0157. Rounding to 2 decimal places gives 100.02.",
            40
        )

        // Q42: Logarithms
        addQ(
            "math_past_42", "1990", "Logarithms",
            "Find x if log₉ x = 1.5.",
            "72", "27", "36", "24.5",
            1,
            "By definition of logarithms: x = 9^(1.5) = 9^(3/2) = (√9)³ = 3³ = 27.",
            42
        )

        // Q45: Trigonometry (Cosine rule)
        addQ(
            "math_past_45", "1991", "Trigonometry (Cosine Rule)",
            "In triangle XYZ, XY = 13 cm, YZ = 9 cm, XZ = 11 cm, and angle XYZ = θ°. Find cos θ°.",
            "4/39", "43/39", "209/286", "43/78",
            3,
            "By Cosine Rule for angle Y (opposite to side XZ): cos Y = (XY² + YZ² - XZ²) / (2 · XY · YZ) = (13² + 9² - 11²) / (2 × 13 × 9) = (169 + 81 - 121) / 234 = 129 / 234 = 43 / 78.",
            45
        )

        // Q48: Simultaneous Equations
        addQ(
            "math_past_48", "1991", "Simultaneous Equations",
            "Solve for (x, y) in the simultaneous equations: 2x + y = 4 and x² + xy = -12.",
            "(6, -8) and (-2, 8)", "(3, -4) and (-1, 4)", "(8, -4) and (-1, 4)", "(-4, 3) and (4, -1)",
            0,
            "From 2x + y = 4 ⇒ y = 4 - 2x. Substitute into x² + xy = -12: x² + x(4 - 2x) = -12 ⇒ x² + 4x - 2x² = -12 ⇒ -x² + 4x + 12 = 0 ⇒ x² - 4x - 12 = 0 ⇒ (x - 6)(x + 2) = 0. When x = 6, y = 4 - 12 = -8. When x = -2, y = 4 - 2(-2) = 8. Solutions: (6, -8) and (-2, 8).",
            48
        )

        // Q49: Ratio & Volume of similar figures
        addQ(
            "math_past_49", "1991", "Mensuration (Similar Solids)",
            "The ratio of the length of two similar rectangular blocks is 2:3. If the volume of the larger block is 351 cm³, find the volume of the smaller block.",
            "234.00 cm³", "526.50 cm³", "166.00 cm³", "104.00 cm³",
            3,
            "Ratio of lengths = 2:3 ⇒ Ratio of volumes = 2³ : 3³ = 8 : 27. Let the smaller volume be V: V / 351 = 8 / 27 ⇒ V = (8 × 351) / 27 = 8 × 13 = 104 cm³.",
            49
        )

        return list
    }
}
